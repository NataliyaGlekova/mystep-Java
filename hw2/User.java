package teach.homework.hw2;

public class User {
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        return login.equals(u.login) && password.equals(u.password);

    }
    public String getUsername(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getLogin(){
        return login;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public void print(){
        System.out.println(name + login + password);
    }

}
