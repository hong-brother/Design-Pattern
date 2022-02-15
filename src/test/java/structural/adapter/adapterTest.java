package structural.adapter;

import me.hsnam.structural.adapter.HTML;
import me.hsnam.structural.adapter.MarkdownConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class adapterTest {

    @Test
    @DisplayName("adapter Test")
    public void adapterTest() {
        HTML head = new MarkdownConverter("# 제목");
        HTML content = new MarkdownConverter("**안녕**");

        head.showHead();
        content.showStrong();
    }
}
