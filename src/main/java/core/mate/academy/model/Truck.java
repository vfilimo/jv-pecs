package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private static final String SEPARATOR = " ";
    private int power;

    public Truck(String name, String color, int power) {
        setColor(color);
        setName(name);
        this.power = power;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck" + SEPARATOR + getName() + SEPARATOR
                + getColor() + SEPARATOR + power
                + SEPARATOR + "started to work");
    }
}
