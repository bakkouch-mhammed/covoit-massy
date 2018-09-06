package fr.massy.covoit.covoit_massy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class User {

    private String email;
    private String password;
    private String phone;
    private String name;
    private String filiere;
    private String option;

    public User(String email, String password, String phone, String name, String filiere, String option) {
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.name = name;
        this.filiere = filiere;
        this.option = option;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getFiliere() {
        return filiere;
    }

    public String getOption() {
        return option;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setOption(String option) {
        this.option = option;
    }
}