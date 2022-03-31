package PatternObserver;

public class WatchingNatGEO extends Watcher{

    public WatchingNatGEO(Broadcaster broadcaster, int identifier) {
        this.broadcaster = broadcaster;
        this.broadcaster.attach(this);
        this.indentifier = identifier;
    }

    @Override
    public void watch(int input) {
        System.out.println("Watching NatGEO from: " + broadcaster.getTime_count());
    }
}
