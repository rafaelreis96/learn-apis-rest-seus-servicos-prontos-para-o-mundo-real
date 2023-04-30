package dev.rafaelreis.rest.domain;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelService {
	
	@Autowired
	private TravelRequestRepository travelRequestRepository;
	
	public TravelRequest saveTravelRequest(TravelRequest travelRequest) {
		travelRequest.setStatus(TravelRequestStatus.CREATED);
		travelRequest.setCreateDate(new Date());
		return travelRequestRepository.save(travelRequest);
	}
}
