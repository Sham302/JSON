package com.spartaglobal.JSON.StudentManager.JSONManager.Deserialiser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentJSONReader {

    private JSONObject studentJSONDetails;

    public StudentJSONReader(String filename) {

        try {
            FileReader studentJSON = new FileReader(filename); // a simple file reader object
            // deserialising string to object
            JSONParser jsonParser = new JSONParser(); // parser library = extends objects
            Object studentObject = jsonParser.parse(studentJSON); // parse the key and value of studentJSON file
            studentJSONDetails = (JSONObject) studentObject; // casting the studentobject to JSON object (JSONObjects extends hashmap)

        }catch  ( ParseException | IOException e){
            e.printStackTrace();
        }
    }

    public JSONObject getStudentJSONDetails(){
        return studentJSONDetails;
    }
}
