/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

import javax.swing.JOptionPane;

/**
 *
 * @author SHAKIB
 */
public class User {
    private int userId;
    private String fullname;
    private String email;
    private String username;// = "admin";
    private String password;// = "123";
    private String gender;
    private String dateOfBirth;
    private String loginDate;
    private String registrationDate;

    public User(String fullname, String email, String username, String password) {
        this.fullname = fullname;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public User(){
        
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean checkUser(String user, String pass){
        if(username.equals(user) && password.equals(pass))
            return true;
        else
            return false;
    }
}
