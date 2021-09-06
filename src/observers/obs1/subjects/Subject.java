package observers.obs1.subjects;

import observers.obs1.observes.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observerList;
    private int state;

    public Subject() {
        observerList = new ArrayList<>();
    }

    public void setObserver(Observer ob) {
        this.observerList.add(ob);
    }

    public void notificarObservadores() {
        observerList.forEach(Observer::update);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notificarObservadores();
    }
}
