package main.java;

/**
 * This class represents a specific makeup product, such as lipstick.
 */
final class Lipstick extends MakeupProduct {
    private final String colour;

    /**
     * Constructor to create a lipstick object.
     *
     * @param brand The brand of the lipstick.
     * @param name  The name of the lipstick.
     */
    Lipstick(String brand, String name, String colour) {
        super(brand, name, MakeupType.LIPSTICK);
        this.colour = colour;
    }

    @Override
    public void apply() throws MakeupException {
        System.out.println("Applying " + brand + " " + name + " lipstick in " + colour + " colour.");
        if (Math.random() < 0.5) {
            throw new MakeupException("Lipstick application failed.");
        }
    }

    @Override
    public boolean isSuitableFor(String skinType) {
        // Lipstick is suitable for all skin types except sensitive skin
        return !SkinType.SENSITIVE.toString().equals(skinType);
    }

    @Override
    public String getColour() {
        return colour;
    }

    // Private method (Java 9+)
    private void logApplication(String skinType) {
        System.out.println("Applied " + getName() + " on " + skinType + " skin.");
    }

    /**
     * This is a nested class representing a lipstick remover.
     */
    public class LipstickRemover implements MakeupProduct.MakeupRemover {
        @Override
        public void removeMakeup() {
            System.out.println("Removing lipstick with a makeup remover.");
        }
    }
}