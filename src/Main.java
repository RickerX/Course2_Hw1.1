public class Main {
    public static void separation() {
        System.out.println("========================================================================================================================================");
    }

    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 2022 - 35, "бренд-менеджера");
        Human anya = new Human("Аня", "Москва", 2022 - 29, "методистома образовательных программ");
        Human kate = new Human("Катя", "Калининград", 2022 - 28, "продакт-менеджера");
        Human artem = new Human("Артем", "Москва", 2022 - 27, "директором по развитию бизнеса");
        separation();
        System.out.println(maxim);
        separation();
        System.out.println(anya);
        separation();
        System.out.println(kate);
        separation();
        System.out.println(artem);
        separation();
        // Не понял как в один гит репозиторий 2 проекта сохранить.
        System.out.println("Задача 3");
        task3();
    }

    public static void task3() {
        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого",1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Гремании", "черный", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6);
        separation();
        System.out.println(lada);
        separation();
        System.out.println(audi);
        separation();
        System.out.println(bmw);
        separation();
        System.out.println(kia);
        separation();
        System.out.println(hyundai);
        separation();

    }
}