package com.wellsfargo.counselor.entity;

public class Client {
    private int clientId = 0;
    private String Name = "";
    public String portfolio = "";



    public Client (int clientId, String Name, String portfolio){
        this.clientId = clientId;
        this.Name = Name;
        this.portfolio = portfolio;
    }

    public void setclientID(int clientId){
        this.clientId = clientId;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setPortfolio(String portfolio){
        this.portfolio = portfolio;
    }
    public String getName(){
        return Name;
    }

    public int getClientID(){
        return clientId;
    }
    public String getPortfolio(){
        return portfolio;
    }
}



