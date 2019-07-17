package com.data.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.data.bean.Overseas;
import com.data.service.OverseasService;

@RestController
public class OverseasController {

	OverseasService overseasService = new OverseasService();

	@RequestMapping(value = "/overseas", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Overseas> getOverseass() {
		List<Overseas> listOfCountries = overseasService.getAllOverseas();
		return listOfCountries;
	}

	@RequestMapping(value = "/overseas/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Overseas getOverseassById(@PathVariable int id) {
		return overseasService.getOverseas(id);
	}

	@RequestMapping(value = "/overseas", method = RequestMethod.POST, headers = "Accept=application/json")
	public Overseas addOverseass(@RequestBody Overseas overseas) {
		return overseasService.addOverseas(overseas);
	}

	@RequestMapping(value = "/overseas", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Overseas updateOverseass(@RequestBody Overseas overseas) {
		return overseasService.updateOverseas(overseas);

	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteOverseas(@PathVariable("id") int id) {
		overseasService.deleteOverseas(id);

	}
}
