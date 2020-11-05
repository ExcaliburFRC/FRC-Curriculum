package inheritance.shapes;

public class Rectangle implements Shape {
  protected double height;
  private double length;

  public Rectangle (double height, double length) {
    this.height = height;
    this.length = length;
  }

  @Override
  public boolean equals (Object obj) {
    if (!(obj instanceof Rectangle)) {
      return false;
    }
    Rectangle other = (Rectangle) obj;
    return (other.height == this.height) && (other.length == this.length);
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
