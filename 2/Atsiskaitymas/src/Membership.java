public abstract class Membership {
    private int membershipId;
    int memberId;

    public Membership(int membershipId, int memberId) {
        this.membershipId = membershipId;
        this.memberId = memberId;
    }

    public abstract double getCost();

}