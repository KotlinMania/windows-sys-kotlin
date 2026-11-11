@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzAddSidsToContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzCachedAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzEnumerateSecurityEventSources
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzEvaluateSacl
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzFreeAuditEvent
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzFreeCentralAccessPolicyCache
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzFreeContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzFreeHandle
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzFreeResourceManager
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzGetInformationFromContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInitializeCompoundContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent2
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInitializeRemoteResourceManager
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInitializeResourceManager
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInitializeResourceManagerEx
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzInstallSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzModifyClaims
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzModifySecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzModifySids
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzOpenObjectAudit
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzRegisterCapChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzRegisterSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzReportSecurityEvent
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzReportSecurityEventFromParams
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzSetAppContainerInformation
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzUninstallSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzUnregisterCapChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_authzUnregisterSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildImpersonateTrusteeA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildImpersonateTrusteeW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildSecurityDescriptorA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildSecurityDescriptorW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_buildTrusteeWithSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertSidToStringSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertSidToStringSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertStringSidToSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_convertStringSidToSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_freeInheritedFromArray
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getInheritanceSourceA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getInheritanceSourceW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getMultipleTrusteeA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getMultipleTrusteeW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getSecurityInfo
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getTrusteeFormA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getTrusteeFormW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getTrusteeNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getTrusteeNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getTrusteeTypeA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_getTrusteeTypeW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_setEntriesInAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_setEntriesInAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_setNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_setNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_setSecurityInfo
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?, phaccesscheckresults: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzAccessCheck(flags, hauthzclientcontext?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), hauditevent?.value?.toCPointer<ByteVar>(), psecuritydescriptor?.value?.toCPointer<ByteVar>(), optionalsecuritydescriptorarray?.value?.toCPointer<ByteVar>(), optionalsecuritydescriptorcount, preply?.value?.toCPointer<ByteVar>(), phaccesscheckresults?.value?.toCPointer<ByteVar>())

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: COpaquePointer?, sidcount: UInt, restrictedsids: COpaquePointer?, restrictedsidcount: UInt, phnewauthzclientcontext: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzAddSidsToContext(hauthzclientcontext?.value?.toCPointer<ByteVar>(), sids?.value?.toCPointer<ByteVar>(), sidcount, restrictedsids?.value?.toCPointer<ByteVar>(), restrictedsidcount, phnewauthzclientcontext?.value?.toCPointer<ByteVar>())

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, preply: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzCachedAccessCheck(flags, haccesscheckresults?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), hauditevent?.value?.toCPointer<ByteVar>(), preply?.value?.toCPointer<ByteVar>())

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: COpaquePointer?, pdwcount: COpaquePointer?, pdwlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzEnumerateSecurityEventSources(dwflags, buffer?.value?.toCPointer<ByteVar>(), pdwcount?.value?.toCPointer<ByteVar>(), pdwlength?.value?.toCPointer<ByteVar>())

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, sacl: COpaquePointer?, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzEvaluateSacl(authzclientcontext?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), grantedaccess, accessgranted, pbgenerateaudit?.value?.toCPointer<ByteVar>())

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    windowssys_windows_win32_security_authorization_authzFreeAuditEvent(hauditevent?.value?.toCPointer<ByteVar>())

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    windowssys_windows_win32_security_authorization_authzFreeCentralAccessPolicyCache()

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    windowssys_windows_win32_security_authorization_authzFreeContext(hauthzclientcontext?.value?.toCPointer<ByteVar>())

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    windowssys_windows_win32_security_authorization_authzFreeHandle(haccesscheckresults?.value?.toCPointer<ByteVar>())

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    windowssys_windows_win32_security_authorization_authzFreeResourceManager(hauthzresourcemanager?.value?.toCPointer<ByteVar>())

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: COpaquePointer?, buffer: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzGetInformationFromContext(hauthzclientcontext?.value?.toCPointer<ByteVar>(), infoclass, buffersize, psizerequired?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzInitializeCompoundContext(usercontext?.value?.toCPointer<ByteVar>(), devicecontext?.value?.toCPointer<ByteVar>(), phcompoundcontext?.value?.toCPointer<ByteVar>())

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phnewauthzclientcontext: COpaquePointer?): Bool =
    0

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool =
    0

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool =
    0

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent(flags, hauditeventtype?.value?.toCPointer<ByteVar>(), szoperationtype?.value?.toCPointer<ByteVar>(), szobjecttype?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), szadditionalinfo?.value?.toCPointer<ByteVar>(), phauditevent?.value?.toCPointer<ByteVar>(), dwadditionalparametercount, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent2(flags, hauditeventtype?.value?.toCPointer<ByteVar>(), szoperationtype?.value?.toCPointer<ByteVar>(), szobjecttype?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), szadditionalinfo?.value?.toCPointer<ByteVar>(), szadditionalinfo2?.value?.toCPointer<ByteVar>(), phauditevent?.value?.toCPointer<ByteVar>(), dwadditionalparametercount, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzInitializeRemoteResourceManager(prpcinitinfo?.value?.toCPointer<ByteVar>(), phauthzresourcemanager?.value?.toCPointer<ByteVar>())

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzInitializeResourceManager(flags, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), szresourcemanagername?.value?.toCPointer<ByteVar>(), phauthzresourcemanager?.value?.toCPointer<ByteVar>())

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzInitializeResourceManagerEx(flags, pauthzinitinfo?.value?.toCPointer<ByteVar>(), phauthzresourcemanager?.value?.toCPointer<ByteVar>())

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzInstallSecurityEventSource(dwflags, pregistration?.value?.toCPointer<ByteVar>())

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: COpaquePointer?, pclaims: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzModifyClaims(hauthzclientcontext?.value?.toCPointer<ByteVar>(), claimclass, pclaimoperations?.value?.toCPointer<ByteVar>(), pclaims?.value?.toCPointer<ByteVar>())

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: COpaquePointer?, pattributes: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzModifySecurityAttributes(hauthzclientcontext?.value?.toCPointer<ByteVar>(), poperations?.value?.toCPointer<ByteVar>(), pattributes?.value?.toCPointer<ByteVar>())

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: COpaquePointer?, psids: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzModifySids(hauthzclientcontext?.value?.toCPointer<ByteVar>(), sidclass, psidoperations?.value?.toCPointer<ByteVar>(), psids?.value?.toCPointer<ByteVar>())

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzOpenObjectAudit(flags, hauthzclientcontext?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), hauditevent?.value?.toCPointer<ByteVar>(), psecuritydescriptor?.value?.toCPointer<ByteVar>(), optionalsecuritydescriptorarray?.value?.toCPointer<ByteVar>(), optionalsecuritydescriptorcount, preply?.value?.toCPointer<ByteVar>())

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: COpaquePointer?, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzRegisterCapChangeNotification(phcapchangesubscription?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzRegisterSecurityEventSource(dwflags, szeventsourcename?.value?.toCPointer<ByteVar>(), pheventprovider?.value?.toCPointer<ByteVar>())

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    windowssys_windows_win32_security_authorization_authzReportSecurityEvent(dwflags, heventprovider?.value?.toCPointer<ByteVar>(), dwauditid, pusersid?.value?.toCPointer<ByteVar>(), dwcount, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzReportSecurityEventFromParams(dwflags, heventprovider?.value?.toCPointer<ByteVar>(), dwauditid, pusersid?.value?.toCPointer<ByteVar>(), pparams?.value?.toCPointer<ByteVar>())

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzSetAppContainerInformation(hauthzclientcontext?.value?.toCPointer<ByteVar>(), pappcontainersid?.value?.toCPointer<ByteVar>(), capabilitycount, pcapabilitysids?.value?.toCPointer<ByteVar>())

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    windowssys_windows_win32_security_authorization_authzUninstallSecurityEventSource(dwflags, szeventsourcename?.value?.toCPointer<ByteVar>())

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    windowssys_windows_win32_security_authorization_authzUnregisterCapChangeNotification(hcapchangesubscription?.value?.toCPointer<ByteVar>())

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_authzUnregisterSecurityEventSource(dwflags, pheventprovider?.value?.toCPointer<ByteVar>())

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameA(pexplicitaccess?.value?.toCPointer<ByteVar>(), ptrusteename?.value?.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameW(pexplicitaccess?.value?.toCPointer<ByteVar>(), ptrusteename?.value?.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameA(pexplicitaccess?.value?.toCPointer<ByteVar>(), ptrusteename?.value?.toCPointer<ByteVar>(), ptrustee?.value?.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameW(pexplicitaccess?.value?.toCPointer<ByteVar>(), ptrusteename?.value?.toCPointer<ByteVar>(), ptrustee?.value?.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildImpersonateTrusteeA(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?) {
    windowssys_windows_win32_security_authorization_buildImpersonateTrusteeA(ptrustee?.value?.toCPointer<ByteVar>(), pimpersonatetrustee?.value?.toCPointer<ByteVar>())
}

public actual fun buildImpersonateTrusteeW(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?) {
    windowssys_windows_win32_security_authorization_buildImpersonateTrusteeW(ptrustee?.value?.toCPointer<ByteVar>(), pimpersonatetrustee?.value?.toCPointer<ByteVar>())
}

public actual fun buildSecurityDescriptorA(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_buildSecurityDescriptorA(powner?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), ccountofaccessentries, plistofaccessentries?.value?.toCPointer<ByteVar>(), ccountofauditentries, plistofauditentries?.value?.toCPointer<ByteVar>(), poldsd?.value?.toCPointer<ByteVar>(), psizenewsd?.value?.toCPointer<ByteVar>(), pnewsd?.value?.toCPointer<ByteVar>())

public actual fun buildSecurityDescriptorW(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_buildSecurityDescriptorW(powner?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), ccountofaccessentries, plistofaccessentries?.value?.toCPointer<ByteVar>(), ccountofauditentries, plistofauditentries?.value?.toCPointer<ByteVar>(), poldsd?.value?.toCPointer<ByteVar>(), psizenewsd?.value?.toCPointer<ByteVar>(), pnewsd?.value?.toCPointer<ByteVar>())

public actual fun buildTrusteeWithNameA(ptrustee: COpaquePointer?, pname: Pcstr) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithNameA(ptrustee?.value?.toCPointer<ByteVar>(), pname?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithNameW(ptrustee: COpaquePointer?, pname: Pcwstr) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithNameW(ptrustee?.value?.toCPointer<ByteVar>(), pname?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameA(ptrustee?.value?.toCPointer<ByteVar>(), pobjname?.value?.toCPointer<ByteVar>(), objecttype, objecttypename?.value?.toCPointer<ByteVar>(), inheritedobjecttypename?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameW(ptrustee?.value?.toCPointer<ByteVar>(), pobjname?.value?.toCPointer<ByteVar>(), objecttype, objecttypename?.value?.toCPointer<ByteVar>(), inheritedobjecttypename?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidA(ptrustee?.value?.toCPointer<ByteVar>(), pobjsid?.value?.toCPointer<ByteVar>(), pobjectguid?.value?.toCPointer<ByteVar>(), pinheritedobjectguid?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidW(ptrustee?.value?.toCPointer<ByteVar>(), pobjsid?.value?.toCPointer<ByteVar>(), pobjectguid?.value?.toCPointer<ByteVar>(), pinheritedobjectguid?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithSidA(ptrustee: COpaquePointer?, psid: Psid) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithSidA(ptrustee?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithSidW(ptrustee: COpaquePointer?, psid: Psid) {
    windowssys_windows_win32_security_authorization_buildTrusteeWithSidW(ptrustee?.value?.toCPointer<ByteVar>(), psid?.value?.toCPointer<ByteVar>())
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor?.value?.toCPointer<ByteVar>(), requestedstringsdrevision, securityinformation, stringsecuritydescriptor?.value?.toCPointer<ByteVar>(), stringsecuritydescriptorlen?.value?.toCPointer<ByteVar>())

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor?.value?.toCPointer<ByteVar>(), requestedstringsdrevision, securityinformation, stringsecuritydescriptor?.value?.toCPointer<ByteVar>(), stringsecuritydescriptorlen?.value?.toCPointer<ByteVar>())

public actual fun convertSidToStringSidA(sid: Psid, stringsid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertSidToStringSidA(sid?.value?.toCPointer<ByteVar>(), stringsid?.value?.toCPointer<ByteVar>())

public actual fun convertSidToStringSidW(sid: Psid, stringsid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertSidToStringSidW(sid?.value?.toCPointer<ByteVar>(), stringsid?.value?.toCPointer<ByteVar>())

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor?.value?.toCPointer<ByteVar>(), stringsdrevision, securitydescriptor?.value?.toCPointer<ByteVar>(), securitydescriptorsize?.value?.toCPointer<ByteVar>())

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor?.value?.toCPointer<ByteVar>(), stringsdrevision, securitydescriptor?.value?.toCPointer<ByteVar>(), securitydescriptorsize?.value?.toCPointer<ByteVar>())

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertStringSidToSidA(stringsid?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>())

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_authorization_convertStringSidToSidW(stringsid?.value?.toCPointer<ByteVar>(), sid?.value?.toCPointer<ByteVar>())

public actual fun freeInheritedFromArray(pinheritarray: COpaquePointer?, acecnt: UShort, pfnarray: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_freeInheritedFromArray(pinheritarray?.value?.toCPointer<ByteVar>(), acecnt, pfnarray?.value?.toCPointer<ByteVar>())

public actual fun getAuditedPermissionsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclA(pacl?.value?.toCPointer<ByteVar>(), ptrustee?.value?.toCPointer<ByteVar>(), psuccessfulauditedrights?.value?.toCPointer<ByteVar>(), pfailedauditrights?.value?.toCPointer<ByteVar>())

public actual fun getAuditedPermissionsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclW(pacl?.value?.toCPointer<ByteVar>(), ptrustee?.value?.toCPointer<ByteVar>(), psuccessfulauditedrights?.value?.toCPointer<ByteVar>(), pfailedauditrights?.value?.toCPointer<ByteVar>())

public actual fun getEffectiveRightsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclA(pacl?.value?.toCPointer<ByteVar>(), ptrustee?.value?.toCPointer<ByteVar>(), paccessrights?.value?.toCPointer<ByteVar>())

public actual fun getEffectiveRightsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclW(pacl?.value?.toCPointer<ByteVar>(), ptrustee?.value?.toCPointer<ByteVar>(), paccessrights?.value?.toCPointer<ByteVar>())

public actual fun getExplicitEntriesFromAclA(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclA(pacl?.value?.toCPointer<ByteVar>(), pccountofexplicitentries?.value?.toCPointer<ByteVar>(), plistofexplicitentries?.value?.toCPointer<ByteVar>())

public actual fun getExplicitEntriesFromAclW(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclW(pacl?.value?.toCPointer<ByteVar>(), pccountofexplicitentries?.value?.toCPointer<ByteVar>(), plistofexplicitentries?.value?.toCPointer<ByteVar>())

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getInheritanceSourceA(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, container, pobjectclassguids?.value?.toCPointer<ByteVar>(), guidcount, pacl?.value?.toCPointer<ByteVar>(), pfnarray?.value?.toCPointer<ByteVar>(), pgenericmapping?.value?.toCPointer<ByteVar>(), pinheritarray?.value?.toCPointer<ByteVar>())

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getInheritanceSourceW(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, container, pobjectclassguids?.value?.toCPointer<ByteVar>(), guidcount, pacl?.value?.toCPointer<ByteVar>(), pfnarray?.value?.toCPointer<ByteVar>(), pgenericmapping?.value?.toCPointer<ByteVar>(), pinheritarray?.value?.toCPointer<ByteVar>())

public actual fun getMultipleTrusteeA(ptrustee: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_authorization_getMultipleTrusteeA(ptrustee?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getMultipleTrusteeOperationA(ptrustee: COpaquePointer?): MultipleTrusteeOperation =
    windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationA(ptrustee?.value?.toCPointer<ByteVar>())

public actual fun getMultipleTrusteeOperationW(ptrustee: COpaquePointer?): MultipleTrusteeOperation =
    windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationW(ptrustee?.value?.toCPointer<ByteVar>())

public actual fun getMultipleTrusteeW(ptrustee: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_authorization_getMultipleTrusteeW(ptrustee?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getNamedSecurityInfoA(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, ppsidowner?.value?.toCPointer<ByteVar>(), ppsidgroup?.value?.toCPointer<ByteVar>(), ppdacl?.value?.toCPointer<ByteVar>(), ppsacl?.value?.toCPointer<ByteVar>(), ppsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getNamedSecurityInfoW(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, ppsidowner?.value?.toCPointer<ByteVar>(), ppsidgroup?.value?.toCPointer<ByteVar>(), ppdacl?.value?.toCPointer<ByteVar>(), ppsacl?.value?.toCPointer<ByteVar>(), ppsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_getSecurityInfo(handle?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, ppsidowner?.value?.toCPointer<ByteVar>(), ppsidgroup?.value?.toCPointer<ByteVar>(), ppdacl?.value?.toCPointer<ByteVar>(), ppsacl?.value?.toCPointer<ByteVar>(), ppsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun getTrusteeFormA(ptrustee: COpaquePointer?): TrusteeForm =
    windowssys_windows_win32_security_authorization_getTrusteeFormA(ptrustee?.value?.toCPointer<ByteVar>())

public actual fun getTrusteeFormW(ptrustee: COpaquePointer?): TrusteeForm =
    windowssys_windows_win32_security_authorization_getTrusteeFormW(ptrustee?.value?.toCPointer<ByteVar>())

public actual fun getTrusteeNameA(ptrustee: COpaquePointer?): Pstr =
    windowssys_windows_win32_security_authorization_getTrusteeNameA(ptrustee?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getTrusteeNameW(ptrustee: COpaquePointer?): Pwstr =
    windowssys_windows_win32_security_authorization_getTrusteeNameW(ptrustee?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getTrusteeTypeA(ptrustee: COpaquePointer?): TrusteeType =
    windowssys_windows_win32_security_authorization_getTrusteeTypeA(ptrustee?.value?.toCPointer<ByteVar>())

public actual fun getTrusteeTypeW(ptrustee: COpaquePointer?): TrusteeType =
    windowssys_windows_win32_security_authorization_getTrusteeTypeW(ptrustee?.value?.toCPointer<ByteVar>())

public actual fun lookupSecurityDescriptorPartsA(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error =
    windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsA(ppowner?.value?.toCPointer<ByteVar>(), ppgroup?.value?.toCPointer<ByteVar>(), pccountofaccessentries?.value?.toCPointer<ByteVar>(), pplistofaccessentries?.value?.toCPointer<ByteVar>(), pccountofauditentries?.value?.toCPointer<ByteVar>(), pplistofauditentries?.value?.toCPointer<ByteVar>(), psd?.value?.toCPointer<ByteVar>())

public actual fun lookupSecurityDescriptorPartsW(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error =
    windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsW(ppowner?.value?.toCPointer<ByteVar>(), ppgroup?.value?.toCPointer<ByteVar>(), pccountofaccessentries?.value?.toCPointer<ByteVar>(), pplistofaccessentries?.value?.toCPointer<ByteVar>(), pccountofauditentries?.value?.toCPointer<ByteVar>(), pplistofauditentries?.value?.toCPointer<ByteVar>(), psd?.value?.toCPointer<ByteVar>())

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_setEntriesInAclA(ccountofexplicitentries, plistofexplicitentries?.value?.toCPointer<ByteVar>(), oldacl?.value?.toCPointer<ByteVar>(), newacl?.value?.toCPointer<ByteVar>())

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_setEntriesInAclW(ccountofexplicitentries, plistofexplicitentries?.value?.toCPointer<ByteVar>(), oldacl?.value?.toCPointer<ByteVar>(), newacl?.value?.toCPointer<ByteVar>())

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_setNamedSecurityInfoA(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, psidowner?.value?.toCPointer<ByteVar>(), psidgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>())

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_setNamedSecurityInfoW(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, psidowner?.value?.toCPointer<ByteVar>(), psidgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>())

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_setSecurityInfo(handle?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, psidowner?.value?.toCPointer<ByteVar>(), psidgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>())

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoA(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, powner?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>(), keepexplicit, 0L.toCPointer<ByteVar>(), progressinvokesetting, args?.value?.toCPointer<ByteVar>())

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoW(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, powner?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>(), keepexplicit, 0L.toCPointer<ByteVar>(), progressinvokesetting, args?.value?.toCPointer<ByteVar>())

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoA(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, powner?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>(), dwaction, 0L.toCPointer<ByteVar>(), progressinvokesetting, args?.value?.toCPointer<ByteVar>())

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoW(pobjectname?.value?.toCPointer<ByteVar>(), objecttype, securityinfo, powner?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>(), pdacl?.value?.toCPointer<ByteVar>(), psacl?.value?.toCPointer<ByteVar>(), dwaction, 0L.toCPointer<ByteVar>(), progressinvokesetting, args?.value?.toCPointer<ByteVar>())
