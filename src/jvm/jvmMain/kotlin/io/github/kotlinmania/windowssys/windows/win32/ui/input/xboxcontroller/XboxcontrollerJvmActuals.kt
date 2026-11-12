@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32UiInputXboxcontrollerJniBridge {
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
        val stream = WindowsWin32UiInputXboxcontrollerJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex: Int, prenderdeviceid: Long, prendercount: Long, pcapturedeviceid: Long, pcapturecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex: Int, devtype: Byte, pbatteryinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex: Int, dwflags: Int, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex: Int, dwreserved: Int, pkeystroke: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex: Int, pstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex: Int, pvibration: Long): Int
}

public actual fun xInputEnable(enable: Bool) {
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable)
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: MutPtr<UInt>, pcapturedeviceid: Pwstr, pcapturecount: MutPtr<UInt>): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex.toInt(), prenderdeviceid.rawAddress, prendercount.rawAddress, pcapturedeviceid.rawAddress, pcapturecount.rawAddress).toUInt()

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: MutPtr<XinputBatteryInformation>): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex.toInt(), devtype.toByte(), pbatteryinformation.rawAddress).toUInt()

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: MutPtr<XinputCapabilities>): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), pcapabilities.rawAddress).toUInt()

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: MutPtr<XinputKeystroke>): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), pkeystroke.rawAddress).toUInt()

public actual fun xInputGetState(dwuserindex: UInt, pstate: MutPtr<XinputState>): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex.toInt(), pstate.rawAddress).toUInt()

public actual fun xInputSetState(dwuserindex: UInt, pvibration: ConstPtr<XinputVibration>): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex.toInt(), pvibration.rawAddress).toUInt()
