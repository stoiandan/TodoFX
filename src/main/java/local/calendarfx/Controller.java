package local.calendarfx;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {
    
    @FXML
    private Button addEventButton;
    
    @FXML
    private TextField eventDescriptionTextField;
    
    @FXML
    private DatePicker datePicker;
    
    @FXML
    private ListView<LocalEvent> eventListView;


    @FXML
    private void addEventHandler(ActionEvent e)
    {
        //create new Event by getting values from gui
        var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText());
        
        // add the new event to the list
        eventListView.getItems().add(newEvent);
        
        //reset fields
        // set date on today
        datePicker.setValue(LocalDate.now());
        
        // set text empty
        eventDescriptionTextField.setText("");
    }
}
