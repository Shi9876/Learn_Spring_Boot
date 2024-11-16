package com.myproject.springboot.spring_boot_concept;

public class Course {
    private long id;
    private String name;
    private String author;

    //Constructor accepting id, name, author==-
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    //toString
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}


//Whenever we print an object of the course class the toString method is called and all the details of the course would be printed.
//Getter methods would be helping us to retrieve the values whenever we need them.