package com.dgriskAssessment.riskassessment.services;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.dgriskAssessment.riskassessment.models.RiskAssessmentModel;
import org.springframework.jdbc.core.RowMapper;

public class RiskRowMapper implements RowMapper<RiskAssessmentModel> {

    @Override
    public RiskAssessmentModel mapRow(ResultSet rs, int arg1) throws SQLException {
        RiskAssessmentModel risk = new RiskAssessmentModel();
        risk.setFsk_risk_assessment_id(rs.getString("Fsk_risk_assessment_id"));
        risk.setParty_name(rs.getString("party_name"));
        risk.setParty_number(rs.getString("party_number"));
        return risk;
    }
}
