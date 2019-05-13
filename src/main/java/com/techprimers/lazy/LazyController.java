package com.techprimers.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LazyController {

    @Lazy
    @Autowired
    LazyService  lazyService;

    @GetMapping
    public String hello(){
       return lazyService.hello();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/wishes")
    public String index() {
        return "index.html";
    }
}
