// Subclass for planets
class Planet extends CelestialBody {
    private String type; //e.g., "Terrestrial", "Gas Giant"
    private int numberOfMoons;

    public Planet(String name, double mass, double diameter, String type, int numberOfMoons) {
        super(name, mass, diameter);
        this.type = type;
        this.numberOfMoons = numberOfMoons;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
        System.out.println("Number of Moons: " + numberOfMoons);
    }
}