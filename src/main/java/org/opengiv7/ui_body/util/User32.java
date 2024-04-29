package org.opengiv7.ui_body.util;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.platform.win32.WinDef.HWND;

public interface User32 extends StdCallLibrary {
    User32 INSTANCE = (User32) Native.load("user32", User32.class);
    boolean SetForegroundWindow(HWND hWnd);
}
