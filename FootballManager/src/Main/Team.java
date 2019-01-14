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
        this.teamJuniorCoaching = teamJuniorCoaching;
        this.teamYouthRecruitment = teamYouthRecruitment;
    }

    public Team(String teamName, String teamLeagueName, int teamTrainingFacilitiesRank, int teamYouthFacilitiesRank, int teamJuniorCoachingRank, int teamYouthRecruitmentRank) {
        this.teamName = teamName;
        this.teamLeagueName = teamLeagueName;
        this.teamTrainingFacilitiesRank = teamTrainingFacilitiesRank;
        this.teamYouthFacilitiesRank = teamYouthFacilitiesRank;
        this.teamJuniorCoachingRank = teamJuniorCoachingRank;
        this.teamYouthRecruitmentRank = teamYouthRecruitmentRank;
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

    public void setTeamTrainingFacilitiesRank(int rank) {
        teamTrainingFacilitiesRank = rank;
    }

    public void setTeamYouthFacilitiesRank(int rank) {
        teamYouthFacilitiesRank = rank;
    }

    public void setTeamJuniorCoachingRank(int rank) {
        teamJuniorCoachingRank = rank;
    }

    public void setTeamYouthRecruitment(int rank) {
        teamYouthRecruitmentRank = rank;
    }

    /*1    Poor
//2    Basic
//3    Below Average
//4    Adequate
//5    Average
//6    Good
//7    Great
//8    Superb
//9    Excellent
//10  State of the Art*/
    public void setTrainingFacilitiesRanks(String teamTrainingFacilities) {
        String str = teamTrainingFacilities;
        switch (str) {
            case "Poor":
                setTeamTrainingFacilitiesRank(1);
                break;
            case "Basic":
                setTeamTrainingFacilitiesRank(2);
                break;
            case "Below Average":
                setTeamTrainingFacilitiesRank(3);
                break;
            case "Adequate":
                setTeamTrainingFacilitiesRank(4);
                break;
            case "Average":
                setTeamTrainingFacilitiesRank(5);
                break;
            case "Good":
                setTeamTrainingFacilitiesRank(6);
                break;
            case "Great":
                setTeamTrainingFacilitiesRank(7);
                break;
            case "Superb":
                setTeamTrainingFacilitiesRank(8);
                break;
            case "Excellent":
                setTeamTrainingFacilitiesRank(9);
                break;
            case "State Art":
                setTeamTrainingFacilitiesRank(10);
                break;
        }
    }

//1    Poor
//2    Basic
//3    Below Average
//4    Adequate
//5    Average
//6    Good
//7    Great
//8    Superb
//9    Excellent
//10  State of the Art
    public void setYouthFacilitiesRanks(String teamYouthFacilities) {
        String str = teamYouthFacilities;
        switch (str) {
            case "Poor":
                setTeamYouthFacilitiesRank(1);
                break;
            case "Basic":
                setTeamYouthFacilitiesRank(2);
                break;
            case "Below Average":
                setTeamYouthFacilitiesRank(3);
                break;
            case "Adequate":
                setTeamYouthFacilitiesRank(4);
                break;
            case "Average":
                setTeamYouthFacilitiesRank(5);
                break;
            case "Good":
                setTeamYouthFacilitiesRank(6);
                break;
            case "Great":
                setTeamYouthFacilitiesRank(7);
                break;
            case "Superb":
                setTeamYouthFacilitiesRank(8);
                break;
            case "Excellent":
                setTeamYouthFacilitiesRank(9);
                break;
            case "State Art":
                setTeamYouthFacilitiesRank(10);
                break;
        }
    }

//1    Minimal
//2    Fairly Basic
//3    Average
//4    Adequate
//5    Good
//6    Excellent
//7    Exceptional
    public void setJuniorCoachingRanks(String teamJuniorCoaching) {
        String str = teamJuniorCoaching;
        switch (str) {
            case "Minimal":
                setTeamTrainingFacilitiesRank(1);
                break;
            case "Fairly Basic":
                setTeamTrainingFacilitiesRank(2);
                break;
            case "Average":
                setTeamTrainingFacilitiesRank(3);
                break;
            case "Adequate":
                setTeamTrainingFacilitiesRank(4);
                break;
            case "Good":
                setTeamTrainingFacilitiesRank(5);
                break;
            case "Excellent":
                setTeamTrainingFacilitiesRank(6);
                break;
            case "Exceptional":
                setTeamTrainingFacilitiesRank(7);
                break;
        }
    }

//1    Limited
//2    Basic
//3    Fairly Basic
//4    Average
//5    Above Average
//6    Established
//7    Well Established
//8    Extensive
    public void setYouthRecruitmentRanks(String teamYouthRecruitment) {
        String str = teamYouthRecruitment;
        switch (str) {
            case "Limited":
                setTeamTrainingFacilitiesRank(1);
                break;
            case "Basic":
                setTeamTrainingFacilitiesRank(2);
                break;
            case "Fairly Basic":
                setTeamTrainingFacilitiesRank(3);
                break;
            case "Average":
                setTeamTrainingFacilitiesRank(4);
                break;
            case "Above Average":
                setTeamTrainingFacilitiesRank(5);
                break;
            case "Established":
                setTeamTrainingFacilitiesRank(6);
                break;
            case "Well Established":
                setTeamTrainingFacilitiesRank(7);
                break;
            case "Extensive":
                setTeamTrainingFacilitiesRank(8);
                break;
        }
    }

    @Override
    public String toString() {
        return ANSI_Color + "Team: " + teamName + "\nTeam League Name: " + teamLeagueName + "\nTraining Facilities: " + teamTrainingFacilities + "\nTeam Youth Facilities: " + teamYouthFacilities + "\nTeam Junior Coaching: " + teamJuniorCoaching + "\nTeam Youth Recruitment: " + teamYouthRecruitment + "\n";
    }
}
