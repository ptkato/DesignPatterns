import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> fas;

    public Subject() {
        this.fas = new ArrayList<Observer>();
    }

    public void aceitarFa(Observer o) {
        fas.add(o);
    }
    public void deletarFa(int i) {
        fas.remove(i);
    }

    public void notificar() {
        for(Observer fa : fas) {
            fa.update(this);
        }
    }

    public abstract String getFofoca();
}
