package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Horse", "blue", 70));
        trucks.add(new Truck("Cat", "green", 20));
        trucks.add(new Truck("Woolf", "white", 1));
        return trucks;
    }

}
