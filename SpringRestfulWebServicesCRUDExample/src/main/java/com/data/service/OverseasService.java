package com.data.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.data.bean.Overseas;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class OverseasService {

	static HashMap<Integer, Overseas> overseasIdMap = getOverseasIdMap();

	public OverseasService() {
		super();

		if (overseasIdMap == null) {
			overseasIdMap = new HashMap<Integer, Overseas>();
			// Creating some objects of Overseas while initializing
			Overseas indiaCountry = new Overseas(1, "India", 10000);
			Overseas chinaCountry = new Overseas(4, "China", 20000);
			Overseas nepalCountry = new Overseas(3, "Nepal", 8000);
			Overseas bhutanCountry = new Overseas(2, "Bhutan", 7000);

			overseasIdMap.put(1, indiaCountry);
			overseasIdMap.put(4, chinaCountry);
			overseasIdMap.put(3, nepalCountry);
			overseasIdMap.put(2, bhutanCountry);
		}
	}

	public List<Overseas> getAllOverseas() {
		List<Overseas> overseas = new ArrayList<Overseas>(overseasIdMap.values());
		return overseas;
	}

	public Overseas getOverseas(int id) {
		Overseas overseas = overseasIdMap.get(id);
		return overseas;
	}

	public Overseas addOverseas(Overseas overseas) {
		overseas.setId(getMaxId() + 1);
		overseasIdMap.put(overseas.getId(), overseas);
		return overseas;
	}

	public Overseas updateOverseas(Overseas overseas) {
		if (overseas.getId() <= 0)
			return null;
		overseasIdMap.put(overseas.getId(), overseas);
		return overseas;

	}

	public void deleteOverseas(int id) {
		overseasIdMap.remove(id);
	}

	public static HashMap<Integer, Overseas> getOverseasIdMap() {
		return overseasIdMap;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (int id : overseasIdMap.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}
