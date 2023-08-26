package shapes.quadrilateral;

public class Quadrilateral {
    String name = "Четырехугольник";
    String properties = "";
    int numbersOfAngles = 4;


    public void showInfo() {
        System.out.println("Это " + name + "; Количество углов: " + numbersOfAngles + "; " + properties);
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfAngles() {
        return numbersOfAngles;
    }
}

