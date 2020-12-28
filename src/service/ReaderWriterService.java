package service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReaderWriterService {



    public static List<String> reader(String path) throws IOException {
        return (Files.readAllLines(Paths.get(path)));
    }

    public static void writer(String path,String write ) throws IOException {
        Files.write(Paths.get(path), (write+"\n").getBytes(), StandardOpenOption.APPEND);
    }

    public static void deleteLine(String path, String id) throws IOException {
        File inputFile = new File(path);
        File tempFile = new File("myTempFile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(trimmedLine.contains(id+",")) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        boolean successful = tempFile.renameTo(inputFile);

    }



}

