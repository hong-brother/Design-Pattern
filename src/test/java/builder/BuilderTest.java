package builder;

import me.hsnam.builder.DefaultPhotoBuilder;
import me.hsnam.builder.Photo;
import me.hsnam.builder.PhotoBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BuilderTest {

    @Test
    @DisplayName("Builder 패턴 테스트")
    public void builderTest() {
        PhotoBuilder photoBuilder = new DefaultPhotoBuilder();
        Photo photo = photoBuilder
                .name("test")
                .createDate(LocalDate.of(2022, 02, 14))
                .updateDate(LocalDate.of(2022, 02, 15))
                .etcInfo("info", 2)
                .build();
        System.out.println(photo);

    }
}
