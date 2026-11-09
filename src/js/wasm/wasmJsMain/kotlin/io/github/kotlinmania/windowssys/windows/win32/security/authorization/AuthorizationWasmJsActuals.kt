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

public actual fun AuthzAccessCheck(flags: AUTHZ_ACCESS_CHECK_FLAGS, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long, phaccesscheckresults: Long): BOOL =
    0

public actual fun AuthzAddSidsToContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sids: Long, sidcount: UInt, restrictedsids: Long, restrictedsidcount: UInt, phnewauthzclientcontext: Long): BOOL =
    0

public actual fun AuthzCachedAccessCheck(flags: UInt, haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, preply: Long): BOOL =
    0

public actual fun AuthzEnumerateSecurityEventSources(dwflags: UInt, buffer: Long, pdwcount: Long, pdwlength: Long): BOOL =
    0

public actual fun AuthzEvaluateSacl(authzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, sacl: Long, grantedaccess: UInt, accessgranted: BOOL, pbgenerateaudit: Long): BOOL =
    0

public actual fun AuthzFreeAuditEvent(hauditevent: AUTHZ_AUDIT_EVENT_HANDLE): BOOL =
    0

public actual fun AuthzFreeCentralAccessPolicyCache(): BOOL =
    0

public actual fun AuthzFreeContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE): BOOL =
    0

public actual fun AuthzFreeHandle(haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE): BOOL =
    0

public actual fun AuthzFreeResourceManager(hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE): BOOL =
    0

public actual fun AuthzGetInformationFromContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, infoclass: AUTHZ_CONTEXT_INFORMATION_CLASS, buffersize: UInt, psizerequired: Long, buffer: Long): BOOL =
    0

public actual fun AuthzInitializeCompoundContext(usercontext: AUTHZ_CLIENT_CONTEXT_HANDLE, devicecontext: AUTHZ_CLIENT_CONTEXT_HANDLE, phcompoundcontext: Long): BOOL =
    0

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
    0

public actual fun AuthzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK, pfncomputedynamicgroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS, pfnfreedynamicgroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS, szresourcemanagername: PCWSTR, phauthzresourcemanager: Long): BOOL =
    0

public actual fun AuthzInitializeResourceManagerEx(flags: AUTHZ_RESOURCE_MANAGER_FLAGS, pauthzinitinfo: Long, phauthzresourcemanager: Long): BOOL =
    0

public actual fun AuthzInstallSecurityEventSource(dwflags: UInt, pregistration: Long): BOOL =
    0

public actual fun AuthzModifyClaims(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, claimclass: AUTHZ_CONTEXT_INFORMATION_CLASS, pclaimoperations: Long, pclaims: Long): BOOL =
    0

public actual fun AuthzModifySecurityAttributes(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, poperations: Long, pattributes: Long): BOOL =
    0

public actual fun AuthzModifySids(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sidclass: AUTHZ_CONTEXT_INFORMATION_CLASS, psidoperations: Long, psids: Long): BOOL =
    0

public actual fun AuthzOpenObjectAudit(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long): BOOL =
    0

public actual fun AuthzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: LPTHREAD_START_ROUTINE, pcallbackcontext: Long): BOOL =
    0

public actual fun AuthzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR, pheventprovider: Long): BOOL =
    0

public actual fun AuthzReportSecurityEvent(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, dwcount: UInt): BOOL =
    0

public actual fun AuthzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, pparams: Long): BOOL =
    0

public actual fun AuthzSetAppContainerInformation(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pappcontainersid: PSID, capabilitycount: UInt, pcapabilitysids: Long): BOOL =
    0

public actual fun AuthzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR): BOOL =
    0

public actual fun AuthzUnregisterCapChangeNotification(hcapchangesubscription: AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE): BOOL =
    0

public actual fun AuthzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: Long): BOOL =
    0

public actual fun BuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
}

public actual fun BuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
}

public actual fun BuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
}

public actual fun BuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
}

public actual fun BuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long) {
}

public actual fun BuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long) {
}

public actual fun BuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR =
    0u

public actual fun BuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR =
    0u

public actual fun BuildTrusteeWithNameA(ptrustee: Long, pname: PCSTR) {
}

public actual fun BuildTrusteeWithNameW(ptrustee: Long, pname: PCWSTR) {
}

public actual fun BuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCSTR, inheritedobjecttypename: PCSTR, name: PCSTR) {
}

public actual fun BuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCWSTR, inheritedobjecttypename: PCWSTR, name: PCWSTR) {
}

public actual fun BuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
}

public actual fun BuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
}

public actual fun BuildTrusteeWithSidA(ptrustee: Long, psid: PSID) {
}

public actual fun BuildTrusteeWithSidW(ptrustee: Long, psid: PSID) {
}

public actual fun ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL =
    0

public actual fun ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL =
    0

public actual fun ConvertSidToStringSidA(sid: PSID, stringsid: Long): BOOL =
    0

public actual fun ConvertSidToStringSidW(sid: PSID, stringsid: Long): BOOL =
    0

public actual fun ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: PCSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL =
    0

public actual fun ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: PCWSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL =
    0

public actual fun ConvertStringSidToSidA(stringsid: PCSTR, sid: Long): BOOL =
    0

public actual fun ConvertStringSidToSidW(stringsid: PCWSTR, sid: Long): BOOL =
    0

public actual fun FreeInheritedFromArray(pinheritarray: Long, acecnt: UShort, pfnarray: Long): WIN32_ERROR =
    0u

public actual fun GetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR =
    0u

public actual fun GetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR =
    0u

public actual fun GetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR =
    0u

public actual fun GetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR =
    0u

public actual fun GetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR =
    0u

public actual fun GetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR =
    0u

public actual fun GetInheritanceSourceA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR =
    0u

public actual fun GetInheritanceSourceW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR =
    0u

public actual fun GetMultipleTrusteeA(ptrustee: Long): Long =
    0L

public actual fun GetMultipleTrusteeOperationA(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION =
    0

public actual fun GetMultipleTrusteeOperationW(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION =
    0

public actual fun GetMultipleTrusteeW(ptrustee: Long): Long =
    0L

public actual fun GetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    0u

public actual fun GetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    0u

public actual fun GetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    0u

public actual fun GetTrusteeFormA(ptrustee: Long): TRUSTEE_FORM =
    0

public actual fun GetTrusteeFormW(ptrustee: Long): TRUSTEE_FORM =
    0

public actual fun GetTrusteeNameA(ptrustee: Long): PSTR =
    0L

public actual fun GetTrusteeNameW(ptrustee: Long): PWSTR =
    0L

public actual fun GetTrusteeTypeA(ptrustee: Long): TRUSTEE_TYPE =
    0

public actual fun GetTrusteeTypeW(ptrustee: Long): TRUSTEE_TYPE =
    0

public actual fun LookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    0u

public actual fun LookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    0u

public actual fun SetEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR =
    0u

public actual fun SetEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR =
    0u

public actual fun SetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    0u

public actual fun SetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    0u

public actual fun SetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    0u

public actual fun TreeResetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    0u

public actual fun TreeResetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    0u

public actual fun TreeSetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    0u

public actual fun TreeSetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    0u
