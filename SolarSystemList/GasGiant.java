// Subclass for gas giants (special type of planet)
class GasGiant extends Planet {
    private boolean hasRings;

    public GasGiant(String name, double mass, double diameter, int numberOfMoons, boolean hasRings) {
        super(name, mass, diameter, "Gas Giant", numberOfMoons);
        this.hasRings = hasRings;
    }

    public boolean hasRings() {
        return hasRings;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (hasRings) {
            System.out.println("Has Rings: Yes");
        } else {
            System.out.println("Has Rings: No");
        }
    }

}