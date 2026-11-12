@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge {
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
        val stream = WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost: Long, manager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid: Long, dbgengoptions: Int, iface: Long): Int
}

public actual fun createDataModelManager(debughost: MutPtr<CVoid>, manager: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost.rawAddress, manager.rawAddress)

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions.rawAddress, interfaceid.rawAddress, iface.rawAddress)

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions.rawAddress, interfaceid.rawAddress, iface.rawAddress)

public actual fun debugCreate(interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid.rawAddress, iface.rawAddress)

public actual fun debugCreateEx(interfaceid: ConstPtr<Guid>, dbgengoptions: UInt, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid.rawAddress, dbgengoptions.toInt(), iface.rawAddress)
