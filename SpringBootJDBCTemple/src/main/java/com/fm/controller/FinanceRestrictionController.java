package com.fm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fm.model.FinanceRestrictions;
import com.fm.repository.FinanceRestrictionsRepository;

@RestController
@RequestMapping("/contracts-svc/api/v1/")
public class FinanceRestrictionController {

	@Autowired
	private FinanceRestrictionsRepository financeRestrictionsRepository;

	@PostMapping("/save")
	public Integer save(@RequestBody FinanceRestrictions financeRestrictions) {
		return financeRestrictionsRepository.saveAndReturnId(financeRestrictions);

	}

	@GetMapping("/All")

	public List<FinanceRestrictions> getAll() {

		return financeRestrictionsRepository.getListOfFinanceRestrictions();
	}

	@GetMapping("/financeRestrictions/{userId}")
	public FinanceRestrictions getFinanceRestrictionsById(@PathVariable Integer userId) {
		return financeRestrictionsRepository.findOne(userId);

	}
	@DeleteMapping("finance-restrictions/{id}")
	public Integer deletFinanceRestrictions(@PathVariable Integer id) {
		return financeRestrictionsRepository.deleteFinanceRestrictions(id);

	}
}
