package src.odyssey.java.practices.object_oriented_programming.abstraction;

public class DemoMain {
    public static void main(String[] args) {
        PyramidSpaceShip pyramidSpaceShip = new PyramidSpaceShip();
        RoundSpaceShip roundSpaceShip = new RoundSpaceShip();

//        pyramidSpaceShip.avoidAsteroids();
//        pyramidSpaceShip.landOnPlanet("Mars");
//        pyramidSpaceShip.takeOffFromPlanet();
        pyramidSpaceShip.shoot();
        pyramidSpaceShip.reload();
        pyramidSpaceShip.safetyIsOn();

//        roundSpaceShip.landOnPlanet("Pluto");
//        roundSpaceShip.takeOffFromPlanet();
//        roundSpaceShip.loadInToCargoSpace("Tomato");
//        String s = roundSpaceShip.unloadStuff();
//        System.out.println("We got " + s + " unloaded .. ! ! !");
        roundSpaceShip.shoot();
        roundSpaceShip.reload();
        roundSpaceShip.safetyIsOn();

    }


}
