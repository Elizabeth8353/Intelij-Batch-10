package com.syntax.class23.HW1;

public class UserInfo extends UserClass{
    String address;

    public UserInfo(String name, String mobileNumber,String address) {
        super(name, mobileNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+" "+mobileNumber+""+address);
    }

    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Eli","703-554","22N street");
        userInfo.userDetails();
    }
}
