package LabExamples.SOLID.violated.LSP;

/**
 * Square class extends Rectangle, but violates LSP as it changes the behavior expected from a Rectangle.
 */
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Not expected for a rectangle.
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Not expected for a rectangle.
        super.setHeight(height);
    }
}
