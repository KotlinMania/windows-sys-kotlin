@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32SecurityAuthorizationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: MutPtr, phaccesscheckresults: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(flags.toInt(), hauthzclientcontext.rawAddress.toString(), prequest.rawAddress.toString(), hauditevent.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), optionalsecuritydescriptorarray.rawAddress.toString(), optionalsecuritydescriptorcount.toInt(), preply.rawAddress.toString(), phaccesscheckresults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr, sidcount: UInt, restrictedsids: ConstPtr, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(hauthzclientcontext.rawAddress.toString(), sids.rawAddress.toString(), sidcount.toInt(), restrictedsids.rawAddress.toString(), restrictedsidcount.toInt(), phnewauthzclientcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, preply: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(flags.toInt(), haccesscheckresults.rawAddress.toString(), prequest.rawAddress.toString(), hauditevent.rawAddress.toString(), preply.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr, pdwcount: MutPtr, pdwlength: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(dwflags.toInt(), buffer.rawAddress.toString(), pdwcount.rawAddress.toString(), pdwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, sacl: ConstPtr, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(authzclientcontext.rawAddress.toString(), prequest.rawAddress.toString(), sacl.rawAddress.toString(), grantedaccess.toInt(), accessgranted, pbgenerateaudit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(hauditevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(hauthzclientcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(haccesscheckresults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(hauthzresourcemanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr, buffer: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(hauthzclientcontext.rawAddress.toString(), infoclass, buffersize.toInt(), psizerequired.rawAddress.toString(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(usercontext.rawAddress.toString(), devicecontext.rawAddress.toString(), phcompoundcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phnewauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(flags.toInt(), hauditeventtype.rawAddress.toString(), szoperationtype.rawAddress.toString(), szobjecttype.rawAddress.toString(), szobjectname.rawAddress.toString(), szadditionalinfo.rawAddress.toString(), phauditevent.rawAddress.toString(), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(flags.toInt(), hauditeventtype.rawAddress.toString(), szoperationtype.rawAddress.toString(), szobjecttype.rawAddress.toString(), szobjectname.rawAddress.toString(), szadditionalinfo.rawAddress.toString(), szadditionalinfo2.rawAddress.toString(), phauditevent.rawAddress.toString(), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(prpcinitinfo.rawAddress.toString(), phauthzresourcemanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(flags.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), szresourcemanagername.rawAddress.toString(), phauthzresourcemanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(flags.toInt(), pauthzinitinfo.rawAddress.toString(), phauthzresourcemanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(dwflags.toInt(), pregistration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr, pclaims: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(hauthzclientcontext.rawAddress.toString(), claimclass, pclaimoperations.rawAddress.toString(), pclaims.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr, pattributes: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(hauthzclientcontext.rawAddress.toString(), poperations.rawAddress.toString(), pattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr, psids: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(hauthzclientcontext.rawAddress.toString(), sidclass, psidoperations.rawAddress.toString(), psids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(flags.toInt(), hauthzclientcontext.rawAddress.toString(), prequest.rawAddress.toString(), hauditevent.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), optionalsecuritydescriptorarray.rawAddress.toString(), optionalsecuritydescriptorcount.toInt(), preply.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(phcapchangesubscription.rawAddress.toString(), 0L.toString(), pcallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(dwflags.toInt(), szeventsourcename.rawAddress.toString(), pheventprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(dwflags.toInt(), heventprovider.rawAddress.toString(), dwauditid.toInt(), pusersid.rawAddress.toString(), dwcount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(dwflags.toInt(), heventprovider.rawAddress.toString(), dwauditid.toInt(), pusersid.rawAddress.toString(), pparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(hauthzclientcontext.rawAddress.toString(), pappcontainersid.rawAddress.toString(), capabilitycount.toInt(), pcapabilitysids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(dwflags.toInt(), szeventsourcename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(hcapchangesubscription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(dwflags.toInt(), pheventprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), ptrustee.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), ptrustee.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateTrusteeA(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(ptrustee.rawAddress.toString(), pimpersonatetrustee.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateTrusteeW(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(ptrustee.rawAddress.toString(), pimpersonatetrustee.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildSecurityDescriptorA(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(powner.rawAddress.toString(), pgroup.rawAddress.toString(), ccountofaccessentries.toInt(), plistofaccessentries.rawAddress.toString(), ccountofauditentries.toInt(), plistofauditentries.rawAddress.toString(), poldsd.rawAddress.toString(), psizenewsd.rawAddress.toString(), pnewsd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildSecurityDescriptorW(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(powner.rawAddress.toString(), pgroup.rawAddress.toString(), ccountofaccessentries.toInt(), plistofaccessentries.rawAddress.toString(), ccountofauditentries.toInt(), plistofauditentries.rawAddress.toString(), poldsd.rawAddress.toString(), psizenewsd.rawAddress.toString(), pnewsd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildTrusteeWithNameA(ptrustee: MutPtr, pname: Pcstr) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(ptrustee.rawAddress.toString(), pname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithNameW(ptrustee: MutPtr, pname: Pcwstr) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(ptrustee.rawAddress.toString(), pname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(ptrustee.rawAddress.toString(), pobjname.rawAddress.toString(), objecttype, objecttypename.rawAddress.toString(), inheritedobjecttypename.rawAddress.toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(ptrustee.rawAddress.toString(), pobjname.rawAddress.toString(), objecttype, objecttypename.rawAddress.toString(), inheritedobjecttypename.rawAddress.toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(ptrustee.rawAddress.toString(), pobjsid.rawAddress.toString(), pobjectguid.rawAddress.toString(), pinheritedobjectguid.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(ptrustee.rawAddress.toString(), pobjsid.rawAddress.toString(), pobjectguid.rawAddress.toString(), pinheritedobjectguid.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithSidA(ptrustee: MutPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(ptrustee.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithSidW(ptrustee: MutPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAddon != null) {
        windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(ptrustee.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor.rawAddress.toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.rawAddress.toString(), stringsecuritydescriptorlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor.rawAddress.toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.rawAddress.toString(), stringsecuritydescriptorlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(sid.rawAddress.toString(), stringsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(sid.rawAddress.toString(), stringsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor.rawAddress.toString(), stringsdrevision.toInt(), securitydescriptor.rawAddress.toString(), securitydescriptorsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor.rawAddress.toString(), stringsdrevision.toInt(), securitydescriptor.rawAddress.toString(), securitydescriptorsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(stringsid.rawAddress.toString(), sid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(stringsid.rawAddress.toString(), sid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeInheritedFromArray(pinheritarray: ConstPtr, acecnt: UShort, pfnarray: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(pinheritarray.rawAddress.toString(), acecnt.toInt(), pfnarray.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAuditedPermissionsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), psuccessfulauditedrights.rawAddress.toString(), pfailedauditrights.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAuditedPermissionsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), psuccessfulauditedrights.rawAddress.toString(), pfailedauditrights.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveRightsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), paccessrights.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveRightsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), paccessrights.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExplicitEntriesFromAclA(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(pacl.rawAddress.toString(), pccountofexplicitentries.rawAddress.toString(), plistofexplicitentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExplicitEntriesFromAclW(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(pacl.rawAddress.toString(), pccountofexplicitentries.rawAddress.toString(), plistofexplicitentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), container, pobjectclassguids.rawAddress.toString(), guidcount.toInt(), pacl.rawAddress.toString(), pfnarray.rawAddress.toString(), pgenericmapping.rawAddress.toString(), pinheritarray.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), container, pobjectclassguids.rawAddress.toString(), guidcount.toInt(), pacl.rawAddress.toString(), pfnarray.rawAddress.toString(), pgenericmapping.rawAddress.toString(), pinheritarray.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeA(ptrustee: ConstPtr): MutPtr =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) MutPtr((windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(ptrustee.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeOperationA(ptrustee: ConstPtr): MultipleTrusteeOperation =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(ptrustee.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeOperationW(ptrustee: ConstPtr): MultipleTrusteeOperation =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(ptrustee.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeW(ptrustee: ConstPtr): MutPtr =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) MutPtr((windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(ptrustee.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), ppsidowner.rawAddress.toString(), ppsidgroup.rawAddress.toString(), ppdacl.rawAddress.toString(), ppsacl.rawAddress.toString(), ppsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), ppsidowner.rawAddress.toString(), ppsidgroup.rawAddress.toString(), ppdacl.rawAddress.toString(), ppsacl.rawAddress.toString(), ppsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(handle.rawAddress.toString(), objecttype, securityinfo.toInt(), ppsidowner.rawAddress.toString(), ppsidgroup.rawAddress.toString(), ppdacl.rawAddress.toString(), ppsacl.rawAddress.toString(), ppsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeFormA(ptrustee: ConstPtr): TrusteeForm =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(ptrustee.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeFormW(ptrustee: ConstPtr): TrusteeForm =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(ptrustee.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeNameA(ptrustee: ConstPtr): Pstr =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) MutPtr((windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(ptrustee.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeNameW(ptrustee: ConstPtr): Pwstr =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) MutPtr((windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(ptrustee.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeTypeA(ptrustee: ConstPtr): TrusteeType =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(ptrustee.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeTypeW(ptrustee: ConstPtr): TrusteeType =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(ptrustee.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupSecurityDescriptorPartsA(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(ppowner.rawAddress.toString(), ppgroup.rawAddress.toString(), pccountofaccessentries.rawAddress.toString(), pplistofaccessentries.rawAddress.toString(), pccountofauditentries.rawAddress.toString(), pplistofauditentries.rawAddress.toString(), psd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupSecurityDescriptorPartsW(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(ppowner.rawAddress.toString(), ppgroup.rawAddress.toString(), pccountofaccessentries.rawAddress.toString(), pplistofaccessentries.rawAddress.toString(), pccountofauditentries.rawAddress.toString(), pplistofauditentries.rawAddress.toString(), psd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(ccountofexplicitentries.toInt(), plistofexplicitentries.rawAddress.toString(), oldacl.rawAddress.toString(), newacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(ccountofexplicitentries.toInt(), plistofexplicitentries.rawAddress.toString(), oldacl.rawAddress.toString(), newacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), psidowner.rawAddress.toString(), psidgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), psidowner.rawAddress.toString(), psidgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(handle.rawAddress.toString(), objecttype, securityinfo.toInt(), psidowner.rawAddress.toString(), psidgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), keepexplicit, 0L.toString(), progressinvokesetting, args.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), keepexplicit, 0L.toString(), progressinvokesetting, args.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), dwaction.toInt(), 0L.toString(), progressinvokesetting, args.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAddon != null) (windowsWin32SecurityAuthorizationNapiAddon.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), dwaction.toInt(), 0L.toString(), progressinvokesetting, args.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
