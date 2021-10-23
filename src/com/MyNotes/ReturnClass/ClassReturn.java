package com.MyNotes.ReturnClass;

import java.util.ArrayList;

public class ClassReturn {
    String s="hello ";
}
class Class2{
    ClassReturn method(){
        return new ClassReturn();
    }


}
