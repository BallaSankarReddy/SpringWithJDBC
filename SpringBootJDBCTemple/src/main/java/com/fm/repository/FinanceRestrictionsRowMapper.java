package com.fm.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fm.model.FinanceRestrictions;

public class FinanceRestrictionsRowMapper implements RowMapper<FinanceRestrictions> {

	@Override
	public FinanceRestrictions mapRow(ResultSet rs, int rowNum) throws SQLException {
		FinanceRestrictions financeRestrictions = new FinanceRestrictions();
		financeRestrictions.setId(rs.getInt("ID"));
		financeRestrictions.setClosingTypeCode(rs.getString("CTYPE_CODE"));
		financeRestrictions.setEndDate(rs.getDate("END_DATE"));
		financeRestrictions.setInterestRateCapPercentage(rs.getBigDecimal("INTR_CAPPT"));
		financeRestrictions.setMinimumLoanAmount(rs.getInt("MIN_LA"));
		financeRestrictions.setMaximumLoanAmount(rs.getInt("MAX_LA"));
		financeRestrictions.setName(rs.getString("NAME"));
		financeRestrictions.setResidenceOfPurchaseCountryCode(rs.getString("RESPC_CODE"));
		financeRestrictions.setResidenceOfPurchaseStateCode(rs.getString("RESPS_CODE"));
		financeRestrictions.setResidenceOfPurchaseRegionCode(rs.getString("RESPR_CODE")); 
		financeRestrictions.setStartDate(rs.getDate("START_DATE"));

		return financeRestrictions;
	}

}
