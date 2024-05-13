package managers.dbLogic;

import Collections.Vehicle;

import java.util.HashSet;

public interface DBmanager {
    HashSet<Vehicle> getCollectionFromDB();

    void writeCollectionToDB();
}
