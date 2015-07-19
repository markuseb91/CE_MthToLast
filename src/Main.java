import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            String inputs[] = parseLine(line);
            
            if(inputs.length == 2) {
            	System.out.println(processLine(inputs));
            } 
        }
	}
	
	private static String processLine(String inputs[]) {
		
		StringBuilder sb = new StringBuilder();
		String line = inputs[0].trim();
		String matchChars = inputs[1].trim();
		String chr = "";
		
		for(int i=0; i < line.length(); i++) {
			chr = line.substring(i, i+1);
			if(!matchChars.contains(chr)) {
				sb.append(chr);
			}
		}
		return sb.toString();
	}
	
	private static String[] parseLine(String line) {
		String[] args;
		args = line.split(",");
		return args;
	}
	
}


