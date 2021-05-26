package com.xworkz.xworkzapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "insta_details")
public class InstaDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="INSTAID")
	private int instaId;
	@Column(name="NAME")
	private String name;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="NOOFFOLLOWERS")
	private int noOfFollowers;
	@Column(name="NOOFFOLLOWING")
	private int noOfFollowing;
	@Column(name="TYPE")
	private String type;
	@Column(name="ISACTIVE")
	private boolean isActive;
	public InstaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InstaDTO(String name, String password, int noOfFollowers, int noOfFollowing, String type, boolean isActive) {
		super();
		this.name = name;
		this.password = password;
		this.noOfFollowers = noOfFollowers;
		this.noOfFollowing = noOfFollowing;
		this.type = type;
		this.isActive = isActive;
	}

	
	
	
	
	
	
	





	
	

}
