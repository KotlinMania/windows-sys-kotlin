package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun ProtectFileToEnterpriseIdentity(fileorfolderpath: PCWSTR, identity: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("efswrt.dll", "ProtectFileToEnterpriseIdentity", longArrayOf(fileorfolderpath, identity)).toInt()
}

public fun SrpCloseThreadNetworkContext(threadnetworkcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpCloseThreadNetworkContext", longArrayOf(threadnetworkcontext)).toInt()
}

public fun SrpCreateThreadNetworkContext(enterpriseid: PCWSTR, threadnetworkcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpCreateThreadNetworkContext", longArrayOf(enterpriseid, threadnetworkcontext)).toInt()
}

public fun SrpDisablePermissiveModeFileEncryption(): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpDisablePermissiveModeFileEncryption", longArrayOf()).toInt()
}

public fun SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpDoesPolicyAllowAppExecution", longArrayOf(packageid, isallowed)).toInt()
}

public fun SrpEnablePermissiveModeFileEncryption(enterpriseid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpEnablePermissiveModeFileEncryption", longArrayOf(enterpriseid)).toInt()
}

public fun SrpGetEnterpriseIds(tokenhandle: HANDLE, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpGetEnterpriseIds", longArrayOf(tokenhandle, numberofbytes, enterpriseids, enterpriseidcount)).toInt()
}

public fun SrpGetEnterprisePolicy(tokenhandle: HANDLE, policyflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpGetEnterprisePolicy", longArrayOf(tokenhandle, policyflags)).toInt()
}

public fun SrpHostingInitialize(version: SRPHOSTING_VERSION, type: SRPHOSTING_TYPE, pvdata: Long, cbdata: UInt): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpHostingInitialize", longArrayOf(version.toLong(), type.toLong(), pvdata, cbdata.toLong())).toInt()
}

public fun SrpHostingTerminate(type: SRPHOSTING_TYPE) {
    Win32DynamicFfi.invoke("srpapi.dll", "SrpHostingTerminate", longArrayOf(type.toLong()))
}

public fun SrpIsTokenService(tokenhandle: HANDLE, istokenservice: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpIsTokenService", longArrayOf(tokenhandle, istokenservice)).toInt()
}

public fun SrpSetTokenEnterpriseId(tokenhandle: HANDLE, enterpriseid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("srpapi.dll", "SrpSetTokenEnterpriseId", longArrayOf(tokenhandle, enterpriseid)).toInt()
}

public fun UnprotectFile(fileorfolderpath: PCWSTR, options: Long): HRESULT {
    return Win32DynamicFfi.invoke("efswrt.dll", "UnprotectFile", longArrayOf(fileorfolderpath, options)).toInt()
}
