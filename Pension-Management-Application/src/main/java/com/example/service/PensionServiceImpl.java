package com.example.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.Pension;
import com.example.repo.IPensionRepository;

@Service
public class PensionServiceImpl implements IPensionService {
	
	@Autowired
	IPensionRepository iPensionRepository;
	
	@Override
	public Long savePension(Pension pensiondetail) {
		Pension savePension = iPensionRepository.save(pensiondetail);
		return savePension.getAadhar();
		
	}
}