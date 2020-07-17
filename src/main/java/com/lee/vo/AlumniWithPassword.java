package com.lee.vo;

import com.lee.domain.Alumni;
import com.lee.domain.User;

public class AlumniWithPassword {
    Alumni alumni;
    User user;

    public Alumni getAlumni() {
        return alumni;
    }

    public void setAlumni(Alumni alumni) {
        this.alumni = alumni;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
