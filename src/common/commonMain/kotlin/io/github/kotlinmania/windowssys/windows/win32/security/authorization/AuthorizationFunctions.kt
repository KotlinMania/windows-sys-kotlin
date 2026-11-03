package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.ACE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public fun interface FnCallback {
    public operator fun invoke(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pace: Long, pargs: Long, pbaceapplicable: Long): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, args: Long, psidattrarray: Long, psidcount: Long, prestrictedsidattrarray: Long, prestrictedsidcount: Long): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(psidattrarray: Long)
}

public fun interface FnCallback3 {
    public operator fun invoke(pobjectname: PCWSTR, status: UInt, pinvokesetting: Long, args: Long, securityset: BOOL)
}

public fun AuthzAccessCheck(flags: AUTHZ_ACCESS_CHECK_FLAGS, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long, phaccesscheckresults: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzAccessCheck", longArrayOf(flags.toLong(), hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount.toLong(), preply, phaccesscheckresults)).toInt()
}

public fun AuthzAddSidsToContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sids: Long, sidcount: UInt, restrictedsids: Long, restrictedsidcount: UInt, phnewauthzclientcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzAddSidsToContext", longArrayOf(hauthzclientcontext, sids, sidcount.toLong(), restrictedsids, restrictedsidcount.toLong(), phnewauthzclientcontext)).toInt()
}

public fun AuthzCachedAccessCheck(flags: UInt, haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, preply: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzCachedAccessCheck", longArrayOf(flags.toLong(), haccesscheckresults, prequest, hauditevent, preply)).toInt()
}

public fun AuthzEnumerateSecurityEventSources(dwflags: UInt, buffer: Long, pdwcount: Long, pdwlength: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzEnumerateSecurityEventSources", longArrayOf(dwflags.toLong(), buffer, pdwcount, pdwlength)).toInt()
}

public fun AuthzEvaluateSacl(authzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, sacl: Long, grantedaccess: UInt, accessgranted: BOOL, pbgenerateaudit: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzEvaluateSacl", longArrayOf(authzclientcontext, prequest, sacl, grantedaccess.toLong(), accessgranted.toLong(), pbgenerateaudit)).toInt()
}

public fun AuthzFreeAuditEvent(hauditevent: AUTHZ_AUDIT_EVENT_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzFreeAuditEvent", longArrayOf(hauditevent)).toInt()
}

public fun AuthzFreeCentralAccessPolicyCache(): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzFreeCentralAccessPolicyCache", longArrayOf()).toInt()
}

public fun AuthzFreeContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzFreeContext", longArrayOf(hauthzclientcontext)).toInt()
}

public fun AuthzFreeHandle(haccesscheckresults: AUTHZ_ACCESS_CHECK_RESULTS_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzFreeHandle", longArrayOf(haccesscheckresults)).toInt()
}

public fun AuthzFreeResourceManager(hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzFreeResourceManager", longArrayOf(hauthzresourcemanager)).toInt()
}

public fun AuthzGetInformationFromContext(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, infoclass: AUTHZ_CONTEXT_INFORMATION_CLASS, buffersize: UInt, psizerequired: Long, buffer: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzGetInformationFromContext", longArrayOf(hauthzclientcontext, infoclass.toLong(), buffersize.toLong(), psizerequired, buffer)).toInt()
}

public fun AuthzInitializeCompoundContext(usercontext: AUTHZ_CLIENT_CONTEXT_HANDLE, devicecontext: AUTHZ_CLIENT_CONTEXT_HANDLE, phcompoundcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeCompoundContext", longArrayOf(usercontext, devicecontext, phcompoundcontext)).toInt()
}

public fun AuthzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pexpirationtime: Long, identifier: Foundation.LUID, dynamicgroupargs: Long, phnewauthzclientcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeContextFromAuthzContext", longArrayOf(flags.toLong(), hauthzclientcontext, pexpirationtime, Win32DynamicFfi.objectSlot(identifier), dynamicgroupargs, phnewauthzclientcontext)).toInt()
}

public fun AuthzInitializeContextFromSid(flags: UInt, usersid: PSID, hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime: Long, identifier: Foundation.LUID, dynamicgroupargs: Long, phauthzclientcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeContextFromSid", longArrayOf(flags.toLong(), usersid, hauthzresourcemanager, pexpirationtime, Win32DynamicFfi.objectSlot(identifier), dynamicgroupargs, phauthzclientcontext)).toInt()
}

public fun AuthzInitializeContextFromToken(flags: UInt, tokenhandle: Foundation.HANDLE, hauthzresourcemanager: AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime: Long, identifier: Foundation.LUID, dynamicgroupargs: Long, phauthzclientcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeContextFromToken", longArrayOf(flags.toLong(), Win32DynamicFfi.objectSlot(tokenhandle), hauthzresourcemanager, pexpirationtime, Win32DynamicFfi.objectSlot(identifier), dynamicgroupargs, phauthzclientcontext)).toInt()
}

public fun AuthzInitializeObjectAccessAuditEvent(flags: AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS, hauditeventtype: AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype: PCWSTR, szobjecttype: PCWSTR, szobjectname: PCWSTR, szadditionalinfo: PCWSTR, phauditevent: Long, dwadditionalparametercount: UInt, vararg variadicArgs: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeObjectAccessAuditEvent", longArrayOf(flags.toLong(), hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, phauditevent, dwadditionalparametercount.toLong()) + variadicArgs).toInt()
}

public fun AuthzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype: PCWSTR, szobjecttype: PCWSTR, szobjectname: PCWSTR, szadditionalinfo: PCWSTR, szadditionalinfo2: PCWSTR, phauditevent: Long, dwadditionalparametercount: UInt, vararg variadicArgs: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeObjectAccessAuditEvent2", longArrayOf(flags.toLong(), hauditeventtype, szoperationtype, szobjecttype, szobjectname, szadditionalinfo, szadditionalinfo2, phauditevent, dwadditionalparametercount.toLong()) + variadicArgs).toInt()
}

public fun AuthzInitializeRemoteResourceManager(prpcinitinfo: Long, phauthzresourcemanager: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeRemoteResourceManager", longArrayOf(prpcinitinfo, phauthzresourcemanager)).toInt()
}

public fun AuthzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK, pfncomputedynamicgroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS, pfnfreedynamicgroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS, szresourcemanagername: PCWSTR, phauthzresourcemanager: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeResourceManager", longArrayOf(flags.toLong(), Win32DynamicFfi.objectSlot(pfndynamicaccesscheck), Win32DynamicFfi.objectSlot(pfncomputedynamicgroups), Win32DynamicFfi.objectSlot(pfnfreedynamicgroups), szresourcemanagername, phauthzresourcemanager)).toInt()
}

public fun AuthzInitializeResourceManagerEx(flags: AUTHZ_RESOURCE_MANAGER_FLAGS, pauthzinitinfo: Long, phauthzresourcemanager: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInitializeResourceManagerEx", longArrayOf(flags.toLong(), pauthzinitinfo, phauthzresourcemanager)).toInt()
}

public fun AuthzInstallSecurityEventSource(dwflags: UInt, pregistration: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzInstallSecurityEventSource", longArrayOf(dwflags.toLong(), pregistration)).toInt()
}

public fun AuthzModifyClaims(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, claimclass: AUTHZ_CONTEXT_INFORMATION_CLASS, pclaimoperations: Long, pclaims: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzModifyClaims", longArrayOf(hauthzclientcontext, claimclass.toLong(), pclaimoperations, pclaims)).toInt()
}

public fun AuthzModifySecurityAttributes(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, poperations: Long, pattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzModifySecurityAttributes", longArrayOf(hauthzclientcontext, poperations, pattributes)).toInt()
}

public fun AuthzModifySids(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, sidclass: AUTHZ_CONTEXT_INFORMATION_CLASS, psidoperations: Long, psids: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzModifySids", longArrayOf(hauthzclientcontext, sidclass.toLong(), psidoperations, psids)).toInt()
}

public fun AuthzOpenObjectAudit(flags: UInt, hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, prequest: Long, hauditevent: AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: UInt, preply: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzOpenObjectAudit", longArrayOf(flags.toLong(), hauthzclientcontext, prequest, hauditevent, psecuritydescriptor, optionalsecuritydescriptorarray, optionalsecuritydescriptorcount.toLong(), preply)).toInt()
}

public fun AuthzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: System.Threading.LPTHREAD_START_ROUTINE, pcallbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzRegisterCapChangeNotification", longArrayOf(phcapchangesubscription, Win32DynamicFfi.objectSlot(pfncapchangecallback), pcallbackcontext)).toInt()
}

public fun AuthzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR, pheventprovider: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzRegisterSecurityEventSource", longArrayOf(dwflags.toLong(), szeventsourcename, pheventprovider)).toInt()
}

public fun AuthzReportSecurityEvent(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, dwcount: UInt, vararg variadicArgs: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzReportSecurityEvent", longArrayOf(dwflags.toLong(), heventprovider, dwauditid.toLong(), pusersid, dwcount.toLong()) + variadicArgs).toInt()
}

public fun AuthzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid: UInt, pusersid: PSID, pparams: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzReportSecurityEventFromParams", longArrayOf(dwflags.toLong(), heventprovider, dwauditid.toLong(), pusersid, pparams)).toInt()
}

public fun AuthzSetAppContainerInformation(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pappcontainersid: PSID, capabilitycount: UInt, pcapabilitysids: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzSetAppContainerInformation", longArrayOf(hauthzclientcontext, pappcontainersid, capabilitycount.toLong(), pcapabilitysids)).toInt()
}

public fun AuthzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzUninstallSecurityEventSource", longArrayOf(dwflags.toLong(), szeventsourcename)).toInt()
}

public fun AuthzUnregisterCapChangeNotification(hcapchangesubscription: AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzUnregisterCapChangeNotification", longArrayOf(hcapchangesubscription)).toInt()
}

public fun AuthzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: Long): BOOL {
    return Win32DynamicFfi.invoke("authz.dll", "AuthzUnregisterSecurityEventSource", longArrayOf(dwflags.toLong(), pheventprovider)).toInt()
}

public fun BuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildExplicitAccessWithNameA", longArrayOf(pexplicitaccess, ptrusteename, accesspermissions.toLong(), accessmode.toLong(), inheritance.toLong()))
}

public fun BuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: ACE_FLAGS) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildExplicitAccessWithNameW", longArrayOf(pexplicitaccess, ptrusteename, accesspermissions.toLong(), accessmode.toLong(), inheritance.toLong()))
}

public fun BuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: PCSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildImpersonateExplicitAccessWithNameA", longArrayOf(pexplicitaccess, ptrusteename, ptrustee, accesspermissions.toLong(), accessmode.toLong(), inheritance.toLong()))
}

public fun BuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: PCWSTR, ptrustee: Long, accesspermissions: UInt, accessmode: ACCESS_MODE, inheritance: UInt) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildImpersonateExplicitAccessWithNameW", longArrayOf(pexplicitaccess, ptrusteename, ptrustee, accesspermissions.toLong(), accessmode.toLong(), inheritance.toLong()))
}

public fun BuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildImpersonateTrusteeA", longArrayOf(ptrustee, pimpersonatetrustee))
}

public fun BuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildImpersonateTrusteeW", longArrayOf(ptrustee, pimpersonatetrustee))
}

public fun BuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildSecurityDescriptorA", longArrayOf(powner, pgroup, ccountofaccessentries.toLong(), plistofaccessentries, ccountofauditentries.toLong(), plistofauditentries, poldsd, psizenewsd, pnewsd))
    return Foundation.WIN32_ERROR()
}

public fun BuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: UInt, plistofaccessentries: Long, ccountofauditentries: UInt, plistofauditentries: Long, poldsd: PSECURITY_DESCRIPTOR, psizenewsd: Long, pnewsd: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildSecurityDescriptorW", longArrayOf(powner, pgroup, ccountofaccessentries.toLong(), plistofaccessentries, ccountofauditentries.toLong(), plistofauditentries, poldsd, psizenewsd, pnewsd))
    return Foundation.WIN32_ERROR()
}

public fun BuildTrusteeWithNameA(ptrustee: Long, pname: PCSTR) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithNameA", longArrayOf(ptrustee, pname))
}

public fun BuildTrusteeWithNameW(ptrustee: Long, pname: PCWSTR) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithNameW", longArrayOf(ptrustee, pname))
}

public fun BuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCSTR, inheritedobjecttypename: PCSTR, name: PCSTR) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithObjectsAndNameA", longArrayOf(ptrustee, pobjname, objecttype.toLong(), objecttypename, inheritedobjecttypename, name))
}

public fun BuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: SE_OBJECT_TYPE, objecttypename: PCWSTR, inheritedobjecttypename: PCWSTR, name: PCWSTR) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithObjectsAndNameW", longArrayOf(ptrustee, pobjname, objecttype.toLong(), objecttypename, inheritedobjecttypename, name))
}

public fun BuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithObjectsAndSidA", longArrayOf(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid))
}

public fun BuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: PSID) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithObjectsAndSidW", longArrayOf(ptrustee, pobjsid, pobjectguid, pinheritedobjectguid, psid))
}

public fun BuildTrusteeWithSidA(ptrustee: Long, psid: PSID) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithSidA", longArrayOf(ptrustee, psid))
}

public fun BuildTrusteeWithSidW(ptrustee: Long, psid: PSID) {
    Win32DynamicFfi.invoke("advapi32.dll", "BuildTrusteeWithSidW", longArrayOf(ptrustee, psid))
}

public fun ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertSecurityDescriptorToStringSecurityDescriptorA", longArrayOf(securitydescriptor, requestedstringsdrevision.toLong(), securityinformation.toLong(), stringsecuritydescriptor, stringsecuritydescriptorlen)).toInt()
}

public fun ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PSECURITY_DESCRIPTOR, requestedstringsdrevision: UInt, securityinformation: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertSecurityDescriptorToStringSecurityDescriptorW", longArrayOf(securitydescriptor, requestedstringsdrevision.toLong(), securityinformation.toLong(), stringsecuritydescriptor, stringsecuritydescriptorlen)).toInt()
}

public fun ConvertSidToStringSidA(sid: PSID, stringsid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertSidToStringSidA", longArrayOf(sid, stringsid)).toInt()
}

public fun ConvertSidToStringSidW(sid: PSID, stringsid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertSidToStringSidW", longArrayOf(sid, stringsid)).toInt()
}

public fun ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: PCSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertStringSecurityDescriptorToSecurityDescriptorA", longArrayOf(stringsecuritydescriptor, stringsdrevision.toLong(), securitydescriptor, securitydescriptorsize)).toInt()
}

public fun ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: PCWSTR, stringsdrevision: UInt, securitydescriptor: Long, securitydescriptorsize: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertStringSecurityDescriptorToSecurityDescriptorW", longArrayOf(stringsecuritydescriptor, stringsdrevision.toLong(), securitydescriptor, securitydescriptorsize)).toInt()
}

public fun ConvertStringSidToSidA(stringsid: PCSTR, sid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertStringSidToSidA", longArrayOf(stringsid, sid)).toInt()
}

public fun ConvertStringSidToSidW(stringsid: PCWSTR, sid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertStringSidToSidW", longArrayOf(stringsid, sid)).toInt()
}

public fun FreeInheritedFromArray(pinheritarray: Long, acecnt: UShort, pfnarray: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "FreeInheritedFromArray", longArrayOf(pinheritarray, acecnt.toLong(), pfnarray))
    return Foundation.WIN32_ERROR()
}

public fun GetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetAuditedPermissionsFromAclA", longArrayOf(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights))
    return Foundation.WIN32_ERROR()
}

public fun GetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetAuditedPermissionsFromAclW", longArrayOf(pacl, ptrustee, psuccessfulauditedrights, pfailedauditrights))
    return Foundation.WIN32_ERROR()
}

public fun GetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetEffectiveRightsFromAclA", longArrayOf(pacl, ptrustee, paccessrights))
    return Foundation.WIN32_ERROR()
}

public fun GetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetEffectiveRightsFromAclW", longArrayOf(pacl, ptrustee, paccessrights))
    return Foundation.WIN32_ERROR()
}

public fun GetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetExplicitEntriesFromAclA", longArrayOf(pacl, pccountofexplicitentries, plistofexplicitentries))
    return Foundation.WIN32_ERROR()
}

public fun GetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetExplicitEntriesFromAclW", longArrayOf(pacl, pccountofexplicitentries, plistofexplicitentries))
    return Foundation.WIN32_ERROR()
}

public fun GetInheritanceSourceA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetInheritanceSourceA", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), container.toLong(), pobjectclassguids, guidcount.toLong(), pacl, pfnarray, pgenericmapping, pinheritarray))
    return Foundation.WIN32_ERROR()
}

public fun GetInheritanceSourceW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, container: BOOL, pobjectclassguids: Long, guidcount: UInt, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetInheritanceSourceW", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), container.toLong(), pobjectclassguids, guidcount.toLong(), pacl, pfnarray, pgenericmapping, pinheritarray))
    return Foundation.WIN32_ERROR()
}

public fun GetMultipleTrusteeA(ptrustee: Long): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetMultipleTrusteeA", longArrayOf(ptrustee))
}

public fun GetMultipleTrusteeOperationA(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetMultipleTrusteeOperationA", longArrayOf(ptrustee)).toInt()
}

public fun GetMultipleTrusteeOperationW(ptrustee: Long): MULTIPLE_TRUSTEE_OPERATION {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetMultipleTrusteeOperationW", longArrayOf(ptrustee)).toInt()
}

public fun GetMultipleTrusteeW(ptrustee: Long): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetMultipleTrusteeW", longArrayOf(ptrustee))
}

public fun GetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetNamedSecurityInfoA", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor))
    return Foundation.WIN32_ERROR()
}

public fun GetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetNamedSecurityInfoW", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor))
    return Foundation.WIN32_ERROR()
}

public fun GetSecurityInfo(handle: Foundation.HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityInfo", longArrayOf(Win32DynamicFfi.objectSlot(handle), objecttype.toLong(), securityinfo.toLong(), ppsidowner, ppsidgroup, ppdacl, ppsacl, ppsecuritydescriptor))
    return Foundation.WIN32_ERROR()
}

public fun GetTrusteeFormA(ptrustee: Long): TRUSTEE_FORM {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTrusteeFormA", longArrayOf(ptrustee)).toInt()
}

public fun GetTrusteeFormW(ptrustee: Long): TRUSTEE_FORM {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTrusteeFormW", longArrayOf(ptrustee)).toInt()
}

public fun GetTrusteeNameA(ptrustee: Long): PSTR {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTrusteeNameA", longArrayOf(ptrustee))
}

public fun GetTrusteeNameW(ptrustee: Long): PWSTR {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTrusteeNameW", longArrayOf(ptrustee))
}

public fun GetTrusteeTypeA(ptrustee: Long): TRUSTEE_TYPE {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTrusteeTypeA", longArrayOf(ptrustee)).toInt()
}

public fun GetTrusteeTypeW(ptrustee: Long): TRUSTEE_TYPE {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTrusteeTypeW", longArrayOf(ptrustee)).toInt()
}

public fun LookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "LookupSecurityDescriptorPartsA", longArrayOf(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd))
    return Foundation.WIN32_ERROR()
}

public fun LookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: PSECURITY_DESCRIPTOR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "LookupSecurityDescriptorPartsW", longArrayOf(ppowner, ppgroup, pccountofaccessentries, pplistofaccessentries, pccountofauditentries, pplistofauditentries, psd))
    return Foundation.WIN32_ERROR()
}

public fun SetEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "SetEntriesInAclA", longArrayOf(ccountofexplicitentries.toLong(), plistofexplicitentries, oldacl, newacl))
    return Foundation.WIN32_ERROR()
}

public fun SetEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "SetEntriesInAclW", longArrayOf(ccountofexplicitentries.toLong(), plistofexplicitentries, oldacl, newacl))
    return Foundation.WIN32_ERROR()
}

public fun SetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "SetNamedSecurityInfoA", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), psidowner, psidgroup, pdacl, psacl))
    return Foundation.WIN32_ERROR()
}

public fun SetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "SetNamedSecurityInfoW", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), psidowner, psidgroup, pdacl, psacl))
    return Foundation.WIN32_ERROR()
}

public fun SetSecurityInfo(handle: Foundation.HANDLE, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, psidowner: PSID, psidgroup: PSID, pdacl: Long, psacl: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityInfo", longArrayOf(Win32DynamicFfi.objectSlot(handle), objecttype.toLong(), securityinfo.toLong(), psidowner, psidgroup, pdacl, psacl))
    return Foundation.WIN32_ERROR()
}

public fun TreeResetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TreeResetNamedSecurityInfoA", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), powner, pgroup, pdacl, psacl, keepexplicit.toLong(), Win32DynamicFfi.objectSlot(fnprogress), progressinvokesetting.toLong(), args))
    return Foundation.WIN32_ERROR()
}

public fun TreeResetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, keepexplicit: BOOL, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TreeResetNamedSecurityInfoW", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), powner, pgroup, pdacl, psacl, keepexplicit.toLong(), Win32DynamicFfi.objectSlot(fnprogress), progressinvokesetting.toLong(), args))
    return Foundation.WIN32_ERROR()
}

public fun TreeSetNamedSecurityInfoA(pobjectname: PCSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TreeSetNamedSecurityInfoA", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), powner, pgroup, pdacl, psacl, dwaction.toLong(), Win32DynamicFfi.objectSlot(fnprogress), progressinvokesetting.toLong(), args))
    return Foundation.WIN32_ERROR()
}

public fun TreeSetNamedSecurityInfoW(pobjectname: PCWSTR, objecttype: SE_OBJECT_TYPE, securityinfo: OBJECT_SECURITY_INFORMATION, powner: PSID, pgroup: PSID, pdacl: Long, psacl: Long, dwaction: TREE_SEC_INFO, fnprogress: FN_PROGRESS, progressinvokesetting: PROG_INVOKE_SETTING, args: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TreeSetNamedSecurityInfoW", longArrayOf(pobjectname, objecttype.toLong(), securityinfo.toLong(), powner, pgroup, pdacl, psacl, dwaction.toLong(), Win32DynamicFfi.objectSlot(fnprogress), progressinvokesetting.toLong(), args))
    return Foundation.WIN32_ERROR()
}
