package me.hsnam.builder;

import java.time.LocalDate;

public class DefaultPhotoBuilder implements PhotoBuilder{

    private String name;

    private LocalDate createdDate;

    private LocalDate updateDate;

    private String description;

    private String etc;

    private int view;

    @Override
    public PhotoBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PhotoBuilder createDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @Override
    public PhotoBuilder updateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    @Override
    public PhotoBuilder description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public PhotoBuilder photoInfo(String name, String description) {
        this.name = name;
        this.description = description;
        return this;
    }

    @Override
    public PhotoBuilder etcInfo(String etc, int view) {
        this.etc = etc;
        this.view = view;
        return this;
    }

    @Override
    public Photo build() {
        return new Photo(name, createdDate, updateDate, description, etc, view);
    }
}
