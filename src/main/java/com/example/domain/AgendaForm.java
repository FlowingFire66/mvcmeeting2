package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * User: FlowingFire
 * Date: 2017/11/14 0014
 * Time: 21:16
 * Description:
 */
public class AgendaForm {


    private String title;
    private UserInfo Initiator;

    private List<String> participators;
    private String starttime;
    private String endtime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserInfo getInitiator() {
        return Initiator;
    }

    public void setInitiator(UserInfo initiator) {
        Initiator = initiator;
    }


    public List<String> getParticipators() {
        return participators;
    }

    public void setParticipators(List<String> participators) {
        this.participators = participators;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}
