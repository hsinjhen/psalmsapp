package com.egg.psalmsapp.sales.seller.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.psalmsapp.sales.seller.domain.AgentStatus;
import com.egg.psalmsapp.sales.seller.domain.dao.AgentStatusDao;

@Service
public class AgentStatusServiceImpl implements AgentStatusService {

	@Autowired
	private AgentStatusDao agentStatusDao;

	@Override
	public void createAgentStatus(AgentStatus agentStatus) {
		agentStatusDao.createAgentStatus(agentStatus);
	}

	@Override
	public void updateAgentStatus(AgentStatus agentStatus) {
		agentStatusDao.updateAgentStatus(agentStatus);
	}

	@Override
	public void deleteAgentStatus(AgentStatus agentStatus) {
		agentStatusDao.deleteAgentStatus(agentStatus);
	}

	@Override
	public List<AgentStatus> getAllAgentStatus() {
		return agentStatusDao.getAllAgentStatus();
	}

	@Override
	public AgentStatus getAgentStatusById(Long id) {
		return agentStatusDao.getAgentStatusById(id);
	}

}
