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
 * KeepInventory generated by hbm2java
 */
@Entity
@Table(name = "keep_inventory", catalog = "carservice")
public class KeepInventory implements java.io.Serializable {

	private Integer keepInventoryId;
	private Customer customer;
	private Inventory inventory;

	public KeepInventory() {
	}

	public KeepInventory(Customer customer, Inventory inventory) {
		this.customer = customer;
		this.inventory = inventory;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "KEEP_INVENTORY_ID", unique = true, nullable = false)
	public Integer getKeepInventoryId() {
		return this.keepInventoryId;
	}

	public void setKeepInventoryId(Integer keepInventoryId) {
		this.keepInventoryId = keepInventoryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INVENTORY_ID")
	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

}
