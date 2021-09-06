package observers.obs1.concretes;

import observers.obs1.observes.Observer;
import observers.obs1.subjects.Subject;

public class ConcretaObserve3 extends Observer {

    public ConcretaObserve3(Subject subject) {
        this.subject = subject;
        this.subject.setObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Mensagem enviada para Observador 3 :".concat(String.valueOf(subject.getState())));
    }
}
