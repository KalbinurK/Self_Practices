package replitQ;

import java.util.Scanner;

public class WithoughtXx {
    /*
    Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                String word = scan.next();
                String result= "";

                for(int i=0; i<= word.length()-1;i++){

                    if(i==0 && (word.charAt(i)=='X'|| word.charAt(i)=='x')){
                        continue;

                    }if(i==word.length()-1 && (word.charAt(i)=='x'|| word.charAt(i)=='X')){
                        continue;

                    }else{
                        result +=word.charAt(i);
                    }

                }

                System.out.println(result);


            }
        }

