package ex_shopping;

public class Item {
    private String name = "";
    private int price = 0;
    private int number = 0;

    public Item(String name, int price, int number){
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getNumber(){
        return number;
    }


}
