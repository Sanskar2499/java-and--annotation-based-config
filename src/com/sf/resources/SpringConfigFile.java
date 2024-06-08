package com.sf.resources;
import com.sf.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// java based configuration

//@Configuration
//public class SpringConfigFile {
//    @Bean
//    public Student stdId1(){
//         Student stu = new Student();
//         stu.setRoll_no(1);
//         stu.setName("Sam");
//         stu.setMarks("100");
//         return stu;
//    }
//}


// annotation based configuration
@Configuration
@ComponentScan("com.sf.beans") //it will scan for the component
public class SpringConfigFile {

}
