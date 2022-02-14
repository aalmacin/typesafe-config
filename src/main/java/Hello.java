public class Hello {
    public static void main(String[] args) {
        System.out.println(System.getenv().get("CONFIG_ENV"));
        System.out.println(Config.instance().getName());
    }
}
