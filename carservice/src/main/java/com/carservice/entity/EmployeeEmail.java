package com.mfc.to;
// Generated Nov 25, 2017 7:35:24 PM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EmployeeEmail generated by hbm2java
 */
@Entity
@Table(name = "employee_email", catalog = "carservice")
public class EmployeeEmail implements java.io.Serializable {

	private Integer employeeEmailId;
	private Employee employee;
	private EmailType emailType;
	private String email;

	public EmployeeEmail() {
	}

	public EmployeeEmail(Employee employee, EmailType emailType, String email) {
		this.employee = employee;
		this.emailType = emailType;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "EMPLOYEE_EMAIL_ID", unique = true, nullable = false)
	public Integer getEmployeeEmailId() {
		return this.employeeEmailId;
	}

	public void setEmployeeEmailId(Integer employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMAIL_TYPE_ID")
	public EmailType getEmailType() {
		return this.emailType;
	}

	public void setEmailType(EmailType emailType) {
		this.emailType = emailType;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}