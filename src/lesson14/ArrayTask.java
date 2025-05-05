package lesson14;

public class ArrayTask {
    public static void main(String[] args) {
        //Bir array var və içərisində qarışıq şəkildə rəqəmlər var,
        //arrayin ölçüsü fərq etmir, bu arrayin içərisindəki rəqəmlərin
        //cəmi 7 olan indeksləri çıxartmaq lazımdır
        //məs :
        // a = [2,5,6]
        //output : 0 və 1 ci indeksdəki rəqəmlərin cəmi 7-dir!

        int[] array = {4, 1, 12, 3, 2, 5};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 7) {
                    System.out.println("The sum of the digits in indices " + i + " and " + j + " is 7!" +
                            " (" + array[i] + " + " + array[j] + ")");
                }
            }
        }
    }
}
