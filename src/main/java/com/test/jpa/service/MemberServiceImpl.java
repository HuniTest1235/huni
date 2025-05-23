package com.test.jpa.service;

import java.util.List;
import java.util.stream.Collectors;
import com.test.jpa.domain.StudentDTO;
import com.test.jpa.domain.StudentEntity;
import com.test.jpa.persistence.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	public StudentDTO readMember(String id) throws Exception {
		StudentDTO dto;
		// 엔티티의 식별자(ID)를 기반으로 단일 엔티티를 검색하는 메소드
		// return으로 Optional이 아닌 타입으로 받는다면, get() 메소드를 사용
		dto = StudentDTO.toDTO(memberRepository.findById(id).get());
		return dto;
	}
	
	public StudentDTO addMember(StudentDTO student) throws Exception {
		StudentEntity entity;
		entity = memberRepository.save(StudentEntity.toEntity(student));
		return StudentDTO.toDTO(entity);
	}

	public List<StudentDTO> readMemberList() throws Exception{
		List<StudentDTO> dtoList;
		List<StudentEntity> entityList = memberRepository.findAll();
		// .map() : 해당 스트림의 요소들을 StudentDTO::toDTO 함수에 인자로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 반환.
		// .collect() : 인자로 전달되는 Collectors 객체에 toList() 함수를 수행하여 스트림의 요소를 수집함
		dtoList = entityList.stream().map(StudentDTO::toDTO).collect(Collectors.toList());
		return dtoList;
	}
	
	public void updateMember(StudentDTO student) throws Exception {
		memberRepository.save(StudentEntity.toEntity(student));
	}
	
	public void deleteMember(String id) throws Exception {
		memberRepository.deleteById(id);
	}

}
