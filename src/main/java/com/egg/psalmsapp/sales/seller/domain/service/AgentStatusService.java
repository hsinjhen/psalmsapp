package com.egg.psalmsapp.sales.seller.domain.service;

import java.util.List;

import com.egg.psalmsapp.sales.seller.domain.AgentStatus;

public interface AgentStatusService {
	void createAgentStatus(AgentStatus agentStatus);

	void updateAgentStatus(AgentStatus agentStatus);

	void deleteAgentStatus(AgentStatus agentStatus);

	List<AgentStatus> getAllAgentStatus();

	AgentStatus getAgentStatusById(Long id);
}
