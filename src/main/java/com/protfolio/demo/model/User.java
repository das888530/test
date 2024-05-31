package com.protfolio.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "pa_opr")
public class User {
    @Id
    private String user_name;
    private String pass;
    private String name;
    @CreationTimestamp
    private String created_on;
    @UpdateTimestamp
    private String update_on;
    private String usr_lvl;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUpdate_on() {
        return update_on;
    }

    public void setUpdate_on(String update_on) {
        this.update_on = update_on;
    }

    public String getUsr_lvl() {
        return usr_lvl;
    }

    public void setUsr_lvl(String photo_url) {
        this.usr_lvl = photo_url;
    }
}
