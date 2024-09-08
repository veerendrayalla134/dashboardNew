package com.dashboard.apdpms.dto;

public class ApdpmSystemByUnameAndDname {

	 private String dname;
	    private String parentUdaName;
	    private Double bpapproved;
	    private Double bpsitearea;
	    private Double bpbua;
	    private Double bpgreenfeelabour;
	    private Double bpamtcollected;
	    private Double bptotalamt;
	    private Double layoutapproved;
	    private Double layoutsitearea;
	    private Double layoutamt;
	    private Double occupancyapproved;
	    private Double occupancygreenfee;
	    private Double occupancyamtcollected;

	    // Default constructor
	    public ApdpmSystemByUnameAndDname() {}

	    // Parameterized constructor
	    public ApdpmSystemByUnameAndDname(String dname, String parentUdaName, Double bpapproved, Double bpsitearea, Double bpbua,
	                                       Double bpgreenfeelabour, Double bpamtcollected, Double bptotalamt,
	                                       Double layoutapproved, Double layoutsitearea, Double layoutamt,
	                                       Double occupancyapproved, Double occupancygreenfee, Double occupancyamtcollected) {
	        this.dname = dname;
	        this.parentUdaName = parentUdaName;
	        this.bpapproved = bpapproved;
	        this.bpsitearea = bpsitearea;
	        this.bpbua = bpbua;
	        this.bpgreenfeelabour = bpgreenfeelabour;
	        this.bpamtcollected = bpamtcollected;
	        this.bptotalamt = bptotalamt;
	        this.layoutapproved = layoutapproved;
	        this.layoutsitearea = layoutsitearea;
	        this.layoutamt = layoutamt;
	        this.occupancyapproved = occupancyapproved;
	        this.occupancygreenfee = occupancygreenfee;
	        this.occupancyamtcollected = occupancyamtcollected;
	    }

	    // Getters and Setters
	    public String getDname() {
	        return dname;
	    }

	    public void setDname(String dname) {
	        this.dname = dname;
	    }

	    public String getParentUdaName() {
	        return parentUdaName;
	    }

	    public void setParentUdaName(String parentUdaName) {
	        this.parentUdaName = parentUdaName;
	    }

	    public Double getBpapproved() {
	        return bpapproved;
	    }

	    public void setBpapproved(Double bpapproved) {
	        this.bpapproved = bpapproved;
	    }

	    public Double getBpsitearea() {
	        return bpsitearea;
	    }

	    public void setBpsitearea(Double bpsitearea) {
	        this.bpsitearea = bpsitearea;
	    }

	    public Double getBpbua() {
	        return bpbua;
	    }

	    public void setBpbua(Double bpbua) {
	        this.bpbua = bpbua;
	    }

	    public Double getBpgreenfeelabour() {
	        return bpgreenfeelabour;
	    }

	    public void setBpgreenfeelabour(Double bpgreenfeelabour) {
	        this.bpgreenfeelabour = bpgreenfeelabour;
	    }

	    public Double getBpamtcollected() {
	        return bpamtcollected;
	    }

	    public void setBpamtcollected(Double bpamtcollected) {
	        this.bpamtcollected = bpamtcollected;
	    }

	    public Double getBptotalamt() {
	        return bptotalamt;
	    }

	    public void setBptotalamt(Double bptotalamt) {
	        this.bptotalamt = bptotalamt;
	    }

	    public Double getLayoutapproved() {
	        return layoutapproved;
	    }

	    public void setLayoutapproved(Double layoutapproved) {
	        this.layoutapproved = layoutapproved;
	    }

	    public Double getLayoutsitearea() {
	        return layoutsitearea;
	    }

	    public void setLayoutsitearea(Double layoutsitearea) {
	        this.layoutsitearea = layoutsitearea;
	    }

	    public Double getLayoutamt() {
	        return layoutamt;
	    }

	    public void setLayoutamt(Double layoutamt) {
	        this.layoutamt = layoutamt;
	    }

	    public Double getOccupancyapproved() {
	        return occupancyapproved;
	    }

	    public void setOccupancyapproved(Double occupancyapproved) {
	        this.occupancyapproved = occupancyapproved;
	    }

	    public Double getOccupancygreenfee() {
	        return occupancygreenfee;
	    }

	    public void setOccupancygreenfee(Double occupancygreenfee) {
	        this.occupancygreenfee = occupancygreenfee;
	    }

	    public Double getOccupancyamtcollected() {
	        return occupancyamtcollected;
	    }

	    public void setOccupancyamtcollected(Double occupancyamtcollected) {
	        this.occupancyamtcollected = occupancyamtcollected;
	    }
}
