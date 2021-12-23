package com.studentmanagement.studentapp;

import com.studentmanagement.studentapp.entity.Student;
import com.studentmanagement.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentappApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		//Student student1= new Student("Ram","lakhan","ram@gmail.com");
		//studentRepository.save(student1);

	//	Student student2 =new Student("jhon","cena","cena@gmail.com");
		//studentRepository.save(student2);

		//Student student3=new Student("vinay","patil","patil@gmail.com");
		//studentRepository.save(student3);

	}
}
