package me.hsnam.structural.adapter;

public class MarkdownConverter extends MarkDown implements HTML {

    public MarkdownConverter(String string) {
        super(string);
    }

    @Override
    public void showHead() {
        showTitle();
    }

    @Override
    public void showStrong() {
        showBold();
    }
}