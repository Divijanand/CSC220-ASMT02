/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * @author: Divij Anand
 * @partner: N/A
 * **********************************************
 */

package Assignment02PartB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Receipt {

    // Static Data Fields
    private static final String LOG_DIRECTORY = "./src/Assignment02PartB/log/";
    private static final DateTimeFormatter TIMESTAMP_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

    // Instance Data Fields
    private String studentName;
    private String studentEmail;
    private String playerName;
    private int numCards;
    private String[] recipientNames;
    private char[] artSymbols;
    private String[] messages;

    // Constructors
    public Receipt() {
    }

    public Receipt(String studentName, String studentEmail, String playerName, int numCards, String[] recipientNames, char[] artSymbols, String[] messages) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.playerName = playerName;
        this.numCards = numCards;
        this.recipientNames = recipientNames;
        this.artSymbols = artSymbols;
        this.messages = messages;
    }

    // Instance Methods
    public void generateReceiptLog() {
        // Create the log directory if it doesn't exist
        new File(LOG_DIRECTORY).mkdirs();

        // Generate a unique file name for the receipt log
        String timestamp = LocalDateTime.now().format(TIMESTAMP_FORMAT);
        String fileName = LOG_DIRECTORY + "Receipt-" + timestamp + ".log";

        // Write the receipt details to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Student Name: " + studentName + "\n");
            writer.write("Student Email: " + studentEmail + "\n");
            writer.write("SF Giants Player: " + playerName + "\n");
            writer.write("Number of Cards: " + numCards + "\n");

            for (int i = 0; i < numCards; i++) {
                writer.write("\nCard " + (i + 1) + ":\n");
                writer.write("Recipient Name: " + recipientNames[i] + "\n");
                writer.write("Art Symbol: " + artSymbols[i] + "\n");
                writer.write("Message: " + messages[i] + "\n");
            }

            writer.write("\nTimestamp: " + LocalDateTime.now() + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to receipt log: " + e.getMessage());
        }
    }
}