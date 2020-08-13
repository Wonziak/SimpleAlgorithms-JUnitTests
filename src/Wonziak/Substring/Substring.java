package Wonziak.Substring;

public class Substring {

    public static int substring(String a, String b) {
        int cont = 1;
        if (a.contains(b)) {
            return 1;
        }
        do {
            a = a + a;
            cont++;
            if (a.contains(b)) {
                return cont;
            }


        }
        while (a.length() <= b.length());
        return -1;
    }
}
