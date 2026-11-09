@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.ACE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE

private val _windowsWin32SecurityAuthorizationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AuthzAccessCheck(flags: AUTHZ_ACCESS_CHECK_FLAGS, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long, phaccesscheckresults: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzAccessCheck(flags.toInt(), hauthzclientcontext.toString(), prequest.toString(), hauditevent.toString(), psecuritydescriptor.toString(), optionalsecuritydescriptorarray.toString(), optionalsecuritydescriptorcount.toInt(), preply.toString(), phaccesscheckresults.toString()) as Int) else 0

public actual fun AuthzAddSidsToContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sids: Long, sidcount: UInt, restrictedsids: Long, restrictedsidcount: UInt, phnewauthzclientcontext: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzAddSidsToContext(hauthzclientcontext.toString(), sids.toString(), sidcount.toInt(), restrictedsids.toString(), restrictedsidcount.toInt(), phnewauthzclientcontext.toString()) as Int) else 0

public actual fun AuthzCachedAccessCheck(flags: UInt, haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, preply: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck(flags.toInt(), haccesscheckresults.toString(), prequest.toString(), hauditevent.toString(), preply.toString()) as Int) else 0

public actual fun AuthzEnumerateSecurityEventSources(dwflags: UInt, buffer: Long, pdwcount: Long, pdwlength: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources(dwflags.toInt(), buffer.toString(), pdwcount.toString(), pdwlength.toString()) as Int) else 0

public actual fun AuthzEvaluateSacl(authzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, sacl: Long, grantedaccess: UInt, accessgranted: BOOL, pbgenerateaudit: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzEvaluateSacl(authzclientcontext.toString(), prequest.toString(), sacl.toString(), grantedaccess.toInt(), accessgranted, pbgenerateaudit.toString()) as Int) else 0

public actual fun AuthzFreeAuditEvent(hauditevent: AUTHZ_AUDIT_EVENT_HANDLE): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent(hauditevent.toString()) as Int) else 0

public actual fun AuthzFreeCentralAccessPolicyCache(): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache() as Int) else 0

public actual fun AuthzFreeContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzFreeContext(hauthzclientcontext.toString()) as Int) else 0

public actual fun AuthzFreeHandle(haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzFreeHandle(haccesscheckresults.toString()) as Int) else 0

public actual fun AuthzFreeResourceManager(hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzFreeResourceManager(hauthzresourcemanager.toString()) as Int) else 0

public actual fun AuthzGetInformationFromContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, infoclass: AUTHZ_CONTEXT_INFORMATION_CLASS, buffersize: UInt, psizerequired: Long, buffer: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext(hauthzclientcontext.toString(), infoclass, buffersize.toInt(), psizerequired.toString(), buffer.toString()) as Int) else 0

public actual fun AuthzInitializeCompoundContext(usercontext: AUTHZ_CLIENT_CONTEXT_HANDLE, devicecontext: AUTHZ_CLIENT_CONTEXT_HANDLE, phcompoundcontext: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext(usercontext.toString(), devicecontext.toString(), phcompoundcontext.toString()) as Int) else 0

public actual fun AuthzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pexpirationtime: Long, identifier: LUID, dynamicgroupargs: Long, phnewauthzclientcontext: Long): BOOL =
    0

public actual fun AuthzInitializeContextFromSid(flags: UInt, usersid: PSID, hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime: Long, identifier: LUID, dynamicgroupargs: Long, phauthzclientcontext: Long): BOOL =
    0

public actual fun AuthzInitializeContextFromToken(flags: UInt, tokenhandle: HANDLE, hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime: Long, identifier: LUID, dynamicgroupargs: Long, phauthzclientcontext: Long): BOOL =
    0

public actual fun AuthzInitializeObjectAccessAuditEvent(flags: AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS, hauditeventtype: AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype: PCWSTR, szobjecttype: PCWSTR, szobjectname: PCWSTR, szadditionalinfo: PCWSTR, phauditevent: Long, dwadditionalparametercount: UInt): BOOL =
    0

public actual fun AuthzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype: PCWSTR, szobjecttype: PCWSTR, szobjectname: PCWSTR, szadditionalinfo: PCWSTR, szadditionalinfo2: PCWSTR, phauditevent: Long, dwadditionalparametercount: UInt): BOOL =
    0

public actual fun AuthzInitializeRemoteResourceManager(prpcinitinfo: Long, phauthzresourcemanager: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager(prpcinitinfo.toString(), phauthzresourcemanager.toString()) as Int) else 0

public actual fun AuthzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK, pfncomputedynamicgroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS, pfnfreedynamicgroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS, szresourcemanagername: PCWSTR, phauthzresourcemanager: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager(flags.toInt(), pfndynamicaccesscheck.toLong().toString(), pfncomputedynamicgroups.toLong().toString(), pfnfreedynamicgroups.toLong().toString(), szresourcemanagername.toString(), phauthzresourcemanager.toString()) as Int) else 0

public actual fun AuthzInitializeResourceManagerEx(flags: AUTHZ_RESOURCE_MANAGER_FLAGS, pauthzinitinfo: Long, phauthzresourcemanager: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx(flags.toInt(), pauthzinitinfo.toString(), phauthzresourcemanager.toString()) as Int) else 0

public actual fun AuthzInstallSecurityEventSource(dwflags: UInt, pregistration: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource(dwflags.toInt(), pregistration.toString()) as Int) else 0

public actual fun AuthzModifyClaims(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, claimclass: AUTHZ_CONTEXT_INFORMATION_CLASS, pclaimoperations: Long, pclaims: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzModifyClaims(hauthzclientcontext.toString(), claimclass, pclaimoperations.toString(), pclaims.toString()) as Int) else 0

public actual fun AuthzModifySecurityAttributes(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, poperations: Long, pattributes: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes(hauthzclientcontext.toString(), poperations.toString(), pattributes.toString()) as Int) else 0

public actual fun AuthzModifySids(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sidclass: AUTHZ_CONTEXT_INFORMATION_CLASS, psidoperations: Long, psids: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzModifySids(hauthzclientcontext.toString(), sidclass, psidoperations.toString(), psids.toString()) as Int) else 0

public actual fun AuthzOpenObjectAudit(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit(flags.toInt(), hauthzclientcontext.toString(), prequest.toString(), hauditevent.toString(), psecuritydescriptor.toString(), optionalsecuritydescriptorarray.toString(), optionalsecuritydescriptorcount.toInt(), preply.toString()) as Int) else 0

public actual fun AuthzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: LPTHREAD_START_ROUTINE, pcallbackcontext: Long): BOOL =
    0

public actual fun AuthzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR, pheventprovider: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource(dwflags.toInt(), szeventsourcename.toString(), pheventprovider.toString()) as Int) else 0

public actual fun AuthzReportSecurityEvent(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, dwcount: UInt): BOOL =
    0

public actual fun AuthzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, pparams: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams(dwflags.toInt(), heventprovider.toString(), dwauditid.toInt(), pusersid.toString(), pparams.toString()) as Int) else 0

public actual fun AuthzSetAppContainerInformation(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pappcontainersid: PSID, capabilitycount: UInt, pcapabilitysids: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation(hauthzclientcontext.toString(), pappcontainersid.toString(), capabilitycount.toInt(), pcapabilitysids.toString()) as Int) else 0

public actual fun AuthzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource(dwflags.toInt(), szeventsourcename.toString()) as Int) else 0

public actual fun AuthzUnregisterCapChangeNotification(hcapchangesubscription: AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification(hcapchangesubscription.toString()) as Int) else 0

public actual fun AuthzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource(dwflags.toInt(), pheventprovider.toString()) as Int) else 0

public actual fun BuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA(pexplicitaccess.toString(), ptrusteename.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    }
}

public actual fun BuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW(pexplicitaccess.toString(), ptrusteename.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    }
}

public actual fun BuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA(pexplicitaccess.toString(), ptrusteename.toString(), ptrustee.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    }
}

public actual fun BuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW(pexplicitaccess.toString(), ptrusteename.toString(), ptrustee.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    }
}

public actual fun BuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA(ptrustee.toString(), pimpersonatetrustee.toString())
    }
}

public actual fun BuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW(ptrustee.toString(), pimpersonatetrustee.toString())
    }
}

public actual fun BuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA(powner.toString(), pgroup.toString(), ccountofaccessentries.toInt(), plistofaccessentries.toString(), ccountofauditentries.toInt(), plistofauditentries.toString(), poldsd.toString(), psizenewsd.toString(), pnewsd.toString()) as Int).toUInt() else 0u

public actual fun BuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW(powner.toString(), pgroup.toString(), ccountofaccessentries.toInt(), plistofaccessentries.toString(), ccountofauditentries.toInt(), plistofauditentries.toString(), poldsd.toString(), psizenewsd.toString(), pnewsd.toString()) as Int).toUInt() else 0u

public actual fun BuildTrusteeWithNameA(ptrustee: Long, pname: PCSTR) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA(ptrustee.toString(), pname.toString())
    }
}

public actual fun BuildTrusteeWithNameW(ptrustee: Long, pname: PCWSTR) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW(ptrustee.toString(), pname.toString())
    }
}

public actual fun BuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCSTR, inheritedobjecttypename: PCSTR, name: PCSTR) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA(ptrustee.toString(), pobjname.toString(), objecttype, objecttypename.toString(), inheritedobjecttypename.toString(), name.toString())
    }
}

public actual fun BuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCWSTR, inheritedobjecttypename: PCWSTR, name: PCWSTR) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW(ptrustee.toString(), pobjname.toString(), objecttype, objecttypename.toString(), inheritedobjecttypename.toString(), name.toString())
    }
}

public actual fun BuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA(ptrustee.toString(), pobjsid.toString(), pobjectguid.toString(), pinheritedobjectguid.toString(), psid.toString())
    }
}

public actual fun BuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW(ptrustee.toString(), pobjsid.toString(), pobjectguid.toString(), pinheritedobjectguid.toString(), psid.toString())
    }
}

public actual fun BuildTrusteeWithSidA(ptrustee: Long, psid: PSID) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA(ptrustee.toString(), psid.toString())
    }
}

public actual fun BuildTrusteeWithSidW(ptrustee: Long, psid: PSID) {
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) {
        _windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW(ptrustee.toString(), psid.toString())
    }
}

public actual fun ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor.toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.toString(), stringsecuritydescriptorlen.toString()) as Int) else 0

public actual fun ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor.toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.toString(), stringsecuritydescriptorlen.toString()) as Int) else 0

public actual fun ConvertSidToStringSidA(sid: PSID, stringsid: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertSidToStringSidA(sid.toString(), stringsid.toString()) as Int) else 0

public actual fun ConvertSidToStringSidW(sid: PSID, stringsid: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertSidToStringSidW(sid.toString(), stringsid.toString()) as Int) else 0

public actual fun ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: PCSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor.toString(), stringsdrevision.toInt(), securitydescriptor.toString(), securitydescriptorsize.toString()) as Int) else 0

public actual fun ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: PCWSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor.toString(), stringsdrevision.toInt(), securitydescriptor.toString(), securitydescriptorsize.toString()) as Int) else 0

public actual fun ConvertStringSidToSidA(stringsid: PCSTR, sid: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertStringSidToSidA(stringsid.toString(), sid.toString()) as Int) else 0

public actual fun ConvertStringSidToSidW(stringsid: PCWSTR, sid: Long): BOOL =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_ConvertStringSidToSidW(stringsid.toString(), sid.toString()) as Int) else 0

public actual fun FreeInheritedFromArray(pinheritarray: Long, acecnt: UShort, pfnarray: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_FreeInheritedFromArray(pinheritarray.toString(), acecnt.toInt(), pfnarray.toString()) as Int).toUInt() else 0u

public actual fun GetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA(pacl.toString(), ptrustee.toString(), psuccessfulauditedrights.toString(), pfailedauditrights.toString()) as Int).toUInt() else 0u

public actual fun GetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW(pacl.toString(), ptrustee.toString(), psuccessfulauditedrights.toString(), pfailedauditrights.toString()) as Int).toUInt() else 0u

public actual fun GetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA(pacl.toString(), ptrustee.toString(), paccessrights.toString()) as Int).toUInt() else 0u

public actual fun GetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW(pacl.toString(), ptrustee.toString(), paccessrights.toString()) as Int).toUInt() else 0u

public actual fun GetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA(pacl.toString(), pccountofexplicitentries.toString(), plistofexplicitentries.toString()) as Int).toUInt() else 0u

public actual fun GetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW(pacl.toString(), pccountofexplicitentries.toString(), plistofexplicitentries.toString()) as Int).toUInt() else 0u

public actual fun GetInheritanceSourceA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetInheritanceSourceA(pobjectname.toString(), objecttype, securityinfo.toInt(), container, pobjectclassguids.toString(), guidcount.toInt(), pacl.toString(), pfnarray.toString(), pgenericmapping.toString(), pinheritarray.toString()) as Int).toUInt() else 0u

public actual fun GetInheritanceSourceW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetInheritanceSourceW(pobjectname.toString(), objecttype, securityinfo.toInt(), container, pobjectclassguids.toString(), guidcount.toInt(), pacl.toString(), pfnarray.toString(), pgenericmapping.toString(), pinheritarray.toString()) as Int).toUInt() else 0u

public actual fun GetMultipleTrusteeA(ptrustee: Long): Long =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetMultipleTrusteeA(ptrustee.toString()) as String).toLong() else 0L

public actual fun GetMultipleTrusteeOperationA(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA(ptrustee.toString()) as Int) else 0

public actual fun GetMultipleTrusteeOperationW(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW(ptrustee.toString()) as Int) else 0

public actual fun GetMultipleTrusteeW(ptrustee: Long): Long =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetMultipleTrusteeW(ptrustee.toString()) as String).toLong() else 0L

public actual fun GetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA(pobjectname.toString(), objecttype, securityinfo.toInt(), ppsidowner.toString(), ppsidgroup.toString(), ppdacl.toString(), ppsacl.toString(), ppsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun GetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW(pobjectname.toString(), objecttype, securityinfo.toInt(), ppsidowner.toString(), ppsidgroup.toString(), ppdacl.toString(), ppsacl.toString(), ppsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun GetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetSecurityInfo(handle.toString(), objecttype, securityinfo.toInt(), ppsidowner.toString(), ppsidgroup.toString(), ppdacl.toString(), ppsacl.toString(), ppsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun GetTrusteeFormA(ptrustee: Long): TRUSTEE_FORM =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetTrusteeFormA(ptrustee.toString()) as Int) else 0

public actual fun GetTrusteeFormW(ptrustee: Long): TRUSTEE_FORM =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetTrusteeFormW(ptrustee.toString()) as Int) else 0

public actual fun GetTrusteeNameA(ptrustee: Long): PSTR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetTrusteeNameA(ptrustee.toString()) as String).toLong() else 0L

public actual fun GetTrusteeNameW(ptrustee: Long): PWSTR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetTrusteeNameW(ptrustee.toString()) as String).toLong() else 0L

public actual fun GetTrusteeTypeA(ptrustee: Long): TRUSTEE_TYPE =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetTrusteeTypeA(ptrustee.toString()) as Int) else 0

public actual fun GetTrusteeTypeW(ptrustee: Long): TRUSTEE_TYPE =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_GetTrusteeTypeW(ptrustee.toString()) as Int) else 0

public actual fun LookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA(ppowner.toString(), ppgroup.toString(), pccountofaccessentries.toString(), pplistofaccessentries.toString(), pccountofauditentries.toString(), pplistofauditentries.toString(), psd.toString()) as Int).toUInt() else 0u

public actual fun LookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW(ppowner.toString(), ppgroup.toString(), pccountofaccessentries.toString(), pplistofaccessentries.toString(), pccountofauditentries.toString(), pplistofauditentries.toString(), psd.toString()) as Int).toUInt() else 0u

public actual fun SetEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_SetEntriesInAclA(ccountofexplicitentries.toInt(), plistofexplicitentries.toString(), oldacl.toString(), newacl.toString()) as Int).toUInt() else 0u

public actual fun SetEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_SetEntriesInAclW(ccountofexplicitentries.toInt(), plistofexplicitentries.toString(), oldacl.toString(), newacl.toString()) as Int).toUInt() else 0u

public actual fun SetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA(pobjectname.toString(), objecttype, securityinfo.toInt(), psidowner.toString(), psidgroup.toString(), pdacl.toString(), psacl.toString()) as Int).toUInt() else 0u

public actual fun SetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW(pobjectname.toString(), objecttype, securityinfo.toInt(), psidowner.toString(), psidgroup.toString(), pdacl.toString(), psacl.toString()) as Int).toUInt() else 0u

public actual fun SetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_SetSecurityInfo(handle.toString(), objecttype, securityinfo.toInt(), psidowner.toString(), psidgroup.toString(), pdacl.toString(), psacl.toString()) as Int).toUInt() else 0u

public actual fun TreeResetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA(pobjectname.toString(), objecttype, securityinfo.toInt(), powner.toString(), pgroup.toString(), pdacl.toString(), psacl.toString(), keepexplicit, fnprogress.toLong().toString(), progressinvokesetting, args.toString()) as Int).toUInt() else 0u

public actual fun TreeResetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW(pobjectname.toString(), objecttype, securityinfo.toInt(), powner.toString(), pgroup.toString(), pdacl.toString(), psacl.toString(), keepexplicit, fnprogress.toLong().toString(), progressinvokesetting, args.toString()) as Int).toUInt() else 0u

public actual fun TreeSetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA(pobjectname.toString(), objecttype, securityinfo.toInt(), powner.toString(), pgroup.toString(), pdacl.toString(), psacl.toString(), dwaction.toInt(), fnprogress.toLong().toString(), progressinvokesetting, args.toString()) as Int).toUInt() else 0u

public actual fun TreeSetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    if (_windowsWin32SecurityAuthorizationNapiAddon != null) (_windowsWin32SecurityAuthorizationNapiAddon.windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW(pobjectname.toString(), objecttype, securityinfo.toInt(), powner.toString(), pgroup.toString(), pdacl.toString(), psacl.toString(), dwaction.toInt(), fnprogress.toLong().toString(), progressinvokesetting, args.toString()) as Int).toUInt() else 0u
