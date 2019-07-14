package me.vkku.lambda;

import org.junit.Test;

interface UseLambda {
  public abstract void printInner(String str);

  // TODO : Make it work
  // public abstract void printInnerAgain(Integer val);
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

}
