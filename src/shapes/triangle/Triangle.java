package shapes.triangle;

public class Triangle {
    String name;
    private int numbersOfAngles = 3;

    public void ShowInfo(){
        System.out.println("Это " + name + "Количество углов: " + numbersOfAngles);
    }

    public class IsoscelesTriangle extends Triangle{

    }

    public class EquilateralTriangle extends Triangle{

    }

    public class RightTriangle extends Triangle{
        
    }

}
