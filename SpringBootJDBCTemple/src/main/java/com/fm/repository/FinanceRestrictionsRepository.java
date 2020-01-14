package com.fm.repository;

import java.util.List;

import com.fm.model.FinanceRestrictions;


public interface FinanceRestrictionsRepository {
	
	public Integer saveAndReturnId(FinanceRestrictions financeRestrictions);
	public Integer simpleSave(FinanceRestrictions financeRestrictions);
	public FinanceRestrictions findOne(Integer id);
	public List<FinanceRestrictions> getListOfFinanceRestrictions();
	public Integer deleteFinanceRestrictions(Integer id) ;
	
}
