public class MonthlyMembership extends Membership {
    private int duration;

    public MonthlyMembership(int membershipId, int memberId, int duration) {
        super(membershipId, memberId);
        this.duration = duration;
    }

    @Override
    public double getCost() {
        return duration * 30.0;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, Cost: " + getCost() + ", Duration: " + duration + " months";
    }
}