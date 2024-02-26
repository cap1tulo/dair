package hotelmanagement;

public class SeasonalPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(RoomBooking booking) {
        // Simplistic seasonal pricing logic
        return booking.getBasePrice() * (booking.isHighSeason() ? 1.2 : 1.0);
    }
}
