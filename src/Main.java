import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static <Asangaziev> void main(String[] args) {
//        Параллелепипедтин площадь жана объёмун эсептеген бир программа жазабыз.
//        Фигуранын параметрлерин(длина, ширина, высота) берип жатканда туура эмес маалымат
//        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//                Мумкун болгон каталар:
//        1) берилген маалымат терс сан болсо
//        2) берилген маалымат сан эмес тамга болсо
//        3) берилген сандар 20 дан чон болсо
//
//
//                - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//        -Формулалар Parallelepiped классында жазылуусу керек
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 or 2 ");
            int areaVolume = scanner.nextInt();
            Parallelepiped parallelepiped = new Parallelepiped();
            if (areaVolume == 1) {
                System.out.print("Enter: height ");
                int height = scanner.nextInt();
                System.out.print("Enter : lenght ");
                int lenght = scanner.nextInt();
                System.out.print("Enter : width ");
                int width = scanner.nextInt();
                if (height > 0 && lenght > 0 && width > 0) {
                    parallelepiped.formula1(height,lenght,width);
                    if (height<20 && lenght< 20 && width<20){

                    }else {
                        throw new ArithmeticException("20 sanynan kop san berbe!!!");
                    }
                }else {
                    throw new ArithmeticException("Ters san berbe!!!");
                }
            } else if (areaVolume==2) {
                System.out.print("Enter: height ");
                int height = scanner.nextInt();
                System.out.print("Enter : lenght ");
                int lenght = scanner.nextInt();
                System.out.print("Enter : width ");
                int width = scanner.nextInt();
                if (height > 0 && lenght > 0 && width > 0) {
                    parallelepiped.formula2(height,lenght,width);
                    if (height<20 && lenght< 20 && width<20){

                    }else {
                        throw new ArithmeticException(" Can't give more than 20!!!");
                    }
                }else {
                    throw new ArithmeticException("Can't give negative numbers !!!");
                }

            }
        }
        catch (InputMismatchException e){
            System.err.println("The given value cannot be a character!!!");
        }
    }
}