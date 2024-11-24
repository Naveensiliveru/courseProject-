package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Course;

public interface CourseRepo  extends JpaRepository<Course, Long>{

}
