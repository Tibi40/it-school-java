package session16;

public class Patient extends Person {
    private String illness;

    public Patient(String name, String id, String illness) {
        super(name, id);
        this.illness = illness;
    }

    public String getillness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

}
