package com.app.service;

import com.app.model.College;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

	public College getCollegeDetails(int collegeId, College c1) {
		c1.setId(collegeId);
		c1.setCollegeName("NIET");
		c1.setCollegeAddress("Nioda");		
		
		return c1;
	}

}
