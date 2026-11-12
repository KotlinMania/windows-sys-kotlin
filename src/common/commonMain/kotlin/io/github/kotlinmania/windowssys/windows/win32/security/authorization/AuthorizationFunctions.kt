package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.AceFlags
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public expect fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: MutPtr, phaccesscheckresults: MutPtr): Bool

public expect fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr, sidcount: UInt, restrictedsids: ConstPtr, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr): Bool

public expect fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, preply: MutPtr): Bool

public expect fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr, pdwcount: MutPtr, pdwlength: MutPtr): Bool

public expect fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, sacl: ConstPtr, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr): Bool

public expect fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool

public expect fun authzFreeCentralAccessPolicyCache(): Bool

public expect fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool

public expect fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool

public expect fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool

public expect fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr, buffer: MutPtr): Bool

public expect fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr): Bool

public expect fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phnewauthzclientcontext: MutPtr): Bool

public expect fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool

public expect fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool

public expect fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool

public expect fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr): Bool

public expect fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool

public expect fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr): Bool

public expect fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr, pclaims: ConstPtr): Bool

public expect fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr, pattributes: ConstPtr): Bool

public expect fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr, psids: ConstPtr): Bool

public expect fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: ConstPtr): Bool

public expect fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr): Bool

public expect fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr): Bool

public expect fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr): Bool

public expect fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr): Bool

public expect fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool

public expect fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool

public expect fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr): Bool

public expect fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags)

public expect fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags)

public expect fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt)

public expect fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt)

public expect fun buildImpersonateTrusteeA(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr)

public expect fun buildImpersonateTrusteeW(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr)

public expect fun buildSecurityDescriptorA(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error

public expect fun buildSecurityDescriptorW(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error

public expect fun buildTrusteeWithNameA(ptrustee: MutPtr, pname: Pcstr)

public expect fun buildTrusteeWithNameW(ptrustee: MutPtr, pname: Pcwstr)

public expect fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr)

public expect fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr)

public expect fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid)

public expect fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid)

public expect fun buildTrusteeWithSidA(ptrustee: MutPtr, psid: Psid)

public expect fun buildTrusteeWithSidW(ptrustee: MutPtr, psid: Psid)

public expect fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool

public expect fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool

public expect fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr): Bool

public expect fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr): Bool

public expect fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool

public expect fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool

public expect fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr): Bool

public expect fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr): Bool

public expect fun freeInheritedFromArray(pinheritarray: ConstPtr, acecnt: UShort, pfnarray: ConstPtr): Win32Error

public expect fun getAuditedPermissionsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error

public expect fun getAuditedPermissionsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error

public expect fun getEffectiveRightsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error

public expect fun getEffectiveRightsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error

public expect fun getExplicitEntriesFromAclA(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error

public expect fun getExplicitEntriesFromAclW(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error

public expect fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error

public expect fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error

public expect fun getMultipleTrusteeA(ptrustee: ConstPtr): MutPtr

public expect fun getMultipleTrusteeOperationA(ptrustee: ConstPtr): MultipleTrusteeOperation

public expect fun getMultipleTrusteeOperationW(ptrustee: ConstPtr): MultipleTrusteeOperation

public expect fun getMultipleTrusteeW(ptrustee: ConstPtr): MutPtr

public expect fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error

public expect fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error

public expect fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error

public expect fun getTrusteeFormA(ptrustee: ConstPtr): TrusteeForm

public expect fun getTrusteeFormW(ptrustee: ConstPtr): TrusteeForm

public expect fun getTrusteeNameA(ptrustee: ConstPtr): Pstr

public expect fun getTrusteeNameW(ptrustee: ConstPtr): Pwstr

public expect fun getTrusteeTypeA(ptrustee: ConstPtr): TrusteeType

public expect fun getTrusteeTypeW(ptrustee: ConstPtr): TrusteeType

public expect fun lookupSecurityDescriptorPartsA(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error

public expect fun lookupSecurityDescriptorPartsW(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error

public expect fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error

public expect fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error

public expect fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error

public expect fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error

public expect fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error

public expect fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error

public expect fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error

public expect fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error

public expect fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error
