@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesEnumerationPnpJniBridge {
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
        val stream = WindowsWin32DevicesEnumerationPnpJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname: Long, pszparentdeviceinstance: Long, pcreateinfo: Long, cpropertycount: Int, pproperties: Long, pcallback: Long, pcontext: Long, phswdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice: Long, plifetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice: Long, pszdeviceinterfaceid: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice: Long, pinterfaceclassguid: Long, pszreferencestring: Long, cpropertycount: Int, pproperties: Long, fenabled: Int, ppszdeviceinterfaceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice: Long, pszdeviceinterfaceid: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice: Long, lifetime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem: Long)
}

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice.rawAddress)
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr, cpropertycount: UInt, pproperties: ConstPtr, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr, phswdevice: MutPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname.rawAddress, pszparentdeviceinstance.rawAddress, pcreateinfo.rawAddress, cpropertycount.toInt(), pproperties.rawAddress, 0L, pcontext.rawAddress, phswdevice.rawAddress)

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice.rawAddress, plifetime.rawAddress)

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice.rawAddress, pszdeviceinterfaceid.rawAddress, cpropertycount.toInt(), pproperties.rawAddress)

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr, fenabled: Bool, ppszdeviceinterfaceid: MutPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice.rawAddress, pinterfaceclassguid.rawAddress, pszreferencestring.rawAddress, cpropertycount.toInt(), pproperties.rawAddress, fenabled, ppszdeviceinterfaceid.rawAddress)

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice.rawAddress, pszdeviceinterfaceid.rawAddress, fenabled)

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice.rawAddress, cpropertycount.toInt(), pproperties.rawAddress)

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice.rawAddress, lifetime)

public actual fun swMemFree(pmem: ConstPtr) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem.rawAddress)
}
