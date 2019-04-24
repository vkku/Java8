import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamLambda {

    public List<String> zap(List<String> list, String omit) {

        return list
                .stream()
                .filter(not(omit::equals))
                .collect(toList());
    }


    public static <T> Predicate<T> not(Predicate<T> p) {
        return p.negate();
    }

    public static void main(String[] args) {
        StreamLambda streamLambda = new StreamLambda();
        System.out.println(streamLambda.zap(Arrays.asList("java", "pascal", "c", "lisp", "cpp"), "java"));
    }

}