package observers.obs1;

import observers.obs1.concretes.ConcretaObserve1;
import observers.obs1.concretes.ConcretaObserve2;
import observers.obs1.concretes.ConcretaObserve3;
import observers.obs1.subjects.Subject;

public class ContextObserver {

    public ContextObserver() {
        System.out.println("");
        System.out.println("----------------- Observable --------------------");
        Subject msg  = new Subject();

        new ConcretaObserve1(msg);
        new ConcretaObserve2(msg);
        new ConcretaObserve3(msg);

        System.out.println("Mensagem enviada...");
        msg.setState(15);
        System.out.println("Mensagem enviada...");
        msg.setState(17);
    }
}
