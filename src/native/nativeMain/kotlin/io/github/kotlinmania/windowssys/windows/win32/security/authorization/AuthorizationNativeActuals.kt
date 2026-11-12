@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzModifySids
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.authorization.cinterop.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr<PsecurityDescriptor>, optionalsecuritydescriptorcount: UInt, preply: MutPtr<AuthzAccessReply>, phaccesscheckresults: MutPtr<AuthzAccessCheckResultsHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(flags, hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), hauditevent.rawAddress.toCPointer<ByteVar>(), psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), optionalsecuritydescriptorarray.rawAddress.toCPointer<ByteVar>(), optionalsecuritydescriptorcount, preply.rawAddress.toCPointer<ByteVar>(), phaccesscheckresults.rawAddress.toCPointer<ByteVar>())

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr<SidAndAttributes>, sidcount: UInt, restrictedsids: ConstPtr<SidAndAttributes>, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), sids.rawAddress.toCPointer<ByteVar>(), sidcount, restrictedsids.rawAddress.toCPointer<ByteVar>(), restrictedsidcount, phnewauthzclientcontext.rawAddress.toCPointer<ByteVar>())

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, preply: MutPtr<AuthzAccessReply>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(flags, haccesscheckresults.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), hauditevent.rawAddress.toCPointer<ByteVar>(), preply.rawAddress.toCPointer<ByteVar>())

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr<AuthzSourceSchemaRegistration>, pdwcount: MutPtr<UInt>, pdwlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(dwflags, buffer.rawAddress.toCPointer<ByteVar>(), pdwcount.rawAddress.toCPointer<ByteVar>(), pdwlength.rawAddress.toCPointer<ByteVar>())

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, sacl: ConstPtr<Acl>, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(authzclientcontext.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), sacl.rawAddress.toCPointer<ByteVar>(), grantedaccess, accessgranted, pbgenerateaudit.rawAddress.toCPointer<ByteVar>())

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(hauditevent.rawAddress.toCPointer<ByteVar>())

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache()

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(hauthzclientcontext.rawAddress.toCPointer<ByteVar>())

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(haccesscheckresults.rawAddress.toCPointer<ByteVar>())

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(hauthzresourcemanager.rawAddress.toCPointer<ByteVar>())

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), infoclass, buffersize, psizerequired.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr<AuthzClientContextHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(usercontext.rawAddress.toCPointer<ByteVar>(), devicecontext.rawAddress.toCPointer<ByteVar>(), phcompoundcontext.rawAddress.toCPointer<ByteVar>())

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phnewauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    0

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    0

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr<Long>, identifier: Luid, dynamicgroupargs: ConstPtr<CVoid>, phauthzclientcontext: MutPtr<AuthzClientContextHandle>): Bool =
    0

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr<AuthzAuditEventHandle>, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(flags, hauditeventtype.rawAddress.toCPointer<ByteVar>(), szoperationtype.rawAddress.toCPointer<ByteVar>(), szobjecttype.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), szadditionalinfo.rawAddress.toCPointer<ByteVar>(), phauditevent.rawAddress.toCPointer<ByteVar>(), dwadditionalparametercount, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr<AuthzAuditEventHandle>, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(flags, hauditeventtype.rawAddress.toCPointer<ByteVar>(), szoperationtype.rawAddress.toCPointer<ByteVar>(), szobjecttype.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), szadditionalinfo.rawAddress.toCPointer<ByteVar>(), szadditionalinfo2.rawAddress.toCPointer<ByteVar>(), phauditevent.rawAddress.toCPointer<ByteVar>(), dwadditionalparametercount, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr<AuthzRpcInitInfoClient>, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(prpcinitinfo.rawAddress.toCPointer<ByteVar>(), phauthzresourcemanager.rawAddress.toCPointer<ByteVar>())

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(flags, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), szresourcemanagername.rawAddress.toCPointer<ByteVar>(), phauthzresourcemanager.rawAddress.toCPointer<ByteVar>())

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr<AuthzInitInfo>, phauthzresourcemanager: MutPtr<AuthzResourceManagerHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(flags, pauthzinitinfo.rawAddress.toCPointer<ByteVar>(), phauthzresourcemanager.rawAddress.toCPointer<ByteVar>())

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr<AuthzSourceSchemaRegistration>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(dwflags, pregistration.rawAddress.toCPointer<ByteVar>())

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr<AuthzSecurityAttributeOperation>, pclaims: ConstPtr<AuthzSecurityAttributesInformation>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), claimclass, pclaimoperations.rawAddress.toCPointer<ByteVar>(), pclaims.rawAddress.toCPointer<ByteVar>())

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr<AuthzSecurityAttributeOperation>, pattributes: ConstPtr<AuthzSecurityAttributesInformation>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), poperations.rawAddress.toCPointer<ByteVar>(), pattributes.rawAddress.toCPointer<ByteVar>())

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr<AuthzSidOperation>, psids: ConstPtr<TokenGroups>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), sidclass, psidoperations.rawAddress.toCPointer<ByteVar>(), psids.rawAddress.toCPointer<ByteVar>())

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr<AuthzAccessRequest>, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr<PsecurityDescriptor>, optionalsecuritydescriptorcount: UInt, preply: ConstPtr<AuthzAccessReply>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(flags, hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), hauditevent.rawAddress.toCPointer<ByteVar>(), psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), optionalsecuritydescriptorarray.rawAddress.toCPointer<ByteVar>(), optionalsecuritydescriptorcount, preply.rawAddress.toCPointer<ByteVar>())

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr<AuthzCapChangeSubscriptionHandle>, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(phcapchangesubscription.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr<AuthzSecurityEventProviderHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(dwflags, szeventsourcename.rawAddress.toCPointer<ByteVar>(), pheventprovider.rawAddress.toCPointer<ByteVar>())

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(dwflags, heventprovider.rawAddress.toCPointer<ByteVar>(), dwauditid, pusersid.rawAddress.toCPointer<ByteVar>(), dwcount, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr<AuditParams>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(dwflags, heventprovider.rawAddress.toCPointer<ByteVar>(), dwauditid, pusersid.rawAddress.toCPointer<ByteVar>(), pparams.rawAddress.toCPointer<ByteVar>())

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr<SidAndAttributes>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(hauthzclientcontext.rawAddress.toCPointer<ByteVar>(), pappcontainersid.rawAddress.toCPointer<ByteVar>(), capabilitycount, pcapabilitysids.rawAddress.toCPointer<ByteVar>())

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(dwflags, szeventsourcename.rawAddress.toCPointer<ByteVar>())

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(hcapchangesubscription.rawAddress.toCPointer<ByteVar>())

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr<AuthzSecurityEventProviderHandle>): Bool =
    windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(dwflags, pheventprovider.rawAddress.toCPointer<ByteVar>())

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr<ExplicitAccessA>, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(pexplicitaccess.rawAddress.toCPointer<ByteVar>(), ptrusteename.rawAddress.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr<ExplicitAccessW>, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(pexplicitaccess.rawAddress.toCPointer<ByteVar>(), ptrusteename.rawAddress.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr<ExplicitAccessA>, ptrusteename: Pcstr, ptrustee: ConstPtr<TrusteeA>, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(pexplicitaccess.rawAddress.toCPointer<ByteVar>(), ptrusteename.rawAddress.toCPointer<ByteVar>(), ptrustee.rawAddress.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr<ExplicitAccessW>, ptrusteename: Pcwstr, ptrustee: ConstPtr<TrusteeW>, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(pexplicitaccess.rawAddress.toCPointer<ByteVar>(), ptrusteename.rawAddress.toCPointer<ByteVar>(), ptrustee.rawAddress.toCPointer<ByteVar>(), accesspermissions, accessmode, inheritance)
}

public actual fun buildImpersonateTrusteeA(ptrustee: MutPtr<TrusteeA>, pimpersonatetrustee: ConstPtr<TrusteeA>) {
    windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(ptrustee.rawAddress.toCPointer<ByteVar>(), pimpersonatetrustee.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildImpersonateTrusteeW(ptrustee: MutPtr<TrusteeW>, pimpersonatetrustee: ConstPtr<TrusteeW>) {
    windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(ptrustee.rawAddress.toCPointer<ByteVar>(), pimpersonatetrustee.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildSecurityDescriptorA(powner: ConstPtr<TrusteeA>, pgroup: ConstPtr<TrusteeA>, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr<ExplicitAccessA>, ccountofauditentries: UInt, plistofauditentries: ConstPtr<ExplicitAccessA>, poldsd: PsecurityDescriptor, psizenewsd: MutPtr<UInt>, pnewsd: MutPtr<PsecurityDescriptor>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(powner.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), ccountofaccessentries, plistofaccessentries.rawAddress.toCPointer<ByteVar>(), ccountofauditentries, plistofauditentries.rawAddress.toCPointer<ByteVar>(), poldsd.rawAddress.toCPointer<ByteVar>(), psizenewsd.rawAddress.toCPointer<ByteVar>(), pnewsd.rawAddress.toCPointer<ByteVar>())

public actual fun buildSecurityDescriptorW(powner: ConstPtr<TrusteeW>, pgroup: ConstPtr<TrusteeW>, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr<ExplicitAccessW>, ccountofauditentries: UInt, plistofauditentries: ConstPtr<ExplicitAccessW>, poldsd: PsecurityDescriptor, psizenewsd: MutPtr<UInt>, pnewsd: MutPtr<PsecurityDescriptor>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(powner.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), ccountofaccessentries, plistofaccessentries.rawAddress.toCPointer<ByteVar>(), ccountofauditentries, plistofauditentries.rawAddress.toCPointer<ByteVar>(), poldsd.rawAddress.toCPointer<ByteVar>(), psizenewsd.rawAddress.toCPointer<ByteVar>(), pnewsd.rawAddress.toCPointer<ByteVar>())

public actual fun buildTrusteeWithNameA(ptrustee: MutPtr<TrusteeA>, pname: Pcstr) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(ptrustee.rawAddress.toCPointer<ByteVar>(), pname.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithNameW(ptrustee: MutPtr<TrusteeW>, pname: Pcwstr) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(ptrustee.rawAddress.toCPointer<ByteVar>(), pname.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr<TrusteeA>, pobjname: ConstPtr<ObjectsAndNameA>, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(ptrustee.rawAddress.toCPointer<ByteVar>(), pobjname.rawAddress.toCPointer<ByteVar>(), objecttype, objecttypename.rawAddress.toCPointer<ByteVar>(), inheritedobjecttypename.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr<TrusteeW>, pobjname: ConstPtr<ObjectsAndNameW>, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(ptrustee.rawAddress.toCPointer<ByteVar>(), pobjname.rawAddress.toCPointer<ByteVar>(), objecttype, objecttypename.rawAddress.toCPointer<ByteVar>(), inheritedobjecttypename.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr<TrusteeA>, pobjsid: ConstPtr<ObjectsAndSid>, pobjectguid: ConstPtr<Guid>, pinheritedobjectguid: ConstPtr<Guid>, psid: Psid) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(ptrustee.rawAddress.toCPointer<ByteVar>(), pobjsid.rawAddress.toCPointer<ByteVar>(), pobjectguid.rawAddress.toCPointer<ByteVar>(), pinheritedobjectguid.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr<TrusteeW>, pobjsid: ConstPtr<ObjectsAndSid>, pobjectguid: ConstPtr<Guid>, pinheritedobjectguid: ConstPtr<Guid>, psid: Psid) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(ptrustee.rawAddress.toCPointer<ByteVar>(), pobjsid.rawAddress.toCPointer<ByteVar>(), pobjectguid.rawAddress.toCPointer<ByteVar>(), pinheritedobjectguid.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithSidA(ptrustee: MutPtr<TrusteeA>, psid: Psid) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(ptrustee.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())
}

public actual fun buildTrusteeWithSidW(ptrustee: MutPtr<TrusteeW>, psid: Psid) {
    windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(ptrustee.rawAddress.toCPointer<ByteVar>(), psid.rawAddress.toCPointer<ByteVar>())
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr<Pstr>, stringsecuritydescriptorlen: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor.rawAddress.toCPointer<ByteVar>(), requestedstringsdrevision, securityinformation, stringsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), stringsecuritydescriptorlen.rawAddress.toCPointer<ByteVar>())

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr<Pwstr>, stringsecuritydescriptorlen: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor.rawAddress.toCPointer<ByteVar>(), requestedstringsdrevision, securityinformation, stringsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), stringsecuritydescriptorlen.rawAddress.toCPointer<ByteVar>())

public actual fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr<Pstr>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(sid.rawAddress.toCPointer<ByteVar>(), stringsid.rawAddress.toCPointer<ByteVar>())

public actual fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr<Pwstr>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(sid.rawAddress.toCPointer<ByteVar>(), stringsid.rawAddress.toCPointer<ByteVar>())

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorsize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), stringsdrevision, securitydescriptor.rawAddress.toCPointer<ByteVar>(), securitydescriptorsize.rawAddress.toCPointer<ByteVar>())

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorsize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), stringsdrevision, securitydescriptor.rawAddress.toCPointer<ByteVar>(), securitydescriptorsize.rawAddress.toCPointer<ByteVar>())

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr<Psid>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(stringsid.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>())

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr<Psid>): Bool =
    windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(stringsid.rawAddress.toCPointer<ByteVar>(), sid.rawAddress.toCPointer<ByteVar>())

public actual fun freeInheritedFromArray(pinheritarray: ConstPtr<InheritedFromw>, acecnt: UShort, pfnarray: ConstPtr<FnObjectMgrFuncts>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(pinheritarray.rawAddress.toCPointer<ByteVar>(), acecnt, pfnarray.rawAddress.toCPointer<ByteVar>())

public actual fun getAuditedPermissionsFromAclA(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeA>, psuccessfulauditedrights: MutPtr<UInt>, pfailedauditrights: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(pacl.rawAddress.toCPointer<ByteVar>(), ptrustee.rawAddress.toCPointer<ByteVar>(), psuccessfulauditedrights.rawAddress.toCPointer<ByteVar>(), pfailedauditrights.rawAddress.toCPointer<ByteVar>())

public actual fun getAuditedPermissionsFromAclW(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeW>, psuccessfulauditedrights: MutPtr<UInt>, pfailedauditrights: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(pacl.rawAddress.toCPointer<ByteVar>(), ptrustee.rawAddress.toCPointer<ByteVar>(), psuccessfulauditedrights.rawAddress.toCPointer<ByteVar>(), pfailedauditrights.rawAddress.toCPointer<ByteVar>())

public actual fun getEffectiveRightsFromAclA(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeA>, paccessrights: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(pacl.rawAddress.toCPointer<ByteVar>(), ptrustee.rawAddress.toCPointer<ByteVar>(), paccessrights.rawAddress.toCPointer<ByteVar>())

public actual fun getEffectiveRightsFromAclW(pacl: ConstPtr<Acl>, ptrustee: ConstPtr<TrusteeW>, paccessrights: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(pacl.rawAddress.toCPointer<ByteVar>(), ptrustee.rawAddress.toCPointer<ByteVar>(), paccessrights.rawAddress.toCPointer<ByteVar>())

public actual fun getExplicitEntriesFromAclA(pacl: ConstPtr<Acl>, pccountofexplicitentries: MutPtr<UInt>, plistofexplicitentries: MutPtr<MutPtr<ExplicitAccessA>>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(pacl.rawAddress.toCPointer<ByteVar>(), pccountofexplicitentries.rawAddress.toCPointer<ByteVar>(), plistofexplicitentries.rawAddress.toCPointer<ByteVar>())

public actual fun getExplicitEntriesFromAclW(pacl: ConstPtr<Acl>, pccountofexplicitentries: MutPtr<UInt>, plistofexplicitentries: MutPtr<MutPtr<ExplicitAccessW>>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(pacl.rawAddress.toCPointer<ByteVar>(), pccountofexplicitentries.rawAddress.toCPointer<ByteVar>(), plistofexplicitentries.rawAddress.toCPointer<ByteVar>())

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, pacl: ConstPtr<Acl>, pfnarray: ConstPtr<FnObjectMgrFuncts>, pgenericmapping: ConstPtr<GenericMapping>, pinheritarray: MutPtr<InheritedFroma>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, container, pobjectclassguids.rawAddress.toCPointer<ByteVar>(), guidcount, pacl.rawAddress.toCPointer<ByteVar>(), pfnarray.rawAddress.toCPointer<ByteVar>(), pgenericmapping.rawAddress.toCPointer<ByteVar>(), pinheritarray.rawAddress.toCPointer<ByteVar>())

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr<ConstPtr<Guid>>, guidcount: UInt, pacl: ConstPtr<Acl>, pfnarray: ConstPtr<FnObjectMgrFuncts>, pgenericmapping: ConstPtr<GenericMapping>, pinheritarray: MutPtr<InheritedFromw>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, container, pobjectclassguids.rawAddress.toCPointer<ByteVar>(), guidcount, pacl.rawAddress.toCPointer<ByteVar>(), pfnarray.rawAddress.toCPointer<ByteVar>(), pgenericmapping.rawAddress.toCPointer<ByteVar>(), pinheritarray.rawAddress.toCPointer<ByteVar>())

public actual fun getMultipleTrusteeA(ptrustee: ConstPtr<TrusteeA>): MutPtr<TrusteeA> =
    MutPtr(windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(ptrustee.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getMultipleTrusteeOperationA(ptrustee: ConstPtr<TrusteeA>): MultipleTrusteeOperation =
    windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(ptrustee.rawAddress.toCPointer<ByteVar>())

public actual fun getMultipleTrusteeOperationW(ptrustee: ConstPtr<TrusteeW>): MultipleTrusteeOperation =
    windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(ptrustee.rawAddress.toCPointer<ByteVar>())

public actual fun getMultipleTrusteeW(ptrustee: ConstPtr<TrusteeW>): MutPtr<TrusteeW> =
    MutPtr(windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(ptrustee.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, ppsidowner.rawAddress.toCPointer<ByteVar>(), ppsidgroup.rawAddress.toCPointer<ByteVar>(), ppdacl.rawAddress.toCPointer<ByteVar>(), ppsacl.rawAddress.toCPointer<ByteVar>(), ppsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, ppsidowner.rawAddress.toCPointer<ByteVar>(), ppsidgroup.rawAddress.toCPointer<ByteVar>(), ppdacl.rawAddress.toCPointer<ByteVar>(), ppsacl.rawAddress.toCPointer<ByteVar>(), ppsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr<Psid>, ppsidgroup: MutPtr<Psid>, ppdacl: MutPtr<MutPtr<Acl>>, ppsacl: MutPtr<MutPtr<Acl>>, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(handle.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, ppsidowner.rawAddress.toCPointer<ByteVar>(), ppsidgroup.rawAddress.toCPointer<ByteVar>(), ppdacl.rawAddress.toCPointer<ByteVar>(), ppsacl.rawAddress.toCPointer<ByteVar>(), ppsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun getTrusteeFormA(ptrustee: ConstPtr<TrusteeA>): TrusteeForm =
    windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(ptrustee.rawAddress.toCPointer<ByteVar>())

public actual fun getTrusteeFormW(ptrustee: ConstPtr<TrusteeW>): TrusteeForm =
    windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(ptrustee.rawAddress.toCPointer<ByteVar>())

public actual fun getTrusteeNameA(ptrustee: ConstPtr<TrusteeA>): Pstr =
    MutPtr(windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(ptrustee.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getTrusteeNameW(ptrustee: ConstPtr<TrusteeW>): Pwstr =
    MutPtr(windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(ptrustee.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getTrusteeTypeA(ptrustee: ConstPtr<TrusteeA>): TrusteeType =
    windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(ptrustee.rawAddress.toCPointer<ByteVar>())

public actual fun getTrusteeTypeW(ptrustee: ConstPtr<TrusteeW>): TrusteeType =
    windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(ptrustee.rawAddress.toCPointer<ByteVar>())

public actual fun lookupSecurityDescriptorPartsA(ppowner: MutPtr<MutPtr<TrusteeA>>, ppgroup: MutPtr<MutPtr<TrusteeA>>, pccountofaccessentries: MutPtr<UInt>, pplistofaccessentries: MutPtr<MutPtr<ExplicitAccessA>>, pccountofauditentries: MutPtr<UInt>, pplistofauditentries: MutPtr<MutPtr<ExplicitAccessA>>, psd: PsecurityDescriptor): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(ppowner.rawAddress.toCPointer<ByteVar>(), ppgroup.rawAddress.toCPointer<ByteVar>(), pccountofaccessentries.rawAddress.toCPointer<ByteVar>(), pplistofaccessentries.rawAddress.toCPointer<ByteVar>(), pccountofauditentries.rawAddress.toCPointer<ByteVar>(), pplistofauditentries.rawAddress.toCPointer<ByteVar>(), psd.rawAddress.toCPointer<ByteVar>())

public actual fun lookupSecurityDescriptorPartsW(ppowner: MutPtr<MutPtr<TrusteeW>>, ppgroup: MutPtr<MutPtr<TrusteeW>>, pccountofaccessentries: MutPtr<UInt>, pplistofaccessentries: MutPtr<MutPtr<ExplicitAccessW>>, pccountofauditentries: MutPtr<UInt>, pplistofauditentries: MutPtr<MutPtr<ExplicitAccessW>>, psd: PsecurityDescriptor): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(ppowner.rawAddress.toCPointer<ByteVar>(), ppgroup.rawAddress.toCPointer<ByteVar>(), pccountofaccessentries.rawAddress.toCPointer<ByteVar>(), pplistofaccessentries.rawAddress.toCPointer<ByteVar>(), pccountofauditentries.rawAddress.toCPointer<ByteVar>(), pplistofauditentries.rawAddress.toCPointer<ByteVar>(), psd.rawAddress.toCPointer<ByteVar>())

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr<ExplicitAccessA>, oldacl: ConstPtr<Acl>, newacl: MutPtr<MutPtr<Acl>>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(ccountofexplicitentries, plistofexplicitentries.rawAddress.toCPointer<ByteVar>(), oldacl.rawAddress.toCPointer<ByteVar>(), newacl.rawAddress.toCPointer<ByteVar>())

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr<ExplicitAccessW>, oldacl: ConstPtr<Acl>, newacl: MutPtr<MutPtr<Acl>>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(ccountofexplicitentries, plistofexplicitentries.rawAddress.toCPointer<ByteVar>(), oldacl.rawAddress.toCPointer<ByteVar>(), newacl.rawAddress.toCPointer<ByteVar>())

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, psidowner.rawAddress.toCPointer<ByteVar>(), psidgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>())

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, psidowner.rawAddress.toCPointer<ByteVar>(), psidgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>())

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(handle.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, psidowner.rawAddress.toCPointer<ByteVar>(), psidgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>())

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, powner.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>(), keepexplicit, 0L.toCPointer<ByteVar>(), progressinvokesetting, args.rawAddress.toCPointer<ByteVar>())

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, powner.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>(), keepexplicit, 0L.toCPointer<ByteVar>(), progressinvokesetting, args.rawAddress.toCPointer<ByteVar>())

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, powner.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>(), dwaction, 0L.toCPointer<ByteVar>(), progressinvokesetting, args.rawAddress.toCPointer<ByteVar>())

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr<Acl>, psacl: ConstPtr<Acl>, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(pobjectname.rawAddress.toCPointer<ByteVar>(), objecttype, securityinfo, powner.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>(), pdacl.rawAddress.toCPointer<ByteVar>(), psacl.rawAddress.toCPointer<ByteVar>(), dwaction, 0L.toCPointer<ByteVar>(), progressinvokesetting, args.rawAddress.toCPointer<ByteVar>())
