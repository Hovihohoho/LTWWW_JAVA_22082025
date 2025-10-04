package com.example.tuan06.Bai1.model.exampleWithBeans;

public class Student {
    private long id;
    private String name;
    private Class aclass;
    //Constructor cho constructor-arg
//    public Student(long id, String name, Class aclass) {
//        this.id = id;
//        this.name = name;
//        this.aclass = aclass;
//    }

    //getter-setter cho property
    public Class getAclass() {
        return aclass;
    }

    public void setAclass(Class aclass) {
        this.aclass = aclass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aclass=" + aclass +
                '}';
    }
}
