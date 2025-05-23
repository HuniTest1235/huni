package com.test.jpa.service;

import java.util.List;
import com.test.jpa.domain.StudentDTO;

public interface MemberService {
	public StudentDTO readMember(String id) throws Exception;
	public List<StudentDTO> readMemberList() throws Exception;
	public StudentDTO addMember(StudentDTO student) throws Exception;
	public void deleteMember(String id) throws Exception; 
	public void updateMember(StudentDTO student) throws Exception;
}
