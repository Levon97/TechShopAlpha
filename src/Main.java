import service.Menu;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Menu.authorizationMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
