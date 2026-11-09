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

public expect fun AuthzAccessCheck(flags: AUTHZ_ACCESS_CHECK_FLAGS, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long, phaccesscheckresults: Long): BOOL

public expect fun AuthzAddSidsToContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sids: Long, sidcount: UInt, restrictedsids: Long, restrictedsidcount: UInt, phnewauthzclientcontext: Long): BOOL

public expect fun AuthzCachedAccessCheck(flags: UInt, haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, preply: Long): BOOL

public expect fun AuthzEnumerateSecurityEventSources(dwflags: UInt, buffer: Long, pdwcount: Long, pdwlength: Long): BOOL

public expect fun AuthzEvaluateSacl(authzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, sacl: Long, grantedaccess: UInt, accessgranted: BOOL, pbgenerateaudit: Long): BOOL

public expect fun AuthzFreeAuditEvent(hauditevent: AUTHZ_AUDIT_EVENT_HANDLE): BOOL

public expect fun AuthzFreeCentralAccessPolicyCache(): BOOL

public expect fun AuthzFreeContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE): BOOL

public expect fun AuthzFreeHandle(haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE): BOOL

public expect fun AuthzFreeResourceManager(hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE): BOOL

public expect fun AuthzGetInformationFromContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, infoclass: AUTHZ_CONTEXT_INFORMATION_CLASS, buffersize: UInt, psizerequired: Long, buffer: Long): BOOL

public expect fun AuthzInitializeCompoundContext(usercontext: AUTHZ_CLIENT_CONTEXT_HANDLE, devicecontext: AUTHZ_CLIENT_CONTEXT_HANDLE, phcompoundcontext: Long): BOOL

public expect fun AuthzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pexpirationtime: Long, identifier: LUID, dynamicgroupargs: Long, phnewauthzclientcontext: Long): BOOL

public expect fun AuthzInitializeContextFromSid(flags: UInt, usersid: PSID, hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime: Long, identifier: LUID, dynamicgroupargs: Long, phauthzclientcontext: Long): BOOL

public expect fun AuthzInitializeContextFromToken(flags: UInt, tokenhandle: HANDLE, hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime: Long, identifier: LUID, dynamicgroupargs: Long, phauthzclientcontext: Long): BOOL

public expect fun AuthzInitializeObjectAccessAuditEvent(flags: AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS, hauditeventtype: AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype: PCWSTR, szobjecttype: PCWSTR, szobjectname: PCWSTR, szadditionalinfo: PCWSTR, phauditevent: Long, dwadditionalparametercount: UInt, vararg variadicArgs: Long): BOOL

public expect fun AuthzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype: PCWSTR, szobjecttype: PCWSTR, szobjectname: PCWSTR, szadditionalinfo: PCWSTR, szadditionalinfo2: PCWSTR, phauditevent: Long, dwadditionalparametercount: UInt, vararg variadicArgs: Long): BOOL

public expect fun AuthzInitializeRemoteResourceManager(prpcinitinfo: Long, phauthzresourcemanager: Long): BOOL

public expect fun AuthzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK, pfncomputedynamicgroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS, pfnfreedynamicgroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS, szresourcemanagername: PCWSTR, phauthzresourcemanager: Long): BOOL

public expect fun AuthzInitializeResourceManagerEx(flags: AUTHZ_RESOURCE_MANAGER_FLAGS, pauthzinitinfo: Long, phauthzresourcemanager: Long): BOOL

public expect fun AuthzInstallSecurityEventSource(dwflags: UInt, pregistration: Long): BOOL

public expect fun AuthzModifyClaims(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, claimclass: AUTHZ_CONTEXT_INFORMATION_CLASS, pclaimoperations: Long, pclaims: Long): BOOL

public expect fun AuthzModifySecurityAttributes(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, poperations: Long, pattributes: Long): BOOL

public expect fun AuthzModifySids(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sidclass: AUTHZ_CONTEXT_INFORMATION_CLASS, psidoperations: Long, psids: Long): BOOL

public expect fun AuthzOpenObjectAudit(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long): BOOL

public expect fun AuthzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: LPTHREAD_START_ROUTINE, pcallbackcontext: Long): BOOL

public expect fun AuthzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR, pheventprovider: Long): BOOL

public expect fun AuthzReportSecurityEvent(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, dwcount: UInt, vararg variadicArgs: Long): BOOL

public expect fun AuthzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, pparams: Long): BOOL

public expect fun AuthzSetAppContainerInformation(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pappcontainersid: PSID, capabilitycount: UInt, pcapabilitysids: Long): BOOL

public expect fun AuthzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR): BOOL

public expect fun AuthzUnregisterCapChangeNotification(hcapchangesubscription: AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE): BOOL

public expect fun AuthzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: Long): BOOL

public expect fun BuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS)

public expect fun BuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS)

public expect fun BuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt)

public expect fun BuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt)

public expect fun BuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long)

public expect fun BuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long)

public expect fun BuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR

public expect fun BuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR

public expect fun BuildTrusteeWithNameA(ptrustee: Long, pname: PCSTR)

public expect fun BuildTrusteeWithNameW(ptrustee: Long, pname: PCWSTR)

public expect fun BuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCSTR, inheritedobjecttypename: PCSTR, name: PCSTR)

public expect fun BuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCWSTR, inheritedobjecttypename: PCWSTR, name: PCWSTR)

public expect fun BuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID)

public expect fun BuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID)

public expect fun BuildTrusteeWithSidA(ptrustee: Long, psid: PSID)

public expect fun BuildTrusteeWithSidW(ptrustee: Long, psid: PSID)

public expect fun ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL

public expect fun ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL

public expect fun ConvertSidToStringSidA(sid: PSID, stringsid: Long): BOOL

public expect fun ConvertSidToStringSidW(sid: PSID, stringsid: Long): BOOL

public expect fun ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: PCSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL

public expect fun ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: PCWSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL

public expect fun ConvertStringSidToSidA(stringsid: PCSTR, sid: Long): BOOL

public expect fun ConvertStringSidToSidW(stringsid: PCWSTR, sid: Long): BOOL

public expect fun FreeInheritedFromArray(pinheritarray: Long, acecnt: UShort, pfnarray: Long): WIN32_ERROR

public expect fun GetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR

public expect fun GetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR

public expect fun GetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR

public expect fun GetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR

public expect fun GetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR

public expect fun GetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR

public expect fun GetInheritanceSourceA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR

public expect fun GetInheritanceSourceW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR

public expect fun GetMultipleTrusteeA(ptrustee: Long): Long

public expect fun GetMultipleTrusteeOperationA(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION

public expect fun GetMultipleTrusteeOperationW(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION

public expect fun GetMultipleTrusteeW(ptrustee: Long): Long

public expect fun GetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR

public expect fun GetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR

public expect fun GetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR

public expect fun GetTrusteeFormA(ptrustee: Long): TRUSTEE_FORM

public expect fun GetTrusteeFormW(ptrustee: Long): TRUSTEE_FORM

public expect fun GetTrusteeNameA(ptrustee: Long): PSTR

public expect fun GetTrusteeNameW(ptrustee: Long): PWSTR

public expect fun GetTrusteeTypeA(ptrustee: Long): TRUSTEE_TYPE

public expect fun GetTrusteeTypeW(ptrustee: Long): TRUSTEE_TYPE

public expect fun LookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR

public expect fun LookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR

public expect fun SetEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR

public expect fun SetEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR

public expect fun SetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR

public expect fun SetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR

public expect fun SetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR

public expect fun TreeResetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR

public expect fun TreeResetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR

public expect fun TreeSetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR

public expect fun TreeSetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR
