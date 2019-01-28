package com.epam.springtest2.controller;

import com.epam.springtest2.model.Cat;
import com.epam.springtest2.model.CatService;
import com.epam.springtest2.model.Message;
import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by student on 28.01.2019.
 */
@Controller
public class AppController {
    @Autowired
    @Value("Murzik")
    private Message message;

    @Autowired
    private CatService catService;

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
    private Cat barsik = applicationContext.getBean("cat", Cat.class);

    @RequestMapping("/cat")
    public String getCatInfo(Model model) {
        
        model.addAttribute("name", catService.getName());
        model.addAttribute("nameFromXml", barsik.getName());
        return "cat";
    }
}


