package com.junebatch.corejava;

public class Test {


    public static void main(String[] args) {

        Integer value = Integer.valueOf(5);
        updateValue(value);
        System.out.println(value);   // 5

    }


    public static void updateValue(Integer newValue){
        newValue = 20;
        System.out.println(newValue); //20
    }
}



/*

-------                ------------             -----------
main- stack            update_value                 Heap
--------               ------------             ------------

value = 701             newValue = 702               701
                                                   Integer{ val = 5}
------------           --------------

                                                    702
                                                     Integer{ val = 20}




 */