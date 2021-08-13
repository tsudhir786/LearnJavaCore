import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GetMaximumWordCount {

	public static void main(String[] args) throws IOException {
		String currentLine;
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		BufferedReader reader = new BufferedReader(new FileReader("D:\\LocalProject\\LearnJavaCore\\src\\Testing"));
		;
		while ((currentLine = reader.readLine()) != null) {
			String words[] = currentLine.split(" ");
			for (String word : words) {
				if (wordMap.containsKey(word)) {

					wordMap.put(word, wordMap.get(word) + 1);

				} else {
					wordMap.put(word, 1);
				}

			}
		}

		System.out.println(wordMap);
	}
}
