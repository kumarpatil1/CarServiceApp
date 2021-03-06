package com.mfc.to;
// Generated Nov 25, 2017 7:35:24 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", catalog = "carservice")
public class Login implements java.io.Serializable {

	private Integer loginId;
	private Employee employee;
	private String username;
	private String password;
	private Integer noOfAttempts;
	private Date lastLoginAttempts;
	private Date lastSuccessfulLogin;
	private Date passwordExpDate;

	public Login() {
	}

	public Login(Employee employee, String username, String password, Integer noOfAttempts, Date lastLoginAttempts,
			Date lastSuccessfulLogin, Date passwordExpDate) {
		this.employee = employee;
		this.username = username;
		this.password = password;
		this.noOfAttempts = noOfAttempts;
		this.lastLoginAttempts = lastLoginAttempts;
		this.lastSuccessfulLogin = lastSuccessfulLogin;
		this.passwordExpDate = passwordExpDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "LOGIN_ID", unique = true, nullable = false)
	public Integer getLoginId() {
		return this.loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "USERNAME", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NO_OF_ATTEMPTS")
	public Integer getNoOfAttempts() {
		return this.noOfAttempts;
	}

	public void setNoOfAttempts(Integer noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_LOGIN_ATTEMPTS", length = 10)
	public Date getLastLoginAttempts() {
		return this.lastLoginAttempts;
	}

	public void setLastLoginAttempts(Date lastLoginAttempts) {
		this.lastLoginAttempts = lastLoginAttempts;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_SUCCESSFUL_LOGIN", length = 10)
	public Date getLastSuccessfulLogin() {
		return this.lastSuccessfulLogin;
	}

	public void setLastSuccessfulLogin(Date lastSuccessfulLogin) {
		this.lastSuccessfulLogin = lastSuccessfulLogin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PASSWORD_EXP_DATE", length = 10)
	public Date getPasswordExpDate() {
		return this.passwordExpDate;
	}

	public void setPasswordExpDate(Date passwordExpDate) {
		this.passwordExpDate = passwordExpDate;
	}

}
