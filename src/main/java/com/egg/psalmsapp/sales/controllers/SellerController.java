package com.egg.psalmsapp.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.egg.psalmsapp.sales.seller.domain.AgentStatus;
import com.egg.psalmsapp.sales.seller.domain.service.AgentStatusService;
import com.egg.psalmsapp.utils.LogManager;

@Controller
@RequestMapping(value = "/seller")
public class SellerController {

	private static final String VIEW_AGENT_STATUS = "/agentStatus/viewAgentStatus";
	private static final String ADD_AGENT_STATUS = "/agentStatus/addAgentStatus";
	private static final String EDIT_AGENT_STATUS = "/agentStatus/editAgentStatus";
	private static final String GET_AGENT_STATUS = "/agentStatus/getAgentStatus/{id}";
	private static final String DELETE_AGENT_STATUS = "/agentStatus/deleteAgentStatus/{id}";
	private static final String AGENT_STATUS_ID = "id";
	private static final String AGENT_STATUS_VIEW = "agentStatus";
	private static final String AGENT_STATUS = "status";
	private List<AgentStatus> agentStatusList;

	@Autowired
	private AgentStatusService agentStatusService;

	private static final LogManager LOGGER = LogManager.getInstance();

	@RequestMapping(value = VIEW_AGENT_STATUS, method = RequestMethod.GET)
	public String viewAgentStatus(Model model) {
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER",
				"VIEW AGENT STATUS METHOD!!!!!!!!");
		agentStatusList = agentStatusService.getAllAgentStatus();
		LOGGER.info("GETTING THE LIST OF AGENT STATUS", "::::::"
				+ agentStatusList);
		model.addAttribute("agentStatusList", agentStatusList);
		return AGENT_STATUS_VIEW;
	}

	@RequestMapping(value = ADD_AGENT_STATUS, method = RequestMethod.POST)
	public @ResponseBody AgentStatus addAgentStatus(
			@RequestParam(AGENT_STATUS) String status) {
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER",
				"ADD AGENT STATUS METHOD!!!!!!!!");
		AgentStatus newAgentStatus = new AgentStatus();
		newAgentStatus.setStatus(status);
		LOGGER.info("INSERTING NEW AGENT STATUS", ":::: " + newAgentStatus);
		agentStatusService.createAgentStatus(newAgentStatus);
		LOGGER.info("INSERTING NEW AGENT STATUS", ":::: SUCCESSFULLY INSERTED!"
				+ newAgentStatus);
		return newAgentStatus;
	}

	@RequestMapping(value = GET_AGENT_STATUS, method = RequestMethod.GET)
	public @ResponseBody AgentStatus getAgentStatus(@PathVariable int id) {
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER", "GET AGENT STATUS BY ID METHOD!!!!!!!!");
		AgentStatus agentStatus = new AgentStatus();
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER", "GET AGENT STATUS BY ID" + agentStatus.getId());
		agentStatus = agentStatusService.getAgentStatusById(new Long(id));
		LOGGER.info("RETRIEVING AGENT STATUS", ":::: SUCCESSFULLY RETRIEVED AGENT STATUS ID:" + agentStatus.getId()+ " " + agentStatus);
		return agentStatus;
	}

	@RequestMapping(value = EDIT_AGENT_STATUS, method = RequestMethod.POST)
	public @ResponseBody AgentStatus editAgentStatus(
			@RequestParam(AGENT_STATUS_ID) Long id, @RequestParam(AGENT_STATUS) String status) {
		AgentStatus agentStatus = new AgentStatus();
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER", "EDIT AGENT STATUS METHOD!!!!!!!!");
		agentStatus.setId(id);
		agentStatus.setStatus(status);
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER", "EDIT AGENT STATUS ID: " + agentStatus.getId());
		agentStatusService.updateAgentStatus(agentStatus);
		LOGGER.info("UPDATING AGENT STATUS", ":::: SUCCESSFULLY UPDATED!"
				+ agentStatus);
		return agentStatus;
	}

	@RequestMapping(value = DELETE_AGENT_STATUS, method = RequestMethod.POST)
	public @ResponseBody AgentStatus deleteLocation(@PathVariable int id) {
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER", "DELETE AGENT STATUS METHOD!!!!!!!!");
		AgentStatus agentStatus = new AgentStatus();
		agentStatus = agentStatusService.getAgentStatusById(new Long(id));
		LOGGER.info("INSIDE AGENT STATUS CONTROLLER", "EDIT AGENT STATUS ID: " + agentStatus.getId() + " " + agentStatus);
		agentStatusService.deleteAgentStatus(agentStatus);
		LOGGER.info("DELETING AGENT STATUS", ":::: SUCCESSFULLY DELETED!"
				+ agentStatus);
		return agentStatus;
	}
}
