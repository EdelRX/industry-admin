package com.csim.industryadmin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.csim.industryadmin.model.IndustryModel;

import lombok.Data;


@Entity
@Table(name="industries_table")
@Data
public class IndustryEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String description;
	private String type;
	private String subType;
}
