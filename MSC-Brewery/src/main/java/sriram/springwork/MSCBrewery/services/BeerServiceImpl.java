package sriram.springwork.MSCBrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import sriram.springwork.MSCBrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder()
				.id(beerId)
				.beerName("Galaxy")
				.beerStyle("Nice")
				.build();
	}

}
