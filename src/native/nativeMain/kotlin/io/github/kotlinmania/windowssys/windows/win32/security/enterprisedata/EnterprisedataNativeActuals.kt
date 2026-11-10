@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity(fileorfolderpath?.value?.toCPointer<ByteVar>(), identity?.value?.toCPointer<ByteVar>())

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext(threadnetworkcontext?.value?.toCPointer<ByteVar>())

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext(enterpriseid?.value?.toCPointer<ByteVar>(), threadnetworkcontext?.value?.toCPointer<ByteVar>())

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption()

public actual fun srpDoesPolicyAllowAppExecution(packageid: COpaquePointer?, isallowed: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution(packageid?.value?.toCPointer<ByteVar>(), isallowed?.value?.toCPointer<ByteVar>())

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption(enterpriseid?.value?.toCPointer<ByteVar>())

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: COpaquePointer?, enterpriseids: COpaquePointer?, enterpriseidcount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds(tokenhandle?.value?.toCPointer<ByteVar>(), numberofbytes?.value?.toCPointer<ByteVar>(), enterpriseids?.value?.toCPointer<ByteVar>(), enterpriseidcount?.value?.toCPointer<ByteVar>())

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy(tokenhandle?.value?.toCPointer<ByteVar>(), policyflags?.value?.toCPointer<ByteVar>())

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: COpaquePointer?, cbdata: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(version, type, pvdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun srpHostingTerminate(type: SrphostingType) {
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(type)
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpIsTokenService(tokenhandle?.value?.toCPointer<ByteVar>(), istokenservice?.value?.toCPointer<ByteVar>())

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId(tokenhandle?.value?.toCPointer<ByteVar>(), enterpriseid?.value?.toCPointer<ByteVar>())

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_unprotectFile(fileorfolderpath?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())
