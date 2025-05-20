package Algorithm;

public class Task5 {
    public static void figure(char smv){
        //Figure

        int length = 9;
        int heigh = 4;

        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < length; j++) {

                if (i == 0 || i == heigh - 1){
                    System.out.print(smv);
                }else {
                    if (j == 0 || j == length - 1){
                        System.out.print(smv);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task5.figure('*');
    }
}
