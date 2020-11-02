package inheritance.shapes;

public class Square extends Rectangle {
  public Square(double side) {
    super(side, side);
  }

  public int x() { return 0;}
}
