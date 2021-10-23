package com.syntax.class31.StudentType;

import java.util.*;

public class UserdefineClassInSet {
    public static void main(String[] args) {
        Set<Student> students=new LinkedHashSet<>();
        students.add(new Student("Andrei",101));
        students.add(new Student("Olena",102));
        students.add(new Student("Serge",101));
        students.add(new Student("Elizabeth",102));
        students.add(new Student("Dilnoza",102));
        System.out.println(students.size());
        Iterator<Student>it=students.iterator();
     //   while (it.hasNext()){
    //        Student el=it.next();
    //      String name =el.name;
    //        int id =el.studentID;
      //      System.out.println(name+" "+id);
     //   }
        System.out.println("===================Whithout storing in variables==================================");
        Iterator<Student>iter=students.iterator();
        while (iter.hasNext()){
            Student stu=iter.next();//better
            System.out.println(stu.name+" id is "+stu.studentID);
            //System.out.println(stu.studentID);
        }
    }
}
