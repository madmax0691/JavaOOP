package com.mkaz.homeworks.lesson2.library;

//Написать классы:
//Book (книга).
//Свойства: название, автор, издательство, год издания, количество страниц, цена, тип переплета.
//library (библиотека).
//Свойства: список книг.
//Методы:
//поиск книг заданного автора
//поиск книг, выпущенных заданным издательством
//поиск книг, выпущенных после заданного года
//Клиентский класс LibraryRunner: протестировать функционал предыдущих классов.
//
//Подсказка: учитывая, что Book содержит большое количество полей,
// допускается конструктор с многими аргументами заменить на конструктор
// без аргументов и сеттеры (смотрите пример выше).


public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();
        Book bookFour = new Book();
        Book bookFive = new Book();

        bookOne.setName("This is Going to Hurt: Secret Diaries of a Junior Doctor");
        bookOne.setAuthor("Adam Kay");
        bookOne.setYearOfPublishing(2018);
        bookOne.setTypeOfBinding("Paperback");
        bookOne.setNumberOfPages(256);
        bookOne.setPublishingHouse("Pan Macmillan");

        bookTwo.setName("Threat: Essays in French Literature");
        bookTwo.setAuthor("Adam Kay");
        bookTwo.setYearOfPublishing(2007);
        bookTwo.setTypeOfBinding("Paperback");
        bookTwo.setNumberOfPages(240);
        bookTwo.setPublishingHouse("Verlag Peter Lang");

        bookThree.setName("Healing Tales: The Narrative Arts in Spiritual Traditions");
        bookThree.setAuthor("Adam Kay");
        bookThree.setYearOfPublishing(2008);
        bookThree.setTypeOfBinding("Paperback");
        bookThree.setNumberOfPages(491);
        bookThree.setPublishingHouse("Puente Publications");

        bookFour.setName("The Artist's Way: A Course in Discovering and Recovering Your Creative Self");
        bookFour.setAuthor("Julia Cameron");
        bookFour.setYearOfPublishing(2016);
        bookFour.setTypeOfBinding("Paperback");
        bookFour.setNumberOfPages(224);
        bookFour.setPublishingHouse("Pan Macmillan");
        bookFour.setPrice(19.01);

        bookFive.setName("What the Ladybird Heard");
        bookFive.setAuthor("Julia Donaldson");
        bookFive.setYearOfPublishing(2012);
        bookFive.setTypeOfBinding("Board book");
        bookFive.setNumberOfPages(24);
        bookFive.setPublishingHouse("Pan Macmillan");
        bookFive.setPrice(9.8);

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);
        library.addBook(bookFive);

        System.out.println("Books by Adam Kay: " + library.names(library.searchByAuthor("Adam Kay")));
        System.out.println("Books by Pan Macmillan: " + library.names(library.searchByPublisher("Pan Macmillan")));
        System.out.println("Books after 2012: " + library.names(library.searchByYears(2012)));
    }
}
//Test
//Books by Adam Kay: [This is Going to Hurt: Secret Diaries of a Junior Doctor, Threat: Essays in French Literature, Healing Tales: The Narrative Arts in Spiritual Traditions]
//Books by Pan Macmillan: [This is Going to Hurt: Secret Diaries of a Junior Doctor, The Artist's Way: A Course in Discovering and Recovering Your Creative Self, What the Ladybird Heard]
//Books after 2012: [This is Going to Hurt: Secret Diaries of a Junior Doctor, The Artist's Way: A Course in Discovering and Recovering Your Creative Self, What the Ladybird Heard]
//
//Process finished with exit code 0