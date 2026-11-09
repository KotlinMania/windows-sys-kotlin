package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun ProtectFileToEnterpriseIdentity(fileorfolderpath: PCWSTR, identity: PCWSTR): HRESULT

public expect fun SrpCloseThreadNetworkContext(threadnetworkcontext: Long): HRESULT

public expect fun SrpCreateThreadNetworkContext(enterpriseid: PCWSTR, threadnetworkcontext: Long): HRESULT

public expect fun SrpDisablePermissiveModeFileEncryption(): HRESULT

public expect fun SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): HRESULT

public expect fun SrpEnablePermissiveModeFileEncryption(enterpriseid: PCWSTR): HRESULT

public expect fun SrpGetEnterpriseIds(tokenhandle: HANDLE, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): HRESULT

public expect fun SrpGetEnterprisePolicy(tokenhandle: HANDLE, policyflags: Long): HRESULT

public expect fun SrpHostingInitialize(version: SRPHOSTING_VERSION, type: SRPHOSTING_TYPE, pvdata: Long, cbdata: UInt): HRESULT

public expect fun SrpHostingTerminate(type: SRPHOSTING_TYPE)

public expect fun SrpIsTokenService(tokenhandle: HANDLE, istokenservice: Long): NTSTATUS

public expect fun SrpSetTokenEnterpriseId(tokenhandle: HANDLE, enterpriseid: PCWSTR): HRESULT

public expect fun UnprotectFile(fileorfolderpath: PCWSTR, options: Long): HRESULT
