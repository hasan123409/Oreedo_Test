package com.test.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@NotBlank 
	@Column(name="Applicant_Name")
	private String Applicant_Name;

	
	@NotBlank
	@Column(name="Id_Number")
	private String Id_Number;
	
	
	
	@NotBlank
	@Email
	@Column(name="Contact_Email")
	private String Contact_Email;

	@NotBlank
	@Column(name="Date_of_Birth")
	private String Date_of_Birth;

	
	@Column(name="Contact_Address")
	private String Contact_Address;

	@NotBlank
	@Column(name="Contact_Phone")
	private String Contact_Phone;

	 
	@Column(name="Desc_Business")
	private String Desc_Business;
	
	
	 
	@Column(name="Interest")
	private String Interest;
	
	@NotBlank 
	@Column(name="Inv_Amount")
	private String Inv_Amount;
	
	@NotBlank 
	@Column(name="Geographical_Area")
	private String Geographical_Area;
	
	
	@NotBlank
	@Column(name="Add_Notes")
	private String Add_Notes;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getApplicant_Name() {
		return Applicant_Name;
	}


	public void setApplicant_Name(String applicant_Name) {
		Applicant_Name = applicant_Name;
	}


	public String getId_Number() {
		return Id_Number;
	}


	public void setId_Number(String id_Number) {
		Id_Number = id_Number;
	}


	public String getContact_Email() {
		return Contact_Email;
	}


	public void setContact_Email(String contact_Email) {
		Contact_Email = contact_Email;
	}


	public String getDate_of_Birth() {
		return Date_of_Birth;
	}


	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}


	public String getContact_Address() {
		return Contact_Address;
	}


	public void setContact_Address(String contact_Address) {
		Contact_Address = contact_Address;
	}


	public String getContact_Phone() {
		return Contact_Phone;
	}


	public void setContact_Phone(String contact_Phone) {
		Contact_Phone = contact_Phone;
	}


	public String getDesc_Business() {
		return Desc_Business;
	}


	public void setDesc_Business(String desc_Business) {
		Desc_Business = desc_Business;
	}


	public String getInterest() {
		return Interest;
	}


	public void setInterest(String interest) {
		Interest = interest;
	}


	public String getInv_Amount() {
		return Inv_Amount;
	}


	public void setInv_Amount(String inv_Amount) {
		Inv_Amount = inv_Amount;
	}


	public String getGeographical_Area() {
		return Geographical_Area;
	}


	public void setGeographical_Area(String geographical_Area) {
		Geographical_Area = geographical_Area;
	}


	public String getAdd_Notes() {
		return Add_Notes;
	}


	public void setAdd_Notes(String add_Notes) {
		Add_Notes = add_Notes;
	}


	
	
}
