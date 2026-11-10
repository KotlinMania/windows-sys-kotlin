package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult

public expect fun srpCloseThreadNetworkContext(threadnetworkcontext: COpaquePointer?): Hresult

public expect fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: COpaquePointer?): Hresult

public expect fun srpDisablePermissiveModeFileEncryption(): Hresult

public expect fun srpDoesPolicyAllowAppExecution(packageid: COpaquePointer?, isallowed: COpaquePointer?): Hresult

public expect fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult

public expect fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: COpaquePointer?, enterpriseids: COpaquePointer?, enterpriseidcount: COpaquePointer?): Hresult

public expect fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: COpaquePointer?): Hresult

public expect fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: COpaquePointer?, cbdata: UInt): Hresult

public expect fun srpHostingTerminate(type: SrphostingType)

public expect fun srpIsTokenService(tokenhandle: Handle, istokenservice: COpaquePointer?): Ntstatus

public expect fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult

public expect fun unprotectFile(fileorfolderpath: Pcwstr, options: COpaquePointer?): Hresult
