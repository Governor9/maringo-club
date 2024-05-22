public class Transaction {
    private ClubMember clubMember;
    private Game game;
    private Item item;
    private String transactionDetails;
    private String paymentMethod;

    // Constructors, getters, and setters


    public Transaction(ClubMember clubMember, Game game, Item item, String transactionDetails, String paymentMethod) {
        this.clubMember = clubMember;
        this.game = game;
        this.item = item;
        this.transactionDetails = transactionDetails;
        this.paymentMethod = paymentMethod;
    }

    public ClubMember getClubMember() {
        return clubMember;
    }

    public void setClubMember(ClubMember clubMember) {
        this.clubMember = clubMember;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double calculateDiscountedPrice() {
        // Logic for calculating discounted price
        return 0.0;
    }

    public double calculateSurcharge() {
        // Logic for calculating surcharge
        return 0.0;
    }

    public double calculateFacilitationFee() {
        // Logic for calculating facilitation fee
        return 0.0;
    }
}