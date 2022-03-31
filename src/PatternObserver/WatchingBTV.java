package PatternObserver;

public class WatchingBTV extends Watcher{

    public WatchingBTV(Broadcaster broadcaster, int identifier) {
        this.broadcaster = broadcaster;
        this.broadcaster.attach(this);
        this.identifier = identifier;
    }

    @Override
    public void watch(int input) {
        System.out.println("Watching BTV from: " + broadcaster.getTime_count());
    }
}
