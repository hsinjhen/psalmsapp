package com.egg.psalmsapp.sales.seller.domain.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egg.psalmsapp.sales.seller.domain.AgentStatus;

@Repository
@Transactional
public class AgentStatusDaoImpl implements AgentStatusDao {

	@Autowired
	private SessionFactory mySessionFactory;

	@Override
	public void createAgentStatus(AgentStatus agentStatus) {
		try {
			Session session = mySessionFactory.getCurrentSession();
			session.save(agentStatus);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void updateAgentStatus(AgentStatus agentStatus) {
		try {
			Session session = mySessionFactory.getCurrentSession();
			session.update(agentStatus);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void deleteAgentStatus(AgentStatus agentStatus) {
		try {
			Session session = mySessionFactory.getCurrentSession();
			session.delete(agentStatus);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AgentStatus> getAllAgentStatus() {
		List<AgentStatus> agentStatusList = new ArrayList<AgentStatus>();
		String queryString = "";
		try {
			Session session = mySessionFactory.getCurrentSession();
			// CREATE QUERY

			queryString = "FROM AgentStatus";
			Query query = session.createQuery(queryString);
			agentStatusList = query.list();

			// CREATE CRITERIA

			/*
			 * Criteria criteria = session.createCriteria(AgentStatus.class);
			 * agentStatusList = criteria.list();
			 */

			/*
			 * // CREATE SQL QUERY
			 * 
			 * queryString = "SELECT * FROM tbl_agent_status"; SQLQuery sqlQuery
			 * = session.createSQLQuery(queryString);
			 * sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			 * sqlQuery.addEntity(AgentStatus.class); agentStatusList =
			 * sqlQuery.list();
			 */

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return agentStatusList;
	}

	@Override
	public AgentStatus getAgentStatusById(Long id) {
		// List<AgentStatus> agentStatusList = new ArrayList<AgentStatus>();
		AgentStatus agentStatus = new AgentStatus();
		String queryString = "";
		try {
			Session session = mySessionFactory.getCurrentSession();

			// CREATE QUERY
			queryString = "FROM AgentStatus WHERE id=:id";
			Query query = session.createQuery(queryString);
			query.setParameter("id", id);
			/*
			 * agentStatusList = query.list(); if (!agentStatusList.isEmpty()) {
			 * agentStatus = agentStatusList.get(0); }
			 */
			agentStatus = (AgentStatus) query.uniqueResult();

			// CREATE CRITERIA
			/*
			 * Criteria criteria = session.createCriteria(AgentStatus.class);
			 * criteria.add(Restrictions.eq("id", id)); agentStatus =
			 * (AgentStatus) criteria.uniqueResult();
			 */

			// CREATE SQLQUERY
			/*
			 * queryString =
			 * "SELECT tbl_agent_status.status FROM tbl_agent_status WHERE id = :id "
			 * ; SQLQuery sqlQuery = session.createSQLQuery(queryString);
			 * agentStatus = (AgentStatus) sqlQuery.uniqueResult();
			 */

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return agentStatus;
	}

}
