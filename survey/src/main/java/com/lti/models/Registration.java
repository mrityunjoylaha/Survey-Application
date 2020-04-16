package com.lti.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	@Id
	@Column(name ="email")
	private String email; 
	
	@Column(name ="full_name")
	private String fullName; 
	
	@Column(name ="job_role")
	private String jobRole; 
	
	@Column(name ="company_name")
	private String companyName; 
	
	@Column(name ="total_user_org")
	private int totalUserOrg; 
	
	@Column(name ="country_region")
	private String countryRegion;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTotalUserOrg() {
		return totalUserOrg;
	}

	public void setTotalUserOrg(int totalUserOrg) {
		this.totalUserOrg = totalUserOrg;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String email, String fullName, String jobRole, String companyName, int totalUserOrg,
			String countryRegion) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.jobRole = jobRole;
		this.companyName = companyName;
		this.totalUserOrg = totalUserOrg;
		this.countryRegion = countryRegion;
	}

	@Override
	public String toString() {
		return "Registration [email=" + email + ", fullName=" + fullName + ", jobRole=" + jobRole + ", companyName="
				+ companyName + ", totalUserOrg=" + totalUserOrg + ", countryRegion=" + countryRegion + "]";
	} 
	
	
}
