import java.util.Scanner;
class hospital 
{
    String hospitalName;
    String place;
    hospital(String name, String place) {
        this.hospitalName = name;
        this.place = place;
    }

    void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Place: " + place);
    }
}


class staff extends hospital {
    int id;
    String position;

    
    staff(String name, String place, int id, String position) {
        super(name, place);
        this.id = id;
        this.position = position;
    }

    void displayStaff() {
        System.out.println("ID: " + id);
        System.out.println("Position: " + position);
    }
}

public class demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hospital Name:");
        String name = sc.nextLine();

        System.out.println("Enter Place:");
        String place = sc.nextLine();

        System.out.println("Enter Staff ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Position:");
        String position = sc.nextLine();
        
        staff s = new staff(name, place, id, position);
        System.out.println("STAFF DETAILS");
        s.displayHospital();
        s.displayStaff();
    }
}
