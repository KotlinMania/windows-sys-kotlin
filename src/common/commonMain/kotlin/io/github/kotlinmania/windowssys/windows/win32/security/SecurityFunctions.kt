package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

public expect fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>): Bool

public expect fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>): Bool

public expect fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccesslist: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccesslist: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccesslist: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool

public expect fun addAccessAllowedAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessAllowedAceEx(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessAllowedObjectAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr<Guid>, inheritedobjecttypeguid: ConstPtr<Guid>, psid: Psid): Bool

public expect fun addAccessDeniedAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessDeniedAceEx(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun addAccessDeniedObjectAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr<Guid>, inheritedobjecttypeguid: ConstPtr<Guid>, psid: Psid): Bool

public expect fun addAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr<CVoid>, nacelistlength: UInt): Bool

public expect fun addAuditAccessAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addAuditAccessAceEx(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addAuditAccessObjectAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr<Guid>, inheritedobjecttypeguid: ConstPtr<Guid>, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool

public expect fun addConditionalAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr<UInt>): Bool

public expect fun addMandatoryAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool

public expect fun addResourceAttributeAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr<ClaimSecurityAttributesInformation>, preturnlength: MutPtr<UInt>): Bool

public expect fun addScopedPolicyIDAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool

public expect fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Bool

public expect fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Bool

public expect fun allocateAndInitializeSid(pidentifierauthority: ConstPtr<SidIdentifierAuthority>, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr<Psid>): Bool

public expect fun allocateLocallyUniqueId(luid: MutPtr<Luid>): Bool

public expect fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool

public expect fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool

public expect fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr<Bool>): Bool

public expect fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr<Bool>): Bool

public expect fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr<Bool>): Bool

public expect fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, genericmapping: ConstPtr<GenericMapping>): Bool

public expect fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool

public expect fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr<GenericMapping>): Bool

public expect fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr<GenericMapping>): Bool

public expect fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttypes: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr<GenericMapping>): Bool

public expect fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr<SidAndAttributes>, deleteprivilegecount: UInt, privilegestodelete: ConstPtr<LuidAndAttributes>, restrictedsidcount: UInt, sidstorestrict: ConstPtr<SidAndAttributes>, newtokenhandle: MutPtr<Handle>): Bool

public expect fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr<UInt>): Bool

public expect fun deleteAce(pacl: MutPtr<Acl>, dwaceindex: UInt): Bool

public expect fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr<MutPtr<Psid>>, capabilitygroupsidcount: MutPtr<UInt>, capabilitysids: MutPtr<MutPtr<Psid>>, capabilitysidcount: MutPtr<UInt>): Bool

public expect fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr<PsecurityDescriptor>): Bool

public expect fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr<Handle>): Bool

public expect fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr<SecurityAttributes>, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr<Handle>): Bool

public expect fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr<Bool>): Bool

public expect fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool

public expect fun equalSid(psid1: Psid, psid2: Psid): Bool

public expect fun findFirstFreeAce(pacl: ConstPtr<Acl>, pace: MutPtr<MutPtr<CVoid>>): Bool

public expect fun freeSid(psid: Psid): MutPtr<CVoid>

public expect fun getAce(pacl: ConstPtr<Acl>, dwaceindex: UInt, pace: MutPtr<MutPtr<CVoid>>): Bool

public expect fun getAclInformation(pacl: ConstPtr<Acl>, paclinformation: MutPtr<CVoid>, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool

public expect fun getAppContainerAce(acl: ConstPtr<Acl>, startingaceindex: UInt, appcontainerace: MutPtr<MutPtr<CVoid>>, appcontaineraceindex: MutPtr<UInt>): Bool

public expect fun getCachedSigningLevel(file: Handle, flags: MutPtr<UInt>, signinglevel: MutPtr<UInt>, thumbprint: MutPtr<UByte>, thumbprintsize: MutPtr<UInt>, thumbprintalgorithm: MutPtr<UInt>): Bool

public expect fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun getLengthSid(psid: Psid): UInt

public expect fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr<UInt>): Bool

public expect fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr<UShort>, lpdwrevision: MutPtr<UInt>): Bool

public expect fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr<Bool>, pdacl: MutPtr<MutPtr<Acl>>, lpbdacldefaulted: MutPtr<Bool>): Bool

public expect fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr<Psid>, lpbgroupdefaulted: MutPtr<Bool>): Bool

public expect fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt

public expect fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr<Psid>, lpbownerdefaulted: MutPtr<Bool>): Bool

public expect fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr<UByte>): UInt

public expect fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr<Bool>, psacl: MutPtr<MutPtr<Acl>>, lpbsacldefaulted: MutPtr<Bool>): Bool

public expect fun getSidIdentifierAuthority(psid: Psid): MutPtr<SidIdentifierAuthority>

public expect fun getSidLengthRequired(nsubauthoritycount: UByte): UInt

public expect fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr<UInt>

public expect fun getSidSubAuthorityCount(psid: Psid): MutPtr<UByte>

public expect fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Bool

public expect fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr<UInt>, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr<UInt>): Bool

public expect fun impersonateAnonymousToken(threadhandle: Handle): Bool

public expect fun impersonateLoggedOnUser(htoken: Handle): Bool

public expect fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool

public expect fun initializeAcl(pacl: MutPtr<Acl>, nacllength: UInt, dwaclrevision: AceRevision): Bool

public expect fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool

public expect fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr<SidIdentifierAuthority>, nsubauthoritycount: UByte): Bool

public expect fun isTokenRestricted(tokenhandle: Handle): Bool

public expect fun isValidAcl(pacl: ConstPtr<Acl>): Bool

public expect fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun isValidSid(psid: Psid): Bool

public expect fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool

public expect fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>): Bool

public expect fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>, pplogonsid: MutPtr<Psid>, ppprofilebuffer: MutPtr<MutPtr<CVoid>>, pdwprofilelength: MutPtr<UInt>, pquotalimits: MutPtr<QuotaLimits>): Bool

public expect fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>, pplogonsid: MutPtr<Psid>, ppprofilebuffer: MutPtr<MutPtr<CVoid>>, pdwprofilelength: MutPtr<UInt>, pquotalimits: MutPtr<QuotaLimits>): Bool

public expect fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>): Bool

public expect fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr<UInt>, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool

public expect fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr<UInt>, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool

public expect fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr<UInt>, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool

public expect fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr<UInt>, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool

public expect fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr<UInt>, lplanguageid: MutPtr<UInt>): Bool

public expect fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr<UInt>, lplanguageid: MutPtr<UInt>): Bool

public expect fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr<Luid>, lpname: Pstr, cchname: MutPtr<UInt>): Bool

public expect fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr<Luid>, lpname: Pwstr, cchname: MutPtr<UInt>): Bool

public expect fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr<Luid>): Bool

public expect fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr<Luid>): Bool

public expect fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr<UInt>, pdacl: MutPtr<Acl>, lpdwdaclsize: MutPtr<UInt>, psacl: MutPtr<Acl>, lpdwsaclsize: MutPtr<UInt>, powner: Psid, lpdwownersize: MutPtr<UInt>, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr<UInt>): Bool

public expect fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun mapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>)

public expect fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool

public expect fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool

public expect fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool

public expect fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool

public expect fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr<Bool>): Bool

public expect fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr<Bool>): Bool

public expect fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool

public expect fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool

public expect fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, pfresult: MutPtr<Bool>): Bool

public expect fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool

public expect fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool

public expect fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr<UInt>)

public expect fun revertToSelf(): Bool

public expect fun rtlConvertSidToUnicodeString(unicodestring: MutPtr<UnicodeString>, sid: Psid, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean

public expect fun setAclInformation(pacl: MutPtr<Acl>, paclinformation: ConstPtr<CVoid>, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool

public expect fun setCachedSigningLevel(sourcefiles: ConstPtr<Handle>, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool

public expect fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool

public expect fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, genericmapping: ConstPtr<GenericMapping>, token: Handle): Bool

public expect fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr<GenericMapping>, token: Handle): Bool

public expect fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr<UInt>)

public expect fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool

public expect fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr<Acl>, bdacldefaulted: Bool): Bool

public expect fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool

public expect fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool

public expect fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr<UByte>): UInt

public expect fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr<Acl>, bsacldefaulted: Bool): Bool

public expect fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Bool

public expect fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr<ObjectSecurityInformation>, psid: PsecurityDescriptor): Bool
