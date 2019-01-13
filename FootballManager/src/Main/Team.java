package Main;

public class Team {

    //vars
    private String teamName;
    private String teamLeagueName;
    private String teamTrainingFacilities;
    private String teamYouthFacilities;
    private String teamJuniorCoaching;
    private String teamYouthRecruitment;
    public static final String ANSI_Color = "\033[32m";
    //System.out.println(ANSI_RED + "Red");

    private int teamTrainingFacilitiesRank;
    private int teamYouthFacilitiesRank;
    private int teamJuniorCoachingRank;
    private int teamYouthRecruitmentRank;

    //Constructor
    public Team(String teamName, String teamLeagueName, String teamTrainingFacilities, String teamYouthFacilities, String teamJuniorCoaching, String teamYouthRecruitment) {
        this.teamName = teamName;
        this.teamLeagueName = teamLeagueName;
        this.teamTrainingFacilities = teamTrainingFacilities;
        this.teamYouthFacilities = teamYouthFacilities;
        this.teamYouthRecruitment = teamYouthRecruitment;
        this.teamJuniorCoaching = teamJuniorCoaching;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getLeagueName() {
        return teamLeagueName;
    }

    public String getTrainingFacilities() {
        return teamTrainingFacilities;
    }

    public String getYouthFacilities() {
        return teamYouthFacilities;
    }

    public String getJuniorCoaching() {
        return teamJuniorCoaching;
    }

    public String getYouthRecruitment() {
        return teamYouthRecruitment;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setLeagueName(String teamLeagueName) {
        this.teamLeagueName = teamLeagueName;
    }

    public void setTrainingFacilities(String teamTrainingFacilities) {
        this.teamTrainingFacilities = teamTrainingFacilities;
    }

    public void setYouthFacilities(String teamYouthFacilities) {
        this.teamYouthFacilities = teamYouthFacilities;
    }

    public void setJuniorCoaching(String teamJuniorCoaching) {
        this.teamJuniorCoaching = teamJuniorCoaching;
    }

    public void setYouthRecruitment(String teamYouthRecruitment) {
        this.teamYouthRecruitment = teamYouthRecruitment;
    }

    public void setTrainingFacilitiesRanks(String teamTrainingFacilities) {
    }

    public void setYouthFacilitiesRanks(String teamYouthFacilities) {
    }

    public void setJuniorCoachingRanks(String teamJuniorCoaching) {
    }

    public void setYouthRecruitmentRanks(String teamYouthRecruitment) {
    }

    @Override
    public String toString() {
        return ANSI_Color + "Team: " + teamName + "\nTeam League Name: " + teamLeagueName + "\nTraining Facilities: " + teamTrainingFacilities + "\nTeam Youth Facilities: " + teamYouthFacilities + "\nTeam Junior Coaching: " + teamJuniorCoaching + "\nTeam Youth Recruitment: " + teamYouthRecruitment + "\n";
    }
}
