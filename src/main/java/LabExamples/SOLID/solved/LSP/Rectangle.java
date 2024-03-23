package LabExamples.SOLID.solved.LSP;

/**
 * Rectangle class adheres to the Shape interface without enforcing constraints that are specific to other shapes like Square.
 */
public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
