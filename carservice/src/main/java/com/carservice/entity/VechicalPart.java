package com.mfc.to;
// Generated Nov 25, 2017 7:35:24 PM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VechicalPart generated by hbm2java
 */
@Entity
@Table(name = "vechical_part", catalog = "carservice")
public class VechicalPart implements java.io.Serializable {

	private int vechicalPartId;
	private String vechicalPartName;

	public VechicalPart() {
	}

	public VechicalPart(int vechicalPartId) {
		this.vechicalPartId = vechicalPartId;
	}

	public VechicalPart(int vechicalPartId, String vechicalPartName) {
		this.vechicalPartId = vechicalPartId;
		this.vechicalPartName = vechicalPartName;
	}

	@Id

	@Column(name = "vechical_part_id", unique = true, nullable = false)
	public int getVechicalPartId() {
		return this.vechicalPartId;
	}

	public void setVechicalPartId(int vechicalPartId) {
		this.vechicalPartId = vechicalPartId;
	}

	@Column(name = "vechical_part_name", length = 200)
	public String getVechicalPartName() {
		return this.vechicalPartName;
	}

	public void setVechicalPartName(String vechicalPartName) {
		this.vechicalPartName = vechicalPartName;
	}

}
