package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult

public expect fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr): Hresult

public expect fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr): Hresult

public expect fun srpDisablePermissiveModeFileEncryption(): Hresult

public expect fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr, isallowed: MutPtr): Hresult

public expect fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult

public expect fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr, enterpriseids: MutPtr, enterpriseidcount: MutPtr): Hresult

public expect fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr): Hresult

public expect fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr, cbdata: UInt): Hresult

public expect fun srpHostingTerminate(type: SrphostingType)

public expect fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr): Ntstatus

public expect fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult

public expect fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr): Hresult
