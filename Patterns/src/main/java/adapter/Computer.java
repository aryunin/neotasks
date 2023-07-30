package adapter;

import singleton.Logger;

public class Computer {
    private static final Logger log = Logger.getInstance();
    private UsbDevice usbDevice;

    public Computer() {
    }

    public Computer(UsbDevice usbDevice) {
        this.usbDevice = usbDevice;
    }

    public UsbDevice getUsbDevice() {
        return usbDevice;
    }

    public void setUsbDevice(UsbDevice usbDevice) {
        this.usbDevice = usbDevice;
    }

    public void printInfoFromUsb() {
        if(usbDevice == null)
            throw new RuntimeException("No usb device detected");
        log.classLogg(usbDevice, usbDevice.readInfo());
    }
}
