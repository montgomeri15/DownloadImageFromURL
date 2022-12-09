package org.example;

public class App {
    public static void main( String[] args ) {
        String imageUrl = "https://cs8.pikabu.ru/post_img/big/2016/04/13/8/1460549895152122999.jpg";
        String dirName = "directory";
        String fileName = "saitama.png";

        DownloadImage.createDir(dirName);
        DownloadImage.saveImage(imageUrl, dirName, fileName);
    }
}
