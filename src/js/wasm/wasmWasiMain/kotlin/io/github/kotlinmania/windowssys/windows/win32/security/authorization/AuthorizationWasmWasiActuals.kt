@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr<PsecurityDescriptor>, optionalsecuritydescriptorcount: UInt, preply: MutPtr<AuthzAccessReply>, phaccesscheckresults: MutPtr<AuthzAccessCheckResultsHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck")

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr<SidAndAttributes>, sidcount: UInt, restrictedsids: ConstPtr<SidAndAttributes>, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext")

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, preply: MutPtr<AuthzAccessReply>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck")

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr<AuthzSourceSchemaRegistration>, pdwcount: MutPtr<UInt>, pdwlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources")

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, sacl: ConstPtr<Acl>, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl")

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache")
private external fun wasiWindowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(): Int

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    wasiWindowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache().toInt()

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext")

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle")

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager")

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext")

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr<AuthzClientContextHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext")

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phnewauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeContextFromAuthzContext")

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeContextFromSid")

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeContextFromToken")

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr<AuthzAuditEventHandle>, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent")

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr<AuthzAuditEventHandle>, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2")

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr<AuthzRpcInitInfoClient>, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager")

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager")

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr<AuthzInitInfo>, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx")

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr<AuthzSourceSchemaRegistration>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource")

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr<AuthzSecurityAttributeOperation>, pclaims: ConstPtr<AuthzSecurityAttributesInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims")

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr<AuthzSecurityAttributeOperation>, pattributes: ConstPtr<AuthzSecurityAttributesInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes")

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr<AuthzSidOperation>, psids: ConstPtr<TokenGroups>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzModifySids")

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr<PsecurityDescriptor>, optionalsecuritydescriptorcount: UInt, preply: ConstPtr<AuthzAccessReply>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit")

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr<AuthzCapChangeSubscriptionHandle>, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification")

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr<AuthzSecurityEventProviderHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource")

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent")

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr<AuditParams>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams")

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr<SidAndAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation")

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource")

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification")

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr<AuthzSecurityEventProviderHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource")

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr<ExplicitAccessA>, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA")

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr<ExplicitAccessW>, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW")

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr<ExplicitAccessA>, ptrusteename: Pcstr, ptrustee: ConstPtr<TrusteeA>, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA")

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr<ExplicitAccessW>, ptrusteename: Pcwstr, ptrustee: ConstPtr<TrusteeW>, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW")

public actual fun buildImpersonateTrusteeA(ptrustee: MutPtr<TrusteeA>, pimpersonatetrustee: ConstPtr<TrusteeA>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA")

public actual fun buildImpersonateTrusteeW(ptrustee: MutPtr<TrusteeW>, pimpersonatetrustee: ConstPtr<TrusteeW>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW")

public actual fun buildSecurityDescriptorA(powner: ConstPtr<TrusteeA>, pgroup: ConstPtr<TrusteeA>, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr<ExplicitAccessA>, ccountofauditentries: UInt, plistofauditentries: ConstPtr<ExplicitAccessA>, poldsd: PsecurityDescriptor, psizenewsd: MutPtr<UInt>, pnewsd: MutPtr<PsecurityDescriptor>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA")

public actual fun buildSecurityDescriptorW(powner: ConstPtr<TrusteeW>, pgroup: ConstPtr<TrusteeW>, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr<ExplicitAccessW>, ccountofauditentries: UInt, plistofauditentries: ConstPtr<ExplicitAccessW>, poldsd: PsecurityDescriptor, psizenewsd: MutPtr<UInt>, pnewsd: MutPtr<PsecurityDescriptor>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW")

public actual fun buildTrusteeWithNameA(ptrustee: MutPtr<TrusteeA>, pname: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA")

public actual fun buildTrusteeWithNameW(ptrustee: MutPtr<TrusteeW>, pname: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW")

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr<TrusteeA>, pobjname: ConstPtr<ObjectsAndNameA>, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA")

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr<TrusteeW>, pobjname: ConstPtr<ObjectsAndNameW>, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW")

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr<TrusteeA>, pobjsid: ConstPtr<ObjectsAndSid>, pobjectguid: ConstPtr<Guid>, pinheritedobjectguid: ConstPtr<Guid>, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA")

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr<TrusteeW>, pobjsid: ConstPtr<ObjectsAndSid>, pobjectguid: ConstPtr<Guid>, pinheritedobjectguid: ConstPtr<Guid>, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW")

public actual fun buildTrusteeWithSidA(ptrustee: MutPtr<TrusteeA>, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA")

public actual fun buildTrusteeWithSidW(ptrustee: MutPtr<TrusteeW>, psid: Psid): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr<Pstr>, stringsecuritydescriptorlen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr<Pwstr>, stringsecuritydescriptorlen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW")

public actual fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr<Pstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA")

public actual fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr<Pwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW")

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr<Psid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA")

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr<Psid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW")

public actual fun freeInheritedFromArray(pinheritarray: ConstPtr<InheritedFromw>, acecnt: UShort, pfnarray: ConstPtr<FnObjectMgrFuncts>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray")

public actual fun getAuditedPermissionsFromAclA(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeA>, psuccessfulauditedrights: MutPtr<UInt>, pfailedauditrights: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA")

public actual fun getAuditedPermissionsFromAclW(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeW>, psuccessfulauditedrights: MutPtr<UInt>, pfailedauditrights: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW")

public actual fun getEffectiveRightsFromAclA(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeA>, paccessrights: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA")

public actual fun getEffectiveRightsFromAclW(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeW>, paccessrights: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW")

public actual fun getExplicitEntriesFromAclA(pacl: ConstPtr<Acl>, pccountofexplicitentries: MutPtr<UInt>, plistofexplicitentries: MutPtr<MutPtr<ExplicitAccessA>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA")

public actual fun getExplicitEntriesFromAclW(pacl: ConstPtr<Acl>, pccountofexplicitentries: MutPtr<UInt>, plistofexplicitentries: MutPtr<MutPtr<ExplicitAccessW>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW")

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, pacl: ConstPtr<Acl>, pfnarray: ConstPtr<FnObjectMgrFuncts>, pgenericmapping: ConstPtr<GenericMapping>, pinheritarray: MutPtr<InheritedFroma>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA")

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, pacl: ConstPtr<Acl>, pfnarray: ConstPtr<FnObjectMgrFuncts>, pgenericmapping: ConstPtr<GenericMapping>, pinheritarray: MutPtr<InheritedFromw>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW")

public actual fun getMultipleTrusteeA(ptrustee: ConstPtr<TrusteeA>): MutPtr<TrusteeA> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA")

public actual fun getMultipleTrusteeOperationA(ptrustee: ConstPtr<TrusteeA>): MultipleTrusteeOperation =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA")

public actual fun getMultipleTrusteeOperationW(ptrustee: ConstPtr<TrusteeW>): MultipleTrusteeOperation =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW")

public actual fun getMultipleTrusteeW(ptrustee: ConstPtr<TrusteeW>): MutPtr<TrusteeW> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW")

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA")

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW")

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo")

public actual fun getTrusteeFormA(ptrustee: ConstPtr<TrusteeA>): TrusteeForm =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA")

public actual fun getTrusteeFormW(ptrustee: ConstPtr<TrusteeW>): TrusteeForm =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW")

public actual fun getTrusteeNameA(ptrustee: ConstPtr<TrusteeA>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA")

public actual fun getTrusteeNameW(ptrustee: ConstPtr<TrusteeW>): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW")

public actual fun getTrusteeTypeA(ptrustee: ConstPtr<TrusteeA>): TrusteeType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA")

public actual fun getTrusteeTypeW(ptrustee: ConstPtr<TrusteeW>): TrusteeType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW")

public actual fun lookupSecurityDescriptorPartsA(ppowner: MutPtr<MutPtr<TrusteeA>>, ppgroup: MutPtr<MutPtr<TrusteeA>>, pccountofaccessentries: MutPtr<UInt>, pplistofaccessentries: MutPtr<MutPtr<ExplicitAccessA>>, pccountofauditentries: MutPtr<UInt>, pplistofauditentries: MutPtr<MutPtr<ExplicitAccessA>>, psd: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA")

public actual fun lookupSecurityDescriptorPartsW(ppowner: MutPtr<MutPtr<TrusteeW>>, ppgroup: MutPtr<MutPtr<TrusteeW>>, pccountofaccessentries: MutPtr<UInt>, pplistofaccessentries: MutPtr<MutPtr<ExplicitAccessW>>, pccountofauditentries: MutPtr<UInt>, pplistofauditentries: MutPtr<MutPtr<ExplicitAccessW>>, psd: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW")

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr<ExplicitAccessA>, oldacl: ConstPtr<Acl>, newacl: MutPtr<MutPtr<Acl>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA")

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr<ExplicitAccessW>, oldacl: ConstPtr<Acl>, newacl: MutPtr<MutPtr<Acl>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW")

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA")

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW")

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo")

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA")

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW")

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA")

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW")
