// Interface
interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

// Class implementing the interface
class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        // Check length using static method
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }

        // Example validation:
        // Coupon must start with "SAVE"
        return code.startsWith("SAVE");
    }
}

// Main class
public class OnlineCouponValidator {
    public static void main(String[] args) {

        // Array of coupon codes
        String[] coupons = {
            "SAVE10",
            "DISC20",
            "SAVE50",
            "AB",
            "SAVE1000"
        };

        ShoppingCart cart = new ShoppingCart();

        // Validate each coupon
        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " : Valid Coupon");
            } else {
                System.out.println(coupon + " : Invalid Coupon");
            }
        }
    }
}