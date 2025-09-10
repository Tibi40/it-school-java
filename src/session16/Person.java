package session16;

public class Person {

    private String name;

    //Pentru ca metodele sunt private, nu le putem accesa decat din interiorul claselor
    //=> avem nevoie de gettere si setter ca sa le accesam

    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {

        /*this.name = tageteaza name =>
        * daca de aspura este scris anem = o sa lucrez cu name */
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void performDuties() {
        System.out.println("this person perform some default duties");
    }

}
