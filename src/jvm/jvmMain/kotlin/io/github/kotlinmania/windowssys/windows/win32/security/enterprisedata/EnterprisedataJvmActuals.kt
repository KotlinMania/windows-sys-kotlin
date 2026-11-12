@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32SecurityEnterprisedataJniBridge {
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
        val stream = WindowsWin32SecurityEnterprisedataJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(fileorfolderpath: Long, identity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(threadnetworkcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(enterpriseid: Long, threadnetworkcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(enterpriseid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(tokenhandle: Long, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(tokenhandle: Long, policyflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(version: Int, type: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(tokenhandle: Long, istokenservice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(tokenhandle: Long, enterpriseid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(fileorfolderpath: Long, options: Long): Int
}

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(fileorfolderpath.rawAddress, identity.rawAddress)

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(threadnetworkcontext.rawAddress)

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(enterpriseid.rawAddress, threadnetworkcontext.rawAddress)

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption()

public actual fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr, isallowed: MutPtr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(packageid.rawAddress, isallowed.rawAddress)

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(enterpriseid.rawAddress)

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr, enterpriseids: MutPtr, enterpriseidcount: MutPtr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(tokenhandle.rawAddress, numberofbytes.rawAddress, enterpriseids.rawAddress, enterpriseidcount.rawAddress)

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(tokenhandle.rawAddress, policyflags.rawAddress)

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr, cbdata: UInt): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(version, type, pvdata.rawAddress, cbdata.toInt())

public actual fun srpHostingTerminate(type: SrphostingType) {
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type)
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr): Ntstatus =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(tokenhandle.rawAddress, istokenservice.rawAddress)

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(tokenhandle.rawAddress, enterpriseid.rawAddress)

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(fileorfolderpath.rawAddress, options.rawAddress)
