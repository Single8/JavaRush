package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes x) {
        if (x == ImageTypes.JPG) return new JpgReader();
        else if (x == ImageTypes.BMP) return new BmpReader();
        else if (x == ImageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException();
    }
}
