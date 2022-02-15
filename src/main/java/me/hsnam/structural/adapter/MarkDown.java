package me.hsnam.structural.adapter;

public class MarkDown {
    private String string;

    public MarkDown(String string) {
        this.string = string;
    }

    public void showTitle() {
        if (string.startsWith("# ")) {
            this.string = string.replace("# ", "<h1>") + "</h1>";
        }

        System.out.println(string);
    }

    public void showBold() {
        if (string.startsWith("**") && string.endsWith("**")) {
            this.string = "<b>" + string.replace("**", "") + "</b>";
        }

        System.out.println(string);
    }
}