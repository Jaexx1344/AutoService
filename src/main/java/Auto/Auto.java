package Auto;

public class Auto {
    private String mark;
    private String model;

    private int year;



    Auto (String mark, String model, int year)
    {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public String getMark(){
        return this.mark;
    }
}
