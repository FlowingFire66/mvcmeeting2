package com.example.service.impl;

import com.example.domain.Agenda;
import com.example.domain.AgendaForm;
import com.example.domain.UserInfo;
import com.example.repository.AgendaRepository;
import com.example.repository.UserInfoRepository;
import com.example.service.AgendaService;
import com.example.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {
    DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm");
    @Resource
    private AgendaRepository agendaRepository;
    @Resource
    private UserInfoRepository userInfoRepository;
    @Override
    public Agenda findByTitle(String title) {
        return null;
    }

    @Override
    public void create(AgendaForm agendaForm) throws ParseException {
        Agenda agenda = new Agenda();

        agenda.setEndtime(dateFormat.parse(agendaForm.getEndtime()));
        agenda.setStarttime(dateFormat.parse(agendaForm.getStarttime()));
        agenda.setInitiator(agendaForm.getInitiator());
        agenda.setTitle(agendaForm.getTitle());
        //参与人
        List<String> participators = agendaForm.getParticipators();
        List<UserInfo> userInfos=new ArrayList<UserInfo>();
        for (String username :
                participators) {
            userInfos.add(userInfoRepository.findByUsername(username));
        }
        agenda.setParticipators(userInfos);
        agendaRepository.save(agenda);
    }


}