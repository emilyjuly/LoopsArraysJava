package arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int i = (vetor.length - 1);


        while (i >= 0) {
            System.out.println(vetor[i] + " ");
            i --;
        }
    }
}
