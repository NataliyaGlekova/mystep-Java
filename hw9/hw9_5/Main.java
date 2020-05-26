package teach.homework.hw9.hw9_5;

public class Main {
    public static void main(String[] args) {
        SocialProfile sp = new SocialProfile("Kn", "Kn1", "12345");
        SocialProfile sp1 = new SocialProfile("En", "En1", "54321","kn@mail.ru", 25);
        SocialProfile sp2 = new SocialProfile("Dn", "Dn1", "45678", "Dn@mail.ru", 26, "Moscow", "Russia");

        sp.sendMessage("Aloha", sp2);
        sp.sendMessage("I'll be back", sp1);
    }
}
