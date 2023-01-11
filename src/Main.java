
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich"
        //на полностью заглавные буквы.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО " + fullName);
        String upperFullNAme = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета-" + upperFullNAme);

    }

    public static void task3() {
        System.out.println("Задача 3");
        String
        //Напишите программу, которая заменяет символ «ё» на символ «е».
        //В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        fullName="Ёжиков Семён Семёнович";
        fullName=fullName.replace("ё","е");
        fullName= fullName.replace("Ё","Е");
        System.out.println("Данные ФИО сотрудника-"+fullName);
    }
}