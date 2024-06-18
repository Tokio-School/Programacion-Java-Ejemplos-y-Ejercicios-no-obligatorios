

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import com.example.LoginController;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginControllerTest extends ApplicationTest {

    private LoginController controller;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Test
    public void testSuccessfulLogin() {
        clickOn("#usernameField").write("user1");
        clickOn("#passwordField").write("password123");
        clickOn("Login");

        Alert alert = controller.getLastAlert();
        assertNotNull(alert);
        assertTrue(alert.getContentText().contains("Gracias user1"));
    }

    @Test
    public void testInvalidUsername() {
        clickOn("#usernameField").write("user@!");
        clickOn("#passwordField").write("password123");
        clickOn("Login");

        verifyThat("#errorMessage", hasText("Entrada no válida"));
    }

    @Test
    public void testInvalidPassword() {
        clickOn("#usernameField").write("user1");
        clickOn("#passwordField").write("123");
        clickOn("Login");

        verifyThat("#errorMessage", hasText("Entrada no válida"));
    }

    @Test
    public void testUserNotFound() {
        clickOn("#usernameField").write("user3");
        clickOn("#passwordField").write("password123");
        clickOn("Login");

        verifyThat("#errorMessage", hasText("Usuario no encontrado"));
    }
}
