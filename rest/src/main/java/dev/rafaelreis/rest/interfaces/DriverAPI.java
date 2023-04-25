package dev.rafaelreis.rest.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.rafaelreis.rest.domain.Driver;
import dev.rafaelreis.rest.domain.DriverRepository;

@Service
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverAPI {
	
	@Autowired
	private DriverRepository driverRepository;
	
	@GetMapping("/drivers")
	public List<Driver> listDrivers() {
		return driverRepository.findAll();
	}

}