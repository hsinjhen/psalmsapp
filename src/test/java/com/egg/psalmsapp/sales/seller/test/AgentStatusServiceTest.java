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
}
