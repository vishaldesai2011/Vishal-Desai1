package problem;


public class Planet {
    private String name;
    private double distance,gravity;

    public Planet(String name, double distance, double gravity) {
        this.name = name;
        this.distance = distance;
        this.gravity = gravity;
    }

    @Override
    public String toString() {
        return name + ": " + distance + " million km\nGravity: " + gravity ;
    }

    public static void main(String[] args) {
        Planet p1 = new Planet("Earth", 149.6, 1.0);
        Planet p2 = new Planet("Mars", 227.9, 0.38);

        System.out.println(p1);
        System.out.println(p2);
    }
   
}