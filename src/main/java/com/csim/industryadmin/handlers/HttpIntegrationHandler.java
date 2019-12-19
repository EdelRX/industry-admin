package com.csim.industryadmin.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csim.industryadmin.entities.IndustryEntity;
import com.csim.industryadmin.model.IndustryModel;
import com.csim.industryadmin.repositories.IndustryRepository;

@Component
public class HttpIntegrationHandler {
	
	@Autowired
	IndustryRepository industryRepository;

	public void handle(IndustryModel input) {
		System.out.println("Adding object to DB: "+input.toString());
		IndustryEntity industryEntity = new IndustryEntity();
		industryEntity.setName(input.getName());
		industryEntity.setDescription(input.getDescription());
		industryEntity.setType(input.getType());
		industryEntity.setSubType(input.getSubType());
		industryRepository.save(industryEntity);
		System.out.println("Completed save DB: "+industryEntity.toString());
	}
}
