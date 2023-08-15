package ex08_1_exercise;

public class Item {
    char color;

    public boolean setColor(char color) {
        if (color == ' ') 
            return false;
        else
            this.color = color;

        return true;
    }
}
