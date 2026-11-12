package io.github.kotlinmania.windowssys.windows.win32.security.authorization

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.AceFlags
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public expect fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr<PsecurityDescriptor>, optionalsecuritydescriptorcount: UInt, preply: MutPtr<AuthzAccessReply>, phaccesscheckresults: MutPtr<AuthzAccessCheckResultsHandle>): Bool

public expect fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr<SidAndAttributes>, sidcount: UInt, restrictedsids: ConstPtr<SidAndAttributes>, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool

public expect fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, preply: MutPtr<AuthzAccessReply>): Bool

public expect fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr<AuthzSourceSchemaRegistration>, pdwcount: MutPtr<UInt>, pdwlength: MutPtr<UInt>): Bool

public expect fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, sacl: ConstPtr<Acl>, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr<Bool>): Bool

public expect fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool

public expect fun authzFreeCentralAccessPolicyCache(): Bool

public expect fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool

public expect fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool

public expect fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool

public expect fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool

public expect fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr<AuthzClientContextHandle>): Bool

public expect fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phnewauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool

public expect fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool

public expect fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool

public expect fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr<AuthzAuditEventHandle>, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr<AuthzAuditEventHandle>, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr<AuthzRpcInitInfoClient>, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool

public expect fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool

public expect fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr<AuthzInitInfo>, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool

public expect fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr<AuthzSourceSchemaRegistration>): Bool

public expect fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr<AuthzSecurityAttributeOperation>, pclaims: ConstPtr<AuthzSecurityAttributesInformation>): Bool

public expect fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr<AuthzSecurityAttributeOperation>, pattributes: ConstPtr<AuthzSecurityAttributesInformation>): Bool

public expect fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr<AuthzSidOperation>, psids: ConstPtr<TokenGroups>): Bool

public expect fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr<PsecurityDescriptor>, optionalsecuritydescriptorcount: UInt, preply: ConstPtr<AuthzAccessReply>): Bool

public expect fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr<AuthzCapChangeSubscriptionHandle>, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr<CVoid>): Bool

public expect fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr<AuthzSecurityEventProviderHandle>): Bool

public expect fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr<AuditParams>): Bool

public expect fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr<SidAndAttributes>): Bool

public expect fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool

public expect fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool

public expect fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr<AuthzSecurityEventProviderHandle>): Bool

public expect fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr<ExplicitAccessA>, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags)

public expect fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr<ExplicitAccessW>, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags)

public expect fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr<ExplicitAccessA>, ptrusteename: Pcstr, ptrustee: ConstPtr<TrusteeA>, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt)

public expect fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr<ExplicitAccessW>, ptrusteename: Pcwstr, ptrustee: ConstPtr<TrusteeW>, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt)

public expect fun buildImpersonateTrusteeA(ptrustee: MutPtr<TrusteeA>, pimpersonatetrustee: ConstPtr<TrusteeA>)

public expect fun buildImpersonateTrusteeW(ptrustee: MutPtr<TrusteeW>, pimpersonatetrustee: ConstPtr<TrusteeW>)

public expect fun buildSecurityDescriptorA(powner: ConstPtr<TrusteeA>, pgroup: ConstPtr<TrusteeA>, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr<ExplicitAccessA>, ccountofauditentries: UInt, plistofauditentries: ConstPtr<ExplicitAccessA>, poldsd: PsecurityDescriptor, psizenewsd: MutPtr<UInt>, pnewsd: MutPtr<PsecurityDescriptor>): Win32Error

public expect fun buildSecurityDescriptorW(powner: ConstPtr<TrusteeW>, pgroup: ConstPtr<TrusteeW>, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr<ExplicitAccessW>, ccountofauditentries: UInt, plistofauditentries: ConstPtr<ExplicitAccessW>, poldsd: PsecurityDescriptor, psizenewsd: MutPtr<UInt>, pnewsd: MutPtr<PsecurityDescriptor>): Win32Error

public expect fun buildTrusteeWithNameA(ptrustee: MutPtr<TrusteeA>, pname: Pcstr)

public expect fun buildTrusteeWithNameW(ptrustee: MutPtr<TrusteeW>, pname: Pcwstr)

public expect fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr<TrusteeA>, pobjname: ConstPtr<ObjectsAndNameA>, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr)

public expect fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr<TrusteeW>, pobjname: ConstPtr<ObjectsAndNameW>, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr)

public expect fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr<TrusteeA>, pobjsid: ConstPtr<ObjectsAndSid>, pobjectguid: ConstPtr<Guid>, pinheritedobjectguid: ConstPtr<Guid>, psid: Psid)

public expect fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr<TrusteeW>, pobjsid: ConstPtr<ObjectsAndSid>, pobjectguid: ConstPtr<Guid>, pinheritedobjectguid: ConstPtr<Guid>, psid: Psid)

public expect fun buildTrusteeWithSidA(ptrustee: MutPtr<TrusteeA>, psid: Psid)

public expect fun buildTrusteeWithSidW(ptrustee: MutPtr<TrusteeW>, psid: Psid)

public expect fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr<Pstr>, stringsecuritydescriptorlen: MutPtr<UInt>): Bool

public expect fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr<Pwstr>, stringsecuritydescriptorlen: MutPtr<UInt>): Bool

public expect fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr<Pstr>): Bool

public expect fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr<Pwstr>): Bool

public expect fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorsize: MutPtr<UInt>): Bool

public expect fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorsize: MutPtr<UInt>): Bool

public expect fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr<Psid>): Bool

public expect fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr<Psid>): Bool

public expect fun freeInheritedFromArray(pinheritarray: ConstPtr<InheritedFromw>, acecnt: UShort, pfnarray: ConstPtr<FnObjectMgrFuncts>): Win32Error

public expect fun getAuditedPermissionsFromAclA(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeA>, psuccessfulauditedrights: MutPtr<UInt>, pfailedauditrights: MutPtr<UInt>): Win32Error

public expect fun getAuditedPermissionsFromAclW(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeW>, psuccessfulauditedrights: MutPtr<UInt>, pfailedauditrights: MutPtr<UInt>): Win32Error

public expect fun getEffectiveRightsFromAclA(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeA>, paccessrights: MutPtr<UInt>): Win32Error

public expect fun getEffectiveRightsFromAclW(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeW>, paccessrights: MutPtr<UInt>): Win32Error

public expect fun getExplicitEntriesFromAclA(pacl: ConstPtr<Acl>, pccountofexplicitentries: MutPtr<UInt>, plistofexplicitentries: MutPtr<MutPtr<ExplicitAccessA>>): Win32Error

public expect fun getExplicitEntriesFromAclW(pacl: ConstPtr<Acl>, pccountofexplicitentries: MutPtr<UInt>, plistofexplicitentries: MutPtr<MutPtr<ExplicitAccessW>>): Win32Error

public expect fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, pacl: ConstPtr<Acl>, pfnarray: ConstPtr<FnObjectMgrFuncts>, pgenericmapping: ConstPtr<GenericMapping>, pinheritarray: MutPtr<InheritedFroma>): Win32Error

public expect fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, pacl: ConstPtr<Acl>, pfnarray: ConstPtr<FnObjectMgrFuncts>, pgenericmapping: ConstPtr<GenericMapping>, pinheritarray: MutPtr<InheritedFromw>): Win32Error

public expect fun getMultipleTrusteeA(ptrustee: ConstPtr<TrusteeA>): MutPtr<TrusteeA>

public expect fun getMultipleTrusteeOperationA(ptrustee: ConstPtr<TrusteeA>): MultipleTrusteeOperation

public expect fun getMultipleTrusteeOperationW(ptrustee: ConstPtr<TrusteeW>): MultipleTrusteeOperation

public expect fun getMultipleTrusteeW(ptrustee: ConstPtr<TrusteeW>): MutPtr<TrusteeW>

public expect fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error

public expect fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error

public expect fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error

public expect fun getTrusteeFormA(ptrustee: ConstPtr<TrusteeA>): TrusteeForm

public expect fun getTrusteeFormW(ptrustee: ConstPtr<TrusteeW>): TrusteeForm

public expect fun getTrusteeNameA(ptrustee: ConstPtr<TrusteeA>): Pstr

public expect fun getTrusteeNameW(ptrustee: ConstPtr<TrusteeW>): Pwstr

public expect fun getTrusteeTypeA(ptrustee: ConstPtr<TrusteeA>): TrusteeType

public expect fun getTrusteeTypeW(ptrustee: ConstPtr<TrusteeW>): TrusteeType

public expect fun lookupSecurityDescriptorPartsA(ppowner: MutPtr<MutPtr<TrusteeA>>, ppgroup: MutPtr<MutPtr<TrusteeA>>, pccountofaccessentries: MutPtr<UInt>, pplistofaccessentries: MutPtr<MutPtr<ExplicitAccessA>>, pccountofauditentries: MutPtr<UInt>, pplistofauditentries: MutPtr<MutPtr<ExplicitAccessA>>, psd: PsecurityDescriptor): Win32Error

public expect fun lookupSecurityDescriptorPartsW(ppowner: MutPtr<MutPtr<TrusteeW>>, ppgroup: MutPtr<MutPtr<TrusteeW>>, pccountofaccessentries: MutPtr<UInt>, pplistofaccessentries: MutPtr<MutPtr<ExplicitAccessW>>, pccountofauditentries: MutPtr<UInt>, pplistofauditentries: MutPtr<MutPtr<ExplicitAccessW>>, psd: PsecurityDescriptor): Win32Error

public expect fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr<ExplicitAccessA>, oldacl: ConstPtr<Acl>, newacl: MutPtr<MutPtr<Acl>>): Win32Error

public expect fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr<ExplicitAccessW>, oldacl: ConstPtr<Acl>, newacl: MutPtr<MutPtr<Acl>>): Win32Error

public expect fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error

public expect fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error

public expect fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error

public expect fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error

public expect fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error

public expect fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error

public expect fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error
