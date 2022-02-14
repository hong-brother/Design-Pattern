package me.hsnam.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Photo {
    private String name;

    private LocalDate createdDate;

    private LocalDate updateDate;

    private String description;

    private String etc;

    private int view;

    public Photo(String name, LocalDate createdDate, LocalDate updateDate, String description, String etc, int view) {
        this.name = name;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.description = description;
        this.etc = etc;
        this.view = view;
    }
}
