package com.dgriskAssessment.riskassessment.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fsk_risk_assessment", schema = "fdhdata")

public class RiskAssessmentModel {
	@Id
	private String fsk_risk_assessment_id;

	private String created_by_user_id;
	private String last_updated_by_user_id;
	private String created_at_dttm;
	private String last_updated_at_dttm;
	private int version;
	private String risk_assessment_status_code;
	private String risk_classification;
	private String proposed_risk_classification;
	private String party_number;
	private int party_key;
	private String party_name;
	private int _ID_NUMERIC_PART_NO;

	public String getCreated_by_user_id() {
		return created_by_user_id;
	}

	public void setCreated_by_user_id(String created_by_user_id) {
		this.created_by_user_id = created_by_user_id;
	}

	public String getLast_updated_by_user_id() {
		return last_updated_by_user_id;
	}

	public void setLast_updated_by_user_id(String last_updated_by_user_id) {
		this.last_updated_by_user_id = last_updated_by_user_id;
	}

	public String getCreated_at_dttm() {
		return created_at_dttm;
	}

	public void setCreated_at_dttm(String created_at_dttm) {
		this.created_at_dttm = created_at_dttm;
	}

	public String getLast_updated_at_dttm() {
		return last_updated_at_dttm;
	}

	public void setLast_updated_at_dttm(String last_updated_at_dttm) {
		this.last_updated_at_dttm = last_updated_at_dttm;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getRisk_assessment_status_code() {
		return risk_assessment_status_code;
	}

	public void setRisk_assessment_status_code(String risk_assessment_status_code) {
		this.risk_assessment_status_code = risk_assessment_status_code;
	}

	public String getRisk_classification() {
		return risk_classification;
	}

	public void setRisk_classification(String risk_classification) {
		this.risk_classification = risk_classification;
	}

	public String getProposed_risk_classification() {
		return proposed_risk_classification;
	}

	public void setProposed_risk_classification(String proposed_risk_classification) {
		this.proposed_risk_classification = proposed_risk_classification;
	}

	public String getParty_number() {
		return party_number;
	}

	public void setParty_number(String party_number) {
		this.party_number = party_number;
	}

	public int getParty_key() {
		return party_key;
	}

	public void setParty_key(int party_key) {
		this.party_key = party_key;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public int get_ID_NUMERIC_PART_NO() {
		return _ID_NUMERIC_PART_NO;
	}

	public void set_ID_NUMERIC_PART_NO(int _ID_NUMERIC_PART_NO) {
		this._ID_NUMERIC_PART_NO = _ID_NUMERIC_PART_NO;
	}

	public String getFsk_risk_assessment_id() {
		return fsk_risk_assessment_id;
	}

	public void setFsk_risk_assessment_id(String fsk_risk_assessment_id) {
		this.fsk_risk_assessment_id = fsk_risk_assessment_id;
	}
}
