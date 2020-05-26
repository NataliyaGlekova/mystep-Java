package teach.homework.hw9.hw9_5;

public class SocialProfile {
    String name;
    String login;
    String password;
    String email;
    int age;
    String city;
    String country;

    public SocialProfile(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public SocialProfile(String name, String login, String password, String email, int age){
//        this.name = name;
//        this.login = login;
//        this.password = password;
        this(name, login, password);
        this.email = email;
        this.age = age;
    }
    public SocialProfile(String name, String login, String password, String email, int age, String city, String country){
//        this.name = name;
//        this.login = login;
//        this.password = password;
//        this.email = email;
//        this.age = age;
        this(name, login, password, email, age);
        this.city = city;
        this.country = country;
    }

    public void sendMessage(String text, SocialProfile sp){
        //System.out.println("text" + " " + name);
        System.out.println(name+" отправил текст "+text+" пользователю "+sp.name);
    }
    public void sendMessage(Picture picture, SocialProfile sp){
        System.out.println(name+" отправил картинку с названием "+picture.picName+" пользователю "+sp.name);
    }
    public void sendMessage(Picture picture, String text, SocialProfile sp){
        System.out.println("text" + " " + name);
    }
}
