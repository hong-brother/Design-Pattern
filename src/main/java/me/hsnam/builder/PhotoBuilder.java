package me.hsnam.builder;

import java.time.LocalDate;

public interface PhotoBuilder {

    PhotoBuilder name(String name);

    PhotoBuilder createDate(LocalDate createDate);

    PhotoBuilder updateDate(LocalDate updateDate);

    PhotoBuilder description(String description);

    PhotoBuilder photoInfo(String name, String description);

    PhotoBuilder etcInfo(String etc, int view);

    Photo build();
}
