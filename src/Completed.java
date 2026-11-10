/** Whether a task is done. Not completed (false) comes BEFORE completed (true). */
public class Completed implements Comparable<Completed> {
    private final boolean done;

    public Completed(boolean done) { this.done = done; }

    public boolean isDone() { return done; }

    /**
     * TODO: Compare this to other.
     * Order: false (not done) < true (done).
     * Return negative / 0 / positive, and throw NullPointerException if other is null.
     */
    @Override
    public int compareTo(Completed other) {
        if (other == null) throw new NullPointerException();
        if (this.isDone() == other.isDone()) return 0;
        if (this.isDone() && !other.isDone()) return 1;
        return -1;
    }

    @Override
    public String toString() { return done ? "done" : "not done"; }
}
