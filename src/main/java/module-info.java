module local.calendarfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens local.calendarfx to javafx.fxml;
    exports local.calendarfx;
}
