package simpleunderstandingjavaproglang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aji on 1/10/2016.
 * Class Login System uses my algorithm
 */
public class forget_password {

    // for reading input from console.
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static String username = null, password = null;

    public static void main(String[] args) {
        login login_system = new login(0, "alaminaji", "ajiganteng");
        System.out.print("Please input your :\n");
        System.out.print("Username :");
        try {
            // read username
            username = br.readLine();
            //System.out.print(username);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // if read success
            if (username != null) {
                System.out.print("Password :");
                try {
                    // read password
                    password = br.readLine();
                    //System.out.print(password);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    // and if password is success too
                    if (password != null) {
                        // start thread for validation
                        // not necessary
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                // prosses the login
                                login_system.proses(username, password);
                                // just for being fun loading .(dot) animation
                                for(int i = 0; i < 3; i++) {
                                    System.out.print(".");
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }).start();
                    } else {
                        System.out.print("Sorry program crashed.");
                    }
                }
            } else {
                System.out.print("Sorry program crashed.");
            }
        }
    }
}
