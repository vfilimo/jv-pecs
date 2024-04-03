package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Puma", "blue",45));
        excavators.add(new Excavator("Adidas", "green",12));
        excavators.add(new Excavator("Nike", "white",15));
        return excavators;
    }
}
