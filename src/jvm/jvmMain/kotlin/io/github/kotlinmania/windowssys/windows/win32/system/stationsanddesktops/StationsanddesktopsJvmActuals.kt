@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

private object WindowsWin32SystemStationsanddesktopsJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemStationsanddesktopsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long, pbsminfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long, pbsminfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(hdesktop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(hwinsta: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long, ulheapsize: Int, pvoid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long, ulheapsize: Int, pvoid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(lpwinsta: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(lpwinsta: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(hwinsta: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(hwinsta: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(dwthreadid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(lpszdesktop: Long, dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(lpszdesktop: Long, dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(lpszwinsta: Long, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(lpszwinsta: Long, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(hwinsta: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(hdesktop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(hdesktop: Long): Int
}

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(flags.toInt(), lpinfo.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(flags.toInt(), lpinfo.rawAddress, msg.toInt(), wparam.toLong(), lparam, pbsminfo.rawAddress)

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(flags.toInt(), lpinfo.rawAddress, msg.toInt(), wparam.toLong(), lparam, pbsminfo.rawAddress)

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(flags.toInt(), lpinfo.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(hdesktop.rawAddress)

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(hwinsta.rawAddress)

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(lpszdesktop.rawAddress, lpszdevice.rawAddress, pdevmode.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress))

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(lpszdesktop.rawAddress, lpszdevice.rawAddress, pdevmode.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress, ulheapsize.toInt(), pvoid.rawAddress))

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(lpszdesktop.rawAddress, lpszdevice.rawAddress, pdevmode.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress, ulheapsize.toInt(), pvoid.rawAddress))

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(lpszdesktop.rawAddress, lpszdevice.rawAddress, pdevmode.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress))

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(lpwinsta.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress))

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(lpwinsta.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress))

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    0

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(hwinsta.rawAddress, 0L, lparam)

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(hwinsta.rawAddress, 0L, lparam)

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(0L, lparam)

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(0L, lparam)

public actual fun getProcessWindowStation(): Hwinsta =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation())

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(dwthreadid.toInt()))

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(hobj.rawAddress, nindex, pvinfo.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(hobj.rawAddress, nindex, pvinfo.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(lpszdesktop.rawAddress, dwflags.toInt(), finherit, dwdesiredaccess.toInt()))

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(lpszdesktop.rawAddress, dwflags.toInt(), finherit, dwdesiredaccess.toInt()))

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()))

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(lpszwinsta.rawAddress, finherit, dwdesiredaccess.toInt()))

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    MutPtr(WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(lpszwinsta.rawAddress, finherit, dwdesiredaccess.toInt()))

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(hwinsta.rawAddress)

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(hdesktop.rawAddress)

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(hobj.rawAddress, nindex, pvinfo.rawAddress, nlength.toInt())

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(hobj.rawAddress, nindex, pvinfo.rawAddress, nlength.toInt())

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(hdesktop.rawAddress)
