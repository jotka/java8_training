/**
 * Created by jarek on 06-10-14.
 */
interface Formula {
    int calculate(int a);

    default int calculateDefault(int a) {
        return a + 1;
    }
}