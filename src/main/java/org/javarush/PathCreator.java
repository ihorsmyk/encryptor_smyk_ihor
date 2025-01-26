package org.javarush;

import java.nio.file.Path;
import java.nio.file.Paths;

class PathCreator {
    static Path createPath(String directoryName, String fileName, String suffix, String format) {
        return Paths.get(directoryName, fileName + suffix + "." + format);
    }
    static Path createPath(String address) {
        return Paths.get(address);
    }
}
