package codoacodo.flightapi.repository;

import codoacodo.flightapi.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// La clase y id
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {


}
