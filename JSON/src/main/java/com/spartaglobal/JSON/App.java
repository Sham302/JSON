package com.spartaglobal.JSON;

import com.spartaglobal.JSON.StudentManager.JSONManager.Deserialiser.StudentDTO;
import com.spartaglobal.JSON.StudentManager.StudentFactory;
import com.spartaglobal.JSON.StudentManager.JSONManager.serialiser.JsonStudentFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       StudentFactory student1 = new StudentFactory("shmaila", "rehman", "BMS, 2.1", 24);
       JsonStudentFactory studentJSON = new JsonStudentFactory(student1);
        studentJSON.printStudentJSON();

        StudentDTO studentDTO = new StudentDTO("Resources/student.json");
        System.out.println(studentDTO.getAge());
        System.out.println(studentDTO.getFirstName());
    }
}
