/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dnacomplementarystrand;
import java.util.Scanner;

/**
 *
 * @author vangj
 */
public class DNAComplementaryStrand {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //user input
        System.out.println("Enter string (ex: AUGTCGACG)");
        String userString = input.nextLine();

        //create array of user string's length
        char[] ch = new char[userString.length()];

        //loop through string
        for (int i = 0; i < userString.length(); i++) {

            char letter = userString.charAt(i);
            
            //condition to end for-loop if user does not enter correct chars
            if (letter == ' ') {
                System.out.println();
                System.out.println("Please only enter A,T,C,G.");
                break;
            } else {
                // G->C, C->G, A->U, T->A
                switch (letter) {
                    case 'a':
                        ch[i] = 'U';
                        break;
                    case 't':
                        ch[i] = 'A';
                        break;
                    case 'c':
                        ch[i] = 'G';
                        break;
                    case 'g':
                        ch[i] = 'C';
                        break;
                    case 'A':
                        ch[i] = 'U';
                        break;
                    case 'T':
                        ch[i] = 'A';
                        break;
                    case 'C':
                        ch[i] = 'G';
                        break;
                    case 'G':
                        ch[i] = 'C';
                        break;
                    default:
                        //if user enters anything not A,T,C,G, then 
                        //break out of loop
                        letter = ' ';
                        break;
                }

            }
        }
        //Convert array of chars into a string and display back to user
        String str = new String(ch);
        System.out.println(str);
    }
}

