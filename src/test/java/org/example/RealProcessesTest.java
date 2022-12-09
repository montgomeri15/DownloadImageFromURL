package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RealProcessesTest {
    @Disabled("Disabled until needed because of downloading real images.")
    @Test
    @DisplayName("Image is created")
    void testImageCreating() {
        String imageUrl = "https://static.wikia.nocookie.net/pokemon/images/4/49/Ash_Pikachu.png/revision/latest?cb=20200405125039";
        String dirName = "dir";
        String fileName = "pikachu.jpg";

        DownloadImage.createDir(dirName);
        DownloadImage.saveImage(imageUrl, dirName, fileName);

        assertThat(Files.exists(Paths.get(dirName, fileName))).isTrue();
    }
}
