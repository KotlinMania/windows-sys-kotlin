@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId
import io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssysWindowsWin32SecurityEnterprisedataUnprotectFile
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(fileorfolderpath.rawAddress.toCPointer<ByteVar>(), identity.rawAddress.toCPointer<ByteVar>())

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(threadnetworkcontext.rawAddress.toCPointer<ByteVar>())

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(enterpriseid.rawAddress.toCPointer<ByteVar>(), threadnetworkcontext.rawAddress.toCPointer<ByteVar>())

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption()

public actual fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr, isallowed: MutPtr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(packageid.rawAddress.toCPointer<ByteVar>(), isallowed.rawAddress.toCPointer<ByteVar>())

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(enterpriseid.rawAddress.toCPointer<ByteVar>())

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr, enterpriseids: MutPtr, enterpriseidcount: MutPtr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(tokenhandle.rawAddress.toCPointer<ByteVar>(), numberofbytes.rawAddress.toCPointer<ByteVar>(), enterpriseids.rawAddress.toCPointer<ByteVar>(), enterpriseidcount.rawAddress.toCPointer<ByteVar>())

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(tokenhandle.rawAddress.toCPointer<ByteVar>(), policyflags.rawAddress.toCPointer<ByteVar>())

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr, cbdata: UInt): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(version, type, pvdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun srpHostingTerminate(type: SrphostingType) {
    windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type)
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr): Ntstatus =
    windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(tokenhandle.rawAddress.toCPointer<ByteVar>(), istokenservice.rawAddress.toCPointer<ByteVar>())

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(tokenhandle.rawAddress.toCPointer<ByteVar>(), enterpriseid.rawAddress.toCPointer<ByteVar>())

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr): Hresult =
    windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(fileorfolderpath.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())
