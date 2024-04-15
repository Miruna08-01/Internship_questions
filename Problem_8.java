package org.example;

import java.util.Scanner;

public class Problem_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        text=text.replace(" ","");
        double L=Math.sqrt(text.length());
        int row = (int) Math.floor(L);
        int column = (int) Math.ceil(L);
        String[] grid=new String[row];
        int i=0;
        int substring=0;
        while(i<row){
            if (substring >= 0 && column + substring <= text.length()) {
                grid[i]=text.substring(substring,column+substring);
            }
            else{
                grid[i]=text.substring(substring);

            }
            i++;
            substring+=column;
        }
        for(int k=0;k<row;k++){
            System.out.println(grid[k]);
        }
    }
}
