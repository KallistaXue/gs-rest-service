package com.example.restservice.entity;

import java.io.Serializable;
import java.util.Objects;


public class user implements Serializable{
    private Integer user_id;
    private String last_name;
    private String first_name;
    private String date_of_birth;
    private String gender;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user user)) return false;
        return Objects.equals(getUser_id(), user.getUser_id()) && Objects.equals(getLast_name(), user.getLast_name()) && Objects.equals(getFirst_name(), user.getFirst_name()) && Objects.equals(getDate_of_birth(), user.getDate_of_birth()) && Objects.equals(getGender(), user.getGender()) && Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser_id(), getLast_name(), getFirst_name(), getDate_of_birth(), getGender(), getEmail());
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
