package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReaderWriterService {



    public static List<String> reader(String path) throws IOException {
        return (Files.readAllLines(Paths.get(path)));
    }
    public static void writer(String path,String write ) throws IOException {
        Files.write(Paths.get(path), (write).getBytes(), StandardOpenOption.APPEND);
    }

}

