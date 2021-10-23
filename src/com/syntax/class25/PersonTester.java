package com.syntax.class25;

public class PersonTester {
    public static void main(String[] args) {
        Employee employee=new Employee("Abdul");
        employee.performDailyActivities();
        Student student=new Student("eli");
        student.performDailyActivities();
        Teacher teacher=new Teacher("Asghar");
        teacher.performDailyActivities();



     //   Person[] arr={new Employee("eli"),new Student("Bri"),new Teacher("Asghar")};
       // for(Person a:arr){
         //   System.out.println(a.name);
          //  a.performDailyActivities();
       // }
    }
}
