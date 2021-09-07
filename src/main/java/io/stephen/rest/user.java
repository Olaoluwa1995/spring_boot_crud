package io.stephen.rest;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    @Id
    public String id;
    public String name;
    public String birthdate;
    public String gender;
    public String address;
    public String email;
    public int phonenumber;
    public String password;
}
