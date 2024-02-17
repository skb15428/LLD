package SOLID_principles.Interface_segregation_principle.BAD;

public interface Connection {
    public void openDatabase();

    public void openFile();

    public void createRecord();

    public void deleteRecord();
}
