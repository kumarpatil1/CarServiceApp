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
 * Inventory generated by hbm2java
 */
@Entity
@Table(name = "inventory", catalog = "carservice")
public class Inventory implements java.io.Serializable {

	private Integer inventoryId;
	private String inventoryName;
	private Set<KeepInventory> keepInventories = new HashSet<KeepInventory>(0);

	public Inventory() {
	}

	public Inventory(String inventoryName, Set<KeepInventory> keepInventories) {
		this.inventoryName = inventoryName;
		this.keepInventories = keepInventories;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "INVENTORY_ID", unique = true, nullable = false)
	public Integer getInventoryId() {
		return this.inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	@Column(name = "INVENTORY_NAME", length = 1000)
	public String getInventoryName() {
		return this.inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inventory")
	public Set<KeepInventory> getKeepInventories() {
		return this.keepInventories;
	}

	public void setKeepInventories(Set<KeepInventory> keepInventories) {
		this.keepInventories = keepInventories;
	}

}