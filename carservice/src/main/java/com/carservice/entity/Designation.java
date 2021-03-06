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
 * Designation generated by hbm2java
 */
@Entity
@Table(name = "designation", catalog = "carservice")
public class Designation implements java.io.Serializable {

	private Integer designationId;
	private String designationName;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Designation() {
	}

	public Designation(String designationName, Set<Employee> employees) {
		this.designationName = designationName;
		this.employees = employees;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "DESIGNATION_ID", unique = true, nullable = false)
	public Integer getDesignationId() {
		return this.designationId;
	}

	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}

	@Column(name = "DESIGNATION_NAME", length = 50)
	public String getDesignationName() {
		return this.designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "designation")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
