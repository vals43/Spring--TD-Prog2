package prog3.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prog3.spring.Booking;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final List<Booking> bookings = new ArrayList<>();

    @GetMapping
    public List<Booking> getAll() {
        return bookings;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Booking newBooking) {
        if (newBooking.getRoomNumber() < 1 || newBooking.getRoomNumber() > 9) {
            return ResponseEntity
                    .status(400)
                    .body("Erreur : Les numéros de chambres sont compris entre 1 à 9 uniquement.");
        }

        for (Booking b : bookings) {
            if (b.getRoomNumber() == newBooking.getRoomNumber() &&
                    b.getBookingDate().equals(newBooking.getBookingDate())) {
                return ResponseEntity
                        .status(409)
                        .body("La chambre n'est plus disponible pour cette date.");
            }
        }
        bookings.add(newBooking);
        return ResponseEntity.status(200).body(bookings);
    }
}