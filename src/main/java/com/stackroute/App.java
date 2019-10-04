package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfig;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App
{
    public static void main(String[] agrs)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie s1=context.getBean("movie1",Movie.class);
        Movie s2=context.getBean("movie1",Movie.class);
        System.out.print(s1.getActor1().getName());
        System.out.print(s1.getActor1().getAge());
        System.out.println(s1.getActor1().getGender());
        System.out.println(s1.getActor2().getName());
        System.out.println(s1.getActor2().getAge());
        System.out.println(s1.getActor2().getGender());
        System.out.println(s1.getActor3().getName());
        System.out.println(s1.getActor3().getAge());
        System.out.println(s1.getActor3().getGender());
        System.out.println(s1==s2);
    }
}

