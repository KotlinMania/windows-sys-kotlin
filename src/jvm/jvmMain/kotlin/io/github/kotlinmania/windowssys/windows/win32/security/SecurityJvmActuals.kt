@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.COpaquePointer
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
    external fun windowssys_windows_win32_security_accessCheck(psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByType(psecuritydescriptor: Long, principalselfsid: Long, clienttoken: Long, desiredaccess: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeResultList(psecuritydescriptor: Long, principalselfsid: Long, clienttoken: Long, desiredaccess: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Int, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAccessAllowedAce(pacl: Long, dwacerevision: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAccessAllowedAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAccessAllowedObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAccessDeniedAce(pacl: Long, dwacerevision: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAccessDeniedAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAccessDeniedObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAce(pacl: Long, dwacerevision: Int, dwstartingaceindex: Int, pacelist: Long, nacelistlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAuditAccessAce(pacl: Long, dwacerevision: Int, dwaccessmask: Int, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAuditAccessAceEx(pacl: Long, dwacerevision: Int, aceflags: Int, dwaccessmask: Int, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addAuditAccessObjectAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: Long, bauditsuccess: Int, bauditfailure: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addConditionalAce(pacl: Long, dwacerevision: Int, aceflags: Int, acetype: Byte, accessmask: Int, psid: Long, conditionstr: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addMandatoryAce(pacl: Long, dwacerevision: Int, aceflags: Int, mandatorypolicy: Int, plabelsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addResourceAttributeAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long, pattributeinfo: Long, preturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_addScopedPolicyIDAce(pacl: Long, dwacerevision: Int, aceflags: Int, accessmask: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_adjustTokenGroups(tokenhandle: Long, resettodefault: Int, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_adjustTokenPrivileges(tokenhandle: Long, disableallprivileges: Int, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_allocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: Byte, nsubauthority0: Int, nsubauthority1: Int, nsubauthority2: Int, nsubauthority3: Int, nsubauthority4: Int, nsubauthority5: Int, nsubauthority6: Int, nsubauthority7: Int, psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_allocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_areAllAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_areAnyAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_checkTokenCapability(tokenhandle: Long, capabilitysidtocheck: Long, hascapability: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_checkTokenMembership(tokenhandle: Long, sidtocheck: Long, ismember: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_checkTokenMembershipEx(tokenhandle: Long, sidtocheck: Long, flags: Int, ismember: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_convertToAutoInheritPrivateObjectSecurity(parentdescriptor: Long, currentsecuritydescriptor: Long, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_copySid(ndestinationsidlength: Int, pdestinationsid: Long, psourcesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_createPrivateObjectSecurity(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, isdirectoryobject: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_createPrivateObjectSecurityEx(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, objecttype: Long, iscontainerobject: Int, autoinheritflags: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: Long, creatordescriptor: Long, newdescriptor: Long, objecttypes: Long, guidcount: Int, iscontainerobject: Int, autoinheritflags: Int, token: Long, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_createRestrictedToken(existingtokenhandle: Long, flags: Int, disablesidcount: Int, sidstodisable: Long, deleteprivilegecount: Int, privilegestodelete: Long, restrictedsidcount: Int, sidstorestrict: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_createWellKnownSid(wellknownsidtype: Int, domainsid: Long, psid: Long, cbsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_deleteAce(pacl: Long, dwaceindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_deriveCapabilitySidsFromName(capname: Long, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_destroyPrivateObjectSecurity(objectdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_duplicateToken(existingtokenhandle: Long, impersonationlevel: Int, duplicatetokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_duplicateTokenEx(hexistingtoken: Long, dwdesiredaccess: Int, lptokenattributes: Long, impersonationlevel: Int, tokentype: Int, phnewtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_equalDomainSid(psid1: Long, psid2: Long, pfequal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_equalPrefixSid(psid1: Long, psid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_equalSid(psid1: Long, psid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_findFirstFreeAce(pacl: Long, pace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_freeSid(psid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_getAce(pacl: Long, dwaceindex: Int, pace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: Int, dwaclinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getAppContainerAce(acl: Long, startingaceindex: Int, appcontainerace: Long, appcontaineraceindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getCachedSigningLevel(file: Long, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getFileSecurityA(lpfilename: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getFileSecurityW(lpfilename: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getKernelObjectSecurity(handle: Long, requestedinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getLengthSid(psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getPrivateObjectSecurity(objectdescriptor: Long, securityinformation: Int, resultantdescriptor: Long, descriptorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorControl(psecuritydescriptor: Long, pcontrol: Long, lpdwrevision: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorDacl(psecuritydescriptor: Long, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorGroup(psecuritydescriptor: Long, pgroup: Long, lpbgroupdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorLength(psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorOwner(psecuritydescriptor: Long, powner: Long, lpbownerdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorRMControl(securitydescriptor: Long, rmcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSecurityDescriptorSacl(psecuritydescriptor: Long, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSidIdentifierAuthority(psid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_getSidLengthRequired(nsubauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getSidSubAuthority(psid: Long, nsubauthority: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_getSidSubAuthorityCount(psid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_getTokenInformation(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getUserObjectSecurity(hobj: Long, psirequested: Long, psid: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_getWindowsAccountDomainSid(psid: Long, pdomainsid: Long, cbdomainsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_impersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_impersonateLoggedOnUser(htoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_impersonateSelf(impersonationlevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_initializeAcl(pacl: Long, nacllength: Int, dwaclrevision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_initializeSecurityDescriptor(psecuritydescriptor: Long, dwrevision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_initializeSid(sid: Long, pidentifierauthority: Long, nsubauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isTokenRestricted(tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isValidAcl(pacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isValidSecurityDescriptor(psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isValidSid(psid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isWellKnownSid(psid: Long, wellknownsidtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_logonUserA(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_logonUserExA(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_logonUserExW(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_logonUserW(lpszusername: Long, lpszdomain: Long, lpszpassword: Long, dwlogontype: Int, dwlogonprovider: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupAccountNameA(lpsystemname: Long, lpaccountname: Long, sid: Long, cbsid: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupAccountNameW(lpsystemname: Long, lpaccountname: Long, sid: Long, cbsid: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupAccountSidA(lpsystemname: Long, sid: Long, name: Long, cchname: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupAccountSidW(lpsystemname: Long, sid: Long, name: Long, cchname: Long, referenceddomainname: Long, cchreferenceddomainname: Long, peuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupPrivilegeDisplayNameA(lpsystemname: Long, lpname: Long, lpdisplayname: Long, cchdisplayname: Long, lplanguageid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupPrivilegeDisplayNameW(lpsystemname: Long, lpname: Long, lpdisplayname: Long, cchdisplayname: Long, lplanguageid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupPrivilegeNameA(lpsystemname: Long, lpluid: Long, lpname: Long, cchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupPrivilegeNameW(lpsystemname: Long, lpluid: Long, lpname: Long, cchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupPrivilegeValueA(lpsystemname: Long, lpname: Long, lpluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_lookupPrivilegeValueW(lpsystemname: Long, lpname: Long, lpluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_makeAbsoluteSD(pselfrelativesecuritydescriptor: Long, pabsolutesecuritydescriptor: Long, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: Long, lpdwownersize: Long, pprimarygroup: Long, lpdwprimarygroupsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_makeSelfRelativeSD(pabsolutesecuritydescriptor: Long, pselfrelativesecuritydescriptor: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_mapGenericMask(accessmask: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_objectCloseAuditAlarmA(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectCloseAuditAlarmW(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectDeleteAuditAlarmA(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectDeleteAuditAlarmW(subsystemname: Long, handleid: Long, generateonclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectOpenAuditAlarmA(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Int, accessgranted: Int, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectOpenAuditAlarmW(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, psecuritydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Int, accessgranted: Int, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectPrivilegeAuditAlarmA(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_objectPrivilegeAuditAlarmW(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_privilegeCheck(clienttoken: Long, requiredprivileges: Long, pfresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_privilegedServiceAuditAlarmA(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_privilegedServiceAuditAlarmW(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_querySecurityAccessMask(securityinformation: Int, desiredaccess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_revertToSelf(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_rtlConvertSidToUnicodeString(unicodestring: Long, sid: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_rtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: Int, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_setAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: Int, dwaclinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setCachedSigningLevel(sourcefiles: Long, sourcefilecount: Int, flags: Int, targetfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setFileSecurityA(lpfilename: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setFileSecurityW(lpfilename: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setKernelObjectSecurity(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setPrivateObjectSecurity(securityinformation: Int, modificationdescriptor: Long, objectssecuritydescriptor: Long, genericmapping: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setPrivateObjectSecurityEx(securityinformation: Int, modificationdescriptor: Long, objectssecuritydescriptor: Long, autoinheritflags: Int, genericmapping: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityAccessMask(securityinformation: Int, desiredaccess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityDescriptorControl(psecuritydescriptor: Long, controlbitsofinterest: Short, controlbitstoset: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityDescriptorDacl(psecuritydescriptor: Long, bdaclpresent: Int, pdacl: Long, bdacldefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityDescriptorGroup(psecuritydescriptor: Long, pgroup: Long, bgroupdefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityDescriptorOwner(psecuritydescriptor: Long, powner: Long, bownerdefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityDescriptorRMControl(securitydescriptor: Long, rmcontrol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setSecurityDescriptorSacl(psecuritydescriptor: Long, bsaclpresent: Int, psacl: Long, bsacldefaulted: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setTokenInformation(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_setUserObjectSecurity(hobj: Long, psirequested: Long, psid: Long): Int
}

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheck((psecuritydescriptor?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (genericmapping?.value ?: 0L), (privilegeset?.value ?: 0L), (privilegesetlength?.value ?: 0L), (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L))

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckAndAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), desiredaccess.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckAndAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), desiredaccess.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByType((psecuritydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), (privilegeset?.value ?: 0L), (privilegesetlength?.value ?: 0L), (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L))

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeResultList((psecuritydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), (privilegeset?.value ?: 0L), (privilegesetlength?.value ?: 0L), (grantedaccesslist?.value ?: 0L), (accessstatuslist?.value ?: 0L))

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatuslist?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatuslist?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccesslist?.value ?: 0L), (accessstatuslist?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccesslist?.value ?: 0L), (accessstatuslist?.value ?: 0L), (pfgenerateonclose?.value ?: 0L))

public actual fun addAccessAllowedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAccessAllowedAce((pacl?.value ?: 0L), dwacerevision.toInt(), accessmask.toInt(), (psid?.value ?: 0L))

public actual fun addAccessAllowedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAccessAllowedAceEx((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L))

public actual fun addAccessAllowedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAccessAllowedObjectAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (objecttypeguid?.value ?: 0L), (inheritedobjecttypeguid?.value ?: 0L), (psid?.value ?: 0L))

public actual fun addAccessDeniedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAccessDeniedAce((pacl?.value ?: 0L), dwacerevision.toInt(), accessmask.toInt(), (psid?.value ?: 0L))

public actual fun addAccessDeniedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAccessDeniedAceEx((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L))

public actual fun addAccessDeniedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAccessDeniedObjectAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (objecttypeguid?.value ?: 0L), (inheritedobjecttypeguid?.value ?: 0L), (psid?.value ?: 0L))

public actual fun addAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: COpaquePointer?, nacelistlength: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAce((pacl?.value ?: 0L), dwacerevision.toInt(), dwstartingaceindex.toInt(), (pacelist?.value ?: 0L), nacelistlength.toInt())

public actual fun addAuditAccessAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAuditAccessAce((pacl?.value ?: 0L), dwacerevision.toInt(), dwaccessmask.toInt(), (psid?.value ?: 0L), bauditsuccess, bauditfailure)

public actual fun addAuditAccessAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAuditAccessAceEx((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), (psid?.value ?: 0L), bauditsuccess, bauditfailure)

public actual fun addAuditAccessObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addAuditAccessObjectAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (objecttypeguid?.value ?: 0L), (inheritedobjecttypeguid?.value ?: 0L), (psid?.value ?: 0L), bauditsuccess, bauditfailure)

public actual fun addConditionalAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addConditionalAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), acetype.toByte(), accessmask.toInt(), (psid?.value ?: 0L), (conditionstr?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun addMandatoryAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addMandatoryAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), (plabelsid?.value ?: 0L))

public actual fun addResourceAttributeAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: COpaquePointer?, preturnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addResourceAttributeAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L), (pattributeinfo?.value ?: 0L), (preturnlength?.value ?: 0L))

public actual fun addScopedPolicyIDAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_addScopedPolicyIDAce((pacl?.value ?: 0L), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L))

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_adjustTokenGroups((tokenhandle?.value ?: 0L), resettodefault, (newstate?.value ?: 0L), bufferlength.toInt(), (previousstate?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_adjustTokenPrivileges((tokenhandle?.value ?: 0L), disableallprivileges, (newstate?.value ?: 0L), bufferlength.toInt(), (previousstate?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun allocateAndInitializeSid(pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_allocateAndInitializeSid((pidentifierauthority?.value ?: 0L), nsubauthoritycount.toByte(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), (psid?.value ?: 0L))

public actual fun allocateLocallyUniqueId(luid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_allocateLocallyUniqueId((luid?.value ?: 0L))

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_areAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_areAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_checkTokenCapability((tokenhandle?.value ?: 0L), (capabilitysidtocheck?.value ?: 0L), (hascapability?.value ?: 0L))

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_checkTokenMembership((tokenhandle?.value ?: 0L), (sidtocheck?.value ?: 0L), (ismember?.value ?: 0L))

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_checkTokenMembershipEx((tokenhandle?.value ?: 0L), (sidtocheck?.value ?: 0L), flags.toInt(), (ismember?.value ?: 0L))

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, genericmapping: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_convertToAutoInheritPrivateObjectSecurity((parentdescriptor?.value ?: 0L), (currentsecuritydescriptor?.value ?: 0L), (newsecuritydescriptor?.value ?: 0L), (objecttype?.value ?: 0L), isdirectoryobject, (genericmapping?.value ?: 0L))

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_copySid(ndestinationsidlength.toInt(), (pdestinationsid?.value ?: 0L), (psourcesid?.value ?: 0L))

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Bool, token: Handle, genericmapping: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_createPrivateObjectSecurity((parentdescriptor?.value ?: 0L), (creatordescriptor?.value ?: 0L), (newdescriptor?.value ?: 0L), isdirectoryobject, (token?.value ?: 0L), (genericmapping?.value ?: 0L))

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_createPrivateObjectSecurityEx((parentdescriptor?.value ?: 0L), (creatordescriptor?.value ?: 0L), (newdescriptor?.value ?: 0L), (objecttype?.value ?: 0L), iscontainerobject, autoinheritflags.toInt(), (token?.value ?: 0L), (genericmapping?.value ?: 0L))

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttypes: COpaquePointer?, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_createPrivateObjectSecurityWithMultipleInheritance((parentdescriptor?.value ?: 0L), (creatordescriptor?.value ?: 0L), (newdescriptor?.value ?: 0L), (objecttypes?.value ?: 0L), guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), (token?.value ?: 0L), (genericmapping?.value ?: 0L))

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: COpaquePointer?, deleteprivilegecount: UInt, privilegestodelete: COpaquePointer?, restrictedsidcount: UInt, sidstorestrict: COpaquePointer?, newtokenhandle: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_createRestrictedToken((existingtokenhandle?.value ?: 0L), flags.toInt(), disablesidcount.toInt(), (sidstodisable?.value ?: 0L), deleteprivilegecount.toInt(), (privilegestodelete?.value ?: 0L), restrictedsidcount.toInt(), (sidstorestrict?.value ?: 0L), (newtokenhandle?.value ?: 0L))

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_createWellKnownSid(wellknownsidtype, (domainsid?.value ?: 0L), (psid?.value ?: 0L), (cbsid?.value ?: 0L))

public actual fun deleteAce(pacl: COpaquePointer?, dwaceindex: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_deleteAce((pacl?.value ?: 0L), dwaceindex.toInt())

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: COpaquePointer?, capabilitygroupsidcount: COpaquePointer?, capabilitysids: COpaquePointer?, capabilitysidcount: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_deriveCapabilitySidsFromName((capname?.value ?: 0L), (capabilitygroupsids?.value ?: 0L), (capabilitygroupsidcount?.value ?: 0L), (capabilitysids?.value ?: 0L), (capabilitysidcount?.value ?: 0L))

public actual fun destroyPrivateObjectSecurity(objectdescriptor: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_destroyPrivateObjectSecurity((objectdescriptor?.value ?: 0L))

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_duplicateToken((existingtokenhandle?.value ?: 0L), impersonationlevel, (duplicatetokenhandle?.value ?: 0L))

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: COpaquePointer?, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_duplicateTokenEx((hexistingtoken?.value ?: 0L), dwdesiredaccess.toInt(), (lptokenattributes?.value ?: 0L), impersonationlevel, tokentype, (phnewtoken?.value ?: 0L))

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_equalDomainSid((psid1?.value ?: 0L), (psid2?.value ?: 0L), (pfequal?.value ?: 0L))

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_equalPrefixSid((psid1?.value ?: 0L), (psid2?.value ?: 0L))

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_equalSid((psid1?.value ?: 0L), (psid2?.value ?: 0L))

public actual fun findFirstFreeAce(pacl: COpaquePointer?, pace: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_findFirstFreeAce((pacl?.value ?: 0L), (pace?.value ?: 0L))

public actual fun freeSid(psid: Psid): COpaquePointer? =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_freeSid((psid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getAce(pacl: COpaquePointer?, dwaceindex: UInt, pace: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getAce((pacl?.value ?: 0L), dwaceindex.toInt(), (pace?.value ?: 0L))

public actual fun getAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getAclInformation((pacl?.value ?: 0L), (paclinformation?.value ?: 0L), naclinformationlength.toInt(), dwaclinformationclass)

public actual fun getAppContainerAce(acl: COpaquePointer?, startingaceindex: UInt, appcontainerace: COpaquePointer?, appcontaineraceindex: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getAppContainerAce((acl?.value ?: 0L), startingaceindex.toInt(), (appcontainerace?.value ?: 0L), (appcontaineraceindex?.value ?: 0L))

public actual fun getCachedSigningLevel(file: Handle, flags: COpaquePointer?, signinglevel: COpaquePointer?, thumbprint: COpaquePointer?, thumbprintsize: COpaquePointer?, thumbprintalgorithm: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getCachedSigningLevel((file?.value ?: 0L), (flags?.value ?: 0L), (signinglevel?.value ?: 0L), (thumbprint?.value ?: 0L), (thumbprintsize?.value ?: 0L), (thumbprintalgorithm?.value ?: 0L))

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getFileSecurityA((lpfilename?.value ?: 0L), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getFileSecurityW((lpfilename?.value ?: 0L), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getKernelObjectSecurity((handle?.value ?: 0L), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun getLengthSid(psid: Psid): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getLengthSid((psid?.value ?: 0L)).toUInt()

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getPrivateObjectSecurity((objectdescriptor?.value ?: 0L), securityinformation.toInt(), (resultantdescriptor?.value ?: 0L), descriptorlength.toInt(), (returnlength?.value ?: 0L))

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: COpaquePointer?, lpdwrevision: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorControl((psecuritydescriptor?.value ?: 0L), (pcontrol?.value ?: 0L), (lpdwrevision?.value ?: 0L))

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: COpaquePointer?, pdacl: COpaquePointer?, lpbdacldefaulted: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorDacl((psecuritydescriptor?.value ?: 0L), (lpbdaclpresent?.value ?: 0L), (pdacl?.value ?: 0L), (lpbdacldefaulted?.value ?: 0L))

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: COpaquePointer?, lpbgroupdefaulted: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorGroup((psecuritydescriptor?.value ?: 0L), (pgroup?.value ?: 0L), (lpbgroupdefaulted?.value ?: 0L))

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorLength((psecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: COpaquePointer?, lpbownerdefaulted: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorOwner((psecuritydescriptor?.value ?: 0L), (powner?.value ?: 0L), (lpbownerdefaulted?.value ?: 0L))

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorRMControl((securitydescriptor?.value ?: 0L), (rmcontrol?.value ?: 0L)).toUInt()

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: COpaquePointer?, psacl: COpaquePointer?, lpbsacldefaulted: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSecurityDescriptorSacl((psecuritydescriptor?.value ?: 0L), (lpbsaclpresent?.value ?: 0L), (psacl?.value ?: 0L), (lpbsacldefaulted?.value ?: 0L))

public actual fun getSidIdentifierAuthority(psid: Psid): COpaquePointer? =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSidIdentifierAuthority((psid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSidLengthRequired(nsubauthoritycount.toByte()).toUInt()

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): COpaquePointer? =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSidSubAuthority((psid?.value ?: 0L), nsubauthority.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSidSubAuthorityCount(psid: Psid): COpaquePointer? =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getSidSubAuthorityCount((psid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getTokenInformation((tokenhandle?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L), tokeninformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getUserObjectSecurity((hobj?.value ?: 0L), (psirequested?.value ?: 0L), (psid?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_getWindowsAccountDomainSid((psid?.value ?: 0L), (pdomainsid?.value ?: 0L), (cbdomainsid?.value ?: 0L))

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_impersonateAnonymousToken((threadhandle?.value ?: 0L))

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_impersonateLoggedOnUser((htoken?.value ?: 0L))

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_impersonateSelf(impersonationlevel)

public actual fun initializeAcl(pacl: COpaquePointer?, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_initializeAcl((pacl?.value ?: 0L), nacllength.toInt(), dwaclrevision.toInt())

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_initializeSecurityDescriptor((psecuritydescriptor?.value ?: 0L), dwrevision.toInt())

public actual fun initializeSid(sid: Psid, pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_initializeSid((sid?.value ?: 0L), (pidentifierauthority?.value ?: 0L), nsubauthoritycount.toByte())

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_isTokenRestricted((tokenhandle?.value ?: 0L))

public actual fun isValidAcl(pacl: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_isValidAcl((pacl?.value ?: 0L))

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_isValidSecurityDescriptor((psecuritydescriptor?.value ?: 0L))

public actual fun isValidSid(psid: Psid): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_isValidSid((psid?.value ?: 0L))

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_isWellKnownSid((psid?.value ?: 0L), wellknownsidtype)

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_logonUserA((lpszusername?.value ?: 0L), (lpszdomain?.value ?: 0L), (lpszpassword?.value ?: 0L), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L))

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_logonUserExA((lpszusername?.value ?: 0L), (lpszdomain?.value ?: 0L), (lpszpassword?.value ?: 0L), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L), (pplogonsid?.value ?: 0L), (ppprofilebuffer?.value ?: 0L), (pdwprofilelength?.value ?: 0L), (pquotalimits?.value ?: 0L))

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_logonUserExW((lpszusername?.value ?: 0L), (lpszdomain?.value ?: 0L), (lpszpassword?.value ?: 0L), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L), (pplogonsid?.value ?: 0L), (ppprofilebuffer?.value ?: 0L), (pdwprofilelength?.value ?: 0L), (pquotalimits?.value ?: 0L))

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_logonUserW((lpszusername?.value ?: 0L), (lpszdomain?.value ?: 0L), (lpszpassword?.value ?: 0L), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L))

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupAccountNameA((lpsystemname?.value ?: 0L), (lpaccountname?.value ?: 0L), (sid?.value ?: 0L), (cbsid?.value ?: 0L), (referenceddomainname?.value ?: 0L), (cchreferenceddomainname?.value ?: 0L), (peuse?.value ?: 0L))

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupAccountNameW((lpsystemname?.value ?: 0L), (lpaccountname?.value ?: 0L), (sid?.value ?: 0L), (cbsid?.value ?: 0L), (referenceddomainname?.value ?: 0L), (cchreferenceddomainname?.value ?: 0L), (peuse?.value ?: 0L))

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupAccountSidA((lpsystemname?.value ?: 0L), (sid?.value ?: 0L), (name?.value ?: 0L), (cchname?.value ?: 0L), (referenceddomainname?.value ?: 0L), (cchreferenceddomainname?.value ?: 0L), (peuse?.value ?: 0L))

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupAccountSidW((lpsystemname?.value ?: 0L), (sid?.value ?: 0L), (name?.value ?: 0L), (cchname?.value ?: 0L), (referenceddomainname?.value ?: 0L), (cchreferenceddomainname?.value ?: 0L), (peuse?.value ?: 0L))

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupPrivilegeDisplayNameA((lpsystemname?.value ?: 0L), (lpname?.value ?: 0L), (lpdisplayname?.value ?: 0L), (cchdisplayname?.value ?: 0L), (lplanguageid?.value ?: 0L))

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupPrivilegeDisplayNameW((lpsystemname?.value ?: 0L), (lpname?.value ?: 0L), (lpdisplayname?.value ?: 0L), (cchdisplayname?.value ?: 0L), (lplanguageid?.value ?: 0L))

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: COpaquePointer?, lpname: Pstr, cchname: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupPrivilegeNameA((lpsystemname?.value ?: 0L), (lpluid?.value ?: 0L), (lpname?.value ?: 0L), (cchname?.value ?: 0L))

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: COpaquePointer?, lpname: Pwstr, cchname: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupPrivilegeNameW((lpsystemname?.value ?: 0L), (lpluid?.value ?: 0L), (lpname?.value ?: 0L), (cchname?.value ?: 0L))

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupPrivilegeValueA((lpsystemname?.value ?: 0L), (lpname?.value ?: 0L), (lpluid?.value ?: 0L))

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_lookupPrivilegeValueW((lpsystemname?.value ?: 0L), (lpname?.value ?: 0L), (lpluid?.value ?: 0L))

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: COpaquePointer?, pdacl: COpaquePointer?, lpdwdaclsize: COpaquePointer?, psacl: COpaquePointer?, lpdwsaclsize: COpaquePointer?, powner: Psid, lpdwownersize: COpaquePointer?, pprimarygroup: Psid, lpdwprimarygroupsize: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_makeAbsoluteSD((pselfrelativesecuritydescriptor?.value ?: 0L), (pabsolutesecuritydescriptor?.value ?: 0L), (lpdwabsolutesecuritydescriptorsize?.value ?: 0L), (pdacl?.value ?: 0L), (lpdwdaclsize?.value ?: 0L), (psacl?.value ?: 0L), (lpdwsaclsize?.value ?: 0L), (powner?.value ?: 0L), (lpdwownersize?.value ?: 0L), (pprimarygroup?.value ?: 0L), (lpdwprimarygroupsize?.value ?: 0L))

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_makeSelfRelativeSD((pabsolutesecuritydescriptor?.value ?: 0L), (pselfrelativesecuritydescriptor?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun mapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_mapGenericMask((accessmask?.value ?: 0L), (genericmapping?.value ?: 0L))
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectCloseAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectCloseAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectDeleteAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectDeleteAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectOpenAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (psecuritydescriptor?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L), objectcreation, accessgranted, (generateonclose?.value ?: 0L))

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectOpenAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (psecuritydescriptor?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L), objectcreation, accessgranted, (generateonclose?.value ?: 0L))

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectPrivilegeAuditAlarmA((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (privileges?.value ?: 0L), accessgranted)

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_objectPrivilegeAuditAlarmW((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (privileges?.value ?: 0L), accessgranted)

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, pfresult: COpaquePointer?): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_privilegeCheck((clienttoken?.value ?: 0L), (requiredprivileges?.value ?: 0L), (pfresult?.value ?: 0L))

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_privilegedServiceAuditAlarmA((subsystemname?.value ?: 0L), (servicename?.value ?: 0L), (clienttoken?.value ?: 0L), (privileges?.value ?: 0L), accessgranted)

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_privilegedServiceAuditAlarmW((subsystemname?.value ?: 0L), (servicename?.value ?: 0L), (clienttoken?.value ?: 0L), (privileges?.value ?: 0L), accessgranted)

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?) {
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_querySecurityAccessMask(securityinformation.toInt(), (desiredaccess?.value ?: 0L))
}

public actual fun revertToSelf(): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_revertToSelf()

public actual fun rtlConvertSidToUnicodeString(unicodestring: COpaquePointer?, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_rtlConvertSidToUnicodeString((unicodestring?.value ?: 0L), (sid?.value ?: 0L), allocatedestinationstring)

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_rtlNormalizeSecurityDescriptor((securitydescriptor?.value ?: 0L), securitydescriptorlength.toInt(), (newsecuritydescriptor?.value ?: 0L), (newsecuritydescriptorlength?.value ?: 0L), checkonly)

public actual fun setAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setAclInformation((pacl?.value ?: 0L), (paclinformation?.value ?: 0L), naclinformationlength.toInt(), dwaclinformationclass)

public actual fun setCachedSigningLevel(sourcefiles: COpaquePointer?, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setCachedSigningLevel((sourcefiles?.value ?: 0L), sourcefilecount.toInt(), flags.toInt(), (targetfile?.value ?: 0L))

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setFileSecurityA((lpfilename?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setFileSecurityW((lpfilename?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setKernelObjectSecurity((handle?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, genericmapping: COpaquePointer?, token: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setPrivateObjectSecurity(securityinformation.toInt(), (modificationdescriptor?.value ?: 0L), (objectssecuritydescriptor?.value ?: 0L), (genericmapping?.value ?: 0L), (token?.value ?: 0L))

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: SecurityAutoInheritFlags, genericmapping: COpaquePointer?, token: Handle): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setPrivateObjectSecurityEx(securityinformation.toInt(), (modificationdescriptor?.value ?: 0L), (objectssecuritydescriptor?.value ?: 0L), autoinheritflags.toInt(), (genericmapping?.value ?: 0L), (token?.value ?: 0L))

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?) {
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityAccessMask(securityinformation.toInt(), (desiredaccess?.value ?: 0L))
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityDescriptorControl((psecuritydescriptor?.value ?: 0L), controlbitsofinterest.toShort(), controlbitstoset.toShort())

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: COpaquePointer?, bdacldefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityDescriptorDacl((psecuritydescriptor?.value ?: 0L), bdaclpresent, (pdacl?.value ?: 0L), bdacldefaulted)

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityDescriptorGroup((psecuritydescriptor?.value ?: 0L), (pgroup?.value ?: 0L), bgroupdefaulted)

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityDescriptorOwner((psecuritydescriptor?.value ?: 0L), (powner?.value ?: 0L), bownerdefaulted)

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityDescriptorRMControl((securitydescriptor?.value ?: 0L), (rmcontrol?.value ?: 0L)).toUInt()

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: COpaquePointer?, bsacldefaulted: Bool): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setSecurityDescriptorSacl((psecuritydescriptor?.value ?: 0L), bsaclpresent, (psacl?.value ?: 0L), bsacldefaulted)

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setTokenInformation((tokenhandle?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L), tokeninformationlength.toInt())

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor): Bool =
    WindowsWin32SecurityJniBridge.windowssys_windows_win32_security_setUserObjectSecurity((hobj?.value ?: 0L), (psirequested?.value ?: 0L), (psid?.value ?: 0L))
