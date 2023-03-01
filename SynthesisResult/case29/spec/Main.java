import java.util.*;

//Target
private class UserA implements Comparable<UserA>{
    private void login(String[] args) {
        System.out.println("Hello World!");
    }
}

private class Server implements Serializable{
    private void exit(String[] args) {
        System.out.println("Hello World!");
    }
}

//Target
public class UserB implements Comparable<UserB>{
    private void login(String[] args) {
        System.out.println("Hello World!");
    }
}
