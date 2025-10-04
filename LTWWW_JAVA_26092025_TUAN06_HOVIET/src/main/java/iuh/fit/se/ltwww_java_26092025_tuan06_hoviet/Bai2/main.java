package com.example.tuan06.Bai2;

import com.example.tuan06.Bai1.model.collectionExample.Person;
import com.example.tuan06.Bai2.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Employee employee3 = (Employee) context.getBean("employee3");

        System.out.println("Đây là bean sử dụng getter/setter");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("Đây là bean sử dụng constructor");
        System.out.println(employee3);
    }
}
