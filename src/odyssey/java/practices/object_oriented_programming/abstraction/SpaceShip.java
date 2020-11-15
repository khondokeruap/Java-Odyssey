package src.odyssey.java.practices.object_oriented_programming.abstraction;

public abstract class SpaceShip {
    String planet;

    public abstract String name();

    public void landOnPlanet(String planet){
        this.planet = planet;
        System.out.println("The SpaceShip " + name() + "landed on the planet " + planet);
        }
    public void takeOffFromPlanet() {
        if (planet == null)
           throw new IllegalStateException("We are currently in Space");
           planet = null;
           System.out.println("We just took off into the Space");
        }
}
