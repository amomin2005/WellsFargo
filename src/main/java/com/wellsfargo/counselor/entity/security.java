package com.wellsfargo.counselor.entity;

public class security {
    private double PurchasePrice = 0.0;
    private int Quantity = 0;
    public String Name = "";
    private String PurchaseDate = "";
    private String Category = "";



    public security (double PurchasePrice,int Quantity,String Name,String PurchaseDate, String Category){
        this.PurchasePrice = PurchasePrice;
        this.Name = Name;
        this.Quantity = Quantity;
        this.PurchaseDate = PurchaseDate;
        this.Category = Category;
    }

    public void setCategory(String Category){
        this.Category = Category;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setQuantity(double PurchasePrice){
        this.PurchasePrice = PurchasePrice;
    }

    public void setPurchasePrice(String PurchaseDate){
        this.PurchaseDate = PurchaseDate;
    }
    public void setPurchaseDate(int Quantity){
        this.Quantity = Quantity;
    }

    public String getPurchaseDate(){
        return PurchaseDate;
    }

    public double getPurchasePrice(){
        return PurchasePrice;
    }
    public int getQuantity(){
        return Quantity;
    }
    public String getCategory(){
        return Category;
    }
    public String getName(){
        return Name;
    }
}
