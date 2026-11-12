@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SecurityAuthorizationJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SecurityAuthorizationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(flags: Int, hauthzclientcontext: Long, prequest: Long, hauditevent: Long, psecuritydescriptor: Long, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: Int, preply: Long, phaccesscheckresults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(hauthzclientcontext: Long, sids: Long, sidcount: Int, restrictedsids: Long, restrictedsidcount: Int, phnewauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(flags: Int, haccesscheckresults: Long, prequest: Long, hauditevent: Long, preply: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(dwflags: Int, buffer: Long, pdwcount: Long, pdwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(authzclientcontext: Long, prequest: Long, sacl: Long, grantedaccess: Int, accessgranted: Int, pbgenerateaudit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(hauditevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(hauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(haccesscheckresults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(hauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(hauthzclientcontext: Long, infoclass: Int, buffersize: Int, psizerequired: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(usercontext: Long, devicecontext: Long, phcompoundcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(flags: Int, hauditeventtype: Long, szoperationtype: Long, szobjecttype: Long, szobjectname: Long, szadditionalinfo: Long, phauditevent: Long, dwadditionalparametercount: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(flags: Int, hauditeventtype: Long, szoperationtype: Long, szobjecttype: Long, szobjectname: Long, szadditionalinfo: Long, szadditionalinfo2: Long, phauditevent: Long, dwadditionalparametercount: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(prpcinitinfo: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(flags: Int, pfndynamicaccesscheck: Long, pfncomputedynamicgroups: Long, pfnfreedynamicgroups: Long, szresourcemanagername: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(flags: Int, pauthzinitinfo: Long, phauthzresourcemanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(dwflags: Int, pregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(hauthzclientcontext: Long, claimclass: Int, pclaimoperations: Long, pclaims: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(hauthzclientcontext: Long, poperations: Long, pattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(hauthzclientcontext: Long, sidclass: Int, psidoperations: Long, psids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(flags: Int, hauthzclientcontext: Long, prequest: Long, hauditevent: Long, psecuritydescriptor: Long, optionalsecuritydescriptorarray: Long, optionalsecuritydescriptorcount: Int, preply: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(phcapchangesubscription: Long, pfncapchangecallback: Long, pcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(dwflags: Int, szeventsourcename: Long, pheventprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(dwflags: Int, heventprovider: Long, dwauditid: Int, pusersid: Long, dwcount: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(dwflags: Int, heventprovider: Long, dwauditid: Int, pusersid: Long, pparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(hauthzclientcontext: Long, pappcontainersid: Long, capabilitycount: Int, pcapabilitysids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(dwflags: Int, szeventsourcename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(hcapchangesubscription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(dwflags: Int, pheventprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(pexplicitaccess: Long, ptrusteename: Long, ptrustee: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(pexplicitaccess: Long, ptrusteename: Long, ptrustee: Long, accesspermissions: Int, accessmode: Int, inheritance: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(ptrustee: Long, pimpersonatetrustee: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(ptrustee: Long, pimpersonatetrustee: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(powner: Long, pgroup: Long, ccountofaccessentries: Int, plistofaccessentries: Long, ccountofauditentries: Int, plistofauditentries: Long, poldsd: Long, psizenewsd: Long, pnewsd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(powner: Long, pgroup: Long, ccountofaccessentries: Int, plistofaccessentries: Long, ccountofauditentries: Int, plistofauditentries: Long, poldsd: Long, psizenewsd: Long, pnewsd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(ptrustee: Long, pname: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(ptrustee: Long, pname: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(ptrustee: Long, pobjname: Long, objecttype: Int, objecttypename: Long, inheritedobjecttypename: Long, name: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(ptrustee: Long, pobjname: Long, objecttype: Int, objecttypename: Long, inheritedobjecttypename: Long, name: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(ptrustee: Long, pobjsid: Long, pobjectguid: Long, pinheritedobjectguid: Long, psid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(ptrustee: Long, psid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(ptrustee: Long, psid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: Long, requestedstringsdrevision: Int, securityinformation: Int, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: Long, requestedstringsdrevision: Int, securityinformation: Int, stringsecuritydescriptor: Long, stringsecuritydescriptorlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(sid: Long, stringsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(sid: Long, stringsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Long, stringsdrevision: Int, securitydescriptor: Long, securitydescriptorsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Long, stringsdrevision: Int, securitydescriptor: Long, securitydescriptorsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(stringsid: Long, sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(stringsid: Long, sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(pinheritarray: Long, acecnt: Short, pfnarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(pacl: Long, ptrustee: Long, psuccessfulauditedrights: Long, pfailedauditrights: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(pacl: Long, ptrustee: Long, paccessrights: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(pacl: Long, ptrustee: Long, paccessrights: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(pacl: Long, pccountofexplicitentries: Long, plistofexplicitentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(pobjectname: Long, objecttype: Int, securityinfo: Int, container: Int, pobjectclassguids: Long, guidcount: Int, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(pobjectname: Long, objecttype: Int, securityinfo: Int, container: Int, pobjectclassguids: Long, guidcount: Int, pacl: Long, pfnarray: Long, pgenericmapping: Long, pinheritarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(ptrustee: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(ptrustee: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(handle: Long, objecttype: Int, securityinfo: Int, ppsidowner: Long, ppsidgroup: Long, ppdacl: Long, ppsacl: Long, ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(ptrustee: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(ptrustee: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(ptrustee: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(ptrustee: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(ppowner: Long, ppgroup: Long, pccountofaccessentries: Long, pplistofaccessentries: Long, pccountofauditentries: Long, pplistofauditentries: Long, psd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(ccountofexplicitentries: Int, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(ccountofexplicitentries: Int, plistofexplicitentries: Long, oldacl: Long, newacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(handle: Long, objecttype: Int, securityinfo: Int, psidowner: Long, psidgroup: Long, pdacl: Long, psacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, keepexplicit: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, keepexplicit: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, dwaction: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(pobjectname: Long, objecttype: Int, securityinfo: Int, powner: Long, pgroup: Long, pdacl: Long, psacl: Long, dwaction: Int, fnprogress: Long, progressinvokesetting: Int, args: Long): Int
}

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: MutPtr, phaccesscheckresults: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(flags.toInt(), hauthzclientcontext.rawAddress, prequest.rawAddress, hauditevent.rawAddress, psecuritydescriptor.rawAddress, optionalsecuritydescriptorarray.rawAddress, optionalsecuritydescriptorcount.toInt(), preply.rawAddress, phaccesscheckresults.rawAddress)

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr, sidcount: UInt, restrictedsids: ConstPtr, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(hauthzclientcontext.rawAddress, sids.rawAddress, sidcount.toInt(), restrictedsids.rawAddress, restrictedsidcount.toInt(), phnewauthzclientcontext.rawAddress)

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, preply: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(flags.toInt(), haccesscheckresults.rawAddress, prequest.rawAddress, hauditevent.rawAddress, preply.rawAddress)

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr, pdwcount: MutPtr, pdwlength: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(dwflags.toInt(), buffer.rawAddress, pdwcount.rawAddress, pdwlength.rawAddress)

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, sacl: ConstPtr, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(authzclientcontext.rawAddress, prequest.rawAddress, sacl.rawAddress, grantedaccess.toInt(), accessgranted, pbgenerateaudit.rawAddress)

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(hauditevent.rawAddress)

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache()

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(hauthzclientcontext.rawAddress)

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(haccesscheckresults.rawAddress)

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(hauthzresourcemanager.rawAddress)

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr, buffer: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(hauthzclientcontext.rawAddress, infoclass, buffersize.toInt(), psizerequired.rawAddress, buffer.rawAddress)

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(usercontext.rawAddress, devicecontext.rawAddress, phcompoundcontext.rawAddress)

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phnewauthzclientcontext: MutPtr): Bool =
    0

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    0

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    0

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(flags.toInt(), hauditeventtype.rawAddress, szoperationtype.rawAddress, szobjecttype.rawAddress, szobjectname.rawAddress, szadditionalinfo.rawAddress, phauditevent.rawAddress, dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(flags.toInt(), hauditeventtype.rawAddress, szoperationtype.rawAddress, szobjecttype.rawAddress, szobjectname.rawAddress, szadditionalinfo.rawAddress, szadditionalinfo2.rawAddress, phauditevent.rawAddress, dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(prpcinitinfo.rawAddress, phauthzresourcemanager.rawAddress)

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(flags.toInt(), 0L, 0L, 0L, szresourcemanagername.rawAddress, phauthzresourcemanager.rawAddress)

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(flags.toInt(), pauthzinitinfo.rawAddress, phauthzresourcemanager.rawAddress)

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(dwflags.toInt(), pregistration.rawAddress)

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr, pclaims: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(hauthzclientcontext.rawAddress, claimclass, pclaimoperations.rawAddress, pclaims.rawAddress)

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr, pattributes: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(hauthzclientcontext.rawAddress, poperations.rawAddress, pattributes.rawAddress)

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr, psids: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(hauthzclientcontext.rawAddress, sidclass, psidoperations.rawAddress, psids.rawAddress)

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(flags.toInt(), hauthzclientcontext.rawAddress, prequest.rawAddress, hauditevent.rawAddress, psecuritydescriptor.rawAddress, optionalsecuritydescriptorarray.rawAddress, optionalsecuritydescriptorcount.toInt(), preply.rawAddress)

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(phcapchangesubscription.rawAddress, 0L, pcallbackcontext.rawAddress)

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(dwflags.toInt(), szeventsourcename.rawAddress, pheventprovider.rawAddress)

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(dwflags.toInt(), heventprovider.rawAddress, dwauditid.toInt(), pusersid.rawAddress, dwcount.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(dwflags.toInt(), heventprovider.rawAddress, dwauditid.toInt(), pusersid.rawAddress, pparams.rawAddress)

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(hauthzclientcontext.rawAddress, pappcontainersid.rawAddress, capabilitycount.toInt(), pcapabilitysids.rawAddress)

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(dwflags.toInt(), szeventsourcename.rawAddress)

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(hcapchangesubscription.rawAddress)

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(dwflags.toInt(), pheventprovider.rawAddress)

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(pexplicitaccess.rawAddress, ptrusteename.rawAddress, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(pexplicitaccess.rawAddress, ptrusteename.rawAddress, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(pexplicitaccess.rawAddress, ptrusteename.rawAddress, ptrustee.rawAddress, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(pexplicitaccess.rawAddress, ptrusteename.rawAddress, ptrustee.rawAddress, accesspermissions.toInt(), accessmode, inheritance.toInt())
}

public actual fun buildImpersonateTrusteeA(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(ptrustee.rawAddress, pimpersonatetrustee.rawAddress)
}

public actual fun buildImpersonateTrusteeW(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(ptrustee.rawAddress, pimpersonatetrustee.rawAddress)
}

public actual fun buildSecurityDescriptorA(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(powner.rawAddress, pgroup.rawAddress, ccountofaccessentries.toInt(), plistofaccessentries.rawAddress, ccountofauditentries.toInt(), plistofauditentries.rawAddress, poldsd.rawAddress, psizenewsd.rawAddress, pnewsd.rawAddress).toUInt()

public actual fun buildSecurityDescriptorW(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(powner.rawAddress, pgroup.rawAddress, ccountofaccessentries.toInt(), plistofaccessentries.rawAddress, ccountofauditentries.toInt(), plistofauditentries.rawAddress, poldsd.rawAddress, psizenewsd.rawAddress, pnewsd.rawAddress).toUInt()

public actual fun buildTrusteeWithNameA(ptrustee: MutPtr, pname: Pcstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(ptrustee.rawAddress, pname.rawAddress)
}

public actual fun buildTrusteeWithNameW(ptrustee: MutPtr, pname: Pcwstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(ptrustee.rawAddress, pname.rawAddress)
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(ptrustee.rawAddress, pobjname.rawAddress, objecttype, objecttypename.rawAddress, inheritedobjecttypename.rawAddress, name.rawAddress)
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(ptrustee.rawAddress, pobjname.rawAddress, objecttype, objecttypename.rawAddress, inheritedobjecttypename.rawAddress, name.rawAddress)
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(ptrustee.rawAddress, pobjsid.rawAddress, pobjectguid.rawAddress, pinheritedobjectguid.rawAddress, psid.rawAddress)
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(ptrustee.rawAddress, pobjsid.rawAddress, pobjectguid.rawAddress, pinheritedobjectguid.rawAddress, psid.rawAddress)
}

public actual fun buildTrusteeWithSidA(ptrustee: MutPtr, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(ptrustee.rawAddress, psid.rawAddress)
}

public actual fun buildTrusteeWithSidW(ptrustee: MutPtr, psid: Psid) {
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(ptrustee.rawAddress, psid.rawAddress)
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor.rawAddress, requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.rawAddress, stringsecuritydescriptorlen.rawAddress)

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor.rawAddress, requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.rawAddress, stringsecuritydescriptorlen.rawAddress)

public actual fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(sid.rawAddress, stringsid.rawAddress)

public actual fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(sid.rawAddress, stringsid.rawAddress)

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor.rawAddress, stringsdrevision.toInt(), securitydescriptor.rawAddress, securitydescriptorsize.rawAddress)

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor.rawAddress, stringsdrevision.toInt(), securitydescriptor.rawAddress, securitydescriptorsize.rawAddress)

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(stringsid.rawAddress, sid.rawAddress)

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr): Bool =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(stringsid.rawAddress, sid.rawAddress)

public actual fun freeInheritedFromArray(pinheritarray: ConstPtr, acecnt: UShort, pfnarray: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(pinheritarray.rawAddress, acecnt.toShort(), pfnarray.rawAddress).toUInt()

public actual fun getAuditedPermissionsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(pacl.rawAddress, ptrustee.rawAddress, psuccessfulauditedrights.rawAddress, pfailedauditrights.rawAddress).toUInt()

public actual fun getAuditedPermissionsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(pacl.rawAddress, ptrustee.rawAddress, psuccessfulauditedrights.rawAddress, pfailedauditrights.rawAddress).toUInt()

public actual fun getEffectiveRightsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(pacl.rawAddress, ptrustee.rawAddress, paccessrights.rawAddress).toUInt()

public actual fun getEffectiveRightsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(pacl.rawAddress, ptrustee.rawAddress, paccessrights.rawAddress).toUInt()

public actual fun getExplicitEntriesFromAclA(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(pacl.rawAddress, pccountofexplicitentries.rawAddress, plistofexplicitentries.rawAddress).toUInt()

public actual fun getExplicitEntriesFromAclW(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(pacl.rawAddress, pccountofexplicitentries.rawAddress, plistofexplicitentries.rawAddress).toUInt()

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(pobjectname.rawAddress, objecttype, securityinfo.toInt(), container, pobjectclassguids.rawAddress, guidcount.toInt(), pacl.rawAddress, pfnarray.rawAddress, pgenericmapping.rawAddress, pinheritarray.rawAddress).toUInt()

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(pobjectname.rawAddress, objecttype, securityinfo.toInt(), container, pobjectclassguids.rawAddress, guidcount.toInt(), pacl.rawAddress, pfnarray.rawAddress, pgenericmapping.rawAddress, pinheritarray.rawAddress).toUInt()

public actual fun getMultipleTrusteeA(ptrustee: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(ptrustee.rawAddress))

public actual fun getMultipleTrusteeOperationA(ptrustee: ConstPtr): MultipleTrusteeOperation =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(ptrustee.rawAddress)

public actual fun getMultipleTrusteeOperationW(ptrustee: ConstPtr): MultipleTrusteeOperation =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(ptrustee.rawAddress)

public actual fun getMultipleTrusteeW(ptrustee: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(ptrustee.rawAddress))

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(pobjectname.rawAddress, objecttype, securityinfo.toInt(), ppsidowner.rawAddress, ppsidgroup.rawAddress, ppdacl.rawAddress, ppsacl.rawAddress, ppsecuritydescriptor.rawAddress).toUInt()

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(pobjectname.rawAddress, objecttype, securityinfo.toInt(), ppsidowner.rawAddress, ppsidgroup.rawAddress, ppdacl.rawAddress, ppsacl.rawAddress, ppsecuritydescriptor.rawAddress).toUInt()

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(handle.rawAddress, objecttype, securityinfo.toInt(), ppsidowner.rawAddress, ppsidgroup.rawAddress, ppdacl.rawAddress, ppsacl.rawAddress, ppsecuritydescriptor.rawAddress).toUInt()

public actual fun getTrusteeFormA(ptrustee: ConstPtr): TrusteeForm =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(ptrustee.rawAddress)

public actual fun getTrusteeFormW(ptrustee: ConstPtr): TrusteeForm =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(ptrustee.rawAddress)

public actual fun getTrusteeNameA(ptrustee: ConstPtr): Pstr =
    MutPtr(WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(ptrustee.rawAddress))

public actual fun getTrusteeNameW(ptrustee: ConstPtr): Pwstr =
    MutPtr(WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(ptrustee.rawAddress))

public actual fun getTrusteeTypeA(ptrustee: ConstPtr): TrusteeType =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(ptrustee.rawAddress)

public actual fun getTrusteeTypeW(ptrustee: ConstPtr): TrusteeType =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(ptrustee.rawAddress)

public actual fun lookupSecurityDescriptorPartsA(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(ppowner.rawAddress, ppgroup.rawAddress, pccountofaccessentries.rawAddress, pplistofaccessentries.rawAddress, pccountofauditentries.rawAddress, pplistofauditentries.rawAddress, psd.rawAddress).toUInt()

public actual fun lookupSecurityDescriptorPartsW(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(ppowner.rawAddress, ppgroup.rawAddress, pccountofaccessentries.rawAddress, pplistofaccessentries.rawAddress, pccountofauditentries.rawAddress, pplistofauditentries.rawAddress, psd.rawAddress).toUInt()

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(ccountofexplicitentries.toInt(), plistofexplicitentries.rawAddress, oldacl.rawAddress, newacl.rawAddress).toUInt()

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(ccountofexplicitentries.toInt(), plistofexplicitentries.rawAddress, oldacl.rawAddress, newacl.rawAddress).toUInt()

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(pobjectname.rawAddress, objecttype, securityinfo.toInt(), psidowner.rawAddress, psidgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress).toUInt()

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(pobjectname.rawAddress, objecttype, securityinfo.toInt(), psidowner.rawAddress, psidgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress).toUInt()

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(handle.rawAddress, objecttype, securityinfo.toInt(), psidowner.rawAddress, psidgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress).toUInt()

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(pobjectname.rawAddress, objecttype, securityinfo.toInt(), powner.rawAddress, pgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress, keepexplicit, 0L, progressinvokesetting, args.rawAddress).toUInt()

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(pobjectname.rawAddress, objecttype, securityinfo.toInt(), powner.rawAddress, pgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress, keepexplicit, 0L, progressinvokesetting, args.rawAddress).toUInt()

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(pobjectname.rawAddress, objecttype, securityinfo.toInt(), powner.rawAddress, pgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress, dwaction.toInt(), 0L, progressinvokesetting, args.rawAddress).toUInt()

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    WindowsWin32SecurityAuthorizationJniBridge.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(pobjectname.rawAddress, objecttype, securityinfo.toInt(), powner.rawAddress, pgroup.rawAddress, pdacl.rawAddress, psacl.rawAddress, dwaction.toInt(), 0L, progressinvokesetting, args.rawAddress).toUInt()
