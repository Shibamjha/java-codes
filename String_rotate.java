package String;

public class String_rotate {
public boolean rotateString(String s, String goal) {

            if (s.length()!= goal.length()) return false;
            return (s + s).contains(goal);
        }
    }

