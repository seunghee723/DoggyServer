package com.example.doggy.Doggy.User.Controller;

import com.example.doggy.Doggy.User.Dto.UserDto;
import com.example.doggy.Doggy.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String userList(Model model) {

        ArrayList<UserDto> list = userService.getTest();
        //model.addAttribute("memberList", list);

        log.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getName());
        }


        return "index.html";
    }

}
