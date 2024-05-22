import java.util.List;

public class Game {
    private String gameName;
    private String patron;
    private double facilitationFee;
    private List<String> teamMembers;

     //Constructors, getters, and setters

    public Game(String gameName, String patron, double facilitationFee, List<String> teamMembers) {
        this.gameName = gameName;
        this.patron = patron;
        this.facilitationFee = facilitationFee;
        this.teamMembers = teamMembers;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public double getFacilitationFee() {
        return facilitationFee;
    }

    public void setFacilitationFee(double facilitationFee) {
        this.facilitationFee = facilitationFee;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<String> teamMembers) {
        this.teamMembers = teamMembers;
    }
}