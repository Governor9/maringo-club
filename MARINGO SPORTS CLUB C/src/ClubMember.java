public class ClubMember {
    private String fullName;
    private String gender;
    private String dob;
    private String contactDetails;
    private String subCounties;
    private String schoolOrCollege;
    private String gamesOfInterest;
    private String specialNeeds;
    private String membershipType;

    public ClubMember(String fullName, String gender, String dob,
                      String contactDetails, String subCounties, String schoolOrCollege,
                      String gamesOfInterest,String specialNeeds, String membershipType) {
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.contactDetails = contactDetails;
        this.subCounties = subCounties;
        this.schoolOrCollege = schoolOrCollege;
        this.gamesOfInterest = gamesOfInterest;
        this.specialNeeds = specialNeeds;
        this.membershipType = membershipType;
    }

    // Constructors, getters, and setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getSubCounties() {
        return subCounties;
    }

    public void setSubCounties(String subCounties) {
        this.subCounties = subCounties;
    }

    public String getSchoolOrCollege() {
        return schoolOrCollege;
    }

    public void setSchoolOrCollege(String schoolOrCollege) {
        this.schoolOrCollege = schoolOrCollege;
    }

    public String getGamesOfInterest() {
        return gamesOfInterest;
    }

    public void setGamesOfInterest(String gamesOfInterest) {
        this.gamesOfInterest = gamesOfInterest;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}