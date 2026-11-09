@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWin32SecurityJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheck(psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByType(psecuritydescriptor: Long, principalselfsid: Long, clienttoken: Long, desiredaccess: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeResultList(psecuritydescriptor: Long, principalselfsid: Long, clienttoken: Long, desiredaccess: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAccessAllowedAce(pacl: Long, dwacerevision: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAccessAllowedAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAccessAllowedObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAccessDeniedAce(pacl: Long, dwacerevision: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAccessDeniedAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAccessDeniedObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAce(pacl: Long, dwacerevision: Int, dwstartingaceindex: Int, pacelist: Long, nacelistlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAuditAccessAce(pacl: Long, dwacerevision: Int, dwaccessmask: Int, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAuditAccessAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, dwaccessmask: Int, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddAuditAccessObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddConditionalAce(pacl: Long, dwacerevision: Int, aceflags: Int, acetype: Byte, accessmask: Int, psid: Long, conditionstr: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddMandatoryAce(pacl: Long, dwacerevision: Int, aceflags: Int, mandatorypolicy: Int, plabelsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddResourceAttributeAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long, pattributeinfo: Long, preturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AddScopedPolicyIDAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AdjustTokenGroups(tokenhandle: Long, resettodefault: Int, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AdjustTokenPrivileges(tokenhandle: Long, disableallprivileges: Int, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: Byte, nsubauthority0: Int, nsubauthority1: Int, nsubauthority2: Int, nsubauthority3: Int, nsubauthority4: Int, nsubauthority5: Int, nsubauthority6: Int, nsubauthority7: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AreAllAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_AreAnyAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CheckTokenCapability(tokenhandle: Long, capabilitysidtocheck: Long, hascapability: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CheckTokenMembership(tokenhandle: Long, sidtocheck: Long, ismember: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CheckTokenMembershipEx(tokenhandle: Long, sidtocheck: Long, flags: Int, ismember: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: Long, currentsecuritydescriptor: Long, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CopySid(ndestinationsidlength: Int, pdestinationsid: Long, psourcesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CreatePrivateObjectSecurity(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, isdirectoryobject: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CreatePrivateObjectSecurityEx(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, objecttype: Long, iscontainerobject: Int, autoinheritflags: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, objecttypes: Long, guidcount: Int, iscontainerobject: Int, autoinheritflags: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CreateRestrictedToken(existingtokenhandle: Long, flags: Int, disablesidcount: Int, sidstodisable: Long, deleteprivilegecount: Int, privilegestodelete: Long, restrictedsidcount: Int, sidstorestrict: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_CreateWellKnownSid(wellknownsidtype: Int, domainsid: Long, psid: Long, cbsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_DeleteAce(pacl: Long, dwaceindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_DeriveCapabilitySidsFromName(capname: Long, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_DestroyPrivateObjectSecurity(objectdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_DuplicateToken(existingtokenhandle: Long, impersonationlevel: Int, duplicatetokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_DuplicateTokenEx(hexistingtoken: Long, dwdesiredaccess: Int, lptokenattributes: Long, impersonationlevel: Int, tokentype: Int, phnewtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_EqualDomainSid(psid1: Long, psid2: Long, pfequal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_EqualPrefixSid(psid1: Long, psid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_EqualSid(psid1: Long, psid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_FindFirstFreeAce(pacl: Long, pace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_FreeSid(psid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_GetAce(pacl: Long, dwaceindex: Int, pace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: Int, dwaclinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetAppContainerAce(acl: Long, startingaceindex: Int, appcontainerace: Long, appcontaineraceindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetCachedSigningLevel(file: Long, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetFileSecurityA(lpfilename: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetFileSecurityW(lpfilename: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetKernelObjectSecurity(handle: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetLengthSid(psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetPrivateObjectSecurity(objectdescriptor: Long, securityinformation: Int, resultantdescriptor: Long, descriptorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorControl(psecuritydescriptor: Long, pcontrol: Long, lpdwrevision: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorDacl(psecuritydescriptor: Long, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorGroup(psecuritydescriptor: Long, pgroup: Long, lpbgroupdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorLength(psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorOwner(psecuritydescriptor: Long, powner: Long, lpbownerdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorRMControl(securitydescriptor: Long, rmcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSecurityDescriptorSacl(psecuritydescriptor: Long, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSidIdentifierAuthority(psid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSidLengthRequired(nsubauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSidSubAuthority(psid: Long, nsubauthority: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_GetSidSubAuthorityCount(psid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_GetTokenInformation(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetUserObjectSecurity(hobj: Long, psirequested: Long, psid: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_GetWindowsAccountDomainSid(psid: Long, pdomainsid: Long, cbdomainsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ImpersonateLoggedOnUser(htoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ImpersonateSelf(impersonationlevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_InitializeAcl(pacl: Long, nacllength: Int, dwaclrevision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_InitializeSecurityDescriptor(psecuritydescriptor: Long, dwrevision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_InitializeSid(sid: Long, pidentifierauthority: Long, nsubauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_IsTokenRestricted(tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_IsValidAcl(pacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_IsValidSecurityDescriptor(psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_IsValidSid(psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_IsWellKnownSid(psid: Long, wellknownsidtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LogonUserA(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LogonUserExA(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LogonUserExW(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LogonUserW(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupAccountNameA(lpsystemname: Long, lpaccountname: Long, sid: Long, cbsid: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupAccountNameW(lpsystemname: Long, lpaccountname: Long, sid: Long, cbsid: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupAccountSidA(lpsystemname: Long, sid: Long, name: Long, cchname: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupAccountSidW(lpsystemname: Long, sid: Long, name: Long, cchname: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupPrivilegeDisplayNameA(lpsystemname: Long, lpname: Long, lpdisplayname: Long, cchdisplayname: Long, lplanguageid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupPrivilegeDisplayNameW(lpsystemname: Long, lpname: Long, lpdisplayname: Long, cchdisplayname: Long, lplanguageid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupPrivilegeNameA(lpsystemname: Long, lpluid: Long, lpname: Long, cchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupPrivilegeNameW(lpsystemname: Long, lpluid: Long, lpname: Long, cchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupPrivilegeValueA(lpsystemname: Long, lpname: Long, lpluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_LookupPrivilegeValueW(lpsystemname: Long, lpname: Long, lpluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_MakeAbsoluteSD(pselfrelativesecuritydescriptor: Long, pabsolutesecuritydescriptor: Long, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: Long, lpdwownersize: Long, pprimarygroup: Long, lpdwprimarygroupsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_MakeSelfRelativeSD(pabsolutesecuritydescriptor: Long, pselfrelativesecuritydescriptor: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_MapGenericMask(accessmask: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectCloseAuditAlarmA(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectCloseAuditAlarmW(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectDeleteAuditAlarmA(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectDeleteAuditAlarmW(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectOpenAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Int, accessgranted: Int, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectOpenAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Int, accessgranted: Int, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmA(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmW(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_PrivilegeCheck(clienttoken: Long, requiredprivileges: Long, pfresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_PrivilegedServiceAuditAlarmA(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_PrivilegedServiceAuditAlarmW(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_QuerySecurityAccessMask(securityinformation: Int, desiredaccess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_RevertToSelf(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_RtlConvertSidToUnicodeString(unicodestring: Long, sid: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: Int, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: Int, dwaclinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: Int, flags: Int, targetfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetFileSecurityA(lpfilename: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetFileSecurityW(lpfilename: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetKernelObjectSecurity(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetPrivateObjectSecurity(securityinformation: Int, modificationdescriptor: Long, objectssecuritydescriptor: Long, genericmapping: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetPrivateObjectSecurityEx(securityinformation: Int, modificationdescriptor: Long, objectssecuritydescriptor: Long, autoinheritflags: Int, genericmapping: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityAccessMask(securityinformation: Int, desiredaccess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityDescriptorControl(psecuritydescriptor: Long, controlbitsofinterest: Short, controlbitstoset: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityDescriptorDacl(psecuritydescriptor: Long, bdaclpresent: Int, pdacl: Long, bdacldefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityDescriptorGroup(psecuritydescriptor: Long, pgroup: Long, bgroupdefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityDescriptorOwner(psecuritydescriptor: Long, powner: Long, bownerdefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityDescriptorRMControl(securitydescriptor: Long, rmcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetSecurityDescriptorSacl(psecuritydescriptor: Long, bsaclpresent: Int, psacl: Long, bsacldefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetTokenInformation(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_SetUserObjectSecurity(hobj: Long, psirequested: Long, psid: Long): Int
}

public actual fun AccessCheck(psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheck(psecuritydescriptor, clienttoken, desiredaccess.toInt(), genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus)

public actual fun AccessCheckAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckAndAuditAlarmA(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose)

public actual fun AccessCheckAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckAndAuditAlarmW(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose)

public actual fun AccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByType(psecuritydescriptor, principalselfsid, clienttoken, desiredaccess.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus)

public actual fun AccessCheckByTypeAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmA(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose)

public actual fun AccessCheckByTypeAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmW(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose)

public actual fun AccessCheckByTypeResultList(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeResultList(psecuritydescriptor, principalselfsid, clienttoken, desiredaccess.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, privilegeset, privilegesetlength, grantedaccesslist, accessstatuslist)

public actual fun AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmA(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatuslist, pfgenerateonclose)

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatuslist, pfgenerateonclose)

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccesslist, accessstatuslist, pfgenerateonclose)

public actual fun AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmW(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccesslist, accessstatuslist, pfgenerateonclose)

public actual fun AddAccessAllowedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAccessAllowedAce(pacl, dwacerevision.toInt(), accessmask.toInt(), psid)

public actual fun AddAccessAllowedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAccessAllowedAceEx(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid)

public actual fun AddAccessAllowedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAccessAllowedObjectAce(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid, inheritedobjecttypeguid, psid)

public actual fun AddAccessDeniedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAccessDeniedAce(pacl, dwacerevision.toInt(), accessmask.toInt(), psid)

public actual fun AddAccessDeniedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAccessDeniedAceEx(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid)

public actual fun AddAccessDeniedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAccessDeniedObjectAce(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid, inheritedobjecttypeguid, psid)

public actual fun AddAce(pacl: Long, dwacerevision: ACE_REVISION, dwstartingaceindex: UInt, pacelist: Long, nacelistlength: UInt): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAce(pacl, dwacerevision.toInt(), dwstartingaceindex.toInt(), pacelist, nacelistlength.toInt())

public actual fun AddAuditAccessAce(pacl: Long, dwacerevision: ACE_REVISION, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAuditAccessAce(pacl, dwacerevision.toInt(), dwaccessmask.toInt(), psid, bauditsuccess, bauditfailure)

public actual fun AddAuditAccessAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAuditAccessAceEx(pacl, dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), psid, bauditsuccess, bauditfailure)

public actual fun AddAuditAccessObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddAuditAccessObjectAce(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid, inheritedobjecttypeguid, psid, bauditsuccess, bauditfailure)

public actual fun AddConditionalAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, acetype: UByte, accessmask: UInt, psid: PSID, conditionstr: PCWSTR, returnlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddConditionalAce(pacl, dwacerevision.toInt(), aceflags.toInt(), acetype.toByte(), accessmask.toInt(), psid, conditionstr, returnlength)

public actual fun AddMandatoryAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, mandatorypolicy: UInt, plabelsid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddMandatoryAce(pacl, dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), plabelsid)

public actual fun AddResourceAttributeAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID, pattributeinfo: Long, preturnlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddResourceAttributeAce(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid, pattributeinfo, preturnlength)

public actual fun AddScopedPolicyIDAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AddScopedPolicyIDAce(pacl, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid)

public actual fun AdjustTokenGroups(tokenhandle: HANDLE, resettodefault: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AdjustTokenGroups(tokenhandle, resettodefault, newstate, bufferlength.toInt(), previousstate, returnlength)

public actual fun AdjustTokenPrivileges(tokenhandle: HANDLE, disableallprivileges: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AdjustTokenPrivileges(tokenhandle, disableallprivileges, newstate, bufferlength.toInt(), previousstate, returnlength)

public actual fun AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AllocateAndInitializeSid(pidentifierauthority, nsubauthoritycount.toByte(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), psid)

public actual fun AllocateLocallyUniqueId(luid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AllocateLocallyUniqueId(luid)

public actual fun AreAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AreAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun AreAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_AreAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun CheckTokenCapability(tokenhandle: HANDLE, capabilitysidtocheck: PSID, hascapability: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CheckTokenCapability(tokenhandle, capabilitysidtocheck, hascapability)

public actual fun CheckTokenMembership(tokenhandle: HANDLE, sidtocheck: PSID, ismember: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CheckTokenMembership(tokenhandle, sidtocheck, ismember)

public actual fun CheckTokenMembershipEx(tokenhandle: HANDLE, sidtocheck: PSID, flags: UInt, ismember: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CheckTokenMembershipEx(tokenhandle, sidtocheck, flags.toInt(), ismember)

public actual fun ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, currentsecuritydescriptor: PSECURITY_DESCRIPTOR, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor, currentsecuritydescriptor, newsecuritydescriptor, objecttype, isdirectoryobject, genericmapping)

public actual fun CopySid(ndestinationsidlength: UInt, pdestinationsid: PSID, psourcesid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CopySid(ndestinationsidlength.toInt(), pdestinationsid, psourcesid)

public actual fun CreatePrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: BOOL, token: HANDLE, genericmapping: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CreatePrivateObjectSecurity(parentdescriptor, creatordescriptor, newdescriptor, isdirectoryobject, token, genericmapping)

public actual fun CreatePrivateObjectSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CreatePrivateObjectSecurityEx(parentdescriptor, creatordescriptor, newdescriptor, objecttype, iscontainerobject, autoinheritflags.toInt(), token, genericmapping)

public actual fun CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttypes: Long, guidcount: UInt, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor, creatordescriptor, newdescriptor, objecttypes, guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), token, genericmapping)

public actual fun CreateRestrictedToken(existingtokenhandle: HANDLE, flags: CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount: UInt, sidstodisable: Long, deleteprivilegecount: UInt, privilegestodelete: Long, restrictedsidcount: UInt, sidstorestrict: Long, newtokenhandle: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CreateRestrictedToken(existingtokenhandle, flags.toInt(), disablesidcount.toInt(), sidstodisable, deleteprivilegecount.toInt(), privilegestodelete, restrictedsidcount.toInt(), sidstorestrict, newtokenhandle)

public actual fun CreateWellKnownSid(wellknownsidtype: WELL_KNOWN_SID_TYPE, domainsid: PSID, psid: PSID, cbsid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_CreateWellKnownSid(wellknownsidtype, domainsid, psid, cbsid)

public actual fun DeleteAce(pacl: Long, dwaceindex: UInt): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_DeleteAce(pacl, dwaceindex.toInt())

public actual fun DeriveCapabilitySidsFromName(capname: PCWSTR, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_DeriveCapabilitySidsFromName(capname, capabilitygroupsids, capabilitygroupsidcount, capabilitysids, capabilitysidcount)

public actual fun DestroyPrivateObjectSecurity(objectdescriptor: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_DestroyPrivateObjectSecurity(objectdescriptor)

public actual fun DuplicateToken(existingtokenhandle: HANDLE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_DuplicateToken(existingtokenhandle, impersonationlevel, duplicatetokenhandle)

public actual fun DuplicateTokenEx(hexistingtoken: HANDLE, dwdesiredaccess: TOKEN_ACCESS_MASK, lptokenattributes: Long, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokentype: TOKEN_TYPE, phnewtoken: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_DuplicateTokenEx(hexistingtoken, dwdesiredaccess.toInt(), lptokenattributes, impersonationlevel, tokentype, phnewtoken)

public actual fun EqualDomainSid(psid1: PSID, psid2: PSID, pfequal: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_EqualDomainSid(psid1, psid2, pfequal)

public actual fun EqualPrefixSid(psid1: PSID, psid2: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_EqualPrefixSid(psid1, psid2)

public actual fun EqualSid(psid1: PSID, psid2: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_EqualSid(psid1, psid2)

public actual fun FindFirstFreeAce(pacl: Long, pace: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_FindFirstFreeAce(pacl, pace)

public actual fun FreeSid(psid: PSID): Long =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_FreeSid(psid)

public actual fun GetAce(pacl: Long, dwaceindex: UInt, pace: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetAce(pacl, dwaceindex.toInt(), pace)

public actual fun GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetAclInformation(pacl, paclinformation, naclinformationlength.toInt(), dwaclinformationclass)

public actual fun GetAppContainerAce(acl: Long, startingaceindex: UInt, appcontainerace: Long, appcontaineraceindex: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetAppContainerAce(acl, startingaceindex.toInt(), appcontainerace, appcontaineraceindex)

public actual fun GetCachedSigningLevel(file: HANDLE, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetCachedSigningLevel(file, flags, signinglevel, thumbprint, thumbprintsize, thumbprintalgorithm)

public actual fun GetFileSecurityA(lpfilename: PCSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetFileSecurityA(lpfilename, requestedinformation.toInt(), psecuritydescriptor, nlength.toInt(), lpnlengthneeded)

public actual fun GetFileSecurityW(lpfilename: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetFileSecurityW(lpfilename, requestedinformation.toInt(), psecuritydescriptor, nlength.toInt(), lpnlengthneeded)

public actual fun GetKernelObjectSecurity(handle: HANDLE, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetKernelObjectSecurity(handle, requestedinformation.toInt(), psecuritydescriptor, nlength.toInt(), lpnlengthneeded)

public actual fun GetLengthSid(psid: PSID): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetLengthSid(psid).toUInt()

public actual fun GetPrivateObjectSecurity(objectdescriptor: PSECURITY_DESCRIPTOR, securityinformation: OBJECT_SECURITY_INFORMATION, resultantdescriptor: PSECURITY_DESCRIPTOR, descriptorlength: UInt, returnlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetPrivateObjectSecurity(objectdescriptor, securityinformation.toInt(), resultantdescriptor, descriptorlength.toInt(), returnlength)

public actual fun GetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, pcontrol: Long, lpdwrevision: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorControl(psecuritydescriptor, pcontrol, lpdwrevision)

public actual fun GetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorDacl(psecuritydescriptor, lpbdaclpresent, pdacl, lpbdacldefaulted)

public actual fun GetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: Long, lpbgroupdefaulted: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorGroup(psecuritydescriptor, pgroup, lpbgroupdefaulted)

public actual fun GetSecurityDescriptorLength(psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorLength(psecuritydescriptor).toUInt()

public actual fun GetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: Long, lpbownerdefaulted: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorOwner(psecuritydescriptor, powner, lpbownerdefaulted)

public actual fun GetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorRMControl(securitydescriptor, rmcontrol).toUInt()

public actual fun GetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSecurityDescriptorSacl(psecuritydescriptor, lpbsaclpresent, psacl, lpbsacldefaulted)

public actual fun GetSidIdentifierAuthority(psid: PSID): Long =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSidIdentifierAuthority(psid)

public actual fun GetSidLengthRequired(nsubauthoritycount: UByte): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSidLengthRequired(nsubauthoritycount.toByte()).toUInt()

public actual fun GetSidSubAuthority(psid: PSID, nsubauthority: UInt): Long =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSidSubAuthority(psid, nsubauthority.toInt())

public actual fun GetSidSubAuthorityCount(psid: PSID): Long =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetSidSubAuthorityCount(psid)

public actual fun GetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetTokenInformation(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength.toInt(), returnlength)

public actual fun GetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetUserObjectSecurity(hobj, psirequested, psid, nlength.toInt(), lpnlengthneeded)

public actual fun GetWindowsAccountDomainSid(psid: PSID, pdomainsid: PSID, cbdomainsid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_GetWindowsAccountDomainSid(psid, pdomainsid, cbdomainsid)

public actual fun ImpersonateAnonymousToken(threadhandle: HANDLE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ImpersonateAnonymousToken(threadhandle)

public actual fun ImpersonateLoggedOnUser(htoken: HANDLE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ImpersonateLoggedOnUser(htoken)

public actual fun ImpersonateSelf(impersonationlevel: SECURITY_IMPERSONATION_LEVEL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ImpersonateSelf(impersonationlevel)

public actual fun InitializeAcl(pacl: Long, nacllength: UInt, dwaclrevision: ACE_REVISION): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_InitializeAcl(pacl, nacllength.toInt(), dwaclrevision.toInt())

public actual fun InitializeSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, dwrevision: UInt): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_InitializeSecurityDescriptor(psecuritydescriptor, dwrevision.toInt())

public actual fun InitializeSid(sid: PSID, pidentifierauthority: Long, nsubauthoritycount: UByte): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_InitializeSid(sid, pidentifierauthority, nsubauthoritycount.toByte())

public actual fun IsTokenRestricted(tokenhandle: HANDLE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_IsTokenRestricted(tokenhandle)

public actual fun IsValidAcl(pacl: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_IsValidAcl(pacl)

public actual fun IsValidSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_IsValidSecurityDescriptor(psecuritydescriptor)

public actual fun IsValidSid(psid: PSID): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_IsValidSid(psid)

public actual fun IsWellKnownSid(psid: PSID, wellknownsidtype: WELL_KNOWN_SID_TYPE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_IsWellKnownSid(psid, wellknownsidtype)

public actual fun LogonUserA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LogonUserA(lpszusername, lpszdomain, lpszpassword, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken)

public actual fun LogonUserExA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LogonUserExA(lpszusername, lpszdomain, lpszpassword, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits)

public actual fun LogonUserExW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LogonUserExW(lpszusername, lpszdomain, lpszpassword, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits)

public actual fun LogonUserW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LogonUserW(lpszusername, lpszdomain, lpszpassword, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken)

public actual fun LookupAccountNameA(lpsystemname: PCSTR, lpaccountname: PCSTR, sid: PSID, cbsid: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupAccountNameA(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse)

public actual fun LookupAccountNameW(lpsystemname: PCWSTR, lpaccountname: PCWSTR, sid: PSID, cbsid: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupAccountNameW(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse)

public actual fun LookupAccountSidA(lpsystemname: PCSTR, sid: PSID, name: PSTR, cchname: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupAccountSidA(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse)

public actual fun LookupAccountSidW(lpsystemname: PCWSTR, sid: PSID, name: PWSTR, cchname: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupAccountSidW(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse)

public actual fun LookupPrivilegeDisplayNameA(lpsystemname: PCSTR, lpname: PCSTR, lpdisplayname: PSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupPrivilegeDisplayNameA(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid)

public actual fun LookupPrivilegeDisplayNameW(lpsystemname: PCWSTR, lpname: PCWSTR, lpdisplayname: PWSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupPrivilegeDisplayNameW(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid)

public actual fun LookupPrivilegeNameA(lpsystemname: PCSTR, lpluid: Long, lpname: PSTR, cchname: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupPrivilegeNameA(lpsystemname, lpluid, lpname, cchname)

public actual fun LookupPrivilegeNameW(lpsystemname: PCWSTR, lpluid: Long, lpname: PWSTR, cchname: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupPrivilegeNameW(lpsystemname, lpluid, lpname, cchname)

public actual fun LookupPrivilegeValueA(lpsystemname: PCSTR, lpname: PCSTR, lpluid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupPrivilegeValueA(lpsystemname, lpname, lpluid)

public actual fun LookupPrivilegeValueW(lpsystemname: PCWSTR, lpname: PCWSTR, lpluid: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_LookupPrivilegeValueW(lpsystemname, lpname, lpluid)

public actual fun MakeAbsoluteSD(pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: PSID, lpdwownersize: Long, pprimarygroup: PSID, lpdwprimarygroupsize: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_MakeAbsoluteSD(pselfrelativesecuritydescriptor, pabsolutesecuritydescriptor, lpdwabsolutesecuritydescriptorsize, pdacl, lpdwdaclsize, psacl, lpdwsaclsize, powner, lpdwownersize, pprimarygroup, lpdwprimarygroupsize)

public actual fun MakeSelfRelativeSD(pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwbufferlength: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_MakeSelfRelativeSD(pabsolutesecuritydescriptor, pselfrelativesecuritydescriptor, lpdwbufferlength)

public actual fun MapGenericMask(accessmask: Long, genericmapping: Long) {
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_MapGenericMask(accessmask, genericmapping)
}

public actual fun ObjectCloseAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectCloseAuditAlarmA(subsystemname, handleid, generateonclose)

public actual fun ObjectCloseAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectCloseAuditAlarmW(subsystemname, handleid, generateonclose)

public actual fun ObjectDeleteAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectDeleteAuditAlarmA(subsystemname, handleid, generateonclose)

public actual fun ObjectDeleteAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectDeleteAuditAlarmW(subsystemname, handleid, generateonclose)

public actual fun ObjectOpenAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectOpenAuditAlarmA(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, clienttoken, desiredaccess.toInt(), grantedaccess.toInt(), privileges, objectcreation, accessgranted, generateonclose)

public actual fun ObjectOpenAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectOpenAuditAlarmW(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, clienttoken, desiredaccess.toInt(), grantedaccess.toInt(), privileges, objectcreation, accessgranted, generateonclose)

public actual fun ObjectPrivilegeAuditAlarmA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmA(subsystemname, handleid, clienttoken, desiredaccess.toInt(), privileges, accessgranted)

public actual fun ObjectPrivilegeAuditAlarmW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmW(subsystemname, handleid, clienttoken, desiredaccess.toInt(), privileges, accessgranted)

public actual fun PrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, pfresult: Long): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_PrivilegeCheck(clienttoken, requiredprivileges, pfresult)

public actual fun PrivilegedServiceAuditAlarmA(subsystemname: PCSTR, servicename: PCSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_PrivilegedServiceAuditAlarmA(subsystemname, servicename, clienttoken, privileges, accessgranted)

public actual fun PrivilegedServiceAuditAlarmW(subsystemname: PCWSTR, servicename: PCWSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_PrivilegedServiceAuditAlarmW(subsystemname, servicename, clienttoken, privileges, accessgranted)

public actual fun QuerySecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_QuerySecurityAccessMask(securityinformation.toInt(), desiredaccess)
}

public actual fun RevertToSelf(): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_RevertToSelf()

public actual fun RtlConvertSidToUnicodeString(unicodestring: Long, sid: PSID, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_RtlConvertSidToUnicodeString(unicodestring, sid, allocatedestinationstring)

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_RtlNormalizeSecurityDescriptor(securitydescriptor, securitydescriptorlength.toInt(), newsecuritydescriptor, newsecuritydescriptorlength, checkonly)

public actual fun SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetAclInformation(pacl, paclinformation, naclinformationlength.toInt(), dwaclinformationclass)

public actual fun SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: UInt, flags: UInt, targetfile: HANDLE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetCachedSigningLevel(sourcefiles, sourcefilecount.toInt(), flags.toInt(), targetfile)

public actual fun SetFileSecurityA(lpfilename: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetFileSecurityA(lpfilename, securityinformation.toInt(), psecuritydescriptor)

public actual fun SetFileSecurityW(lpfilename: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetFileSecurityW(lpfilename, securityinformation.toInt(), psecuritydescriptor)

public actual fun SetKernelObjectSecurity(handle: HANDLE, securityinformation: OBJECT_SECURITY_INFORMATION, securitydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetKernelObjectSecurity(handle, securityinformation.toInt(), securitydescriptor)

public actual fun SetPrivateObjectSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, genericmapping: Long, token: HANDLE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetPrivateObjectSecurity(securityinformation.toInt(), modificationdescriptor, objectssecuritydescriptor, genericmapping, token)

public actual fun SetPrivateObjectSecurityEx(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, genericmapping: Long, token: HANDLE): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetPrivateObjectSecurityEx(securityinformation.toInt(), modificationdescriptor, objectssecuritydescriptor, autoinheritflags.toInt(), genericmapping, token)

public actual fun SetSecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityAccessMask(securityinformation.toInt(), desiredaccess)
}

public actual fun SetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, controlbitsofinterest: SECURITY_DESCRIPTOR_CONTROL, controlbitstoset: SECURITY_DESCRIPTOR_CONTROL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityDescriptorControl(psecuritydescriptor, controlbitsofinterest.toShort(), controlbitstoset.toShort())

public actual fun SetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bdaclpresent: BOOL, pdacl: Long, bdacldefaulted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityDescriptorDacl(psecuritydescriptor, bdaclpresent, pdacl, bdacldefaulted)

public actual fun SetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: PSID, bgroupdefaulted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityDescriptorGroup(psecuritydescriptor, pgroup, bgroupdefaulted)

public actual fun SetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: PSID, bownerdefaulted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityDescriptorOwner(psecuritydescriptor, powner, bownerdefaulted)

public actual fun SetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityDescriptorRMControl(securitydescriptor, rmcontrol).toUInt()

public actual fun SetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bsaclpresent: BOOL, psacl: Long, bsacldefaulted: BOOL): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetSecurityDescriptorSacl(psecuritydescriptor, bsaclpresent, psacl, bsacldefaulted)

public actual fun SetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetTokenInformation(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength.toInt())

public actual fun SetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_SetUserObjectSecurity(hobj, psirequested, psid)
