package me.vkku.rxJava;

import io.reactivex.Observable;
import org.junit.Test;
import org.reactivestreams.Subscriber;

/*
 * Reactive Manifesto : 1. Resilient 2. Responsive 3. Scalable 4. Message Driven
 */
public class RxJava {
  @Test
  public void longObservable() {
    // Defining the source
    Observable<Integer> source = Observable.range(1, 5);

    // Defining the consumer
    Subscriber<Integer> consumer = new Subscriber<Integer>() {

      @Override
      public void onNext(Integer number) {
        System.out.println(number);
      }

      @Override
      public void onError(Throwable e) {
        System.out.println("error");
      }

      @Override
      public void onCompleted() {
        System.out.println("completed");
      }
    };

    // connecting the consumer to source
    source.subscribe(consumer);
  }

  @Test
  public void observeTheObservableShort() {

    Observable.range(1, 5).subscribe(number -> System.out.println(number),
        error -> System.out.println("error"), () -> System.out.println("completed"));
  }

}
