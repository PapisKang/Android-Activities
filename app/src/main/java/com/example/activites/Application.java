package com.example.activites;

public class Application extends android.app.Application  {

    private String login ;
    private String mdp ;
    @Override
    public void onCreate()
    {
        super.onCreate();
        this.setLogin(null);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
