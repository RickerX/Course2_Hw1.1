public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        if (name == null || name.equals("")) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.equals("")) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null || job.equals("")) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public String toString() {
        return " Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + " Будем знакомы! ";
    }
}
