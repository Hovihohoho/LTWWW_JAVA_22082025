package com.example.tuan06.Bai1.model.collectionExample;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<Address> adresses;
    private List<String> emails;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Address> adresses) {
        this.adresses = adresses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adresses=" + adresses +
                ", emails=" + emails +
                '}';
    }
}
