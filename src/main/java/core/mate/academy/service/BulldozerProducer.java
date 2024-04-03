package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Kolia", "Green", true));
        bulldozers.add(new Bulldozer("Petia", "Blue", false));
        bulldozers.add(new Bulldozer("Kotik", "White", false));
        return bulldozers;
    }
}
