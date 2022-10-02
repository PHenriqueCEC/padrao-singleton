package gymSingleton;

public class GymOwner {

    private String gymOwnerName;
    private String gymName;
    private String gymAddress;
    private GymOwner(){};

    private static GymOwner instace = new GymOwner();
    public static GymOwner getInstance(){
        return instace;
    }

    public String getGymOwnerName() { return gymOwnerName; }
    public void setGymOwnerName(String gymOwnerName) { this.gymOwnerName = gymOwnerName; }

    public String getGymName () { return gymName; }
    public void setGymName(String gymName) { this.gymName = gymName; }

    public String getGymAddress() { return gymAddress; }
    public void setGymAddress(String gymAddress) { this.gymAddress = gymAddress;}







}
