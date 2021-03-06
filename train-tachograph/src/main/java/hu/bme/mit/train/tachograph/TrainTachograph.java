package hu.bme.mit.train.tachograph;
import java.time.LocalDate;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TrainTachograph {
    private Table<LocalDate, Integer, Integer> recordTable = HashBasedTable.create();

    public void put(LocalDate date, int joystickPosition, int referenceSpeed) {
        recordTable.put(date, joystickPosition, referenceSpeed);
    }

    public boolean hasElements(){
        return !recordTable.isEmpty();
    }
}
