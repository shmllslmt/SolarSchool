public class SolarData {
    public String state;
    public String deo;
    public String level;
    public String category;
    public String schoolType;
    public String location;
    public String inland;
    public String schoolCode;
    public String schoolName;
    public String source;
    // Parameterized Constructor
    public SolarData(String state,String deo,String level,String category,String schoolType,String location,String inland,String schoolCode,String schoolName,String source) {
        this.state = state;
        this.deo = deo;
        this.level = level;
        this.category = category;
        this.schoolType = schoolType;
        this.location = location;
        this.inland = inland;
        this.schoolCode = schoolCode;
        this.schoolName = schoolName;
        this.source = source;
    }

    @Override
    public String toString() {
        return "State = "+state+", DOE = "+deo+", Level = "+level+", Category = "+category+", School Type = "+schoolType+", Location = "+location+", Inland = "+inland+", School Code = "+schoolCode+", School Name = "+schoolName+", Electric Source = "+source;
    }
}
