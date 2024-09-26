public class ex08_09 {
    public static void main(String[] args) {
        Coffee latte = new Coffee("바닐라라떼", 3000);
        System.out.printf("%s(%d원) -> ", latte.getName(), latte.getPrice());
        latte.setPrice(latte.getPrice() + 500);
        System.out.printf("%s(%d원)", latte.getName(), latte.getPrice());
    }
}

class Coffee {
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}