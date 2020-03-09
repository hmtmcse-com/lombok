package com.hmtmcse.lombok;


import lombok.Builder;

@Builder
public class StudentBuilder {

    public String name;
    public String email;
    public String password;
    public Integer age;

}
