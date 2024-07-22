package ex_shopping;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item){
        if(itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }
    public void displayItems(){
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: "+ item.getName() + " 가격: " +item.getPrice() + " 갯수: " + item.getNumber());
        }
    }

}
