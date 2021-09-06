package observers.obs1.observes;

import observers.obs1.subjects.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
