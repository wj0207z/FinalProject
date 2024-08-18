import javafx.fxml.FXML
import javafx.scene.control.{Alert, PasswordField, TextField}
import javafx.scene.control.Alert.AlertType

class LoginController {
  @FXML private var usernameField: TextField = _
  @FXML private var passwordField: PasswordField = _

  @FXML
  def handleLogin(): Unit = {
    val username = usernameField.getText
    val password = passwordField.getText

    if (authenticate(username, password)) {
      // Code to switch to the dashboard scene can be added here
      println("Login successful!")
    } else {
      val alert = new Alert(AlertType.ERROR)
      alert.setContentText("Invalid username or password!")
      alert.show()
    }
  }

  private def authenticate(username: String, password: String): Boolean = {
    // Placeholder authentication logic
    username == "admin" && password == "admin"
  }
}
