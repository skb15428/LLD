package SOLID_principles.Interface_segregation_principle.GOOD;

public class Database implements DbConnection, RecordOperation {

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openDatabase() {

    }

}
