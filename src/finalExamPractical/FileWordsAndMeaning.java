package finalExamPractical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWordsAndMeaning {
	FileReader fr;
	public static void main(String[] args) {

		FileWordsAndMeaning obj = new FileWordsAndMeaning();
		boolean fileFound = obj.doesFileExist("src/data/wordMeanings.txt");
		if (fileFound == true) {
			obj.getData();
		} else {
			System.out.println("Could not retrieve data because File Not Found");
		}

	}

	public boolean doesFileExist(String path) {
		boolean result = true;
		File f = new File(path);
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File not found please enter correct file path");
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	public void getData() {
		BufferedReader br = new BufferedReader(fr);
		String line;
		String word = "";
		String meaning = "";

		try {
			while ((line = br.readLine()) != null) {
				word = line.substring(0, line.indexOf('-'));// get substring from beginning to -
				meaning = line.substring(line.indexOf("- ") + 1);// get substring after "- "(hyphen space)
				// since this index will be included therefore specifying indexOf("- ")+1
				System.out.println(word);
				String[] meaningArr = meaning.split(",");
				for (int i = 0; i < meaningArr.length; i++) {
					System.out.println(meaningArr[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
