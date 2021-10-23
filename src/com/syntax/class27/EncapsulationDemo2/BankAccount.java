package com.syntax.class27.EncapsulationDemo2;

public class BankAccount {
    private String name;
    private double balance;
    private String userName;
    private String passWord;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    void setName(String name){
        if(name.length()>20){
            System.out.println("Name is too long PLease reduce");
        }else if(name.replaceAll("[^A-Za-z]","").length()==name.length()){
            System.out.println("Special CHaracters and numbers are not allowed in name");
        }else{
            this.name=name;
        }
    }
    double getBalance(String password){
        if(this.passWord.equals(password)){
            return balance;
        }else {
            return -1;
        }
    }
}
