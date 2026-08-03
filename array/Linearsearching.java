package array;

public class Linearsearching {

    public static int LINEAR_SEARCH(String menu[], String key) {

        for (int i = 0; i < menu.length; i++) {

            if (menu[i].equals(key)) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        String menu[] = {
                "SAMOSA",
                "DOSA",
                "CHILLIPOTATO",
                "MOMOS",
                "CHEELA"
        };

        String key = "CHILLIPOTATO";

        int index = LINEAR_SEARCH(menu, key);

        System.out.println(index);

    }
}