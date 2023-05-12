package Auto;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoService {

    private AutoRepository autoRepository = new AutoRepository();
    public void addNewCar(String mark, String model, int year) throws FileNotFoundException {

         this.autoRepository.addNewCar(mark,model,year);

    }

    public void saveAutos() throws IOException {
        this.autoRepository.saveAutos();
    }

    public void readAutos() throws IOException, InterruptedException {
        this.autoRepository.loadAutos();
    }
}
