/* BT 4- Tính bình phương, lập phương*/

package SessionOne;

import java.util.Scanner;

public class CalculSquareCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        float x = scanner.nextFloat();

        System.out.println("Bam so chon phep tinh ban can");
        System.out.println("1.Tinh binh phuong");
        System.out.println("2.Tinh lap phuong");

int isSwitch = scanner.nextInt();

switch (isSwitch) {
    case 1:  
    float square = x*x;
    System.out.println("Binh phương của " + x + "là: "+ square);
        break;

case 2:
float cube = x*x*x;
System.out.println("Lập phương của " + x + "là: " +cube);

    default:System.out.println("Not in list");
        break;
}

    }
}
