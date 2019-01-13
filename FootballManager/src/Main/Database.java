package Main;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Database {

    private final String fileName;
    private ArrayList<Team> teamList;

    public Database(String fileName) {
        this.fileName = fileName;
        teamList = new ArrayList<Team>();
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
        readTeamList();
        br.close();
    }

    public void readTeamList() {
        for (Team t : teamList) {
            System.out.println(t.toString());
        }
    }
}
