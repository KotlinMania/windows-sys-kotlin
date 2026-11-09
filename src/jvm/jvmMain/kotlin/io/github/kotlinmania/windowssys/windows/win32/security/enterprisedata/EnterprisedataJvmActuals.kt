@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWin32SecurityEnterprisedataJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_ProtectFileToEnterpriseIdentity(fileorfolderpath: Long, identity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpCloseThreadNetworkContext(threadnetworkcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpCreateThreadNetworkContext(enterpriseid: Long, threadnetworkcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpDisablePermissiveModeFileEncryption(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpEnablePermissiveModeFileEncryption(enterpriseid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpGetEnterpriseIds(tokenhandle: Long, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpGetEnterprisePolicy(tokenhandle: Long, policyflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpHostingInitialize(version: Int, type: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpHostingTerminate(type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpIsTokenService(tokenhandle: Long, istokenservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_SrpSetTokenEnterpriseId(tokenhandle: Long, enterpriseid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_UnprotectFile(fileorfolderpath: Long, options: Long): Int
}

public actual fun ProtectFileToEnterpriseIdentity(fileorfolderpath: PCWSTR, identity: PCWSTR): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_ProtectFileToEnterpriseIdentity(fileorfolderpath, identity)

public actual fun SrpCloseThreadNetworkContext(threadnetworkcontext: Long): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpCloseThreadNetworkContext(threadnetworkcontext)

public actual fun SrpCreateThreadNetworkContext(enterpriseid: PCWSTR, threadnetworkcontext: Long): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpCreateThreadNetworkContext(enterpriseid, threadnetworkcontext)

public actual fun SrpDisablePermissiveModeFileEncryption(): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpDisablePermissiveModeFileEncryption()

public actual fun SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpDoesPolicyAllowAppExecution(packageid, isallowed)

public actual fun SrpEnablePermissiveModeFileEncryption(enterpriseid: PCWSTR): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpEnablePermissiveModeFileEncryption(enterpriseid)

public actual fun SrpGetEnterpriseIds(tokenhandle: HANDLE, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpGetEnterpriseIds(tokenhandle, numberofbytes, enterpriseids, enterpriseidcount)

public actual fun SrpGetEnterprisePolicy(tokenhandle: HANDLE, policyflags: Long): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpGetEnterprisePolicy(tokenhandle, policyflags)

public actual fun SrpHostingInitialize(version: SRPHOSTING_VERSION, type: SRPHOSTING_TYPE, pvdata: Long, cbdata: UInt): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpHostingInitialize(version, type, pvdata, cbdata.toInt())

public actual fun SrpHostingTerminate(type: SRPHOSTING_TYPE) {
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpHostingTerminate(type)
}

public actual fun SrpIsTokenService(tokenhandle: HANDLE, istokenservice: Long): NTSTATUS =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpIsTokenService(tokenhandle, istokenservice)

public actual fun SrpSetTokenEnterpriseId(tokenhandle: HANDLE, enterpriseid: PCWSTR): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_SrpSetTokenEnterpriseId(tokenhandle, enterpriseid)

public actual fun UnprotectFile(fileorfolderpath: PCWSTR, options: Long): HRESULT =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_UnprotectFile(fileorfolderpath, options)
