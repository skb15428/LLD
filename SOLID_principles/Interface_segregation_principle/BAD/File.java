package SOLID_principles.Interface_segregation_principle.BAD;

public class File implements Connection {

    // This method is not required to be implemented in this file
    @Override
    public void openDatabase() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openDatabase'");
    }

    @Override
    public void openFile() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

}
