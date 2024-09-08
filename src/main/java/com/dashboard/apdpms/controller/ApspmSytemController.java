package com.dashboard.apdpms.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.apdpms.dto.ApdpmSystemDTO;
import com.dashboard.apdpms.dto.OrganizeNameDto;
import com.dashboard.apdpms.dto.ResultDTO;
import com.dashboard.apdpms.dto.StateAggregateDto;
import com.dashboard.apdpms.service.ApspmSytemService;

@RestController
@RequestMapping("/apdpm-system")

public class ApspmSytemController {
	  
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ApspmSytemController.class);

	 @Autowired
	    private ApspmSytemService apdpmSystemService;

	 @PostMapping("/createapdpmsystem")
	    public ResponseEntity<String> createApdpmSystem(@RequestBody ApdpmSystemDTO dto) {
	        logger.info("Received request to create ApdpmSystem with data: {}", dto);

	        try {
	            ApdpmSystemDTO savedDTO = apdpmSystemService.saveApdpmSystem(dto);
	            logger.info("Successfully created ApdpmSystem with ID: {}", savedDTO.getDcode());
	            return ResponseEntity.ok("Record inserted successfully with ID: " + savedDTO.getDcode());
	        } catch (IllegalArgumentException e) {
	            logger.error("Error creating ApdpmSystem: {}", e.getMessage());
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	        } catch (RuntimeException e) {
	            logger.error("Error creating ApdpmSystem: {}", e.getMessage());
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	        }
	        catch (Exception e) {
	            logger.error("Error creating ApdpmSystem: {}", e.getMessage());
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	        }

	    }
	 
	 
	 
	 
	 
	  @GetMapping("/aggregated-results")
	    public ResponseEntity<List<ResultDTO>> getAggregatedResults() {
	        logger.info("Fetching aggregated results");

	        List<ResultDTO> results = apdpmSystemService.getAggregatedResults();

	        if (results.isEmpty()) {
	            logger.warn("No aggregated results found");
	            return ResponseEntity.noContent().build(); // or return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }

	        logger.info("Successfully fetched {} aggregated results", results.size());
	        return ResponseEntity.ok(results);
	    }
	 
	  @GetMapping("/organized-name-results/{dcode}")
	    public ResponseEntity<List<OrganizeNameDto>> getOrganizedNameResults(@PathVariable("dcode") int dcode) {
	        List<OrganizeNameDto> results = apdpmSystemService.getOrganizedNameResults(dcode);
	        return ResponseEntity.ok(results);
	    }
	 
	 
	 
	 
	 
	  @GetMapping("/getstateaggregate")
	    public List<StateAggregateDto> getStateAggregateResults() {
	        // Call the service to get the state aggregate results
	        return apdpmSystemService.getStateAggregateResults();
	    }
	 


	    @GetMapping("/{dcode}")
	    public ResponseEntity<ApdpmSystemDTO> getApdpmSystem(@PathVariable Integer dcode) {
	        return apdpmSystemService.getApdpmSystemById(dcode)
	                .map(ResponseEntity::ok)
	                .orElseGet(() -> ResponseEntity.notFound().build());
	    }
}
