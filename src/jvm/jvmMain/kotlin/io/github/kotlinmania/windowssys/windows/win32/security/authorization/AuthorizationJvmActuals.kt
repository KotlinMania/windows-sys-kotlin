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

private object WindowsWin32SecurityAuthorizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzAccessCheck(flags: Int, hauthzclientcontext: Long, prequest: Long, hauditevent: Long, psecuritydescriptor: Long, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: Int, preply: Long, phaccesscheckresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzAddSidsToContext(hauthzclientcontext: Long, sids: Long, sidcount: Int, restrictedsids: Long, restrictedsidcount: Int, phnewauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck(flags: Int, haccesscheckresults: Long, prequest: Long, hauditevent: Long, preply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources(dwflags: Int, buffer: Long, pdwcount: Long, pdwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzEvaluateSacl(authzclientcontext: Long, prequest: Long, sacl: Long, grantedaccess: Int, accessgranted: Int, pbgenerateaudit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent(hauditevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzFreeContext(hauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzFreeHandle(haccesscheckresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzFreeResourceManager(hauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext(hauthzclientcontext: Long, infoclass: Int, buffersize: Int, psizerequired: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext(usercontext: Long, devicecontext: Long, phcompoundcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager(prpcinitinfo: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager(flags: Int, pfndynamicaccesscheck: Long, pfncomputedynamicgroups: Long, pfnfreedynamicgroups: Long, szresourcemanagername: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx(flags: Int, pauthzinitinfo: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource(dwflags: Int, pregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzModifyClaims(hauthzclientcontext: Long, claimclass: Int, pclaimoperations: Long, pclaims: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes(hauthzclientcontext: Long, poperations: Long, pattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzModifySids(hauthzclientcontext: Long, sidclass: Int, psidoperations: Long, psids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit(flags: Int, hauthzclientcontext: Long, prequest: Long, hauditevent: Long, psecuritydescriptor: Long, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: Int, preply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource(dwflags: Int, szeventsourcename: Long, pheventprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams(dwflags: Int, heventprovider: Long, dwauditid: Int, pusersid: Long, pparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation(hauthzclientcontext: Long, pappcontainersid: Long, capabilitycount: Int, pcapabilitysids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource(dwflags: Int, szeventsourcename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification(hcapchangesubscription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource(dwflags: Int, pheventprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: Long, ptrustee: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: Long, ptrustee: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: Int, plistofaccessentries: Long, ccountofauditentries: Int, plistofauditentries: Long, poldsd: Long, psizenewsd: Long, pnewsd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: Int, plistofaccessentries: Long, ccountofauditentries: Int, plistofauditentries: Long, poldsd: Long, psizenewsd: Long, pnewsd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA(ptrustee: Long, pname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW(ptrustee: Long, pname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: Int, objecttypename: Long, inheritedobjecttypename: Long, name: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: Int, objecttypename: Long, inheritedobjecttypename: Long, name: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA(ptrustee: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW(ptrustee: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: Long, requestedstringsdrevision: Int, securityinformation: Int, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: Long, requestedstringsdrevision: Int, securityinformation: Int, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertSidToStringSidA(sid: Long, stringsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertSidToStringSidW(sid: Long, stringsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Long, stringsdrevision: Int, securitydescriptor: Long, securitydescriptorsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Long, stringsdrevision: Int, securitydescriptor: Long, securitydescriptorsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertStringSidToSidA(stringsid: Long, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_ConvertStringSidToSidW(stringsid: Long, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_FreeInheritedFromArray(pinheritarray: Long, acecnt: Short, pfnarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetInheritanceSourceA(pobjectname: Long, objecttype: Int, securityinfo: Int, container: Int, pobjectclassguids: Long, guidcount: Int, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetInheritanceSourceW(pobjectname: Long, objecttype: Int, securityinfo: Int, container: Int, pobjectclassguids: Long, guidcount: Int, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetMultipleTrusteeA(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetMultipleTrusteeW(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetSecurityInfo(handle: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetTrusteeFormA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetTrusteeFormW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetTrusteeNameA(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetTrusteeNameW(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetTrusteeTypeA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_GetTrusteeTypeW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_SetEntriesInAclA(ccountofexplicitentries: Int, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_SetEntriesInAclW(ccountofexplicitentries: Int, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_SetSecurityInfo(handle: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, keepexplicit: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, keepexplicit: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, dwaction: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, dwaction: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int
}

public actual fun AuthzAccessCheck(flags: AUTHZ_ACCESS_CHECK_FLAGS, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long, phaccesscheckresults: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzAccessCheck(flags.toInt(), hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount.toInt(), preply, phaccesscheckresults)

public actual fun AuthzAddSidsToContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sids: Long, sidcount: UInt, restrictedsids: Long, restrictedsidcount: UInt, phnewauthzclientcontext: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzAddSidsToContext(hauthzclientcontext, sids, sidcount.toInt(), restrictedsids, restrictedsidcount.toInt(), phnewauthzclientcontext)

public actual fun AuthzCachedAccessCheck(flags: UInt, haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, preply: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck(flags.toInt(), haccesscheckresults, prequest, hauditevent, preply)

public actual fun AuthzEnumerateSecurityEventSources(dwflags: UInt, buffer: Long, pdwcount: Long, pdwlength: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources(dwflags.toInt(), buffer, pdwcount, pdwlength)

public actual fun AuthzEvaluateSacl(authzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, sacl: Long, grantedaccess: UInt, accessgranted: BOOL, pbgenerateaudit: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzEvaluateSacl(authzclientcontext, prequest, sacl, grantedaccess.toInt(), accessgranted, pbgenerateaudit)

public actual fun AuthzFreeAuditEvent(hauditevent: AUTHZ_AUDIT_EVENT_HANDLE): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent(hauditevent)

public actual fun AuthzFreeCentralAccessPolicyCache(): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache()

public actual fun AuthzFreeContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzFreeContext(hauthzclientcontext)

public actual fun AuthzFreeHandle(haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzFreeHandle(haccesscheckresults)

public actual fun AuthzFreeResourceManager(hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzFreeResourceManager(hauthzresourcemanager)

public actual fun AuthzGetInformationFromContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, infoclass: AUTHZ_CONTEXT_INFORMATION_CLASS, buffersize: UInt, psizerequired: Long, buffer: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext(hauthzclientcontext, infoclass, buffersize.toInt(), psizerequired, buffer)

public actual fun AuthzInitializeCompoundContext(usercontext: AUTHZ_CLIENT_CONTEXT_HANDLE, devicecontext: AUTHZ_CLIENT_CONTEXT_HANDLE, phcompoundcontext: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext(usercontext, devicecontext, phcompoundcontext)

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
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager(prpcinitinfo, phauthzresourcemanager)

public actual fun AuthzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK, pfncomputedynamicgroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS, pfnfreedynamicgroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS, szresourcemanagername: PCWSTR, phauthzresourcemanager: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager(flags.toInt(), pfndynamicaccesscheck.toLong(), pfncomputedynamicgroups.toLong(), pfnfreedynamicgroups.toLong(), szresourcemanagername, phauthzresourcemanager)

public actual fun AuthzInitializeResourceManagerEx(flags: AUTHZ_RESOURCE_MANAGER_FLAGS, pauthzinitinfo: Long, phauthzresourcemanager: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx(flags.toInt(), pauthzinitinfo, phauthzresourcemanager)

public actual fun AuthzInstallSecurityEventSource(dwflags: UInt, pregistration: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource(dwflags.toInt(), pregistration)

public actual fun AuthzModifyClaims(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, claimclass: AUTHZ_CONTEXT_INFORMATION_CLASS, pclaimoperations: Long, pclaims: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzModifyClaims(hauthzclientcontext, claimclass, pclaimoperations, pclaims)

public actual fun AuthzModifySecurityAttributes(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, poperations: Long, pattributes: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes(hauthzclientcontext, poperations, pattributes)

public actual fun AuthzModifySids(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sidclass: AUTHZ_CONTEXT_INFORMATION_CLASS, psidoperations: Long, psids: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzModifySids(hauthzclientcontext, sidclass, psidoperations, psids)

public actual fun AuthzOpenObjectAudit(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit(flags.toInt(), hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount.toInt(), preply)

public actual fun AuthzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: LPTHREAD_START_ROUTINE, pcallbackcontext: Long): BOOL =
    0

public actual fun AuthzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR, pheventprovider: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource(dwflags.toInt(), szeventsourcename, pheventprovider)

public actual fun AuthzReportSecurityEvent(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, dwcount: UInt): BOOL =
    0

public actual fun AuthzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, pparams: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams(dwflags.toInt(), heventprovider, dwauditid.toInt(), pusersid, pparams)

public actual fun AuthzSetAppContainerInformation(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pappcontainersid: PSID, capabilitycount: UInt, pcapabilitysids: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation(hauthzclientcontext, pappcontainersid, capabilitycount.toInt(), pcapabilitysids)

public actual fun AuthzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource(dwflags.toInt(), szeventsourcename)

public actual fun AuthzUnregisterCapChangeNotification(hcapchangesubscription: AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification(hcapchangesubscription)

public actual fun AuthzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource(dwflags.toInt(), pheventprovider)

public actual fun BuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA(pexplicitaccess, ptrusteename, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun BuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW(pexplicitaccess, ptrusteename, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun BuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA(pexplicitaccess, ptrusteename, ptrustee, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun BuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW(pexplicitaccess, ptrusteename, ptrustee, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun BuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA(ptrustee, pimpersonatetrustee)
}

public actual fun BuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW(ptrustee, pimpersonatetrustee)
}

public actual fun BuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA(powner, pgroup, ccountofaccessentries.toInt(), plistofaccessentries, ccountofauditentries.toInt(), plistofauditentries, poldsd, psizenewsd, pnewsd).toUInt()

public actual fun BuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW(powner, pgroup, ccountofaccessentries.toInt(), plistofaccessentries, ccountofauditentries.toInt(), plistofauditentries, poldsd, psizenewsd, pnewsd).toUInt()

public actual fun BuildTrusteeWithNameA(ptrustee: Long, pname: PCSTR) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA(ptrustee, pname)
}

public actual fun BuildTrusteeWithNameW(ptrustee: Long, pname: PCWSTR) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW(ptrustee, pname)
}

public actual fun BuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCSTR, inheritedobjecttypename: PCSTR, name: PCSTR) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA(ptrustee, pobjname, objecttype, objecttypename, inheritedobjecttypename, name)
}

public actual fun BuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCWSTR, inheritedobjecttypename: PCWSTR, name: PCWSTR) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW(ptrustee, pobjname, objecttype, objecttypename, inheritedobjecttypename, name)
}

public actual fun BuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid)
}

public actual fun BuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid)
}

public actual fun BuildTrusteeWithSidA(ptrustee: Long, psid: PSID) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA(ptrustee, psid)
}

public actual fun BuildTrusteeWithSidW(ptrustee: Long, psid: PSID) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW(ptrustee, psid)
}

public actual fun ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor, requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor, stringsecuritydescriptorlen)

public actual fun ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor, requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor, stringsecuritydescriptorlen)

public actual fun ConvertSidToStringSidA(sid: PSID, stringsid: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertSidToStringSidA(sid, stringsid)

public actual fun ConvertSidToStringSidW(sid: PSID, stringsid: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertSidToStringSidW(sid, stringsid)

public actual fun ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: PCSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor, stringsdrevision.toInt(), securitydescriptor, securitydescriptorsize)

public actual fun ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: PCWSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor, stringsdrevision.toInt(), securitydescriptor, securitydescriptorsize)

public actual fun ConvertStringSidToSidA(stringsid: PCSTR, sid: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertStringSidToSidA(stringsid, sid)

public actual fun ConvertStringSidToSidW(stringsid: PCWSTR, sid: Long): BOOL =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_ConvertStringSidToSidW(stringsid, sid)

public actual fun FreeInheritedFromArray(pinheritarray: Long, acecnt: UShort, pfnarray: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_FreeInheritedFromArray(pinheritarray, acecnt.toShort(), pfnarray).toUInt()

public actual fun GetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights).toUInt()

public actual fun GetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights).toUInt()

public actual fun GetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA(pacl, ptrustee, paccessrights).toUInt()

public actual fun GetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW(pacl, ptrustee, paccessrights).toUInt()

public actual fun GetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA(pacl, pccountofexplicitentries, plistofexplicitentries).toUInt()

public actual fun GetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW(pacl, pccountofexplicitentries, plistofexplicitentries).toUInt()

public actual fun GetInheritanceSourceA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetInheritanceSourceA(pobjectname, objecttype, securityinfo.toInt(), container, pobjectclassguids, guidcount.toInt(), pacl, pfnarray, pgenericmapping, pinheritarray).toUInt()

public actual fun GetInheritanceSourceW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetInheritanceSourceW(pobjectname, objecttype, securityinfo.toInt(), container, pobjectclassguids, guidcount.toInt(), pacl, pfnarray, pgenericmapping, pinheritarray).toUInt()

public actual fun GetMultipleTrusteeA(ptrustee: Long): Long =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetMultipleTrusteeA(ptrustee)

public actual fun GetMultipleTrusteeOperationA(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA(ptrustee)

public actual fun GetMultipleTrusteeOperationW(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW(ptrustee)

public actual fun GetMultipleTrusteeW(ptrustee: Long): Long =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetMultipleTrusteeW(ptrustee)

public actual fun GetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA(pobjectname, objecttype, securityinfo.toInt(), ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor).toUInt()

public actual fun GetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW(pobjectname, objecttype, securityinfo.toInt(), ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor).toUInt()

public actual fun GetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetSecurityInfo(handle, objecttype, securityinfo.toInt(), ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor).toUInt()

public actual fun GetTrusteeFormA(ptrustee: Long): TRUSTEE_FORM =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetTrusteeFormA(ptrustee)

public actual fun GetTrusteeFormW(ptrustee: Long): TRUSTEE_FORM =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetTrusteeFormW(ptrustee)

public actual fun GetTrusteeNameA(ptrustee: Long): PSTR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetTrusteeNameA(ptrustee)

public actual fun GetTrusteeNameW(ptrustee: Long): PWSTR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetTrusteeNameW(ptrustee)

public actual fun GetTrusteeTypeA(ptrustee: Long): TRUSTEE_TYPE =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetTrusteeTypeA(ptrustee)

public actual fun GetTrusteeTypeW(ptrustee: Long): TRUSTEE_TYPE =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_GetTrusteeTypeW(ptrustee)

public actual fun LookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd).toUInt()

public actual fun LookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd).toUInt()

public actual fun SetEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_SetEntriesInAclA(ccountofexplicitentries.toInt(), plistofexplicitentries, oldacl, newacl).toUInt()

public actual fun SetEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_SetEntriesInAclW(ccountofexplicitentries.toInt(), plistofexplicitentries, oldacl, newacl).toUInt()

public actual fun SetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA(pobjectname, objecttype, securityinfo.toInt(), psidowner, psidgroup, pdacl, psacl).toUInt()

public actual fun SetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW(pobjectname, objecttype, securityinfo.toInt(), psidowner, psidgroup, pdacl, psacl).toUInt()

public actual fun SetSecurityInfo(handle: HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_SetSecurityInfo(handle, objecttype, securityinfo.toInt(), psidowner, psidgroup, pdacl, psacl).toUInt()

public actual fun TreeResetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA(pobjectname, objecttype, securityinfo.toInt(), powner, pgroup, pdacl, psacl, keepexplicit, fnprogress.toLong(), progressinvokesetting, args).toUInt()

public actual fun TreeResetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW(pobjectname, objecttype, securityinfo.toInt(), powner, pgroup, pdacl, psacl, keepexplicit, fnprogress.toLong(), progressinvokesetting, args).toUInt()

public actual fun TreeSetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA(pobjectname, objecttype, securityinfo.toInt(), powner, pgroup, pdacl, psacl, dwaction.toInt(), fnprogress.toLong(), progressinvokesetting, args).toUInt()

public actual fun TreeSetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): WIN32_ERROR =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW(pobjectname, objecttype, securityinfo.toInt(), powner, pgroup, pdacl, psacl, dwaction.toInt(), fnprogress.toLong(), progressinvokesetting, args).toUInt()
