package analysis.q;

import java.util.*;

public class Ex3 {
  private static <T> void pushbackInsert(List<T> list, T object, int insertIndex) {
    for (int i = list.size() - 1; i >= insertIndex; i--) {
      list.set(i + 1, list.get(i));
    }
    list.set(insertIndex, object);
  }

  private static <T> void compareInsert(Comparator<T> comparator, List<T> list, T object) {
    for (int i = 0; i < list.size(); i++) {
      if(comparator.compare(object, list.get(i)) > 0) {
        pushbackInsert(list, object, i);
        return;
      }
    }
    list.add(object);
  }

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
}
