package com.example.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.entity.Pension;
import com.example.service.IPensionService;

@RestController
@RequestMapping("/example")
public class PensionController {
	
	@Autowired
	IPensionService iPensionService;
	
	@PostMapping("/pension")
	Long creatingPension(@RequestBody Pension pensiondetail) {
		Long aadhar = iPensionService.savePension(pensiondetail);
		return aadhar;
	}

}
