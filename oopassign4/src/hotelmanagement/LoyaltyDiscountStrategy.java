package hotelmanagement;

public class LoyaltyDiscountStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(RoomBooking booking) {
        // Discount logic for loyal customers
        return booking.getBasePrice() * (booking.isLoyalCustomer() ? 0.8 : 1.0);
    }
}
