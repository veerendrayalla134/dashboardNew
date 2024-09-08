package com.dashboard.apdpms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dashboard.apdpms.dto.ResultDTO;
import com.dashboard.apdpms.entity.ApdpmSystem;

@Repository
public interface ApdpmSystemRepository  extends JpaRepository<ApdpmSystem, Integer>{

	 Optional<ApdpmSystem> findByUlbcode(Integer ulbcode);

	    Optional<ApdpmSystem> findByUdacode(Integer udacode);
	    Optional<ApdpmSystem> findById(Integer udacode);

	    
	    
	    @Query(value="SELECT \r\n"
	    		+ " b.dname, \r\n"
	    		+ "SUM(bp_approved) AS bpapproved,\r\n"
	    		+ "    SUM(bp_sitearea) AS bpsitearea,\r\n"
	    		+ "    SUM(bp_bua) AS bpbua,\r\n"
	    		+ "    SUM(bp_green_fee_labour) AS bpgreenfeelabour,\r\n"
	    		+ "    SUM(bp_amt_collected) AS bpamtcollected,\r\n"
	    		+ "    SUM(bp_total_amt) AS bptotalamt,\r\n"
	    		+ "    SUM(layout_approved) AS layoutapproved,\r\n"
	    		+ "    SUM(layout_site_area) AS layoutsitearea,\r\n"
	    		+ "    SUM(layout_amt) AS layoutamt,\r\n"
	    		+ "    SUM(occupancy_approved) AS occupancyapproved,\r\n"
	    		+ "    SUM(occupancy_green_fee) AS occupancygreenfee,\r\n"
	    		+ "    SUM(occupancy_amt_collected) AS occupancyamtcollected\r\n"
	    		+ "FROM \r\n"
	    		+ "    generic.apdpms_building_layout a , (select distinct dcode,dname from generic.apdpms_ulb_master ) b  where a.dcode=b.dcode and a.ulbcode is not null\r\n"
	    		+ "GROUP BY \r\n"
	    		+ "    dname  order by dname ",nativeQuery = true)
	     List<Object[]> getAggregatedResults();
	    
	    
	     
	     @Query(value="SELECT \r\n"
	     		+ " b.dname, org_name,\r\n"
	     		+ "SUM(bp_approved) AS bpapproved,\r\n"
	     		+ "    SUM(bp_sitearea) AS bpsitearea,\r\n"
	     		+ "    SUM(bp_bua) AS bpbua,\r\n"
	     		+ "    SUM(bp_green_fee_labour) AS bpgreenfeelabour,\r\n"
	     		+ "    SUM(bp_amt_collected) AS bpamtcollected,\r\n"
	     		+ "    SUM(bp_total_amt) AS bptotalamt,\r\n"
	     		+ "    SUM(layout_approved) AS layoutapproved,\r\n"
	     		+ "    SUM(layout_site_area) AS layoutsitearea,\r\n"
	     		+ "    SUM(layout_amt) AS layoutamt,\r\n"
	     		+ "    SUM(occupancy_approved) AS occupancyapproved,\r\n"
	     		+ "    SUM(occupancy_green_fee) AS occupancygreenfee,\r\n"
	     		+ "    SUM(occupancy_amt_collected) AS occupancyamtcollected\r\n"
	     		+ "FROM \r\n"
	     		+ "    generic.apdpms_building_layout a , (select distinct dcode,dname,ulbcode,org_name from generic.apdpms_ulb_master ) b \r\n"
	     		+ "	where a.dcode=b.dcode and a.ulbcode=b.ulbcode and a.dcode=:dcode and a.ulbcode is not null\r\n"
	     		+ "GROUP BY \r\n"
	     		+ "    dname,org_name  order by dname,org_name",nativeQuery = true)
		     List<Object[]> getAggregatedOrganizeNameResult(@Param("dcode") int dcode);
	     
	     
	     
		     @Query(value = "SELECT " +
	                   "SUM(bp_approved) AS bpapproved, " +
	                   "SUM(bp_sitearea) AS bpsitearea, " +
	                   "SUM(bp_bua) AS bpbua, " +
	                   "SUM(bp_green_fee_labour) AS bpgreenfeelabour, " +
	                   "SUM(bp_amt_collected) AS bpamtcollected, " +
	                   "SUM(bp_total_amt) AS bptotalamt, " +
	                   "SUM(layout_approved) AS layoutapproved, " +
	                   "SUM(layout_site_area) AS layoutsitearea, " +
	                   "SUM(layout_amt) AS layoutamt, " +
	                   "SUM(occupancy_approved) AS occupancyapproved, " +
	                   "SUM(occupancy_green_fee) AS occupancygreenfee, " +
	                   "SUM(occupancy_amt_collected) AS occupancyamtcollected " +
	                   "FROM generic.apdpms_building_layout " +
	                   "WHERE ulbcode IS NOT NULL",
	           nativeQuery = true)
	    List<Object[]> getStateAggregateResults();
	     
	     
	     
	    @Query(value ="select SUM ( bp_approved) AS bpapproved,\r\n"
	    		+ "    SUM(bp_sitearea) AS bpsitearea,\r\n"
	    		+ "    SUM(bp_bua) AS bpbua,\r\n"
	    		+ "    SUM(bp_green_fee_labour) AS bpgreenfeelabour,\r\n"
	    		+ "    SUM(bp_amt_collected) AS bpamtcollected,\r\n"
	    		+ "    SUM(bp_total_amt) AS bptotalamt,\r\n"
	    		+ "    SUM(layout_approved) AS layoutapproved,\r\n"
	    		+ "    SUM(layout_site_area) AS layoutsitearea,\r\n"
	    		+ "    SUM(layout_amt) AS layoutamt,\r\n"
	    		+ "    SUM(occupancy_approved) AS occupancyapproved,\r\n"
	    		+ "    SUM(occupancy_green_fee) AS occupancygreenfee,\r\n"
	    		+ "    SUM(occupancy_amt_collected) AS occupancyamtcollected\r\n"
	    		+ "FROM \r\n"
	    		+ "    generic.apdpms_building_layout   where udacode is not null",
        nativeQuery = true)
 List<Object[]> getUdaAggregateResults();
	     
 @Query(value = "SELECT b.dname, \r\n"
 		+ "SUM(bp_approved) AS bpapproved,\r\n"
 		+ "    SUM(bp_sitearea) AS bpsitearea,\r\n"
 		+ "    SUM(bp_bua) AS bpbua,\r\n"
 		+ "    SUM(bp_green_fee_labour) AS bpgreenfeelabour,\r\n"
 		+ "    SUM(bp_amt_collected) AS bpamtcollected,\r\n"
 		+ "    SUM(bp_total_amt) AS bptotalamt,\r\n"
 		+ "    SUM(layout_approved) AS layoutapproved,\r\n"
 		+ "    SUM(layout_site_area) AS layoutsitearea,\r\n"
 		+ "    SUM(layout_amt) AS layoutamt,\r\n"
 		+ "    SUM(occupancy_approved) AS occupancyapproved,\r\n"
 		+ "    SUM(occupancy_green_fee) AS occupancygreenfee,\r\n"
 		+ "    SUM(occupancy_amt_collected) AS occupancyamtcollected\r\n"
 		+ "FROM \r\n"
 		+ "    generic.apdpms_building_layout a , (select distinct dcode,dname from generic.apdpms_ulb_master ) b  where a.dcode=b.dcode and a.udacode is not null\r\n"
 		+ "GROUP BY \r\n"
 		+ "    dname  order by dname", nativeQuery = true)
List<Object[]> getBuildingLayoutDistrictsAggregateResults();




@Query(value = "SELECT b.dname, b.parent_uda_name, " +
        "SUM(bp_approved) AS bpapproved, " +
        "SUM(bp_sitearea) AS bpsitearea, " +
        "SUM(bp_bua) AS bpbua, " +
        "SUM(bp_green_fee_labour) AS bpgreenfeelabour, " +
        "SUM(bp_amt_collected) AS bpamtcollected, " +
        "SUM(bp_total_amt) AS bptotalamt, " +
        "SUM(layout_approved) AS layoutapproved, " +
        "SUM(layout_site_area) AS layoutsitearea, " +
        "SUM(layout_amt) AS layoutamt, " +
        "SUM(occupancy_approved) AS occupancyapproved, " +
        "SUM(occupancy_green_fee) AS occupancygreenfee, " +
        "SUM(occupancy_amt_collected) AS occupancyamtcollected " +
        "FROM generic.apdpms_building_layout a " +
        "JOIN generic.apdpms_ulb_master b ON a.dcode = b.dcode " +
        "WHERE a.udacode = b.parent_uda_code AND a.dcode = :dcode AND a.udacode IS NOT NULL " +
        "GROUP BY b.dname, b.parent_uda_name " +
        "ORDER BY b.dname, b.parent_uda_name", nativeQuery = true)
List<Object[]> getBuildingLayoutUdaAndDistrictggregateResults(@Param("dcode") int dcode);



	    
}
