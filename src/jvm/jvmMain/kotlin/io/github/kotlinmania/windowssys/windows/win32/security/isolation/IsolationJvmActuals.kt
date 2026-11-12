@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private object WindowsWin32SecurityIsolationJniBridge {
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
        val stream = WindowsWin32SecurityIsolationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(pszappcontainername: Long, pszdisplayname: Long, pszdescription: Long, pcapabilities: Long, dwcapabilitycount: Int, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(pszappcontainername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(pszappcontainername: Long, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Long, pszrestrictedappcontainername: Long, ppsidrestrictedappcontainersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(pszappcontainersid: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(token: Long, appcontainersid: Long, objectpathlength: Int, objectpath: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(desiredaccess: Int, phappcontainerkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): Int
}

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: ConstPtr, dwcapabilitycount: UInt, ppsidappcontainersid: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(pszappcontainername.rawAddress, pszdisplayname.rawAddress, pszdescription.rawAddress, pcapabilities.rawAddress, dwcapabilitycount.toInt(), ppsidappcontainersid.rawAddress)

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(pszappcontainername.rawAddress)

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(pszappcontainername.rawAddress, ppsidappcontainersid.rawAddress)

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid.rawAddress, pszrestrictedappcontainername.rawAddress, ppsidrestrictedappcontainersid.rawAddress)

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(pszappcontainersid.rawAddress, ppszpath.rawAddress)

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: MutPtr): Bool =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(token.rawAddress, appcontainersid.rawAddress, objectpathlength.toInt(), objectpath.rawAddress, returnlength.rawAddress)

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(desiredaccess.toInt(), phappcontainerkey.rawAddress)

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent.rawAddress)

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(isprocessinisolatedcontainer.rawAddress)

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment.rawAddress)

public actual fun isProcessInWDAGContainer(reserved: ConstPtr, isprocessinwdagcontainer: MutPtr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(reserved.rawAddress, isprocessinwdagcontainer.rawAddress)
