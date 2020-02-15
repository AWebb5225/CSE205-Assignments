import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] values = {-2,0,1,2,3,4};

        for (int j = values.length; j > 0; j--)
            values[j]++;

        System.out.println(Arrays.toString(values));


    }
}
