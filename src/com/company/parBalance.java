package com.company;

import java.util.HashMap;
import java.util.Stack;

/*An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.:

string containing just characters
'(',')', '{','}', '['and']'
determine if the input string is valid
Stacking & for loop
it's valid AKA True(output) if it the string has All 3 characters or 1 out of the 3.
it's invalid AKA False(output) if it mismatched or doesn't have any of the characters.
*/
public class parBalance {

    public boolean checkBalance(String s) {

        int length = s.length();
        char[] array = s.toCharArray();
        if (length == 0) return true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < length; i++) {


            // if (array[i]) =='(' || array[i] == '{' || array[i] == '['){ // why is the OR not working?
            stack.push(array[i]);
        }
        // if (array[i]) ==')' || array[i] == '}' || array[i] == ']' {

   // }
            if(stack.isEmpty())return false;
    //char oth = stack.push();

          /*  if ((oth == '(' && array[i] == ')') || (oth == '{' && array[i] == '}') || (oth == '[' && array[i] == ']'))
                return true;
        }
             //else
        return false;

    }
}

}
