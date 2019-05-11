package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class AppController {


    @RequestMapping("/index")
    public String welcome2(){
        System.out.println("AppController-> welcome");
        return "index";

    }
    @RequestMapping("/contact")
    public String welcome3(){
        System.out.println("AppController-> welcome");
        return "contact";

    }
    @RequestMapping("/list_contact")
    public String listContact(Model model){

        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList = business.getContactList();

        model.addAttribute("contacts", contactList);

        return "contact";

    }


}