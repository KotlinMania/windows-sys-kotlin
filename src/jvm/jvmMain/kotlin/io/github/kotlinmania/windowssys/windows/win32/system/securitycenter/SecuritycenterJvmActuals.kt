@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

private object WindowsWin32SystemSecuritycenterJniBridge {
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
        val stream = WindowsWin32SystemSecuritycenterJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(ppszuri: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(providers: Int, phealth: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(hregistrationhandle: Long): Int
}

public actual fun wscGetAntiMalwareUri(ppszuri: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(ppszuri.rawAddress)

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr<WscSecurityProviderHealth>): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(providers.toInt(), phealth.rawAddress)

public actual fun wscQueryAntiMalwareUri(): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri()

public actual fun wscRegisterForChanges(reserved: MutPtr<CVoid>, phcallbackregistration: MutPtr<Handle>, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(reserved.rawAddress, phcallbackregistration.rawAddress, 0L, pcontext.rawAddress)

public actual fun wscRegisterForUserNotifications(): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications()

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(hregistrationhandle.rawAddress)
