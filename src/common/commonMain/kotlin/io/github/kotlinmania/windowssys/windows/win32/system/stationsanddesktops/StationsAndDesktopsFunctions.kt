package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: PCSTR, param1: Foundation.LPARAM): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: PCWSTR, param1: Foundation.LPARAM): BOOL
}

public fun BroadcastSystemMessageA(flags: UInt, lpinfo: Long, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("user32.dll", "BroadcastSystemMessageA", longArrayOf(flags.toLong(), lpinfo, msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun BroadcastSystemMessageExA(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, pbsminfo: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "BroadcastSystemMessageExA", longArrayOf(flags.toLong(), lpinfo, msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), pbsminfo)).toInt()
}

public fun BroadcastSystemMessageExW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, pbsminfo: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "BroadcastSystemMessageExW", longArrayOf(flags.toLong(), lpinfo, msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), pbsminfo)).toInt()
}

public fun BroadcastSystemMessageW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("user32.dll", "BroadcastSystemMessageW", longArrayOf(flags.toLong(), lpinfo, msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun CloseDesktop(hdesktop: HDESK): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CloseDesktop", longArrayOf(hdesktop)).toInt()
}

public fun CloseWindowStation(hwinsta: HWINSTA): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CloseWindowStation", longArrayOf(hwinsta)).toInt()
}

public fun CreateDesktopA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "CreateDesktopA", longArrayOf(lpszdesktop, lpszdevice, pdevmode, dwflags.toLong(), dwdesiredaccess.toLong(), lpsa))
}

public fun CreateDesktopExA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "CreateDesktopExA", longArrayOf(lpszdesktop, lpszdevice, pdevmode, dwflags.toLong(), dwdesiredaccess.toLong(), lpsa, ulheapsize.toLong(), pvoid))
}

public fun CreateDesktopExW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "CreateDesktopExW", longArrayOf(lpszdesktop, lpszdevice, pdevmode, dwflags.toLong(), dwdesiredaccess.toLong(), lpsa, ulheapsize.toLong(), pvoid))
}

public fun CreateDesktopW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "CreateDesktopW", longArrayOf(lpszdesktop, lpszdevice, pdevmode, dwflags.toLong(), dwdesiredaccess.toLong(), lpsa))
}

public fun CreateWindowStationA(lpwinsta: PCSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA {
    return Win32DynamicFfi.invoke("user32.dll", "CreateWindowStationA", longArrayOf(lpwinsta, dwflags.toLong(), dwdesiredaccess.toLong(), lpsa))
}

public fun CreateWindowStationW(lpwinsta: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA {
    return Win32DynamicFfi.invoke("user32.dll", "CreateWindowStationW", longArrayOf(lpwinsta, dwflags.toLong(), dwdesiredaccess.toLong(), lpsa))
}

public fun EnumDesktopWindows(hdesktop: HDESK, lpfn: UI.WindowsAndMessaging.WNDENUMPROC, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDesktopWindows", longArrayOf(hdesktop, Win32DynamicFfi.objectSlot(lpfn), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumDesktopsA(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCA, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDesktopsA", longArrayOf(hwinsta, Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumDesktopsW(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCW, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDesktopsW", longArrayOf(hwinsta, Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumWindowStationsA(lpenumfunc: WINSTAENUMPROCA, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumWindowStationsA", longArrayOf(Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumWindowStationsW(lpenumfunc: WINSTAENUMPROCW, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumWindowStationsW", longArrayOf(Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun GetProcessWindowStation(): HWINSTA {
    return Win32DynamicFfi.invoke("user32.dll", "GetProcessWindowStation", longArrayOf())
}

public fun GetThreadDesktop(dwthreadid: UInt): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "GetThreadDesktop", longArrayOf(dwthreadid.toLong()))
}

public fun GetUserObjectInformationA(hobj: Foundation.HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetUserObjectInformationA", longArrayOf(Win32DynamicFfi.objectSlot(hobj), nindex.toLong(), pvinfo, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun GetUserObjectInformationW(hobj: Foundation.HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetUserObjectInformationW", longArrayOf(Win32DynamicFfi.objectSlot(hobj), nindex.toLong(), pvinfo, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun OpenDesktopA(lpszdesktop: PCSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "OpenDesktopA", longArrayOf(lpszdesktop, dwflags.toLong(), finherit.toLong(), dwdesiredaccess.toLong()))
}

public fun OpenDesktopW(lpszdesktop: PCWSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "OpenDesktopW", longArrayOf(lpszdesktop, dwflags.toLong(), finherit.toLong(), dwdesiredaccess.toLong()))
}

public fun OpenInputDesktop(dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: DESKTOP_ACCESS_FLAGS): HDESK {
    return Win32DynamicFfi.invoke("user32.dll", "OpenInputDesktop", longArrayOf(dwflags.toLong(), finherit.toLong(), dwdesiredaccess.toLong()))
}

public fun OpenWindowStationA(lpszwinsta: PCSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA {
    return Win32DynamicFfi.invoke("user32.dll", "OpenWindowStationA", longArrayOf(lpszwinsta, finherit.toLong(), dwdesiredaccess.toLong()))
}

public fun OpenWindowStationW(lpszwinsta: PCWSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA {
    return Win32DynamicFfi.invoke("user32.dll", "OpenWindowStationW", longArrayOf(lpszwinsta, finherit.toLong(), dwdesiredaccess.toLong()))
}

public fun SetProcessWindowStation(hwinsta: HWINSTA): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetProcessWindowStation", longArrayOf(hwinsta)).toInt()
}

public fun SetThreadDesktop(hdesktop: HDESK): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetThreadDesktop", longArrayOf(hdesktop)).toInt()
}

public fun SetUserObjectInformationA(hobj: Foundation.HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetUserObjectInformationA", longArrayOf(Win32DynamicFfi.objectSlot(hobj), nindex.toLong(), pvinfo, nlength.toLong())).toInt()
}

public fun SetUserObjectInformationW(hobj: Foundation.HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetUserObjectInformationW", longArrayOf(Win32DynamicFfi.objectSlot(hobj), nindex.toLong(), pvinfo, nlength.toLong())).toInt()
}

public fun SwitchDesktop(hdesktop: HDESK): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SwitchDesktop", longArrayOf(hdesktop)).toInt()
}
