/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.calendarfx;

import java.time.LocalDate;

/**
 *
 * @author dan.stoian
 */
class LocalEvent {
    
    private LocalDate date;
    
    private String description;

    public LocalEvent(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
    

    
    // this makes LocalEvents dispaly nicely in GUI
    @Override
    public String toString() {
        return "At: " + date + description;
    }
    
}
