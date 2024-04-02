package codoacodo.flightapi.services;

import codoacodo.flightapi.models.Flight;
import codoacodo.flightapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlight(){
        return flightRepository.findAll();
    }

    public void createFlight(Flight flight){
        flightRepository.save(flight);
    }

    public Flight searchForId(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public void deleteFlightForId(Long id) {
        flightRepository.deleteById(id);
    }

    public Flight updateFlight(Flight flight){
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId()).orElse(null);
    }

}

