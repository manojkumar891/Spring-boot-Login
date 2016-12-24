package com.test.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Main;
import com.test.repository.MainRepository;

/**
 * @author Manoj kumar
 */

@Service
@Transactional
public class MainServiceImpl implements MainService{

	@Autowired
	private MainRepository mainRepository;

	@Override
	public Main verify(Main main) {
		return this.mainRepository.verify(main);
	}
	
	
	
}
