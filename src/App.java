public class App {
    public static void main(String[] args) throws Exception {
        String str = null;
        try {
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("例外: NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }

    }
}
