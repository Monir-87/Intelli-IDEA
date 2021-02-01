package collectionsDemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy6 {
    public static void main(String[] args) {
        ArrayList CAT = new ArrayList();
        CAT.add("MIMI");
        CAT.add("CATY");
        CAT.add("NANCY");
        CAT.add("MEOW");

        System.out.println(CAT);

        ArrayList CAT2 = new ArrayList();
        System.out.println(CAT2);
        CAT2.addAll(CAT);
        System.out.println("after copying " + CAT2);

        CAT2.removeAll(CAT);
        System.out.println("After removing: " + CAT2);

        Collections.sort(CAT);
        System.out.println("after sorting " + CAT);
        Collections.sort(CAT, Collections.reverseOrder());
        System.out.println("after reverse order" + CAT);

        Collections.shuffle(CAT);
        System.out.println("after shuflling " + CAT);

    }
}
