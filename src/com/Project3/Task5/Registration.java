package com.Project3.Task5;

public class Registration {
    private String email;
    private String userName;
    private String password;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Email must have Yahoo");
        }
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        if (userName.length() > 6 && !userName.isEmpty()) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username");
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length() > 6 && !password.isEmpty() && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password");
        }
    }
}
