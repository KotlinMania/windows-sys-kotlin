@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesCommunicationJniBridge {
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
        val stream = WindowsWin32DevicesCommunicationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(lpdef: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(lpdef: Long, lpdcb: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(lpdef: Long, lpdcb: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(lpdef: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationClearCommBreak(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationClearCommError(hfile: Long, lperrors: Long, lpstat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(lpszname: Long, hwnd: Long, lpcc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(lpszname: Long, hwnd: Long, lpcc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(hfile: Long, dwfunc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommConfig(hcommdev: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommMask(hfile: Long, lpevtmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(hfile: Long, lpmodemstat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommPorts(lpportnumbers: Long, uportnumberscount: Int, puportnumbersfound: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommProperties(hfile: Long, lpcommprop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommState(hfile: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(hfile: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(lpszname: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(lpszname: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationOpenCommPort(uportnumber: Int, dwdesiredaccess: Int, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationPurgeComm(hfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetCommBreak(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetCommConfig(hcommdev: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetCommMask(hfile: Long, dwevtmask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetCommState(hfile: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(hfile: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(lpszname: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(lpszname: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationSetupComm(hfile: Long, dwinqueue: Int, dwoutqueue: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationTransmitCommChar(hfile: Long, cchar: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesCommunicationWaitCommEvent(hfile: Long, lpevtmask: Long, lpoverlapped: Long): Int
}

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(lpdef.rawAddress, lpdcb.rawAddress)

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(lpdef.rawAddress, lpdcb.rawAddress, lpcommtimeouts.rawAddress)

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(lpdef.rawAddress, lpdcb.rawAddress, lpcommtimeouts.rawAddress)

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(lpdef.rawAddress, lpdcb.rawAddress)

public actual fun clearCommBreak(hfile: Handle): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationClearCommBreak(hfile.rawAddress)

public actual fun clearCommError(hfile: Handle, lperrors: MutPtr, lpstat: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationClearCommError(hfile.rawAddress, lperrors.rawAddress, lpstat.rawAddress)

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(lpszname.rawAddress, hwnd.rawAddress, lpcc.rawAddress)

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(lpszname.rawAddress, hwnd.rawAddress, lpcc.rawAddress)

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(hfile.rawAddress, dwfunc.toInt())

public actual fun getCommConfig(hcommdev: Handle, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommConfig(hcommdev.rawAddress, lpcc.rawAddress, lpdwsize.rawAddress)

public actual fun getCommMask(hfile: Handle, lpevtmask: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommMask(hfile.rawAddress, lpevtmask.rawAddress)

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(hfile.rawAddress, lpmodemstat.rawAddress)

public actual fun getCommPorts(lpportnumbers: MutPtr, uportnumberscount: UInt, puportnumbersfound: MutPtr): UInt =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommPorts(lpportnumbers.rawAddress, uportnumberscount.toInt(), puportnumbersfound.rawAddress).toUInt()

public actual fun getCommProperties(hfile: Handle, lpcommprop: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommProperties(hfile.rawAddress, lpcommprop.rawAddress)

public actual fun getCommState(hfile: Handle, lpdcb: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommState(hfile.rawAddress, lpdcb.rawAddress)

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(hfile.rawAddress, lpcommtimeouts.rawAddress)

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(lpszname.rawAddress, lpcc.rawAddress, lpdwsize.rawAddress)

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(lpszname.rawAddress, lpcc.rawAddress, lpdwsize.rawAddress)

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    MutPtr(WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationOpenCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt()))

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationPurgeComm(hfile.rawAddress, dwflags.toInt())

public actual fun setCommBreak(hfile: Handle): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetCommBreak(hfile.rawAddress)

public actual fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr, dwsize: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetCommConfig(hcommdev.rawAddress, lpcc.rawAddress, dwsize.toInt())

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetCommMask(hfile.rawAddress, dwevtmask.toInt())

public actual fun setCommState(hfile: Handle, lpdcb: ConstPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetCommState(hfile.rawAddress, lpdcb.rawAddress)

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(hfile.rawAddress, lpcommtimeouts.rawAddress)

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(lpszname.rawAddress, lpcc.rawAddress, dwsize.toInt())

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(lpszname.rawAddress, lpcc.rawAddress, dwsize.toInt())

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationSetupComm(hfile.rawAddress, dwinqueue.toInt(), dwoutqueue.toInt())

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationTransmitCommChar(hfile.rawAddress, cchar)

public actual fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr, lpoverlapped: MutPtr): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssysWindowsWin32DevicesCommunicationWaitCommEvent(hfile.rawAddress, lpevtmask.rawAddress, lpoverlapped.rawAddress)
