@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun AccessCheck(psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    0

public actual fun AccessCheckAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    0

public actual fun AccessCheckByTypeAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckByTypeAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckByTypeResultList(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): BOOL =
    0

public actual fun AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    0

public actual fun AddAccessAllowedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    0

public actual fun AddAccessAllowedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    0

public actual fun AddAccessAllowedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    0

public actual fun AddAccessDeniedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    0

public actual fun AddAccessDeniedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    0

public actual fun AddAccessDeniedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    0

public actual fun AddAce(pacl: Long, dwacerevision: ACE_REVISION, dwstartingaceindex: UInt, pacelist: Long, nacelistlength: UInt): BOOL =
    0

public actual fun AddAuditAccessAce(pacl: Long, dwacerevision: ACE_REVISION, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    0

public actual fun AddAuditAccessAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    0

public actual fun AddAuditAccessObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    0

public actual fun AddConditionalAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, acetype: UByte, accessmask: UInt, psid: PSID, conditionstr: PCWSTR, returnlength: Long): BOOL =
    0

public actual fun AddMandatoryAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, mandatorypolicy: UInt, plabelsid: PSID): BOOL =
    0

public actual fun AddResourceAttributeAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID, pattributeinfo: Long, preturnlength: Long): BOOL =
    0

public actual fun AddScopedPolicyIDAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    0

public actual fun AdjustTokenGroups(tokenhandle: HANDLE, resettodefault: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    0

public actual fun AdjustTokenPrivileges(tokenhandle: HANDLE, disableallprivileges: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    0

public actual fun AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: Long): BOOL =
    0

public actual fun AllocateLocallyUniqueId(luid: Long): BOOL =
    0

public actual fun AreAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    0

public actual fun AreAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    0

public actual fun CheckTokenCapability(tokenhandle: HANDLE, capabilitysidtocheck: PSID, hascapability: Long): BOOL =
    0

public actual fun CheckTokenMembership(tokenhandle: HANDLE, sidtocheck: PSID, ismember: Long): BOOL =
    0

public actual fun CheckTokenMembershipEx(tokenhandle: HANDLE, sidtocheck: PSID, flags: UInt, ismember: Long): BOOL =
    0

public actual fun ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, currentsecuritydescriptor: PSECURITY_DESCRIPTOR, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): BOOL =
    0

public actual fun CopySid(ndestinationsidlength: UInt, pdestinationsid: PSID, psourcesid: PSID): BOOL =
    0

public actual fun CreatePrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: BOOL, token: HANDLE, genericmapping: Long): BOOL =
    0

public actual fun CreatePrivateObjectSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    0

public actual fun CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttypes: Long, guidcount: UInt, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    0

public actual fun CreateRestrictedToken(existingtokenhandle: HANDLE, flags: CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount: UInt, sidstodisable: Long, deleteprivilegecount: UInt, privilegestodelete: Long, restrictedsidcount: UInt, sidstorestrict: Long, newtokenhandle: Long): BOOL =
    0

public actual fun CreateWellKnownSid(wellknownsidtype: WELL_KNOWN_SID_TYPE, domainsid: PSID, psid: PSID, cbsid: Long): BOOL =
    0

public actual fun DeleteAce(pacl: Long, dwaceindex: UInt): BOOL =
    0

public actual fun DeriveCapabilitySidsFromName(capname: PCWSTR, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): BOOL =
    0

public actual fun DestroyPrivateObjectSecurity(objectdescriptor: Long): BOOL =
    0

public actual fun DuplicateToken(existingtokenhandle: HANDLE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle: Long): BOOL =
    0

public actual fun DuplicateTokenEx(hexistingtoken: HANDLE, dwdesiredaccess: TOKEN_ACCESS_MASK, lptokenattributes: Long, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokentype: TOKEN_TYPE, phnewtoken: Long): BOOL =
    0

public actual fun EqualDomainSid(psid1: PSID, psid2: PSID, pfequal: Long): BOOL =
    0

public actual fun EqualPrefixSid(psid1: PSID, psid2: PSID): BOOL =
    0

public actual fun EqualSid(psid1: PSID, psid2: PSID): BOOL =
    0

public actual fun FindFirstFreeAce(pacl: Long, pace: Long): BOOL =
    0

public actual fun FreeSid(psid: PSID): Long =
    0L

public actual fun GetAce(pacl: Long, dwaceindex: UInt, pace: Long): BOOL =
    0

public actual fun GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    0

public actual fun GetAppContainerAce(acl: Long, startingaceindex: UInt, appcontainerace: Long, appcontaineraceindex: Long): BOOL =
    0

public actual fun GetCachedSigningLevel(file: HANDLE, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): BOOL =
    0

public actual fun GetFileSecurityA(lpfilename: PCSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    0

public actual fun GetFileSecurityW(lpfilename: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    0

public actual fun GetKernelObjectSecurity(handle: HANDLE, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    0

public actual fun GetLengthSid(psid: PSID): UInt =
    0u

public actual fun GetPrivateObjectSecurity(objectdescriptor: PSECURITY_DESCRIPTOR, securityinformation: OBJECT_SECURITY_INFORMATION, resultantdescriptor: PSECURITY_DESCRIPTOR, descriptorlength: UInt, returnlength: Long): BOOL =
    0

public actual fun GetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, pcontrol: Long, lpdwrevision: Long): BOOL =
    0

public actual fun GetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): BOOL =
    0

public actual fun GetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: Long, lpbgroupdefaulted: Long): BOOL =
    0

public actual fun GetSecurityDescriptorLength(psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun GetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: Long, lpbownerdefaulted: Long): BOOL =
    0

public actual fun GetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    0u

public actual fun GetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): BOOL =
    0

public actual fun GetSidIdentifierAuthority(psid: PSID): Long =
    0L

public actual fun GetSidLengthRequired(nsubauthoritycount: UByte): UInt =
    0u

public actual fun GetSidSubAuthority(psid: PSID, nsubauthority: UInt): Long =
    0L

public actual fun GetSidSubAuthorityCount(psid: PSID): Long =
    0L

public actual fun GetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): BOOL =
    0

public actual fun GetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    0

public actual fun GetWindowsAccountDomainSid(psid: PSID, pdomainsid: PSID, cbdomainsid: Long): BOOL =
    0

public actual fun ImpersonateAnonymousToken(threadhandle: HANDLE): BOOL =
    0

public actual fun ImpersonateLoggedOnUser(htoken: HANDLE): BOOL =
    0

public actual fun ImpersonateSelf(impersonationlevel: SECURITY_IMPERSONATION_LEVEL): BOOL =
    0

public actual fun InitializeAcl(pacl: Long, nacllength: UInt, dwaclrevision: ACE_REVISION): BOOL =
    0

public actual fun InitializeSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, dwrevision: UInt): BOOL =
    0

public actual fun InitializeSid(sid: PSID, pidentifierauthority: Long, nsubauthoritycount: UByte): BOOL =
    0

public actual fun IsTokenRestricted(tokenhandle: HANDLE): BOOL =
    0

public actual fun IsValidAcl(pacl: Long): BOOL =
    0

public actual fun IsValidSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    0

public actual fun IsValidSid(psid: PSID): BOOL =
    0

public actual fun IsWellKnownSid(psid: PSID, wellknownsidtype: WELL_KNOWN_SID_TYPE): BOOL =
    0

public actual fun LogonUserA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    0

public actual fun LogonUserExA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    0

public actual fun LogonUserExW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    0

public actual fun LogonUserW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    0

public actual fun LookupAccountNameA(lpsystemname: PCSTR, lpaccountname: PCSTR, sid: PSID, cbsid: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    0

public actual fun LookupAccountNameW(lpsystemname: PCWSTR, lpaccountname: PCWSTR, sid: PSID, cbsid: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    0

public actual fun LookupAccountSidA(lpsystemname: PCSTR, sid: PSID, name: PSTR, cchname: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    0

public actual fun LookupAccountSidW(lpsystemname: PCWSTR, sid: PSID, name: PWSTR, cchname: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    0

public actual fun LookupPrivilegeDisplayNameA(lpsystemname: PCSTR, lpname: PCSTR, lpdisplayname: PSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    0

public actual fun LookupPrivilegeDisplayNameW(lpsystemname: PCWSTR, lpname: PCWSTR, lpdisplayname: PWSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    0

public actual fun LookupPrivilegeNameA(lpsystemname: PCSTR, lpluid: Long, lpname: PSTR, cchname: Long): BOOL =
    0

public actual fun LookupPrivilegeNameW(lpsystemname: PCWSTR, lpluid: Long, lpname: PWSTR, cchname: Long): BOOL =
    0

public actual fun LookupPrivilegeValueA(lpsystemname: PCSTR, lpname: PCSTR, lpluid: Long): BOOL =
    0

public actual fun LookupPrivilegeValueW(lpsystemname: PCWSTR, lpname: PCWSTR, lpluid: Long): BOOL =
    0

public actual fun MakeAbsoluteSD(pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: PSID, lpdwownersize: Long, pprimarygroup: PSID, lpdwprimarygroupsize: Long): BOOL =
    0

public actual fun MakeSelfRelativeSD(pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwbufferlength: Long): BOOL =
    0

public actual fun MapGenericMask(accessmask: Long, genericmapping: Long) {
}

public actual fun ObjectCloseAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    0

public actual fun ObjectCloseAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    0

public actual fun ObjectDeleteAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    0

public actual fun ObjectDeleteAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    0

public actual fun ObjectOpenAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    0

public actual fun ObjectOpenAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    0

public actual fun ObjectPrivilegeAuditAlarmA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    0

public actual fun ObjectPrivilegeAuditAlarmW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    0

public actual fun PrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, pfresult: Long): BOOL =
    0

public actual fun PrivilegedServiceAuditAlarmA(subsystemname: PCSTR, servicename: PCSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    0

public actual fun PrivilegedServiceAuditAlarmW(subsystemname: PCWSTR, servicename: PCWSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    0

public actual fun QuerySecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
}

public actual fun RevertToSelf(): BOOL =
    0

public actual fun RtlConvertSidToUnicodeString(unicodestring: Long, sid: PSID, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    false

public actual fun SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    0

public actual fun SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: UInt, flags: UInt, targetfile: HANDLE): BOOL =
    0

public actual fun SetFileSecurityA(lpfilename: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    0

public actual fun SetFileSecurityW(lpfilename: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    0

public actual fun SetKernelObjectSecurity(handle: HANDLE, securityinformation: OBJECT_SECURITY_INFORMATION, securitydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    0

public actual fun SetPrivateObjectSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, genericmapping: Long, token: HANDLE): BOOL =
    0

public actual fun SetPrivateObjectSecurityEx(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, genericmapping: Long, token: HANDLE): BOOL =
    0

public actual fun SetSecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
}

public actual fun SetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, controlbitsofinterest: SECURITY_DESCRIPTOR_CONTROL, controlbitstoset: SECURITY_DESCRIPTOR_CONTROL): BOOL =
    0

public actual fun SetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bdaclpresent: BOOL, pdacl: Long, bdacldefaulted: BOOL): BOOL =
    0

public actual fun SetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: PSID, bgroupdefaulted: BOOL): BOOL =
    0

public actual fun SetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: PSID, bownerdefaulted: BOOL): BOOL =
    0

public actual fun SetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    0u

public actual fun SetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bsaclpresent: BOOL, psacl: Long, bsacldefaulted: BOOL): BOOL =
    0

public actual fun SetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): BOOL =
    0

public actual fun SetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR): BOOL =
    0
