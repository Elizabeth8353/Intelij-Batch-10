package com.MyNotes.Constructor;

import com.MyNotes.AccessModifiers.ParentAccess;

public class AccessModifier extends ParentAccess {


    public AccessModifier(String name, int age) {
        super(name, age);
       // infoprint();
    }


    public static void main(String[] args) {
     //   ParentAccess parentAccess=new ParentAccess("Eli",36);
      //  parentAccess.infoprint();
        AccessModifier accessModifier=new AccessModifier("ELi",21);
        accessModifier.infoprint();


    }
}
