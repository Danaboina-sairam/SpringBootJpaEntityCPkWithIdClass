package com.SpringBootJpaEntityCPkWithIdClass.entity;

import jakarta.persistence.*;

@Table(name="USER_DETAILS")
@IdClass(UserCk.class)
@Entity
public class User {
    @Id
    private String name;
    @Id
    private String email;
    private String phone;
    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
