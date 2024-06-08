package com.sf.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.*;
@Component
public class Student {
    @Value("1")
    private int roll_no;
    @Value("John")
    private String name;
    @Value("200")
    private String marks;

    public String getMarks() {
        return marks;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(java.lang.String marks) {
        this.marks = marks;
    }

    public void display(){
        System.out.println(this.roll_no);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}
