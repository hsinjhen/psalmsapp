package com.egg.psalmsapp.sales.seller.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.egg.psalmsapp.sales.seller.domain.AgentStatus;
import com.egg.psalmsapp.sales.seller.domain.service.AgentStatusService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/application-config.xml")
public class AgentStatusServiceTest {

	@Autowired
	private AgentStatusService agentStatusService;
	
	@Test
	public void getAllAgentStatus(){
		List<AgentStatus> agentStatusList = agentStatusService.getAllAgentStatus();
		for(AgentStatus a : agentStatusList){
			System.out.println("AGENT STATUS LIST : " + a);
		}
	}
	
	@Test
	public void createAgentStatus(){
		AgentStatus as = new AgentStatus();
		as.setStatus("Inactive");
		agentStatusService.createAgentStatus(as);
	}
	
	@Test
	public void getById(){
		AgentStatus as = agentStatusService.getAgentStatusById(new Long(1));
		System.out.println(as);
	}
	
	@Test
	public void updateAgentStatus(){
		AgentStatus as = agentStatusService.getAgentStatusById(new Long(2));
		as.setStatus("Inactive");
		agentStatusService.updateAgentStatus(as);
		getAllAgentStatus();
	}
	
	@Test
	public void deleteAgentStatus(){
		AgentStatus as = agentStatusService.getAgentStatusById(new Long(2));
		agentStatusService.deleteAgentStatus(as);
		getAllAgentStatus();
	}
}
