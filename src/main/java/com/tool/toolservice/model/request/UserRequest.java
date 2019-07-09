package com.tool.toolservice.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class UserRequest {

    @NotNull(message = "First name can not be null")
    @Size(min = 2, message = "firstName should be at least 2 character")
    private String firstName;

    @NotNull(message = "lastName can not be null")
    @Size(min = 2, message = "lastName should be at least 2 character")
    private String lastName;

    @NotNull(message = "Email can not be null")
    @Email(message = "Invalid email id")
    private String email;

    @NotNull(message = "password can not be null")
    @Size(min = 4, max = 8, message = "Password should be between 4 to 8 char longs")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override public String toString() {
        return "UserRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
