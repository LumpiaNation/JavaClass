public class Vehicle
{
    private Person owner = new Person();
    private String manufactName;
    private int numberCyl;

    public String toString()
    {
        return "Owner " + owner + "of Vehicle: " + manufactName +
        " that has " + numberCyl + "Cylinders."; 
    }
    public Vehicle (Person owner, String manufactName, int numberCyl)
    {
        super();
        this.owner = owner;
        this.manufactName = manufactName;
        this.numberCyl = numberCyl;
    }
    public String fetchManuName()
    {
        return manufactName;
    }
    public void setManuName(String manufactName)
    {
        this.manufactName = manufactName;
    }
    public int fetchnumberCyl()
    {
        return numberCyl;
    }
    public setnumberCyl(int numberCyl)
    {
        this.numberCyl = numberCyl;
    }
    public Person fetchOwner()
    {
        return owner;
    }
    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
    
}