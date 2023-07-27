package Adapter;

import Singleton.Logger;

public class Computer {
    private static final Logger log = Logger.getInstance();
    private UsbDevice usbDevice;

    // аггрегация (не композиция)
    public void connectUsbDevice(UsbDevice usbDevice) {
        this.usbDevice = usbDevice;
    }

    public void printInfoFromUsb() {
        if(usbDevice == null)
            throw new RuntimeException("No usb device detected");
        log.classLogg(usbDevice, usbDevice.readInfo());
    }
}
