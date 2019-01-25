package fanis.koustoulas.app.estia;

public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private int room;
    
    public User(int ID, String FirstName, String LastName, int Age)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.room = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return room;
    }
}
