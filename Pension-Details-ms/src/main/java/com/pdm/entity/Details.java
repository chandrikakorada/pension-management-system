package com.pdm.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Details {

	private String name;
	private String DOB;
	private String PAN;
	private Integer salaryEarned;
	private Integer allownces;
	private String pensionType;
	private String bankName;
	private Integer accNo;
	private String bankType;
	@Id
	private Long aadhar;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dOB
	 */
	public String getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	/**
	 * @return the pAN
	 */
	public String getPAN() {
		return PAN;
	}
	/**
	 * @param pAN the pAN to set
	 */
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	/**
	 * @return the salaryEarned
	 */
	public Integer getSalaryEarned() {
		return salaryEarned;
	}
	/**
	 * @param salaryEarned the salaryEarned to set
	 */
	public void setSalaryEarned(Integer salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	/**
	 * @return the allownces
	 */
	public Integer getAllownces() {
		return allownces;
	}
	/**
	 * @param allownces the allownces to set
	 */
	public void setAllownces(Integer allownces) {
		this.allownces = allownces;
	}
	/**
	 * @return the pensionType
	 */
	public String getPensionType() {
		return pensionType;
	}
	/**
	 * @param pensionType the pensionType to set
	 */
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the accNo
	 */
	public Integer getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	public Details(String name, String dOB, String pAN, Integer salaryEarned, Integer allownces, String pensionType,
			String bankName, Integer accNo, String bankType, Long aadhar) {
		super();
		this.name = name;
		DOB = dOB;
		PAN = pAN;
		this.salaryEarned = salaryEarned;
		this.allownces = allownces;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accNo = accNo;
		this.bankType = bankType;
		this.aadhar = aadhar;
	}
	
	public Details() {
		super();
	}
}
