package Reduce_Method;

import java.util.Arrays;
import java.util.List;

public class ReduceMethos {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int add=list.stream().reduce((i,j) -> i + j).get();
        System.out.println(add);
    }
}
