package main.java;

/**
 * This is an interface representing a makeup product.
 */
public interface MakeupProductInterface {
    // Constants
    String BRAND = "MyMakeupBrand";

    /**
     * Get the name of the makeup product.
     *
     * @return The name of the product.
     */
    String getName();

    /**
     * Get the price of the makeup product.
     *
     * @return The price of the product.
     */
    String getColour();

    /**
     * Apply the makeup product.
     */
    void apply() throws MakeupException;

    /**
     * Check if the makeup product is suitable for a specific skin type.
     *
     * @param skinType The skin type to check.
     * @return True if the product is suitable, false otherwise.
     */
    boolean isSuitableFor(String skinType);

    // Static method
    static void showBrandInfo() {
        System.out.println("Brand: " + BRAND);
    }

    /**
     * This is a nested interface representing a makeup remover.
     */
    interface MakeupRemover {
        void removeMakeup();
    }



    /**
     * This is a nested enum representing different types of makeup products.
     */
    enum MakeupType {
        FOUNDATION,
        LIPSTICK,
        EYELINER,
        EYESHADOW,
        MASCARA
    }
}