package com.dashboard.apdpms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApdpmSystemDTO {

    private Integer dcode;
    private Integer ulbcode;
    private Integer udacode;
    private String financialYear;
    private Integer bpApproved;
    private Float bpSitearea;
    private Float bpBua;
    private Float bpGreenFeeLabour;
    private Float bpAmtCollected;
    private Float bpTotalAmt;
    private Integer layoutApproved;
    private Float layoutSiteArea;
    private Float layoutAmt;
    private Integer occupancyApproved;
    private Float occupancyGreenFee;
    private Float occupancyAmtCollected;
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public Integer getUlbcode() {
		return ulbcode;
	}
	public void setUlbcode(Integer ulbcode) {
		this.ulbcode = ulbcode;
	}
	public Integer getUdacode() {
		return udacode;
	}
	public void setUdacode(Integer udacode) {
		this.udacode = udacode;
	}
	public String getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}
	public Integer getBpApproved() {
		return bpApproved;
	}
	public void setBpApproved(Integer bpApproved) {
		this.bpApproved = bpApproved;
	}
	public Float getBpSitearea() {
		return bpSitearea;
	}
	public void setBpSitearea(Float bpSitearea) {
		this.bpSitearea = bpSitearea;
	}
	public Float getBpBua() {
		return bpBua;
	}
	public void setBpBua(Float bpBua) {
		this.bpBua = bpBua;
	}
	public Float getBpGreenFeeLabour() {
		return bpGreenFeeLabour;
	}
	public void setBpGreenFeeLabour(Float bpGreenFeeLabour) {
		this.bpGreenFeeLabour = bpGreenFeeLabour;
	}
	public Float getBpAmtCollected() {
		return bpAmtCollected;
	}
	public void setBpAmtCollected(Float bpAmtCollected) {
		this.bpAmtCollected = bpAmtCollected;
	}
	public Float getBpTotalAmt() {
		return bpTotalAmt;
	}
	public void setBpTotalAmt(Float bpTotalAmt) {
		this.bpTotalAmt = bpTotalAmt;
	}
	public Integer getLayoutApproved() {
		return layoutApproved;
	}
	public void setLayoutApproved(Integer layoutApproved) {
		this.layoutApproved = layoutApproved;
	}
	public Float getLayoutSiteArea() {
		return layoutSiteArea;
	}
	public void setLayoutSiteArea(Float layoutSiteArea) {
		this.layoutSiteArea = layoutSiteArea;
	}
	public Float getLayoutAmt() {
		return layoutAmt;
	}
	public void setLayoutAmt(Float layoutAmt) {
		this.layoutAmt = layoutAmt;
	}
	public Integer getOccupancyApproved() {
		return occupancyApproved;
	}
	public void setOccupancyApproved(Integer occupancyApproved) {
		this.occupancyApproved = occupancyApproved;
	}
	public Float getOccupancyGreenFee() {
		return occupancyGreenFee;
	}
	public void setOccupancyGreenFee(Float occupancyGreenFee) {
		this.occupancyGreenFee = occupancyGreenFee;
	}
	public Float getOccupancyAmtCollected() {
		return occupancyAmtCollected;
	}
	public void setOccupancyAmtCollected(Float occupancyAmtCollected) {
		this.occupancyAmtCollected = occupancyAmtCollected;
	}
    
    
    
    
}
