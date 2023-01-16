package myuser_program;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyUser {
	@Id
private int id;
@Override
	public String toString() {
		return "MyUser [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", facebookPassword=" + facebookPassword + ", instaPassword=" + instaPassword
				+ ", snapchatPassword=" + snapchatPassword + ", watsappPassword=" + watsappPassword
				+ ", twiterPassword=" + twiterPassword + "]";
	}
private String username;
private String email;
private String password;
private String address;
private String facebookPassword;
private String instaPassword;
private String snapchatPassword;
private String watsappPassword;
private String twiterPassword;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getFacebookPassword() {
	return facebookPassword;
}
public void setFacebookPassword(String facebookPassword) {
	this.facebookPassword = facebookPassword;
}
public String getInstaPassword() {
	return instaPassword;
}
public void setInstaPassword(String instaPassword) {
	this.instaPassword = instaPassword;
}
public String getSnapchatPassword() {
	return snapchatPassword;
}
public void setSnapchatPassword(String snapchatPassword) {
	this.snapchatPassword = snapchatPassword;
}
public String getWatsappPassword() {
	return watsappPassword;
}
public void setWatsappPassword(String watsappPassword) {
	this.watsappPassword = watsappPassword;
}
public String getTwiterPassword() {
	return twiterPassword;
}
public void setTwiterPassword(String twiterPassword) {
	this.twiterPassword = twiterPassword;
}

}