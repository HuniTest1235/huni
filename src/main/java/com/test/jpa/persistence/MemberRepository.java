package com.test.jpa.persistence;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.jpa.domain.StudentEntity;

@Repository
public interface MemberRepository extends JpaRepository<StudentEntity, String>{
	List<StudentEntity> findAll();
	StudentEntity findByUsername(String username);
	Optional<StudentEntity> findById(String id);
	StudentEntity save(StudentEntity entity);
}
