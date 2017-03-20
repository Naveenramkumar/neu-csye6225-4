package neu.edu.Entity;
// Generated Dec 9, 2016 12:13:39 AM by Hibernate Tools 5.1.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Seller generated by hbm2java
 */
public class Seller implements java.io.Serializable {

	private int sellerId;
	private User user;
	private String company;
	private Set<Product> products = new HashSet<Product>(0);

	public Seller() {
	}

	public Seller(User user) {
		this.user = user;
	}

	public Seller(User user, String company, Set<Product> products) {
		this.user = user;
		this.company = company;
		this.products = products;
	}

	public int getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}