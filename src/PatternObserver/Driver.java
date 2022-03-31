package PatternObserver;

public class Driver {
    public static void main(String[] args) {
        System.out.println("observer print");
        run();
    }

    public static void run () {
        Broadcaster broadcaster = new Broadcaster();

        WatchingBTV btv = new WatchingBTV(broadcaster, 4);
        WatchingHBO hbo = new WatchingHBO(broadcaster, 7);
        WatchingNatGEO natGEO = new WatchingNatGEO(broadcaster, 10);

        broadcaster.start_time();
    }
}
