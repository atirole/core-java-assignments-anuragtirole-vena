package Level_8_function_composition_and_pipelines;


// 44. Implement compose() and andThen() examples using Function<T, R>

import java.util.function.Function;

public class Problem44
{
    public static void main(String[] args)
    {
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add3 = x -> x + 3;

        // andThen: multiply first, then add
        Function<Integer, Integer> andThenFunc = multiplyBy2.andThen(add3);
        // compose: add first, then multiply
        Function<Integer, Integer> composeFunc = multiplyBy2.compose(add3);

        int input = 5;

        System.out.println("Using andThen (5 * 2 + 3): " + andThenFunc.apply(input));
        System.out.println("Using compose ((5 + 3) * 2): " + composeFunc.apply(input));
    }
}
