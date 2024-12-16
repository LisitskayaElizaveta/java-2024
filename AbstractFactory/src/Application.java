import java.util.Scanner;
public class Application {
    private RegistrationForm registrationForm;

    public void drawRegistrationForm() {
        Scanner scanner = new Scanner(System.in);
        String osName = scanner.next().toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Your OS is unsupported :( ");
            return;
        }
        registrationForm = new RegistrationForm(guiFactory);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.drawRegistrationForm();
    }
}