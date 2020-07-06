package analysis.a;

import java.util.*;

public class Ex3 {
  /**
   * Transforms a Set to a List ordered by the given comparator
   */
  public static <T> List<T> setToOrderedList(Comparator<T> comparator, Set<T> set) {
    List<T> list = new ArrayList<>(set.size());
    boolean isFirst = true;
    for (T object : set) {
      if(isFirst) {
        list.add(0, object);
        isFirst = false;
      } else {
        compareInsert(comparator, list, object);
      }
    }
    return list;
  }

  /**
   * Goes down an ordered list, and inserts the object into its ordered place
   */
  private static <T> void compareInsert(Comparator<T> comparator, List<T> list, T object) {
    for (int i = 0; i < list.size(); i++) {
      int compareResult = comparator.compare(object, list.get(i));
      if(compareResult > 0) {
        pushbackInsert(list, object, i);
        return;
      }
    }
    list.add(object);
  }

  /**
   * Pushes the list down from a certain index, inserting an object at that index
   */
  private static <T> void pushbackInsert(List<T> list, T object, int insertIndex) {
    for (int i = list.size() - 1; i >= insertIndex; i--) {
      list.set(i + 1, list.get(i));
    }
    list.set(insertIndex, object);
  }
}
