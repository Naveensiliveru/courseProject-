package com.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.entity.Course;
import com.naveen.repo.CourseRepo;

@Service
public class CourseService {

	 private final  CourseRepo    CourseRepo ;
	  @Autowired
	   public CourseService(CourseRepo   CourseRepo  ) {
		   this .CourseRepo =  CourseRepo ;
	  }
	  
	  
	   public List<Course> getAllCourses(){
		   
		    return CourseRepo .findAll();
		    
	   }
	   
	    public Course saveCourse( Course course) {
	    	
	    	return CourseRepo .save(course);
	    }
} 
