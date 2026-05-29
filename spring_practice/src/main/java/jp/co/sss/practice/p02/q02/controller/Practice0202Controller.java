package jp.co.sss.practice.p02.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0202Controller {
	@RequestMapping("/show/redirect_page")
	public String number1() {
		return "practice02/02/redirect_link";
	}

	@RequestMapping("/absolute")
	public String number2() {
		return "redirect:https:www.google.co.jp";
	}

	@RequestMapping("/relative")
	public String number3() {
		return "redirect:/result";
	}

	@RequestMapping("/result")
	public String number4() {
		return "practice02/02/redirect_result";
	}
}
