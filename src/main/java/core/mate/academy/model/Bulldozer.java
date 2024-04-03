package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static final String SEPARATOR = " ";
    private boolean onCaterpillar;

    public Bulldozer(String name, String color, boolean onCaterpillar) {
        setName(name);
        setColor(color);
        this.onCaterpillar = onCaterpillar;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer" + SEPARATOR + getName() + SEPARATOR
                + getColor() + SEPARATOR + "isOnCaterpillar" + SEPARATOR + onCaterpillar
                + SEPARATOR + "started to work");
    }
}
