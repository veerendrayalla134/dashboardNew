package com.dashboard.apdpms.service;

import java.util.List;
import java.util.Optional;

import com.dashboard.apdpms.dto.ApdpmSystemByUnameAndDname;
import com.dashboard.apdpms.dto.ApdpmSystemDTO;
import com.dashboard.apdpms.dto.ApdpmSystemDistrictName;
import com.dashboard.apdpms.dto.ApdpmSystemUda;
import com.dashboard.apdpms.dto.OrganizeNameDto;
import com.dashboard.apdpms.dto.ResultDTO;
import com.dashboard.apdpms.dto.StateAggregateDto;
import com.dashboard.apdpms.entity.ApdpmSystem;

public interface ApspmSytemService {

	
	ApdpmSystemDTO convertToDTO(ApdpmSystem entity);

    ApdpmSystem convertToEntity(ApdpmSystemDTO dto);

    ApdpmSystemDTO saveApdpmSystem(ApdpmSystemDTO dto);

    Optional<ApdpmSystemDTO> getApdpmSystemById(Integer dcode);
    
    List<ResultDTO> getAggregatedResults();
    
    List<OrganizeNameDto> getOrganizedNameResults(int dcode);
    
   List<StateAggregateDto> getStateAggregateResults();

   List<ApdpmSystemUda> getUdaAggregateResults();

   
   
   List<ApdpmSystemDistrictName> getDistrictsAggregateResults();
   List<ApdpmSystemByUnameAndDname> getUdaAndDistrictsAggregateResults(int dcode);

   
}
