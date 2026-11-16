@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob

private object WindowsWin32SecurityAuthenticationIdentityJniBridge {
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
        val stream = WindowsWin32SecurityAuthenticationIdentityJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(hcredentials: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(hcredentials: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(pszpackagename: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(pszpackagename: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(phcontext: Long, pinput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(psid: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(htokenhandle: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(auditcategoryid: Int, pauditcategoryguid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(psid: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(securityinformation: Int, ppsecuritydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(psid: Long, pauditpolicy: Long, dwpolicycount: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(securityinformation: Int, psecuritydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: Int, poutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: Int, poutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(phcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(buffer: Long, buffersize: Int, rettargetinfo: Long, retactualsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(pszpackagename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(pszpackagename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(phcontext: Long, fflags: Int, ppackedcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(pvcontextbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(phcredential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(pszpackage: Long, ppackedcontext: Long, token: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(pszpackage: Long, ppackedcontext: Long, token: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(policyhandle: Long, accountsid: Long, userrights: Long, countofrights: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(lsahandle: Long, authenticationpackage: Int, protocolsubmitbuffer: Long, submitbufferlength: Int, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(lsahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(policyhandle: Long, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: Int, trusteddomainhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(policyhandle: Long, trusteddomainsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(lsahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(policyhandle: Long, accountsid: Long, userrights: Long, countofrights: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(policyhandle: Long, userright: Long, buffer: Long, countreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(policyhandle: Long, enumerationcontext: Long, buffer: Long, preferedmaximumlength: Int, countreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(policyhandle: Long, enumerationcontext: Long, buffer: Long, preferedmaximumlength: Int, countreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(lsahandle: Long, packagename: Long, authenticationpackage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(policyhandle: Long, count: Int, names: Long, referenceddomains: Long, sids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(policyhandle: Long, flags: Int, count: Int, names: Long, referenceddomains: Long, sids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(policyhandle: Long, count: Int, sids: Long, referenceddomains: Long, names: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(policyhandle: Long, lookupoptions: Int, count: Int, sids: Long, referenceddomains: Long, names: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: Int, policyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(policyhandle: Long, trusteddomainname: Long, desiredaccess: Int, trusteddomainhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(capids: Long, capidcount: Int, caps: Long, capcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(policyhandle: Long, trusteddomainname: Long, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(policyhandle: Long, trusteddomainname: Long, highestrecordtype: Int, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(policyhandle: Long, trusteddomainsid: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(policyhandle: Long, trusteddomainname: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(informationclass: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(policyhandle: Long, accountsid: Long, allrights: Boolean, userrights: Long, countofrights: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(policyhandle: Long, keyname: Long, privatedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(capdns: Long, capdncount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(policyhandle: Long, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(policyhandle: Long, trusteddomainname: Long, highestrecordtype: Int, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(policyhandle: Long, trusteddomainname: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(policyhandle: Long, trusteddomainsid: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(policyhandle: Long, keyname: Long, privatedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(informationclass: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(phcontext: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(phcredential: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(phcredential: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(phcontext: Long, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(pszpackagename: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(pszpackagename: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(memory: Long, memorysize: Int, optionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(memory: Long, memorysize: Int, optionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(randombuffer: Long, randombufferlength: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: Long, pwszserverurl: Long, pwszclienttoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: Int, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: Long, wproxyport: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(hslc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: Long, pwszconfirmationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: Long, pwszconfirmationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(hslc: Long, pwszeventid: Long, papplicationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(pqueryid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(hslc: Long, cblicenseblob: Int, pblicenseblob: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: Long, pnstatuscount: Long, pplicensingstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(hslc: Long, pwszpkeyalgorithm: Long, pwszpkeystring: Long, cbpkeyspecificdata: Int, pbpkeyspecificdata: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(hslc: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(hslc: Long, ereferraltype: Int, pskuorappid: Long, pwszvaluename: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(hslc: Long, equeryidtype: Int, pqueryid: Long, ereturnidtype: Int, pnreturnids: Long, ppreturnids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(pwszserverurl: Long, pwszacquisitiontype: Long, pwszproxyserver: Long, wproxyport: Short, phrstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(hslc: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(pwszvaluename: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(hslc: Long, cblicenseblob: Int, pblicenseblob: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: Long, pwszpkeystring: Long, cbpkeyspecificdata: Int, pbpkeyspecificdata: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(phslc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(valuename: Long, valuetype: Long, databuffer: Long, datasize: Int, resultdatasize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(hslc: Long, pwszeventid: Long, papplicationid: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(pqueryid: Long, pwszvaluename: Long, edatatype: Int, cbvalue: Int, pbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(hslc: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(hslc: Long, pwszeventid: Long, papplicationid: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(profilelist: Long, profilecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(profilelist: Long, profilecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(contexthandle: Long, option: Int, value: Long, size: Int, needed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(profilename: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(profilename: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(pinput: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(pinput: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(contexthandle: Long, option: Int, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(pbcertificate: Long, cbcertificate: Int, dwflags: Int, ppcertificate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(psztargetname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(psztargetname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(pcertificate: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(prandomdata: Long, crandomdata: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(clienthello: Long, clienthellobytesize: Int, genericextensions: Long, genericextensionscount: Byte, bytestoread: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(clienthello: Long, clienthellosize: Int, serveridentity: Long, serveridentitysize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(encryptedauthdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(options: Int, encryptedauthdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(pszusername: Long, pszdomainname: Long, pszpackedcredentialsstring: Long, ppauthidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(authdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(options: Int, authdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(authidentity: Long, pszpackagename: Long, ppnewauthidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(authdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(psztargetname: Long, pszhostname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(databuffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(authidentity: Long, psztargetname: Long, pcredmancredentialtype: Long, ppszcredmantargetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(authidentity: Long, psztargetname: Long, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(psztargetname: Long, puiinfo: Long, dwautherror: Int, pszpackage: Long, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(psztargetname: Long, puiinfo: Long, dwautherror: Int, pszpackage: Long, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(pbindings: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(authidentitylength: Int, authidentitybytearray: Long, ppauthidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(authdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(authdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(targeturl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(keytype: Int, targeturl: Long, bindingtype: Int, tlsekm: Long, tlsekmsize: Int, extensionformat: Int, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(keytype: Int, publickey: Long, publickeysize: Int, resultdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(keytype: Int, targeturi: Long, resultdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: Int, tokenbindingmessage: Long, tokenbindingmessagesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(keytypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(keytypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: Int, keytype: Int, tlsekm: Long, tlsekmsize: Int, resultlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(lpaccountname: Long, accountnameformat: Int, desirednameformat: Int, lptranslatedname: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(lpaccountname: Long, accountnameformat: Int, desirednameformat: Int, lptranslatedname: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int
}

public actual fun acceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(phcredential.rawAddress, phcontext.rawAddress, pinput.rawAddress, fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(pszprincipal.rawAddress, pszpackage.rawAddress, fcredentialuse.toInt(), pvlogonid.rawAddress, pauthdata.rawAddress, 0L, pvgetkeyargument.rawAddress, phcredential.rawAddress, ptsexpiry.rawAddress)

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(pszprincipal.rawAddress, pszpackage.rawAddress, fcredentialuse.toInt(), pvlogonid.rawAddress, pauthdata.rawAddress, 0L, pvgetkeyargument.rawAddress, phcredential.rawAddress, ptsexpiry.rawAddress)

public actual fun addCredentialsA(hcredentials: ConstPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(hcredentials.rawAddress, pszprincipal.rawAddress, pszpackage.rawAddress, fcredentialuse.toInt(), pauthdata.rawAddress, 0L, pvgetkeyargument.rawAddress, ptsexpiry.rawAddress)

public actual fun addCredentialsW(hcredentials: ConstPtr, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(hcredentials.rawAddress, pszprincipal.rawAddress, pszpackage.rawAddress, fcredentialuse.toInt(), pauthdata.rawAddress, 0L, pvgetkeyargument.rawAddress, ptsexpiry.rawAddress)

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(pszpackagename.rawAddress, poptions.rawAddress)

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(pszpackagename.rawAddress, poptions.rawAddress)

public actual fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(phcontext.rawAddress, pinput.rawAddress)

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(psid.rawAddress, psubcategoryguids.rawAddress, dwpolicycount.toInt(), ppauditpolicy.rawAddress)

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(htokenhandle.rawAddress, psubcategoryguids.rawAddress, dwpolicycount.toInt(), ppauditpolicy.rawAddress)

public actual fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(ppauditcategoriesarray.rawAddress, pdwcountreturned.rawAddress)

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(ppauditsidarray.rawAddress)

public actual fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(pauditcategoryguid.rawAddress, bretrieveallsubcategories, ppauditsubcategoriesarray.rawAddress, pdwcountreturned.rawAddress)

public actual fun auditFree(buffer: ConstPtr) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(buffer.rawAddress)
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid.rawAddress)

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr, pauditcategoryid: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid.rawAddress, pauditcategoryid.rawAddress)

public actual fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(pauditcategoryguid.rawAddress, ppszcategoryname.rawAddress)

public actual fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(pauditcategoryguid.rawAddress, ppszcategoryname.rawAddress)

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(pauditsubcategoryguid.rawAddress, ppszsubcategoryname.rawAddress)

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(pauditsubcategoryguid.rawAddress, ppszsubcategoryname.rawAddress)

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(objecttypename.rawAddress, acl.rawAddress)

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(objecttypename.rawAddress, acl.rawAddress)

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(psid.rawAddress, psubcategoryguids.rawAddress, dwpolicycount.toInt(), ppauditpolicy.rawAddress)

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(securityinformation.toInt(), ppsecuritydescriptor.rawAddress)

public actual fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(psubcategoryguids.rawAddress, dwpolicycount.toInt(), ppauditpolicy.rawAddress)

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(objecttypename.rawAddress, acl.rawAddress)

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(objecttypename.rawAddress, acl.rawAddress)

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(psid.rawAddress, pauditpolicy.rawAddress, dwpolicycount.toInt())

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(securityinformation.toInt(), psecuritydescriptor.rawAddress)

public actual fun auditSetSystemPolicy(pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(pauditpolicy.rawAddress, dwpolicycount.toInt())

public actual fun changeAccountPasswordA(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(pszpackagename.rawAddress, pszdomainname.rawAddress, pszaccountname.rawAddress, pszoldpassword.rawAddress, psznewpassword.rawAddress, bimpersonating, dwreserved.toInt(), poutput.rawAddress)

public actual fun changeAccountPasswordW(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(pszpackagename.rawAddress, pszdomainname.rawAddress, pszaccountname.rawAddress, pszoldpassword.rawAddress, psznewpassword.rawAddress, bimpersonating, dwreserved.toInt(), poutput.rawAddress)

public actual fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(phcontext.rawAddress, ptoken.rawAddress)

public actual fun credMarshalTargetInfo(intargetinfo: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(intargetinfo.rawAddress, buffer.rawAddress, buffersize.rawAddress)

public actual fun credUnmarshalTargetInfo(buffer: ConstPtr, buffersize: UInt, rettargetinfo: MutPtr, retactualsize: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(buffer.rawAddress, buffersize.toInt(), rettargetinfo.rawAddress, retactualsize.rawAddress)

public actual fun decryptMessage(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(phcontext.rawAddress, pmessage.rawAddress, messageseqno.toInt(), pfqop.rawAddress)

public actual fun deleteSecurityContext(phcontext: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(phcontext.rawAddress)

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(pszpackagename.rawAddress)

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(pszpackagename.rawAddress)

public actual fun encryptMessage(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(phcontext.rawAddress, fqop.toInt(), pmessage.rawAddress, messageseqno.toInt())

public actual fun enumerateSecurityPackagesA(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(pcpackages.rawAddress, pppackageinfo.rawAddress)

public actual fun enumerateSecurityPackagesW(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(pcpackages.rawAddress, pppackageinfo.rawAddress)

public actual fun exportSecurityContext(phcontext: ConstPtr, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(phcontext.rawAddress, fflags.toInt(), ppackedcontext.rawAddress, ptoken.rawAddress)

public actual fun freeContextBuffer(pvcontextbuffer: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(pvcontextbuffer.rawAddress)

public actual fun freeCredentialsHandle(phcredential: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(phcredential.rawAddress)

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(nameformat, lpnamebuffer.rawAddress, nsize.rawAddress)

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(nameformat, lpnamebuffer.rawAddress, nsize.rawAddress)

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(nameformat, lpnamebuffer.rawAddress, nsize.rawAddress)

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(nameformat, lpnamebuffer.rawAddress, nsize.rawAddress)

public actual fun impersonateSecurityContext(phcontext: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(phcontext.rawAddress)

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(pszpackage.rawAddress, ppackedcontext.rawAddress, token.rawAddress, phcontext.rawAddress)

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(pszpackage.rawAddress, ppackedcontext.rawAddress, token.rawAddress, phcontext.rawAddress)

public actual fun initSecurityInterfaceA(): MutPtr =
    MutPtr(WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA())

public actual fun initSecurityInterfaceW(): MutPtr =
    MutPtr(WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW())

public actual fun initializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(phcredential.rawAddress, phcontext.rawAddress, psztargetname.rawAddress, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress, reserved2.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun initializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(phcredential.rawAddress, phcontext.rawAddress, psztargetname.rawAddress, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress, reserved2.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr, countofrights: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(policyhandle, accountsid.rawAddress, userrights.rawAddress, countofrights.toInt())

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(lsahandle.rawAddress, authenticationpackage.toInt(), protocolsubmitbuffer.rawAddress, submitbufferlength.toInt(), protocolreturnbuffer.rawAddress, returnbufferlength.rawAddress, protocolstatus.rawAddress)

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle)

public actual fun lsaConnectUntrusted(lsahandle: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(lsahandle.rawAddress)

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr, authenticationinformation: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(policyhandle, trusteddomaininformation.rawAddress, authenticationinformation.rawAddress, desiredaccess.toInt(), trusteddomainhandle.rawAddress)

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(policyhandle, trusteddomainsid.rawAddress)

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(lsahandle.rawAddress)

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr, countofrights: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(policyhandle, accountsid.rawAddress, userrights.rawAddress, countofrights.rawAddress)

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr, buffer: MutPtr, countreturned: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(policyhandle, userright.rawAddress, buffer.rawAddress, countreturned.rawAddress)

public actual fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr, logonsessionlist: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(logonsessioncount.rawAddress, logonsessionlist.rawAddress)

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(policyhandle, enumerationcontext.rawAddress, buffer.rawAddress, preferedmaximumlength.toInt(), countreturned.rawAddress)

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(policyhandle, enumerationcontext.rawAddress, buffer.rawAddress, preferedmaximumlength.toInt(), countreturned.rawAddress)

public actual fun lsaFreeMemory(buffer: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(buffer.rawAddress)

public actual fun lsaFreeReturnBuffer(buffer: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(buffer.rawAddress)

public actual fun lsaGetAppliedCAPIDs(systemname: ConstPtr, capids: MutPtr, capidcount: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(systemname.rawAddress, capids.rawAddress, capidcount.rawAddress)

public actual fun lsaGetLogonSessionData(logonid: ConstPtr, pplogonsessiondata: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(logonid.rawAddress, pplogonsessiondata.rawAddress)

public actual fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr, authenticationinformationlength: UInt, localgroups: ConstPtr, sourcecontext: ConstPtr, profilebuffer: MutPtr, profilebufferlength: MutPtr, logonid: MutPtr, token: MutPtr, quotas: MutPtr, substatus: MutPtr): Ntstatus =
    0

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr, authenticationpackage: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(lsahandle.rawAddress, packagename.rawAddress, authenticationpackage.rawAddress)

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(policyhandle, count.toInt(), names.rawAddress, referenceddomains.rawAddress, sids.rawAddress)

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(policyhandle, flags.toInt(), count.toInt(), names.rawAddress, referenceddomains.rawAddress, sids.rawAddress)

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(policyhandle, count.toInt(), sids.rawAddress, referenceddomains.rawAddress, names.rawAddress)

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(policyhandle, lookupoptions.toInt(), count.toInt(), sids.rawAddress, referenceddomains.rawAddress, names.rawAddress)

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status).toUInt()

public actual fun lsaOpenPolicy(systemname: ConstPtr, objectattributes: ConstPtr, desiredaccess: UInt, policyhandle: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(systemname.rawAddress, objectattributes.rawAddress, desiredaccess.toInt(), policyhandle.rawAddress)

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(policyhandle, trusteddomainname.rawAddress, desiredaccess.toInt(), trusteddomainhandle.rawAddress)

public actual fun lsaQueryCAPs(capids: ConstPtr, capidcount: UInt, caps: MutPtr, capcount: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(capids.rawAddress, capidcount.toInt(), caps.rawAddress, capcount.rawAddress)

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(policyhandle, informationclass, buffer.rawAddress)

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(policyhandle, trusteddomainname.rawAddress, foresttrustinfo.rawAddress)

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(policyhandle, trusteddomainname.rawAddress, highestrecordtype, foresttrustinfo.rawAddress)

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(policyhandle, informationclass, buffer.rawAddress)

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(policyhandle, trusteddomainsid.rawAddress, informationclass, buffer.rawAddress)

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(policyhandle, trusteddomainname.rawAddress, informationclass, buffer.rawAddress)

public actual fun lsaRegisterLogonProcess(logonprocessname: ConstPtr, lsahandle: MutPtr, securitymode: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(logonprocessname.rawAddress, lsahandle.rawAddress, securitymode.rawAddress)

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress)

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr, countofrights: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(policyhandle, accountsid.rawAddress, allrights, userrights.rawAddress, countofrights.toInt())

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(policyhandle, keyname.rawAddress, privatedata.rawAddress)

public actual fun lsaSetCAPs(capdns: ConstPtr, capdncount: UInt, flags: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(capdns.rawAddress, capdncount.toInt(), flags.toInt())

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(policyhandle, informationclass, buffer.rawAddress)

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(policyhandle, trusteddomainname.rawAddress, foresttrustinfo.rawAddress, checkonly, collisioninfo.rawAddress)

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(policyhandle, trusteddomainname.rawAddress, highestrecordtype, foresttrustinfo.rawAddress, checkonly, collisioninfo.rawAddress)

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(policyhandle, informationclass, buffer.rawAddress)

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(policyhandle, trusteddomainname.rawAddress, informationclass, buffer.rawAddress)

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(policyhandle, trusteddomainsid.rawAddress, informationclass, buffer.rawAddress)

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: ConstPtr): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(policyhandle, keyname.rawAddress, privatedata.rawAddress)

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress)

public actual fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(phcontext.rawAddress, fqop.toInt(), pmessage.rawAddress, messageseqno.toInt())

public actual fun queryContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress)

public actual fun queryContextAttributesExA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun queryContextAttributesExW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun queryContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress)

public actual fun queryCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(phcredential.rawAddress, ulattribute.toInt(), pbuffer.rawAddress)

public actual fun queryCredentialsAttributesExA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(phcredential.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun queryCredentialsAttributesExW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(phcredential.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun queryCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(phcredential.rawAddress, ulattribute.toInt(), pbuffer.rawAddress)

public actual fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(phcontext.rawAddress, token.rawAddress)

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(pszpackagename.rawAddress, pppackageinfo.rawAddress)

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(pszpackagename.rawAddress, pppackageinfo.rawAddress)

public actual fun revertSecurityContext(phcontext: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(phcontext.rawAddress)

public actual fun rtlDecryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(memory.rawAddress, memorysize.toInt(), optionflags.toInt())

public actual fun rtlEncryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(memory.rawAddress, memorysize.toInt(), optionflags.toInt())

public actual fun rtlGenRandom(randombuffer: MutPtr, randombufferlength: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(randombuffer.rawAddress, randombufferlength.toInt())

public actual fun sLAcquireGenuineTicket(ppticketblob: MutPtr, pcbticketblob: MutPtr, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(ppticketblob.rawAddress, pcbticketblob.rawAddress, pwsztemplateid.rawAddress, pwszserverurl.rawAddress, pwszclienttoken.rawAddress)

public actual fun sLActivateProduct(hslc: ConstPtr, pproductskuid: ConstPtr, cbappspecificdata: UInt, pvappspecificdata: ConstPtr, pactivationinfo: ConstPtr, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(hslc.rawAddress, pproductskuid.rawAddress, cbappspecificdata.toInt(), pvappspecificdata.rawAddress, pactivationinfo.rawAddress, pwszproxyserver.rawAddress, wproxyport.toShort())

public actual fun sLClose(hslc: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(hslc.rawAddress)

public actual fun sLConsumeRight(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pvreserved: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(hslc.rawAddress, pappid.rawAddress, pproductskuid.rawAddress, pwszrightname.rawAddress, pvreserved.rawAddress)

public actual fun sLDepositOfflineConfirmationId(hslc: ConstPtr, pproductskuid: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(hslc.rawAddress, pproductskuid.rawAddress, pwszinstallationid.rawAddress, pwszconfirmationid.rawAddress)

public actual fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(hslc.rawAddress, pproductskuid.rawAddress, pactivationinfo.rawAddress, pwszinstallationid.rawAddress, pwszconfirmationid.rawAddress)

public actual fun sLFireEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(hslc.rawAddress, pwszeventid.rawAddress, papplicationid.rawAddress)

public actual fun sLGenerateOfflineInstallationId(hslc: ConstPtr, pproductskuid: ConstPtr, ppwszinstallationid: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(hslc.rawAddress, pproductskuid.rawAddress, ppwszinstallationid.rawAddress)

public actual fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, ppwszinstallationid: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(hslc.rawAddress, pproductskuid.rawAddress, pactivationinfo.rawAddress, ppwszinstallationid.rawAddress)

public actual fun sLGetApplicationInformation(hslc: ConstPtr, papplicationid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(hslc.rawAddress, papplicationid.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(pqueryid.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetInstalledProductKeyIds(hslc: ConstPtr, pproductskuid: ConstPtr, pnproductkeyids: MutPtr, ppproductkeyids: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(hslc.rawAddress, pproductskuid.rawAddress, pnproductkeyids.rawAddress, ppproductkeyids.rawAddress)

public actual fun sLGetLicense(hslc: ConstPtr, plicensefileid: ConstPtr, pcblicensefile: MutPtr, ppblicensefile: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(hslc.rawAddress, plicensefileid.rawAddress, pcblicensefile.rawAddress, ppblicensefile.rawAddress)

public actual fun sLGetLicenseFileId(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(hslc.rawAddress, cblicenseblob.toInt(), pblicenseblob.rawAddress, plicensefileid.rawAddress)

public actual fun sLGetLicenseInformation(hslc: ConstPtr, psllicenseid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(hslc.rawAddress, psllicenseid.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetLicensingStatusInformation(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pnstatuscount: MutPtr, pplicensingstatus: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(hslc.rawAddress, pappid.rawAddress, pproductskuid.rawAddress, pwszrightname.rawAddress, pnstatuscount.rawAddress, pplicensingstatus.rawAddress)

public actual fun sLGetPKeyId(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(hslc.rawAddress, pwszpkeyalgorithm.rawAddress, pwszpkeystring.rawAddress, cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress, ppkeyid.rawAddress)

public actual fun sLGetPKeyInformation(hslc: ConstPtr, ppkeyid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(hslc.rawAddress, ppkeyid.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetPolicyInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(hslc.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetPolicyInformationDWORD(hslc: ConstPtr, pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(hslc.rawAddress, pwszvaluename.rawAddress, pdwvalue.rawAddress)

public actual fun sLGetProductSkuInformation(hslc: ConstPtr, pproductskuid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(hslc.rawAddress, pproductskuid.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetReferralInformation(hslc: ConstPtr, ereferraltype: Slreferraltype, pskuorappid: ConstPtr, pwszvaluename: Pcwstr, ppwszvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(hslc.rawAddress, ereferraltype, pskuorappid.rawAddress, pwszvaluename.rawAddress, ppwszvalue.rawAddress)

public actual fun sLGetSLIDList(hslc: ConstPtr, equeryidtype: Slidtype, pqueryid: ConstPtr, ereturnidtype: Slidtype, pnreturnids: MutPtr, ppreturnids: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(hslc.rawAddress, equeryidtype, pqueryid.rawAddress, ereturnidtype, pnreturnids.rawAddress, ppreturnids.rawAddress)

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(pwszserverurl.rawAddress, pwszacquisitiontype.rawAddress, pwszproxyserver.rawAddress, wproxyport.toShort(), phrstatus.rawAddress)

public actual fun sLGetServiceInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(hslc.rawAddress, pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(pwszvaluename.rawAddress, pedatatype.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(pwszvaluename.rawAddress, pdwvalue.rawAddress)

public actual fun sLInstallLicense(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(hslc.rawAddress, cblicenseblob.toInt(), pblicenseblob.rawAddress, plicensefileid.rawAddress)

public actual fun sLInstallProofOfPurchase(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(hslc.rawAddress, pwszpkeyalgorithm.rawAddress, pwszpkeystring.rawAddress, cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress, ppkeyid.rawAddress)

public actual fun sLIsGenuineLocal(pappid: ConstPtr, pgenuinestate: MutPtr, puioptions: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(pappid.rawAddress, pgenuinestate.rawAddress, puioptions.rawAddress)

public actual fun sLOpen(phslc: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(phslc.rawAddress)

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr, databuffer: MutPtr, datasize: UInt, resultdatasize: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(valuename.rawAddress, valuetype.rawAddress, databuffer.rawAddress, datasize.toInt(), resultdatasize.rawAddress)

public actual fun sLRegisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(hslc.rawAddress, pwszeventid.rawAddress, papplicationid.rawAddress, hevent.rawAddress)

public actual fun sLSetCurrentProductKey(hslc: ConstPtr, pproductskuid: ConstPtr, pproductkeyid: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(hslc.rawAddress, pproductskuid.rawAddress, pproductkeyid.rawAddress)

public actual fun sLSetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(pqueryid.rawAddress, pwszvaluename.rawAddress, edatatype.toInt(), cbvalue.toInt(), pbvalue.rawAddress)

public actual fun sLUninstallLicense(hslc: ConstPtr, plicensefileid: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(hslc.rawAddress, plicensefileid.rawAddress)

public actual fun sLUninstallProofOfPurchase(hslc: ConstPtr, ppkeyid: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(hslc.rawAddress, ppkeyid.rawAddress)

public actual fun sLUnregisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(hslc.rawAddress, pwszeventid.rawAddress, papplicationid.rawAddress, hevent.rawAddress)

public actual fun saslAcceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(phcredential.rawAddress, phcontext.rawAddress, pinput.rawAddress, fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun saslEnumerateProfilesA(profilelist: MutPtr, profilecount: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(profilelist.rawAddress, profilecount.rawAddress)

public actual fun saslEnumerateProfilesW(profilelist: MutPtr, profilecount: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(profilelist.rawAddress, profilecount.rawAddress)

public actual fun saslGetContextOption(contexthandle: ConstPtr, option: UInt, value: MutPtr, size: UInt, needed: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(contexthandle.rawAddress, option.toInt(), value.rawAddress, size.toInt(), needed.rawAddress)

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(profilename.rawAddress, packageinfo.rawAddress)

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(profilename.rawAddress, packageinfo.rawAddress)

public actual fun saslIdentifyPackageA(pinput: ConstPtr, packageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(pinput.rawAddress, packageinfo.rawAddress)

public actual fun saslIdentifyPackageW(pinput: ConstPtr, packageinfo: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(pinput.rawAddress, packageinfo.rawAddress)

public actual fun saslInitializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(phcredential.rawAddress, phcontext.rawAddress, psztargetname.rawAddress, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress, reserved2.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun saslInitializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(phcredential.rawAddress, phcontext.rawAddress, psztargetname.rawAddress, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress, reserved2.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun saslSetContextOption(contexthandle: ConstPtr, option: UInt, value: ConstPtr, size: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(contexthandle.rawAddress, option.toInt(), value.rawAddress, size.toInt())

public actual fun sendSAS(asuser: Bool) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser)
}

public actual fun setContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun setContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun setCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(phcredential.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun setCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(phcredential.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun sslCrackCertificate(pbcertificate: MutPtr, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr): Bool =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(pbcertificate.rawAddress, cbcertificate.toInt(), dwflags.toInt(), ppcertificate.rawAddress)

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr): Hresult =
    0

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(psztargetname.rawAddress, dwflags.toInt())

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(psztargetname.rawAddress, dwflags.toInt())

public actual fun sslFreeCertificate(pcertificate: MutPtr) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(pcertificate.rawAddress)
}

public actual fun sslGenerateRandomBits(prandomdata: MutPtr, crandomdata: Int) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(prandomdata.rawAddress, crandomdata)
}

public actual fun sslGetExtensions(clienthello: ConstPtr, clienthellobytesize: UInt, genericextensions: MutPtr, genericextensionscount: UByte, bytestoread: MutPtr, flags: SchGetExtensionsOptions): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(clienthello.rawAddress, clienthellobytesize.toInt(), genericextensions.rawAddress, genericextensionscount.toByte(), bytestoread.rawAddress, flags)

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved.toInt()).toUInt()

public actual fun sslGetServerIdentity(clienthello: ConstPtr, clienthellosize: UInt, serveridentity: MutPtr, serveridentitysize: MutPtr, flags: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(clienthello.rawAddress, clienthellosize.toInt(), serveridentity.rawAddress, serveridentitysize.rawAddress, flags.toInt())

public actual fun sspiCompareAuthIdentities(authidentity1: ConstPtr, authidentity2: ConstPtr, samesupplieduser: MutPtr, samesuppliedidentity: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(authidentity1.rawAddress, authidentity2.rawAddress, samesupplieduser.rawAddress, samesuppliedidentity.rawAddress)

public actual fun sspiCopyAuthIdentity(authdata: ConstPtr, authdatacopy: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(authdata.rawAddress, authdatacopy.rawAddress)

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(encryptedauthdata.rawAddress)

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(options.toInt(), encryptedauthdata.rawAddress)

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr, ppszusername: MutPtr, ppszdomainname: MutPtr, ppszpackedcredentialsstring: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(pauthidentity.rawAddress, ppszusername.rawAddress, ppszdomainname.rawAddress, ppszpackedcredentialsstring.rawAddress)

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(pszusername.rawAddress, pszdomainname.rawAddress, pszpackedcredentialsstring.rawAddress, ppauthidentity.rawAddress)

public actual fun sspiEncryptAuthIdentity(authdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(authdata.rawAddress)

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(options.toInt(), authdata.rawAddress)

public actual fun sspiExcludePackage(authidentity: ConstPtr, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(authidentity.rawAddress, pszpackagename.rawAddress, ppnewauthidentity.rawAddress)

public actual fun sspiFreeAuthIdentity(authdata: ConstPtr) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(authdata.rawAddress)
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(psztargetname.rawAddress, pszhostname.rawAddress)

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(encryptedauthdata.rawAddress)

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus.toInt())

public actual fun sspiLocalFree(databuffer: ConstPtr) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(databuffer.rawAddress)
}

public actual fun sspiMarshalAuthIdentity(authidentity: ConstPtr, authidentitylength: MutPtr, authidentitybytearray: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(authidentity.rawAddress, authidentitylength.rawAddress, authidentitybytearray.rawAddress)

public actual fun sspiPrepareForCredRead(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(authidentity.rawAddress, psztargetname.rawAddress, pcredmancredentialtype.rawAddress, ppszcredmantargetname.rawAddress)

public actual fun sspiPrepareForCredWrite(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr, ppszcredmanusername: MutPtr, ppcredentialblob: MutPtr, pcredentialblobsize: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(authidentity.rawAddress, psztargetname.rawAddress, pcredmancredentialtype.rawAddress, ppszcredmantargetname.rawAddress, ppszcredmanusername.rawAddress, ppcredentialblob.rawAddress, pcredentialblobsize.rawAddress)

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(psztargetname.rawAddress, puiinfo.rawAddress, dwautherror.toInt(), pszpackage.rawAddress, pinputauthidentity.rawAddress, ppauthidentity.rawAddress, pfsave.rawAddress, dwflags.toInt()).toUInt()

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(psztargetname.rawAddress, puiinfo.rawAddress, dwautherror.toInt(), pszpackage.rawAddress, pinputauthidentity.rawAddress, ppauthidentity.rawAddress, pfsave.rawAddress, dwflags.toInt()).toUInt()

public actual fun sspiSetChannelBindingFlags(pbindings: MutPtr, flags: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(pbindings.rawAddress, flags.toInt())

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(authidentitylength.toInt(), authidentitybytearray.rawAddress, ppauthidentity.rawAddress)

public actual fun sspiValidateAuthIdentity(authdata: ConstPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(authdata.rawAddress)

public actual fun sspiZeroAuthIdentity(authdata: ConstPtr) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(authdata.rawAddress)
}

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings()

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(targeturl.rawAddress)

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr, tokenbinding: MutPtr, tokenbindingsize: MutPtr, resultdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(keytype, targeturl.rawAddress, bindingtype, tlsekm.rawAddress, tlsekmsize.toInt(), extensionformat, extensiondata.rawAddress, tokenbinding.rawAddress, tokenbindingsize.rawAddress, resultdata.rawAddress)

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr, publickeysize: UInt, resultdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(keytype, publickey.rawAddress, publickeysize.toInt(), resultdata.rawAddress)

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(keytype, targeturi.rawAddress, resultdata.rawAddress)

public actual fun tokenBindingGenerateMessage(tokenbindings: ConstPtr, tokenbindingssize: ConstPtr, tokenbindingscount: UInt, tokenbindingmessage: MutPtr, tokenbindingmessagesize: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(tokenbindings.rawAddress, tokenbindingssize.rawAddress, tokenbindingscount.toInt(), tokenbindingmessage.rawAddress, tokenbindingmessagesize.rawAddress)

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr, minorversion: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(majorversion.rawAddress, minorversion.rawAddress)

public actual fun tokenBindingGetKeyTypesClient(keytypes: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(keytypes.rawAddress)

public actual fun tokenBindingGetKeyTypesServer(keytypes: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(keytypes.rawAddress)

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr, tlsekmsize: UInt, resultlist: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(tokenbindingmessage.rawAddress, tokenbindingmessagesize.toInt(), keytype, tlsekm.rawAddress, tlsekmsize.toInt(), resultlist.rawAddress)

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(lpaccountname.rawAddress, accountnameformat, desirednameformat, lptranslatedname.rawAddress, nsize.rawAddress)

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(lpaccountname.rawAddress, accountnameformat, desirednameformat, lptranslatedname.rawAddress, nsize.rawAddress)

public actual fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(phcontext.rawAddress, pmessage.rawAddress, messageseqno.toInt(), pfqop.rawAddress)
