public class House {
    private int numStories, numWindows;
    private String colour;

    public House(){
        numStories = 1;
        numWindows = 4;
        colour = "gray";
    }

    public House(int numStories, int numWindows, String colour){
        this.colour = colour;
        this.numStories = numStories;
        this.numWindows = numWindows;
    }
    public int getNumStories() {
        return numStories;
    }

    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
