package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course ){
        //This If-Else Statement verifies if the student is already enroled by calling the IsAttending method. In case of not enrol the student.
            if (this.isAttendingCourse(course.getCode())){
                System.out.println("The student is already enrolled in this course");


        }else{
                this.courses.add(course);
            }

    }


    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {

        //This for loop goes through each student in the list and verify if the s current student is enrolled
        for (Course course : courses) {

            if (courseCode.equals(course.getCode())) {

                return true;
            }
        }
       return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString()+ ", "+courses + "}";
    }
}
