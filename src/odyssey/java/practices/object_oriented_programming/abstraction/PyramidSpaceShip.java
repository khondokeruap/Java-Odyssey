package src.odyssey.java.practices.object_oriented_programming.abstraction;

public class PyramidSpaceShip extends SpaceShip implements LazerShooter {

    @Override
    public String name() {
        return "Amazing pyramid ";
    }
    public void avoidAsteroids(){
        System.out.println("Avoiding asteroids!");
    }
}
