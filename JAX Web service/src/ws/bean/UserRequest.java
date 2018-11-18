package ws.bean;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
@XmlRootElement(name = "UserRequest", namespace = "http://ws.UserLookupService/User")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRequest", namespace = "http://ws.UserLookupService")
public class UserRequest {
	 @XmlElement(name = "userId", namespace = "")
	private String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getCompanyuserId() {
		return companyuserId;
	}
	public void setCompanyuserId(Integer companyuserId) {
		this.companyuserId = companyuserId;
	}
	private String firstName;
	private String lastName;
	private String address;
	private Integer companyuserId;

}
