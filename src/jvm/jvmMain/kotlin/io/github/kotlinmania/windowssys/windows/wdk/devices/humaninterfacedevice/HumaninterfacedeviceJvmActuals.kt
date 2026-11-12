@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkDevicesHumaninterfacedeviceJniBridge {
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
        val stream = WindowsWdkDevicesHumaninterfacedeviceJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(vhfconfig: Long, vhfhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(vhfhandle: Long, wait: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(vhfhandle: Long): Int
}

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr, completionstatus: Ntstatus): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(vhfoperationhandle.rawAddress, completionstatus)

public actual fun vhfCreate(vhfconfig: ConstPtr, vhfhandle: MutPtr): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(vhfconfig.rawAddress, vhfhandle.rawAddress)

public actual fun vhfDelete(vhfhandle: ConstPtr, wait: Boolean) {
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(vhfhandle.rawAddress, wait)
}

public actual fun vhfReadReportSubmit(vhfhandle: ConstPtr, hidtransferpacket: ConstPtr): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(vhfhandle.rawAddress, hidtransferpacket.rawAddress)

public actual fun vhfStart(vhfhandle: ConstPtr): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(vhfhandle.rawAddress)
