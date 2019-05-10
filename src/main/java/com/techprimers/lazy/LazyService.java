package com.techprimers.lazy;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class LazyService {


    public LazyService() {
        System.out.println("LazyService :: Constructor Loaded");
    }

    public String hello() {
        return "Hello YouTube";
    }
}
