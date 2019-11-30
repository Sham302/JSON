package com.spartaglobal.JSON;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.spartaglobal.JSON.StudentManager.JSONManager.Deserialiser.StudentDTO;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StudentJSONTest
{
    /**
     * Rigorous Test :-)
     */

    private StudentDTO studentDTO = new StudentDTO("Resources/student.json");

    @Test
    public void studentDTOFirstNameTest()
    {
        Assert.assertEquals("shmaila", studentDTO.getFirstName());
    }

    @Test
    public void studentDTOLastNameTest(){
        Assert.assertEquals("rehman", studentDTO.getLastName());
    }

    @Test
    public void studentDTODegreeTest(){
        Assert.assertEquals("BMS, 2.1", studentDTO.getDegree());
    }

    @Test
    public void studentDTOAgeTest(){
       Assert.assertEquals(Long.valueOf(24),studentDTO.getAge());
    }
}
