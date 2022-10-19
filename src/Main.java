public class Main {
    public static void separation() {
        System.out.println("========================================================================================================================================");
    }
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 2022 - 35,"бренд-менеджера");
        Human anya = new Human("Аня", "Москва", 2022 - 29,"методистома образовательных программ");
        Human kate = new Human("Катя", "Калининград", 2022 - 28,"продакт-менеджера");
        Human artem = new Human("Артем", "Москва", 2022 - 27,"директором по развитию бизнеса");
        separation();
        System.out.println(maxim);
        separation();
        System.out.println(anya);
        separation();
        System.out.println(kate);
        separation();
        System.out.println(artem);
        separation();

    }
}