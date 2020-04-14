package com.galaxy.spring.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.spring.entity.UserAuthenticationEntity;
import com.galaxy.spring.exception.EntityNotFoundException;
import com.galaxy.spring.jpa.IUserAuthenticationRepository;

@Service
public class UserService {

	@Autowired
	IUserAuthenticationRepository repository;
//	@Autowired
//	ModelMapper modelMapper;

	public void findByUserId(String userId) throws EntityNotFoundException {
	    UserAuthenticationEntity UserAuthenticationEntity = repository.findByUserId(userId)
				.orElseThrow(() -> new EntityNotFoundException("Couldn't find entity with id: " + userId));
		//UserVO userVO = modelMapper.map(userEntity, UserVO.class);
		//return userVO;
	}

}
