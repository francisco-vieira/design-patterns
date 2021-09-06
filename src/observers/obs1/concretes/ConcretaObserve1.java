package observers.obs1.concretes;

import observers.obs1.observes.Observer;
import observers.obs1.subjects.Subject;

public class ConcretaObserve1 extends Observer {

    public ConcretaObserve1(Subject subject) {
        this.subject = subject;
        this.subject.setObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Mensagem enviada para Observador 1 :".concat(String.valueOf(subject.getState())));
    }
}
