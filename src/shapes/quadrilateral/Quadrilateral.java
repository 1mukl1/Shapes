package shapes.quadrilateral;

public class Quadrilateral {
    String name;
    private int numbersOfAngles = 4;

    public void ShowInfo(){
        System.out.println("Это " + name + " Количество углов: " + numbersOfAngles);
    }

    public class ConvexQuadrilateral extends Quadrilateral{

    }

    public class Parallelogram extends Quadrilateral{

    }

    public class Rectangle extends Quadrilateral{

    }

    public class Square extends Quadrilateral{

    }

    public class Rhombus extends Quadrilateral{

    }

    public class Trapeze extends Quadrilateral{

    }

}
