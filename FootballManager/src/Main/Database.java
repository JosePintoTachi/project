package Main;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {

    private final String fileName;
    private ArrayList<Team> teamList;
    private ArrayList<Team> teamListRanks;

    public Database(String fileName) {
        this.fileName = fileName;
        teamList = new ArrayList<Team>();
        teamListRanks = new ArrayList<Team>();
    }

    public void readFile(Charset cs) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, cs);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] teamSpecs = line.split(",");
            //Spliting line for specs. 
            String teamName = teamSpecs[0];
            String teamLeagueName = teamSpecs[1];
            String teamTrainingFacilities = teamSpecs[2];
            String teamYouthFacilities = teamSpecs[3];
            String teamJuniorCoaching = teamSpecs[4];
            String teamYouthRecruitment = teamSpecs[5];
            //Creating new Team and adding it to the ArrayList.
            Team t = new Team(teamName, teamLeagueName, teamTrainingFacilities, teamYouthFacilities, teamJuniorCoaching, teamYouthRecruitment);
            teamList.add(t);
            //System.out.println(line);
        }
        //readTeamList();
        getTeamRanks();
        br.close();
    }

    public void readTeamList() {
        for (Team t : teamList) {
            System.out.println(t.toString());
        }
    }

    public void getTeamRanks() {
        for (Team t : teamList) {
            String rankTrainingFacilities = t.getTrainingFacilities();
            String rankYouthFacilities = t.getYouthFacilities();
            String rankJuniorCoaching = t.getJuniorCoaching();
            String rankYouthRecruitment = t.getYouthRecruitment();

            t.setTrainingFacilitiesRanks(rankTrainingFacilities);
            t.setJuniorCoachingRanks(rankJuniorCoaching);
            t.setYouthFacilitiesRanks(rankYouthFacilities);
            t.setYouthRecruitmentRanks(rankYouthRecruitment);

            Team t1 = new Team(t.getTeamName(), t.getLeagueName(), t.getTrainingFacilitiesRank(), t.getYouthFacilitiesRank(), t.getJuniorCoachingRank(), t.getYouthRecruitmentRank());
            teamListRanks.add(t1);
            System.out.println(t1.displayTeamRanks());
            double teamMedia = t1.calcRankTeams();
            System.out.printf("Team Media : %.2f", teamMedia);
            System.out.println("\n");
        }
    }
}
