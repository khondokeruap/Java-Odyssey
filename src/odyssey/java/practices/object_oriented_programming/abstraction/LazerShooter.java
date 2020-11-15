package src.odyssey.java.practices.object_oriented_programming.abstraction;

public interface LazerShooter {

    default String shoot(){
        System.out.println("Phew bang bang .....");
        return "Phew bang bang .....";
    }

    default void  reload(){
        System.out.println("Reloading lazer guns...");
    }
    default void safetyIsOn(){
        System.out.println("The safety is on...");
    }
}
