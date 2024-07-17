package com.swfm.mica.One;
import com.swfm.mica.ModuleTwo;
public class ModuleOne{
    public static int moduleOne = 1;
    public int moduleOneOne = 1;

    public static void main(String[] args){
        System.out.print("This is an element from the other package (static)" + ModuleTwo.moduleTwoTwo);
        ModuleTwo moduleTwo = new ModuleTwo();

        System.out.print("This is an element of the other package (instance)" + moduleTwo.moduleTwo);



        System.out.print("Static here " + moduleOne);

        ModuleOne moduleOne = new ModuleOne();
        System.out.print("Instance here" + moduleOne.moduleOneOne);
        /**
         * String greeting = ModuleTwo.sayHi();
         * System.out.print("Hi there" + greeting);
         * String babe = moduleTwo.sayHello();
         * System.out.print(babe);
         **/

    }
}