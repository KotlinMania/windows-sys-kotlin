@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SecurityAuthorizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzAccessCheck(flags: Int, hauthzclientcontext: Long, prequest: Long, hauditevent: Long, psecuritydescriptor: Long, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: Int, preply: Long, phaccesscheckresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzAddSidsToContext(hauthzclientcontext: Long, sids: Long, sidcount: Int, restrictedsids: Long, restrictedsidcount: Int, phnewauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzCachedAccessCheck(flags: Int, haccesscheckresults: Long, prequest: Long, hauditevent: Long, preply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzEnumerateSecurityEventSources(dwflags: Int, buffer: Long, pdwcount: Long, pdwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzEvaluateSacl(authzclientcontext: Long, prequest: Long, sacl: Long, grantedaccess: Int, accessgranted: Int, pbgenerateaudit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzFreeAuditEvent(hauditevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzFreeCentralAccessPolicyCache(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzFreeContext(hauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzFreeHandle(haccesscheckresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzFreeResourceManager(hauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzGetInformationFromContext(hauthzclientcontext: Long, infoclass: Int, buffersize: Int, psizerequired: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInitializeCompoundContext(usercontext: Long, devicecontext: Long, phcompoundcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent(flags: Int, hauditeventtype: Long, szoperationtype: Long, szobjecttype: Long, szobjectname: Long, szadditionalinfo: Long, phauditevent: Long, dwadditionalparametercount: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent2(flags: Int, hauditeventtype: Long, szoperationtype: Long, szobjecttype: Long, szobjectname: Long, szadditionalinfo: Long, szadditionalinfo2: Long, phauditevent: Long, dwadditionalparametercount: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInitializeRemoteResourceManager(prpcinitinfo: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInitializeResourceManager(flags: Int, pfndynamicaccesscheck: Long, pfncomputedynamicgroups: Long, pfnfreedynamicgroups: Long, szresourcemanagername: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInitializeResourceManagerEx(flags: Int, pauthzinitinfo: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzInstallSecurityEventSource(dwflags: Int, pregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzModifyClaims(hauthzclientcontext: Long, claimclass: Int, pclaimoperations: Long, pclaims: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzModifySecurityAttributes(hauthzclientcontext: Long, poperations: Long, pattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzModifySids(hauthzclientcontext: Long, sidclass: Int, psidoperations: Long, psids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzOpenObjectAudit(flags: Int, hauthzclientcontext: Long, prequest: Long, hauditevent: Long, psecuritydescriptor: Long, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: Int, preply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: Long, pcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzRegisterSecurityEventSource(dwflags: Int, szeventsourcename: Long, pheventprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzReportSecurityEvent(dwflags: Int, heventprovider: Long, dwauditid: Int, pusersid: Long, dwcount: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzReportSecurityEventFromParams(dwflags: Int, heventprovider: Long, dwauditid: Int, pusersid: Long, pparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzSetAppContainerInformation(hauthzclientcontext: Long, pappcontainersid: Long, capabilitycount: Int, pcapabilitysids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzUninstallSecurityEventSource(dwflags: Int, szeventsourcename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzUnregisterCapChangeNotification(hcapchangesubscription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_authzUnregisterSecurityEventSource(dwflags: Int, pheventprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: Long, ptrustee: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: Long, ptrustee: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: Int, plistofaccessentries: Long, ccountofauditentries: Int, plistofauditentries: Long, poldsd: Long, psizenewsd: Long, pnewsd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: Int, plistofaccessentries: Long, ccountofauditentries: Int, plistofauditentries: Long, poldsd: Long, psizenewsd: Long, pnewsd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithNameA(ptrustee: Long, pname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithNameW(ptrustee: Long, pname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: Int, objecttypename: Long, inheritedobjecttypename: Long, name: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: Int, objecttypename: Long, inheritedobjecttypename: Long, name: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithSidA(ptrustee: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_buildTrusteeWithSidW(ptrustee: Long, psid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: Long, requestedstringsdrevision: Int, securityinformation: Int, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: Long, requestedstringsdrevision: Int, securityinformation: Int, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertSidToStringSidA(sid: Long, stringsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertSidToStringSidW(sid: Long, stringsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Long, stringsdrevision: Int, securitydescriptor: Long, securitydescriptorsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Long, stringsdrevision: Int, securitydescriptor: Long, securitydescriptorsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertStringSidToSidA(stringsid: Long, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_convertStringSidToSidW(stringsid: Long, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_freeInheritedFromArray(pinheritarray: Long, acecnt: Short, pfnarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getInheritanceSourceA(pobjectname: Long, objecttype: Int, securityinfo: Int, container: Int, pobjectclassguids: Long, guidcount: Int, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getInheritanceSourceW(pobjectname: Long, objecttype: Int, securityinfo: Int, container: Int, pobjectclassguids: Long, guidcount: Int, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getMultipleTrusteeA(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getMultipleTrusteeW(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getSecurityInfo(handle: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getTrusteeFormA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getTrusteeFormW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getTrusteeNameA(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getTrusteeNameW(ptrustee: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getTrusteeTypeA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_getTrusteeTypeW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_setEntriesInAclA(ccountofexplicitentries: Int, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_setEntriesInAclW(ccountofexplicitentries: Int, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_setNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_setNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_setSecurityInfo(handle: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, keepexplicit: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, keepexplicit: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, dwaction: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, dwaction: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int
}

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?, phaccesscheckresults: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzAccessCheck(flags.toInt(), (hauthzclientcontext?.value ?: 0L), (prequest?.value ?: 0L), (hauditevent?.value ?: 0L), (psecuritydescriptor?.value ?: 0L), (optionalsecuritydescriptorarray?.value ?: 0L), optionalsecuritydescriptorcount.toInt(), (preply?.value ?: 0L), (phaccesscheckresults?.value ?: 0L))

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: COpaquePointer?, sidcount: UInt, restrictedsids: COpaquePointer?, restrictedsidcount: UInt, phnewauthzclientcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzAddSidsToContext((hauthzclientcontext?.value ?: 0L), (sids?.value ?: 0L), sidcount.toInt(), (restrictedsids?.value ?: 0L), restrictedsidcount.toInt(), (phnewauthzclientcontext?.value ?: 0L))

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, preply: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzCachedAccessCheck(flags.toInt(), (haccesscheckresults?.value ?: 0L), (prequest?.value ?: 0L), (hauditevent?.value ?: 0L), (preply?.value ?: 0L))

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: COpaquePointer?, pdwcount: COpaquePointer?, pdwlength: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzEnumerateSecurityEventSources(dwflags.toInt(), (buffer?.value ?: 0L), (pdwcount?.value ?: 0L), (pdwlength?.value ?: 0L))

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, sacl: COpaquePointer?, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzEvaluateSacl((authzclientcontext?.value ?: 0L), (prequest?.value ?: 0L), (sacl?.value ?: 0L), grantedaccess.toInt(), accessgranted, (pbgenerateaudit?.value ?: 0L))

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzFreeAuditEvent((hauditevent?.value ?: 0L))

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzFreeCentralAccessPolicyCache()

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzFreeContext((hauthzclientcontext?.value ?: 0L))

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzFreeHandle((haccesscheckresults?.value ?: 0L))

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzFreeResourceManager((hauthzresourcemanager?.value ?: 0L))

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: COpaquePointer?, buffer: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzGetInformationFromContext((hauthzclientcontext?.value ?: 0L), infoclass, buffersize.toInt(), (psizerequired?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInitializeCompoundContext((usercontext?.value ?: 0L), (devicecontext?.value ?: 0L), (phcompoundcontext?.value ?: 0L))

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phnewauthzclientcontext: COpaquePointer?): Bool =
    0

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool =
    0

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: COpaquePointer?, identifier: Luid, dynamicgroupargs: COpaquePointer?, phauthzclientcontext: COpaquePointer?): Bool =
    0

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent(flags.toInt(), (hauditeventtype?.value ?: 0L), (szoperationtype?.value ?: 0L), (szobjecttype?.value ?: 0L), (szobjectname?.value ?: 0L), (szadditionalinfo?.value ?: 0L), (phauditevent?.value ?: 0L), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: COpaquePointer?, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent2(flags.toInt(), (hauditeventtype?.value ?: 0L), (szoperationtype?.value ?: 0L), (szobjecttype?.value ?: 0L), (szobjectname?.value ?: 0L), (szadditionalinfo?.value ?: 0L), (szadditionalinfo2?.value ?: 0L), (phauditevent?.value ?: 0L), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInitializeRemoteResourceManager((prpcinitinfo?.value ?: 0L), (phauthzresourcemanager?.value ?: 0L))

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInitializeResourceManager(flags.toInt(), 0L, 0L, 0L, (szresourcemanagername?.value ?: 0L), (phauthzresourcemanager?.value ?: 0L))

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: COpaquePointer?, phauthzresourcemanager: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInitializeResourceManagerEx(flags.toInt(), (pauthzinitinfo?.value ?: 0L), (phauthzresourcemanager?.value ?: 0L))

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzInstallSecurityEventSource(dwflags.toInt(), (pregistration?.value ?: 0L))

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: COpaquePointer?, pclaims: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzModifyClaims((hauthzclientcontext?.value ?: 0L), claimclass, (pclaimoperations?.value ?: 0L), (pclaims?.value ?: 0L))

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: COpaquePointer?, pattributes: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzModifySecurityAttributes((hauthzclientcontext?.value ?: 0L), (poperations?.value ?: 0L), (pattributes?.value ?: 0L))

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: COpaquePointer?, psids: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzModifySids((hauthzclientcontext?.value ?: 0L), sidclass, (psidoperations?.value ?: 0L), (psids?.value ?: 0L))

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: COpaquePointer?, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: COpaquePointer?, optionalsecuritydescriptorcount: UInt, preply: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzOpenObjectAudit(flags.toInt(), (hauthzclientcontext?.value ?: 0L), (prequest?.value ?: 0L), (hauditevent?.value ?: 0L), (psecuritydescriptor?.value ?: 0L), (optionalsecuritydescriptorarray?.value ?: 0L), optionalsecuritydescriptorcount.toInt(), (preply?.value ?: 0L))

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: COpaquePointer?, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzRegisterCapChangeNotification((phcapchangesubscription?.value ?: 0L), 0L, (pcallbackcontext?.value ?: 0L))

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzRegisterSecurityEventSource(dwflags.toInt(), (szeventsourcename?.value ?: 0L), (pheventprovider?.value ?: 0L))

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzReportSecurityEvent(dwflags.toInt(), (heventprovider?.value ?: 0L), dwauditid.toInt(), (pusersid?.value ?: 0L), dwcount.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzReportSecurityEventFromParams(dwflags.toInt(), (heventprovider?.value ?: 0L), dwauditid.toInt(), (pusersid?.value ?: 0L), (pparams?.value ?: 0L))

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzSetAppContainerInformation((hauthzclientcontext?.value ?: 0L), (pappcontainersid?.value ?: 0L), capabilitycount.toInt(), (pcapabilitysids?.value ?: 0L))

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzUninstallSecurityEventSource(dwflags.toInt(), (szeventsourcename?.value ?: 0L))

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzUnregisterCapChangeNotification((hcapchangesubscription?.value ?: 0L))

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_authzUnregisterSecurityEventSource(dwflags.toInt(), (pheventprovider?.value ?: 0L))

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameA((pexplicitaccess?.value ?: 0L), (ptrusteename?.value ?: 0L), accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameW((pexplicitaccess?.value ?: 0L), (ptrusteename?.value ?: 0L), accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: COpaquePointer?, ptrusteename: Pcstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameA((pexplicitaccess?.value ?: 0L), (ptrusteename?.value ?: 0L), (ptrustee?.value ?: 0L), accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: COpaquePointer?, ptrusteename: Pcwstr, ptrustee: COpaquePointer?, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameW((pexplicitaccess?.value ?: 0L), (ptrusteename?.value ?: 0L), (ptrustee?.value ?: 0L), accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildImpersonateTrusteeA(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildImpersonateTrusteeA((ptrustee?.value ?: 0L), (pimpersonatetrustee?.value ?: 0L))
}

public actual fun buildImpersonateTrusteeW(ptrustee: COpaquePointer?, pimpersonatetrustee: COpaquePointer?) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildImpersonateTrusteeW((ptrustee?.value ?: 0L), (pimpersonatetrustee?.value ?: 0L))
}

public actual fun buildSecurityDescriptorA(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildSecurityDescriptorA((powner?.value ?: 0L), (pgroup?.value ?: 0L), ccountofaccessentries.toInt(), (plistofaccessentries?.value ?: 0L), ccountofauditentries.toInt(), (plistofauditentries?.value ?: 0L), (poldsd?.value ?: 0L), (psizenewsd?.value ?: 0L), (pnewsd?.value ?: 0L)).toUInt()

public actual fun buildSecurityDescriptorW(powner: COpaquePointer?, pgroup: COpaquePointer?, ccountofaccessentries: UInt, plistofaccessentries: COpaquePointer?, ccountofauditentries: UInt, plistofauditentries: COpaquePointer?, poldsd: PsecurityDescriptor, psizenewsd: COpaquePointer?, pnewsd: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildSecurityDescriptorW((powner?.value ?: 0L), (pgroup?.value ?: 0L), ccountofaccessentries.toInt(), (plistofaccessentries?.value ?: 0L), ccountofauditentries.toInt(), (plistofauditentries?.value ?: 0L), (poldsd?.value ?: 0L), (psizenewsd?.value ?: 0L), (pnewsd?.value ?: 0L)).toUInt()

public actual fun buildTrusteeWithNameA(ptrustee: COpaquePointer?, pname: Pcstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithNameA((ptrustee?.value ?: 0L), (pname?.value ?: 0L))
}

public actual fun buildTrusteeWithNameW(ptrustee: COpaquePointer?, pname: Pcwstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithNameW((ptrustee?.value ?: 0L), (pname?.value ?: 0L))
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameA((ptrustee?.value ?: 0L), (pobjname?.value ?: 0L), objecttype, (objecttypename?.value ?: 0L), (inheritedobjecttypename?.value ?: 0L), (name?.value ?: 0L))
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: COpaquePointer?, pobjname: COpaquePointer?, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameW((ptrustee?.value ?: 0L), (pobjname?.value ?: 0L), objecttype, (objecttypename?.value ?: 0L), (inheritedobjecttypename?.value ?: 0L), (name?.value ?: 0L))
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidA((ptrustee?.value ?: 0L), (pobjsid?.value ?: 0L), (pobjectguid?.value ?: 0L), (pinheritedobjectguid?.value ?: 0L), (psid?.value ?: 0L))
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: COpaquePointer?, pobjsid: COpaquePointer?, pobjectguid: COpaquePointer?, pinheritedobjectguid: COpaquePointer?, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidW((ptrustee?.value ?: 0L), (pobjsid?.value ?: 0L), (pobjectguid?.value ?: 0L), (pinheritedobjectguid?.value ?: 0L), (psid?.value ?: 0L))
}

public actual fun buildTrusteeWithSidA(ptrustee: COpaquePointer?, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithSidA((ptrustee?.value ?: 0L), (psid?.value ?: 0L))
}

public actual fun buildTrusteeWithSidW(ptrustee: COpaquePointer?, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_buildTrusteeWithSidW((ptrustee?.value ?: 0L), (psid?.value ?: 0L))
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorA((securitydescriptor?.value ?: 0L), requestedstringsdrevision.toInt(), securityinformation.toInt(), (stringsecuritydescriptor?.value ?: 0L), (stringsecuritydescriptorlen?.value ?: 0L))

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: COpaquePointer?, stringsecuritydescriptorlen: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorW((securitydescriptor?.value ?: 0L), requestedstringsdrevision.toInt(), securityinformation.toInt(), (stringsecuritydescriptor?.value ?: 0L), (stringsecuritydescriptorlen?.value ?: 0L))

public actual fun convertSidToStringSidA(sid: Psid, stringsid: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertSidToStringSidA((sid?.value ?: 0L), (stringsid?.value ?: 0L))

public actual fun convertSidToStringSidW(sid: Psid, stringsid: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertSidToStringSidW((sid?.value ?: 0L), (stringsid?.value ?: 0L))

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorA((stringsecuritydescriptor?.value ?: 0L), stringsdrevision.toInt(), (securitydescriptor?.value ?: 0L), (securitydescriptorsize?.value ?: 0L))

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: COpaquePointer?, securitydescriptorsize: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorW((stringsecuritydescriptor?.value ?: 0L), stringsdrevision.toInt(), (securitydescriptor?.value ?: 0L), (securitydescriptorsize?.value ?: 0L))

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertStringSidToSidA((stringsid?.value ?: 0L), (sid?.value ?: 0L))

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_convertStringSidToSidW((stringsid?.value ?: 0L), (sid?.value ?: 0L))

public actual fun freeInheritedFromArray(pinheritarray: COpaquePointer?, acecnt: UShort, pfnarray: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_freeInheritedFromArray((pinheritarray?.value ?: 0L), acecnt.toShort(), (pfnarray?.value ?: 0L)).toUInt()

public actual fun getAuditedPermissionsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclA((pacl?.value ?: 0L), (ptrustee?.value ?: 0L), (psuccessfulauditedrights?.value ?: 0L), (pfailedauditrights?.value ?: 0L)).toUInt()

public actual fun getAuditedPermissionsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, psuccessfulauditedrights: COpaquePointer?, pfailedauditrights: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclW((pacl?.value ?: 0L), (ptrustee?.value ?: 0L), (psuccessfulauditedrights?.value ?: 0L), (pfailedauditrights?.value ?: 0L)).toUInt()

public actual fun getEffectiveRightsFromAclA(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclA((pacl?.value ?: 0L), (ptrustee?.value ?: 0L), (paccessrights?.value ?: 0L)).toUInt()

public actual fun getEffectiveRightsFromAclW(pacl: COpaquePointer?, ptrustee: COpaquePointer?, paccessrights: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclW((pacl?.value ?: 0L), (ptrustee?.value ?: 0L), (paccessrights?.value ?: 0L)).toUInt()

public actual fun getExplicitEntriesFromAclA(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclA((pacl?.value ?: 0L), (pccountofexplicitentries?.value ?: 0L), (plistofexplicitentries?.value ?: 0L)).toUInt()

public actual fun getExplicitEntriesFromAclW(pacl: COpaquePointer?, pccountofexplicitentries: COpaquePointer?, plistofexplicitentries: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclW((pacl?.value ?: 0L), (pccountofexplicitentries?.value ?: 0L), (plistofexplicitentries?.value ?: 0L)).toUInt()

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getInheritanceSourceA((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), container, (pobjectclassguids?.value ?: 0L), guidcount.toInt(), (pacl?.value ?: 0L), (pfnarray?.value ?: 0L), (pgenericmapping?.value ?: 0L), (pinheritarray?.value ?: 0L)).toUInt()

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: COpaquePointer?, guidcount: UInt, pacl: COpaquePointer?, pfnarray: COpaquePointer?, pgenericmapping: COpaquePointer?, pinheritarray: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getInheritanceSourceW((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), container, (pobjectclassguids?.value ?: 0L), guidcount.toInt(), (pacl?.value ?: 0L), (pfnarray?.value ?: 0L), (pgenericmapping?.value ?: 0L), (pinheritarray?.value ?: 0L)).toUInt()

public actual fun getMultipleTrusteeA(ptrustee: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getMultipleTrusteeA((ptrustee?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getMultipleTrusteeOperationA(ptrustee: COpaquePointer?): MultipleTrusteeOperation =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationA((ptrustee?.value ?: 0L))

public actual fun getMultipleTrusteeOperationW(ptrustee: COpaquePointer?): MultipleTrusteeOperation =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationW((ptrustee?.value ?: 0L))

public actual fun getMultipleTrusteeW(ptrustee: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getMultipleTrusteeW((ptrustee?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getNamedSecurityInfoA((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (ppsidowner?.value ?: 0L), (ppsidgroup?.value ?: 0L), (ppdacl?.value ?: 0L), (ppsacl?.value ?: 0L), (ppsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getNamedSecurityInfoW((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (ppsidowner?.value ?: 0L), (ppsidgroup?.value ?: 0L), (ppdacl?.value ?: 0L), (ppsacl?.value ?: 0L), (ppsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: COpaquePointer?, ppsidgroup: COpaquePointer?, ppdacl: COpaquePointer?, ppsacl: COpaquePointer?, ppsecuritydescriptor: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getSecurityInfo((handle?.value ?: 0L), objecttype, securityinfo.toInt(), (ppsidowner?.value ?: 0L), (ppsidgroup?.value ?: 0L), (ppdacl?.value ?: 0L), (ppsacl?.value ?: 0L), (ppsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun getTrusteeFormA(ptrustee: COpaquePointer?): TrusteeForm =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getTrusteeFormA((ptrustee?.value ?: 0L))

public actual fun getTrusteeFormW(ptrustee: COpaquePointer?): TrusteeForm =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getTrusteeFormW((ptrustee?.value ?: 0L))

public actual fun getTrusteeNameA(ptrustee: COpaquePointer?): Pstr =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getTrusteeNameA((ptrustee?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getTrusteeNameW(ptrustee: COpaquePointer?): Pwstr =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getTrusteeNameW((ptrustee?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getTrusteeTypeA(ptrustee: COpaquePointer?): TrusteeType =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getTrusteeTypeA((ptrustee?.value ?: 0L))

public actual fun getTrusteeTypeW(ptrustee: COpaquePointer?): TrusteeType =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_getTrusteeTypeW((ptrustee?.value ?: 0L))

public actual fun lookupSecurityDescriptorPartsA(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsA((ppowner?.value ?: 0L), (ppgroup?.value ?: 0L), (pccountofaccessentries?.value ?: 0L), (pplistofaccessentries?.value ?: 0L), (pccountofauditentries?.value ?: 0L), (pplistofauditentries?.value ?: 0L), (psd?.value ?: 0L)).toUInt()

public actual fun lookupSecurityDescriptorPartsW(ppowner: COpaquePointer?, ppgroup: COpaquePointer?, pccountofaccessentries: COpaquePointer?, pplistofaccessentries: COpaquePointer?, pccountofauditentries: COpaquePointer?, pplistofauditentries: COpaquePointer?, psd: PsecurityDescriptor): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsW((ppowner?.value ?: 0L), (ppgroup?.value ?: 0L), (pccountofaccessentries?.value ?: 0L), (pplistofaccessentries?.value ?: 0L), (pccountofauditentries?.value ?: 0L), (pplistofauditentries?.value ?: 0L), (psd?.value ?: 0L)).toUInt()

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_setEntriesInAclA(ccountofexplicitentries.toInt(), (plistofexplicitentries?.value ?: 0L), (oldacl?.value ?: 0L), (newacl?.value ?: 0L)).toUInt()

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: COpaquePointer?, oldacl: COpaquePointer?, newacl: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_setEntriesInAclW(ccountofexplicitentries.toInt(), (plistofexplicitentries?.value ?: 0L), (oldacl?.value ?: 0L), (newacl?.value ?: 0L)).toUInt()

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_setNamedSecurityInfoA((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (psidowner?.value ?: 0L), (psidgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L)).toUInt()

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_setNamedSecurityInfoW((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (psidowner?.value ?: 0L), (psidgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L)).toUInt()

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_setSecurityInfo((handle?.value ?: 0L), objecttype, securityinfo.toInt(), (psidowner?.value ?: 0L), (psidgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L)).toUInt()

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoA((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (powner?.value ?: 0L), (pgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L), keepexplicit, 0L, progressinvokesetting, (args?.value ?: 0L)).toUInt()

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoW((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (powner?.value ?: 0L), (pgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L), keepexplicit, 0L, progressinvokesetting, (args?.value ?: 0L)).toUInt()

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoA((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (powner?.value ?: 0L), (pgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L), dwaction.toInt(), 0L, progressinvokesetting, (args?.value ?: 0L)).toUInt()

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: COpaquePointer?, psacl: COpaquePointer?, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: COpaquePointer?): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoW((pobjectname?.value ?: 0L), objecttype, securityinfo.toInt(), (powner?.value ?: 0L), (pgroup?.value ?: 0L), (pdacl?.value ?: 0L), (psacl?.value ?: 0L), dwaction.toInt(), 0L, progressinvokesetting, (args?.value ?: 0L)).toUInt()
