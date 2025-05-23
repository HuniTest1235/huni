package com.test.jpa.controller;

import java.util.List;
import com.test.jpa.domain.StudentDTO;
import com.test.jpa.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	@Autowired(required=true)
    private MemberService memberService;

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@GetMapping("/list")
    public String listMember(Model model) throws Exception {
    	List<StudentDTO> students = memberService.readMemberList();
    	
		logger.info(" /member/list URL called. then listMemebr method executed.");
        model.addAttribute("students", students);
        return "member/member_list";
    }
	  
    @GetMapping("/read")
    public String readMember(@RequestParam("id") String id, Model model) throws Exception {
    	StudentDTO student = memberService.readMember(id);
    	
		logger.info(" /read?id=kang URL called. then readMemebr method executed.");
        model.addAttribute("student", student);
        return "member/member_read";
    }
    
	@GetMapping("/register")
	public String createMemberGet() throws Exception {
		logger.info(" /register URL GET method called. then forward member_register.jsp.");
		return "member/member_register";
	}
	
    
    @PostMapping("/register")
	public String createMemberPost( @ModelAttribute("student") StudentDTO vo) throws Exception {
		memberService.addMember(vo);
		logger.info(vo.toString());
		logger.info(" /register URL POST method called. then createMember method executed.");
		return "redirect:/member/list";
	}
	
            
    @GetMapping("/modify")
    public String modifyMemberGet(@RequestParam("id") String id, Model model) throws Exception {
    	StudentDTO student = memberService.readMember(id);
    	
		logger.info(" /modify?id=kang URL GET method called. then forward member_modify.jsp.");
        model.addAttribute("student", student);
        return "member/member_modify";
    }
    
    @PostMapping("/modify")
    public String modifyMemberPost(@ModelAttribute("student") StudentDTO vo) throws Exception {
    	logger.info(" /modify?id=kang URL POST method called. Not Implemented");
    	memberService.updateMember(vo);
		logger.info(vo.toString());
		logger.info(" /modify?id=kang URL POST method called. then modifyMemberPost method executed.");
        return "redirect:/member/list";
    }  
}
