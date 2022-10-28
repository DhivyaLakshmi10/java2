"""Iterator class
It is time to explore some unique classes and methods in Collections. The Iterator class is one such. You have created test d ata for Stall class
with the name of stall starting with prefix 'test', It's time to remove those objects. While iterating a collection through a for loop or a for each
loop, you cannot modify or remove an element. The Iterator class facilitates such functionalities. Hence while you iterate through a Collection
using Iterator you can modify the elements. Let's implement it to delete test data.
Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names and method
names should be the same as specified in the problem statement.
Create a class Stall with the following private attributes.
Attributes Datatype
name String
detail String
type String
ownerName String

Include getters and setters.
Create a default and Parameterized constructors.
Format for the parameterized constructor is Stall(String name, String detail, String type, String ownerName)
Create a driver class called Main. In the Main method, obtain stall input from the user and create a list of Stall details. Using the Iterator class
iterate through the List and remove stalls with a name starting with 'test'.
Display the list of details in tabular form."""




import java.lang.*;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Stall> stalls = new ArrayList<>();
        System.out.println("Enter the number of stalls: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the details for the stall: ");
            String[] input=sc.nextLine().split(",");
            stalls.add(new Stall(input[0], input[1], input[2], input[3]));
        }
        System.out.println("BEFORE REMOVAL OF TEST DATA: " + stalls);
        Iterator<Stall> stallIterator= stalls.iterator();
        while(stallIterator.hasNext()) {
            Stall newS = stallIterator.next();
            if (newS.getName().startsWith("test")) {
                stallIterator.remove();
            }
        }
        System.out.println("AFTER REMOVAL OF TEST DATA: " + stalls);
        System.exit(0);
    }
}

class Stall {
    private String name, detail, type, ownerName;

    public Stall() {
    }

    public Stall(String name, String detail, String type, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Stall{" +
                "name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
