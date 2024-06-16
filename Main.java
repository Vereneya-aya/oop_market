public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        market.acceptToMarket(human1);
        System.out.println("\n\n");
        market.acceptToMarket(human2);
        System.out.println("\n\n");
        market.update();
    }
}
