package com.example.controller;

import com.example.domain.UserInfo;
import com.example.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;
import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    @Resource
    UserInfoService userInfoService;
    /**
     * 用户查询.  
     * @return
     */

    @RequestMapping("/showAll")
    public String showAll(Model model){
    List<UserInfo> list=userInfoService.findAll();
    model.addAttribute("list",list);
        return "/userInfo/showAll";
    }


    /**
     * 用户注销;
     * @return
     */
    @RequestMapping("/lgout")
    public String lgout(HttpSession session){
        session.setAttribute("user", null);
        return "/index";
    }
}  