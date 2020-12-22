package calc;

import java.util.Stack;

public class calc {

    private Stack<Double> stack = new Stack<>();

    public void pushStack(double number)
    {
        stack.push(number);
    }

    public String getStackList()
    {
        String stackList = "";

        for (double d : stack)
        {
            stackList = stackList + d + "\n";
        }
        return stackList;
    }
    public void clearStack()
    {
        stack.clear();
    }
    public boolean add()
    {
        if(stack.size() >= 2)
        {
            double num = stack.pop();
            double num2 = stack.pop();
            stack.push(num + num2);
            return true;
        }
        return false;
    }
    public boolean subtract()
    {
        if(stack.size() >= 2)
        {
            double num = stack.pop();
            double num2 = stack.pop();
            stack.push(num2 - num);
            return true;
        }
        return false;
    }
    public boolean multiply()
    {
        if(stack.size() >= 2)
        {
            double num = stack.pop();
            double num2 = stack.pop();
            stack.push(num * num2);
            return true;
        }
        return false;
    }
    public boolean divid()
    {
        if(stack.size() >= 2)
        {
            double num = stack.pop();
            double num2 = stack.pop();
            stack.push(num2 / num);
            return true;
        }
        return false;
    }
}
