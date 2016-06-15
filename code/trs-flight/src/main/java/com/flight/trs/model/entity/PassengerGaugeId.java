package com.flight.trs.model.entity;
// Generated 2016-1-16 17:01:14 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * PassengerGaugeId generated by hbm2java
 */
@Embeddable
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties("serialVersionUID")
public class PassengerGaugeId implements java.io.Serializable {

	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -9024642868635588951L;
	private String carrierCode;
	private Character clCode;

	public PassengerGaugeId() {
	}

	public PassengerGaugeId(String carrierCode, Character clCode) {
		this.carrierCode = carrierCode;
		this.clCode = clCode;
	}

	@Column(name = "CARRIER_CODE", nullable = false, length = 2)
	public String getCarrierCode() {
		return this.carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	@Column(name = "CL_CODE", nullable = false, length = 1)
	public Character getClCode() {
		return this.clCode;
	}

	public void setClCode(Character clCode) {
		this.clCode = clCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PassengerGaugeId))
			return false;
		PassengerGaugeId castOther = (PassengerGaugeId) other;

		return ((this.getCarrierCode() == castOther.getCarrierCode()) || (this.getCarrierCode() != null
				&& castOther.getCarrierCode() != null && this.getCarrierCode().equals(castOther.getCarrierCode())))
				&& (this.getClCode() == castOther.getClCode());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCarrierCode() == null ? 0 : this.getCarrierCode().hashCode());
		result = 37 * result + this.getClCode();
		return result;
	}
	
}