module local.ToDoFX {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens local.todofx to javafx.fxml;
    exports local.todofx;
}
