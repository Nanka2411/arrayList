import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaration of the tye of the data type the arraylist is.
        ArrayList<String> names = new ArrayList<>();

        //names.add is used to add the name .
        names.add("Lux");
        names.add("Anex");
        names.add("Sma");
        names.add("Nanka");
        names.add("Anitha");
        names.add("Ruth");
        names.add("Matt");

        //names.set is used to replace a name within the array list.
        names.set(2,"Nelisiwe");
        names.set(4,"Jack");

        //names.remove is used to remove a name within the array list.
        names.remove("Lux");
        names.remove("Matt");

        System.out.println(names);



        }
    }
