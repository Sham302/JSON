package com.spartaglobal.JSON.StudentManager.JSONManager.serialiser;

import com.spartaglobal.JSON.StudentManager.StudentFactory;
import org.json.simple.JSONObject;

public class JsonStudentFactory {
    private JSONObject studentJSON = new JSONObject();
    private StudentFactory student;

    public JsonStudentFactory(StudentFactory studentFactory){
       student = studentFactory;
       studentJSON.put("firstName", student.getFirstName());
       studentJSON.put("lastName", student.getLastName());
       studentJSON.put("degree", student.getDegree());
       studentJSON.put("age", student.getAge());
    }

    public void printStudentJSON (){
        System.out.println(studentJSON);
    }

}
