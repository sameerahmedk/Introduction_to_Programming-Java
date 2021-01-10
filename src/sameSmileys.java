public class sameSmileys {
    public static void main(String[] args) {
        for (int i = 0; i<args[0].length() - 1; i++) {
            if ((args[0].substring(i, i + 2).equals(":)"))) {
                if (!args[0].substring(i, i + 2).equals(args[1].substring(i, i + 2))) {
                    System.out.println(false);
                    return;
                }
            }
        }
        for (int i = 0; i<args[1].length() - 1; i++) {
            if ((args[1].substring(i, i + 2).equals(":)"))) {
                if (!args[0].substring(i, i + 2).equals(args[1].substring(i, i + 2))) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}