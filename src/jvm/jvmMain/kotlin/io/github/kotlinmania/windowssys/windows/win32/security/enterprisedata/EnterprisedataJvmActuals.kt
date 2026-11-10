@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32SecurityEnterprisedataJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity(fileorfolderpath: Long, identity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext(threadnetworkcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext(enterpriseid: Long, threadnetworkcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption(enterpriseid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds(tokenhandle: Long, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy(tokenhandle: Long, policyflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(version: Int, type: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpIsTokenService(tokenhandle: Long, istokenservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId(tokenhandle: Long, enterpriseid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_enterprisedata_unprotectFile(fileorfolderpath: Long, options: Long): Int
}

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity((fileorfolderpath?.value ?: 0L), (identity?.value ?: 0L))

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext((threadnetworkcontext?.value ?: 0L))

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext((enterpriseid?.value ?: 0L), (threadnetworkcontext?.value ?: 0L))

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption()

public actual fun srpDoesPolicyAllowAppExecution(packageid: COpaquePointer?, isallowed: COpaquePointer?): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution((packageid?.value ?: 0L), (isallowed?.value ?: 0L))

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption((enterpriseid?.value ?: 0L))

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: COpaquePointer?, enterpriseids: COpaquePointer?, enterpriseidcount: COpaquePointer?): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds((tokenhandle?.value ?: 0L), (numberofbytes?.value ?: 0L), (enterpriseids?.value ?: 0L), (enterpriseidcount?.value ?: 0L))

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: COpaquePointer?): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy((tokenhandle?.value ?: 0L), (policyflags?.value ?: 0L))

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: COpaquePointer?, cbdata: UInt): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(version, type, (pvdata?.value ?: 0L), cbdata.toInt())

public actual fun srpHostingTerminate(type: SrphostingType) {
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(type)
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpIsTokenService((tokenhandle?.value ?: 0L), (istokenservice?.value ?: 0L))

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId((tokenhandle?.value ?: 0L), (enterpriseid?.value ?: 0L))

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: COpaquePointer?): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssys_windows_win32_security_enterprisedata_unprotectFile((fileorfolderpath?.value ?: 0L), (options?.value ?: 0L))
