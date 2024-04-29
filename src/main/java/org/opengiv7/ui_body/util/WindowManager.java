package org.opengiv7.ui_body.util;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
public class WindowManager {

    public static void bringToFront(String windowHandle) {
        windowHandle = windowHandle.contains("0x") ? windowHandle.substring(2) : windowHandle;

        HWND hwnd = new HWND(new Pointer(Long.parseLong(windowHandle.substring(2), 16))); // Parse as base 16

        if (!User32.INSTANCE.SetForegroundWindow(hwnd)) {
            System.out.println("Unable to bring window to front");
        }

    }


}
