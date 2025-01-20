package org.javarush;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreator {
    public static Path createPath(String directoryName, String fileName, String suffix, String format) {
        Path path = Paths.get(directoryName, fileName + suffix + "." + format);
        return path;
    }
}
