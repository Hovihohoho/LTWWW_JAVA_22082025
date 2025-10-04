package com.example.tuan06.Bai1.model.exampleWithBeans;

import com.example.tuan06.Bai1.model.collectionExample.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainStudent {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("StudentBeans.xml");
        Student student = context.getBean("student1", Student.class);
//        Student student = context.getBean("student2", Student.class);
        System.out.println(student);


        Person person = context.getBean("person1", Person.class);
        System.out.println(person);
    }
}
