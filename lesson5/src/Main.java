public class Main {
    public static void main(String[] args) {
        CreditCard accountOwnerOleg = new CreditCard("4276 0200 1239 8944",1200);
        CreditCard accountOwnerIvan = new CreditCard("5487 5436 9803 8512",15654);
        CreditCard accountOwnerTimur = new CreditCard("5400 8756 9666 5693",98706);

        accountOwnerOleg.putMoney(500);
        accountOwnerIvan.putMoney(346);
        accountOwnerTimur.withdrawMoney(706);

        System.out.println("Oleg " + accountOwnerOleg);
        System.out.println("Ivan " + accountOwnerIvan);
        System.out.println("Timur " + accountOwnerTimur);

        Computer firstComputer = new Computer(230000, "Macbook Pro");
        Computer secondComputer = new Computer(90000, "Lenovo", new RAM(2, "Crucial"), new HDD(512, "Adata", "internal"));

        System.out.println(firstComputer);
        System.out.println(secondComputer);
    }
}