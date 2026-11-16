@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

private object WindowsWin32SystemComponentservicesJniBridge {
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
        val stream = WindowsWin32SystemComponentservicesJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComponentservicesSafeRef(rid: Long, punk: Long): Long
}

public actual fun coCreateActivity(piunknown: MutPtr, riid: ConstPtr, ppobj: MutPtr): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown.rawAddress, riid.rawAddress, ppobj.rawAddress)

public actual fun coEnterServiceDomain(pconfigobject: MutPtr): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject.rawAddress)

public actual fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype, riid.rawAddress, ppv.rawAddress)

public actual fun coLeaveServiceDomain(punkstatus: MutPtr) {
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus.rawAddress)
}

public actual fun getDispenserManager(param0: MutPtr): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0.rawAddress)

public actual fun getManagedExtensions(dwexts: MutPtr): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts.rawAddress)

public actual fun mTSCreateActivity(riid: ConstPtr, ppobj: MutPtr): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid.rawAddress, ppobj.rawAddress)

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode)

public actual fun safeRef(rid: ConstPtr, punk: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemComponentservicesJniBridge.windowssysWindowsWin32SystemComponentservicesSafeRef(rid.rawAddress, punk.rawAddress))
