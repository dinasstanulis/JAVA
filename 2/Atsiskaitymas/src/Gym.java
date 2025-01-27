import java.util.HashMap;
import java.util.Map;

public class Gym {
    private Map<Integer, Member> members;
    private Map<Integer, Membership> memberships;
    private Map<String, GymClass> gymClasses;

    public Gym() {
        members = new HashMap<>();
        memberships = new HashMap<>();
        gymClasses = new HashMap<>();
    }

    public void addMember(int id, String name, int age) {
        members.put(id, new Member(id, name, age));
    }

    public void assignMembership(Membership membership) {
        memberships.put(membership.memberId, membership);
    }

    public void addGymClass(String className, String schedule) {
        gymClasses.put(className, new GymClass(className, schedule));
    }

    public void enrollMemberInClass(int memberId, String className) {
        if (!members.containsKey(memberId)) {
            System.out.println("Member ID not found.");
            return;
        }
        if (!gymClasses.containsKey(className)) {
            System.out.println("Class not found.");
            return;
        }
        gymClasses.get(className).enroll(members.get(memberId));
    }

    public void printMembers() {
        System.out.println("Members:");
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    public void printMemberships() {
        System.out.println("Memberships:");
        for (Membership membership : memberships.values()) {
            System.out.println(membership);
        }
    }

    public void printClassEnrollments() {
        System.out.println("Class Enrollments:");
        for (GymClass gymClass : gymClasses.values()) {
            System.out.println(gymClass);
        }
    }
}