package Menu;

import Auto.AutoService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    AutoService autoService = new AutoService();
    Scanner scanner = new Scanner(System.in);
    String model;
    String mark;
    public void start() throws IOException, InterruptedException {
        int in=-1;


        while(in!=0){
            System.out.println("Witaj");
            System.out.println("Wybierz co chciałbyś zrobić");

            System.out.println("1- Dodaj nowe auto");
            System.out.println("2- Sprawdz auta");
            System.out.println("0- Wyjdz");
            in = scanner.nextInt();
            switch (in) {
                case 1 :
                    this.addNewCar(scanner);
                    break;
                case 2 :
                    this.showAutos();
                    break;


                case 0:
                    System.out.println("Zapisuje dane :");
                    this.autoService.saveAutos();
                    System.out.println("Kończę");
                    break;
            }
        }


    }

    private void showAutos() throws IOException, InterruptedException {
        autoService.readAutos();
    }

    private void addNewCar(Scanner scanner) throws FileNotFoundException {
        System.out.println("Podaj marke auta: ");
        String mark = scanner.nextLine();

        System.out.println("Podaj model Auta: ");
        String model = scanner.nextLine();

        System.out.println("Podaj rok auta: ");
        int year = Integer.parseInt(scanner.nextLine());

        autoService.addNewCar(mark,model,year);
    }
}
