package replit;

public class FrequencyOfjava {
    public static void main(String[] args) {
        String oneWord = "Javaphythonjava java javaJava java";

        int count = 0;
        for(int i = 0; i<=oneWord.length()-4; i++){
            String word = oneWord.substring(i,i+4);
            if(word.equalsIgnoreCase("java")){
                count ++;
            }
        }

        System.out.println(count);
        System.out.println("========================");

        oneWord = oneWord.toLowerCase();
        int count1 =0;  // 1+1+1+1

        while(oneWord.contains("java")){

            count1++;

            oneWord= oneWord.replaceFirst("java",""); //remove one java from oneword. first time javajavajava. second javajava
            // third time java. fourth time str ="";
        }
        System.out.println(count1);


    }
}
