@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheck
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckAndAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckAndAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByType
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeResultList
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAccessAllowedAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAccessAllowedAceEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAccessAllowedObjectAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAccessDeniedAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAccessDeniedAceEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAccessDeniedObjectAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAuditAccessAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAuditAccessAceEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addAuditAccessObjectAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addConditionalAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addMandatoryAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addResourceAttributeAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_addScopedPolicyIDAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_adjustTokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_adjustTokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_allocateAndInitializeSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_allocateLocallyUniqueId
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_areAllAccessesGranted
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_areAnyAccessesGranted
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_checkTokenCapability
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_checkTokenMembership
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_checkTokenMembershipEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_convertToAutoInheritPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_copySid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_createPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_createPrivateObjectSecurityEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_createPrivateObjectSecurityWithMultipleInheritance
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_createRestrictedToken
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_createWellKnownSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_deleteAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_deriveCapabilitySidsFromName
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_destroyPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_duplicateToken
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_duplicateTokenEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_equalDomainSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_equalPrefixSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_equalSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_findFirstFreeAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_freeSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getAclInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getAppContainerAce
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getCachedSigningLevel
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getFileSecurityA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getFileSecurityW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getKernelObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getLengthSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorDacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorGroup
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorLength
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorOwner
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorRMControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSecurityDescriptorSacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSidIdentifierAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSidLengthRequired
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSidSubAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getSidSubAuthorityCount
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getTokenInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getUserObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_getWindowsAccountDomainSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_impersonateAnonymousToken
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_impersonateLoggedOnUser
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_impersonateSelf
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_initializeAcl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_initializeSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_initializeSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_isTokenRestricted
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_isValidAcl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_isValidSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_isValidSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_isWellKnownSid
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_logonUserA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_logonUserExA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_logonUserExW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_logonUserW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupAccountNameA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupAccountNameW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupAccountSidA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupAccountSidW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupPrivilegeDisplayNameA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupPrivilegeDisplayNameW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupPrivilegeNameA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupPrivilegeNameW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupPrivilegeValueA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_lookupPrivilegeValueW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_makeAbsoluteSD
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_makeSelfRelativeSD
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_mapGenericMask
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectCloseAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectCloseAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectDeleteAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectDeleteAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectOpenAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectOpenAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectPrivilegeAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_objectPrivilegeAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_privilegeCheck
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_privilegedServiceAuditAlarmA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_privilegedServiceAuditAlarmW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_querySecurityAccessMask
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_revertToSelf
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_rtlConvertSidToUnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_rtlNormalizeSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setAclInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setCachedSigningLevel
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setFileSecurityA
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setFileSecurityW
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setKernelObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setPrivateObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setPrivateObjectSecurityEx
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityAccessMask
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityDescriptorControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityDescriptorDacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityDescriptorGroup
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityDescriptorOwner
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityDescriptorRMControl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setSecurityDescriptorSacl
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setTokenInformation
import io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_setUserObjectSecurity
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheck(psecuritydescriptor?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, genericmapping?.value?.toCPointer<ByteVar>(), privilegeset?.value?.toCPointer<ByteVar>(), privilegesetlength?.value?.toCPointer<ByteVar>(), grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>())

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckAndAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), desiredaccess, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckAndAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), desiredaccess, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByType(psecuritydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), privilegeset?.value?.toCPointer<ByteVar>(), privilegesetlength?.value?.toCPointer<ByteVar>(), grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeResultList(psecuritydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), privilegeset?.value?.toCPointer<ByteVar>(), privilegesetlength?.value?.toCPointer<ByteVar>(), grantedaccesslist?.value?.toCPointer<ByteVar>(), accessstatuslist?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatuslist?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatuslist?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccesslist?.value?.toCPointer<ByteVar>(), accessstatuslist?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), principalselfsid?.value?.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, genericmapping?.value?.toCPointer<ByteVar>(), objectcreation, grantedaccesslist?.value?.toCPointer<ByteVar>(), accessstatuslist?.value?.toCPointer<ByteVar>(), pfgenerateonclose?.value?.toCPointer<ByteVar>())

public actual fun addAccessAllowedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    windowssys_windows_win32_security_addAccessAllowedAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, accessmask, psid?.value?.toCPointer<ByteVar>())

public actual fun addAccessAllowedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    windowssys_windows_win32_security_addAccessAllowedAceEx(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid?.value?.toCPointer<ByteVar>())

public actual fun addAccessAllowedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool =
    windowssys_windows_win32_security_addAccessAllowedObjectAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid?.value?.toCPointer<ByteVar>(), inheritedobjecttypeguid?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())

public actual fun addAccessDeniedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    windowssys_windows_win32_security_addAccessDeniedAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, accessmask, psid?.value?.toCPointer<ByteVar>())

public actual fun addAccessDeniedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    windowssys_windows_win32_security_addAccessDeniedAceEx(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid?.value?.toCPointer<ByteVar>())

public actual fun addAccessDeniedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool =
    windowssys_windows_win32_security_addAccessDeniedObjectAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid?.value?.toCPointer<ByteVar>(), inheritedobjecttypeguid?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())

public actual fun addAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: COpaquePointer?, nacelistlength: UInt): Bool =
    windowssys_windows_win32_security_addAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, dwstartingaceindex, pacelist?.value?.toCPointer<ByteVar>(), nacelistlength)

public actual fun addAuditAccessAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    windowssys_windows_win32_security_addAuditAccessAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, dwaccessmask, psid?.value?.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun addAuditAccessAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    windowssys_windows_win32_security_addAuditAccessAceEx(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, dwaccessmask, psid?.value?.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun addAuditAccessObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    windowssys_windows_win32_security_addAuditAccessObjectAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid?.value?.toCPointer<ByteVar>(), inheritedobjecttypeguid?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun addConditionalAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_addConditionalAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, acetype, accessmask, psid?.value?.toCPointer<ByteVar>(), conditionstr?.value?.toCPointer<ByteVar>(), returnlength?.value?.toCPointer<ByteVar>())

public actual fun addMandatoryAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    windowssys_windows_win32_security_addMandatoryAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, mandatorypolicy, plabelsid?.value?.toCPointer<ByteVar>())

public actual fun addResourceAttributeAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: COpaquePointer?, preturnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_addResourceAttributeAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid?.value?.toCPointer<ByteVar>(), pattributeinfo?.value?.toCPointer<ByteVar>(), preturnlength?.value?.toCPointer<ByteVar>())

public actual fun addScopedPolicyIDAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    windowssys_windows_win32_security_addScopedPolicyIDAce(pacl?.value?.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid?.value?.toCPointer<ByteVar>())

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_adjustTokenGroups(tokenhandle?.value?.toCPointer<ByteVar>(), resettodefault, newstate?.value?.toCPointer<ByteVar>(), bufferlength, previousstate?.value?.toCPointer<ByteVar>(), returnlength?.value?.toCPointer<ByteVar>())

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_adjustTokenPrivileges(tokenhandle?.value?.toCPointer<ByteVar>(), disableallprivileges, newstate?.value?.toCPointer<ByteVar>(), bufferlength, previousstate?.value?.toCPointer<ByteVar>(), returnlength?.value?.toCPointer<ByteVar>())

public actual fun allocateAndInitializeSid(pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_allocateAndInitializeSid(pidentifierauthority?.value?.toCPointer<ByteVar>(), nsubauthoritycount, nsubauthority0, nsubauthority1, nsubauthority2, nsubauthority3, nsubauthority4, nsubauthority5, nsubauthority6, nsubauthority7, psid?.value?.toCPointer<ByteVar>())

public actual fun allocateLocallyUniqueId(luid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_allocateLocallyUniqueId(luid?.value?.toCPointer<ByteVar>())

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    windowssys_windows_win32_security_areAllAccessesGranted(grantedaccess, desiredaccess)

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    windowssys_windows_win32_security_areAnyAccessesGranted(grantedaccess, desiredaccess)

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: COpaquePointer?): Bool =
    windowssys_windows_win32_security_checkTokenCapability(tokenhandle?.value?.toCPointer<ByteVar>(), capabilitysidtocheck?.value?.toCPointer<ByteVar>(), hascapability?.value?.toCPointer<ByteVar>())

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: COpaquePointer?): Bool =
    windowssys_windows_win32_security_checkTokenMembership(tokenhandle?.value?.toCPointer<ByteVar>(), sidtocheck?.value?.toCPointer<ByteVar>(), ismember?.value?.toCPointer<ByteVar>())

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: COpaquePointer?): Bool =
    windowssys_windows_win32_security_checkTokenMembershipEx(tokenhandle?.value?.toCPointer<ByteVar>(), sidtocheck?.value?.toCPointer<ByteVar>(), flags, ismember?.value?.toCPointer<ByteVar>())

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, genericmapping: COpaquePointer?): Bool =
    windowssys_windows_win32_security_convertToAutoInheritPrivateObjectSecurity(parentdescriptor?.value?.toCPointer<ByteVar>(), currentsecuritydescriptor?.value?.toCPointer<ByteVar>(), newsecuritydescriptor?.value?.toCPointer<ByteVar>(), objecttype?.value?.toCPointer<ByteVar>(), isdirectoryobject, genericmapping?.value?.toCPointer<ByteVar>())

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    windowssys_windows_win32_security_copySid(ndestinationsidlength, pdestinationsid?.value?.toCPointer<ByteVar>(), psourcesid?.value?.toCPointer<ByteVar>())

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Bool, token: Handle, genericmapping: COpaquePointer?): Bool =
    windowssys_windows_win32_security_createPrivateObjectSecurity(parentdescriptor?.value?.toCPointer<ByteVar>(), creatordescriptor?.value?.toCPointer<ByteVar>(), newdescriptor?.value?.toCPointer<ByteVar>(), isdirectoryobject, token?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>())

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool =
    windowssys_windows_win32_security_createPrivateObjectSecurityEx(parentdescriptor?.value?.toCPointer<ByteVar>(), creatordescriptor?.value?.toCPointer<ByteVar>(), newdescriptor?.value?.toCPointer<ByteVar>(), objecttype?.value?.toCPointer<ByteVar>(), iscontainerobject, autoinheritflags, token?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>())

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttypes: COpaquePointer?, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool =
    windowssys_windows_win32_security_createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor?.value?.toCPointer<ByteVar>(), creatordescriptor?.value?.toCPointer<ByteVar>(), newdescriptor?.value?.toCPointer<ByteVar>(), objecttypes?.value?.toCPointer<ByteVar>(), guidcount, iscontainerobject, autoinheritflags, token?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>())

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: COpaquePointer?, deleteprivilegecount: UInt, privilegestodelete: COpaquePointer?, restrictedsidcount: UInt, sidstorestrict: COpaquePointer?, newtokenhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_security_createRestrictedToken(existingtokenhandle?.value?.toCPointer<ByteVar>(), flags, disablesidcount, sidstodisable?.value?.toCPointer<ByteVar>(), deleteprivilegecount, privilegestodelete?.value?.toCPointer<ByteVar>(), restrictedsidcount, sidstorestrict?.value?.toCPointer<ByteVar>(), newtokenhandle?.value?.toCPointer<ByteVar>())

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_createWellKnownSid(wellknownsidtype, domainsid?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>(), cbsid?.value?.toCPointer<ByteVar>())

public actual fun deleteAce(pacl: COpaquePointer?, dwaceindex: UInt): Bool =
    windowssys_windows_win32_security_deleteAce(pacl?.value?.toCPointer<ByteVar>(), dwaceindex)

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: COpaquePointer?, capabilitygroupsidcount: COpaquePointer?, capabilitysids: COpaquePointer?, capabilitysidcount: COpaquePointer?): Bool =
    windowssys_windows_win32_security_deriveCapabilitySidsFromName(capname?.value?.toCPointer<ByteVar>(), capabilitygroupsids?.value?.toCPointer<ByteVar>(), capabilitygroupsidcount?.value?.toCPointer<ByteVar>(), capabilitysids?.value?.toCPointer<ByteVar>(), capabilitysidcount?.value?.toCPointer<ByteVar>())

public actual fun destroyPrivateObjectSecurity(objectdescriptor: COpaquePointer?): Bool =
    windowssys_windows_win32_security_destroyPrivateObjectSecurity(objectdescriptor?.value?.toCPointer<ByteVar>())

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_security_duplicateToken(existingtokenhandle?.value?.toCPointer<ByteVar>(), impersonationlevel, duplicatetokenhandle?.value?.toCPointer<ByteVar>())

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: COpaquePointer?, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: COpaquePointer?): Bool =
    windowssys_windows_win32_security_duplicateTokenEx(hexistingtoken?.value?.toCPointer<ByteVar>(), dwdesiredaccess, lptokenattributes?.value?.toCPointer<ByteVar>(), impersonationlevel, tokentype, phnewtoken?.value?.toCPointer<ByteVar>())

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: COpaquePointer?): Bool =
    windowssys_windows_win32_security_equalDomainSid(psid1?.value?.toCPointer<ByteVar>(), psid2?.value?.toCPointer<ByteVar>(), pfequal?.value?.toCPointer<ByteVar>())

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    windowssys_windows_win32_security_equalPrefixSid(psid1?.value?.toCPointer<ByteVar>(), psid2?.value?.toCPointer<ByteVar>())

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    windowssys_windows_win32_security_equalSid(psid1?.value?.toCPointer<ByteVar>(), psid2?.value?.toCPointer<ByteVar>())

public actual fun findFirstFreeAce(pacl: COpaquePointer?, pace: COpaquePointer?): Bool =
    windowssys_windows_win32_security_findFirstFreeAce(pacl?.value?.toCPointer<ByteVar>(), pace?.value?.toCPointer<ByteVar>())

public actual fun freeSid(psid: Psid): COpaquePointer? =
    windowssys_windows_win32_security_freeSid(psid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getAce(pacl: COpaquePointer?, dwaceindex: UInt, pace: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getAce(pacl?.value?.toCPointer<ByteVar>(), dwaceindex, pace?.value?.toCPointer<ByteVar>())

public actual fun getAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    windowssys_windows_win32_security_getAclInformation(pacl?.value?.toCPointer<ByteVar>(), paclinformation?.value?.toCPointer<ByteVar>(), naclinformationlength, dwaclinformationclass)

public actual fun getAppContainerAce(acl: COpaquePointer?, startingaceindex: UInt, appcontainerace: COpaquePointer?, appcontaineraceindex: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getAppContainerAce(acl?.value?.toCPointer<ByteVar>(), startingaceindex, appcontainerace?.value?.toCPointer<ByteVar>(), appcontaineraceindex?.value?.toCPointer<ByteVar>())

public actual fun getCachedSigningLevel(file: Handle, flags: COpaquePointer?, signinglevel: COpaquePointer?, thumbprint: COpaquePointer?, thumbprintsize: COpaquePointer?, thumbprintalgorithm: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getCachedSigningLevel(file?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>(), signinglevel?.value?.toCPointer<ByteVar>(), thumbprint?.value?.toCPointer<ByteVar>(), thumbprintsize?.value?.toCPointer<ByteVar>(), thumbprintalgorithm?.value?.toCPointer<ByteVar>())

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getFileSecurityA(lpfilename?.value?.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getFileSecurityW(lpfilename?.value?.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getKernelObjectSecurity(handle?.value?.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun getLengthSid(psid: Psid): UInt =
    windowssys_windows_win32_security_getLengthSid(psid?.value?.toCPointer<ByteVar>())

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getPrivateObjectSecurity(objectdescriptor?.value?.toCPointer<ByteVar>(), securityinformation, resultantdescriptor?.value?.toCPointer<ByteVar>(), descriptorlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: COpaquePointer?, lpdwrevision: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getSecurityDescriptorControl(psecuritydescriptor?.value?.toCPointer<ByteVar>(), pcontrol?.value?.toCPointer<ByteVar>(), lpdwrevision?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: COpaquePointer?, pdacl: COpaquePointer?, lpbdacldefaulted: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getSecurityDescriptorDacl(psecuritydescriptor?.value?.toCPointer<ByteVar>(), lpbdaclpresent?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), lpbdacldefaulted?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: COpaquePointer?, lpbgroupdefaulted: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getSecurityDescriptorGroup(psecuritydescriptor?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), lpbgroupdefaulted?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    windowssys_windows_win32_security_getSecurityDescriptorLength(psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: COpaquePointer?, lpbownerdefaulted: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getSecurityDescriptorOwner(psecuritydescriptor?.value?.toCPointer<ByteVar>(), powner?.value?.toCPointer<ByteVar>(), lpbownerdefaulted?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt =
    windowssys_windows_win32_security_getSecurityDescriptorRMControl(securitydescriptor?.value?.toCPointer<ByteVar>(), rmcontrol?.value?.toCPointer<ByteVar>())

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: COpaquePointer?, psacl: COpaquePointer?, lpbsacldefaulted: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getSecurityDescriptorSacl(psecuritydescriptor?.value?.toCPointer<ByteVar>(), lpbsaclpresent?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>(), lpbsacldefaulted?.value?.toCPointer<ByteVar>())

public actual fun getSidIdentifierAuthority(psid: Psid): COpaquePointer? =
    windowssys_windows_win32_security_getSidIdentifierAuthority(psid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    windowssys_windows_win32_security_getSidLengthRequired(nsubauthoritycount)

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): COpaquePointer? =
    windowssys_windows_win32_security_getSidSubAuthority(psid?.value?.toCPointer<ByteVar>(), nsubauthority)?.let { COpaquePointer(it.toLong()) }

public actual fun getSidSubAuthorityCount(psid: Psid): COpaquePointer? =
    windowssys_windows_win32_security_getSidSubAuthorityCount(psid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getTokenInformation(tokenhandle?.value?.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation?.value?.toCPointer<ByteVar>(), tokeninformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getUserObjectSecurity(hobj?.value?.toCPointer<ByteVar>(), psirequested?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_getWindowsAccountDomainSid(psid?.value?.toCPointer<ByteVar>(), pdomainsid?.value?.toCPointer<ByteVar>(), cbdomainsid?.value?.toCPointer<ByteVar>())

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    windowssys_windows_win32_security_impersonateAnonymousToken(threadhandle?.value?.toCPointer<ByteVar>())

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    windowssys_windows_win32_security_impersonateLoggedOnUser(htoken?.value?.toCPointer<ByteVar>())

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    windowssys_windows_win32_security_impersonateSelf(impersonationlevel)

public actual fun initializeAcl(pacl: COpaquePointer?, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    windowssys_windows_win32_security_initializeAcl(pacl?.value?.toCPointer<ByteVar>(), nacllength, dwaclrevision)

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    windowssys_windows_win32_security_initializeSecurityDescriptor(psecuritydescriptor?.value?.toCPointer<ByteVar>(), dwrevision)

public actual fun initializeSid(sid: Psid, pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte): Bool =
    windowssys_windows_win32_security_initializeSid(sid?.value?.toCPointer<ByteVar>(), pidentifierauthority?.value?.toCPointer<ByteVar>(), nsubauthoritycount)

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    windowssys_windows_win32_security_isTokenRestricted(tokenhandle?.value?.toCPointer<ByteVar>())

public actual fun isValidAcl(pacl: COpaquePointer?): Bool =
    windowssys_windows_win32_security_isValidAcl(pacl?.value?.toCPointer<ByteVar>())

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssys_windows_win32_security_isValidSecurityDescriptor(psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun isValidSid(psid: Psid): Bool =
    windowssys_windows_win32_security_isValidSid(psid?.value?.toCPointer<ByteVar>())

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    windowssys_windows_win32_security_isWellKnownSid(psid?.value?.toCPointer<ByteVar>(), wellknownsidtype)

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool =
    windowssys_windows_win32_security_logonUserA(lpszusername?.value?.toCPointer<ByteVar>(), lpszdomain?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken?.value?.toCPointer<ByteVar>())

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool =
    windowssys_windows_win32_security_logonUserExA(lpszusername?.value?.toCPointer<ByteVar>(), lpszdomain?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken?.value?.toCPointer<ByteVar>(), pplogonsid?.value?.toCPointer<ByteVar>(), ppprofilebuffer?.value?.toCPointer<ByteVar>(), pdwprofilelength?.value?.toCPointer<ByteVar>(), pquotalimits?.value?.toCPointer<ByteVar>())

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool =
    windowssys_windows_win32_security_logonUserExW(lpszusername?.value?.toCPointer<ByteVar>(), lpszdomain?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken?.value?.toCPointer<ByteVar>(), pplogonsid?.value?.toCPointer<ByteVar>(), ppprofilebuffer?.value?.toCPointer<ByteVar>(), pdwprofilelength?.value?.toCPointer<ByteVar>(), pquotalimits?.value?.toCPointer<ByteVar>())

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool =
    windowssys_windows_win32_security_logonUserW(lpszusername?.value?.toCPointer<ByteVar>(), lpszdomain?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken?.value?.toCPointer<ByteVar>())

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupAccountNameA(lpsystemname?.value?.toCPointer<ByteVar>(), lpaccountname?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>(), cbsid?.value?.toCPointer<ByteVar>(), referenceddomainname?.value?.toCPointer<ByteVar>(), cchreferenceddomainname?.value?.toCPointer<ByteVar>(), peuse?.value?.toCPointer<ByteVar>())

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupAccountNameW(lpsystemname?.value?.toCPointer<ByteVar>(), lpaccountname?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>(), cbsid?.value?.toCPointer<ByteVar>(), referenceddomainname?.value?.toCPointer<ByteVar>(), cchreferenceddomainname?.value?.toCPointer<ByteVar>(), peuse?.value?.toCPointer<ByteVar>())

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupAccountSidA(lpsystemname?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), cchname?.value?.toCPointer<ByteVar>(), referenceddomainname?.value?.toCPointer<ByteVar>(), cchreferenceddomainname?.value?.toCPointer<ByteVar>(), peuse?.value?.toCPointer<ByteVar>())

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupAccountSidW(lpsystemname?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), cchname?.value?.toCPointer<ByteVar>(), referenceddomainname?.value?.toCPointer<ByteVar>(), cchreferenceddomainname?.value?.toCPointer<ByteVar>(), peuse?.value?.toCPointer<ByteVar>())

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupPrivilegeDisplayNameA(lpsystemname?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), cchdisplayname?.value?.toCPointer<ByteVar>(), lplanguageid?.value?.toCPointer<ByteVar>())

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupPrivilegeDisplayNameW(lpsystemname?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), cchdisplayname?.value?.toCPointer<ByteVar>(), lplanguageid?.value?.toCPointer<ByteVar>())

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: COpaquePointer?, lpname: Pstr, cchname: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupPrivilegeNameA(lpsystemname?.value?.toCPointer<ByteVar>(), lpluid?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), cchname?.value?.toCPointer<ByteVar>())

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: COpaquePointer?, lpname: Pwstr, cchname: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupPrivilegeNameW(lpsystemname?.value?.toCPointer<ByteVar>(), lpluid?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), cchname?.value?.toCPointer<ByteVar>())

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupPrivilegeValueA(lpsystemname?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lpluid?.value?.toCPointer<ByteVar>())

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_lookupPrivilegeValueW(lpsystemname?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lpluid?.value?.toCPointer<ByteVar>())

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: COpaquePointer?, pdacl: COpaquePointer?, lpdwdaclsize: COpaquePointer?, psacl: COpaquePointer?, lpdwsaclsize: COpaquePointer?, powner: Psid, lpdwownersize: COpaquePointer?, pprimarygroup: Psid, lpdwprimarygroupsize: COpaquePointer?): Bool =
    windowssys_windows_win32_security_makeAbsoluteSD(pselfrelativesecuritydescriptor?.value?.toCPointer<ByteVar>(), pabsolutesecuritydescriptor?.value?.toCPointer<ByteVar>(), lpdwabsolutesecuritydescriptorsize?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), lpdwdaclsize?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>(), lpdwsaclsize?.value?.toCPointer<ByteVar>(), powner?.value?.toCPointer<ByteVar>(), lpdwownersize?.value?.toCPointer<ByteVar>(), pprimarygroup?.value?.toCPointer<ByteVar>(), lpdwprimarygroupsize?.value?.toCPointer<ByteVar>())

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_makeSelfRelativeSD(pabsolutesecuritydescriptor?.value?.toCPointer<ByteVar>(), pselfrelativesecuritydescriptor?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun mapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    windowssys_windows_win32_security_mapGenericMask(accessmask?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>())
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    windowssys_windows_win32_security_objectCloseAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), generateonclose)

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    windowssys_windows_win32_security_objectCloseAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), generateonclose)

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    windowssys_windows_win32_security_objectDeleteAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), generateonclose)

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    windowssys_windows_win32_security_objectDeleteAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), generateonclose)

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_objectOpenAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), psecuritydescriptor?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges?.value?.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose?.value?.toCPointer<ByteVar>())

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool =
    windowssys_windows_win32_security_objectOpenAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), objecttypename?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), psecuritydescriptor?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges?.value?.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose?.value?.toCPointer<ByteVar>())

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    windowssys_windows_win32_security_objectPrivilegeAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, privileges?.value?.toCPointer<ByteVar>(), accessgranted)

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    windowssys_windows_win32_security_objectPrivilegeAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), handleid?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), desiredaccess, privileges?.value?.toCPointer<ByteVar>(), accessgranted)

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, pfresult: COpaquePointer?): Bool =
    windowssys_windows_win32_security_privilegeCheck(clienttoken?.value?.toCPointer<ByteVar>(), requiredprivileges?.value?.toCPointer<ByteVar>(), pfresult?.value?.toCPointer<ByteVar>())

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    windowssys_windows_win32_security_privilegedServiceAuditAlarmA(subsystemname?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), privileges?.value?.toCPointer<ByteVar>(), accessgranted)

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    windowssys_windows_win32_security_privilegedServiceAuditAlarmW(subsystemname?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), clienttoken?.value?.toCPointer<ByteVar>(), privileges?.value?.toCPointer<ByteVar>(), accessgranted)

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?) {
    windowssys_windows_win32_security_querySecurityAccessMask(securityinformation, desiredaccess?.value?.toCPointer<ByteVar>())
}

public actual fun revertToSelf(): Bool =
    windowssys_windows_win32_security_revertToSelf()

public actual fun rtlConvertSidToUnicodeString(unicodestring: COpaquePointer?, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    windowssys_windows_win32_security_rtlConvertSidToUnicodeString(unicodestring?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    windowssys_windows_win32_security_rtlNormalizeSecurityDescriptor(securitydescriptor?.value?.toCPointer<ByteVar>(), securitydescriptorlength, newsecuritydescriptor?.value?.toCPointer<ByteVar>(), newsecuritydescriptorlength?.value?.toCPointer<ByteVar>(), checkonly)

public actual fun setAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    windowssys_windows_win32_security_setAclInformation(pacl?.value?.toCPointer<ByteVar>(), paclinformation?.value?.toCPointer<ByteVar>(), naclinformationlength, dwaclinformationclass)

public actual fun setCachedSigningLevel(sourcefiles: COpaquePointer?, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    windowssys_windows_win32_security_setCachedSigningLevel(sourcefiles?.value?.toCPointer<ByteVar>(), sourcefilecount, flags, targetfile?.value?.toCPointer<ByteVar>())

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssys_windows_win32_security_setFileSecurityA(lpfilename?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssys_windows_win32_security_setFileSecurityW(lpfilename?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    windowssys_windows_win32_security_setKernelObjectSecurity(handle?.value?.toCPointer<ByteVar>(), securityinformation, securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, genericmapping: COpaquePointer?, token: Handle): Bool =
    windowssys_windows_win32_security_setPrivateObjectSecurity(securityinformation, modificationdescriptor?.value?.toCPointer<ByteVar>(), objectssecuritydescriptor?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>())

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: SecurityAutoInheritFlags, genericmapping: COpaquePointer?, token: Handle): Bool =
    windowssys_windows_win32_security_setPrivateObjectSecurityEx(securityinformation, modificationdescriptor?.value?.toCPointer<ByteVar>(), objectssecuritydescriptor?.value?.toCPointer<ByteVar>(), autoinheritflags, genericmapping?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>())

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?) {
    windowssys_windows_win32_security_setSecurityAccessMask(securityinformation, desiredaccess?.value?.toCPointer<ByteVar>())
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    windowssys_windows_win32_security_setSecurityDescriptorControl(psecuritydescriptor?.value?.toCPointer<ByteVar>(), controlbitsofinterest, controlbitstoset)

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: COpaquePointer?, bdacldefaulted: Bool): Bool =
    windowssys_windows_win32_security_setSecurityDescriptorDacl(psecuritydescriptor?.value?.toCPointer<ByteVar>(), bdaclpresent, pdacl?.value?.toCPointer<ByteVar>(), bdacldefaulted)

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    windowssys_windows_win32_security_setSecurityDescriptorGroup(psecuritydescriptor?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), bgroupdefaulted)

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    windowssys_windows_win32_security_setSecurityDescriptorOwner(psecuritydescriptor?.value?.toCPointer<ByteVar>(), powner?.value?.toCPointer<ByteVar>(), bownerdefaulted)

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt =
    windowssys_windows_win32_security_setSecurityDescriptorRMControl(securitydescriptor?.value?.toCPointer<ByteVar>(), rmcontrol?.value?.toCPointer<ByteVar>())

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: COpaquePointer?, bsacldefaulted: Bool): Bool =
    windowssys_windows_win32_security_setSecurityDescriptorSacl(psecuritydescriptor?.value?.toCPointer<ByteVar>(), bsaclpresent, psacl?.value?.toCPointer<ByteVar>(), bsacldefaulted)

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Bool =
    windowssys_windows_win32_security_setTokenInformation(tokenhandle?.value?.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation?.value?.toCPointer<ByteVar>(), tokeninformationlength)

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor): Bool =
    windowssys_windows_win32_security_setUserObjectSecurity(hobj?.value?.toCPointer<ByteVar>(), psirequested?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())
