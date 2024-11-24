package com.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveen.entity.CourseCombination;
import com.naveen.repo.CourseCombinationRepo;

public class CourseCombinationService {
	
	 private final  CourseCombinationRepo   courseCombinationrepo;

	 @Autowired 
	  public  CourseCombinationService(CourseCombinationRepo  courseCombinationrepo ) {
		 
		 this .courseCombinationrepo= courseCombinationrepo;
		 
	 }
	 
	  public List <CourseCombination> getAllCombinations(){
		   return courseCombinationrepo.findAll();
		  
	  }
	   public CourseCombination saveCombination(CourseCombination combination) {
		   
		   return courseCombinationrepo.save(combination);
	   }
	  
}
