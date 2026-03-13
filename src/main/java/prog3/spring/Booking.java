package prog3.spring;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class Booking {
    private String clientName;
    private String phoneNumber;
    private String email;
    private int roomNumber;
    private String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate bookingDate;
    public Booking() {
    }
    public Booking(String clientName, String phoneNumber, String email, int roomNumber, String description, LocalDate bookingDate) {
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.roomNumber = roomNumber;
        this.description = description;
        this.bookingDate = bookingDate;
    }


    public String getClientName() { return clientName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public int getRoomNumber() { return roomNumber; }
    public String getDescription() { return description; }
    public LocalDate getBookingDate() { return bookingDate; }


    public void setClientName(String clientName) { this.clientName = clientName; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public void setDescription(String description) { this.description = description; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }
}