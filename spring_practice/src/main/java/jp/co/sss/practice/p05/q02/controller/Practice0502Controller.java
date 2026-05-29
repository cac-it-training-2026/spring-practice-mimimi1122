package jp.co.sss.practice.p05.q02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p05.repository.FruitsSeasonRepository;

// Practice6-01
public class Practice0502Controller {

	@Autowired
	FruitsSeasonRepository respository;

	@RequestMapping(path = "/fruits/list/sort/season", method = RequestMethod.GET)
	public String med(Model model) {

		model.addAttribute("fruits_season", respository.findAllByOrderBySeasonMonthAsc());
		return "practice05/02/fruits_list";
	}

}
