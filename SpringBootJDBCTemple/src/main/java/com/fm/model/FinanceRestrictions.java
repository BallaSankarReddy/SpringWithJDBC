package com.fm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class FinanceRestrictions implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "START_DATE")
	private Date startDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "CTYPE_CODE")
	private String closingTypeCode;
	@Column(name = "RESPC_CODE")
	private String residenceOfPurchaseCountryCode;
	@Column(name = "RESPS_CODE")
	private String residenceOfPurchaseStateCode;
	@Column(name = "RESPR_CODE")
	private String residenceOfPurchaseRegionCode;
	@Column(name = "FIN_EBL")
	private boolean isFinancingEligible;
	@Column(name = "MIN_LA")
	private Integer minimumLoanAmount;
	@Column(name = "MAX_LA")
	private Integer maximumLoanAmount;
	@Column(name = "INTR_CAPPT")
	private BigDecimal interestRateCapPercentage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getClosingTypeCode() {
		return closingTypeCode;
	}

	public void setClosingTypeCode(String closingTypeCode) {
		this.closingTypeCode = closingTypeCode;
	}

	public String getResidenceOfPurchaseCountryCode() {
		return residenceOfPurchaseCountryCode;
	}

	public void setResidenceOfPurchaseCountryCode(String residenceOfPurchaseCountryCode) {
		this.residenceOfPurchaseCountryCode = residenceOfPurchaseCountryCode;
	}

	public String getResidenceOfPurchaseStateCode() {
		return residenceOfPurchaseStateCode;
	}

	public void setResidenceOfPurchaseStateCode(String residenceOfPurchaseStateCode) {
		this.residenceOfPurchaseStateCode = residenceOfPurchaseStateCode;
	}

	public String getResidenceOfPurchaseRegionCode() {
		return residenceOfPurchaseRegionCode;
	}

	public void setResidenceOfPurchaseRegionCode(String residenceOfPurchaseRegionCode) {
		this.residenceOfPurchaseRegionCode = residenceOfPurchaseRegionCode;
	}

	public boolean isFinancingEligible() {
		return isFinancingEligible;
	}

	public void setFinancingEligible(boolean isFinancingEligible) {
		this.isFinancingEligible = isFinancingEligible;
	}

	public Integer getMinimumLoanAmount() {
		return minimumLoanAmount;
	}

	public void setMinimumLoanAmount(Integer minimumLoanAmount) {
		this.minimumLoanAmount = minimumLoanAmount;
	}

	public Integer getMaximumLoanAmount() {
		return maximumLoanAmount;
	}

	public void setMaximumLoanAmount(Integer maximumLoanAmount) {
		this.maximumLoanAmount = maximumLoanAmount;
	}

	public BigDecimal getInterestRateCapPercentage() {
		return interestRateCapPercentage;
	}

	public void setInterestRateCapPercentage(BigDecimal interestRateCapPercentage) {
		this.interestRateCapPercentage = interestRateCapPercentage;
	}

	@Override
	public String toString() {
		return "FinanceRestriction [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", closingTypeCode=" + closingTypeCode + ", residenceOfPurchaseCountryCode="
				+ residenceOfPurchaseCountryCode + ", residenceOfPurchaseStateCode=" + residenceOfPurchaseStateCode
				+ ", residenceOfPurchaseRegionCode=" + residenceOfPurchaseRegionCode + ", isFinancingEligible="
				+ isFinancingEligible + ", minimumLoanAmount=" + minimumLoanAmount + ", maximumLoanAmount="
				+ maximumLoanAmount + ", interestRateCapPercentage=" + interestRateCapPercentage + "]";
	}

}
