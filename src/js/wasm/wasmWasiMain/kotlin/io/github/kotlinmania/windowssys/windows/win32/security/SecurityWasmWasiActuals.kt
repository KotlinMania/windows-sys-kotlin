@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheck")

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA")

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW")

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByType")

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA")

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW")

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccesslist: MutPtr, accessstatuslist: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeResultList")

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW")

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW")

public actual fun addAccessAllowedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAccessAllowedAce")

public actual fun addAccessAllowedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAccessAllowedAceEx")

public actual fun addAccessAllowedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAccessAllowedObjectAce")

public actual fun addAccessDeniedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAccessDeniedAce")

public actual fun addAccessDeniedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAccessDeniedAceEx")

public actual fun addAccessDeniedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAccessDeniedObjectAce")

public actual fun addAce(pacl: MutPtr, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr, nacelistlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAce")

public actual fun addAuditAccessAce(pacl: MutPtr, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAuditAccessAce")

public actual fun addAuditAccessAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAuditAccessAceEx")

public actual fun addAuditAccessObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddAuditAccessObjectAce")

public actual fun addConditionalAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddConditionalAce")

public actual fun addMandatoryAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddMandatoryAce")

public actual fun addResourceAttributeAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr, preturnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddResourceAttributeAce")

public actual fun addScopedPolicyIDAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAddScopedPolicyIDAce")

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAdjustTokenGroups")

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAdjustTokenPrivileges")

public actual fun allocateAndInitializeSid(pidentifierauthority: ConstPtr, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAllocateAndInitializeSid")

public actual fun allocateLocallyUniqueId(luid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAllocateLocallyUniqueId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAreAllAccessesGranted")
private external fun wasiWindowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAreAnyAccessesGranted")
private external fun wasiWindowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess: Int, desiredaccess: Int): Int

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt())

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCheckTokenCapability")

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCheckTokenMembership")

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCheckTokenMembershipEx")

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, genericmapping: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity")

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCopySid")

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCreatePrivateObjectSecurity")

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx")

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttypes: ConstPtr, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance")

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr, deleteprivilegecount: UInt, privilegestodelete: ConstPtr, restrictedsidcount: UInt, sidstorestrict: ConstPtr, newtokenhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCreateRestrictedToken")

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCreateWellKnownSid")

public actual fun deleteAce(pacl: MutPtr, dwaceindex: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityDeleteAce")

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr, capabilitygroupsidcount: MutPtr, capabilitysids: MutPtr, capabilitysidcount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName")

public actual fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity")

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityDuplicateToken")

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityDuplicateTokenEx")

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEqualDomainSid")

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEqualPrefixSid")

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEqualSid")

public actual fun findFirstFreeAce(pacl: ConstPtr, pace: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityFindFirstFreeAce")

public actual fun freeSid(psid: Psid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityFreeSid")

public actual fun getAce(pacl: ConstPtr, dwaceindex: UInt, pace: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetAce")

public actual fun getAclInformation(pacl: ConstPtr, paclinformation: MutPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetAclInformation")

public actual fun getAppContainerAce(acl: ConstPtr, startingaceindex: UInt, appcontainerace: MutPtr, appcontaineraceindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetAppContainerAce")

public actual fun getCachedSigningLevel(file: Handle, flags: MutPtr, signinglevel: MutPtr, thumbprint: MutPtr, thumbprintsize: MutPtr, thumbprintalgorithm: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetCachedSigningLevel")

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetFileSecurityA")

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetFileSecurityW")

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetKernelObjectSecurity")

public actual fun getLengthSid(psid: Psid): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetLengthSid")

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetPrivateObjectSecurity")

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr, lpdwrevision: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorControl")

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr, pdacl: MutPtr, lpbdacldefaulted: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorDacl")

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr, lpbgroupdefaulted: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorGroup")

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorLength")

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr, lpbownerdefaulted: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorOwner")

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl")

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr, psacl: MutPtr, lpbsacldefaulted: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSecurityDescriptorSacl")

public actual fun getSidIdentifierAuthority(psid: Psid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSidIdentifierAuthority")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityGetSidLengthRequired")
private external fun wasiWindowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount: Int): Int

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    wasiWindowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount.toInt()).toUInt()

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSidSubAuthority")

public actual fun getSidSubAuthorityCount(psid: Psid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetSidSubAuthorityCount")

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetTokenInformation")

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetUserObjectSecurity")

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityGetWindowsAccountDomainSid")

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityImpersonateAnonymousToken")

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityImpersonateLoggedOnUser")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityImpersonateSelf")
private external fun wasiWindowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel: Int): Int

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    wasiWindowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel)

public actual fun initializeAcl(pacl: MutPtr, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityInitializeAcl")

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityInitializeSecurityDescriptor")

public actual fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr, nsubauthoritycount: UByte): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityInitializeSid")

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityIsTokenRestricted")

public actual fun isValidAcl(pacl: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityIsValidAcl")

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityIsValidSecurityDescriptor")

public actual fun isValidSid(psid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityIsValidSid")

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityIsWellKnownSid")

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLogonUserA")

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLogonUserExA")

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLogonUserExW")

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLogonUserW")

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupAccountNameA")

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupAccountNameW")

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupAccountSidA")

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupAccountSidW")

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA")

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW")

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr, lpname: Pstr, cchname: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupPrivilegeNameA")

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr, lpname: Pwstr, cchname: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupPrivilegeNameW")

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupPrivilegeValueA")

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLookupPrivilegeValueW")

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr, pdacl: MutPtr, lpdwdaclsize: MutPtr, psacl: MutPtr, lpdwsaclsize: MutPtr, powner: Psid, lpdwownersize: MutPtr, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityMakeAbsoluteSD")

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityMakeSelfRelativeSD")

public actual fun mapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityMapGenericMask")

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectCloseAuditAlarmA")

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectCloseAuditAlarmW")

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA")

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW")

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectOpenAuditAlarmA")

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectOpenAuditAlarmW")

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA")

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW")

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, pfresult: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityPrivilegeCheck")

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA")

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW")

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityQuerySecurityAccessMask")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityRevertToSelf")
private external fun wasiWindowssysWindowsWin32SecurityRevertToSelf(): Int

public actual fun revertToSelf(): Bool =
    wasiWindowssysWindowsWin32SecurityRevertToSelf()

public actual fun rtlConvertSidToUnicodeString(unicodestring: MutPtr, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString")

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor")

public actual fun setAclInformation(pacl: MutPtr, paclinformation: ConstPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetAclInformation")

public actual fun setCachedSigningLevel(sourcefiles: ConstPtr, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetCachedSigningLevel")

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetFileSecurityA")

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetFileSecurityW")

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetKernelObjectSecurity")

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, genericmapping: ConstPtr, token: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetPrivateObjectSecurity")

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr, token: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx")

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityAccessMask")

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityDescriptorControl")

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr, bdacldefaulted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityDescriptorDacl")

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityDescriptorGroup")

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityDescriptorOwner")

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl")

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr, bsacldefaulted: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetSecurityDescriptorSacl")

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetTokenInformation")

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecuritySetUserObjectSecurity")
