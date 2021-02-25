package com.test.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sun.jersey.multipart.FormDataParam;
import com.test.api.message.ResponseMessage;
import com.test.api.model.UserDetails;

public interface Fetchdata extends JpaRepository<UserDetails,String>{

	
	
	
}
