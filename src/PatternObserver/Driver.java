package PatternObserver;

public class Driver {
    public static void main(String[] args) {
        System.out.println("observer print");
        run();
    }

    public static void run () {
        Broadcaster broadcaster = new Broadcaster();

        WatchingBTV btv = new WatchingBTV(broadcaster, 0);
        WatchingHBO hbo = new WatchingHBO(broadcaster, 4);
        WatchingNatGEO natGEO = new WatchingNatGEO(broadcaster, 7);

        broadcaster.start_time();
    }
}
