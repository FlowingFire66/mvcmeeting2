package com.example.repository;

import com.example.domain.Agenda;
import com.example.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import java.util.List;

/**
 * UserInfo持久化类
 *
 * @author Administrator
 *
 */
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    public Agenda findByTitle(String title);
    public void delete(Agenda agenda);
    public List<Agenda> findAll();
    public Agenda save(Agenda agenda);
}