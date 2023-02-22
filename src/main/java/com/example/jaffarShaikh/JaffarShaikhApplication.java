package com.example.jaffarShaikh;

import com.example.jaffarShaikh.model.Student;
import com.example.jaffarShaikh.repository.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JaffarShaikhApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JaffarShaikhApplication.class, args);
	}
	@Autowired
	private StudentRepositry studentRepositry;

	@Override
	public void run(String... args) throws Exception{
		Student st = new Student();
		st.setFirstName("Jaffar");
		st.setLastName("Shaikh");
		st.setEmailId("jaffarShaik013@gmail.com");
		studentRepositry.save(st);
	}



}
