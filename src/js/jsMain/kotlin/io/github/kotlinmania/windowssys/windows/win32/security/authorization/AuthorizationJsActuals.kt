@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.AceFlags
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

private val _windowsWin32SecurityAuthorizationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?, phaccesscheckresults: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzAccessCheck(flags.toInt(), (hauthzclientcontext?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), (hauditevent?.value ?: 0L).toString(), (psecuritydescriptor?.value ?: 0L).toString(), (optionalsecuritydescriptorarray?.value ?: 0L).toString(), optionalsecuritydescriptorcount.toInt(), (preply?.value ?: 0L).toString(), (phaccesscheckresults?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: COpaquePointer?, sidcount: UInt, restrictedsids: COpaquePointer?, restrictedsidcount: UInt, phnewauthzclientcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzAddSidsToContext((hauthzclientcontext?.value ?: 0L).toString(), (sids?.value ?: 0L).toString(), sidcount.toInt(), (restrictedsids?.value ?: 0L).toString(), restrictedsidcount.toInt(), (phnewauthzclientcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, preply: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzCachedAccessCheck(flags.toInt(), (haccesscheckresults?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), (hauditevent?.value ?: 0L).toString(), (preply?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: COpaquePointer?, pdwcount: COpaquePointer?, pdwlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzEnumerateSecurityEventSources(dwflags.toInt(), (buffer?.value ?: 0L).toString(), (pdwcount?.value ?: 0L).toString(), (pdwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, sacl: COpaquePointer?, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzEvaluateSacl((authzclientcontext?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), (sacl?.value ?: 0L).toString(), grantedaccess.toInt(), accessgranted, (pbgenerateaudit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzFreeAuditEvent((hauditevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzFreeCentralAccessPolicyCache() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzFreeContext((hauthzclientcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzFreeHandle((haccesscheckresults?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzFreeResourceManager((hauthzresourcemanager?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: COpaquePointer?, buffer: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzGetInformationFromContext((hauthzclientcontext?.value ?: 0L).toString(), infoclass, buffersize.toInt(), (psizerequired?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInitializeCompoundContext((usercontext?.value ?: 0L).toString(), (devicecontext?.value ?: 0L).toString(), (phcompoundcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phnewauthzclientcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent(flags.toInt(), (hauditeventtype?.value ?: 0L).toString(), (szoperationtype?.value ?: 0L).toString(), (szobjecttype?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (szadditionalinfo?.value ?: 0L).toString(), (phauditevent?.value ?: 0L).toString(), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent2(flags.toInt(), (hauditeventtype?.value ?: 0L).toString(), (szoperationtype?.value ?: 0L).toString(), (szobjecttype?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (szadditionalinfo?.value ?: 0L).toString(), (szadditionalinfo2?.value ?: 0L).toString(), (phauditevent?.value ?: 0L).toString(), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInitializeRemoteResourceManager((prpcinitinfo?.value ?: 0L).toString(), (phauthzresourcemanager?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInitializeResourceManager(flags.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), (szresourcemanagername?.value ?: 0L).toString(), (phauthzresourcemanager?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInitializeResourceManagerEx(flags.toInt(), (pauthzinitinfo?.value ?: 0L).toString(), (phauthzresourcemanager?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzInstallSecurityEventSource(dwflags.toInt(), (pregistration?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: COpaquePointer?, pclaims: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzModifyClaims((hauthzclientcontext?.value ?: 0L).toString(), claimclass, (pclaimoperations?.value ?: 0L).toString(), (pclaims?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: COpaquePointer?, pattributes: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzModifySecurityAttributes((hauthzclientcontext?.value ?: 0L).toString(), (poperations?.value ?: 0L).toString(), (pattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: COpaquePointer?, psids: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzModifySids((hauthzclientcontext?.value ?: 0L).toString(), sidclass, (psidoperations?.value ?: 0L).toString(), (psids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzOpenObjectAudit(flags.toInt(), (hauthzclientcontext?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), (hauditevent?.value ?: 0L).toString(), (psecuritydescriptor?.value ?: 0L).toString(), (optionalsecuritydescriptorarray?.value ?: 0L).toString(), optionalsecuritydescriptorcount.toInt(), (preply?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: COpaquePointer?, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzRegisterCapChangeNotification((phcapchangesubscription?.value ?: 0L).toString(), 0L.toString(), (pcallbackcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzRegisterSecurityEventSource(dwflags.toInt(), (szeventsourcename?.value ?: 0L).toString(), (pheventprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzReportSecurityEvent(dwflags.toInt(), (heventprovider?.value ?: 0L).toString(), dwauditid.toInt(), (pusersid?.value ?: 0L).toString(), dwcount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzReportSecurityEventFromParams(dwflags.toInt(), (heventprovider?.value ?: 0L).toString(), dwauditid.toInt(), (pusersid?.value ?: 0L).toString(), (pparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzSetAppContainerInformation((hauthzclientcontext?.value ?: 0L).toString(), (pappcontainersid?.value ?: 0L).toString(), capabilitycount.toInt(), (pcapabilitysids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzUninstallSecurityEventSource(dwflags.toInt(), (szeventsourcename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzUnregisterCapChangeNotification((hcapchangesubscription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_authzUnregisterSecurityEventSource(dwflags.toInt(), (pheventprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameA((pexplicitaccess?.value ?: 0L).toString(), (ptrusteename?.value ?: 0L).toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameW((pexplicitaccess?.value ?: 0L).toString(), (ptrusteename?.value ?: 0L).toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameA((pexplicitaccess?.value ?: 0L).toString(), (ptrusteename?.value ?: 0L).toString(), (ptrustee?.value ?: 0L).toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameW((pexplicitaccess?.value ?: 0L).toString(), (ptrusteename?.value ?: 0L).toString(), (ptrustee?.value ?: 0L).toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateTrusteeA(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildImpersonateTrusteeA((ptrustee?.value ?: 0L).toString(), (pimpersonatetrustee?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateTrusteeW(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildImpersonateTrusteeW((ptrustee?.value ?: 0L).toString(), (pimpersonatetrustee?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildSecurityDescriptorA(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildSecurityDescriptorA((powner?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), ccountofaccessentries.toInt(), (plistofaccessentries?.value ?: 0L).toString(), ccountofauditentries.toInt(), (plistofauditentries?.value ?: 0L).toString(), (poldsd?.value ?: 0L).toString(), (psizenewsd?.value ?: 0L).toString(), (pnewsd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildSecurityDescriptorW(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildSecurityDescriptorW((powner?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), ccountofaccessentries.toInt(), (plistofaccessentries?.value ?: 0L).toString(), ccountofauditentries.toInt(), (plistofauditentries?.value ?: 0L).toString(), (poldsd?.value ?: 0L).toString(), (psizenewsd?.value ?: 0L).toString(), (pnewsd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildTrusteeWithNameA(ptrustee: COpaquePointer?, pname: Pcstr) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithNameA((ptrustee?.value ?: 0L).toString(), (pname?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithNameW(ptrustee: COpaquePointer?, pname: Pcwstr) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithNameW((ptrustee?.value ?: 0L).toString(), (pname?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameA((ptrustee?.value ?: 0L).toString(), (pobjname?.value ?: 0L).toString(), objecttype, (objecttypename?.value ?: 0L).toString(), (inheritedobjecttypename?.value ?: 0L).toString(), (name?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameW((ptrustee?.value ?: 0L).toString(), (pobjname?.value ?: 0L).toString(), objecttype, (objecttypename?.value ?: 0L).toString(), (inheritedobjecttypename?.value ?: 0L).toString(), (name?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidA((ptrustee?.value ?: 0L).toString(), (pobjsid?.value ?: 0L).toString(), (pobjectguid?.value ?: 0L).toString(), (pinheritedobjectguid?.value ?: 0L).toString(), (psid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidW((ptrustee?.value ?: 0L).toString(), (pobjsid?.value ?: 0L).toString(), (pobjectguid?.value ?: 0L).toString(), (pinheritedobjectguid?.value ?: 0L).toString(), (psid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithSidA(ptrustee: COpaquePointer?, psid: Psid) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithSidA((ptrustee?.value ?: 0L).toString(), (psid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithSidW(ptrustee: COpaquePointer?, psid: Psid) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_buildTrusteeWithSidW((ptrustee?.value ?: 0L).toString(), (psid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorA((securitydescriptor?.value ?: 0L).toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), (stringsecuritydescriptor?.value ?: 0L).toString(), (stringsecuritydescriptorlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorW((securitydescriptor?.value ?: 0L).toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), (stringsecuritydescriptor?.value ?: 0L).toString(), (stringsecuritydescriptorlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSidToStringSidA(sid: Psid, stringsid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertSidToStringSidA((sid?.value ?: 0L).toString(), (stringsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSidToStringSidW(sid: Psid, stringsid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertSidToStringSidW((sid?.value ?: 0L).toString(), (stringsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorA((stringsecuritydescriptor?.value ?: 0L).toString(), stringsdrevision.toInt(), (securitydescriptor?.value ?: 0L).toString(), (securitydescriptorsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorW((stringsecuritydescriptor?.value ?: 0L).toString(), stringsdrevision.toInt(), (securitydescriptor?.value ?: 0L).toString(), (securitydescriptorsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertStringSidToSidA((stringsid?.value ?: 0L).toString(), (sid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_convertStringSidToSidW((stringsid?.value ?: 0L).toString(), (sid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeInheritedFromArray(pinheritarray: COpaquePointer?, acecnt: UShort, pfnarray: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_freeInheritedFromArray((pinheritarray?.value ?: 0L).toString(), acecnt.toInt(), (pfnarray?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAuditedPermissionsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclA((pacl?.value ?: 0L).toString(), (ptrustee?.value ?: 0L).toString(), (psuccessfulauditedrights?.value ?: 0L).toString(), (pfailedauditrights?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAuditedPermissionsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclW((pacl?.value ?: 0L).toString(), (ptrustee?.value ?: 0L).toString(), (psuccessfulauditedrights?.value ?: 0L).toString(), (pfailedauditrights?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveRightsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclA((pacl?.value ?: 0L).toString(), (ptrustee?.value ?: 0L).toString(), (paccessrights?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveRightsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclW((pacl?.value ?: 0L).toString(), (ptrustee?.value ?: 0L).toString(), (paccessrights?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExplicitEntriesFromAclA(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclA((pacl?.value ?: 0L).toString(), (pccountofexplicitentries?.value ?: 0L).toString(), (plistofexplicitentries?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExplicitEntriesFromAclW(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclW((pacl?.value ?: 0L).toString(), (pccountofexplicitentries?.value ?: 0L).toString(), (plistofexplicitentries?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getInheritanceSourceA((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), container, (pobjectclassguids?.value ?: 0L).toString(), guidcount.toInt(), (pacl?.value ?: 0L).toString(), (pfnarray?.value ?: 0L).toString(), (pgenericmapping?.value ?: 0L).toString(), (pinheritarray?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getInheritanceSourceW((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), container, (pobjectclassguids?.value ?: 0L).toString(), guidcount.toInt(), (pacl?.value ?: 0L).toString(), (pfnarray?.value ?: 0L).toString(), (pgenericmapping?.value ?: 0L).toString(), (pinheritarray?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeA(ptrustee: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getMultipleTrusteeA((ptrustee?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeOperationA(ptrustee: COpaquePointer?): MultipleTrusteeOperation =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationA((ptrustee?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeOperationW(ptrustee: COpaquePointer?): MultipleTrusteeOperation =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationW((ptrustee?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeW(ptrustee: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getMultipleTrusteeW((ptrustee?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getNamedSecurityInfoA((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (ppsidowner?.value ?: 0L).toString(), (ppsidgroup?.value ?: 0L).toString(), (ppdacl?.value ?: 0L).toString(), (ppsacl?.value ?: 0L).toString(), (ppsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getNamedSecurityInfoW((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (ppsidowner?.value ?: 0L).toString(), (ppsidgroup?.value ?: 0L).toString(), (ppdacl?.value ?: 0L).toString(), (ppsacl?.value ?: 0L).toString(), (ppsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getSecurityInfo((handle?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (ppsidowner?.value ?: 0L).toString(), (ppsidgroup?.value ?: 0L).toString(), (ppdacl?.value ?: 0L).toString(), (ppsacl?.value ?: 0L).toString(), (ppsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeFormA(ptrustee: COpaquePointer?): TrusteeForm =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getTrusteeFormA((ptrustee?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeFormW(ptrustee: COpaquePointer?): TrusteeForm =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getTrusteeFormW((ptrustee?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeNameA(ptrustee: COpaquePointer?): Pstr =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getTrusteeNameA((ptrustee?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeNameW(ptrustee: COpaquePointer?): Pwstr =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getTrusteeNameW((ptrustee?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeTypeA(ptrustee: COpaquePointer?): TrusteeType =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getTrusteeTypeA((ptrustee?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeTypeW(ptrustee: COpaquePointer?): TrusteeType =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_getTrusteeTypeW((ptrustee?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupSecurityDescriptorPartsA(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsA((ppowner?.value ?: 0L).toString(), (ppgroup?.value ?: 0L).toString(), (pccountofaccessentries?.value ?: 0L).toString(), (pplistofaccessentries?.value ?: 0L).toString(), (pccountofauditentries?.value ?: 0L).toString(), (pplistofauditentries?.value ?: 0L).toString(), (psd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupSecurityDescriptorPartsW(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsW((ppowner?.value ?: 0L).toString(), (ppgroup?.value ?: 0L).toString(), (pccountofaccessentries?.value ?: 0L).toString(), (pplistofaccessentries?.value ?: 0L).toString(), (pccountofauditentries?.value ?: 0L).toString(), (pplistofauditentries?.value ?: 0L).toString(), (psd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_setEntriesInAclA(ccountofexplicitentries.toInt(), (plistofexplicitentries?.value ?: 0L).toString(), (oldacl?.value ?: 0L).toString(), (newacl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_setEntriesInAclW(ccountofexplicitentries.toInt(), (plistofexplicitentries?.value ?: 0L).toString(), (oldacl?.value ?: 0L).toString(), (newacl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_setNamedSecurityInfoA((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (psidowner?.value ?: 0L).toString(), (psidgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_setNamedSecurityInfoW((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (psidowner?.value ?: 0L).toString(), (psidgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_setSecurityInfo((handle?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (psidowner?.value ?: 0L).toString(), (psidgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoA((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (powner?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString(), keepexplicit, 0L.toString(), progressinvokesetting, (args?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoW((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (powner?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString(), keepexplicit, 0L.toString(), progressinvokesetting, (args?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoA((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (powner?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString(), dwaction.toInt(), 0L.toString(), progressinvokesetting, (args?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoW((pobjectname?.value ?: 0L).toString(), objecttype, securityinfo.toInt(), (powner?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString(), dwaction.toInt(), 0L.toString(), progressinvokesetting, (args?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
