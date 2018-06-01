package JavaOOPHWLesson2.Rectangle;

//Написать классы:
//Rectangle (прямоугольник).
//Свойства: ширина, высота.
//Методы: подсчет периметра, подсчет площади.
//Rectangles (прямоугольники).
//Свойства: список прямоугольников.
//Методы: добавление прямоугольника, подсчет суммарной площади всех прямоугольников.
//Клиентский класс RectangleRunner: протестировать функционал предыдущих классов.

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        Rectangles rectanglesTwo = new Rectangles();

        Rectangle rectangleOne = new Rectangle(2.1, 3.3);
        Rectangle rectangleTwo = new Rectangle(5.0, 6.8);
        Rectangle rectangleThird = new Rectangle(10.0, 5.0);

        rectangles.addRectangel(rectangleOne);
        rectangles.addRectangel(rectangleTwo);
        System.out.println("Test perimeter is: " + rectangleOne.perimeter());
        System.out.println("First areas are: " + rectangles.sumOfRectanglesAreas());

        rectanglesTwo.addRectangel(rectangleThird);
        System.out.println("Second areas are: " + rectanglesTwo.sumOfRectanglesAreas());

    }
}
//Test
//Test perimeter is: 10.8
//First areas are: 40.93
//Second areas are: 50.0
//
//Process finished with exit code 0