package br.eti.hpds.airports.controllers;

import br.eti.hpds.airports.entities.Airport;
import br.eti.hpds.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    /*Anuncia ao Spring que essa classe vai ser um Controller – e que haverá
Endpoints nela.*/
    @RestController 
    public class AirportController {
        
        /*Já explicado. Vai injetar a dependência automaticamente.*/
        @Autowired
        private AirportService airportService;
        
        /**
         * Endpoint /airports/airport
         * Retorna TODOS os aeroportos da base de dados.
         * @return
         */
        
        /*Indica que o método logo abaixo responde ao endpoint /airports/airport.*/
        @GetMapping("/airport")
        public List<Airport> findAll(){
            List<Airport> result = airportService.findAll();
            return result;
        }
}

