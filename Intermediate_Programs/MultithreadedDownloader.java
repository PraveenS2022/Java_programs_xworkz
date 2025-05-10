class Downloader extends Thread {
    String file;
    Downloader(String file) {
        this.file = file;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Downloading " + file + ": " + (i * 20) + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(file + " Download Complete");
    }
}
public class MultithreadedDownloader {
    public static void main(String[] args) {
        Downloader d1 = new Downloader("file1.mp4");
        Downloader d2 = new Downloader("file2.mp4");
        d1.start();
        d2.start();
    }
}