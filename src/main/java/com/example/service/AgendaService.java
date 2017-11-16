package com.example.service;

import com.example.domain.Agenda;
import com.example.domain.AgendaForm;
import com.example.domain.UserInfo;

import java.text.ParseException;
import java.util.List;

public interface AgendaService {

    public Agenda findByTitle(String title);

    void create(AgendaForm agendaForm) throws ParseException;

}