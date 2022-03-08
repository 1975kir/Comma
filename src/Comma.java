// применение запятых в определении цикла for
public class Comma {
    public static void main(String[] args) {
//        int i,j;                                //определение типа переменных может быть выполнено как вне,
        for (int i = 0, j = 10; i < j; i++, j--) // так и в теле цикла
            System.out.println("i и j: " + i + " " + j);

    }
}
