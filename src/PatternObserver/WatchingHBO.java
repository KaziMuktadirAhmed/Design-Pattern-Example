package PatternObserver;

public class WatchingHBO extends  Watcher{

    public WatchingHBO(Broadcaster broadcaster, int identifier) {
        this.broadcaster = broadcaster;
        this.broadcaster.attach(this);
        this.indentifier = identifier;
    }

    @Override
    public void watch(int input) {
        System.out.println("Watching HBO from: " + broadcaster.getTime_count());
    }
}
