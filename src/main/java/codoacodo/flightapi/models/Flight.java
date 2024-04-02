package codoacodo.flightapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String origin;
    private String destiny;
    private String dateHourExit;
    private String dateHourEntry;
    private double price;
    private String frequency;

    public Flight(String origin, String destiny, String dateHourExit, String dateHourEntry, double price, String frequency) {
        this.origin = origin;
        this.destiny = destiny;
        this.dateHourExit = dateHourExit;
        this.dateHourEntry = dateHourEntry;
        this.price = price;
        this.frequency = frequency;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getDateHourExit() {
        return dateHourExit;
    }

    public void setDateHourExit(String dateHourExit) {
        this.dateHourExit = dateHourExit;
    }

    public String getDateHourEntry() {
        return dateHourEntry;
    }

    public void setDateHourEntry(String dateHourEntry) {
        this.dateHourEntry = dateHourEntry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", dateHourExit='" + dateHourExit + '\'' +
                ", dateHourEntry='" + dateHourEntry + '\'' +
                ", price=" + price +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
