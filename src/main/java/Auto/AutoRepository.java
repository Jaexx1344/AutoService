package Auto;

import Menu.Menu;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoRepository {

    Scanner scanner = new Scanner(System.in);
    private List<Auto> autoList = new ArrayList<>();

     void addNewCar(String mark, String model, int year) throws FileNotFoundException {
        Auto auto = new Auto(mark,model, year);
        this.autoList.add(auto);
        System.out.println("Dodałem nowe auto o marce : " + mark);



    }


     void saveAutos() throws IOException {
         Gson gson = new Gson();
        FileWriter pw = new FileWriter("./autoList.json");
        gson.toJson(this.autoList, pw);
        pw.flush();
        pw.close();
    }


     void loadAutos () throws IOException, InterruptedException {
        Gson gson = new Gson();
        FileReader fr = new FileReader("./autoList.json");
        List<Auto> loadedAutos = gson.fromJson(fr, new TypeToken<List<Auto>>(){}.getType());
        this.autoList.addAll(loadedAutos);
        this.autoList.forEach(auto ->{
            System.out.println("Załadowałem auto: "+auto.getMark());
                }
                );
        System.out.println("Kliknij 1 aby cofnąć : ");
        System.out.println("Kliknij 2 aby edytować auto: ");
         int key=0;
         key = Integer.parseInt(scanner.nextLine());

         if(key==1) {

             System.out.println("Cofam do menu");
             Thread.sleep(500);
         }
    }
}
