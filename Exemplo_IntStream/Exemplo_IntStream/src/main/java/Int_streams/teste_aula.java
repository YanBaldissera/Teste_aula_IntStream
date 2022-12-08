package Int_streams;

import java.util.stream.IntStream;

public class teste_aula {

    public static void main(String[] args) {

        IntStream.of(1, 2, 3, 4, 5).forEach(System.out::println);

        IntStream.range(0, 10).forEach(System.out::println);
        

    }
}
