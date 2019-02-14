package com.demo.pojo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @Description:BDF2用户表
 * @Author: mason_ge
 * @Date: 16:24 2018/12/21
 */

public class Bdf2User {
	private String username;
	private String address;
	private Integer administrator;
	private Timestamp birthday;
	private String cname;
	private String companyId;
	private Date createDate;
	private String email;
	private Integer enabled;
	private String ename;
	private Integer male;
	private String mobile;
	private String password;
	private String salt;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Integer administrator) {
		this.administrator = administrator;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getMale() {
		return male;
	}

	public void setMale(Integer male) {
		this.male = male;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Bdf2User bdf2User = (Bdf2User) o;
		return administrator.equals(bdf2User.administrator) && enabled.equals(bdf2User.enabled)
				&& male.equals(bdf2User.male) && Objects.equals(username, bdf2User.username)
				&& Objects.equals(address, bdf2User.address) && Objects.equals(birthday, bdf2User.birthday)
				&& Objects.equals(cname, bdf2User.cname) && Objects.equals(companyId, bdf2User.companyId)
				&& Objects.equals(createDate, bdf2User.createDate) && Objects.equals(email, bdf2User.email)
				&& Objects.equals(ename, bdf2User.ename) && Objects.equals(mobile, bdf2User.mobile)
				&& Objects.equals(password, bdf2User.password) && Objects.equals(salt, bdf2User.salt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, address, administrator, birthday, cname, companyId, createDate, email, enabled,
				ename, male, mobile, password, salt);
	}
}
