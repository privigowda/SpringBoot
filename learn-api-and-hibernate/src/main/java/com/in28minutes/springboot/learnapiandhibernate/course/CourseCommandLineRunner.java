package com.in28minutes.springboot.learnapiandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.in28minutes.springboot.learnapiandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnapiandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"learn JPA now!","in28minutes"));
		repository.save(new Course(2,"learn JDBC now!","in28minutes"));
		repository.save(new Course(3,"learn DevOps now!","in28minutes"));
		repository.deleteById(3l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("learn JDBC now!"));
		
		
		
	}

}
