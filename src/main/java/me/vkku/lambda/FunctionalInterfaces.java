package me.vkku.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.junit.Test;

public class FunctionalInterfaces {
  // Consumer, Supplier, Function and Predicate
  // ToDo
  // Supplier
  @Test
  public void predicateTest() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println("Print even numbers:");
    eval(list, n -> n % 2 == 0);
    System.out.println(iAmTheRebel(n -> n.equals(true)).test(false));
  }

  @Test
  public void consumerUsage() {
    // Consumer<Predicate<?>> condition;
  }

  public <T> applyConditionOnList(Consumer<Predicate<?>> condition, List<?> list) {
    return condition.accept(list);
  }

  public static Predicate<Boolean> iAmTheRebel(Predicate<Boolean> whatYouSaid) {
    return whatYouSaid.negate();
  }

  public static void eval(List<Integer> list, Predicate<Integer> predicate) {
    for (Integer n : list) {
      if (predicate.test(n)) {
        System.out.println(n + " ");
      }
    }
  }
}
