package com.hmtmcse.lombok;

public class LombokTest {

    public static void main(String[] args) {

        StudentData studentData = new StudentData();
        studentData.setAge(18);
        studentData.setName("Touhid Mia");
        studentData.setPassword("123");
        studentData.setEmail("hmtmcse.com@gmail.com");
        studentData.setImage("profile.jpg");

        System.out.println(studentData.toString());


        StudentBuilder studentBuilder = StudentBuilder.builder().age(18).name("Touhid Mia").build();
        System.out.println(studentBuilder.name + " " + studentBuilder.age);


    }
}
