package SOLID_principles.Interface_segregation_principle.BAD;

public class Database implements Connection {

    @Override
    public void openDatabase() {

    }

    // This method is not required to be implemented in this file
    @Override
    public void openFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openFile'");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

}
