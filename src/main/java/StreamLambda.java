import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertTrue;
import io.reactivex.Observable;
import java.util.ArrayList;
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
    System.out.println(streamLambda.zap(
        Arrays.asList("java", "pascal", "c", "lisp", "cpp"), "java"));
  }

  private String result = "";

  @Test
  public void rxScan() {
    String[] letters = {"a", "b", "c"};
    Observable.fromArray(letters).scan(new StringBuilder(), StringBuilder::append)
        .subscribe(total -> result += total.toString());
    System.out.println(result);
    assertTrue(result.equals("aababc"));
  }

  @Test
  public void test() {
    System.out.println(mergeArrays(Arrays.fill(a, 1, 4, 4), null);

  }

  public int[] mergeArrays(int[] arr1, int[] arr2) {

    List<Integer> mergedArr = new ArrayList<Integer>();
    int MergedIndex = 0;
    int arr1Index = 0;
    int arr2Index = 0;
    int combinedLength = 0;
    int index = 0;

    combinedLength = arr1.length + arr2.length;

    while (index < combinedLength) {
      if (arr1[arr1Index] < arr2[arr2Index]) {
        mergedArr.add(arr1[arr1Index]);
        index++;
      } else if (arr2[arr2Index] < arr1[arr1Index]) {
        mergedArr.add(arr2[arr2Index]);
        arr2Index++;
        index++;
      } else if (arr1[arr1Index] == arr2[arr2Index]) {
        mergedArr.add(arr1[arr1Index]);
        mergedArr.add(arr1[arr1Index]);
        index += 2;
      }
    }

    int[] arrres = new int[combinedLength];
    Integer[] temp = mergedArr.toArray(new Integer[combinedLength]);
    for (int n = 0; n < combinedLength; ++n) {
      arrres[n] = temp[n];
    }
    return arrres;
  }
}
