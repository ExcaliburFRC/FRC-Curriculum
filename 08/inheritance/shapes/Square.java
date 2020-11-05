package inheritance.shapes;

public class Square extends Rectangle {
  public Square(double side) {
    super(side, side);
  }

  @Override
  public double area() {
    return height * height;
  }

  public int x() { return 0;}
}
