package com.fm.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fm.model.FinanceRestrictions;

@Repository
public class FinanceRestrictionsRepositoryImpl implements FinanceRestrictionsRepository {
	private String SELECT_SQL = "select ID, CTYPE_CODE, END_DATE,INTR_CAPPT,FIN_EBL,MAX_LA,MIN_LA,NAME,RESPC_CODE,RESPR_CODE,RESPS_CODE,START_DATE from finance_restrictions";
	private String SELECT_SQL_BY_ID = "select ID, CTYPE_CODE, END_DATE,INTR_CAPPT,FIN_EBL,MAX_LA,MIN_LA,NAME,"
			+ "RESPC_CODE,RESPR_CODE,RESPS_CODE,START_DATE from finance_restrictions where ID =?";

	private String DELETE_SQL_BY_ID = "DELETE  from finance_restrictions where ID =?";

	private String INSERT_SQL = "insert into finance_restrictions(ID, CTYPE_CODE, END_DATE,INTR_CAPPT"
			+ ",MAX_LA,MIN_LA,NAME, RESPC_CODE,RESPR_CODE,RESPS_CODE,START_DATE) " + "values (?,?,?,?,?,?,?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	@Transactional
	public Integer saveAndReturnId(FinanceRestrictions financeRestrictions) {
		return jdbcTemplate.update(INSERT_SQL, financeRestrictions.getId(), financeRestrictions.getClosingTypeCode(),
				financeRestrictions.getEndDate(), financeRestrictions.getInterestRateCapPercentage(),
				financeRestrictions.getMinimumLoanAmount(), financeRestrictions.getMaximumLoanAmount(),
				financeRestrictions.getName(), financeRestrictions.getResidenceOfPurchaseCountryCode(),
				financeRestrictions.getResidenceOfPurchaseStateCode(),
				financeRestrictions.getResidenceOfPurchaseRegionCode(), financeRestrictions.getStartDate());
	}

	@Override
	public Integer simpleSave(FinanceRestrictions financeRestrictions) {

		return null;
	}

	@Override
	public FinanceRestrictions findOne(Integer id) {

		RowMapper<FinanceRestrictions> rowMapper = new FinanceRestrictionsRowMapper();
		return jdbcTemplate.queryForObject(SELECT_SQL_BY_ID, new Object[] { id }, rowMapper);

	}

	public Integer deleteFinanceRestrictions(Integer id) {

		return jdbcTemplate.update(DELETE_SQL_BY_ID, new Object[] { id });

	}

	@Transactional
	@Override
	public List<FinanceRestrictions> getListOfFinanceRestrictions() {

		RowMapper<FinanceRestrictions> rowMapper = new FinanceRestrictionsRowMapper();
		return this.jdbcTemplate.query(SELECT_SQL, rowMapper);
	}

}
