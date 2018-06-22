package JavaOOPHWLesson6.ConnectionRetryAccount;

//Смоделировать банковский счет, доступ к которому часто прерывается
//из-за плохой сети.
//Задан интерфейс банковского счет (​Account​) с единственным методом
//снятия денег (​withdraw​).
//Во время снятия может произойти одна из исключительных ситуаций
//(​AccountException​):
//1. Недостаточно денег на счету (​NotEnoughFundsException​).
//2. Срок действия счета истек (​AccountExpiredException​).
//3. Ошибка соединения (​AccountConnectionException​).
//
//
//
//Написать класс ​ConnectionRetryAccount​, который оборачивает
//“неблагонадежный” объект типа ​Account (принимается в конструкторе).
//ConnectionRetryAccount реализует интерфейс ​Account и работает по
//принципу ​декоратора (см. шаблон классов). ​ConnectionRetryAccount
//обладает следующим поведением:
//● При вызове withdraw у объекта ​ConnectionRetryAccount вызывается
//withdraw у внутреннего ​Account​; если произошла ошибка
//соединения, вызывается метод ​withdraw​ еще раз.
//● Количество повторов не должно превышать параметра ​retries​,
//который задается в конструкторе. Если и на последней попытке
//возникла ошибка соединения, просто перебросить (или
//проигнорировать).
//● Если снятие денег на одной из попыток произошло успешно или
//произошла ошибка, не связанная с соединением, повторно вызывать
//withdraw​ не нужно.
//
//
//
//Для тестирования написать класс ​RandomAccount​, реализующий
//Account​, который случайным образом или производит снятие успешно, или
//возникает одна из исключительных ситуаций.
//Конструктор ​RandomAccount​ принимает 3 параметра:
//1. Вероятность того, что будет ошибка ​NotEnoughFundsException​.
//2. Вероятность того, что будет ошибка ​AccountExpiredException​.
//3. Вероятность того, что будет ошибка
//AccountConnectionException​.
//Например, для конструктора ​new ​RandomAccount​(​0.2​, ​0.3​, ​0.4)
//вероятность ​NotEnoughFundsException - 20%, ​AccountExpiredException -
//30%, ​AccountConnectionException​ - 40%, успех - 10%.
//
//
//Алгоритм генерации события для примера выше:
//1. Сгенерировать псевдослучайное число ​n в диапазоне ​[0..1]
//(можно использовать ​Math​.​random​()​).
//2. Если ​0 <= n < 0.2​, бросить ​NotEnoughFundsException​.
//3. Если ​0.2 <= n < 0.5​, бросить ​AccountExpiredException​.
//4. Если ​0.5 <= n < 0.9​, бросить ​AccountConnectionException​.
//5. Иначе (​0.9 <= n <= 1​), ничего не делать (сигнал успеха).
//
//
//
//Написать ​AccountRunner​, демонстрирующий работу предыдущих
//классов.
//
//
//
//Реализовывать реальный ​Account​, работающий с платежной системой,
//не нужно.

public class AccountRunner {
    public static void main(String[] args) throws AccountException {
        RandomAccount randomAccount = new RandomAccount(0.2, 0.3,
                0.4);
        ConnectionRetryAccount connectionRetryAccount = new ConnectionRetryAccount(randomAccount, 2);
        connectionRetryAccount.withdraw(1000);
    }
}
//Tests
//-------------------------------------------------------------------------------------------------------------------
//0.22283130566327103
//Account expired
//
//Process finished with exit code 0
//-------------------------------------------------------------------------------------------------------------------
//0.9608898147499405
//Money was withdrawn successfully
//
//Process finished with exit code 0
//-------------------------------------------------------------------------------------------------------------------
//0.6618092788838088
//0.7811405614754235
//Exception in thread "main" JavaOOPHWLesson6.ConnectionRetryAccount.AccountConnectionException: Connection lost
//	at JavaOOPHWLesson6.ConnectionRetryAccount.RandomAccount.withdraw(RandomAccount.java:27)
//	at JavaOOPHWLesson6.ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:17)
//	at JavaOOPHWLesson6.ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:24)
//	at JavaOOPHWLesson6.ConnectionRetryAccount.AccountRunner.main(AccountRunner.java:7)
//
//Process finished with exit code 1
//-------------------------------------------------------------------------------------------------------------------
//0.08560761389872529
//Not enough funds!
//
//Process finished with exit code 0
//-------------------------------------------------------------------------------------------------------------------
//0.7836100185276945
//0.799241091873806
//Exception in thread "main" JavaOOPHWLesson6.ConnectionRetryAccount.AccountConnectionException: Connection lost
//	at JavaOOPHWLesson6.ConnectionRetryAccount.RandomAccount.withdraw(RandomAccount.java:27)
//	at JavaOOPHWLesson6.ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:17)
//	at JavaOOPHWLesson6.ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:24)
//	at JavaOOPHWLesson6.ConnectionRetryAccount.AccountRunner.main(AccountRunner.java:7)
//
//Process finished with exit code 1
//-------------------------------------------------------------------------------------------------------------------
