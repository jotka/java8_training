/**
 * Created by jarek on 06-10-14.
 */
interface Formula {
    double calculate(int a);

    default double calculateDefault(int a) {
        return a + 1;
    }
}