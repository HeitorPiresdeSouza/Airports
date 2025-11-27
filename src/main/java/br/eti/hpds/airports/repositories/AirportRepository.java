package br.eti.hpds.airports.repositories;

import br.eti.hpds.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
    
}
