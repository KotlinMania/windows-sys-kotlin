@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

private object WindowsWin32UiInputJniBridge {
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
        val stream = WindowsWin32UiInputJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32UiInputDefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputData(hrawinput: Long, uicommand: Int, pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices: Long, uinumdevices: Int, cbsize: Int): Int
}

public actual fun defRawInputProc(parawinput: ConstPtr<ConstPtr<Rawinput>>, ninput: Int, cbsizeheader: UInt): Lresult =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputDefRawInputProc(parawinput.rawAddress, ninput, cbsizeheader.toInt())

public actual fun getCIMSSM(inputmessagesource: MutPtr<InputMessageSource>): Bool =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource.rawAddress)

public actual fun getCurrentInputMessageSource(inputmessagesource: MutPtr<InputMessageSource>): Bool =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource.rawAddress)

public actual fun getRawInputBuffer(pdata: MutPtr<Rawinput>, pcbsize: MutPtr<UInt>, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputBuffer(pdata.rawAddress, pcbsize.rawAddress, cbsizeheader.toInt()).toUInt()

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputData(hrawinput.rawAddress, uicommand.toInt(), pdata.rawAddress, pcbsize.rawAddress, cbsizeheader.toInt()).toUInt()

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice.rawAddress, uicommand.toInt(), pdata.rawAddress, pcbsize.rawAddress).toUInt()

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice.rawAddress, uicommand.toInt(), pdata.rawAddress, pcbsize.rawAddress).toUInt()

public actual fun getRawInputDeviceList(prawinputdevicelist: MutPtr<Rawinputdevicelist>, puinumdevices: MutPtr<UInt>, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist.rawAddress, puinumdevices.rawAddress, cbsize.toInt()).toUInt()

public actual fun getRegisteredRawInputDevices(prawinputdevices: MutPtr<Rawinputdevice>, puinumdevices: MutPtr<UInt>, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices.rawAddress, puinumdevices.rawAddress, cbsize.toInt()).toUInt()

public actual fun registerRawInputDevices(prawinputdevices: ConstPtr<Rawinputdevice>, uinumdevices: UInt, cbsize: UInt): Bool =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices.rawAddress, uinumdevices.toInt(), cbsize.toInt())
