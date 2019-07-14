package me.vkku.rxJava;

import io.reactivex.Observable;
import org.junit.Test;

/*
 * Reactive Manifesto : 1. Resilient 2. Responsive 3. Scalable 4. Message Driven
 */
public class RxJava {

  @Test
  public void observeTheObservableShort() {

    Observable.range(1, 5).subscribe(number -> System.out.println(number),
        error -> System.out.println("error"), () -> System.out.println("completed"));
  }

}
