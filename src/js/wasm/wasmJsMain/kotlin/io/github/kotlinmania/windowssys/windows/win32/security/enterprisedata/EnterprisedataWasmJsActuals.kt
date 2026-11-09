@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun ProtectFileToEnterpriseIdentity(fileorfolderpath: PCWSTR, identity: PCWSTR): HRESULT =
    0

public actual fun SrpCloseThreadNetworkContext(threadnetworkcontext: Long): HRESULT =
    0

public actual fun SrpCreateThreadNetworkContext(enterpriseid: PCWSTR, threadnetworkcontext: Long): HRESULT =
    0

public actual fun SrpDisablePermissiveModeFileEncryption(): HRESULT =
    0

public actual fun SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): HRESULT =
    0

public actual fun SrpEnablePermissiveModeFileEncryption(enterpriseid: PCWSTR): HRESULT =
    0

public actual fun SrpGetEnterpriseIds(tokenhandle: HANDLE, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): HRESULT =
    0

public actual fun SrpGetEnterprisePolicy(tokenhandle: HANDLE, policyflags: Long): HRESULT =
    0

public actual fun SrpHostingInitialize(version: SRPHOSTING_VERSION, type: SRPHOSTING_TYPE, pvdata: Long, cbdata: UInt): HRESULT =
    0

public actual fun SrpHostingTerminate(type: SRPHOSTING_TYPE) {
}

public actual fun SrpIsTokenService(tokenhandle: HANDLE, istokenservice: Long): NTSTATUS =
    0

public actual fun SrpSetTokenEnterpriseId(tokenhandle: HANDLE, enterpriseid: PCWSTR): HRESULT =
    0

public actual fun UnprotectFile(fileorfolderpath: PCWSTR, options: Long): HRESULT =
    0
