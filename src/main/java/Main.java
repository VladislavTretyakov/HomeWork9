public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormData();

        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444№444444";
        post.phone = "89994445566";
        post.subscription = true;
        post.birthday.day = 15;
        post.birthday.month = 12;
        post.birthday.year = 1994;
    }
}
