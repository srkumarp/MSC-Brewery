package sriram.springwork.MSCBrewery.services;

import java.util.UUID;

import sriram.springwork.MSCBrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);
	
}
