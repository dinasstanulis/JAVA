import java.util.ArrayList;
import java.util.List;

public class GymClass {
    private String className;
    private String schedule;
    private List<Member> enrolledMembers;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<>();
    }

    public void enroll(Member member) {
        enrolledMembers.add(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(className).append(" (").append(schedule).append(")");
        if (!enrolledMembers.isEmpty()) {
            sb.append(": ");
            for (int i = 0; i < enrolledMembers.size(); i++) {
                sb.append(enrolledMembers.get(i));
                if (i < enrolledMembers.size() - 1) sb.append(", ");
            }
        }
        return sb.toString();
    }
}