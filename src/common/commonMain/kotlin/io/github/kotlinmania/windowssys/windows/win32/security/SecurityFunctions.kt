package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun AccessCheck(psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: Foundation.HANDLE, desiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheck", longArrayOf(psecuritydescriptor, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus)).toInt()
}

public fun AccessCheckAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckAndAuditAlarmA", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toLong(), genericmapping, objectcreation.toLong(), grantedaccess, accessstatus, pfgenerateonclose)).toInt()
}

public fun AccessCheckAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckAndAuditAlarmW", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toLong(), genericmapping, objectcreation.toLong(), grantedaccess, accessstatus, pfgenerateonclose)).toInt()
}

public fun AccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: Foundation.HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByType", longArrayOf(psecuritydescriptor, principalselfsid, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus)).toInt()
}

public fun AccessCheckByTypeAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeAndAuditAlarmA", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, objectcreation.toLong(), grantedaccess, accessstatus, pfgenerateonclose)).toInt()
}

public fun AccessCheckByTypeAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeAndAuditAlarmW", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, objectcreation.toLong(), grantedaccess, accessstatus, pfgenerateonclose)).toInt()
}

public fun AccessCheckByTypeResultList(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: Foundation.HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeResultList", longArrayOf(psecuritydescriptor, principalselfsid, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, privilegeset, privilegesetlength, grantedaccesslist, accessstatuslist)).toInt()
}

public fun AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeResultListAndAuditAlarmA", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, objectcreation.toLong(), grantedaccess, accessstatuslist, pfgenerateonclose)).toInt()
}

public fun AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: PCSTR, handleid: Long, clienttoken: Foundation.HANDLE, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeResultListAndAuditAlarmByHandleA", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, objectcreation.toLong(), grantedaccess, accessstatuslist, pfgenerateonclose)).toInt()
}

public fun AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: PCWSTR, handleid: Long, clienttoken: Foundation.HANDLE, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeResultListAndAuditAlarmByHandleW", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, objectcreation.toLong(), grantedaccesslist, accessstatuslist, pfgenerateonclose)).toInt()
}

public fun AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AccessCheckByTypeResultListAndAuditAlarmW", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, objectcreation.toLong(), grantedaccesslist, accessstatuslist, pfgenerateonclose)).toInt()
}

public fun AddAccessAllowedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAccessAllowedAce", longArrayOf(pacl, dwacerevision.toLong(), accessmask.toLong(), psid)).toInt()
}

public fun AddAccessAllowedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAccessAllowedAceEx", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), psid)).toInt()
}

public fun AddAccessAllowedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAccessAllowedObjectAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), objecttypeguid, inheritedobjecttypeguid, psid)).toInt()
}

public fun AddAccessDeniedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAccessDeniedAce", longArrayOf(pacl, dwacerevision.toLong(), accessmask.toLong(), psid)).toInt()
}

public fun AddAccessDeniedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAccessDeniedAceEx", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), psid)).toInt()
}

public fun AddAccessDeniedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAccessDeniedObjectAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), objecttypeguid, inheritedobjecttypeguid, psid)).toInt()
}

public fun AddAce(pacl: Long, dwacerevision: ACE_REVISION, dwstartingaceindex: UInt, pacelist: Long, nacelistlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAce", longArrayOf(pacl, dwacerevision.toLong(), dwstartingaceindex.toLong(), pacelist, nacelistlength.toLong())).toInt()
}

public fun AddAuditAccessAce(pacl: Long, dwacerevision: ACE_REVISION, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAuditAccessAce", longArrayOf(pacl, dwacerevision.toLong(), dwaccessmask.toLong(), psid, bauditsuccess.toLong(), bauditfailure.toLong())).toInt()
}

public fun AddAuditAccessAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAuditAccessAceEx", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), dwaccessmask.toLong(), psid, bauditsuccess.toLong(), bauditfailure.toLong())).toInt()
}

public fun AddAuditAccessObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddAuditAccessObjectAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), objecttypeguid, inheritedobjecttypeguid, psid, bauditsuccess.toLong(), bauditfailure.toLong())).toInt()
}

public fun AddConditionalAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, acetype: UByte, accessmask: UInt, psid: PSID, conditionstr: PCWSTR, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddConditionalAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), acetype.toLong(), accessmask.toLong(), psid, conditionstr, returnlength)).toInt()
}

public fun AddMandatoryAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, mandatorypolicy: UInt, plabelsid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddMandatoryAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), mandatorypolicy.toLong(), plabelsid)).toInt()
}

public fun AddResourceAttributeAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID, pattributeinfo: Long, preturnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddResourceAttributeAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), psid, pattributeinfo, preturnlength)).toInt()
}

public fun AddScopedPolicyIDAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddScopedPolicyIDAce", longArrayOf(pacl, dwacerevision.toLong(), aceflags.toLong(), accessmask.toLong(), psid)).toInt()
}

public fun AdjustTokenGroups(tokenhandle: Foundation.HANDLE, resettodefault: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AdjustTokenGroups", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), resettodefault.toLong(), newstate, bufferlength.toLong(), previousstate, returnlength)).toInt()
}

public fun AdjustTokenPrivileges(tokenhandle: Foundation.HANDLE, disableallprivileges: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AdjustTokenPrivileges", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), disableallprivileges.toLong(), newstate, bufferlength.toLong(), previousstate, returnlength)).toInt()
}

public fun AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AllocateAndInitializeSid", longArrayOf(pidentifierauthority, nsubauthoritycount.toLong(), nsubauthority0.toLong(), nsubauthority1.toLong(), nsubauthority2.toLong(), nsubauthority3.toLong(), nsubauthority4.toLong(), nsubauthority5.toLong(), nsubauthority6.toLong(), nsubauthority7.toLong(), psid)).toInt()
}

public fun AllocateLocallyUniqueId(luid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AllocateLocallyUniqueId", longArrayOf(luid)).toInt()
}

public fun AreAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AreAllAccessesGranted", longArrayOf(grantedaccess.toLong(), desiredaccess.toLong())).toInt()
}

public fun AreAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AreAnyAccessesGranted", longArrayOf(grantedaccess.toLong(), desiredaccess.toLong())).toInt()
}

public fun CheckTokenCapability(tokenhandle: Foundation.HANDLE, capabilitysidtocheck: PSID, hascapability: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckTokenCapability", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), capabilitysidtocheck, hascapability)).toInt()
}

public fun CheckTokenMembership(tokenhandle: Foundation.HANDLE, sidtocheck: PSID, ismember: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CheckTokenMembership", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), sidtocheck, ismember)).toInt()
}

public fun CheckTokenMembershipEx(tokenhandle: Foundation.HANDLE, sidtocheck: PSID, flags: UInt, ismember: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckTokenMembershipEx", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), sidtocheck, flags.toLong(), ismember)).toInt()
}

public fun ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, currentsecuritydescriptor: PSECURITY_DESCRIPTOR, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ConvertToAutoInheritPrivateObjectSecurity", longArrayOf(parentdescriptor, currentsecuritydescriptor, newsecuritydescriptor, objecttype, if (isdirectoryobject) 1L else 0L, genericmapping)).toInt()
}

public fun CopySid(ndestinationsidlength: UInt, pdestinationsid: PSID, psourcesid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CopySid", longArrayOf(ndestinationsidlength.toLong(), pdestinationsid, psourcesid)).toInt()
}

public fun CreatePrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: BOOL, token: Foundation.HANDLE, genericmapping: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreatePrivateObjectSecurity", longArrayOf(parentdescriptor, creatordescriptor, newdescriptor, isdirectoryobject.toLong(), Win32DynamicFfi.objectSlot(token), genericmapping)).toInt()
}

public fun CreatePrivateObjectSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: Foundation.HANDLE, genericmapping: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreatePrivateObjectSecurityEx", longArrayOf(parentdescriptor, creatordescriptor, newdescriptor, objecttype, iscontainerobject.toLong(), autoinheritflags.toLong(), Win32DynamicFfi.objectSlot(token), genericmapping)).toInt()
}

public fun CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttypes: Long, guidcount: UInt, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: Foundation.HANDLE, genericmapping: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreatePrivateObjectSecurityWithMultipleInheritance", longArrayOf(parentdescriptor, creatordescriptor, newdescriptor, objecttypes, guidcount.toLong(), iscontainerobject.toLong(), autoinheritflags.toLong(), Win32DynamicFfi.objectSlot(token), genericmapping)).toInt()
}

public fun CreateRestrictedToken(existingtokenhandle: Foundation.HANDLE, flags: CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount: UInt, sidstodisable: Long, deleteprivilegecount: UInt, privilegestodelete: Long, restrictedsidcount: UInt, sidstorestrict: Long, newtokenhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateRestrictedToken", longArrayOf(Win32DynamicFfi.objectSlot(existingtokenhandle), flags.toLong(), disablesidcount.toLong(), sidstodisable, deleteprivilegecount.toLong(), privilegestodelete, restrictedsidcount.toLong(), sidstorestrict, newtokenhandle)).toInt()
}

public fun CreateWellKnownSid(wellknownsidtype: WELL_KNOWN_SID_TYPE, domainsid: PSID, psid: PSID, cbsid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateWellKnownSid", longArrayOf(wellknownsidtype.toLong(), domainsid, psid, cbsid)).toInt()
}

public fun DeleteAce(pacl: Long, dwaceindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DeleteAce", longArrayOf(pacl, dwaceindex.toLong())).toInt()
}

public fun DeriveCapabilitySidsFromName(capname: PCWSTR, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-security-base-l1-2-2.dll", "DeriveCapabilitySidsFromName", longArrayOf(capname, capabilitygroupsids, capabilitygroupsidcount, capabilitysids, capabilitysidcount)).toInt()
}

public fun DestroyPrivateObjectSecurity(objectdescriptor: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DestroyPrivateObjectSecurity", longArrayOf(objectdescriptor)).toInt()
}

public fun DuplicateToken(existingtokenhandle: Foundation.HANDLE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DuplicateToken", longArrayOf(Win32DynamicFfi.objectSlot(existingtokenhandle), impersonationlevel.toLong(), duplicatetokenhandle)).toInt()
}

public fun DuplicateTokenEx(hexistingtoken: Foundation.HANDLE, dwdesiredaccess: TOKEN_ACCESS_MASK, lptokenattributes: Long, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokentype: TOKEN_TYPE, phnewtoken: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DuplicateTokenEx", longArrayOf(Win32DynamicFfi.objectSlot(hexistingtoken), dwdesiredaccess.toLong(), lptokenattributes, impersonationlevel.toLong(), tokentype.toLong(), phnewtoken)).toInt()
}

public fun EqualDomainSid(psid1: PSID, psid2: PSID, pfequal: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EqualDomainSid", longArrayOf(psid1, psid2, pfequal)).toInt()
}

public fun EqualPrefixSid(psid1: PSID, psid2: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EqualPrefixSid", longArrayOf(psid1, psid2)).toInt()
}

public fun EqualSid(psid1: PSID, psid2: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EqualSid", longArrayOf(psid1, psid2)).toInt()
}

public fun FindFirstFreeAce(pacl: Long, pace: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "FindFirstFreeAce", longArrayOf(pacl, pace)).toInt()
}

public fun FreeSid(psid: PSID): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "FreeSid", longArrayOf(psid))
}

public fun GetAce(pacl: Long, dwaceindex: UInt, pace: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetAce", longArrayOf(pacl, dwaceindex.toLong(), pace)).toInt()
}

public fun GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetAclInformation", longArrayOf(pacl, paclinformation, naclinformationlength.toLong(), dwaclinformationclass.toLong())).toInt()
}

public fun GetAppContainerAce(acl: Long, startingaceindex: UInt, appcontainerace: Long, appcontaineraceindex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetAppContainerAce", longArrayOf(acl, startingaceindex.toLong(), appcontainerace, appcontaineraceindex)).toInt()
}

public fun GetCachedSigningLevel(file: Foundation.HANDLE, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCachedSigningLevel", longArrayOf(Win32DynamicFfi.objectSlot(file), flags, signinglevel, thumbprint, thumbprintsize, thumbprintalgorithm)).toInt()
}

public fun GetFileSecurityA(lpfilename: PCSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetFileSecurityA", longArrayOf(lpfilename, requestedinformation.toLong(), psecuritydescriptor, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun GetFileSecurityW(lpfilename: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetFileSecurityW", longArrayOf(lpfilename, requestedinformation.toLong(), psecuritydescriptor, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun GetKernelObjectSecurity(handle: Foundation.HANDLE, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetKernelObjectSecurity", longArrayOf(Win32DynamicFfi.objectSlot(handle), requestedinformation.toLong(), psecuritydescriptor, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun GetLengthSid(psid: PSID): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetLengthSid", longArrayOf(psid)).toUInt()
}

public fun GetPrivateObjectSecurity(objectdescriptor: PSECURITY_DESCRIPTOR, securityinformation: OBJECT_SECURITY_INFORMATION, resultantdescriptor: PSECURITY_DESCRIPTOR, descriptorlength: UInt, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetPrivateObjectSecurity", longArrayOf(objectdescriptor, securityinformation.toLong(), resultantdescriptor, descriptorlength.toLong(), returnlength)).toInt()
}

public fun GetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, pcontrol: Long, lpdwrevision: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorControl", longArrayOf(psecuritydescriptor, pcontrol, lpdwrevision)).toInt()
}

public fun GetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorDacl", longArrayOf(psecuritydescriptor, lpbdaclpresent, pdacl, lpbdacldefaulted)).toInt()
}

public fun GetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: Long, lpbgroupdefaulted: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorGroup", longArrayOf(psecuritydescriptor, pgroup, lpbgroupdefaulted)).toInt()
}

public fun GetSecurityDescriptorLength(psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorLength", longArrayOf(psecuritydescriptor)).toUInt()
}

public fun GetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: Long, lpbownerdefaulted: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorOwner", longArrayOf(psecuritydescriptor, powner, lpbownerdefaulted)).toInt()
}

public fun GetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorRMControl", longArrayOf(securitydescriptor, rmcontrol)).toUInt()
}

public fun GetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSecurityDescriptorSacl", longArrayOf(psecuritydescriptor, lpbsaclpresent, psacl, lpbsacldefaulted)).toInt()
}

public fun GetSidIdentifierAuthority(psid: PSID): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSidIdentifierAuthority", longArrayOf(psid))
}

public fun GetSidLengthRequired(nsubauthoritycount: UByte): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSidLengthRequired", longArrayOf(nsubauthoritycount.toLong())).toUInt()
}

public fun GetSidSubAuthority(psid: PSID, nsubauthority: UInt): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSidSubAuthority", longArrayOf(psid, nsubauthority.toLong()))
}

public fun GetSidSubAuthorityCount(psid: PSID): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetSidSubAuthorityCount", longArrayOf(psid))
}

public fun GetTokenInformation(tokenhandle: Foundation.HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTokenInformation", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), tokeninformationclass.toLong(), tokeninformation, tokeninformationlength.toLong(), returnlength)).toInt()
}

public fun GetUserObjectSecurity(hobj: Foundation.HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetUserObjectSecurity", longArrayOf(Win32DynamicFfi.objectSlot(hobj), psirequested, psid, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun GetWindowsAccountDomainSid(psid: PSID, pdomainsid: PSID, cbdomainsid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetWindowsAccountDomainSid", longArrayOf(psid, pdomainsid, cbdomainsid)).toInt()
}

public fun ImpersonateAnonymousToken(threadhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ImpersonateAnonymousToken", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle))).toInt()
}

public fun ImpersonateLoggedOnUser(htoken: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ImpersonateLoggedOnUser", longArrayOf(Win32DynamicFfi.objectSlot(htoken))).toInt()
}

public fun ImpersonateSelf(impersonationlevel: SECURITY_IMPERSONATION_LEVEL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ImpersonateSelf", longArrayOf(impersonationlevel.toLong())).toInt()
}

public fun InitializeAcl(pacl: Long, nacllength: UInt, dwaclrevision: ACE_REVISION): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitializeAcl", longArrayOf(pacl, nacllength.toLong(), dwaclrevision.toLong())).toInt()
}

public fun InitializeSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, dwrevision: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitializeSecurityDescriptor", longArrayOf(psecuritydescriptor, dwrevision.toLong())).toInt()
}

public fun InitializeSid(sid: PSID, pidentifierauthority: Long, nsubauthoritycount: UByte): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitializeSid", longArrayOf(sid, pidentifierauthority, nsubauthoritycount.toLong())).toInt()
}

public fun IsTokenRestricted(tokenhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsTokenRestricted", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle))).toInt()
}

public fun IsValidAcl(pacl: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsValidAcl", longArrayOf(pacl)).toInt()
}

public fun IsValidSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsValidSecurityDescriptor", longArrayOf(psecuritydescriptor)).toInt()
}

public fun IsValidSid(psid: PSID): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsValidSid", longArrayOf(psid)).toInt()
}

public fun IsWellKnownSid(psid: PSID, wellknownsidtype: WELL_KNOWN_SID_TYPE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsWellKnownSid", longArrayOf(psid, wellknownsidtype.toLong())).toInt()
}

public fun LogonUserA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LogonUserA", longArrayOf(lpszusername, lpszdomain, lpszpassword, dwlogontype.toLong(), dwlogonprovider.toLong(), phtoken)).toInt()
}

public fun LogonUserExA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LogonUserExA", longArrayOf(lpszusername, lpszdomain, lpszpassword, dwlogontype.toLong(), dwlogonprovider.toLong(), phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits)).toInt()
}

public fun LogonUserExW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LogonUserExW", longArrayOf(lpszusername, lpszdomain, lpszpassword, dwlogontype.toLong(), dwlogonprovider.toLong(), phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits)).toInt()
}

public fun LogonUserW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LogonUserW", longArrayOf(lpszusername, lpszdomain, lpszpassword, dwlogontype.toLong(), dwlogonprovider.toLong(), phtoken)).toInt()
}

public fun LookupAccountNameA(lpsystemname: PCSTR, lpaccountname: PCSTR, sid: PSID, cbsid: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupAccountNameA", longArrayOf(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse)).toInt()
}

public fun LookupAccountNameW(lpsystemname: PCWSTR, lpaccountname: PCWSTR, sid: PSID, cbsid: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupAccountNameW", longArrayOf(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse)).toInt()
}

public fun LookupAccountSidA(lpsystemname: PCSTR, sid: PSID, name: PSTR, cchname: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupAccountSidA", longArrayOf(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse)).toInt()
}

public fun LookupAccountSidW(lpsystemname: PCWSTR, sid: PSID, name: PWSTR, cchname: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupAccountSidW", longArrayOf(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse)).toInt()
}

public fun LookupPrivilegeDisplayNameA(lpsystemname: PCSTR, lpname: PCSTR, lpdisplayname: PSTR, cchdisplayname: Long, lplanguageid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupPrivilegeDisplayNameA", longArrayOf(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid)).toInt()
}

public fun LookupPrivilegeDisplayNameW(lpsystemname: PCWSTR, lpname: PCWSTR, lpdisplayname: PWSTR, cchdisplayname: Long, lplanguageid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupPrivilegeDisplayNameW", longArrayOf(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid)).toInt()
}

public fun LookupPrivilegeNameA(lpsystemname: PCSTR, lpluid: Long, lpname: PSTR, cchname: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupPrivilegeNameA", longArrayOf(lpsystemname, lpluid, lpname, cchname)).toInt()
}

public fun LookupPrivilegeNameW(lpsystemname: PCWSTR, lpluid: Long, lpname: PWSTR, cchname: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupPrivilegeNameW", longArrayOf(lpsystemname, lpluid, lpname, cchname)).toInt()
}

public fun LookupPrivilegeValueA(lpsystemname: PCSTR, lpname: PCSTR, lpluid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupPrivilegeValueA", longArrayOf(lpsystemname, lpname, lpluid)).toInt()
}

public fun LookupPrivilegeValueW(lpsystemname: PCWSTR, lpname: PCWSTR, lpluid: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "LookupPrivilegeValueW", longArrayOf(lpsystemname, lpname, lpluid)).toInt()
}

public fun MakeAbsoluteSD(pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: PSID, lpdwownersize: Long, pprimarygroup: PSID, lpdwprimarygroupsize: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "MakeAbsoluteSD", longArrayOf(pselfrelativesecuritydescriptor, pabsolutesecuritydescriptor, lpdwabsolutesecuritydescriptorsize, pdacl, lpdwdaclsize, psacl, lpdwsaclsize, powner, lpdwownersize, pprimarygroup, lpdwprimarygroupsize)).toInt()
}

public fun MakeSelfRelativeSD(pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "MakeSelfRelativeSD", longArrayOf(pabsolutesecuritydescriptor, pselfrelativesecuritydescriptor, lpdwbufferlength)).toInt()
}

public fun MapGenericMask(accessmask: Long, genericmapping: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "MapGenericMask", longArrayOf(accessmask, genericmapping))
}

public fun ObjectCloseAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectCloseAuditAlarmA", longArrayOf(subsystemname, handleid, generateonclose.toLong())).toInt()
}

public fun ObjectCloseAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectCloseAuditAlarmW", longArrayOf(subsystemname, handleid, generateonclose.toLong())).toInt()
}

public fun ObjectDeleteAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectDeleteAuditAlarmA", longArrayOf(subsystemname, handleid, generateonclose.toLong())).toInt()
}

public fun ObjectDeleteAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectDeleteAuditAlarmW", longArrayOf(subsystemname, handleid, generateonclose.toLong())).toInt()
}

public fun ObjectOpenAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: Foundation.HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectOpenAuditAlarmA", longArrayOf(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), grantedaccess.toLong(), privileges, objectcreation.toLong(), accessgranted.toLong(), generateonclose)).toInt()
}

public fun ObjectOpenAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: Foundation.HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectOpenAuditAlarmW", longArrayOf(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), grantedaccess.toLong(), privileges, objectcreation.toLong(), accessgranted.toLong(), generateonclose)).toInt()
}

public fun ObjectPrivilegeAuditAlarmA(subsystemname: PCSTR, handleid: Long, clienttoken: Foundation.HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectPrivilegeAuditAlarmA", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), privileges, accessgranted.toLong())).toInt()
}

public fun ObjectPrivilegeAuditAlarmW(subsystemname: PCWSTR, handleid: Long, clienttoken: Foundation.HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ObjectPrivilegeAuditAlarmW", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), privileges, accessgranted.toLong())).toInt()
}

public fun PrivilegeCheck(clienttoken: Foundation.HANDLE, requiredprivileges: Long, pfresult: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "PrivilegeCheck", longArrayOf(Win32DynamicFfi.objectSlot(clienttoken), requiredprivileges, pfresult)).toInt()
}

public fun PrivilegedServiceAuditAlarmA(subsystemname: PCSTR, servicename: PCSTR, clienttoken: Foundation.HANDLE, privileges: Long, accessgranted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "PrivilegedServiceAuditAlarmA", longArrayOf(subsystemname, servicename, Win32DynamicFfi.objectSlot(clienttoken), privileges, accessgranted.toLong())).toInt()
}

public fun PrivilegedServiceAuditAlarmW(subsystemname: PCWSTR, servicename: PCWSTR, clienttoken: Foundation.HANDLE, privileges: Long, accessgranted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "PrivilegedServiceAuditAlarmW", longArrayOf(subsystemname, servicename, Win32DynamicFfi.objectSlot(clienttoken), privileges, accessgranted.toLong())).toInt()
}

public fun QuerySecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "QuerySecurityAccessMask", longArrayOf(securityinformation.toLong(), desiredaccess))
}

public fun RevertToSelf(): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "RevertToSelf", longArrayOf()).toInt()
}

public fun RtlConvertSidToUnicodeString(unicodestring: Long, sid: PSID, allocatedestinationstring: Boolean): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlConvertSidToUnicodeString", longArrayOf(unicodestring, sid, if (allocatedestinationstring) 1L else 0L))
    return Foundation.NTSTATUS()
}

public fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlNormalizeSecurityDescriptor", longArrayOf(securitydescriptor, securitydescriptorlength.toLong(), newsecuritydescriptor, newsecuritydescriptorlength, if (checkonly) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetAclInformation", longArrayOf(pacl, paclinformation, naclinformationlength.toLong(), dwaclinformationclass.toLong())).toInt()
}

public fun SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: UInt, flags: UInt, targetfile: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCachedSigningLevel", longArrayOf(sourcefiles, sourcefilecount.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(targetfile))).toInt()
}

public fun SetFileSecurityA(lpfilename: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetFileSecurityA", longArrayOf(lpfilename, securityinformation.toLong(), psecuritydescriptor)).toInt()
}

public fun SetFileSecurityW(lpfilename: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetFileSecurityW", longArrayOf(lpfilename, securityinformation.toLong(), psecuritydescriptor)).toInt()
}

public fun SetKernelObjectSecurity(handle: Foundation.HANDLE, securityinformation: OBJECT_SECURITY_INFORMATION, securitydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetKernelObjectSecurity", longArrayOf(Win32DynamicFfi.objectSlot(handle), securityinformation.toLong(), securitydescriptor)).toInt()
}

public fun SetPrivateObjectSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, genericmapping: Long, token: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetPrivateObjectSecurity", longArrayOf(securityinformation.toLong(), modificationdescriptor, objectssecuritydescriptor, genericmapping, Win32DynamicFfi.objectSlot(token))).toInt()
}

public fun SetPrivateObjectSecurityEx(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, genericmapping: Long, token: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetPrivateObjectSecurityEx", longArrayOf(securityinformation.toLong(), modificationdescriptor, objectssecuritydescriptor, autoinheritflags.toLong(), genericmapping, Win32DynamicFfi.objectSlot(token))).toInt()
}

public fun SetSecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityAccessMask", longArrayOf(securityinformation.toLong(), desiredaccess))
}

public fun SetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, controlbitsofinterest: SECURITY_DESCRIPTOR_CONTROL, controlbitstoset: SECURITY_DESCRIPTOR_CONTROL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityDescriptorControl", longArrayOf(psecuritydescriptor, controlbitsofinterest.toLong(), controlbitstoset.toLong())).toInt()
}

public fun SetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bdaclpresent: BOOL, pdacl: Long, bdacldefaulted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityDescriptorDacl", longArrayOf(psecuritydescriptor, bdaclpresent.toLong(), pdacl, bdacldefaulted.toLong())).toInt()
}

public fun SetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: PSID, bgroupdefaulted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityDescriptorGroup", longArrayOf(psecuritydescriptor, pgroup, bgroupdefaulted.toLong())).toInt()
}

public fun SetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: PSID, bownerdefaulted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityDescriptorOwner", longArrayOf(psecuritydescriptor, powner, bownerdefaulted.toLong())).toInt()
}

public fun SetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityDescriptorRMControl", longArrayOf(securitydescriptor, rmcontrol)).toUInt()
}

public fun SetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bsaclpresent: BOOL, psacl: Long, bsacldefaulted: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetSecurityDescriptorSacl", longArrayOf(psecuritydescriptor, bsaclpresent.toLong(), psacl, bsacldefaulted.toLong())).toInt()
}

public fun SetTokenInformation(tokenhandle: Foundation.HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetTokenInformation", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), tokeninformationclass.toLong(), tokeninformation, tokeninformationlength.toLong())).toInt()
}

public fun SetUserObjectSecurity(hobj: Foundation.HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetUserObjectSecurity", longArrayOf(Win32DynamicFfi.objectSlot(hobj), psirequested, psid)).toInt()
}
