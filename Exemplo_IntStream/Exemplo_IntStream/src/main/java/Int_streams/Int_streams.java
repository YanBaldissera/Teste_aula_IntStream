package Int_streams;

import java.util.stream.IntStream;

public class Int_streams {

    public static void main(String[] args){

        IntStream stream = IntStream.of(-7, -9, -11);

        long total = stream.count();

        System.out.println(total);
    }
}
