package stackjava.com.sbjpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "full_name")
	private String full_name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;

	
	public Customer() {
		
	}
	
	public Customer(int id, String full_name, String address, String email, String phone) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", full_name=" + full_name + ", address=" + address + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public String getFull_name() {
		return full_name;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
}
