public class NullPointerDemo {
    static void generateNPE() {
        String text = null;
        System.out.println(text.length()); // Will throw NPE
    }

    static void handleNPE() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
        try {
            generateNPE();
        } catch (Exception e) {
            handleNPE();
        }
    }
}
