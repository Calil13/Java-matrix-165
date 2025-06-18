package FileDownloaderSystem;

import org.apache.poi.ss.formula.functions.T;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Downloader {

    public void startDownloads(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String fileName;

            while ((fileName = reader.readLine()) != null) {
                String fileType = getFileType(fileName);

                //DownloadTask<T> task = new DownloadTask<>(fileName);

                //Thread thread = new Thread(task);
                //thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getFileType(String fileName) {
        int index = fileName.lastIndexOf(".");
        if (index != -1 && index < fileName.length() - 1) {
            return fileName.substring(index + 1);
        }
        return "";
    }
}
