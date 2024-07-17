package com.swfm.mica;
import com.swfm.mica.ModuleTwo;
import com.swfm.mica.One.ModuleOne;

public class ModuleTwo {
    public int moduleTwo = 2;
    public static int moduleTwoTwo = 22;

    public static void main(String[] args){
    String [][] argumentSets = {
            {"hello", "bro"},
            {"random", "values"},
            {"understood", "assignment?"}
    };

    for (String[] argumentSet : argumentSets){
        System.out.println(argumentSet.length);
        for (int i = 0; i< argumentSet.length; i++){
            System.out.println(argumentSet[i] + i+1);
            }
        }
    }
}
