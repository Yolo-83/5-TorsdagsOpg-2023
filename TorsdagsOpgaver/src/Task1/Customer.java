package Task1;


import javax.naming.Name;

// 1.a- Klassen med attributterne (instansvariablene)
public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    private String name;


    // 1.b- Konstruktør med kundens navn og brugernavn som parametre.
    public Customer (String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        name = this.firstName + this.lastName;
    }


    public String getname(){
        return name;
    }
    public String getUserName(){
        return this.userName;
    }
    public String toString() {
        return "Name: " + getname() + ".   User Name: " + getUserName() + ".";
    }

}


