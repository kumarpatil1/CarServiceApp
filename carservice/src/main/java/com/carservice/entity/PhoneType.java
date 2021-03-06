package com.mfc.to;
// Generated Nov 25, 2017 7:35:24 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PhoneType generated by hbm2java
 */
@Entity
@Table(name = "phone_type", catalog = "carservice")
public class PhoneType implements java.io.Serializable {

	private Integer phoneTypeId;
	private String phoneTypeName;
	private Set<EmployeePhone> employeePhones = new HashSet<EmployeePhone>(0);
	private Set<CustomerPhone> customerPhones = new HashSet<CustomerPhone>(0);

	public PhoneType() {
	}

	public PhoneType(String phoneTypeName, Set<EmployeePhone> employeePhones, Set<CustomerPhone> customerPhones) {
		this.phoneTypeName = phoneTypeName;
		this.employeePhones = employeePhones;
		this.customerPhones = customerPhones;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PHONE_TYPE_ID", unique = true, nullable = false)
	public Integer getPhoneTypeId() {
		return this.phoneTypeId;
	}

	public void setPhoneTypeId(Integer phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	@Column(name = "PHONE_TYPE_NAME", length = 100)
	public String getPhoneTypeName() {
		return this.phoneTypeName;
	}

	public void setPhoneTypeName(String phoneTypeName) {
		this.phoneTypeName = phoneTypeName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phoneType")
	public Set<EmployeePhone> getEmployeePhones() {
		return this.employeePhones;
	}

	public void setEmployeePhones(Set<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phoneType")
	public Set<CustomerPhone> getCustomerPhones() {
		return this.customerPhones;
	}

	public void setCustomerPhones(Set<CustomerPhone> customerPhones) {
		this.customerPhones = customerPhones;
	}

}
