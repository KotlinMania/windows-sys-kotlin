@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: MutPtr, phaccesscheckresults: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck")

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr, sidcount: UInt, restrictedsids: ConstPtr, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext")

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, preply: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck")

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr, pdwcount: MutPtr, pdwlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources")

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, sacl: ConstPtr, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl")

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache")
private external fun wasiWindowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(): Int

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    wasiWindowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache()

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext")

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle")

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager")

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr, buffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext")

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext")

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phnewauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeContextFromAuthzContext")

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeContextFromSid")

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeContextFromToken")

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent")

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2")

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager")

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager")

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx")

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource")

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr, pclaims: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims")

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr, pattributes: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes")

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr, psids: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzModifySids")

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit")

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification")

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource")

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent")

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams")

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation")

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource")

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification")

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource")

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA")

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW")

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA")

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW")

public actual fun buildImpersonateTrusteeA(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA")

public actual fun buildImpersonateTrusteeW(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW")

public actual fun buildSecurityDescriptorA(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA")

public actual fun buildSecurityDescriptorW(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW")

public actual fun buildTrusteeWithNameA(ptrustee: MutPtr, pname: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA")

public actual fun buildTrusteeWithNameW(ptrustee: MutPtr, pname: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW")

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA")

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW")

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA")

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW")

public actual fun buildTrusteeWithSidA(ptrustee: MutPtr, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA")

public actual fun buildTrusteeWithSidW(ptrustee: MutPtr, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW")

public actual fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA")

public actual fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW")

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA")

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW")

public actual fun freeInheritedFromArray(pinheritarray: ConstPtr, acecnt: UShort, pfnarray: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray")

public actual fun getAuditedPermissionsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA")

public actual fun getAuditedPermissionsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW")

public actual fun getEffectiveRightsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA")

public actual fun getEffectiveRightsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW")

public actual fun getExplicitEntriesFromAclA(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA")

public actual fun getExplicitEntriesFromAclW(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW")

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA")

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW")

public actual fun getMultipleTrusteeA(ptrustee: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA")

public actual fun getMultipleTrusteeOperationA(ptrustee: ConstPtr): MultipleTrusteeOperation =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA")

public actual fun getMultipleTrusteeOperationW(ptrustee: ConstPtr): MultipleTrusteeOperation =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW")

public actual fun getMultipleTrusteeW(ptrustee: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW")

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA")

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW")

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo")

public actual fun getTrusteeFormA(ptrustee: ConstPtr): TrusteeForm =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA")

public actual fun getTrusteeFormW(ptrustee: ConstPtr): TrusteeForm =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW")

public actual fun getTrusteeNameA(ptrustee: ConstPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA")

public actual fun getTrusteeNameW(ptrustee: ConstPtr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW")

public actual fun getTrusteeTypeA(ptrustee: ConstPtr): TrusteeType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA")

public actual fun getTrusteeTypeW(ptrustee: ConstPtr): TrusteeType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW")

public actual fun lookupSecurityDescriptorPartsA(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA")

public actual fun lookupSecurityDescriptorPartsW(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW")

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA")

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW")

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA")

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW")

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo")

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA")

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW")

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA")

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW")
