import java.util.Scanner;

public class Parallelepiped {
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
    public void formula1(int height,int length,int width){
        System.out.println("Area : "+2*((height * length) + (length * width) + (height * width)));
    }
    public void formula2(int height,int length,int width){
        System.out.println("Volume : "+ (length*width*height));
    }

}
