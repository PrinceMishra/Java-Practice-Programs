import java.util.ArrayList;
class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(897);
        list.add(437);
        list.add(44);

        System.out.println(list);
        list.add(3,78);
        System.out.println(list);

        list.set(1,39);
        System.out.println(list );

        list.remove(1);
        System.out.println(list);


    }
}
