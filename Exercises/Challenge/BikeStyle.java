package Challenge;

public class BikeStyle {
    private int styleID;
    private String styleName;
    private String styleDescription;
    private String styleWheel;

    public BikeStyle(int styleID, String styleName, String styleDescription, String styleWheel) {
        this.styleID = styleID;
        this.styleName = styleName;
        this.styleDescription = styleDescription;
        this.styleWheel = styleWheel;
    }

    public int getStyleID() {
        return styleID;
    }

    public String getStyleName() {
        return styleName;
    }

    public String getStyleDescription(){
        return styleDescription;
    }

    public String getStyleWheel(){
        return styleWheel;
    }
}
