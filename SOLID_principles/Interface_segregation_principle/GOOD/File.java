package SOLID_principles.Interface_segregation_principle.GOOD;

public class File implements FileConnection, RecordOperation {

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }

}
