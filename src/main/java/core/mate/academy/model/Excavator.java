package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private static final String SEPARATOR = " ";
    private int bucketVolume;

    public Excavator(String name, String color, int bucketVolume) {
        setName(name);
        setColor(color);
        this.bucketVolume = bucketVolume;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator" + SEPARATOR + getName() + SEPARATOR
                + getColor() + SEPARATOR + bucketVolume
                + SEPARATOR + "started to work");
    }
}
