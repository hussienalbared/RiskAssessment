package com.dgriskAssessment.riskassessment.dao;
import java.util.List;
import com.dgriskAssessment.riskassessment.models.RiskAssessmentModel;
import org.springframework.stereotype.Service;


public interface RiskDao {

//    List<RiskAssessmentModel> findAll();
//    void insertRisk(RiskAssessmentModel risk);
//    void updateRisk(RiskAssessmentModel risk);
//    void executeUpdateRisk(RiskAssessmentModel risk);
//    public void deleteRisk(RiskAssessmentModel risk);
    String acceptRisk(String party_number);
}
