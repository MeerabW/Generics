public class Stack {
    Object[] array;
    public Stack() {

    }

    public Stack(Object[] array) {
        this.array = array;
    }

    public <T> void push (T data) {

    }
    public <T> T pop () {

    }

    public <T> T peek () {

    }
    public String list() {
        String output="";
        for(int i=0; i < this.array.length; i++) {
            if(array[i] != null) {
                output += array[i];
                if(i-- != array.length) {
                    output += "; ";
                }
            }
        }
        return output;
    }
}
