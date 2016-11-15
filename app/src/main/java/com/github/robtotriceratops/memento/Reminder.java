package com.github.robtotriceratops.memento;

import java.util.UUID;

/**
 * Created by Andrew on 10/31/2016.
 */

public class Reminder {

    private UUID Id;
    private String Title;
    private String Description;

    public Reminder() {
        Id = UUID.randomUUID();
    }

    public Reminder(String title) {
        this();
        this.Title = title;
    }

    public Reminder(String title, String Description) {
        this(title);
        this.Description = Description;
    }

    public UUID getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
