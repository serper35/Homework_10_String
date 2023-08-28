public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich.";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Задача №1\nФИО сотрудника — " + fullName);
    }

    public static void task2() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich.";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("\nЗадача №2\nДанные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович.";
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("\nЗадача №3\nДанные ФИО сотрудника — " + fullNameReplace);
    }
}