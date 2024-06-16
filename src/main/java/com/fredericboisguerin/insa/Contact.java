package com.fredericboisguerin.insa;

import com.fredericboisguerin.insa.InvalidContactNameException;

public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String asString() {
        String res = name;
        if (email != null) {
            res += ", " + email;
        }
        if (phoneNumber != null) {
            res += ", " + phoneNumber;
        }
        return res;
    }

    public Void print() {
        System.out.println(asString());
        return null;
    }

    public String getName() {
        return name;
    }
}