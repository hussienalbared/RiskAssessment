package com.dgriskAssessment.riskassessment.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dgriskAssessment.riskassessment.Repository.RiskAssessmentRepository;
import com.dgriskAssessment.riskassessment.dao.RiskDao;
import com.dgriskAssessment.riskassessment.models.RiskAssessmentModel;

@Service
public class RiskDaoImpl
//implements RiskDao
{
//	@Autowired
//	private RiskAssessmentRepository riskAssessmentRepository;
//	private NamedParameterJdbcTemplate template;

//	public RiskDaoImpl(NamedParameterJdbcTemplate template) {
//		this.template = template;
//	}
//
//	@Override
//	public List<RiskAssessmentModel> findAll() {
//		return template.query("select * from fdhdata.fsk_risk_assessment", new RiskRowMapper());
//	}
//
//	@Override
//	public void insertRisk(RiskAssessmentModel risk) {
//
//		final String sql = "insert into employee(employeeId, employeeName , employeeAddress,employeeEmail) values(:employeeId,:employeeName,:employeeEmail,:employeeAddress)";
//		KeyHolder holder = new GeneratedKeyHolder();
//		SqlParameterSource param = new MapSqlParameterSource()
//				.addValue("Fsk_risk_assessment_id", risk.getFsk_risk_assessment_id())
//				.addValue("party_number", risk.getParty_number()).addValue("party_name", risk.getParty_name());
//		template.update(sql, param, holder);
//	}
//
//	@Override
//	public void updateRisk(RiskAssessmentModel risk) {
//		final String sql = "update employee set employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail where employeeId=:employeeId";
//		KeyHolder holder = new GeneratedKeyHolder();
//		SqlParameterSource param = new MapSqlParameterSource()
//				.addValue("Fsk_risk_assessment_id", risk.getFsk_risk_assessment_id())
//				.addValue("party_number", risk.getParty_number()).addValue("party_name", risk.getParty_name());
//		template.update(sql, param, holder);
//
//	}
//
//	@Override
//	public void executeUpdateRisk(RiskAssessmentModel risk) {
//		final String sql = "update employee set employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail where employeeId=:employeeId";
//
//		Map<String, Object> map = new HashMap<String, Object>();
//
//		map.put("Fsk_risk_assessment_id", risk.getFsk_risk_assessment_id());
//		map.put("party_number", risk.getParty_number());
//		map.put("party_name", risk.getParty_name());
//
//		template.execute(sql, map, new PreparedStatementCallback<Object>() {
//			@Override
//			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//				return ps.executeUpdate();
//			}
//		});
//
//	}
//
//	@Override
//	public void deleteRisk(RiskAssessmentModel risk) {
//
//		final String sql = "delete from employee where employeeId=:employeeId";
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("Fsk_risk_assessment_id", risk.getFsk_risk_assessment_id());
//		template.execute(sql, map, new PreparedStatementCallback<Object>() {
//			@Override
//			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//				return ps.executeUpdate();
//			}
//		});
//
//	}

//	@Override
//	@Transactional
//	public String acceptRisk(String party_number) {
//		String result = "";
//		RiskAssessmentModel riskAssessmentModel = this.riskAssessmentRepository.findByparty_number(party_number);
//		if (riskAssessmentModel != null) {
//			riskAssessmentModel.setRisk_assessment_status_code("CLOSED");
//			riskAssessmentModel.setRisk_classification(riskAssessmentModel.getProposed_risk_classification());
//			this.riskAssessmentRepository.save(riskAssessmentModel);
//			result = "TRUE";
//		} else {
//			result = "NOT_FOUND";
//		}
//		return result;
//	}
}
