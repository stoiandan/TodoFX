package local.todofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import local.util.EventSerializer;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Controller AppController;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("EventInterface"), 980, 120);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void stop() throws Exception {
        super.stop();
        EventSerializer.serailize(AppController.getEvents());
    }


    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}