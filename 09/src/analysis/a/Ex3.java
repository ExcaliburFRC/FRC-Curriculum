package analysis.a;

import java.util.*;

public class Ex3 {
  /**
   * Pushes the list down from a certain index, inserting an object at that index
   */
  private static <T> void pushbackInsert(List<T> list, T object, int insertIndex) {
    for (int i = list.size() - 1; i >= insertIndex; i--) {
      //for each i, move list[i] to list[i+1]
      list.set(i + 1, list.get(i));
    }
    //put the value to insert in the "hole" left after pushback
    list.set(insertIndex, object);
  }

  /**
   * Goes down an ordered list, and inserts the object into its ordered place
   */
  private static <T> void compareInsert(Comparator<T> comparator, List<T> list, T object) {
    for (int i = 0; i < list.size(); i++) {
      //if object > other, than object should be before other
      if (comparator.compare(object, list.get(i)) > 0) {
        //insert in correct place while pushing down everything else
        pushbackInsert(list, object, i);
        return;//after inserting, the function finished its job - we can exit
      }
    }
    //if we reached the end of the list and didn't insert yet, then add at the end of the list
    list.add(object);
  }


  /**
   * Transforms a Set to a List ordered by the given comparator
   */
  public static <T> List<T> setToOrderedList(Comparator<T> comparator, Set<T> set) {
    List<T> list = new ArrayList<>(set.size());
    boolean isFirst = true;
    for (T object : set) {
      //add the first item without fussing, there is nothing to compare to
      if (isFirst) {
        list.add(0, object);
        isFirst = false;
      } else {
        compareInsert(comparator, list, object);
      }
    }
    return list;
  }
}
