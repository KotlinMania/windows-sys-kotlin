@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ProtectFileToEnterpriseIdentity(fileorfolderpath: PCWSTR, identity: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_ProtectFileToEnterpriseIdentity(fileorfolderpath.toCPointer<ByteVar>(), identity.toCPointer<ByteVar>())

public actual fun SrpCloseThreadNetworkContext(threadnetworkcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpCloseThreadNetworkContext(threadnetworkcontext.toCPointer<ByteVar>())

public actual fun SrpCreateThreadNetworkContext(enterpriseid: PCWSTR, threadnetworkcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpCreateThreadNetworkContext(enterpriseid.toCPointer<ByteVar>(), threadnetworkcontext.toCPointer<ByteVar>())

public actual fun SrpDisablePermissiveModeFileEncryption(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpDisablePermissiveModeFileEncryption()

public actual fun SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpDoesPolicyAllowAppExecution(packageid.toCPointer<ByteVar>(), isallowed.toCPointer<ByteVar>())

public actual fun SrpEnablePermissiveModeFileEncryption(enterpriseid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpEnablePermissiveModeFileEncryption(enterpriseid.toCPointer<ByteVar>())

public actual fun SrpGetEnterpriseIds(tokenhandle: HANDLE, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpGetEnterpriseIds(tokenhandle.toCPointer<ByteVar>(), numberofbytes.toCPointer<ByteVar>(), enterpriseids.toCPointer<ByteVar>(), enterpriseidcount.toCPointer<ByteVar>())

public actual fun SrpGetEnterprisePolicy(tokenhandle: HANDLE, policyflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpGetEnterprisePolicy(tokenhandle.toCPointer<ByteVar>(), policyflags.toCPointer<ByteVar>())

public actual fun SrpHostingInitialize(version: SRPHOSTING_VERSION, type: SRPHOSTING_TYPE, pvdata: Long, cbdata: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpHostingInitialize(version, type, pvdata.toCPointer<ByteVar>(), cbdata)

public actual fun SrpHostingTerminate(type: SRPHOSTING_TYPE) {
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpHostingTerminate(type)
}

public actual fun SrpIsTokenService(tokenhandle: HANDLE, istokenservice: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpIsTokenService(tokenhandle.toCPointer<ByteVar>(), istokenservice.toCPointer<ByteVar>())

public actual fun SrpSetTokenEnterpriseId(tokenhandle: HANDLE, enterpriseid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_SrpSetTokenEnterpriseId(tokenhandle.toCPointer<ByteVar>(), enterpriseid.toCPointer<ByteVar>())

public actual fun UnprotectFile(fileorfolderpath: PCWSTR, options: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata.cinterop.windowssys_windows_win32_security_enterprisedata_UnprotectFile(fileorfolderpath.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())
