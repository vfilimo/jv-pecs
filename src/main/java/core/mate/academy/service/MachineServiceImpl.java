package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        ArrayList<Machine> machines = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            machines.addAll(new BulldozerProducer().get());
        } else if (type.equals(Truck.class)) {
            machines.addAll(new TruckProducer().get());
        } else if (type.equals(Excavator.class)) {
            machines.addAll(new ExcavatorProducer().get());
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
