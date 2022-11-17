package com.spring.orm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(1002, "Sachin Kumar", "sachin@gmail.com");
        int result = studentDao.saveStudent(student);
        System.out.println("Save Result  : " + result);
        context.close();
    }
}
