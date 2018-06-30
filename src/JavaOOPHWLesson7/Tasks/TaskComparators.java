package JavaOOPHWLesson7.Tasks;

import JavaOOPHWLesson7.Tasks.Task;

import java.util.Comparator;

public class TaskComparators {
    public static Comparator<Task> byName() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };
    }

    public static Comparator<Task> byDeadline() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        };
    }

    public static Comparator<Task> byPriority() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getPriority().ordinal() - o2.getPriority().ordinal();
            }
        };
    }

}
