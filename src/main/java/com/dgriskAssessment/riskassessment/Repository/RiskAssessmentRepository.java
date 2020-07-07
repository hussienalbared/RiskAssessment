package com.dgriskAssessment.riskassessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgriskAssessment.riskassessment.models.RiskAssessmentModel;

public interface RiskAssessmentRepository extends JpaRepository<RiskAssessmentModel,String> {
    public RiskAssessmentModel findByparty_number(String party_number);
}
