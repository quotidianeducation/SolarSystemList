// Base class for celestial bodies
class CelestialBody {
    private String name;
    private double mass; // In kilograms
    private double diameter; // In kilometers

    public CelestialBody(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }


    public String toString() {
        return "CelestialBody{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", diameter=" + diameter +
                '}';
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Diameter: " + diameter + " km");

    }
}