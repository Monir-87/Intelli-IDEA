public class IfElseDemo2 {
    public static void main(String[] args) {
        IfElseDemo2 myDemo = new IfElseDemo2();
        myDemo.saveMoney(0);
    }

    public void saveMoney(int pocketMoney) {
        if (pocketMoney == 20) {
            int savings = pocketMoney - 15;
            System.out.println("Savings: " + savings);
        } else if (pocketMoney == 30) {
            int savings = pocketMoney - 15;
            System.out.println("Savings: " + savings);
        } else if (pocketMoney == 30) {
            int savings = pocketMoney - 15;
            System.out.println("savings: " + savings);
        } else if (pocketMoney <= 15) {
            System.out.println("Save nothing");
        } else {
            System.out.println("its holiday, stay home, no pocket money");
        }

    }
}



