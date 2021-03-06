package com.example.alpha_test;

import org.parceler.Parcel;

@Parcel
public class Guard {
    private String Uid;
    private  String Phone;
    private String Id;
    private String Name;
    private String SecondName;
    private String Description;
    private String School;
    private String Password;
    private String GuardCode;


    private Boolean Activated=false;

    public Guard() {
    }

    public Guard(String name, String secondName, String id, String schoolName, String phone, String password ) {
        Phone = phone;
        Id = id;
        Name = name;
        SecondName = secondName;
        School= schoolName;
        Password = password;

    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }



    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String schoolName) {
        School = schoolName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getGuardCode() {
        return GuardCode;
    }

    public void setGuardCode(String guardCode) {
        GuardCode = guardCode;
    }

    public Boolean getActivated() {
        return Activated;
    }

    public void setActivated(Boolean activated) {
        Activated = activated;
    }
}
