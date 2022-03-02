package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("tastati ceva: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String text = br.readLine();
            System.out.println(text);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
