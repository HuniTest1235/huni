package com.test.jpa.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")

public class StudentEntity {
	@Id
	@Column(nullable=false)
	private String id;
	@Column(nullable=false)
	private String passwd;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String snum;
	@Column
	private String depart;
	@Column
	private String mobile;
	@Column
	private String email;
	
		
	public static StudentEntity toEntity(StudentDTO dto) {
		return StudentEntity.builder()
				.id(dto.getId())
				.passwd(dto.getPasswd())
				.username(dto.getUsername())
				.snum(dto.getSnum())
				.depart(dto.getDepart())
				.mobile(dto.getMobile())
				.email(dto.getEmail())
				.build();
	}
}
