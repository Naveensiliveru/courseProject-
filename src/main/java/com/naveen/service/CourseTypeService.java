package com.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveen.entity.CourseType;
import com.naveen.repo.CousreTypeRepo;

public class CourseTypeService {
	 
	 private final CousreTypeRepo CousreTypeRepo;
	 
	  @Autowired
	   public  CourseTypeService (CousreTypeRepo CousreTypeRepo ) {
		  this .CousreTypeRepo= CousreTypeRepo;
		  
	  }
	   public List<CourseType> getAllCourseTypes() {
	        return CousreTypeRepo.findAll();
	    }

	    public CourseType saveCourseType(CourseType courseType) {
	        return CousreTypeRepo.save(courseType);
	    }

}
