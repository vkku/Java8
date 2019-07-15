package me.vkku.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.junit.Test;

public class FunctionalInterfaces {
  // Consumer, Supplier, Function and Predicate
  @Test
  public void predicateTest() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println("Print even numbers:");
    eval(list, n -> n % 2 == 0);
    Predicate<Boolean> pred = iAmTheRebel(n -> true);
    System.out.println(pred.test(true));
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
