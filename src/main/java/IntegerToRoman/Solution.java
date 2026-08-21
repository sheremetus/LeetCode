package IntegerToRoman;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {


        Map<Integer, String> numRom = new LinkedHashMap<>();
        numRom.put(1000, "M");
        numRom.put(900, "CM");
        numRom.put(500, "D");
        numRom.put(400, "CD");
        numRom.put(100, "C");
        numRom.put(90, "XC");
        numRom.put(50, "L");
        numRom.put(40, "XL");
        numRom.put(10, "X");
        numRom.put(9, "IX");
        numRom.put(5, "V");
        numRom.put(4, "IV");
        numRom.put(1, "I");
        StringBuilder res = new StringBuilder();



        for (Map.Entry<Integer, String> entry : numRom.entrySet()) {

            res.append(entry.getValue().repeat(num / entry.getKey()));
            num = num - ((num / entry.getKey()) * entry.getKey());
            System.out.println(num);

        }


        return res.toString();

    }
}
