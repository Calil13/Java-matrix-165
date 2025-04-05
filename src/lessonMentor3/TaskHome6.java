package lessonMentor3;

import java.util.Scanner;

public class TaskHome6 {
    public static void main(String[] args) {
        /*
            Natural ədədin onluq yazılışında rəqəmləri eyni olan
            və bu ədədin onluq yazılışının mərkəzinə nəzərən simmetrik yerləşən
            cütlüklərin sayını həmin ədədin simmetriya dərəcəsi adlandıracağıq.
            Əgər ədəddə hər hansı rəqəm onluq yazılışda ortada yerləşirsə,
            onu da özü ilə bir cütlük kimi saymaq lazımdır.
            n ədədinin simmetriya dərəcəsini tapın.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int n = scanner.nextInt();
        int count = 0;
        int temp = n;

        while (n > 0) {
            count++;
            n /= 10;
        }
        int[] array = new int[count];

        while (temp > 0) {
            array[--count] = temp % 10;
            temp /= 10;
        }
        int symetric = 0;
        for (int i = 0; i < (array.length + 1) / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                symetric++;
            }
        }
        System.out.println("Degree of symmetry : " + symetric);
    }
}
