package collection;

public class Test {
    public static void main(String[] args) {
        try {
            Main list = new Main();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);

            list.remove(3);

            list.add(80);
            System.out.println(list);
            System.out.println("Length of list = " + list.size());
            System.out.println("Third item of list = " + list.get(2));
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
