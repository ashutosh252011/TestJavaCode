package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.College;
import com.app.service.CollegeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/college")
public class CollegeController {
	
	private final CollegeService collegeService;
	
	@GetMapping("/{collegeId}")
	public ResponseEntity<College> getCollegeDetails(@PathVariable("collegeId") int collegeId){
		
		College c1 = new College();
		College c2 = collegeService.getCollegeDetails(collegeId,c1);
		return new ResponseEntity<College>(c2,HttpStatus.OK);
		
	}

}
