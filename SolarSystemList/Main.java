import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CelestialBody> solarSystem = new ArrayList<>();
        // Add celestial bodies to the list
        solarSystem.add(new CelestialBody("Sun", 1.989e30, 1.392e6));
        solarSystem.add(new Planet("Mercury", 3.301e23, 4879, "Terrestrial", 0));
        solarSystem.add(new Planet("Venus", 4.867e24, 12104, "Terrestrial", 0));
        solarSystem.add(new Planet("Earth", 5.972e24, 12742, "Terrestrial", 1));
        solarSystem.add(new Planet("Mars", 6.417e23, 6779, "Terrestrial", 2));
        solarSystem.add(new GasGiant("Jupiter", 1.898e27, 139822, 95, true));
        solarSystem.add(new GasGiant("Saturn", 5.683e26, 116464, 82, true));
        solarSystem.add(new GasGiant("Uranus", 8.681e25, 50724, 27, true));
        solarSystem.add(new GasGiant("Neptune", 1.024e26, 49244, 14, true));

        // Display information for each celestial body
        for (CelestialBody eachBody : solarSystem) {
            eachBody.displayInfo();
            System.out.println("--------------------");
        }
    }
}