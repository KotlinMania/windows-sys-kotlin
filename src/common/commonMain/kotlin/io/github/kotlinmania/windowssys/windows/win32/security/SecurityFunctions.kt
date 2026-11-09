package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun AccessCheck(psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL

public expect fun AccessCheckAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL

public expect fun AccessCheckByTypeAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckByTypeAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckByTypeResultList(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): BOOL

public expect fun AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL

public expect fun AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL

public expect fun AddAccessAllowedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL

public expect fun AddAccessAllowedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL

public expect fun AddAccessAllowedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL

public expect fun AddAccessDeniedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL

public expect fun AddAccessDeniedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL

public expect fun AddAccessDeniedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL

public expect fun AddAce(pacl: Long, dwacerevision: ACE_REVISION, dwstartingaceindex: UInt, pacelist: Long, nacelistlength: UInt): BOOL

public expect fun AddAuditAccessAce(pacl: Long, dwacerevision: ACE_REVISION, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL

public expect fun AddAuditAccessAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL

public expect fun AddAuditAccessObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL

public expect fun AddConditionalAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, acetype: UByte, accessmask: UInt, psid: PSID, conditionstr: PCWSTR, returnlength: Long): BOOL

public expect fun AddMandatoryAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, mandatorypolicy: UInt, plabelsid: PSID): BOOL

public expect fun AddResourceAttributeAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID, pattributeinfo: Long, preturnlength: Long): BOOL

public expect fun AddScopedPolicyIDAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL

public expect fun AdjustTokenGroups(tokenhandle: HANDLE, resettodefault: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL

public expect fun AdjustTokenPrivileges(tokenhandle: HANDLE, disableallprivileges: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL

public expect fun AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: Long): BOOL

public expect fun AllocateLocallyUniqueId(luid: Long): BOOL

public expect fun AreAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL

public expect fun AreAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL

public expect fun CheckTokenCapability(tokenhandle: HANDLE, capabilitysidtocheck: PSID, hascapability: Long): BOOL

public expect fun CheckTokenMembership(tokenhandle: HANDLE, sidtocheck: PSID, ismember: Long): BOOL

public expect fun CheckTokenMembershipEx(tokenhandle: HANDLE, sidtocheck: PSID, flags: UInt, ismember: Long): BOOL

public expect fun ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, currentsecuritydescriptor: PSECURITY_DESCRIPTOR, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): BOOL

public expect fun CopySid(ndestinationsidlength: UInt, pdestinationsid: PSID, psourcesid: PSID): BOOL

public expect fun CreatePrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: BOOL, token: HANDLE, genericmapping: Long): BOOL

public expect fun CreatePrivateObjectSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL

public expect fun CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttypes: Long, guidcount: UInt, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL

public expect fun CreateRestrictedToken(existingtokenhandle: HANDLE, flags: CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount: UInt, sidstodisable: Long, deleteprivilegecount: UInt, privilegestodelete: Long, restrictedsidcount: UInt, sidstorestrict: Long, newtokenhandle: Long): BOOL

public expect fun CreateWellKnownSid(wellknownsidtype: WELL_KNOWN_SID_TYPE, domainsid: PSID, psid: PSID, cbsid: Long): BOOL

public expect fun DeleteAce(pacl: Long, dwaceindex: UInt): BOOL

public expect fun DeriveCapabilitySidsFromName(capname: PCWSTR, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): BOOL

public expect fun DestroyPrivateObjectSecurity(objectdescriptor: Long): BOOL

public expect fun DuplicateToken(existingtokenhandle: HANDLE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle: Long): BOOL

public expect fun DuplicateTokenEx(hexistingtoken: HANDLE, dwdesiredaccess: TOKEN_ACCESS_MASK, lptokenattributes: Long, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokentype: TOKEN_TYPE, phnewtoken: Long): BOOL

public expect fun EqualDomainSid(psid1: PSID, psid2: PSID, pfequal: Long): BOOL

public expect fun EqualPrefixSid(psid1: PSID, psid2: PSID): BOOL

public expect fun EqualSid(psid1: PSID, psid2: PSID): BOOL

public expect fun FindFirstFreeAce(pacl: Long, pace: Long): BOOL

public expect fun FreeSid(psid: PSID): Long

public expect fun GetAce(pacl: Long, dwaceindex: UInt, pace: Long): BOOL

public expect fun GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL

public expect fun GetAppContainerAce(acl: Long, startingaceindex: UInt, appcontainerace: Long, appcontaineraceindex: Long): BOOL

public expect fun GetCachedSigningLevel(file: HANDLE, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): BOOL

public expect fun GetFileSecurityA(lpfilename: PCSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun GetFileSecurityW(lpfilename: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun GetKernelObjectSecurity(handle: HANDLE, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun GetLengthSid(psid: PSID): UInt

public expect fun GetPrivateObjectSecurity(objectdescriptor: PSECURITY_DESCRIPTOR, securityinformation: OBJECT_SECURITY_INFORMATION, resultantdescriptor: PSECURITY_DESCRIPTOR, descriptorlength: UInt, returnlength: Long): BOOL

public expect fun GetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, pcontrol: Long, lpdwrevision: Long): BOOL

public expect fun GetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): BOOL

public expect fun GetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: Long, lpbgroupdefaulted: Long): BOOL

public expect fun GetSecurityDescriptorLength(psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt

public expect fun GetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: Long, lpbownerdefaulted: Long): BOOL

public expect fun GetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt

public expect fun GetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): BOOL

public expect fun GetSidIdentifierAuthority(psid: PSID): Long

public expect fun GetSidLengthRequired(nsubauthoritycount: UByte): UInt

public expect fun GetSidSubAuthority(psid: PSID, nsubauthority: UInt): Long

public expect fun GetSidSubAuthorityCount(psid: PSID): Long

public expect fun GetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): BOOL

public expect fun GetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun GetWindowsAccountDomainSid(psid: PSID, pdomainsid: PSID, cbdomainsid: Long): BOOL

public expect fun ImpersonateAnonymousToken(threadhandle: HANDLE): BOOL

public expect fun ImpersonateLoggedOnUser(htoken: HANDLE): BOOL

public expect fun ImpersonateSelf(impersonationlevel: SECURITY_IMPERSONATION_LEVEL): BOOL

public expect fun InitializeAcl(pacl: Long, nacllength: UInt, dwaclrevision: ACE_REVISION): BOOL

public expect fun InitializeSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, dwrevision: UInt): BOOL

public expect fun InitializeSid(sid: PSID, pidentifierauthority: Long, nsubauthoritycount: UByte): BOOL

public expect fun IsTokenRestricted(tokenhandle: HANDLE): BOOL

public expect fun IsValidAcl(pacl: Long): BOOL

public expect fun IsValidSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL

public expect fun IsValidSid(psid: PSID): BOOL

public expect fun IsWellKnownSid(psid: PSID, wellknownsidtype: WELL_KNOWN_SID_TYPE): BOOL

public expect fun LogonUserA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL

public expect fun LogonUserExA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL

public expect fun LogonUserExW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL

public expect fun LogonUserW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL

public expect fun LookupAccountNameA(lpsystemname: PCSTR, lpaccountname: PCSTR, sid: PSID, cbsid: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL

public expect fun LookupAccountNameW(lpsystemname: PCWSTR, lpaccountname: PCWSTR, sid: PSID, cbsid: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL

public expect fun LookupAccountSidA(lpsystemname: PCSTR, sid: PSID, name: PSTR, cchname: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL

public expect fun LookupAccountSidW(lpsystemname: PCWSTR, sid: PSID, name: PWSTR, cchname: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL

public expect fun LookupPrivilegeDisplayNameA(lpsystemname: PCSTR, lpname: PCSTR, lpdisplayname: PSTR, cchdisplayname: Long, lplanguageid: Long): BOOL

public expect fun LookupPrivilegeDisplayNameW(lpsystemname: PCWSTR, lpname: PCWSTR, lpdisplayname: PWSTR, cchdisplayname: Long, lplanguageid: Long): BOOL

public expect fun LookupPrivilegeNameA(lpsystemname: PCSTR, lpluid: Long, lpname: PSTR, cchname: Long): BOOL

public expect fun LookupPrivilegeNameW(lpsystemname: PCWSTR, lpluid: Long, lpname: PWSTR, cchname: Long): BOOL

public expect fun LookupPrivilegeValueA(lpsystemname: PCSTR, lpname: PCSTR, lpluid: Long): BOOL

public expect fun LookupPrivilegeValueW(lpsystemname: PCWSTR, lpname: PCWSTR, lpluid: Long): BOOL

public expect fun MakeAbsoluteSD(pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: PSID, lpdwownersize: Long, pprimarygroup: PSID, lpdwprimarygroupsize: Long): BOOL

public expect fun MakeSelfRelativeSD(pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwbufferlength: Long): BOOL

public expect fun MapGenericMask(accessmask: Long, genericmapping: Long)

public expect fun ObjectCloseAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL

public expect fun ObjectCloseAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL

public expect fun ObjectDeleteAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL

public expect fun ObjectDeleteAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL

public expect fun ObjectOpenAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL

public expect fun ObjectOpenAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL

public expect fun ObjectPrivilegeAuditAlarmA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL

public expect fun ObjectPrivilegeAuditAlarmW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL

public expect fun PrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, pfresult: Long): BOOL

public expect fun PrivilegedServiceAuditAlarmA(subsystemname: PCSTR, servicename: PCSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL

public expect fun PrivilegedServiceAuditAlarmW(subsystemname: PCWSTR, servicename: PCWSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL

public expect fun QuerySecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long)

public expect fun RevertToSelf(): BOOL

public expect fun RtlConvertSidToUnicodeString(unicodestring: Long, sid: PSID, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

public expect fun SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL

public expect fun SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: UInt, flags: UInt, targetfile: HANDLE): BOOL

public expect fun SetFileSecurityA(lpfilename: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL

public expect fun SetFileSecurityW(lpfilename: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL

public expect fun SetKernelObjectSecurity(handle: HANDLE, securityinformation: OBJECT_SECURITY_INFORMATION, securitydescriptor: PSECURITY_DESCRIPTOR): BOOL

public expect fun SetPrivateObjectSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, genericmapping: Long, token: HANDLE): BOOL

public expect fun SetPrivateObjectSecurityEx(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, genericmapping: Long, token: HANDLE): BOOL

public expect fun SetSecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long)

public expect fun SetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, controlbitsofinterest: SECURITY_DESCRIPTOR_CONTROL, controlbitstoset: SECURITY_DESCRIPTOR_CONTROL): BOOL

public expect fun SetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bdaclpresent: BOOL, pdacl: Long, bdacldefaulted: BOOL): BOOL

public expect fun SetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: PSID, bgroupdefaulted: BOOL): BOOL

public expect fun SetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: PSID, bownerdefaulted: BOOL): BOOL

public expect fun SetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt

public expect fun SetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bsaclpresent: BOOL, psacl: Long, bsacldefaulted: BOOL): BOOL

public expect fun SetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): BOOL

public expect fun SetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR): BOOL
