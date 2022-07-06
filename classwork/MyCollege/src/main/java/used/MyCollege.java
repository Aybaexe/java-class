/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import src.InterfaceStudent;
import src.InterfaceTeacher;
import src.Person;
import src.Student;
import src.StudentTeacher;
import src.Teacher;

/**
 *
 * @author Ayba
 */
public class MyCollege {
    public static void main(String[] args) {
        Student s1 = new Student();
		InterfaceStudent s2 = new Student();
		Person s3 = new Student();
		
		Teacher t1 = new Teacher();
		InterfaceTeacher t2 = new Teacher();
		Person t3 = new Teacher();
		
		StudentTeacher st1 = new StudentTeacher();
		InterfaceStudent st2= new StudentTeacher();
		InterfaceTeacher st3= new StudentTeacher();
		Person st4 = new StudentTeacher();
		
		s1.getMark1();
		s2.getMark2();
		s3.getName();
		
		t1.getDegry();
		t2.getSalary();
		t3.getName();
		
		st1.getSalary();
		st1.getMark1();
		st2.getMark2();
		st3.getDegry();
		st4.getName();
	
    }
    
}
