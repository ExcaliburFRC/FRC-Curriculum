package inheritance.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object obj = new Circle(3);

    System.out.println(new Rectangle(2, 2).equals(new Square(2)));

    Rectangle s = new Square(2);
    s.area();
    List<Shape> myShapes = new ArrayList<>();
    myShapes.add(new Circle(10.0));
    myShapes.add(new Rectangle(3, 5));
    myShapes.add(new Square(5));

    Square sq = new Square(4);
    sq.x();
    Rectangle stillSq = sq;
//    stillSq.x();

    if (stillSq instanceof Square) {
      Square iAmASquare = (Square) stillSq;
      iAmASquare.x();
    }

    myShapes.forEach(
            shape ->
                    System.out.println("I am a " + shape.getClass().getSimpleName() + " and I have a perimeter of "
                                       + shape.perimeter() + " and an area of " + shape.area() + ".")
    );

    Shape myShape = myShapes.get(2);
    myShape.area();
    myShape.perimeter();
  }
}
