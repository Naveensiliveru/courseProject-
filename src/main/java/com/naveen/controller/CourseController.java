package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.naveen.entity.Course;
import com.naveen.entity.CourseCombination;
import com.naveen.entity.CourseType;
import com.naveen.service.CourseCombinationService;
import com.naveen.service.CourseService;
import com.naveen.service.CourseTypeService;
@Controller
public class CourseController {
@Autowired
	 private CourseService courseService;
@Autowired
 private  CourseTypeService courseTypeService;
 @Autowired
private CourseCombinationService  combinationService;


 @GetMapping()
  public String getCourses( Model model) {
	  
	   model.addAttribute("courseType", courseTypeService.getAllCourseTypes());
	   model.addAttribute("courses", courseService.getAllCourses());
	   model.addAttribute("combinations", combinationService.getAllCombinations());
  return "courses";
  
  }
  @PostMapping("/add-course")
   public String addCourse(@RequestParam String name) {
	   Course  course = new Course();
	   course.setName(name);
       courseService.saveCourse(course);
       return "redirect:/courses";
	   
  }
  @PostMapping("/add-type")
    public  String addCourseType(@RequestParam String name) {
     CourseType  type = new CourseType();
    	 type.setName(name);
    	 courseTypeService.saveCourseType(type);
    	
    	 return " redirect:/courses";
    }
  @PostMapping("/add-combination")
 
    
      public String addCombination(@RequestParam Long courseTypeId) {
    	   CourseCombination  combination= new  CourseCombination();
    	   combination .setCourseType(new CourseType());
    	   combination .setCourse(new Course());
    	   combinationService.equals(combination);
    	    return " redirect:/course";
      }
 
 
	
}
