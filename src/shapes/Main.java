package shapes;

import shapes.quadrilateral.*;
import shapes.triangle.EquilateralTriangle;
import shapes.triangle.IsoscelesTriangle;
import shapes.triangle.RightTriangle;
import shapes.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        tr.showInfo();
        RightTriangle rt = new RightTriangle();
        rt.showInfo();
        IsoscelesTriangle it = new IsoscelesTriangle();
        it.showInfo();
        EquilateralTriangle et = new EquilateralTriangle();
        et.showInfo();
        Quadrilateral qr = new Quadrilateral();
        qr.showInfo();
        ConvexQuadrilateral cq = new ConvexQuadrilateral();
        cq.showInfo();
        Parallelogram pg = new Parallelogram();
        pg.showInfo();
        Rectangle rec = new Rectangle();
        rec.showInfo();
        Rhombus rh = new Rhombus();
        rh.showInfo();
        Square sq = new Square();
        sq.showInfo();
        Trapeze trz = new Trapeze();
        trz.showInfo();
        Circle crc = new Circle();
        crc.showInfo();
        Hexagon hex = new Hexagon();
        hex.showInfo();
        Oval ov = new Oval();
        ov.showInfo();
        Pentagon pen = new Pentagon();
        pen.showInfo();
    }
}
