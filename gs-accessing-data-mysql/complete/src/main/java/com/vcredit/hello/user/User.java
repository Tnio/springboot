package com.vcredit.hello.user;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private long id;

    private String name;

    private String email;

    public User() {
    }

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

