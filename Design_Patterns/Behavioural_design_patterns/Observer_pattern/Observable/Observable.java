package Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable;

import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer.Observer;

public interface Observable {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    Data getData();
    void setData(Data data);
}
