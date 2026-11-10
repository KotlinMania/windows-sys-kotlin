package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?, phaccesscheckresults: COpaquePointer?): Bool

public expect fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: COpaquePointer?, sidcount: UInt, restrictedsids: COpaquePointer?, restrictedsidcount: UInt, phnewauthzclientcontext: COpaquePointer?): Bool

public expect fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, preply: COpaquePointer?): Bool

public expect fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: COpaquePointer?, pdwcount: COpaquePointer?, pdwlength: COpaquePointer?): Bool

public expect fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, sacl: COpaquePointer?, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: COpaquePointer?): Bool

public expect fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool

public expect fun authzFreeCentralAccessPolicyCache(): Bool

public expect fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool

public expect fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool

public expect fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool

public expect fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: COpaquePointer?, buffer: COpaquePointer?): Bool

public expect fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: COpaquePointer?): Bool

public expect fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phnewauthzclientcontext: COpaquePointer?): Bool

public expect fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool

public expect fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool

public expect fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzInitializeRemoteResourceManager(prpcinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool

public expect fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: COpaquePointer?): Bool

public expect fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool

public expect fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: COpaquePointer?): Bool

public expect fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: COpaquePointer?, pclaims: COpaquePointer?): Bool

public expect fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: COpaquePointer?, pattributes: COpaquePointer?): Bool

public expect fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: COpaquePointer?, psids: COpaquePointer?): Bool

public expect fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?): Bool

public expect fun authzRegisterCapChangeNotification(phcapchangesubscription: COpaquePointer?, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: COpaquePointer?): Bool

public expect fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: COpaquePointer?): Bool

public expect fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool

public expect fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: COpaquePointer?): Bool

public expect fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: COpaquePointer?): Bool

public expect fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool

public expect fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool

public expect fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: COpaquePointer?): Bool

public expect fun buildExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags)

public expect fun buildExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags)

public expect fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt)

public expect fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt)

public expect fun buildImpersonateTrusteeA(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?)

public expect fun buildImpersonateTrusteeW(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?)

public expect fun buildSecurityDescriptorA(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error

public expect fun buildSecurityDescriptorW(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error

public expect fun buildTrusteeWithNameA(ptrustee: COpaquePointer?, pname: Pcstr)

public expect fun buildTrusteeWithNameW(ptrustee: COpaquePointer?, pname: Pcwstr)

public expect fun buildTrusteeWithObjectsAndNameA(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr)

public expect fun buildTrusteeWithObjectsAndNameW(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr)

public expect fun buildTrusteeWithObjectsAndSidA(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid)

public expect fun buildTrusteeWithObjectsAndSidW(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid)

public expect fun buildTrusteeWithSidA(ptrustee: COpaquePointer?, psid: Psid)

public expect fun buildTrusteeWithSidW(ptrustee: COpaquePointer?, psid: Psid)

public expect fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool

public expect fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool

public expect fun convertSidToStringSidA(sid: Psid, stringsid: COpaquePointer?): Bool

public expect fun convertSidToStringSidW(sid: Psid, stringsid: COpaquePointer?): Bool

public expect fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool

public expect fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool

public expect fun convertStringSidToSidA(stringsid: Pcstr, sid: COpaquePointer?): Bool

public expect fun convertStringSidToSidW(stringsid: Pcwstr, sid: COpaquePointer?): Bool

public expect fun freeInheritedFromArray(pinheritarray: COpaquePointer?, acecnt: UShort, pfnarray: COpaquePointer?): Win32Error

public expect fun getAuditedPermissionsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error

public expect fun getAuditedPermissionsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error

public expect fun getEffectiveRightsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error

public expect fun getEffectiveRightsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error

public expect fun getExplicitEntriesFromAclA(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error

public expect fun getExplicitEntriesFromAclW(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error

public expect fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error

public expect fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error

public expect fun getMultipleTrusteeA(ptrustee: COpaquePointer?): COpaquePointer?

public expect fun getMultipleTrusteeOperationA(ptrustee: COpaquePointer?): MultipleTrusteeOperation

public expect fun getMultipleTrusteeOperationW(ptrustee: COpaquePointer?): MultipleTrusteeOperation

public expect fun getMultipleTrusteeW(ptrustee: COpaquePointer?): COpaquePointer?

public expect fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error

public expect fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error

public expect fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error

public expect fun getTrusteeFormA(ptrustee: COpaquePointer?): TrusteeForm

public expect fun getTrusteeFormW(ptrustee: COpaquePointer?): TrusteeForm

public expect fun getTrusteeNameA(ptrustee: COpaquePointer?): Pstr

public expect fun getTrusteeNameW(ptrustee: COpaquePointer?): Pwstr

public expect fun getTrusteeTypeA(ptrustee: COpaquePointer?): TrusteeType

public expect fun getTrusteeTypeW(ptrustee: COpaquePointer?): TrusteeType

public expect fun lookupSecurityDescriptorPartsA(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error

public expect fun lookupSecurityDescriptorPartsW(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error

public expect fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error

public expect fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error

public expect fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error

public expect fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error

public expect fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error

public expect fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error

public expect fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error

public expect fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error

public expect fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error
