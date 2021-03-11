package comm.example;

public class Person {
    private String personId;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String personId, String firstName, String lastName, String email) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String displayDetails()
    {
        return "ID: "+personId+" First Name: "+firstName
                +" Last Name "
                +lastName+" Email: "
                +email;
    }
}
