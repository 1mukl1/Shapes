package shapes.triangle;

public class Triangle {
    public String name = "Треугольник";
    public String properties = "";
    public int numbersOfAngles = 3;

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

