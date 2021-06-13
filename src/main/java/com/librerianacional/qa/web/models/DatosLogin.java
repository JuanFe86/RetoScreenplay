package com.librerianacional.qa.web.models;

public class DatosLogin {
    private String emailaddress;
    private String password;

    public DatosLogin(String emailaddress, String password) {
        this.emailaddress = emailaddress;
        this.password = password;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getPassword() {
        return password;
    }
}
