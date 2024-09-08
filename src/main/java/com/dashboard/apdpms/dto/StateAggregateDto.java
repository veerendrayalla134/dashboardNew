package com.dashboard.apdpms.dto;

public class StateAggregateDto {

	
	 private Float bpapproved;
	    private Float bpsitearea;
	    private Float bpbua;
	    private Float bpgreenfeelabour;
	    private Float bpamtcollected;
	    private Float bptotalamt;
	    private Float layoutapproved;
	    private Float layoutsitearea;
	    private Float layoutamt;
	    private Float occupancyapproved;
	    private Float occupancygreenfee;
	    private Float occupancyamtcollected;

	    public StateAggregateDto() {
	        // Default constructor
	    }

	    public StateAggregateDto(Float bpapproved, Float bpsitearea, Float bpbua, Float bpgreenfeelabour, 
	                             Float bpamtcollected, Float bptotalamt, Float layoutapproved, 
	                             Float layoutsitearea, Float layoutamt, Float occupancyapproved, 
	                             Float occupancygreenfee, Float occupancyamtcollected) {
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
	    public Float getBpapproved() { return bpapproved; }
	    public void setBpapproved(Float bpapproved) { this.bpapproved = bpapproved; }

	    public Float getBpsitearea() { return bpsitearea; }
	    public void setBpsitearea(Float bpsitearea) { this.bpsitearea = bpsitearea; }

	    public Float getBpbua() { return bpbua; }
	    public void setBpbua(Float bpbua) { this.bpbua = bpbua; }

	    public Float getBpgreenfeelabour() { return bpgreenfeelabour; }
	    public void setBpgreenfeelabour(Float bpgreenfeelabour) { this.bpgreenfeelabour = bpgreenfeelabour; }

	    public Float getBpamtcollected() { return bpamtcollected; }
	    public void setBpamtcollected(Float bpamtcollected) { this.bpamtcollected = bpamtcollected; }

	    public Float getBptotalamt() { return bptotalamt; }
	    public void setBptotalamt(Float bptotalamt) { this.bptotalamt = bptotalamt; }

	    public Float getLayoutapproved() { return layoutapproved; }
	    public void setLayoutapproved(Float layoutapproved) { this.layoutapproved = layoutapproved; }

	    public Float getLayoutsitearea() { return layoutsitearea; }
	    public void setLayoutsitearea(Float layoutsitearea) { this.layoutsitearea = layoutsitearea; }

	    public Float getLayoutamt() { return layoutamt; }
	    public void setLayoutamt(Float layoutamt) { this.layoutamt = layoutamt; }

	    public Float getOccupancyapproved() { return occupancyapproved; }
	    public void setOccupancyapproved(Float occupancyapproved) { this.occupancyapproved = occupancyapproved; }

	    public Float getOccupancygreenfee() { return occupancygreenfee; }
	    public void setOccupancygreenfee(Float occupancygreenfee) { this.occupancygreenfee = occupancygreenfee; }

	    public Float getOccupancyamtcollected() { return occupancyamtcollected; }
	    public void setOccupancyamtcollected(Float occupancyamtcollected) { this.occupancyamtcollected = occupancyamtcollected; }
}
