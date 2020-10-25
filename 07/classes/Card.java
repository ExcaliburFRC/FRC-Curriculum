package classes;

import java.util.*;

public class Card {
  public final int rank;
  public final Shape shape;

  public Card(int rank, Shape shape) {
    if(rank < 1 || rank > 13) throw new IllegalArgumentException("rank is out of bounds");
    this.rank = rank;

    this.shape = shape;
  }

  public String toString() {
    return String.format("%s : %d", shape.toString(), rank);
  }

  public enum Shape {
    SPADE,
    HEART,
    CLUB,
    DIAMOND;
  }

  public boolean isStronger(Card other) {
    if (this.rank < other.rank) {
      return false;
    }
    if (this.rank > other.rank) {
      return true;
    }
    return this.shape.compareTo(other.shape) > 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Card)) return false;
    Card other = ((Card) obj);
    return (this.rank == other.rank) && (this.shape == other.shape);
  }

  public static Card getRandomCard() {
    Random r1 = new Random();
    int rank = r1.nextInt(13);
    int shapeIndex = r1.nextInt(4);
    return new Card(rank, Shape.values()[shapeIndex-1]);
  }


  public static void main(String[] args) {
    Set<Card> cards = new HashSet<>(10); // a set is an unordered collection without duplicates
    while (cards.size() < 10) { // add until we have 10 unique items
      cards.add(Card.getRandomCard());
    }
    /// print all items in 3 different ways
    cards.forEach(card -> System.out.println(card)); // lambda
    cards.forEach(System.out::println); // method ref
    for (Card card : cards) { // for-each loop
      System.out.println(card);
    }
  }
}

