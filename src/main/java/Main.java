public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        FormData birthday = new FormData();

        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        birthday.day = 15;
        birthday.month = 8;
        birthday.year = 1997;
        post.passport = "4444№444444";
        post.phone = "89994445566";
        post.subscription = true;
    }
}
