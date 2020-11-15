package src.odyssey.java.practices.object_oriented_programming.abstraction;

public class RoundSpaceShip extends SpaceShip implements LazerShooter, Transport  {
    private String stuff = "";
    @Override
    public String name() {
        return "Round and smooth ";
    }

    @Override
    public String shoot() {
       System.out.println("We are shooting");
        return "phewww";
    }

    @Override
    public void reload() {
        System.out.println("Reloading....");

    }

    @Override
    public void loadInToCargoSpace(String stuff) {
    this.stuff = stuff;
        System.out.println("Loading stuff " + stuff);
    }

    @Override
    public String unloadStuff() {
        String localvar = stuff;
        stuff = "";
        System.out.println("Unloading stuff: " + localvar);
        return localvar;
    }
}
