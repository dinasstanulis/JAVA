public abstract class Membership {
    private int membershipId;
    private int memberId;

    public Membership(int membershipId, int memberId) {
        this.membershipId = membershipId;
        this.memberId = memberId;
    }

    public abstract double getCost();

}