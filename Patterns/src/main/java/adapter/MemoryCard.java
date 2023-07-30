package adapter;

public class MemoryCard {
    private final String info;

    public MemoryCard(String info) {
        this.info = info;
    }

    public String readInfo() {
        return info;
    }
}
