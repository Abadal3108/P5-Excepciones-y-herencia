package EX_05;

public class App {
    public static void main(String[] args) {
        String user, pass, reppass;
        user = "alex";
        pass = "alex1234";
        reppass = "alex13456";

        MiHelper h = new MiHelper();

        try {
            h.validarPassword(pass, reppass);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
