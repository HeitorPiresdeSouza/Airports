package br.eti.hpds.airports.service;

import br.eti.hpds.airports.entities.Airport;
import br.eti.hpds.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class AirportService {
        
        @Autowired
        private AirportRepository airportRepository;
        
        public List<Airport> findAll() {
            
            List<Airport> result = airportRepository.findAll();
            return result;
        }
    }

