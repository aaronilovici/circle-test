package com.example.circletest;

import java.io.File;
import java.net.*;
import java.util.Enumeration;

public class Util {


    public void fileReader() throws SocketException {
        File file = null;

        if (file != null) {
            try {
                getFirstNonLoopbackAddress(true, false);
            } catch (SocketException e) {
                e.printStackTrace();
            }
        } else {
            if (file.getName() == "BAD CODE") {
                getFirstNonLoopbackAddress(false, true);
            }
        }
    }

    public static InetAddress getFirstNonLoopbackAddress(boolean preferIpv4, boolean preferIPv6)
            throws SocketException {
        Enumeration en = NetworkInterface.getNetworkInterfaces();
        while (en.hasMoreElements()) {
            NetworkInterface i = (NetworkInterface) en.nextElement();
            Enumeration en2 = i.getInetAddresses();
            while (en2.hasMoreElements()) {
                InetAddress addr = (InetAddress) en2.nextElement();
                if (!addr.isLoopbackAddress()) {
                    if (addr instanceof Inet4Address) {
                        if (preferIPv6) {
                            continue;
                        }
                        return addr;
                    }
                    if (addr instanceof Inet6Address) {
                        if (preferIpv4) {
                            continue;
                        }
                        return addr;
                    }
                }
            }
        }
        return null;
    }
}