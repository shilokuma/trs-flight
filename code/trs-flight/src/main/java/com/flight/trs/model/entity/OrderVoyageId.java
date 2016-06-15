package com.flight.trs.model.entity;
//Generated 2016-1-16 17:01:14 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

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
public class OrderVoyageId implements java.io.Serializable {
	
	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -8026095104841494855L;

	@Column(name = "ORDER_NO", nullable = false, precision = 20, scale = 0)
	private BigDecimal orderNo;

	@Column(name = "VOYAGE_ID", nullable = false, precision = 20, scale = 0)
	private BigDecimal voyageId;
	
	@Column(name = "VOYAGE_INDEX", nullable = false, precision = 1, scale = 0)
	private int voyageIndex;
	
	public OrderVoyageId() {
	}

	public OrderVoyageId(BigDecimal orderNo, BigDecimal voyageId, int voyageIndex) {
		super();
		this.orderNo = orderNo;
		this.voyageId = voyageId;
		this.voyageIndex = voyageIndex;
	}

	public BigDecimal getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(BigDecimal orderNo) {
		this.orderNo = orderNo;
	}

	public BigDecimal getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(BigDecimal voyageId) {
		this.voyageId = voyageId;
	}

	public int getVoyageIndex() {
		return voyageIndex;
	}

	public void setVoyageIndex(int voyageIndex) {
		this.voyageIndex = voyageIndex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + voyageIndex;
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((voyageId == null) ? 0 : voyageId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderVoyageId other = (OrderVoyageId) obj;
		if (voyageIndex != other.voyageIndex)
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (voyageId == null) {
			if (other.voyageId != null)
				return false;
		} else if (!voyageId.equals(other.voyageId))
			return false;
		return true;
	}
	
}

