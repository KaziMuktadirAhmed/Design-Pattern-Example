package PatternObserver;

public abstract class Watcher {
    protected Broadcaster broadcaster;
    protected int identifier;
    public abstract void watch(int input);
}
