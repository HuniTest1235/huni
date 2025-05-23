package com.test.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
	private String id;
	private String passwd;
	private String username;
	private String snum;
	private String depart;
	private String mobile;
	private String email;
	
	public static StudentDTO toDTO(StudentEntity entity) {
		return StudentDTO.builder()
				.id(entity.getId())
				.passwd(entity.getPasswd())
				.username(entity.getUsername())
				.snum(entity.getSnum())
				.depart(entity.getDepart())
				.mobile(entity.getMobile())
				.email(entity.getEmail())
				.build();
	}
}
