import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: "+name+"  ID: "+id;
    }
}
