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
    
    public boolean equals(Object obj)
    {
        if(this == obj)
        return true;
        if(obj == null)
        return false;
        if(!(obj instanceof Vehicle))
        return false;
        Vehicle other = (Vehicle) obj;
        if(manufactName == null)
        {
            if(other.manufactName != null)
            return false;
        }
        else if (!manufactName.equals(other.manufactName))
        return false;
        if(numberCyl != other.numberCyl)
        return false;
        if(owner == null)
        {
            if(other.owner != null)
            return false;
        }
        else if(!owner.equals(other.owner))
        return false;
        return true;
    }
}