package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Main;
import com.test.service.MainService;

/**
 * @author Manoj kumar
 */

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	

	@RequestMapping(value="/verify-login",method=RequestMethod.POST)
	public @ResponseBody Main verify(@RequestBody Main main){
		Main dbMain = this.mainService.verify(main);
		if(dbMain != null){
			return dbMain;
		}
		
		return main;
		
	}
	
}
