package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Student;
 

 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
 
 @Query(value="select * from Student where id=:n",nativeQuery=true)
	public Student re(@Param("n") long id);
 
}
