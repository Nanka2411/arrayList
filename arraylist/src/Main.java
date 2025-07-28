import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        names.add("Lux");
        names.add("Anex");
        names.add("Sma");
        names.add("Nanka");
        names.add("Anitha");
        names.add("Ruth");
        names.add("Matt");
        names.set(2,"Nelisiwe");
        names.set(4,"Jack");
        names.remove("Lux");
        names.remove("Matt");

        System.out.println(names);



        }
    }
