public class Transactions {

    public static void transactions() {

        Singleton singleton = Singleton.getInstance();

        singleton.withdraw(300);
        singleton.deposit(12);
        singleton.deposit(54);
        singleton.withdraw(47);
    }

    public static void balance() {

        // TODO 2 : call singleton and get total
        Singleton sigleton = Singleton.getInstance();
        
        System.out.printf("Your balance is:%d%n", sigleton.getBank().getTotal());
    }
}
