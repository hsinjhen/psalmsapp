package com.egg.psalmsapp.sales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/buyer")
public class BuyerController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String showHelloPage() {
		return "hello";
	}
}
