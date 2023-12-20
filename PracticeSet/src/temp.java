import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Course {
    private String location;
    private String centreName;
    private String courseName;
    private int courseDuration;

    protected Set<String> otherModules;

    public Course(String location, String centreName, String courseName, int courseDuration) {
        this.location = location;
        this.centreName = centreName;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.otherModules = new HashSet<>();
    }

    public String getCentreName() {
        return centreName;
    }

    public Set<String> getOtherModules() {
        return otherModules;
    }
}

class PGDAC extends Course {
    private Set<String> webTechnologies;

    public PGDAC(String location, String centreName, int courseDuration) {
        super(location, centreName, "PGDAC", courseDuration);
        this.webTechnologies = new HashSet<>();
        this.webTechnologies.add("Web Programming");
        this.webTechnologies.add("Web Based JAVA");
        this.otherModules.add("JAVA");
        this.otherModules.add("RDBMS");
        this.otherModules.add("Data Structure");
        this.otherModules.add(".NET");
    }

    public Set<String> getWebTechnologies() {
        return webTechnologies;
    }
}

class PGDBDA extends Course {
    private Set<String> dataScienceSubjects;

    public PGDBDA(String location, String centreName, int courseDuration) {
        super(location, centreName, "PGDBDA", courseDuration);
        this.dataScienceSubjects = new HashSet<>();
        this.dataScienceSubjects.add("PML");
        this.dataScienceSubjects.add("BDA");
        this.otherModules.add("JAVA");
        this.otherModules.add("Python");
        this.otherModules.add("RDBMS");
        this.otherModules.add("Data Visualization");
    }

    public Set<String> getDataScienceSubjects() {
        return dataScienceSubjects;
    }
}

public class Main {
    public static void main(String[] args) {
        PGDAC pgdacCourse = new PGDAC("Bangalore", "KP", 6);
        PGDBDA pgdbdaCourse = new PGDBDA("Bangalore", "E-City", 8);

        System.out.println("PGDAC Centre Name: " + pgdacCourse.getCentreName());
        System.out.println("Web Technologies in PGDAC: " + pgdacCourse.getWebTechnologies());
        System.out.println("Other Modules in PGDAC: " + pgdacCourse.getOtherModules());

        System.out.println("\nPGDBDA Centre Name: " + pgdbdaCourse.getCentreName());
        System.out.println("Data Science Subjects in PGDBDA: " + pgdbdaCourse.getDataScienceSubjects());
        System.out.println("Other Modules in PGDBDA: " + pgdbdaCourse.getOtherModules());
    }
}

