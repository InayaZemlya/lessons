public class CoreJavaSolutions {

    public static final double EPSILON = 0.0001;

    /**
     * Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого
     * года) до заданного года включительно, не используя циклы. Напишите
     * формулу, использующую только арифметические операторы
     */
    public static int countLeapYearFromZero(int year) {
        return (year / 4) - (year / 100) + (year / 400);
    }

    /**
     * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на
     * противоположное. Биты должны нумероваться от младшего (индекс 1) к старшему (индекс 32)
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }

    /**
     * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
     * Допустимая погрешность – 0.0001 (1E-4)
     */
    public static boolean isDifferenceLessThenEpsilon(double termA, double termB, double subC) {
        return Math.abs(termA + termB - subC) <= EPSILON;
    }

    /**
     * Реализуйте метод, возвращающий true, если среди четырех его аргументов
     *ровно два истинны (любые). Составьте формулу с использованием булевых операторов
     */
    public static boolean isTwoOfFour(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));
    }
}
