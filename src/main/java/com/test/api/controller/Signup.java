package com.test.api.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.sun.jersey.multipart.FormDataParam;
import com.test.api.message.ResponseMessage;
import com.test.api.model.UserDetails;
import com.test.api.repository.Fetchdata;


@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins= {"https://localhost:4200"})

public class Signup {


	@Autowired
	Fetchdata fetch;
	
	
	@PostMapping(path="/signup")
	@Validated
	public ResponseEntity<ResponseMessage> addNew (@FormDataParam(value = "Add_Notes") String Add_Notes,@FormDataParam(value = "Applicant_Name") String Applicant_Name,@FormDataParam(value = "Contact_Address") String Contact_Address,@Email @FormDataParam(value = "Contact_Email") String Contact_Email,@FormDataParam(value = "Contact_Phone") String Contact_Phone,@FormDataParam(value = "Date_of_Birth") String Date_of_Birth,@FormDataParam(value = "Desc_Business") String Desc_Business,@FormDataParam(value = "Geographical_Area") String Geographical_Area,@FormDataParam(value = "Id_Number") String Id_Number,@FormDataParam(value = "Interest") String Interest,@FormDataParam(value = "Inv_Amount") String Inv_Amount) {
		
		String message=" ";

		UserDetails user = new UserDetails();
		user.setAdd_Notes(Add_Notes);
		user.setApplicant_Name(Applicant_Name);
		user.setContact_Address(Contact_Address);
		user.setContact_Email(Contact_Email);
		user.setContact_Phone(Contact_Phone);
		user.setDate_of_Birth(Date_of_Birth);
		user.setDesc_Business(Desc_Business);
		user.setGeographical_Area(Geographical_Area);		
		user.setId_Number(Id_Number);
		user.setInterest(Interest);
		user.setInv_Amount(Inv_Amount);
		
		
		fetch.save(user);
		
		message ="The User "+ Applicant_Name + " saved in the system";
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));

		
	}
	
	
	@GetMapping(path="/all")
	List<UserDetails> getall(){
		return fetch.findAll();
		
	}
	
	
}
