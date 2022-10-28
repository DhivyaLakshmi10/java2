"""sort() a List of Objects
Write a program to take hall objects as input in the list and sort them in the order of their costPerDay using sort() method of the comparable
interface. Then display them in tabular form.
Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names,attribute names
and method names should be the same as specified in the problem statement.
Create a class Hall with the following private attributes,
Attribute Data type
name String
contactNumber String
costPerDay Double
ownerName String
Include appropriate getter/setter, default and parameterized constructor.
Override toString() and print the details in a tabular format. And implement comparable interface in the class.
Create driver class Main and use the main method to get inputs, sort, and display.
"""



import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hall> halls = new ArrayList<>();
        System.out.println("Enter the number of halls: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for the hall: ");
            String[] input = sc.nextLine().split(",");
            halls.add(new Hall(input[0], input[1], input[2], input[3]));
        }
        sc.close();
        System.out.println("BEFORE SORTING OF HALLS: " + halls);
        Collections.sort(halls);
        System.out.println("AFTER SORTING OF HALLS: " + halls);
        System.exit(0);
    }
}

class Hall implements Comparable {
    private String name, contactNumber, ownerName;
    private Double costPerDay;

    public Hall() {
    }

    public Hall(String name, String contactNumber, String costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = Double.valueOf(costPerDay);
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setDetail(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setType(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public int compareTo(Object o) {
        Hall h = (Hall) o;
        return (int) (this.getCostPerDay() - h.getCostPerDay());
    }

    @Override
    public String toString() {
        return "Hall{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", costPerDay=" + costPerDay +
                '}';
    }
}
