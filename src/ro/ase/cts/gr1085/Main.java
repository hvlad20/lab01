package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

class LowerCaseException extends Exception {
    public LowerCaseException(String msg) {
        super(msg + " contine doar litere mici");
    }
}

class UpperCaseException extends Exception {
    public UpperCaseException(String msg) {
        super(msg + " contine doar litere mari");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("tastati o propozitie care contine litere mari si mici: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String text = br.readLine();
            //System.out.println(text);

            // daca toate literele sunt mici (lowercase) - LowerCaseException
            // daca toate literele sunt mari (uppercase) - UpperCaseException
            if(text.toLowerCase(Locale.ROOT).equals(text)) throw new LowerCaseException(text);
            if(text.toUpperCase(Locale.ROOT).equals(text)) throw new LowerCaseException(text);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
