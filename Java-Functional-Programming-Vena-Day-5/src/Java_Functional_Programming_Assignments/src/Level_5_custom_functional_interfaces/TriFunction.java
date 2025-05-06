package Level_5_custom_functional_interfaces;
import java.util.function.*;
// 29. Custom Functional Interface: TriFunction
@FunctionalInterface
interface TriFunction<T, U, V, R>
{
    R apply(T t, U u, V v);
}
