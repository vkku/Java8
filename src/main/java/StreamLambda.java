import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertTrue;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.junit.Test;

public class StreamLambda {

  public List<String> zap(List<String> list, String omit) {

    return list.stream().filter(not(omit::equals)).collect(toList());
  }


  public static <T> Predicate<T> not(Predicate<T> p) {
    return p.negate();
  }

  public static void main(String[] args) {
    StreamLambda streamLambda = new StreamLambda();
    System.out
        .println(streamLambda.zap(Arrays.asList("java", "pascal", "c", "lisp", "cpp"), "java"));
    StreamLambda lambda = new StreamLambda();
    lambda.rxScan();
  }

  String result = "";

  @Test
  public void rxScan() {
    String[] letters = {"a", "b", "c"};
    Observable.fromArray(letters).scan(new StringBuilder(), StringBuilder::append)
    .subscribe(total -> result += total.toString());
    assertTrue(result.equals("aababc"));
  }

}
