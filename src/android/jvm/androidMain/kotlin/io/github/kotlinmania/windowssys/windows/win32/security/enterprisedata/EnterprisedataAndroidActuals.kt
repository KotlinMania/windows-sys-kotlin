@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.PackageId

private object WindowsWin32SecurityEnterprisedataJniBridge {
    init {
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

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr<HthreadNetworkContext>): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(threadnetworkcontext.rawAddress)

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr<HthreadNetworkContext>): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(enterpriseid.rawAddress, threadnetworkcontext.rawAddress)

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption()

public actual fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr<PackageId>, isallowed: MutPtr<Bool>): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(packageid.rawAddress, isallowed.rawAddress)

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(enterpriseid.rawAddress)

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr<UInt>, enterpriseids: MutPtr<Pcwstr>, enterpriseidcount: MutPtr<UInt>): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(tokenhandle.rawAddress, numberofbytes.rawAddress, enterpriseids.rawAddress, enterpriseidcount.rawAddress)

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr<EnterpriseDataPolicies>): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(tokenhandle.rawAddress, policyflags.rawAddress)

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr<CVoid>, cbdata: UInt): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(version, type, pvdata.rawAddress, cbdata.toInt())

public actual fun srpHostingTerminate(type: SrphostingType) {
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type)
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr<UByte>): Ntstatus =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(tokenhandle.rawAddress, istokenservice.rawAddress)

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(tokenhandle.rawAddress, enterpriseid.rawAddress)

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr<FileUnprotectOptions>): Hresult =
    WindowsWin32SecurityEnterprisedataJniBridge.windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(fileorfolderpath.rawAddress, options.rawAddress)
