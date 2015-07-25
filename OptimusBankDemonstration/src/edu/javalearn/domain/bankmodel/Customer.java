package edu.javalearn.domain.bankmodel;

import java.util.Date;
import java.util.List;

import edu.javalearn.domain.bankmodel.Account;
import edu.javalearn.domain.bankmodel.BankTransactions;
public class Customer {
private int id;
private String customerName;
private String gender;
private String dateOfBirth;
private String address;
private String city;
private String state;
private String pin;
private String telephoneNo;
private String fax;
private String email;
/**private List<Account> account;
private List<BankTransactions> bankTransactions;

	public List<BankTransactions> getBankTransactions() {
	return bankTransactions;
}
public void setBankTransactions(List<BankTransactions> bankTransactions) {
	this.bankTransactions = bankTransactions;
}
	public List<Account> getAccount() {
	return account;
}
public void setAccount(List<Account> account) {
	this.account = account;
}
*/
	/**
	 * @return
	 */
	public int getId() {
	return id;
}
/**
 * @param id
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName
 */

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
/**
 * @return
 */
public String getGender() {
	return gender;
}
/**
 * @param gender
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return
 */
public String getDateOfBirth() {
	return dateOfBirth;
}
/**
 * @param dateOfBirth
 */
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
/**
 * @return
 */
public String getAddress() {
	return address;
}
/**
 * @param address
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return
 */
public String getCity() {
	return city;
}
/**
 * @param city
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return
 */
public String getState() {
	return state;
}
/**
 * @param state
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return
 */
public String getPin() {
	return pin;
}
/**
 * @param pin
 */
public void setPin(String pin) {
	this.pin = pin;
}
/**
 * @return
 */
public String getTelephoneNo() {
	return telephoneNo;
}
/**
 * @param telephoneNo
 */
public void setTelephoneNo(String telephoneNo) {
	this.telephoneNo = telephoneNo;
}
/**
 * @return
 */
public String getFax() {
	return fax;
}
/**
 * @param fax
 */
public void setFax(String fax) {
	this.fax = fax;
}
/**
 * @return
 */
public String getEmail() {
	return email;
}
/**
 * @param email
 */
public void setEmail(String email) {
	this.email = email;
}
	
	
	
}
