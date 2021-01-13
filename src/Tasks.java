import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    String name;
    int prioritat;
    String notizen;
    List<Tasks> teilAufgaben;

    public Tasks(String name, int prioritat, String notizen, List<Tasks> teilAufgaben){
        this.name = name;
        this.prioritat = prioritat;
        this.notizen = notizen;
        this.teilAufgaben = teilAufgaben;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrioritat() {
        return prioritat;
    }

    public void setPrioritat(int prioritat) {
        this.prioritat = prioritat;
    }

    public String getNotizen() {
        return notizen;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

    public List<Tasks> getTeilAufgaben() {
        return teilAufgaben;
    }

    public void setTeilAufgaben(List<Tasks> teilAufgaben) {
        this.teilAufgaben = teilAufgaben;
    }

    public void add(List<Tasks> tasks, Tasks task){
        tasks.add(task);
    }

    public void delete(List<Tasks> tasks, Tasks task){
        for(Tasks aufg : tasks){
            if(task == aufg){
                aufg.delete(tasks, task);
            }
        }
    }
}
