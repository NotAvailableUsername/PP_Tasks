import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Tasks Tasks;
        List<Tasks> tasksList;
        System.out.println("Ce vreti sa faceti -->");
        System.out.println("1 - hinzufugen");
        System.out.println("2 - loshcen");
        System.out.println("3 - andern");

        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        switch (opt){
            case "1" ->{Tasks task1; tasksList.add(task1);};
            case "2" -> {Tasks task1; Tasks.delete(tasksList, task1);}
        }

    }
}
