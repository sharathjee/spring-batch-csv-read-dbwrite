package com.discover.model;

import java.time.LocalDate;

public class CustomerDto {
    String first_name;
    String last_name;
    String email;
    String phone;
    String gender;
    Integer intAge;
    LocalDate dateRegistered;
    Integer intOrders;
    Float floatSpent;
    String job;
    String hobbies;
    boolean married;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIntAge() {
        return intAge;
    }

    public void setIntAge(Integer intAge) {
        this.intAge = intAge;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDate dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Integer getIntOrders() {
        return intOrders;
    }

    public void setIntOrders(Integer intOrders) {
        this.intOrders = intOrders;
    }

    public Float getFloatSpent() {
        return floatSpent;
    }

    public void setFloatSpent(Float floatSpent) {
        this.floatSpent = floatSpent;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
