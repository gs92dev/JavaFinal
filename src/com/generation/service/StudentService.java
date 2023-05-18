package com.generation.service;

import com.generation.Main;
import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        System.out.println( "Students" );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            Student course = students.get(key);

            System.out.println( student  );
            /*Here I need to use a for Loop for each student and display all the courses that this student is enroled, but for some reason I'm not able to get this information*/

        }


    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}