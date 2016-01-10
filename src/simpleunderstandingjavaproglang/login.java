package simpleunderstandingjavaproglang;

import simpleunderstandingjavaproglang.interfaces.login_interface;
import simpleunderstandingjavaproglang.statics.login_static;

/**
 * Created by aji on 1/10/2016.
 */
public class login implements login_interface {
    private int trying;
    private String username;
    private String password;

    public login_interface login_interfaces;

    public login(int trying, String username, String password) {
        this.login_interfaces = new login_interface() {
            @Override
            public void on_success() {
                this.on_success();
            }

            @Override
            public void on_failed() {
                this.on_failed();
            }
        };
        this.trying = trying;
        this.username = username;
        this.password = password;
    }

    public login_interface getLogin_interfaces() {
        return login_interfaces;
    }

    public int getTrying() {
        return trying;
    }

    public void setTrying(int trying) {
        this.trying = trying;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // program method declaration
    public boolean is_login() {
        return login_static.is_login;
    }

    public void proses(String username, String password) {
        this.username = username;
        this.password = password;

        if (this.username.equals(login_static.username)
                && this.password.equals(login_static.password)) {
            this.on_success();
        } else if (!this.username.equals(login_static.username)
                || !this.password.equals(login_static.password)) {
            this.on_failed();
        }
    }

    //interface

    @Override
    public void on_success() {
        System.out.print("Login Success");
    }

    @Override
    public void on_failed() {
        System.out.print("Login Failed");
    }
}
