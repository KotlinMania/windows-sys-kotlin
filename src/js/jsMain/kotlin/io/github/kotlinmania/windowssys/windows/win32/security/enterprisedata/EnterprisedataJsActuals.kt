@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWin32SecurityEnterprisedataNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ProtectFileToEnterpriseIdentity(fileorfolderpath: PCWSTR, identity: PCWSTR): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_ProtectFileToEnterpriseIdentity(fileorfolderpath.toString(), identity.toString()) as Int) else 0

public actual fun SrpCloseThreadNetworkContext(threadnetworkcontext: Long): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpCloseThreadNetworkContext(threadnetworkcontext.toString()) as Int) else 0

public actual fun SrpCreateThreadNetworkContext(enterpriseid: PCWSTR, threadnetworkcontext: Long): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpCreateThreadNetworkContext(enterpriseid.toString(), threadnetworkcontext.toString()) as Int) else 0

public actual fun SrpDisablePermissiveModeFileEncryption(): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpDisablePermissiveModeFileEncryption() as Int) else 0

public actual fun SrpDoesPolicyAllowAppExecution(packageid: Long, isallowed: Long): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpDoesPolicyAllowAppExecution(packageid.toString(), isallowed.toString()) as Int) else 0

public actual fun SrpEnablePermissiveModeFileEncryption(enterpriseid: PCWSTR): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpEnablePermissiveModeFileEncryption(enterpriseid.toString()) as Int) else 0

public actual fun SrpGetEnterpriseIds(tokenhandle: HANDLE, numberofbytes: Long, enterpriseids: Long, enterpriseidcount: Long): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpGetEnterpriseIds(tokenhandle.toString(), numberofbytes.toString(), enterpriseids.toString(), enterpriseidcount.toString()) as Int) else 0

public actual fun SrpGetEnterprisePolicy(tokenhandle: HANDLE, policyflags: Long): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpGetEnterprisePolicy(tokenhandle.toString(), policyflags.toString()) as Int) else 0

public actual fun SrpHostingInitialize(version: SRPHOSTING_VERSION, type: SRPHOSTING_TYPE, pvdata: Long, cbdata: UInt): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpHostingInitialize(version, type, pvdata.toString(), cbdata.toInt()) as Int) else 0

public actual fun SrpHostingTerminate(type: SRPHOSTING_TYPE) {
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) {
        _windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpHostingTerminate(type)
    }
}

public actual fun SrpIsTokenService(tokenhandle: HANDLE, istokenservice: Long): NTSTATUS =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpIsTokenService(tokenhandle.toString(), istokenservice.toString()) as Int) else 0

public actual fun SrpSetTokenEnterpriseId(tokenhandle: HANDLE, enterpriseid: PCWSTR): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_SrpSetTokenEnterpriseId(tokenhandle.toString(), enterpriseid.toString()) as Int) else 0

public actual fun UnprotectFile(fileorfolderpath: PCWSTR, options: Long): HRESULT =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_UnprotectFile(fileorfolderpath.toString(), options.toString()) as Int) else 0
