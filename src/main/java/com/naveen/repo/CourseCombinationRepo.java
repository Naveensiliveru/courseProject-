package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.CourseCombination;

public interface CourseCombinationRepo  extends JpaRepository<CourseCombination, Long> {

}
