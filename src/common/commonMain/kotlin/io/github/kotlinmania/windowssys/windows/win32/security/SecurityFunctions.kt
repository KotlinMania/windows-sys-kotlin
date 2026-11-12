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

public expect fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool

public expect fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool

public expect fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccesslist: MutPtr, accessstatuslist: MutPtr): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool

public expect fun addAccessAllowedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessAllowedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessAllowedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool

public expect fun addAccessDeniedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessDeniedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessDeniedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool

public expect fun addAce(pacl: MutPtr, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr, nacelistlength: UInt): Bool

public expect fun addAuditAccessAce(pacl: MutPtr, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addAuditAccessAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addAuditAccessObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addConditionalAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr): Bool

public expect fun addMandatoryAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool

public expect fun addResourceAttributeAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr, preturnlength: MutPtr): Bool

public expect fun addScopedPolicyIDAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool

public expect fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool

public expect fun allocateAndInitializeSid(pidentifierauthority: ConstPtr, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr): Bool

public expect fun allocateLocallyUniqueId(luid: MutPtr): Bool

public expect fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool

public expect fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool

public expect fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr): Bool

public expect fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr): Bool

public expect fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr): Bool

public expect fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, genericmapping: ConstPtr): Bool

public expect fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool

public expect fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr): Bool

public expect fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool

public expect fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttypes: ConstPtr, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool

public expect fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr, deleteprivilegecount: UInt, privilegestodelete: ConstPtr, restrictedsidcount: UInt, sidstorestrict: ConstPtr, newtokenhandle: MutPtr): Bool

public expect fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr): Bool

public expect fun deleteAce(pacl: MutPtr, dwaceindex: UInt): Bool

public expect fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr, capabilitygroupsidcount: MutPtr, capabilitysids: MutPtr, capabilitysidcount: MutPtr): Bool

public expect fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr): Bool

public expect fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr): Bool

public expect fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr): Bool

public expect fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr): Bool

public expect fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool

public expect fun equalSid(psid1: Psid, psid2: Psid): Bool

public expect fun findFirstFreeAce(pacl: ConstPtr, pace: MutPtr): Bool

public expect fun freeSid(psid: Psid): MutPtr

public expect fun getAce(pacl: ConstPtr, dwaceindex: UInt, pace: MutPtr): Bool

public expect fun getAclInformation(pacl: ConstPtr, paclinformation: MutPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool

public expect fun getAppContainerAce(acl: ConstPtr, startingaceindex: UInt, appcontainerace: MutPtr, appcontaineraceindex: MutPtr): Bool

public expect fun getCachedSigningLevel(file: Handle, flags: MutPtr, signinglevel: MutPtr, thumbprint: MutPtr, thumbprintsize: MutPtr, thumbprintalgorithm: MutPtr): Bool

public expect fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool

public expect fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool

public expect fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool

public expect fun getLengthSid(psid: Psid): UInt

public expect fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr): Bool

public expect fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr, lpdwrevision: MutPtr): Bool

public expect fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr, pdacl: MutPtr, lpbdacldefaulted: MutPtr): Bool

public expect fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr, lpbgroupdefaulted: MutPtr): Bool

public expect fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt

public expect fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr, lpbownerdefaulted: MutPtr): Bool

public expect fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr): UInt

public expect fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr, psacl: MutPtr, lpbsacldefaulted: MutPtr): Bool

public expect fun getSidIdentifierAuthority(psid: Psid): MutPtr

public expect fun getSidLengthRequired(nsubauthoritycount: UByte): UInt

public expect fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr

public expect fun getSidSubAuthorityCount(psid: Psid): MutPtr

public expect fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Bool

public expect fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool

public expect fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr): Bool

public expect fun impersonateAnonymousToken(threadhandle: Handle): Bool

public expect fun impersonateLoggedOnUser(htoken: Handle): Bool

public expect fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool

public expect fun initializeAcl(pacl: MutPtr, nacllength: UInt, dwaclrevision: AceRevision): Bool

public expect fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool

public expect fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr, nsubauthoritycount: UByte): Bool

public expect fun isTokenRestricted(tokenhandle: Handle): Bool

public expect fun isValidAcl(pacl: ConstPtr): Bool

public expect fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun isValidSid(psid: Psid): Bool

public expect fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool

public expect fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool

public expect fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool

public expect fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool

public expect fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool

public expect fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool

public expect fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool

public expect fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool

public expect fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool

public expect fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool

public expect fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool

public expect fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr, lpname: Pstr, cchname: MutPtr): Bool

public expect fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr, lpname: Pwstr, cchname: MutPtr): Bool

public expect fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr): Bool

public expect fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr): Bool

public expect fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr, pdacl: MutPtr, lpdwdaclsize: MutPtr, psacl: MutPtr, lpdwsaclsize: MutPtr, powner: Psid, lpdwownersize: MutPtr, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr): Bool

public expect fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr): Bool

public expect fun mapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr)

public expect fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool

public expect fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool

public expect fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool

public expect fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool

public expect fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool

public expect fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool

public expect fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool

public expect fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool

public expect fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, pfresult: MutPtr): Bool

public expect fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool

public expect fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool

public expect fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr)

public expect fun revertToSelf(): Bool

public expect fun rtlConvertSidToUnicodeString(unicodestring: MutPtr, sid: Psid, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean

public expect fun setAclInformation(pacl: MutPtr, paclinformation: ConstPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool

public expect fun setCachedSigningLevel(sourcefiles: ConstPtr, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool

public expect fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool

public expect fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, genericmapping: ConstPtr, token: Handle): Bool

public expect fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr, token: Handle): Bool

public expect fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr)

public expect fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool

public expect fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr, bdacldefaulted: Bool): Bool

public expect fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool

public expect fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool

public expect fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr): UInt

public expect fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr, bsacldefaulted: Bool): Bool

public expect fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Bool

public expect fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor): Bool
