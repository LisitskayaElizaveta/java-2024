public class RegistrationForm {
    private final TextField customerNameTextField;
    private final Select serverTypeSelect;
    private final Button registrationButton;

    public RegistrationForm(GUIFactory factory) {
        System.out.println("Draw the registration form...");
        customerNameTextField = factory.createTextField();
        serverTypeSelect = factory.createSelect();
        registrationButton = factory.createButton();
    }
}
