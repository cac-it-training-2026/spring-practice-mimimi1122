package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0402Controller {
	@RequestMapping(path = "/numguess/start")
	public String number1(HttpSession session) {
		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("hitNumber", hitNumber);
		System.out.println(hitNumber);
		return "practice04/02/numguess_start";
	}

	@RequestMapping(path = "/numguess/input", method = RequestMethod.GET)
	public String number2() {
		return "practice04/02/numguess_input";
	}

	@RequestMapping(path = "/numguess/judge")
	public String number3(HttpSession session, Integer inputNum) {
		Integer hitnumber = (Integer) session.getAttribute("hitNumber");
		if (hitnumber.equals(inputNum)) {
			return "redirect:/numguess/hit";
		} else {
			return "practice04/02/numguess_judge";
		}
	}

	@RequestMapping(path = "/numguess/hit", method = RequestMethod.GET)
	public String number4(Model model, HttpSession session) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		String message = "当たりです！正解は" + hitNumber + "でした。";
		model.addAttribute("message", message);
		session.removeAttribute("hitNumber");
		return "practice04/02/numguess_end";
	}

}
