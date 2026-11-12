@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32SecurityJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheck(psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByType(psecuritydescriptor: Long, principalselfsid: Long, clienttoken: Long, desiredaccess: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeResultList(psecuritydescriptor: Long, principalselfsid: Long, clienttoken: Long, desiredaccess: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAccessAllowedAce(pacl: Long, dwacerevision: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAccessAllowedAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAccessDeniedAce(pacl: Long, dwacerevision: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAccessDeniedAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAce(pacl: Long, dwacerevision: Int, dwstartingaceindex: Int, pacelist: Long, nacelistlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAuditAccessAce(pacl: Long, dwacerevision: Int, dwaccessmask: Int, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAuditAccessAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, dwaccessmask: Int, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddAuditAccessObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddConditionalAce(pacl: Long, dwacerevision: Int, aceflags: Int, acetype: Byte, accessmask: Int, psid: Long, conditionstr: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddMandatoryAce(pacl: Long, dwacerevision: Int, aceflags: Int, mandatorypolicy: Int, plabelsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddResourceAttributeAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long, pattributeinfo: Long, preturnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAddScopedPolicyIDAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAdjustTokenGroups(tokenhandle: Long, resettodefault: Int, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAdjustTokenPrivileges(tokenhandle: Long, disableallprivileges: Int, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: Byte, nsubauthority0: Int, nsubauthority1: Int, nsubauthority2: Int, nsubauthority3: Int, nsubauthority4: Int, nsubauthority5: Int, nsubauthority6: Int, nsubauthority7: Int, psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCheckTokenCapability(tokenhandle: Long, capabilitysidtocheck: Long, hascapability: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCheckTokenMembership(tokenhandle: Long, sidtocheck: Long, ismember: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCheckTokenMembershipEx(tokenhandle: Long, sidtocheck: Long, flags: Int, ismember: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: Long, currentsecuritydescriptor: Long, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCopySid(ndestinationsidlength: Int, pdestinationsid: Long, psourcesid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, isdirectoryobject: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, objecttype: Long, iscontainerobject: Int, autoinheritflags: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, objecttypes: Long, guidcount: Int, iscontainerobject: Int, autoinheritflags: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCreateRestrictedToken(existingtokenhandle: Long, flags: Int, disablesidcount: Int, sidstodisable: Long, deleteprivilegecount: Int, privilegestodelete: Long, restrictedsidcount: Int, sidstorestrict: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCreateWellKnownSid(wellknownsidtype: Int, domainsid: Long, psid: Long, cbsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDeleteAce(pacl: Long, dwaceindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(capname: Long, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(objectdescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDuplicateToken(existingtokenhandle: Long, impersonationlevel: Int, duplicatetokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDuplicateTokenEx(hexistingtoken: Long, dwdesiredaccess: Int, lptokenattributes: Long, impersonationlevel: Int, tokentype: Int, phnewtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEqualDomainSid(psid1: Long, psid2: Long, pfequal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEqualPrefixSid(psid1: Long, psid2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityEqualSid(psid1: Long, psid2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityFindFirstFreeAce(pacl: Long, pace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityFreeSid(psid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetAce(pacl: Long, dwaceindex: Int, pace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: Int, dwaclinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetAppContainerAce(acl: Long, startingaceindex: Int, appcontainerace: Long, appcontaineraceindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetCachedSigningLevel(file: Long, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetFileSecurityA(lpfilename: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetFileSecurityW(lpfilename: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetKernelObjectSecurity(handle: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetLengthSid(psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetPrivateObjectSecurity(objectdescriptor: Long, securityinformation: Int, resultantdescriptor: Long, descriptorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorControl(psecuritydescriptor: Long, pcontrol: Long, lpdwrevision: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(psecuritydescriptor: Long, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(psecuritydescriptor: Long, pgroup: Long, lpbgroupdefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorLength(psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(psecuritydescriptor: Long, powner: Long, lpbownerdefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(securitydescriptor: Long, rmcontrol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(psecuritydescriptor: Long, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSidIdentifierAuthority(psid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSidSubAuthority(psid: Long, nsubauthority: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetSidSubAuthorityCount(psid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetTokenInformation(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetUserObjectSecurity(hobj: Long, psirequested: Long, psid: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(psid: Long, pdomainsid: Long, cbdomainsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityImpersonateLoggedOnUser(htoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityInitializeAcl(pacl: Long, nacllength: Int, dwaclrevision: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityInitializeSecurityDescriptor(psecuritydescriptor: Long, dwrevision: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityInitializeSid(sid: Long, pidentifierauthority: Long, nsubauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsTokenRestricted(tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsValidAcl(pacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsValidSecurityDescriptor(psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsValidSid(psid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsWellKnownSid(psid: Long, wellknownsidtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLogonUserA(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLogonUserExA(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLogonUserExW(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLogonUserW(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupAccountNameA(lpsystemname: Long, lpaccountname: Long, sid: Long, cbsid: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupAccountNameW(lpsystemname: Long, lpaccountname: Long, sid: Long, cbsid: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupAccountSidA(lpsystemname: Long, sid: Long, name: Long, cchname: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupAccountSidW(lpsystemname: Long, sid: Long, name: Long, cchname: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(lpsystemname: Long, lpname: Long, lpdisplayname: Long, cchdisplayname: Long, lplanguageid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(lpsystemname: Long, lpname: Long, lpdisplayname: Long, cchdisplayname: Long, lplanguageid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupPrivilegeNameA(lpsystemname: Long, lpluid: Long, lpname: Long, cchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupPrivilegeNameW(lpsystemname: Long, lpluid: Long, lpname: Long, cchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupPrivilegeValueA(lpsystemname: Long, lpname: Long, lpluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLookupPrivilegeValueW(lpsystemname: Long, lpname: Long, lpluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityMakeAbsoluteSD(pselfrelativesecuritydescriptor: Long, pabsolutesecuritydescriptor: Long, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: Long, lpdwownersize: Long, pprimarygroup: Long, lpdwprimarygroupsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityMakeSelfRelativeSD(pabsolutesecuritydescriptor: Long, pselfrelativesecuritydescriptor: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityMapGenericMask(accessmask: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Int, accessgranted: Int, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Int, accessgranted: Int, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, pfresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityQuerySecurityAccessMask(securityinformation: Int, desiredaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityRevertToSelf(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(unicodestring: Long, sid: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: Int, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: Int, dwaclinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetCachedSigningLevel(sourcefiles: Long, sourcefilecount: Int, flags: Int, targetfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetFileSecurityA(lpfilename: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetFileSecurityW(lpfilename: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetKernelObjectSecurity(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetPrivateObjectSecurity(securityinformation: Int, modificationdescriptor: Long, objectssecuritydescriptor: Long, genericmapping: Long, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(securityinformation: Int, modificationdescriptor: Long, objectssecuritydescriptor: Long, autoinheritflags: Int, genericmapping: Long, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityAccessMask(securityinformation: Int, desiredaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityDescriptorControl(psecuritydescriptor: Long, controlbitsofinterest: Short, controlbitstoset: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(psecuritydescriptor: Long, bdaclpresent: Int, pdacl: Long, bdacldefaulted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(psecuritydescriptor: Long, pgroup: Long, bgroupdefaulted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(psecuritydescriptor: Long, powner: Long, bownerdefaulted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(securitydescriptor: Long, rmcontrol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(psecuritydescriptor: Long, bsaclpresent: Int, psacl: Long, bsacldefaulted: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetTokenInformation(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecuritySetUserObjectSecurity(hobj: Long, psirequested: Long, psid: Long): Int
}

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheck(psecuritydescriptor.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), genericmapping.rawAddress, privilegeset.rawAddress, privilegesetlength.rawAddress, grantedaccess.rawAddress, accessstatus.rawAddress)

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, desiredaccess.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, desiredaccess.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByType(psecuritydescriptor.rawAddress, principalselfsid.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, privilegeset.rawAddress, privilegesetlength.rawAddress, grantedaccess.rawAddress, accessstatus.rawAddress)

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccesslist: MutPtr, accessstatuslist: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeResultList(psecuritydescriptor.rawAddress, principalselfsid.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, privilegeset.rawAddress, privilegesetlength.rawAddress, grantedaccesslist.rawAddress, accessstatuslist.rawAddress)

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatuslist.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatuslist.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccesslist.rawAddress, accessstatuslist.rawAddress, pfgenerateonclose.rawAddress)

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccesslist.rawAddress, accessstatuslist.rawAddress, pfgenerateonclose.rawAddress)

public actual fun addAccessAllowedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAccessAllowedAce(pacl.rawAddress, dwacerevision.toInt(), accessmask.toInt(), psid.rawAddress)

public actual fun addAccessAllowedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAccessAllowedAceEx(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress)

public actual fun addAccessAllowedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress, inheritedobjecttypeguid.rawAddress, psid.rawAddress)

public actual fun addAccessDeniedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAccessDeniedAce(pacl.rawAddress, dwacerevision.toInt(), accessmask.toInt(), psid.rawAddress)

public actual fun addAccessDeniedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAccessDeniedAceEx(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress)

public actual fun addAccessDeniedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress, inheritedobjecttypeguid.rawAddress, psid.rawAddress)

public actual fun addAce(pacl: MutPtr, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr, nacelistlength: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAce(pacl.rawAddress, dwacerevision.toInt(), dwstartingaceindex.toInt(), pacelist.rawAddress, nacelistlength.toInt())

public actual fun addAuditAccessAce(pacl: MutPtr, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAuditAccessAce(pacl.rawAddress, dwacerevision.toInt(), dwaccessmask.toInt(), psid.rawAddress, bauditsuccess, bauditfailure)

public actual fun addAuditAccessAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAuditAccessAceEx(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), psid.rawAddress, bauditsuccess, bauditfailure)

public actual fun addAuditAccessObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddAuditAccessObjectAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress, inheritedobjecttypeguid.rawAddress, psid.rawAddress, bauditsuccess, bauditfailure)

public actual fun addConditionalAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddConditionalAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), acetype.toByte(), accessmask.toInt(), psid.rawAddress, conditionstr.rawAddress, returnlength.rawAddress)

public actual fun addMandatoryAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddMandatoryAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), plabelsid.rawAddress)

public actual fun addResourceAttributeAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr, preturnlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddResourceAttributeAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress, pattributeinfo.rawAddress, preturnlength.rawAddress)

public actual fun addScopedPolicyIDAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAddScopedPolicyIDAce(pacl.rawAddress, dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress)

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAdjustTokenGroups(tokenhandle.rawAddress, resettodefault, newstate.rawAddress, bufferlength.toInt(), previousstate.rawAddress, returnlength.rawAddress)

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAdjustTokenPrivileges(tokenhandle.rawAddress, disableallprivileges, newstate.rawAddress, bufferlength.toInt(), previousstate.rawAddress, returnlength.rawAddress)

public actual fun allocateAndInitializeSid(pidentifierauthority: ConstPtr, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAllocateAndInitializeSid(pidentifierauthority.rawAddress, nsubauthoritycount.toByte(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), psid.rawAddress)

public actual fun allocateLocallyUniqueId(luid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAllocateLocallyUniqueId(luid.rawAddress)

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCheckTokenCapability(tokenhandle.rawAddress, capabilitysidtocheck.rawAddress, hascapability.rawAddress)

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCheckTokenMembership(tokenhandle.rawAddress, sidtocheck.rawAddress, ismember.rawAddress)

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCheckTokenMembershipEx(tokenhandle.rawAddress, sidtocheck.rawAddress, flags.toInt(), ismember.rawAddress)

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, genericmapping: ConstPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(parentdescriptor.rawAddress, currentsecuritydescriptor.rawAddress, newsecuritydescriptor.rawAddress, objecttype.rawAddress, isdirectoryobject, genericmapping.rawAddress)

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCopySid(ndestinationsidlength.toInt(), pdestinationsid.rawAddress, psourcesid.rawAddress)

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(parentdescriptor.rawAddress, creatordescriptor.rawAddress, newdescriptor.rawAddress, isdirectoryobject, token.rawAddress, genericmapping.rawAddress)

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(parentdescriptor.rawAddress, creatordescriptor.rawAddress, newdescriptor.rawAddress, objecttype.rawAddress, iscontainerobject, autoinheritflags.toInt(), token.rawAddress, genericmapping.rawAddress)

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttypes: ConstPtr, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor.rawAddress, creatordescriptor.rawAddress, newdescriptor.rawAddress, objecttypes.rawAddress, guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), token.rawAddress, genericmapping.rawAddress)

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr, deleteprivilegecount: UInt, privilegestodelete: ConstPtr, restrictedsidcount: UInt, sidstorestrict: ConstPtr, newtokenhandle: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCreateRestrictedToken(existingtokenhandle.rawAddress, flags.toInt(), disablesidcount.toInt(), sidstodisable.rawAddress, deleteprivilegecount.toInt(), privilegestodelete.rawAddress, restrictedsidcount.toInt(), sidstorestrict.rawAddress, newtokenhandle.rawAddress)

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityCreateWellKnownSid(wellknownsidtype, domainsid.rawAddress, psid.rawAddress, cbsid.rawAddress)

public actual fun deleteAce(pacl: MutPtr, dwaceindex: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityDeleteAce(pacl.rawAddress, dwaceindex.toInt())

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr, capabilitygroupsidcount: MutPtr, capabilitysids: MutPtr, capabilitysidcount: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(capname.rawAddress, capabilitygroupsids.rawAddress, capabilitygroupsidcount.rawAddress, capabilitysids.rawAddress, capabilitysidcount.rawAddress)

public actual fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(objectdescriptor.rawAddress)

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityDuplicateToken(existingtokenhandle.rawAddress, impersonationlevel, duplicatetokenhandle.rawAddress)

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityDuplicateTokenEx(hexistingtoken.rawAddress, dwdesiredaccess.toInt(), lptokenattributes.rawAddress, impersonationlevel, tokentype, phnewtoken.rawAddress)

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityEqualDomainSid(psid1.rawAddress, psid2.rawAddress, pfequal.rawAddress)

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityEqualPrefixSid(psid1.rawAddress, psid2.rawAddress)

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityEqualSid(psid1.rawAddress, psid2.rawAddress)

public actual fun findFirstFreeAce(pacl: ConstPtr, pace: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityFindFirstFreeAce(pacl.rawAddress, pace.rawAddress)

public actual fun freeSid(psid: Psid): MutPtr =
    MutPtr(WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityFreeSid(psid.rawAddress))

public actual fun getAce(pacl: ConstPtr, dwaceindex: UInt, pace: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetAce(pacl.rawAddress, dwaceindex.toInt(), pace.rawAddress)

public actual fun getAclInformation(pacl: ConstPtr, paclinformation: MutPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetAclInformation(pacl.rawAddress, paclinformation.rawAddress, naclinformationlength.toInt(), dwaclinformationclass)

public actual fun getAppContainerAce(acl: ConstPtr, startingaceindex: UInt, appcontainerace: MutPtr, appcontaineraceindex: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetAppContainerAce(acl.rawAddress, startingaceindex.toInt(), appcontainerace.rawAddress, appcontaineraceindex.rawAddress)

public actual fun getCachedSigningLevel(file: Handle, flags: MutPtr, signinglevel: MutPtr, thumbprint: MutPtr, thumbprintsize: MutPtr, thumbprintalgorithm: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetCachedSigningLevel(file.rawAddress, flags.rawAddress, signinglevel.rawAddress, thumbprint.rawAddress, thumbprintsize.rawAddress, thumbprintalgorithm.rawAddress)

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetFileSecurityA(lpfilename.rawAddress, requestedinformation.toInt(), psecuritydescriptor.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetFileSecurityW(lpfilename.rawAddress, requestedinformation.toInt(), psecuritydescriptor.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetKernelObjectSecurity(handle.rawAddress, requestedinformation.toInt(), psecuritydescriptor.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun getLengthSid(psid: Psid): UInt =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetLengthSid(psid.rawAddress).toUInt()

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetPrivateObjectSecurity(objectdescriptor.rawAddress, securityinformation.toInt(), resultantdescriptor.rawAddress, descriptorlength.toInt(), returnlength.rawAddress)

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr, lpdwrevision: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorControl(psecuritydescriptor.rawAddress, pcontrol.rawAddress, lpdwrevision.rawAddress)

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr, pdacl: MutPtr, lpbdacldefaulted: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(psecuritydescriptor.rawAddress, lpbdaclpresent.rawAddress, pdacl.rawAddress, lpbdacldefaulted.rawAddress)

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr, lpbgroupdefaulted: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(psecuritydescriptor.rawAddress, pgroup.rawAddress, lpbgroupdefaulted.rawAddress)

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorLength(psecuritydescriptor.rawAddress).toUInt()

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr, lpbownerdefaulted: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(psecuritydescriptor.rawAddress, powner.rawAddress, lpbownerdefaulted.rawAddress)

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr): UInt =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(securitydescriptor.rawAddress, rmcontrol.rawAddress).toUInt()

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr, psacl: MutPtr, lpbsacldefaulted: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(psecuritydescriptor.rawAddress, lpbsaclpresent.rawAddress, psacl.rawAddress, lpbsacldefaulted.rawAddress)

public actual fun getSidIdentifierAuthority(psid: Psid): MutPtr =
    MutPtr(WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSidIdentifierAuthority(psid.rawAddress))

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount.toByte()).toUInt()

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSidSubAuthority(psid.rawAddress, nsubauthority.toInt()))

public actual fun getSidSubAuthorityCount(psid: Psid): MutPtr =
    MutPtr(WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetSidSubAuthorityCount(psid.rawAddress))

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetTokenInformation(tokenhandle.rawAddress, tokeninformationclass, tokeninformation.rawAddress, tokeninformationlength.toInt(), returnlength.rawAddress)

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetUserObjectSecurity(hobj.rawAddress, psirequested.rawAddress, psid.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(psid.rawAddress, pdomainsid.rawAddress, cbdomainsid.rawAddress)

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityImpersonateAnonymousToken(threadhandle.rawAddress)

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityImpersonateLoggedOnUser(htoken.rawAddress)

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel)

public actual fun initializeAcl(pacl: MutPtr, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityInitializeAcl(pacl.rawAddress, nacllength.toInt(), dwaclrevision.toInt())

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityInitializeSecurityDescriptor(psecuritydescriptor.rawAddress, dwrevision.toInt())

public actual fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr, nsubauthoritycount: UByte): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityInitializeSid(sid.rawAddress, pidentifierauthority.rawAddress, nsubauthoritycount.toByte())

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityIsTokenRestricted(tokenhandle.rawAddress)

public actual fun isValidAcl(pacl: ConstPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityIsValidAcl(pacl.rawAddress)

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityIsValidSecurityDescriptor(psecuritydescriptor.rawAddress)

public actual fun isValidSid(psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityIsValidSid(psid.rawAddress)

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityIsWellKnownSid(psid.rawAddress, wellknownsidtype)

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLogonUserA(lpszusername.rawAddress, lpszdomain.rawAddress, lpszpassword.rawAddress, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress)

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLogonUserExA(lpszusername.rawAddress, lpszdomain.rawAddress, lpszpassword.rawAddress, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress, pplogonsid.rawAddress, ppprofilebuffer.rawAddress, pdwprofilelength.rawAddress, pquotalimits.rawAddress)

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLogonUserExW(lpszusername.rawAddress, lpszdomain.rawAddress, lpszpassword.rawAddress, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress, pplogonsid.rawAddress, ppprofilebuffer.rawAddress, pdwprofilelength.rawAddress, pquotalimits.rawAddress)

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLogonUserW(lpszusername.rawAddress, lpszdomain.rawAddress, lpszpassword.rawAddress, dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress)

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupAccountNameA(lpsystemname.rawAddress, lpaccountname.rawAddress, sid.rawAddress, cbsid.rawAddress, referenceddomainname.rawAddress, cchreferenceddomainname.rawAddress, peuse.rawAddress)

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupAccountNameW(lpsystemname.rawAddress, lpaccountname.rawAddress, sid.rawAddress, cbsid.rawAddress, referenceddomainname.rawAddress, cchreferenceddomainname.rawAddress, peuse.rawAddress)

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupAccountSidA(lpsystemname.rawAddress, sid.rawAddress, name.rawAddress, cchname.rawAddress, referenceddomainname.rawAddress, cchreferenceddomainname.rawAddress, peuse.rawAddress)

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupAccountSidW(lpsystemname.rawAddress, sid.rawAddress, name.rawAddress, cchname.rawAddress, referenceddomainname.rawAddress, cchreferenceddomainname.rawAddress, peuse.rawAddress)

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(lpsystemname.rawAddress, lpname.rawAddress, lpdisplayname.rawAddress, cchdisplayname.rawAddress, lplanguageid.rawAddress)

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(lpsystemname.rawAddress, lpname.rawAddress, lpdisplayname.rawAddress, cchdisplayname.rawAddress, lplanguageid.rawAddress)

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr, lpname: Pstr, cchname: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupPrivilegeNameA(lpsystemname.rawAddress, lpluid.rawAddress, lpname.rawAddress, cchname.rawAddress)

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr, lpname: Pwstr, cchname: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupPrivilegeNameW(lpsystemname.rawAddress, lpluid.rawAddress, lpname.rawAddress, cchname.rawAddress)

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupPrivilegeValueA(lpsystemname.rawAddress, lpname.rawAddress, lpluid.rawAddress)

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityLookupPrivilegeValueW(lpsystemname.rawAddress, lpname.rawAddress, lpluid.rawAddress)

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr, pdacl: MutPtr, lpdwdaclsize: MutPtr, psacl: MutPtr, lpdwsaclsize: MutPtr, powner: Psid, lpdwownersize: MutPtr, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityMakeAbsoluteSD(pselfrelativesecuritydescriptor.rawAddress, pabsolutesecuritydescriptor.rawAddress, lpdwabsolutesecuritydescriptorsize.rawAddress, pdacl.rawAddress, lpdwdaclsize.rawAddress, psacl.rawAddress, lpdwsaclsize.rawAddress, powner.rawAddress, lpdwownersize.rawAddress, pprimarygroup.rawAddress, lpdwprimarygroupsize.rawAddress)

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityMakeSelfRelativeSD(pabsolutesecuritydescriptor.rawAddress, pselfrelativesecuritydescriptor.rawAddress, lpdwbufferlength.rawAddress)

public actual fun mapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr) {
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityMapGenericMask(accessmask.rawAddress, genericmapping.rawAddress)
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, psecuritydescriptor.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress, objectcreation, accessgranted, generateonclose.rawAddress)

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, psecuritydescriptor.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress, objectcreation, accessgranted, generateonclose.rawAddress)

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), privileges.rawAddress, accessgranted)

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), privileges.rawAddress, accessgranted)

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, pfresult: MutPtr): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityPrivilegeCheck(clienttoken.rawAddress, requiredprivileges.rawAddress, pfresult.rawAddress)

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(subsystemname.rawAddress, servicename.rawAddress, clienttoken.rawAddress, privileges.rawAddress, accessgranted)

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(subsystemname.rawAddress, servicename.rawAddress, clienttoken.rawAddress, privileges.rawAddress, accessgranted)

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr) {
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityQuerySecurityAccessMask(securityinformation.toInt(), desiredaccess.rawAddress)
}

public actual fun revertToSelf(): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityRevertToSelf()

public actual fun rtlConvertSidToUnicodeString(unicodestring: MutPtr, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(unicodestring.rawAddress, sid.rawAddress, allocatedestinationstring)

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress, securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress, newsecuritydescriptorlength.rawAddress, checkonly)

public actual fun setAclInformation(pacl: MutPtr, paclinformation: ConstPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetAclInformation(pacl.rawAddress, paclinformation.rawAddress, naclinformationlength.toInt(), dwaclinformationclass)

public actual fun setCachedSigningLevel(sourcefiles: ConstPtr, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetCachedSigningLevel(sourcefiles.rawAddress, sourcefilecount.toInt(), flags.toInt(), targetfile.rawAddress)

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetFileSecurityA(lpfilename.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress)

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetFileSecurityW(lpfilename.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress)

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetKernelObjectSecurity(handle.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress)

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, genericmapping: ConstPtr, token: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetPrivateObjectSecurity(securityinformation.toInt(), modificationdescriptor.rawAddress, objectssecuritydescriptor.rawAddress, genericmapping.rawAddress, token.rawAddress)

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr, token: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(securityinformation.toInt(), modificationdescriptor.rawAddress, objectssecuritydescriptor.rawAddress, autoinheritflags.toInt(), genericmapping.rawAddress, token.rawAddress)

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr) {
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityAccessMask(securityinformation.toInt(), desiredaccess.rawAddress)
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityDescriptorControl(psecuritydescriptor.rawAddress, controlbitsofinterest.toShort(), controlbitstoset.toShort())

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr, bdacldefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(psecuritydescriptor.rawAddress, bdaclpresent, pdacl.rawAddress, bdacldefaulted)

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(psecuritydescriptor.rawAddress, pgroup.rawAddress, bgroupdefaulted)

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(psecuritydescriptor.rawAddress, powner.rawAddress, bownerdefaulted)

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr): UInt =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(securitydescriptor.rawAddress, rmcontrol.rawAddress).toUInt()

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr, bsacldefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(psecuritydescriptor.rawAddress, bsaclpresent, psacl.rawAddress, bsacldefaulted)

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetTokenInformation(tokenhandle.rawAddress, tokeninformationclass, tokeninformation.rawAddress, tokeninformationlength.toInt())

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssysWindowsWin32SecuritySetUserObjectSecurity(hobj.rawAddress, psirequested.rawAddress, psid.rawAddress)
