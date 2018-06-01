package JavaOOPHWLesson2.Line;

//Point (точка).
//Свойства: x, y.
//Line (линия).
//Свойства: начальная точка, конечная точка.
//Методы: подсчет длины линии.
//Lines (линии).
//Свойства: список линий.
//Методы: добавление линии, суммарная длина всех линий, нахождение самой длинной линии.
//Клиентский класс LineRunner: протестировать функционал предыдущих классов.

public class LineRunner {
    public static void main(String[] args) {
        Lines lines = new Lines();
        Line lineOne = new Line(1, 2, 3.5, 6.1, "LineOne");
        Line lineTwo = new Line(10, 22.5, 3.5, 6.1, "LineTwo");
        Line lineThree = new Line(5, 2.5, 7.5, 6.8, "LineThree");
        lines.addLine(lineOne);
        lines.addLine(lineTwo);
        lines.addLine(lineThree);

        System.out.println("Longest line is: " + lines.longestLine().getName());
        System.out.println("Length of second line is: " + lineTwo.lenghtOfLine());
    }
}
//Test
//Longest line is: LineTwo
//Length of second line is: 17.641145087550296
//
//Process finished with exit code 0