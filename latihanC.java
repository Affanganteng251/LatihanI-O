/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class latihanC {
    public static void main(String[] args) {
        Path inputPath = Paths.get("yapping.txt");
        Path outputPath = Paths.get("count.txt");

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Gagal menulis file: " + e.getMessage());
        }

        System.out.println("Proses selesai. Hasil disimpan di count.txt");
    }
}

