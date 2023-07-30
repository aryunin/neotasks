package adapter;

public class MemoryCardAdapter implements UsbDevice{
    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public String readInfo() {
        return memoryCard.readInfo();
    }
}
