package com.example.seyirdefteri.Domains;

import java.io.Serializable;

public class Cast implements Serializable {
    private String PicUrl;
    private String Actor;

    public Cast() {
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }
}
