package JavaOOPHWLesson7.Tasks;

//Смоделировать менеджер задач, предоставляющий гибкую систему сортировки и фильтрации задач.
//Основные сущности:
//Задача (Task).
//Свойства: id, название, описание, дедлайн, приоритет (MINOR, NORMAL, MAJOR).
//Список задач (Tasks).
//Свойства: список задач.
//Методы: сортировка по компаратору, фильтрация по предикату.
//Компараторы для задач (TaskComparators) - содержит статические фабричные методы (static factory methods)
// для создания компараторов.
//Для сортировки задач по имени.
//Для сортировки задач по дедлайну.
//Для сортировки задач по приоритету.
//Предикаты для задач (TaskPredicates) - содержит статические фабричные методы (static factory methods)
// для создания предикатов.
//Для нахождения задач по части имени.
//Для нахождения задач с истекшим дедлайном.
//Для нахождения задач с заданному приоритету.
//Клиентский класс TasksRunner: протестировать функционал предыдущих классов.
//
//Сортировку выполнять с помощью метода List.sort(...). Фильтрацию выполнять с помощью метода Filter.filter(...),
// написанного ранее.

import java.time.LocalDate;

public class TasksRunner {
    public static void main(String[] args) {
        Task taskOne = new Task(1, "Task1", "Description1", LocalDate.of(2005, 2,
                10), Priority.NORMAL);
        Task taskTwo = new Task(2, "Task2", "Description2", LocalDate.of(2020, 2,
                10), Priority.MAJOR);
        Task taskThree = new Task(3, "Task3", "Description3", LocalDate.of(2006, 2,
                10), Priority.MINOR);

        Tasks tasks = new Tasks();
        tasks.add(taskOne);
        tasks.add(taskTwo);
        tasks.add(taskThree);


        System.out.println(tasks.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println(tasks.filter(TaskPredicates.hasPriority(Priority.MAJOR)));
        System.out.println(tasks.filter(TaskPredicates.nameContains("Tas")));
        System.out.println();

        tasks.sort(TaskComparators.byName());
        System.out.println(tasks);
        System.out.println();

        tasks.sort(TaskComparators.byDeadline());
        System.out.println(tasks);
        System.out.println();

        tasks.sort(TaskComparators.byPriority());
        System.out.println(tasks);
    }
}
//Test
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}]}
//Tasks{tasks=[Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}]}
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}]}
//
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}]}
//
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}]}
//
//Tasks{tasks=[Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}, Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}]}
//
//Process finished with exit code 0