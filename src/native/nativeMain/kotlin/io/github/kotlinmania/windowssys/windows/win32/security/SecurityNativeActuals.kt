@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByType
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeResultList
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAccessAllowedAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAccessAllowedAceEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAccessAllowedObjectAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAccessDeniedAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAccessDeniedAceEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAccessDeniedObjectAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAuditAccessAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAuditAccessAceEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddAuditAccessObjectAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddConditionalAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddMandatoryAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddResourceAttributeAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAddScopedPolicyIDAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAdjustTokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAdjustTokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAllocateAndInitializeSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAllocateLocallyUniqueId
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAreAllAccessesGranted
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityAreAnyAccessesGranted
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCheckTokenCapability
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCheckTokenMembership
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCheckTokenMembershipEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCopySid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCreatePrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCreateRestrictedToken
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityCreateWellKnownSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityDeleteAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityDuplicateToken
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityDuplicateTokenEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityEqualDomainSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityEqualPrefixSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityEqualSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityFindFirstFreeAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityFreeSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetAclInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetAppContainerAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetCachedSigningLevel
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetFileSecurityA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetFileSecurityW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetKernelObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetLengthSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorDacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorGroup
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorLength
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorOwner
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSecurityDescriptorSacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSidIdentifierAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSidLengthRequired
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSidSubAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetSidSubAuthorityCount
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetTokenInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetUserObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityGetWindowsAccountDomainSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityImpersonateAnonymousToken
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityImpersonateLoggedOnUser
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityImpersonateSelf
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityInitializeAcl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityInitializeSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityInitializeSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityIsTokenRestricted
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityIsValidAcl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityIsValidSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityIsValidSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityIsWellKnownSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLogonUserA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLogonUserExA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLogonUserExW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLogonUserW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupAccountNameA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupAccountNameW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupAccountSidA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupAccountSidW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupPrivilegeNameA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupPrivilegeNameW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupPrivilegeValueA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityLookupPrivilegeValueW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityMakeAbsoluteSD
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityMakeSelfRelativeSD
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityMapGenericMask
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectCloseAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectCloseAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectOpenAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectOpenAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityPrivilegeCheck
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityQuerySecurityAccessMask
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityRevertToSelf
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetAclInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetCachedSigningLevel
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetFileSecurityA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetFileSecurityW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetKernelObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityAccessMask
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityDescriptorControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityDescriptorDacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityDescriptorGroup
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityDescriptorOwner
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetSecurityDescriptorSacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetTokenInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssysWindowsWin32SecuritySetUserObjectSecurity
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheck(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, genericmapping.rawAddress.toCPointer<ByteVar>(), privilegeset.rawAddress.toCPointer<ByteVar>(), privilegesetlength.rawAddress.toCPointer<ByteVar>(), grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatus.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), desiredaccess, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatus.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), desiredaccess, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatus.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByType(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), privilegeset.rawAddress.toCPointer<ByteVar>(), privilegesetlength.rawAddress.toCPointer<ByteVar>(), grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatus.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatus.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatus.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccesslist: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeResultList(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), privilegeset.rawAddress.toCPointer<ByteVar>(), privilegesetlength.rawAddress.toCPointer<ByteVar>(), grantedaccesslist.rawAddress.toCPointer<ByteVar>(), accessstatuslist.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatuslist.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccess: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccess.rawAddress.toCPointer<ByteVar>(), accessstatuslist.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccesslist: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccesslist.rawAddress.toCPointer<ByteVar>(), accessstatuslist.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Bool, grantedaccesslist: MutPtr<UInt>, accessstatuslist: MutPtr<UInt>, pfgenerateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), principalselfsid.rawAddress.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.rawAddress.toCPointer<ByteVar>(), objectcreation, grantedaccesslist.rawAddress.toCPointer<ByteVar>(), accessstatuslist.rawAddress.toCPointer<ByteVar>(), pfgenerateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun addAccessAllowedAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddAccessAllowedAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, accessmask, psid.rawAddress.toCPointer<ByteVar>())

public actual fun addAccessAllowedAceEx(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddAccessAllowedAceEx(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.rawAddress.toCPointer<ByteVar>())

public actual fun addAccessAllowedObjectAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr<Guid>, inheritedobjecttypeguid: ConstPtr<Guid>, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid.rawAddress.toCPointer<ByteVar>(), inheritedobjecttypeguid.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())

public actual fun addAccessDeniedAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddAccessDeniedAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, accessmask, psid.rawAddress.toCPointer<ByteVar>())

public actual fun addAccessDeniedAceEx(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddAccessDeniedAceEx(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.rawAddress.toCPointer<ByteVar>())

public actual fun addAccessDeniedObjectAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr<Guid>, inheritedobjecttypeguid: ConstPtr<Guid>, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid.rawAddress.toCPointer<ByteVar>(), inheritedobjecttypeguid.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())

public actual fun addAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr<CVoid>, nacelistlength: UInt): Bool =
    windowssysWindowsWin32SecurityAddAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, dwstartingaceindex, pacelist.rawAddress.toCPointer<ByteVar>(), nacelistlength)

public actual fun addAuditAccessAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    windowssysWindowsWin32SecurityAddAuditAccessAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, dwaccessmask, psid.rawAddress.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun addAuditAccessAceEx(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    windowssysWindowsWin32SecurityAddAuditAccessAceEx(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, dwaccessmask, psid.rawAddress.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun addAuditAccessObjectAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr<Guid>, inheritedobjecttypeguid: ConstPtr<Guid>, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    windowssysWindowsWin32SecurityAddAuditAccessObjectAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid.rawAddress.toCPointer<ByteVar>(), inheritedobjecttypeguid.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun addConditionalAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAddConditionalAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, acetype, accessmask, psid.rawAddress.toCPointer<ByteVar>(), conditionstr.rawAddress.toCPointer<ByteVar>(), returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun addMandatoryAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    windowssysWindowsWin32SecurityAddMandatoryAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, mandatorypolicy, plabelsid.rawAddress.toCPointer<ByteVar>())

public actual fun addResourceAttributeAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr<ClaimSecurityAttributesInformation>, preturnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAddResourceAttributeAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.rawAddress.toCPointer<ByteVar>(), pattributeinfo.rawAddress.toCPointer<ByteVar>(), preturnlength.rawAddress.toCPointer<ByteVar>())

public actual fun addScopedPolicyIDAce(pacl: MutPtr<Acl>, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    windowssysWindowsWin32SecurityAddScopedPolicyIDAce(pacl.rawAddress.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.rawAddress.toCPointer<ByteVar>())

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAdjustTokenGroups(tokenhandle.rawAddress.toCPointer<ByteVar>(), resettodefault, newstate.rawAddress.toCPointer<ByteVar>(), bufferlength, previousstate.rawAddress.toCPointer<ByteVar>(), returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAdjustTokenPrivileges(tokenhandle.rawAddress.toCPointer<ByteVar>(), disableallprivileges, newstate.rawAddress.toCPointer<ByteVar>(), bufferlength, previousstate.rawAddress.toCPointer<ByteVar>(), returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun allocateAndInitializeSid(pidentifierauthority: ConstPtr<SidIdentifierAuthority>, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr<Psid>): Bool =
    windowssysWindowsWin32SecurityAllocateAndInitializeSid(pidentifierauthority.rawAddress.toCPointer<ByteVar>(), nsubauthoritycount, nsubauthority0, nsubauthority1, nsubauthority2, nsubauthority3, nsubauthority4, nsubauthority5, nsubauthority6, nsubauthority7, psid.rawAddress.toCPointer<ByteVar>())

public actual fun allocateLocallyUniqueId(luid: MutPtr<Luid>): Bool =
    windowssysWindowsWin32SecurityAllocateLocallyUniqueId(luid.rawAddress.toCPointer<ByteVar>())

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    windowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess, desiredaccess)

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    windowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess, desiredaccess)

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityCheckTokenCapability(tokenhandle.rawAddress.toCPointer<ByteVar>(), capabilitysidtocheck.rawAddress.toCPointer<ByteVar>(), hascapability.rawAddress.toCPointer<ByteVar>())

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityCheckTokenMembership(tokenhandle.rawAddress.toCPointer<ByteVar>(), sidtocheck.rawAddress.toCPointer<ByteVar>(), ismember.rawAddress.toCPointer<ByteVar>())

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityCheckTokenMembershipEx(tokenhandle.rawAddress.toCPointer<ByteVar>(), sidtocheck.rawAddress.toCPointer<ByteVar>(), flags, ismember.rawAddress.toCPointer<ByteVar>())

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, genericmapping: ConstPtr<GenericMapping>): Bool =
    windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(parentdescriptor.rawAddress.toCPointer<ByteVar>(), currentsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), newsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), objecttype.rawAddress.toCPointer<ByteVar>(), isdirectoryobject, genericmapping.rawAddress.toCPointer<ByteVar>())

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    windowssysWindowsWin32SecurityCopySid(ndestinationsidlength, pdestinationsid.rawAddress.toCPointer<ByteVar>(), psourcesid.rawAddress.toCPointer<ByteVar>())

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr<GenericMapping>): Bool =
    windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(parentdescriptor.rawAddress.toCPointer<ByteVar>(), creatordescriptor.rawAddress.toCPointer<ByteVar>(), newdescriptor.rawAddress.toCPointer<ByteVar>(), isdirectoryobject, token.rawAddress.toCPointer<ByteVar>(), genericmapping.rawAddress.toCPointer<ByteVar>())

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr<GenericMapping>): Bool =
    windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(parentdescriptor.rawAddress.toCPointer<ByteVar>(), creatordescriptor.rawAddress.toCPointer<ByteVar>(), newdescriptor.rawAddress.toCPointer<ByteVar>(), objecttype.rawAddress.toCPointer<ByteVar>(), iscontainerobject, autoinheritflags, token.rawAddress.toCPointer<ByteVar>(), genericmapping.rawAddress.toCPointer<ByteVar>())

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttypes: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr<GenericMapping>): Bool =
    windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor.rawAddress.toCPointer<ByteVar>(), creatordescriptor.rawAddress.toCPointer<ByteVar>(), newdescriptor.rawAddress.toCPointer<ByteVar>(), objecttypes.rawAddress.toCPointer<ByteVar>(), guidcount, iscontainerobject, autoinheritflags, token.rawAddress.toCPointer<ByteVar>(), genericmapping.rawAddress.toCPointer<ByteVar>())

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr<SidAndAttributes>, deleteprivilegecount: UInt, privilegestodelete: ConstPtr<LuidAndAttributes>, restrictedsidcount: UInt, sidstorestrict: ConstPtr<SidAndAttributes>, newtokenhandle: MutPtr<Handle>): Bool =
    windowssysWindowsWin32SecurityCreateRestrictedToken(existingtokenhandle.rawAddress.toCPointer<ByteVar>(), flags, disablesidcount, sidstodisable.rawAddress.toCPointer<ByteVar>(), deleteprivilegecount, privilegestodelete.rawAddress.toCPointer<ByteVar>(), restrictedsidcount, sidstorestrict.rawAddress.toCPointer<ByteVar>(), newtokenhandle.rawAddress.toCPointer<ByteVar>())

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityCreateWellKnownSid(wellknownsidtype, domainsid.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>(), cbsid.rawAddress.toCPointer<ByteVar>())

public actual fun deleteAce(pacl: MutPtr<Acl>, dwaceindex: UInt): Bool =
    windowssysWindowsWin32SecurityDeleteAce(pacl.rawAddress.toCPointer<ByteVar>(), dwaceindex)

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr<MutPtr<Psid>>, capabilitygroupsidcount: MutPtr<UInt>, capabilitysids: MutPtr<MutPtr<Psid>>, capabilitysidcount: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(capname.rawAddress.toCPointer<ByteVar>(), capabilitygroupsids.rawAddress.toCPointer<ByteVar>(), capabilitygroupsidcount.rawAddress.toCPointer<ByteVar>(), capabilitysids.rawAddress.toCPointer<ByteVar>(), capabilitysidcount.rawAddress.toCPointer<ByteVar>())

public actual fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr<PsecurityDescriptor>): Bool =
    windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(objectdescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr<Handle>): Bool =
    windowssysWindowsWin32SecurityDuplicateToken(existingtokenhandle.rawAddress.toCPointer<ByteVar>(), impersonationlevel, duplicatetokenhandle.rawAddress.toCPointer<ByteVar>())

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr<SecurityAttributes>, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr<Handle>): Bool =
    windowssysWindowsWin32SecurityDuplicateTokenEx(hexistingtoken.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, lptokenattributes.rawAddress.toCPointer<ByteVar>(), impersonationlevel, tokentype, phnewtoken.rawAddress.toCPointer<ByteVar>())

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityEqualDomainSid(psid1.rawAddress.toCPointer<ByteVar>(), psid2.rawAddress.toCPointer<ByteVar>(), pfequal.rawAddress.toCPointer<ByteVar>())

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    windowssysWindowsWin32SecurityEqualPrefixSid(psid1.rawAddress.toCPointer<ByteVar>(), psid2.rawAddress.toCPointer<ByteVar>())

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    windowssysWindowsWin32SecurityEqualSid(psid1.rawAddress.toCPointer<ByteVar>(), psid2.rawAddress.toCPointer<ByteVar>())

public actual fun findFirstFreeAce(pacl: ConstPtr<Acl>, pace: MutPtr<MutPtr<CVoid>>): Bool =
    windowssysWindowsWin32SecurityFindFirstFreeAce(pacl.rawAddress.toCPointer<ByteVar>(), pace.rawAddress.toCPointer<ByteVar>())

public actual fun freeSid(psid: Psid): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32SecurityFreeSid(psid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getAce(pacl: ConstPtr<Acl>, dwaceindex: UInt, pace: MutPtr<MutPtr<CVoid>>): Bool =
    windowssysWindowsWin32SecurityGetAce(pacl.rawAddress.toCPointer<ByteVar>(), dwaceindex, pace.rawAddress.toCPointer<ByteVar>())

public actual fun getAclInformation(pacl: ConstPtr<Acl>, paclinformation: MutPtr<CVoid>, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    windowssysWindowsWin32SecurityGetAclInformation(pacl.rawAddress.toCPointer<ByteVar>(), paclinformation.rawAddress.toCPointer<ByteVar>(), naclinformationlength, dwaclinformationclass)

public actual fun getAppContainerAce(acl: ConstPtr<Acl>, startingaceindex: UInt, appcontainerace: MutPtr<MutPtr<CVoid>>, appcontaineraceindex: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetAppContainerAce(acl.rawAddress.toCPointer<ByteVar>(), startingaceindex, appcontainerace.rawAddress.toCPointer<ByteVar>(), appcontaineraceindex.rawAddress.toCPointer<ByteVar>())

public actual fun getCachedSigningLevel(file: Handle, flags: MutPtr<UInt>, signinglevel: MutPtr<UInt>, thumbprint: MutPtr<UByte>, thumbprintsize: MutPtr<UInt>, thumbprintalgorithm: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetCachedSigningLevel(file.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>(), signinglevel.rawAddress.toCPointer<ByteVar>(), thumbprint.rawAddress.toCPointer<ByteVar>(), thumbprintsize.rawAddress.toCPointer<ByteVar>(), thumbprintalgorithm.rawAddress.toCPointer<ByteVar>())

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetFileSecurityA(lpfilename.rawAddress.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetFileSecurityW(lpfilename.rawAddress.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetKernelObjectSecurity(handle.rawAddress.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getLengthSid(psid: Psid): UInt =
    windowssysWindowsWin32SecurityGetLengthSid(psid.rawAddress.toCPointer<ByteVar>())

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetPrivateObjectSecurity(objectdescriptor.rawAddress.toCPointer<ByteVar>(), securityinformation, resultantdescriptor.rawAddress.toCPointer<ByteVar>(), descriptorlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr<UShort>, lpdwrevision: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetSecurityDescriptorControl(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pcontrol.rawAddress.toCPointer<ByteVar>(), lpdwrevision.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr<Bool>, pdacl: MutPtr<MutPtr<Acl>>, lpbdacldefaulted: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpbdaclpresent.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), lpbdacldefaulted.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr<Psid>, lpbgroupdefaulted: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), lpbgroupdefaulted.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    windowssysWindowsWin32SecurityGetSecurityDescriptorLength(psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr<Psid>, lpbownerdefaulted: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), powner.rawAddress.toCPointer<ByteVar>(), lpbownerdefaulted.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr<UByte>): UInt =
    windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(securitydescriptor.rawAddress.toCPointer<ByteVar>(), rmcontrol.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr<Bool>, psacl: MutPtr<MutPtr<Acl>>, lpbsacldefaulted: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpbsaclpresent.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>(), lpbsacldefaulted.rawAddress.toCPointer<ByteVar>())

public actual fun getSidIdentifierAuthority(psid: Psid): MutPtr<SidIdentifierAuthority> =
    MutPtr(windowssysWindowsWin32SecurityGetSidIdentifierAuthority(psid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    windowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount)

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr<UInt> =
    MutPtr(windowssysWindowsWin32SecurityGetSidSubAuthority(psid.rawAddress.toCPointer<ByteVar>(), nsubauthority)?.toLong() ?: 0L)

public actual fun getSidSubAuthorityCount(psid: Psid): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SecurityGetSidSubAuthorityCount(psid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetTokenInformation(tokenhandle.rawAddress.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.rawAddress.toCPointer<ByteVar>(), tokeninformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr<UInt>, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetUserObjectSecurity(hobj.rawAddress.toCPointer<ByteVar>(), psirequested.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(psid.rawAddress.toCPointer<ByteVar>(), pdomainsid.rawAddress.toCPointer<ByteVar>(), cbdomainsid.rawAddress.toCPointer<ByteVar>())

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    windowssysWindowsWin32SecurityImpersonateAnonymousToken(threadhandle.rawAddress.toCPointer<ByteVar>())

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    windowssysWindowsWin32SecurityImpersonateLoggedOnUser(htoken.rawAddress.toCPointer<ByteVar>())

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    windowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel)

public actual fun initializeAcl(pacl: MutPtr<Acl>, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    windowssysWindowsWin32SecurityInitializeAcl(pacl.rawAddress.toCPointer<ByteVar>(), nacllength, dwaclrevision)

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    windowssysWindowsWin32SecurityInitializeSecurityDescriptor(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), dwrevision)

public actual fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr<SidIdentifierAuthority>, nsubauthoritycount: UByte): Bool =
    windowssysWindowsWin32SecurityInitializeSid(sid.rawAddress.toCPointer<ByteVar>(), pidentifierauthority.rawAddress.toCPointer<ByteVar>(), nsubauthoritycount)

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    windowssysWindowsWin32SecurityIsTokenRestricted(tokenhandle.rawAddress.toCPointer<ByteVar>())

public actual fun isValidAcl(pacl: ConstPtr<Acl>): Bool =
    windowssysWindowsWin32SecurityIsValidAcl(pacl.rawAddress.toCPointer<ByteVar>())

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SecurityIsValidSecurityDescriptor(psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun isValidSid(psid: Psid): Bool =
    windowssysWindowsWin32SecurityIsValidSid(psid.rawAddress.toCPointer<ByteVar>())

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    windowssysWindowsWin32SecurityIsWellKnownSid(psid.rawAddress.toCPointer<ByteVar>(), wellknownsidtype)

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>): Bool =
    windowssysWindowsWin32SecurityLogonUserA(lpszusername.rawAddress.toCPointer<ByteVar>(), lpszdomain.rawAddress.toCPointer<ByteVar>(), lpszpassword.rawAddress.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.rawAddress.toCPointer<ByteVar>())

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>, pplogonsid: MutPtr<Psid>, ppprofilebuffer: MutPtr<MutPtr<CVoid>>, pdwprofilelength: MutPtr<UInt>, pquotalimits: MutPtr<QuotaLimits>): Bool =
    windowssysWindowsWin32SecurityLogonUserExA(lpszusername.rawAddress.toCPointer<ByteVar>(), lpszdomain.rawAddress.toCPointer<ByteVar>(), lpszpassword.rawAddress.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.rawAddress.toCPointer<ByteVar>(), pplogonsid.rawAddress.toCPointer<ByteVar>(), ppprofilebuffer.rawAddress.toCPointer<ByteVar>(), pdwprofilelength.rawAddress.toCPointer<ByteVar>(), pquotalimits.rawAddress.toCPointer<ByteVar>())

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>, pplogonsid: MutPtr<Psid>, ppprofilebuffer: MutPtr<MutPtr<CVoid>>, pdwprofilelength: MutPtr<UInt>, pquotalimits: MutPtr<QuotaLimits>): Bool =
    windowssysWindowsWin32SecurityLogonUserExW(lpszusername.rawAddress.toCPointer<ByteVar>(), lpszdomain.rawAddress.toCPointer<ByteVar>(), lpszpassword.rawAddress.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.rawAddress.toCPointer<ByteVar>(), pplogonsid.rawAddress.toCPointer<ByteVar>(), ppprofilebuffer.rawAddress.toCPointer<ByteVar>(), pdwprofilelength.rawAddress.toCPointer<ByteVar>(), pquotalimits.rawAddress.toCPointer<ByteVar>())

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr<Handle>): Bool =
    windowssysWindowsWin32SecurityLogonUserW(lpszusername.rawAddress.toCPointer<ByteVar>(), lpszdomain.rawAddress.toCPointer<ByteVar>(), lpszpassword.rawAddress.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.rawAddress.toCPointer<ByteVar>())

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr<UInt>, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool =
    windowssysWindowsWin32SecurityLookupAccountNameA(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpaccountname.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>(), cbsid.rawAddress.toCPointer<ByteVar>(), referenceddomainname.rawAddress.toCPointer<ByteVar>(), cchreferenceddomainname.rawAddress.toCPointer<ByteVar>(), peuse.rawAddress.toCPointer<ByteVar>())

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr<UInt>, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool =
    windowssysWindowsWin32SecurityLookupAccountNameW(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpaccountname.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>(), cbsid.rawAddress.toCPointer<ByteVar>(), referenceddomainname.rawAddress.toCPointer<ByteVar>(), cchreferenceddomainname.rawAddress.toCPointer<ByteVar>(), peuse.rawAddress.toCPointer<ByteVar>())

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr<UInt>, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool =
    windowssysWindowsWin32SecurityLookupAccountSidA(lpsystemname.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), cchname.rawAddress.toCPointer<ByteVar>(), referenceddomainname.rawAddress.toCPointer<ByteVar>(), cchreferenceddomainname.rawAddress.toCPointer<ByteVar>(), peuse.rawAddress.toCPointer<ByteVar>())

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr<UInt>, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr<UInt>, peuse: MutPtr<SidNameUse>): Bool =
    windowssysWindowsWin32SecurityLookupAccountSidW(lpsystemname.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), cchname.rawAddress.toCPointer<ByteVar>(), referenceddomainname.rawAddress.toCPointer<ByteVar>(), cchreferenceddomainname.rawAddress.toCPointer<ByteVar>(), peuse.rawAddress.toCPointer<ByteVar>())

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr<UInt>, lplanguageid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), cchdisplayname.rawAddress.toCPointer<ByteVar>(), lplanguageid.rawAddress.toCPointer<ByteVar>())

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr<UInt>, lplanguageid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), cchdisplayname.rawAddress.toCPointer<ByteVar>(), lplanguageid.rawAddress.toCPointer<ByteVar>())

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr<Luid>, lpname: Pstr, cchname: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityLookupPrivilegeNameA(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpluid.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), cchname.rawAddress.toCPointer<ByteVar>())

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr<Luid>, lpname: Pwstr, cchname: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityLookupPrivilegeNameW(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpluid.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), cchname.rawAddress.toCPointer<ByteVar>())

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr<Luid>): Bool =
    windowssysWindowsWin32SecurityLookupPrivilegeValueA(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lpluid.rawAddress.toCPointer<ByteVar>())

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr<Luid>): Bool =
    windowssysWindowsWin32SecurityLookupPrivilegeValueW(lpsystemname.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lpluid.rawAddress.toCPointer<ByteVar>())

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr<UInt>, pdacl: MutPtr<Acl>, lpdwdaclsize: MutPtr<UInt>, psacl: MutPtr<Acl>, lpdwsaclsize: MutPtr<UInt>, powner: Psid, lpdwownersize: MutPtr<UInt>, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityMakeAbsoluteSD(pselfrelativesecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pabsolutesecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpdwabsolutesecuritydescriptorsize.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), lpdwdaclsize.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>(), lpdwsaclsize.rawAddress.toCPointer<ByteVar>(), powner.rawAddress.toCPointer<ByteVar>(), lpdwownersize.rawAddress.toCPointer<ByteVar>(), pprimarygroup.rawAddress.toCPointer<ByteVar>(), lpdwprimarygroupsize.rawAddress.toCPointer<ByteVar>())

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityMakeSelfRelativeSD(pabsolutesecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pselfrelativesecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun mapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>) {
    windowssysWindowsWin32SecurityMapGenericMask(accessmask.rawAddress.toCPointer<ByteVar>(), genericmapping.rawAddress.toCPointer<ByteVar>())
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool =
    windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), generateonclose)

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool =
    windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), generateonclose)

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool =
    windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), generateonclose)

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, generateonclose: Bool): Bool =
    windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), generateonclose)

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges.rawAddress.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), objecttypename.rawAddress.toCPointer<ByteVar>(), objectname.rawAddress.toCPointer<ByteVar>(), psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges.rawAddress.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose.rawAddress.toCPointer<ByteVar>())

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool =
    windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, privileges.rawAddress.toCPointer<ByteVar>(), accessgranted)

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool =
    windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), handleid.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), desiredaccess, privileges.rawAddress.toCPointer<ByteVar>(), accessgranted)

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, pfresult: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityPrivilegeCheck(clienttoken.rawAddress.toCPointer<ByteVar>(), requiredprivileges.rawAddress.toCPointer<ByteVar>(), pfresult.rawAddress.toCPointer<ByteVar>())

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool =
    windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(subsystemname.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), privileges.rawAddress.toCPointer<ByteVar>(), accessgranted)

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Bool): Bool =
    windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(subsystemname.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), clienttoken.rawAddress.toCPointer<ByteVar>(), privileges.rawAddress.toCPointer<ByteVar>(), accessgranted)

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr<UInt>) {
    windowssysWindowsWin32SecurityQuerySecurityAccessMask(securityinformation, desiredaccess.rawAddress.toCPointer<ByteVar>())
}

public actual fun revertToSelf(): Bool =
    windowssysWindowsWin32SecurityRevertToSelf()

public actual fun rtlConvertSidToUnicodeString(unicodestring: MutPtr<UnicodeString>, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(unicodestring.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean =
    windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress.toCPointer<ByteVar>(), securitydescriptorlength, newsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), newsecuritydescriptorlength.rawAddress.toCPointer<ByteVar>(), checkonly)

public actual fun setAclInformation(pacl: MutPtr<Acl>, paclinformation: ConstPtr<CVoid>, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    windowssysWindowsWin32SecuritySetAclInformation(pacl.rawAddress.toCPointer<ByteVar>(), paclinformation.rawAddress.toCPointer<ByteVar>(), naclinformationlength, dwaclinformationclass)

public actual fun setCachedSigningLevel(sourcefiles: ConstPtr<Handle>, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    windowssysWindowsWin32SecuritySetCachedSigningLevel(sourcefiles.rawAddress.toCPointer<ByteVar>(), sourcefilecount, flags, targetfile.rawAddress.toCPointer<ByteVar>())

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SecuritySetFileSecurityA(lpfilename.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SecuritySetFileSecurityW(lpfilename.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SecuritySetKernelObjectSecurity(handle.rawAddress.toCPointer<ByteVar>(), securityinformation, securitydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, genericmapping: ConstPtr<GenericMapping>, token: Handle): Bool =
    windowssysWindowsWin32SecuritySetPrivateObjectSecurity(securityinformation, modificationdescriptor.rawAddress.toCPointer<ByteVar>(), objectssecuritydescriptor.rawAddress.toCPointer<ByteVar>(), genericmapping.rawAddress.toCPointer<ByteVar>(), token.rawAddress.toCPointer<ByteVar>())

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr<GenericMapping>, token: Handle): Bool =
    windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(securityinformation, modificationdescriptor.rawAddress.toCPointer<ByteVar>(), objectssecuritydescriptor.rawAddress.toCPointer<ByteVar>(), autoinheritflags, genericmapping.rawAddress.toCPointer<ByteVar>(), token.rawAddress.toCPointer<ByteVar>())

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr<UInt>) {
    windowssysWindowsWin32SecuritySetSecurityAccessMask(securityinformation, desiredaccess.rawAddress.toCPointer<ByteVar>())
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    windowssysWindowsWin32SecuritySetSecurityDescriptorControl(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), controlbitsofinterest, controlbitstoset)

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr<Acl>, bdacldefaulted: Bool): Bool =
    windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), bdaclpresent, pdacl.rawAddress.toCPointer<ByteVar>(), bdacldefaulted)

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), bgroupdefaulted)

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), powner.rawAddress.toCPointer<ByteVar>(), bownerdefaulted)

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr<UByte>): UInt =
    windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(securitydescriptor.rawAddress.toCPointer<ByteVar>(), rmcontrol.rawAddress.toCPointer<ByteVar>())

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr<Acl>, bsacldefaulted: Bool): Bool =
    windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), bsaclpresent, psacl.rawAddress.toCPointer<ByteVar>(), bsacldefaulted)

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Bool =
    windowssysWindowsWin32SecuritySetTokenInformation(tokenhandle.rawAddress.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.rawAddress.toCPointer<ByteVar>(), tokeninformationlength)

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr<ObjectSecurityInformation>, psid: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SecuritySetUserObjectSecurity(hobj.rawAddress.toCPointer<ByteVar>(), psirequested.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())
