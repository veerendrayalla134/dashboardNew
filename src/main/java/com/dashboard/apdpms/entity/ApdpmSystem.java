package com.dashboard.apdpms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="apdpms_building_layout",schema = "generic")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ApdpmSystem {

	
	@Id
    @Column(name = "dcode")
    private Integer dcode;

    @Column(name = "ulbcode")
    private Integer ulbcode;

    @Column(name = "udacode")
    private Integer udacode;

    @Column(name = "finanacial_year")
    private String financialYear;

    @Column(name = "bp_approved")
    private Integer bpApproved;

    @Column(name = "bp_sitearea")
    private Float bpSitearea;

    @Column(name = "bp_bua")
    private Float bpBua;

    @Column(name = "bp_green_fee_labour")
    private Float bpGreenFeeLabour;

    @Column(name = "bp_amt_collected")
    private Float bpAmtCollected;

    @Column(name = "bp_total_amt")
    private Float bpTotalAmt;

    @Column(name = "layout_approved")
    private Integer layoutApproved;

    @Column(name = "layout_site_area")
    private Float layoutSiteArea;

    @Column(name = "layout_amt")
    private Float layoutAmt;

    @Column(name = "occupancy_approved")
    private Integer occupancyApproved;

    @Column(name = "occupancy_green_fee")
    private Float occupancyGreenFee;

    @Column(name = "occupancy_amt_collected")
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
