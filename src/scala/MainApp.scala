import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

object MainApp {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[LibraryApp], args: _*)
  }
}

class LibraryApp extends Application {
  override def start(primaryStage: Stage): Unit = {
    val resource = getClass.getResource("resource/login.fxml")
    println(s"FXML Resource: $resource")

    if (resource == null) {
      println("Could not find the FXML file!")
    } else {
      val root: Parent = FXMLLoader.load(resource)
      primaryStage.setTitle("Library Management System")
      primaryStage.setScene(new Scene(root))
      primaryStage.show()
    }
  }
}
