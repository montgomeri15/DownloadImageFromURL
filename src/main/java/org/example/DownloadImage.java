package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadImage {

    public static java.io.File createDir(String dirName) {
        try {
            return Files.createDirectory(Paths.get(dirName)).toFile();
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public static void saveImage(String imageUrl, String dirName, String fileName) {
        try(InputStream in = new URL(imageUrl).openStream()){
            Files.copy(in, Paths.get(dirName, fileName));
        } catch (IOException e) {
            System.err.println(e);;
        }
    }
}
