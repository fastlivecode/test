package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Demo {
	
	@RequestMapping(method = RequestMethod.GET, value = "/namelist")
	public List<String> nameList(){
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Bhathiya");
		nameList.add("Udari");
		nameList.add("Chathuranga");
		nameList.add("Lakshan");
		nameList.add("Jeewarani");
		nameList.add("Sumedha");
		
		return nameList;
	}
	
	public List<String> cityList(){
		List<String> cityList = new ArrayList<String>();
		cityList.add("Kandy");
		cityList.add("Matale");
		cityList.add("Colombo");
		cityList.add("Rajagiriya");
		cityList.add("Jaffna");
		cityList.add("Rambewa");
		return cityList;
	}

}
