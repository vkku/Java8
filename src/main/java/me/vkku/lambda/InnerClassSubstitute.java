package me.vkku.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

interface UseLambda {
  public abstract void printInner(String str);

  // TODO : Make it work
  // public abstract void printInnerAgain(int val);
}


public class InnerClassSubstitute {

  @Test
  public void alternativeToInnerClass() {

    UseLambda lambdaa;

    lambdaa = (str) -> {
      System.out.println(str);
    };

    lambdaa.printInner("Works !");
  }

  @Test
  public void simpleLemon() {
    List lemonList = Arrays.asList("easy", "peasy", "lemon", "squeezy");
    System.out.println(lemonList.stream().filter(str -> str.equals("lemon"))
        .collect(Collectors.toList()));
  }

}
