public class WhileLoop {
    public static void main(String[] args ) {
        WhileLoop myObj = new WhileLoop(); //created object of class WhileLoop
        myObj.LockThePhone(6); //we call te method lock the phone by object
    }
    public void LockThePhone(int attempt) {
        int i = 1;
        while (i < attempt) {
            System.out.println("Allow user to try to unlock" + i);
            i++;
        }
        System.out.println("Lock the phone for 1 hour..");
    }
}
