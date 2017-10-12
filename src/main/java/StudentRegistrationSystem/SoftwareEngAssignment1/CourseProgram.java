package StudentRegistrationSystem.SoftwareEngAssignment1;


import java.util.List;

public class CourseProgram {
    
    private String courseName;
    private List<Module> moduleList;
    private DateTime startdate;
    private DateTime endDate;
    
    public CourseProgram(String courseName, List<Module> moduleList, DateTime startdate, DateTime endDate) {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.startdate = startdate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    
}