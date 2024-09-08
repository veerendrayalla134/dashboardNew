package com.dashboard.apdpms.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.apdpms.dto.ApdpmSystemByUnameAndDname;
import com.dashboard.apdpms.dto.ApdpmSystemDTO;
import com.dashboard.apdpms.dto.ApdpmSystemDistrictName;
import com.dashboard.apdpms.dto.ApdpmSystemUda;
import com.dashboard.apdpms.dto.OrganizeNameDto;
import com.dashboard.apdpms.dto.ResultDTO;
import com.dashboard.apdpms.dto.StateAggregateDto;
import com.dashboard.apdpms.entity.ApdpmSystem;
import com.dashboard.apdpms.repository.ApdpmSystemRepository;
import com.dashboard.apdpms.service.ApspmSytemService;
@Service
public class ApspmSytemServiceImpl   implements ApspmSytemService {
	
	@Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ApdpmSystemRepository repository;

    @Override
    public ApdpmSystemDTO convertToDTO(ApdpmSystem entity) {
        return modelMapper.map(entity, ApdpmSystemDTO.class);
    }

    @Override
    public ApdpmSystem convertToEntity(ApdpmSystemDTO dto) {
        return modelMapper.map(dto, ApdpmSystem.class);
    }

    @Override
    public ApdpmSystemDTO saveApdpmSystem(ApdpmSystemDTO dto) {
    	ApdpmSystem entity = convertToEntity(dto);

        // Determine which field is provided
        boolean hasUlbcode = dto.getUlbcode() != null;
        boolean hasUdacode = dto.getUdacode() != null;

            Optional<ApdpmSystem> id=     repository.findById(dto.getUlbcode());
          
        if (hasUlbcode) {
            // Insert a new record based on ulbcode
            // Check if a record with the given ulbcode already exists
            if (repository.findByUlbcode(dto.getUlbcode()).isPresent()) {
                throw new RuntimeException("Record with ulbcode " + dto.getUlbcode() + " already exists.");
            }
        } else if (hasUdacode) {
            // Insert a new record based on udacode
            // Check if a record with the given udacode already exists
            if (repository.findByUdacode(dto.getUdacode()).isPresent()) {
                throw new RuntimeException("Record with udacode " + dto.getUdacode() + " already exists.");
            }
        } else {
            throw new IllegalArgumentException("Either ulbcode or udacode must be provided.");
        }

        // Save the new record
        ApdpmSystem savedEntity = repository.save(entity);

        // Convert the saved entity back to DTO
        return convertToDTO(savedEntity);

    }


    @Override
    public Optional<ApdpmSystemDTO> getApdpmSystemById(Integer dcode) {
        return repository.findById(dcode)
                         .map(this::convertToDTO);
    }
    @Override
    public List<ResultDTO> getAggregatedResults() {
        // Get the raw results from the repository
        List<Object[]> results = repository.getAggregatedResults();

        // Convert the results to DTOs
        List<ResultDTO> dtoList = new ArrayList();
        for (Object[] result : results) {
            ResultDTO dto = new ResultDTO();
            dto.setDname((String) result[0]);
            dto.setBpapproved(((Number) result[1]).floatValue());
            dto.setBpsitearea(((Number) result[2]).floatValue());
            dto.setBpbua(((Number) result[3]).floatValue());
            dto.setBpgreenfeelabour(((Number) result[4]).floatValue());
            dto.setBpamtcollected(((Number) result[5]).floatValue());
            dto.setBptotalamt(((Number) result[6]).floatValue());
            dto.setLayoutapproved(((Number) result[7]).floatValue());
            dto.setLayoutsitearea(((Number) result[8]).floatValue());
            dto.setLayoutamt(((Number) result[9]).floatValue());
            dto.setOccupancyapproved(((Number) result[10]).floatValue());
            dto.setOccupancygreenfee(((Number) result[11]).floatValue());
            dto.setOccupancyamtcollected(((Number) result[12]).floatValue());

            dtoList.add(dto);
        }
        return dtoList;
    }

	@Override
	public List<OrganizeNameDto> getOrganizedNameResults(int dcode) {
        List<Object[]> results = repository.getAggregatedOrganizeNameResult( dcode);
        List<OrganizeNameDto> dtos = new ArrayList<>();

        for (Object[] result : results) {
            String dname = (String) result[0];
            String orgName = (String) result[1];
            Float bpapproved = ((Number) result[2]).floatValue();
            Float bpsitearea = ((Number) result[3]).floatValue();
            Float bpbua = ((Number) result[4]).floatValue();
            Float bpgreenfeelabour = ((Number) result[5]).floatValue();
            Float bpamtcollected = ((Number) result[6]).floatValue();
            Float bptotalamt = ((Number) result[7]).floatValue();
            Float layoutapproved = ((Number) result[8]).floatValue();
            Float layoutsitearea = ((Number) result[9]).floatValue();
            Float layoutamt = ((Number) result[10]).floatValue();
            Float occupancyapproved = ((Number) result[11]).floatValue();
            Float occupancygreenfee = ((Number) result[12]).floatValue();
            Float occupancyamtcollected = ((Number) result[13]).floatValue();

            OrganizeNameDto dto = new OrganizeNameDto(dname, orgName, bpapproved, bpsitearea, bpbua,
                    bpgreenfeelabour, bpamtcollected, bptotalamt, layoutapproved, layoutsitearea,
                    layoutamt, occupancyapproved, occupancygreenfee, occupancyamtcollected);
            dtos.add(dto);
        }

        return dtos;
    }

	 @Override
	    public List<StateAggregateDto> getStateAggregateResults() {
	        // Fetch the results from the repository
	        List<Object[]> results = repository.getStateAggregateResults();
	        List<StateAggregateDto> dtos = new ArrayList<>();

	        for (Object[] result : results) {
	            // Map the results to StateAggregateDto
	            Float bpapproved = ((Number) result[0]).floatValue();
	            Float bpsitearea = ((Number) result[1]).floatValue();
	            Float bpbua = ((Number) result[2]).floatValue();
	            Float bpgreenfeelabour = ((Number) result[3]).floatValue();
	            Float bpamtcollected = ((Number) result[4]).floatValue();
	            Float bptotalamt = ((Number) result[5]).floatValue();
	            Float layoutapproved = ((Number) result[6]).floatValue();
	            Float layoutsitearea = ((Number) result[7]).floatValue();
	            Float layoutamt = ((Number) result[8]).floatValue();
	            Float occupancyapproved = ((Number) result[9]).floatValue();
	            Float occupancygreenfee = ((Number) result[10]).floatValue();
	            Float occupancyamtcollected = ((Number) result[11]).floatValue();

	            StateAggregateDto dto = new StateAggregateDto(bpapproved, bpsitearea, bpbua, bpgreenfeelabour,
	                                                         bpamtcollected, bptotalamt, layoutapproved,
	                                                         layoutsitearea, layoutamt, occupancyapproved,
	                                                         occupancygreenfee, occupancyamtcollected);
	            dtos.add(dto);
	        }

	        return dtos;
	    }

	@Override
	 public List<ApdpmSystemUda> getUdaAggregateResults() {
        List<Object[]> results = repository.getUdaAggregateResults();
        List<ApdpmSystemUda> dtos = new ArrayList<>();

        for (Object[] result : results) {
            Double bpapproved = ((Number) result[0]).doubleValue();
            Double bpsitearea = ((Number) result[1]).doubleValue();
            Double bpbua = ((Number) result[2]).doubleValue();
            Double bpgreenfeelabour = ((Number) result[3]).doubleValue();
            Double bpamtcollected = ((Number) result[4]).doubleValue();
            Double bptotalamt = ((Number) result[5]).doubleValue();
            Double layoutapproved = ((Number) result[6]).doubleValue();
            Double layoutsitearea = ((Number) result[7]).doubleValue();
            Double layoutamt = ((Number) result[8]).doubleValue();
            Double occupancyapproved = ((Number) result[9]).doubleValue();
            Double occupancygreenfee = ((Number) result[10]).doubleValue();
            Double occupancyamtcollected = ((Number) result[11]).doubleValue();

            ApdpmSystemUda dto = new ApdpmSystemUda(bpapproved, bpsitearea, bpbua, bpgreenfeelabour,
                                                    bpamtcollected, bptotalamt, layoutapproved,
                                                    layoutsitearea, layoutamt, occupancyapproved,
                                                    occupancygreenfee, occupancyamtcollected);
            dtos.add(dto);
        }
        return dtos;
    }

	@Override
	 public List<ApdpmSystemDistrictName> getDistrictsAggregateResults() {
        List<Object[]> results = repository.getBuildingLayoutDistrictsAggregateResults();
        List<ApdpmSystemDistrictName> dtos = new ArrayList<>();

        for (Object[] result : results) {
            String dname = (String) result[0];
            Double bpapproved = ((Number) result[1]).doubleValue();
            Double bpsitearea = ((Number) result[2]).doubleValue();
            Double bpbua = ((Number) result[3]).doubleValue();
            Double bpgreenfeelabour = ((Number) result[4]).doubleValue();
            Double bpamtcollected = ((Number) result[5]).doubleValue();
            Double bptotalamt = ((Number) result[6]).doubleValue();
            Double layoutapproved = ((Number) result[7]).doubleValue();
            Double layoutsitearea = ((Number) result[8]).doubleValue();
            Double layoutamt = ((Number) result[9]).doubleValue();
            Double occupancyapproved = ((Number) result[10]).doubleValue();
            Double occupancygreenfee = ((Number) result[11]).doubleValue();
            Double occupancyamtcollected = ((Number) result[12]).doubleValue();

            ApdpmSystemDistrictName dto = new ApdpmSystemDistrictName(dname, bpapproved, bpsitearea, bpbua,
                                                                            bpgreenfeelabour, bpamtcollected, bptotalamt,
                                                                            layoutapproved, layoutsitearea, layoutamt,
                                                                            occupancyapproved, occupancygreenfee, occupancyamtcollected);
            dtos.add(dto);
        }
        return dtos;
    }

	@Override
	public List<ApdpmSystemByUnameAndDname> getUdaAndDistrictsAggregateResults(int dcode) {
        List<Object[]> results = repository.getBuildingLayoutUdaAndDistrictggregateResults(dcode);
        List<ApdpmSystemByUnameAndDname> dtos = new ArrayList<>();

        for (Object[] result : results) {
            String dname = (String) result[0];
            String parentUdaName = (String) result[1];
            Double bpapproved = ((Number) result[2]).doubleValue();
            Double bpsitearea = ((Number) result[3]).doubleValue();
            Double bpbua = ((Number) result[4]).doubleValue();
            Double bpgreenfeelabour = ((Number) result[5]).doubleValue();
            Double bpamtcollected = ((Number) result[6]).doubleValue();
            Double bptotalamt = ((Number) result[7]).doubleValue();
            Double layoutapproved = ((Number) result[8]).doubleValue();
            Double layoutsitearea = ((Number) result[9]).doubleValue();
            Double layoutamt = ((Number) result[10]).doubleValue();
            Double occupancyapproved = ((Number) result[11]).doubleValue();
            Double occupancygreenfee = ((Number) result[12]).doubleValue();
            Double occupancyamtcollected = ((Number) result[13]).doubleValue();

            ApdpmSystemByUnameAndDname dto = new ApdpmSystemByUnameAndDname(dname, parentUdaName, bpapproved, bpsitearea, bpbua,
                                                                              bpgreenfeelabour, bpamtcollected, bptotalamt,
                                                                              layoutapproved, layoutsitearea, layoutamt,
                                                                              occupancyapproved, occupancygreenfee, occupancyamtcollected);
            dtos.add(dto);
        }
        return dtos;
    }
}
