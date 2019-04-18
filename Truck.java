public class Truck extends Vehicle
{
    private double tonLoad;
    private int lbsTow;

    public Truck(Person owner, String manufactName, int numberCCyl, int tonLoad, int lbsTow)
    {
        super(owner, manufactName, numberCyl);
        setLoad(tonLoad);
        setLbs(lbsTow);
    }
    public double fetchtonLoad()
    {
        return lbsTow;
    }
    public void assigntonLoad(double tonLoad)
    {
        this.tonLoad = tonLoad;
    }
    public int fetchlbsTow()
    {
        return lbsTow;
    }
    public void assignlbsTow(int lbsTow)
    {
        this.lbsTow = lbsTow;
    }
    public String toString()
    {
        return "Truck Capacity Load(Tons): " + tonLoad + "\nTruck Capacity Load(Lbs): " + 
        lbsTow +
    }
}