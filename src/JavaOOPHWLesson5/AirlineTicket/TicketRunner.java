package JavaOOPHWLesson5.AirlineTicket;

//Смоделировать авибилеты 2 типов: стандартный авиабилет и vip-авиабилет,
// который расширяет функционал стандартного добавлением платных сервисов (багаж и еда).
// Нарисовать UML диаграмму и написать классы.
//Основные сущности:
//Авиабилет (Ticket).
//Свойства: номер авиабилета, информация о пассажире, информация о полете.
//Методы: подсчет стоимости (по информации о полете).
//Vip-авиабилет (VipTicket) - расширяет авиабилет (Ticket).
//Дополнительные свойства: сервис по багажу, сервис по еде.
//Методы: подсчет стоимости (учитывается базовая стоимость и стоимость дополнительных сервисов).
//Информация о пассажире (PassengerInfo).
//Свойства: имя, фамилия, номер паспорта.
//Информация о полете (FlightInfo).
//Свойства: номер полета, место отправки, место прибытия, время отправки, номер места, стоимость.
//Методы: подсчет стоимости.
//Сервис багажа (Baggage).
//Свойства: стоимость одной сумки, количество сумок.
//Методы: подсчет стоимости.
//Сервис еды (Meal).
//Свойства: тип еды, с напитком или без, стоимость.
//Методы: подсчет стоимости.
//Клиентский класс TicketRunner: протестировать функционал предыдущих классов.


import java.time.LocalDateTime;

public class TicketRunner {
    public static void main(String[] args) {
        PassengerInfo passengerInfo = new PassengerInfo("Alex", "Bogdanov", "HQ341056");
        FlightInfo flightInfo = new FlightInfo(1, "Kyiv", "NewYork",
                LocalDateTime.of(2018, 3, 12, 13, 15, 0, 0),
                25, 1000);
        Ticket ticket = new Ticket(1, passengerInfo, flightInfo);

        System.out.println(passengerInfo);
        System.out.println(flightInfo);
        System.out.println(ticket);
        System.out.println(ticket.getCost());

        passengerInfo = new PassengerInfo("Dmitriy", "Spas", "DK105066");
        flightInfo = new FlightInfo(2, "Kyiv", "Monaco",
                LocalDateTime.of(2018, 4, 10, 15, 10, 0, 0),
                2, 2000);
        ticket = new VipTicket(2, passengerInfo, flightInfo, new Baggage(30, 2),
                new Meal("VIP", true, 50));

        System.out.println(passengerInfo);
        System.out.println(flightInfo);
        System.out.println(ticket);
        System.out.println(ticket.getCost());

    }
}
//Test
//PassengerInfo{name='Alex', surname='Bogdanov', passportID='HQ341056'}
//FlightInfo{flightNumber=1, placeOfDispatch='Kyiv', placeOfDestination='NewYork', dispatchTime=2018-03-12T13:15, placeNumber=25, price=1000}
//Ticket{number=1, passengerInfo=PassengerInfo{name='Alex', surname='Bogdanov', passportID='HQ341056'}, flightInfo=FlightInfo{flightNumber=1, placeOfDispatch='Kyiv', placeOfDestination='NewYork', dispatchTime=2018-03-12T13:15, placeNumber=25, price=1000}}
//1000
//PassengerInfo{name='Dmitriy', surname='Spas', passportID='DK105066'}
//FlightInfo{flightNumber=2, placeOfDispatch='Kyiv', placeOfDestination='Monaco', dispatchTime=2018-04-10T15:10, placeNumber=2, price=2000}
//VipTicket{baggage=Baggage{costOfOneBag=30, amountOfBags=2}, meal=Meal{foodType='VIP', hasDrink=true, price=50}} Ticket{number=2, passengerInfo=PassengerInfo{name='Dmitriy', surname='Spas', passportID='DK105066'}, flightInfo=FlightInfo{flightNumber=2, placeOfDispatch='Kyiv', placeOfDestination='Monaco', dispatchTime=2018-04-10T15:10, placeNumber=2, price=2000}}
//2160
//
//Process finished with exit code 0
