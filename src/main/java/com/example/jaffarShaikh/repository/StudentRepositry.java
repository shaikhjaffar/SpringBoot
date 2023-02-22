package com.example.jaffarShaikh.repository;
import  com.example.jaffarShaikh.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//Jpa Repository accept two parmeter class name,data type i.e Id we have given long thats why we will use long
public interface StudentRepositry extends JpaRepository<Student, Long> {

    

}
