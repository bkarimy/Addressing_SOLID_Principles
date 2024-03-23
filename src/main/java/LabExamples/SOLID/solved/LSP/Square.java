package LabExamples.SOLID.solved.LSP;

/**
 * Square class adheres to the Shape interface and provides its definition of getArea, independent of Rectangle.
 */
public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
