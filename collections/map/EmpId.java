public class EmpId implements Comparable<EmpId> {
    int id;
    public EmpId(int id) {
        this.id = id;
    }
    @Override
    public int hashCode() {
        return this.id;
    }
    @Override
    public boolean equals(Object obj) {
        EmpId other = (EmpId) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(EmpId eid) {
        return Integer.compare(this.id, eid.id);
    }

    @Override 
    public String toString() {
        return "EmpId: " + this.id;
    }
}
