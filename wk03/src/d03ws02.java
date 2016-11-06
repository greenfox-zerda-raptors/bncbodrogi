
public class d03ws02 {
    public static void main(String[] args) {
        int[] p1 = new int[] { 1, 2, 3 };
        int[] p2 = new int[] {4, 5 };
        // tell if p2 has more elements than p1
        int l1 = p1.length;
        int l2 = p2.length;
        if (l1 > l2) {
            System.out.println(l1);
        }else {
            System.out.println(l2);
        }
    }
}
