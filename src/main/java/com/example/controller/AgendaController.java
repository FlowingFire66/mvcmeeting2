package com.example.controller;

import com.example.domain.AgendaForm;
import com.example.domain.UserInfo;
import com.example.service.AgendaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/agenda")
public class AgendaController {
    @Resource
    AgendaService agendaService;
    @RequestMapping(value = "/create")
    public String create(AgendaForm agendaForm,Model model,HttpSession session) {
        UserInfo user =(UserInfo) session.getAttribute("user");
        agendaForm.setInitiator(user);
        try {
            agendaService.create(agendaForm);
        } catch (ParseException e) {
            model.addAttribute("msg","日期错误");
        }
        return "/app";
    }
    @RequestMapping(value = "/creatAgenda")
    public String agenda() {

        return "/agenda/agenda";
    }
}  