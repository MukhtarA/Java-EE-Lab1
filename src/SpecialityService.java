import java.util.ArrayList;
import java.util.List;

public class SpecialityService {
    public List getAvailableGroups(SpecialityType type) {
        List groups = new ArrayList();
        if (type.equals(SpecialityType.IS)) {
            groups.add("IS-1809");
            groups.add("IS-1805");
            groups.add("IS-1812");
            groups.add("IS-1802");
        } else if (type.equals(SpecialityType.SIS)) {
            groups.add("SIS-1809");
            groups.add("SIS-1805");
            groups.add("SIS-1812");
            groups.add("SIS-1802");
        } else if (type.equals(SpecialityType.Jour)) {
            groups.add("Jour-1801");
            groups.add("Jour-1802");
            groups.add("Jour-1803");
        } else {
            groups.add("No group Available");
        }
        return groups;
    }
}
