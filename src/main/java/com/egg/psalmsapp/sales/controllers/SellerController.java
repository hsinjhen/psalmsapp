package com.egg.psalmsapp.sales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.egg.psalmsapp.utils.LogManager;

@Controller
@RequestMapping(value = "/seller")
public class SellerController {

	private static final LogManager LOGGER = LogManager.getInstance();

	@RequestMapping(value = "/agentStatus", method = RequestMethod.GET)
	public String agentStatusPage() {
		LOGGER.info("SELLER CONTROLLER:", "View Agent Status Page");
		return "agentStatus";

	}

}
