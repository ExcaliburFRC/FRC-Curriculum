package inheritance.shapes;

public class Rectangle implements Shape {
  private double height;
  private double length;

  public Rectangle (double height, double length) {
    this.height = height;
    this.length = length;
  }

  @Override
  public double area() {
    return height * length;
  }

  @Override
  public double perimeter() {
    return 2 * (height + length);
  }
}
