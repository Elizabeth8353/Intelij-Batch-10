package com.MyNotes.Final;

public class Final {
    final int var1;//CE since final since we cannot change the value we need to initialize right away
    //if we don't initialize the exemption is that we can initialize this varible with our constructor


    public Final(int var1) {
        this.var1 = var1;
    }
    //if we have multiple constructor we need to initialize it in each in case they try to use it while creating the obj
    public Final(){
        var1=10;
    }
}
