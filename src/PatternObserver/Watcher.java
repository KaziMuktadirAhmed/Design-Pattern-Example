package PatternObserver;

public abstract class Watcher {
    protected Broadcaster broadcaster;
    protected int indentifier;
    public abstract void watch(int input);
}
