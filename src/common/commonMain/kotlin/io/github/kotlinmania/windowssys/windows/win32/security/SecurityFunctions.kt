package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool

public expect fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool

public expect fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool

public expect fun addAccessAllowedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessAllowedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessAllowedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool

public expect fun addAccessDeniedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessDeniedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessDeniedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool

public expect fun addAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: COpaquePointer?, nacelistlength: UInt): Bool

public expect fun addAuditAccessAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addAuditAccessAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addAuditAccessObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addConditionalAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: COpaquePointer?): Bool

public expect fun addMandatoryAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool

public expect fun addResourceAttributeAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: COpaquePointer?, preturnlength: COpaquePointer?): Bool

public expect fun addScopedPolicyIDAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool

public expect fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool

public expect fun allocateAndInitializeSid(pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: COpaquePointer?): Bool

public expect fun allocateLocallyUniqueId(luid: COpaquePointer?): Bool

public expect fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool

public expect fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool

public expect fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: COpaquePointer?): Bool

public expect fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: COpaquePointer?): Bool

public expect fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: COpaquePointer?): Bool

public expect fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, genericmapping: COpaquePointer?): Bool

public expect fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool

public expect fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Bool, token: Handle, genericmapping: COpaquePointer?): Bool

public expect fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool

public expect fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttypes: COpaquePointer?, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool

public expect fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: COpaquePointer?, deleteprivilegecount: UInt, privilegestodelete: COpaquePointer?, restrictedsidcount: UInt, sidstorestrict: COpaquePointer?, newtokenhandle: COpaquePointer?): Bool

public expect fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: COpaquePointer?): Bool

public expect fun deleteAce(pacl: COpaquePointer?, dwaceindex: UInt): Bool

public expect fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: COpaquePointer?, capabilitygroupsidcount: COpaquePointer?, capabilitysids: COpaquePointer?, capabilitysidcount: COpaquePointer?): Bool

public expect fun destroyPrivateObjectSecurity(objectdescriptor: COpaquePointer?): Bool

public expect fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: COpaquePointer?): Bool

public expect fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: COpaquePointer?, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: COpaquePointer?): Bool

public expect fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: COpaquePointer?): Bool

public expect fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool

public expect fun equalSid(psid1: Psid, psid2: Psid): Bool

public expect fun findFirstFreeAce(pacl: COpaquePointer?, pace: COpaquePointer?): Bool

public expect fun freeSid(psid: Psid): COpaquePointer?

public expect fun getAce(pacl: COpaquePointer?, dwaceindex: UInt, pace: COpaquePointer?): Bool

public expect fun getAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool

public expect fun getAppContainerAce(acl: COpaquePointer?, startingaceindex: UInt, appcontainerace: COpaquePointer?, appcontaineraceindex: COpaquePointer?): Bool

public expect fun getCachedSigningLevel(file: Handle, flags: COpaquePointer?, signinglevel: COpaquePointer?, thumbprint: COpaquePointer?, thumbprintsize: COpaquePointer?, thumbprintalgorithm: COpaquePointer?): Bool

public expect fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool

public expect fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool

public expect fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool

public expect fun getLengthSid(psid: Psid): UInt

public expect fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: COpaquePointer?): Bool

public expect fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: COpaquePointer?, lpdwrevision: COpaquePointer?): Bool

public expect fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: COpaquePointer?, pdacl: COpaquePointer?, lpbdacldefaulted: COpaquePointer?): Bool

public expect fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: COpaquePointer?, lpbgroupdefaulted: COpaquePointer?): Bool

public expect fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt

public expect fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: COpaquePointer?, lpbownerdefaulted: COpaquePointer?): Bool

public expect fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt

public expect fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: COpaquePointer?, psacl: COpaquePointer?, lpbsacldefaulted: COpaquePointer?): Bool

public expect fun getSidIdentifierAuthority(psid: Psid): COpaquePointer?

public expect fun getSidLengthRequired(nsubauthoritycount: UByte): UInt

public expect fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): COpaquePointer?

public expect fun getSidSubAuthorityCount(psid: Psid): COpaquePointer?

public expect fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Bool

public expect fun getUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool

public expect fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: COpaquePointer?): Bool

public expect fun impersonateAnonymousToken(threadhandle: Handle): Bool

public expect fun impersonateLoggedOnUser(htoken: Handle): Bool

public expect fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool

public expect fun initializeAcl(pacl: COpaquePointer?, nacllength: UInt, dwaclrevision: AceRevision): Bool

public expect fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool

public expect fun initializeSid(sid: Psid, pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte): Bool

public expect fun isTokenRestricted(tokenhandle: Handle): Bool

public expect fun isValidAcl(pacl: COpaquePointer?): Bool

public expect fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun isValidSid(psid: Psid): Bool

public expect fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool

public expect fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool

public expect fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool

public expect fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool

public expect fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool

public expect fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool

public expect fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool

public expect fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool

public expect fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool

public expect fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool

public expect fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool

public expect fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: COpaquePointer?, lpname: Pstr, cchname: COpaquePointer?): Bool

public expect fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: COpaquePointer?, lpname: Pwstr, cchname: COpaquePointer?): Bool

public expect fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: COpaquePointer?): Bool

public expect fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: COpaquePointer?): Bool

public expect fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: COpaquePointer?, pdacl: COpaquePointer?, lpdwdaclsize: COpaquePointer?, psacl: COpaquePointer?, lpdwsaclsize: COpaquePointer?, powner: Psid, lpdwownersize: COpaquePointer?, pprimarygroup: Psid, lpdwprimarygroupsize: COpaquePointer?): Bool

public expect fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: COpaquePointer?): Bool

public expect fun mapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?)

public expect fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool

public expect fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool

public expect fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool

public expect fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool

public expect fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool

public expect fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool

public expect fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool

public expect fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool

public expect fun privilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, pfresult: COpaquePointer?): Bool

public expect fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool

public expect fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool

public expect fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?)

public expect fun revertToSelf(): Bool

public expect fun rtlConvertSidToUnicodeString(unicodestring: COpaquePointer?, sid: Psid, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean

public expect fun setAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool

public expect fun setCachedSigningLevel(sourcefiles: COpaquePointer?, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool

public expect fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool

public expect fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, genericmapping: COpaquePointer?, token: Handle): Bool

public expect fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: SecurityAutoInheritFlags, genericmapping: COpaquePointer?, token: Handle): Bool

public expect fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?)

public expect fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool

public expect fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: COpaquePointer?, bdacldefaulted: Bool): Bool

public expect fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool

public expect fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool

public expect fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt

public expect fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: COpaquePointer?, bsacldefaulted: Bool): Bool

public expect fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Bool

public expect fun setUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor): Bool
