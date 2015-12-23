/**
 * Created by chris on 12/23/15.
 */
import java.io.*;

public class CsvAverage {

    public static void main(String[] args) {
        CsvAverage average = new CsvAverage();
        average.launch(args[0]);
    }

    public void launch (String filename) {
        File file = new File(filename);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            int numberOfLines = 0;
            int lineAverage;
            int sumOfLineAverages = 0;
            String line;
            while ((line = in.readLine()) != null) {
                int numberOfNumbersOnLine = 0;
                int sumOfNumbersOnLine = 0;
                System.out.println(line);
                for (String temp: line.split(", ")) {
                    numberOfNumbersOnLine++;
                    sumOfNumbersOnLine += Integer.parseInt(temp);
                }
                numberOfLines++;
                lineAverage = sumOfNumbersOnLine / numberOfNumbersOnLine;
                sumOfLineAverages += lineAverage;
                System.out.println(" * Average of " + numberOfNumbersOnLine + " numbers on line " + numberOfLines + " = " + lineAverage);
            }
            System.out.println("\n * Average of all numbers in file " + filename + " = " + (sumOfLineAverages / numberOfLines));
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }
    }

    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}