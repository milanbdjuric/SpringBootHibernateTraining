package com.milanbdjuric.cruddemo;

import com.milanbdjuric.cruddemo.dao.StudentDAO;
import com.milanbdjuric.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner ->{
			// createStudent(studentDAO);

			createMultipleStudents(studentDAO);

		};


	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Creating three student objects ...");
	//	Student tempStudent1 = new Student("Mirsad", "Habibovic", "mirsad@gmail.com");
	//	Student tempStudent2 = new Student("Blagoje", "Cabarkapa", "blagoje@gmail.com");
	//	Student tempStudent3 = new Student("Miodrag", "Bataveljic", "batavelja@gmail.com");

		System.out.println("Saving the students ...");
	//	studentDAO.save(tempStudent1);
	//	studentDAO.save(tempStudent2);
	//	studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating new student object ...");

		Student tempStudent = new Student("Vlastimir", "Bakracevic", "fesram@gmail.com");

		System.out.println("Saving the student ...");

		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}

}
