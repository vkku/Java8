package me.vkku.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

public class Listt {

  @Test
  public void testImmutableList() {
    List<String> preFill = Arrays.asList("We", "are", "millions", "of", "qubits");
    List<List<String>> ironHeadList = Collections.singletonList(preFill);

    // ironHeadList.get(0).add("Mutuable Strings");
    // java.lang.UnsupportedOperationException

    List<String> branchedList =
        ironHeadList.stream().flatMap(m -> m.stream()).distinct()
            .collect(Collectors.toList());
    branchedList.forEach(m -> {
      System.out.println(m);
    });
  }
}
