package com.mkaz.homeworks.lesson4.taxi;

//Task 1 (taxi)
//Написать ядро приложения для учета поездок в такси с различными тарифами.
//Поездка в такси (Ride) включает количество пассажиров (passengers),
// расстояние в километрах (distance), длительность в минутах (duration) и выбранный тариф (tariff).
//Есть несколько типов тарифов:
//1. Стандартный (StandardTariff): 30 + 5 * distance + 2 * duration.
//2. Семейный (FamilyTariff): 50 + 20 * distance / passengers.
//Система должна быть гибкой для добавления новых типов тарифов.
//Реализовать RidesHistory, содержащий множество поездок и умеющий подсчитывать суммарную стоимость всех
// поездок в соответствии с заданными тарифами.
//Написать TaxiRunner для тестирования функционала предыдущих классов.

public class TaxiRunner {
    public static void main(String[] args) {
        Tariff familyTariff = new FamilyTariff();
        Tariff standardTariff = new StandardTariff();
        Ride rideOne= new Ride(2,15,60,familyTariff);
        Ride rideTwo= new Ride(3,8,30,standardTariff);
        RidesHistory ridesHistory = new RidesHistory();
        ridesHistory.addRide(rideOne);
        ridesHistory.addRide(rideTwo);

        System.out.println(ridesHistory);
        System.out.println(rideOne.getPrice());
        System.out.println(rideTwo.getPrice());
        System.out.println(ridesHistory.getTotalPrice());//330
    }
}
//Test
//RidesHistory{rides=[Ride{passengers=2, distance=15, duration=60}, Ride{passengers=3, distance=8, duration=30}]}
//200
//130
//330
//
//Process finished with exit code 0
