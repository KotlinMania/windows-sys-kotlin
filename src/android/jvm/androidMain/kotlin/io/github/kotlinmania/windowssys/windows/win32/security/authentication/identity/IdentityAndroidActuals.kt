@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.COpaquePointer
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
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_acceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleA(pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleW(pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_addCredentialsA(hcredentials: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_addCredentialsW(hcredentials: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_addSecurityPackageA(pszpackagename: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_addSecurityPackageW(pszpackagename: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_applyControlToken(phcontext: Long, pinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyBySid(psid: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyByToken(htokenhandle: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditFree(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditLookupCategoryGuidFromCategoryId(auditcategoryid: Int, pauditcategoryguid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclA(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclW(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditQueryPerUserPolicy(psid: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditQuerySecurity(securityinformation: Int, ppsecuritydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclA(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclW(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditSetPerUserPolicy(psid: Long, pauditpolicy: Long, dwpolicycount: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditSetSecurity(securityinformation: Int, psecuritydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_auditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_changeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: Int, poutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_changeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: Int, poutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_completeAuthToken(phcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_credMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_credUnmarshalTargetInfo(buffer: Long, buffersize: Int, rettargetinfo: Long, retactualsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_decryptMessage(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_deleteSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageA(pszpackagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageW(pszpackagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_encryptMessage(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_exportSecurityContext(phcontext: Long, fflags: Int, ppackedcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_freeContextBuffer(pvcontextbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_freeCredentialsHandle(phcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_getComputerObjectNameA(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_getComputerObjectNameW(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_getUserNameExA(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_getUserNameExW(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_impersonateSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_importSecurityContextA(pszpackage: Long, ppackedcontext: Long, token: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_importSecurityContextW(pszpackage: Long, ppackedcontext: Long, token: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceA(): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceW(): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_initializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_initializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaAddAccountRights(policyhandle: Long, accountsid: Long, userrights: Long, countofrights: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaCallAuthenticationPackage(lsahandle: Long, authenticationpackage: Int, protocolsubmitbuffer: Long, submitbufferlength: Int, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaClose(objecthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaConnectUntrusted(lsahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaCreateTrustedDomainEx(policyhandle: Long, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: Int, trusteddomainhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaDeleteTrustedDomain(policyhandle: Long, trusteddomainsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaDeregisterLogonProcess(lsahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountRights(policyhandle: Long, accountsid: Long, userrights: Long, countofrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountsWithUserRight(policyhandle: Long, userright: Long, buffer: Long, countreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomains(policyhandle: Long, enumerationcontext: Long, buffer: Long, preferedmaximumlength: Int, countreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomainsEx(policyhandle: Long, enumerationcontext: Long, buffer: Long, preferedmaximumlength: Int, countreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaFreeMemory(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaFreeReturnBuffer(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaLookupAuthenticationPackage(lsahandle: Long, packagename: Long, authenticationpackage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaLookupNames(policyhandle: Long, count: Int, names: Long, referenceddomains: Long, sids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaLookupNames2(policyhandle: Long, flags: Int, count: Int, names: Long, referenceddomains: Long, sids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaLookupSids(policyhandle: Long, count: Int, sids: Long, referenceddomains: Long, names: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaLookupSids2(policyhandle: Long, lookupoptions: Int, count: Int, sids: Long, referenceddomains: Long, names: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaNtStatusToWinError(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: Int, policyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaOpenTrustedDomainByName(policyhandle: Long, trusteddomainname: Long, desiredaccess: Int, trusteddomainhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryCAPs(capids: Long, capidcount: Int, caps: Long, capcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryDomainInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation(policyhandle: Long, trusteddomainname: Long, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation2(policyhandle: Long, trusteddomainname: Long, highestrecordtype: Int, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfo(policyhandle: Long, trusteddomainsid: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfoByName(policyhandle: Long, trusteddomainname: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaRegisterPolicyChangeNotification(informationclass: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaRemoveAccountRights(policyhandle: Long, accountsid: Long, allrights: Boolean, userrights: Long, countofrights: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaRetrievePrivateData(policyhandle: Long, keyname: Long, privatedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetCAPs(capdns: Long, capdncount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetDomainInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation(policyhandle: Long, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation2(policyhandle: Long, trusteddomainname: Long, highestrecordtype: Int, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInfoByName(policyhandle: Long, trusteddomainname: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInformation(policyhandle: Long, trusteddomainsid: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaStorePrivateData(policyhandle: Long, keyname: Long, privatedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_lsaUnregisterPolicyChangeNotification(informationclass: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_makeSignature(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryContextAttributesA(phcontext: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryContextAttributesExA(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryContextAttributesExW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesA(phcredential: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExA(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExW(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesW(phcredential: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_querySecurityContextToken(phcontext: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoA(pszpackagename: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoW(pszpackagename: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_revertSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_rtlDecryptMemory(memory: Long, memorysize: Int, optionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_rtlEncryptMemory(memory: Long, memorysize: Int, optionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_rtlGenRandom(randombuffer: Long, randombufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: Long, pwszserverurl: Long, pwszclienttoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: Int, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: Long, wproxyport: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLClose(hslc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: Long, pwszconfirmationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: Long, pwszconfirmationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLFireEvent(hslc: Long, pwszeventid: Long, papplicationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetGenuineInformation(pqueryid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetLicenseFileId(hslc: Long, cblicenseblob: Int, pblicenseblob: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: Long, pnstatuscount: Long, pplicensingstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetPKeyId(hslc: Long, pwszpkeyalgorithm: Long, pwszpkeystring: Long, cbpkeyspecificdata: Int, pbpkeyspecificdata: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformation(hslc: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetReferralInformation(hslc: Long, ereferraltype: Int, pskuorappid: Long, pwszvaluename: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetSLIDList(hslc: Long, equeryidtype: Int, pqueryid: Long, ereturnidtype: Int, pnreturnids: Long, ppreturnids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetServerStatus(pwszserverurl: Long, pwszacquisitiontype: Long, pwszproxyserver: Long, wproxyport: Short, phrstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetServiceInformation(hslc: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformation(pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformationDWORD(pwszvaluename: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLInstallLicense(hslc: Long, cblicenseblob: Int, pblicenseblob: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: Long, pwszpkeystring: Long, cbpkeyspecificdata: Int, pbpkeyspecificdata: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLOpen(phslc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLQueryLicenseValueFromApp(valuename: Long, valuetype: Long, databuffer: Long, datasize: Int, resultdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLRegisterEvent(hslc: Long, pwszeventid: Long, papplicationid: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLSetGenuineInformation(pqueryid: Long, pwszvaluename: Long, edatatype: Int, cbvalue: Int, pbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLUninstallLicense(hslc: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sLUnregisterEvent(hslc: Long, pwszeventid: Long, papplicationid: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesA(profilelist: Long, profilecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesW(profilelist: Long, profilecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslGetContextOption(contexthandle: Long, option: Int, value: Long, size: Int, needed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageA(profilename: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageW(profilename: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageA(pinput: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageW(pinput: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_saslSetContextOption(contexthandle: Long, option: Int, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sendSAS(asuser: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_setContextAttributesA(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_setContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesA(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesW(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslCrackCertificate(pbcertificate: Long, cbcertificate: Int, dwflags: Int, ppcertificate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslEmptyCacheA(psztargetname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslEmptyCacheW(psztargetname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslFreeCertificate(pcertificate: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslGenerateRandomBits(prandomdata: Long, crandomdata: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslGetExtensions(clienthello: Long, clienthellobytesize: Int, genericextensions: Long, genericextensionscount: Byte, bytestoread: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslGetMaximumKeySize(reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sslGetServerIdentity(clienthello: Long, clienthellosize: Int, serveridentity: Long, serveridentitysize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentity(encryptedauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentityEx(options: Int, encryptedauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiEncodeStringsAsAuthIdentity(pszusername: Long, pszdomainname: Long, pszpackedcredentialsstring: Long, ppauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentity(authdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentityEx(options: Int, authdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiExcludePackage(authidentity: Long, pszpackagename: Long, ppnewauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiFreeAuthIdentity(authdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiGetTargetHostName(psztargetname: Long, pszhostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiIsPromptingNeeded(errororntstatus: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiLocalFree(databuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredRead(authidentity: Long, psztargetname: Long, pcredmancredentialtype: Long, ppszcredmantargetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredWrite(authidentity: Long, psztargetname: Long, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsA(psztargetname: Long, puiinfo: Long, dwautherror: Int, pszpackage: Long, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsW(psztargetname: Long, puiinfo: Long, dwautherror: Int, pszpackage: Long, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiSetChannelBindingFlags(pbindings: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiUnmarshalAuthIdentity(authidentitylength: Int, authidentitybytearray: Long, ppauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiValidateAuthIdentity(authdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_sspiZeroAuthIdentity(authdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteAllBindings(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteBinding(targeturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateBinding(keytype: Int, targeturl: Long, bindingtype: Int, tlsekm: Long, tlsekmsize: Int, extensionformat: Int, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateID(keytype: Int, publickey: Long, publickeysize: Int, resultdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateIDForUri(keytype: Int, targeturi: Long, resultdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: Int, tokenbindingmessage: Long, tokenbindingmessagesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesClient(keytypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesServer(keytypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_tokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: Int, keytype: Int, tlsekm: Long, tlsekmsize: Int, resultlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_translateNameA(lpaccountname: Long, accountnameformat: Int, desirednameformat: Int, lptranslatedname: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_translateNameW(lpaccountname: Long, accountnameformat: Int, desirednameformat: Int, lptranslatedname: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_verifySignature(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int
}

public actual fun acceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_acceptSecurityContext((phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (pinput?.value ?: 0L), fcontextreq.toInt(), targetdatarep.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleA((pszprincipal?.value ?: 0L), (pszpackage?.value ?: 0L), fcredentialuse.toInt(), (pvlogonid?.value ?: 0L), (pauthdata?.value ?: 0L), 0L, (pvgetkeyargument?.value ?: 0L), (phcredential?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleW((pszprincipal?.value ?: 0L), (pszpackage?.value ?: 0L), fcredentialuse.toInt(), (pvlogonid?.value ?: 0L), (pauthdata?.value ?: 0L), 0L, (pvgetkeyargument?.value ?: 0L), (phcredential?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun addCredentialsA(hcredentials: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_addCredentialsA((hcredentials?.value ?: 0L), (pszprincipal?.value ?: 0L), (pszpackage?.value ?: 0L), fcredentialuse.toInt(), (pauthdata?.value ?: 0L), 0L, (pvgetkeyargument?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun addCredentialsW(hcredentials: COpaquePointer?, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_addCredentialsW((hcredentials?.value ?: 0L), (pszprincipal?.value ?: 0L), (pszpackage?.value ?: 0L), fcredentialuse.toInt(), (pauthdata?.value ?: 0L), 0L, (pvgetkeyargument?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_addSecurityPackageA((pszpackagename?.value ?: 0L), (poptions?.value ?: 0L))

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_addSecurityPackageW((pszpackagename?.value ?: 0L), (poptions?.value ?: 0L))

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_applyControlToken((phcontext?.value ?: 0L), (pinput?.value ?: 0L))

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyBySid((psid?.value ?: 0L), (psubcategoryguids?.value ?: 0L), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L))

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyByToken((htokenhandle?.value ?: 0L), (psubcategoryguids?.value ?: 0L), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L))

public actual fun auditEnumerateCategories(ppauditcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditEnumerateCategories((ppauditcategoriesarray?.value ?: 0L), (pdwcountreturned?.value ?: 0L))

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditEnumeratePerUserPolicy((ppauditsidarray?.value ?: 0L))

public actual fun auditEnumerateSubCategories(pauditcategoryguid: COpaquePointer?, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditEnumerateSubCategories((pauditcategoryguid?.value ?: 0L), bretrieveallsubcategories, (ppauditsubcategoriesarray?.value ?: 0L), (pdwcountreturned?.value ?: 0L))

public actual fun auditFree(buffer: COpaquePointer?) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditFree((buffer?.value ?: 0L))
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryGuidFromCategoryId(auditcategoryid, (pauditcategoryguid?.value ?: 0L))

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: COpaquePointer?, pauditcategoryid: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryIdFromCategoryGuid((pauditcategoryguid?.value ?: 0L), (pauditcategoryid?.value ?: 0L))

public actual fun auditLookupCategoryNameA(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameA((pauditcategoryguid?.value ?: 0L), (ppszcategoryname?.value ?: 0L))

public actual fun auditLookupCategoryNameW(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameW((pauditcategoryguid?.value ?: 0L), (ppszcategoryname?.value ?: 0L))

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameA((pauditsubcategoryguid?.value ?: 0L), (ppszsubcategoryname?.value ?: 0L))

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameW((pauditsubcategoryguid?.value ?: 0L), (ppszsubcategoryname?.value ?: 0L))

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclA((objecttypename?.value ?: 0L), (acl?.value ?: 0L))

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclW((objecttypename?.value ?: 0L), (acl?.value ?: 0L))

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditQueryPerUserPolicy((psid?.value ?: 0L), (psubcategoryguids?.value ?: 0L), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L))

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditQuerySecurity(securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L))

public actual fun auditQuerySystemPolicy(psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditQuerySystemPolicy((psubcategoryguids?.value ?: 0L), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L))

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclA((objecttypename?.value ?: 0L), (acl?.value ?: 0L))

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclW((objecttypename?.value ?: 0L), (acl?.value ?: 0L))

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditSetPerUserPolicy((psid?.value ?: 0L), (pauditpolicy?.value ?: 0L), dwpolicycount.toInt())

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditSetSecurity(securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))

public actual fun auditSetSystemPolicy(pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_auditSetSystemPolicy((pauditpolicy?.value ?: 0L), dwpolicycount.toInt())

public actual fun changeAccountPasswordA(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_changeAccountPasswordA((pszpackagename?.value ?: 0L), (pszdomainname?.value ?: 0L), (pszaccountname?.value ?: 0L), (pszoldpassword?.value ?: 0L), (psznewpassword?.value ?: 0L), bimpersonating, dwreserved.toInt(), (poutput?.value ?: 0L))

public actual fun changeAccountPasswordW(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_changeAccountPasswordW((pszpackagename?.value ?: 0L), (pszdomainname?.value ?: 0L), (pszaccountname?.value ?: 0L), (pszoldpassword?.value ?: 0L), (psznewpassword?.value ?: 0L), bimpersonating, dwreserved.toInt(), (poutput?.value ?: 0L))

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_completeAuthToken((phcontext?.value ?: 0L), (ptoken?.value ?: 0L))

public actual fun credMarshalTargetInfo(intargetinfo: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_credMarshalTargetInfo((intargetinfo?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L))

public actual fun credUnmarshalTargetInfo(buffer: COpaquePointer?, buffersize: UInt, rettargetinfo: COpaquePointer?, retactualsize: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_credUnmarshalTargetInfo((buffer?.value ?: 0L), buffersize.toInt(), (rettargetinfo?.value ?: 0L), (retactualsize?.value ?: 0L))

public actual fun decryptMessage(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_decryptMessage((phcontext?.value ?: 0L), (pmessage?.value ?: 0L), messageseqno.toInt(), (pfqop?.value ?: 0L))

public actual fun deleteSecurityContext(phcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_deleteSecurityContext((phcontext?.value ?: 0L))

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageA((pszpackagename?.value ?: 0L))

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageW((pszpackagename?.value ?: 0L))

public actual fun encryptMessage(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_encryptMessage((phcontext?.value ?: 0L), fqop.toInt(), (pmessage?.value ?: 0L), messageseqno.toInt())

public actual fun enumerateSecurityPackagesA(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesA((pcpackages?.value ?: 0L), (pppackageinfo?.value ?: 0L))

public actual fun enumerateSecurityPackagesW(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesW((pcpackages?.value ?: 0L), (pppackageinfo?.value ?: 0L))

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: ExportSecurityContextFlags, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_exportSecurityContext((phcontext?.value ?: 0L), fflags.toInt(), (ppackedcontext?.value ?: 0L), (ptoken?.value ?: 0L))

public actual fun freeContextBuffer(pvcontextbuffer: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_freeContextBuffer((pvcontextbuffer?.value ?: 0L))

public actual fun freeCredentialsHandle(phcredential: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_freeCredentialsHandle((phcredential?.value ?: 0L))

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_getComputerObjectNameA(nameformat, (lpnamebuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_getComputerObjectNameW(nameformat, (lpnamebuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_getUserNameExA(nameformat, (lpnamebuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_getUserNameExW(nameformat, (lpnamebuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun impersonateSecurityContext(phcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_impersonateSecurityContext((phcontext?.value ?: 0L))

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_importSecurityContextA((pszpackage?.value ?: 0L), (ppackedcontext?.value ?: 0L), (token?.value ?: 0L), (phcontext?.value ?: 0L))

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_importSecurityContextW((pszpackage?.value ?: 0L), (ppackedcontext?.value ?: 0L), (token?.value ?: 0L), (phcontext?.value ?: 0L))

public actual fun initSecurityInterfaceA(): COpaquePointer? =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceA().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initSecurityInterfaceW(): COpaquePointer? =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceW().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_initializeSecurityContextA((phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (psztargetname?.value ?: 0L), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L), reserved2.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun initializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_initializeSecurityContextW((phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (psztargetname?.value ?: 0L), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L), reserved2.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaAddAccountRights(policyhandle, (accountsid?.value ?: 0L), (userrights?.value ?: 0L), countofrights.toInt())

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaCallAuthenticationPackage((lsahandle?.value ?: 0L), authenticationpackage.toInt(), (protocolsubmitbuffer?.value ?: 0L), submitbufferlength.toInt(), (protocolreturnbuffer?.value ?: 0L), (returnbufferlength?.value ?: 0L), (protocolstatus?.value ?: 0L))

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaClose(objecthandle)

public actual fun lsaConnectUntrusted(lsahandle: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaConnectUntrusted((lsahandle?.value ?: 0L))

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: COpaquePointer?, authenticationinformation: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaCreateTrustedDomainEx(policyhandle, (trusteddomaininformation?.value ?: 0L), (authenticationinformation?.value ?: 0L), desiredaccess.toInt(), (trusteddomainhandle?.value ?: 0L))

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaDeleteTrustedDomain(policyhandle, (trusteddomainsid?.value ?: 0L))

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaDeregisterLogonProcess((lsahandle?.value ?: 0L))

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountRights(policyhandle, (accountsid?.value ?: 0L), (userrights?.value ?: 0L), (countofrights?.value ?: 0L))

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: COpaquePointer?, buffer: COpaquePointer?, countreturned: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountsWithUserRight(policyhandle, (userright?.value ?: 0L), (buffer?.value ?: 0L), (countreturned?.value ?: 0L))

public actual fun lsaEnumerateLogonSessions(logonsessioncount: COpaquePointer?, logonsessionlist: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaEnumerateLogonSessions((logonsessioncount?.value ?: 0L), (logonsessionlist?.value ?: 0L))

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomains(policyhandle, (enumerationcontext?.value ?: 0L), (buffer?.value ?: 0L), preferedmaximumlength.toInt(), (countreturned?.value ?: 0L))

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomainsEx(policyhandle, (enumerationcontext?.value ?: 0L), (buffer?.value ?: 0L), preferedmaximumlength.toInt(), (countreturned?.value ?: 0L))

public actual fun lsaFreeMemory(buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaFreeMemory((buffer?.value ?: 0L))

public actual fun lsaFreeReturnBuffer(buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaFreeReturnBuffer((buffer?.value ?: 0L))

public actual fun lsaGetAppliedCAPIDs(systemname: COpaquePointer?, capids: COpaquePointer?, capidcount: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaGetAppliedCAPIDs((systemname?.value ?: 0L), (capids?.value ?: 0L), (capidcount?.value ?: 0L))

public actual fun lsaGetLogonSessionData(logonid: COpaquePointer?, pplogonsessiondata: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaGetLogonSessionData((logonid?.value ?: 0L), (pplogonsessiondata?.value ?: 0L))

public actual fun lsaLogonUser(lsahandle: Handle, originname: COpaquePointer?, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: COpaquePointer?, authenticationinformationlength: UInt, localgroups: COpaquePointer?, sourcecontext: COpaquePointer?, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, token: COpaquePointer?, quotas: COpaquePointer?, substatus: COpaquePointer?): Ntstatus =
    0

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: COpaquePointer?, authenticationpackage: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaLookupAuthenticationPackage((lsahandle?.value ?: 0L), (packagename?.value ?: 0L), (authenticationpackage?.value ?: 0L))

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaLookupNames(policyhandle, count.toInt(), (names?.value ?: 0L), (referenceddomains?.value ?: 0L), (sids?.value ?: 0L))

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaLookupNames2(policyhandle, flags.toInt(), count.toInt(), (names?.value ?: 0L), (referenceddomains?.value ?: 0L), (sids?.value ?: 0L))

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaLookupSids(policyhandle, count.toInt(), (sids?.value ?: 0L), (referenceddomains?.value ?: 0L), (names?.value ?: 0L))

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaLookupSids2(policyhandle, lookupoptions.toInt(), count.toInt(), (sids?.value ?: 0L), (referenceddomains?.value ?: 0L), (names?.value ?: 0L))

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaNtStatusToWinError(status).toUInt()

public actual fun lsaOpenPolicy(systemname: COpaquePointer?, objectattributes: COpaquePointer?, desiredaccess: UInt, policyhandle: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaOpenPolicy((systemname?.value ?: 0L), (objectattributes?.value ?: 0L), desiredaccess.toInt(), (policyhandle?.value ?: 0L))

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaOpenTrustedDomainByName(policyhandle, (trusteddomainname?.value ?: 0L), desiredaccess.toInt(), (trusteddomainhandle?.value ?: 0L))

public actual fun lsaQueryCAPs(capids: COpaquePointer?, capidcount: UInt, caps: COpaquePointer?, capcount: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryCAPs((capids?.value ?: 0L), capidcount.toInt(), (caps?.value ?: 0L), (capcount?.value ?: 0L))

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryDomainInformationPolicy(policyhandle, informationclass, (buffer?.value ?: 0L))

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation(policyhandle, (trusteddomainname?.value ?: 0L), (foresttrustinfo?.value ?: 0L))

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation2(policyhandle, (trusteddomainname?.value ?: 0L), highestrecordtype, (foresttrustinfo?.value ?: 0L))

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryInformationPolicy(policyhandle, informationclass, (buffer?.value ?: 0L))

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfo(policyhandle, (trusteddomainsid?.value ?: 0L), informationclass, (buffer?.value ?: 0L))

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfoByName(policyhandle, (trusteddomainname?.value ?: 0L), informationclass, (buffer?.value ?: 0L))

public actual fun lsaRegisterLogonProcess(logonprocessname: COpaquePointer?, lsahandle: COpaquePointer?, securitymode: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaRegisterLogonProcess((logonprocessname?.value ?: 0L), (lsahandle?.value ?: 0L), (securitymode?.value ?: 0L))

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaRegisterPolicyChangeNotification(informationclass, (notificationeventhandle?.value ?: 0L))

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaRemoveAccountRights(policyhandle, (accountsid?.value ?: 0L), allrights, (userrights?.value ?: 0L), countofrights.toInt())

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaRetrievePrivateData(policyhandle, (keyname?.value ?: 0L), (privatedata?.value ?: 0L))

public actual fun lsaSetCAPs(capdns: COpaquePointer?, capdncount: UInt, flags: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetCAPs((capdns?.value ?: 0L), capdncount.toInt(), flags.toInt())

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetDomainInformationPolicy(policyhandle, informationclass, (buffer?.value ?: 0L))

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation(policyhandle, (trusteddomainname?.value ?: 0L), (foresttrustinfo?.value ?: 0L), checkonly, (collisioninfo?.value ?: 0L))

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation2(policyhandle, (trusteddomainname?.value ?: 0L), highestrecordtype, (foresttrustinfo?.value ?: 0L), checkonly, (collisioninfo?.value ?: 0L))

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetInformationPolicy(policyhandle, informationclass, (buffer?.value ?: 0L))

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInfoByName(policyhandle, (trusteddomainname?.value ?: 0L), informationclass, (buffer?.value ?: 0L))

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInformation(policyhandle, (trusteddomainsid?.value ?: 0L), informationclass, (buffer?.value ?: 0L))

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaStorePrivateData(policyhandle, (keyname?.value ?: 0L), (privatedata?.value ?: 0L))

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_lsaUnregisterPolicyChangeNotification(informationclass, (notificationeventhandle?.value ?: 0L))

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_makeSignature((phcontext?.value ?: 0L), fqop.toInt(), (pmessage?.value ?: 0L), messageseqno.toInt())

public actual fun queryContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryContextAttributesA((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L))

public actual fun queryContextAttributesExA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryContextAttributesExA((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun queryContextAttributesExW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryContextAttributesExW((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun queryContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryContextAttributesW((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L))

public actual fun queryCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesA((phcredential?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L))

public actual fun queryCredentialsAttributesExA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExA((phcredential?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun queryCredentialsAttributesExW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExW((phcredential?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun queryCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesW((phcredential?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L))

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_querySecurityContextToken((phcontext?.value ?: 0L), (token?.value ?: 0L))

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoA((pszpackagename?.value ?: 0L), (pppackageinfo?.value ?: 0L))

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoW((pszpackagename?.value ?: 0L), (pppackageinfo?.value ?: 0L))

public actual fun revertSecurityContext(phcontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_revertSecurityContext((phcontext?.value ?: 0L))

public actual fun rtlDecryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_rtlDecryptMemory((memory?.value ?: 0L), memorysize.toInt(), optionflags.toInt())

public actual fun rtlEncryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_rtlEncryptMemory((memory?.value ?: 0L), memorysize.toInt(), optionflags.toInt())

public actual fun rtlGenRandom(randombuffer: COpaquePointer?, randombufferlength: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_rtlGenRandom((randombuffer?.value ?: 0L), randombufferlength.toInt())

public actual fun sLAcquireGenuineTicket(ppticketblob: COpaquePointer?, pcbticketblob: COpaquePointer?, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLAcquireGenuineTicket((ppticketblob?.value ?: 0L), (pcbticketblob?.value ?: 0L), (pwsztemplateid?.value ?: 0L), (pwszserverurl?.value ?: 0L), (pwszclienttoken?.value ?: 0L))

public actual fun sLActivateProduct(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, cbappspecificdata: UInt, pvappspecificdata: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLActivateProduct((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), cbappspecificdata.toInt(), (pvappspecificdata?.value ?: 0L), (pactivationinfo?.value ?: 0L), (pwszproxyserver?.value ?: 0L), wproxyport.toShort())

public actual fun sLClose(hslc: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLClose((hslc?.value ?: 0L))

public actual fun sLConsumeRight(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLConsumeRight((hslc?.value ?: 0L), (pappid?.value ?: 0L), (pproductskuid?.value ?: 0L), (pwszrightname?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun sLDepositOfflineConfirmationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationId((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (pwszinstallationid?.value ?: 0L), (pwszconfirmationid?.value ?: 0L))

public actual fun sLDepositOfflineConfirmationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationIdEx((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (pactivationinfo?.value ?: 0L), (pwszinstallationid?.value ?: 0L), (pwszconfirmationid?.value ?: 0L))

public actual fun sLFireEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLFireEvent((hslc?.value ?: 0L), (pwszeventid?.value ?: 0L), (papplicationid?.value ?: 0L))

public actual fun sLGenerateOfflineInstallationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationId((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (ppwszinstallationid?.value ?: 0L))

public actual fun sLGenerateOfflineInstallationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationIdEx((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (pactivationinfo?.value ?: 0L), (ppwszinstallationid?.value ?: 0L))

public actual fun sLGetApplicationInformation(hslc: COpaquePointer?, papplicationid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetApplicationInformation((hslc?.value ?: 0L), (papplicationid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetGenuineInformation((pqueryid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetInstalledProductKeyIds(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pnproductkeyids: COpaquePointer?, ppproductkeyids: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetInstalledProductKeyIds((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (pnproductkeyids?.value ?: 0L), (ppproductkeyids?.value ?: 0L))

public actual fun sLGetLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?, pcblicensefile: COpaquePointer?, ppblicensefile: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetLicense((hslc?.value ?: 0L), (plicensefileid?.value ?: 0L), (pcblicensefile?.value ?: 0L), (ppblicensefile?.value ?: 0L))

public actual fun sLGetLicenseFileId(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetLicenseFileId((hslc?.value ?: 0L), cblicenseblob.toInt(), (pblicenseblob?.value ?: 0L), (plicensefileid?.value ?: 0L))

public actual fun sLGetLicenseInformation(hslc: COpaquePointer?, psllicenseid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetLicenseInformation((hslc?.value ?: 0L), (psllicenseid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetLicensingStatusInformation(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pnstatuscount: COpaquePointer?, pplicensingstatus: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetLicensingStatusInformation((hslc?.value ?: 0L), (pappid?.value ?: 0L), (pproductskuid?.value ?: 0L), (pwszrightname?.value ?: 0L), (pnstatuscount?.value ?: 0L), (pplicensingstatus?.value ?: 0L))

public actual fun sLGetPKeyId(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetPKeyId((hslc?.value ?: 0L), (pwszpkeyalgorithm?.value ?: 0L), (pwszpkeystring?.value ?: 0L), cbpkeyspecificdata.toInt(), (pbpkeyspecificdata?.value ?: 0L), (ppkeyid?.value ?: 0L))

public actual fun sLGetPKeyInformation(hslc: COpaquePointer?, ppkeyid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetPKeyInformation((hslc?.value ?: 0L), (ppkeyid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetPolicyInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformation((hslc?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetPolicyInformationDWORD(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformationDWORD((hslc?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pdwvalue?.value ?: 0L))

public actual fun sLGetProductSkuInformation(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetProductSkuInformation((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetReferralInformation(hslc: COpaquePointer?, ereferraltype: Slreferraltype, pskuorappid: COpaquePointer?, pwszvaluename: Pcwstr, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetReferralInformation((hslc?.value ?: 0L), ereferraltype, (pskuorappid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun sLGetSLIDList(hslc: COpaquePointer?, equeryidtype: Slidtype, pqueryid: COpaquePointer?, ereturnidtype: Slidtype, pnreturnids: COpaquePointer?, ppreturnids: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetSLIDList((hslc?.value ?: 0L), equeryidtype, (pqueryid?.value ?: 0L), ereturnidtype, (pnreturnids?.value ?: 0L), (ppreturnids?.value ?: 0L))

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetServerStatus((pwszserverurl?.value ?: 0L), (pwszacquisitiontype?.value ?: 0L), (pwszproxyserver?.value ?: 0L), wproxyport.toShort(), (phrstatus?.value ?: 0L))

public actual fun sLGetServiceInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetServiceInformation((hslc?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformation((pwszvaluename?.value ?: 0L), (pedatatype?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformationDWORD((pwszvaluename?.value ?: 0L), (pdwvalue?.value ?: 0L))

public actual fun sLInstallLicense(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLInstallLicense((hslc?.value ?: 0L), cblicenseblob.toInt(), (pblicenseblob?.value ?: 0L), (plicensefileid?.value ?: 0L))

public actual fun sLInstallProofOfPurchase(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLInstallProofOfPurchase((hslc?.value ?: 0L), (pwszpkeyalgorithm?.value ?: 0L), (pwszpkeystring?.value ?: 0L), cbpkeyspecificdata.toInt(), (pbpkeyspecificdata?.value ?: 0L), (ppkeyid?.value ?: 0L))

public actual fun sLIsGenuineLocal(pappid: COpaquePointer?, pgenuinestate: COpaquePointer?, puioptions: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLIsGenuineLocal((pappid?.value ?: 0L), (pgenuinestate?.value ?: 0L), (puioptions?.value ?: 0L))

public actual fun sLOpen(phslc: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLOpen((phslc?.value ?: 0L))

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: COpaquePointer?, databuffer: COpaquePointer?, datasize: UInt, resultdatasize: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLQueryLicenseValueFromApp((valuename?.value ?: 0L), (valuetype?.value ?: 0L), (databuffer?.value ?: 0L), datasize.toInt(), (resultdatasize?.value ?: 0L))

public actual fun sLRegisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLRegisterEvent((hslc?.value ?: 0L), (pwszeventid?.value ?: 0L), (papplicationid?.value ?: 0L), (hevent?.value ?: 0L))

public actual fun sLSetCurrentProductKey(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pproductkeyid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLSetCurrentProductKey((hslc?.value ?: 0L), (pproductskuid?.value ?: 0L), (pproductkeyid?.value ?: 0L))

public actual fun sLSetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLSetGenuineInformation((pqueryid?.value ?: 0L), (pwszvaluename?.value ?: 0L), edatatype.toInt(), cbvalue.toInt(), (pbvalue?.value ?: 0L))

public actual fun sLUninstallLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLUninstallLicense((hslc?.value ?: 0L), (plicensefileid?.value ?: 0L))

public actual fun sLUninstallProofOfPurchase(hslc: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLUninstallProofOfPurchase((hslc?.value ?: 0L), (ppkeyid?.value ?: 0L))

public actual fun sLUnregisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sLUnregisterEvent((hslc?.value ?: 0L), (pwszeventid?.value ?: 0L), (papplicationid?.value ?: 0L), (hevent?.value ?: 0L))

public actual fun saslAcceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslAcceptSecurityContext((phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (pinput?.value ?: 0L), fcontextreq.toInt(), targetdatarep.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun saslEnumerateProfilesA(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesA((profilelist?.value ?: 0L), (profilecount?.value ?: 0L))

public actual fun saslEnumerateProfilesW(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesW((profilelist?.value ?: 0L), (profilecount?.value ?: 0L))

public actual fun saslGetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt, needed: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslGetContextOption((contexthandle?.value ?: 0L), option.toInt(), (value?.value ?: 0L), size.toInt(), (needed?.value ?: 0L))

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageA((profilename?.value ?: 0L), (packageinfo?.value ?: 0L))

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageW((profilename?.value ?: 0L), (packageinfo?.value ?: 0L))

public actual fun saslIdentifyPackageA(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageA((pinput?.value ?: 0L), (packageinfo?.value ?: 0L))

public actual fun saslIdentifyPackageW(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageW((pinput?.value ?: 0L), (packageinfo?.value ?: 0L))

public actual fun saslInitializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextA((phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (psztargetname?.value ?: 0L), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L), reserved2.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun saslInitializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextW((phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (psztargetname?.value ?: 0L), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L), reserved2.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun saslSetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_saslSetContextOption((contexthandle?.value ?: 0L), option.toInt(), (value?.value ?: 0L), size.toInt())

public actual fun sendSAS(asuser: Bool) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sendSAS(asuser)
}

public actual fun setContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_setContextAttributesA((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_setContextAttributesW((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun setCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesA((phcredential?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun setCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesW((phcredential?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun sslCrackCertificate(pbcertificate: COpaquePointer?, cbcertificate: UInt, dwflags: UInt, ppcertificate: COpaquePointer?): Bool =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslCrackCertificate((pbcertificate?.value ?: 0L), cbcertificate.toInt(), dwflags.toInt(), (ppcertificate?.value ?: 0L))

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: COpaquePointer?): Hresult =
    0

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslEmptyCacheA((psztargetname?.value ?: 0L), dwflags.toInt())

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslEmptyCacheW((psztargetname?.value ?: 0L), dwflags.toInt())

public actual fun sslFreeCertificate(pcertificate: COpaquePointer?) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslFreeCertificate((pcertificate?.value ?: 0L))
}

public actual fun sslGenerateRandomBits(prandomdata: COpaquePointer?, crandomdata: Int) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslGenerateRandomBits((prandomdata?.value ?: 0L), crandomdata)
}

public actual fun sslGetExtensions(clienthello: COpaquePointer?, clienthellobytesize: UInt, genericextensions: COpaquePointer?, genericextensionscount: UByte, bytestoread: COpaquePointer?, flags: SchGetExtensionsOptions): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslGetExtensions((clienthello?.value ?: 0L), clienthellobytesize.toInt(), (genericextensions?.value ?: 0L), genericextensionscount.toByte(), (bytestoread?.value ?: 0L), flags)

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslGetMaximumKeySize(reserved.toInt()).toUInt()

public actual fun sslGetServerIdentity(clienthello: COpaquePointer?, clienthellosize: UInt, serveridentity: COpaquePointer?, serveridentitysize: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sslGetServerIdentity((clienthello?.value ?: 0L), clienthellosize.toInt(), (serveridentity?.value ?: 0L), (serveridentitysize?.value ?: 0L), flags.toInt())

public actual fun sspiCompareAuthIdentities(authidentity1: COpaquePointer?, authidentity2: COpaquePointer?, samesupplieduser: COpaquePointer?, samesuppliedidentity: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiCompareAuthIdentities((authidentity1?.value ?: 0L), (authidentity2?.value ?: 0L), (samesupplieduser?.value ?: 0L), (samesuppliedidentity?.value ?: 0L))

public actual fun sspiCopyAuthIdentity(authdata: COpaquePointer?, authdatacopy: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiCopyAuthIdentity((authdata?.value ?: 0L), (authdatacopy?.value ?: 0L))

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentity((encryptedauthdata?.value ?: 0L))

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentityEx(options.toInt(), (encryptedauthdata?.value ?: 0L))

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: COpaquePointer?, ppszusername: COpaquePointer?, ppszdomainname: COpaquePointer?, ppszpackedcredentialsstring: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiEncodeAuthIdentityAsStrings((pauthidentity?.value ?: 0L), (ppszusername?.value ?: 0L), (ppszdomainname?.value ?: 0L), (ppszpackedcredentialsstring?.value ?: 0L))

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiEncodeStringsAsAuthIdentity((pszusername?.value ?: 0L), (pszdomainname?.value ?: 0L), (pszpackedcredentialsstring?.value ?: 0L), (ppauthidentity?.value ?: 0L))

public actual fun sspiEncryptAuthIdentity(authdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentity((authdata?.value ?: 0L))

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentityEx(options.toInt(), (authdata?.value ?: 0L))

public actual fun sspiExcludePackage(authidentity: COpaquePointer?, pszpackagename: Pcwstr, ppnewauthidentity: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiExcludePackage((authidentity?.value ?: 0L), (pszpackagename?.value ?: 0L), (ppnewauthidentity?.value ?: 0L))

public actual fun sspiFreeAuthIdentity(authdata: COpaquePointer?) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiFreeAuthIdentity((authdata?.value ?: 0L))
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiGetTargetHostName((psztargetname?.value ?: 0L), (pszhostname?.value ?: 0L))

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiIsAuthIdentityEncrypted((encryptedauthdata?.value ?: 0L))

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiIsPromptingNeeded(errororntstatus.toInt())

public actual fun sspiLocalFree(databuffer: COpaquePointer?) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiLocalFree((databuffer?.value ?: 0L))
}

public actual fun sspiMarshalAuthIdentity(authidentity: COpaquePointer?, authidentitylength: COpaquePointer?, authidentitybytearray: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiMarshalAuthIdentity((authidentity?.value ?: 0L), (authidentitylength?.value ?: 0L), (authidentitybytearray?.value ?: 0L))

public actual fun sspiPrepareForCredRead(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredRead((authidentity?.value ?: 0L), (psztargetname?.value ?: 0L), (pcredmancredentialtype?.value ?: 0L), (ppszcredmantargetname?.value ?: 0L))

public actual fun sspiPrepareForCredWrite(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?, ppszcredmanusername: COpaquePointer?, ppcredentialblob: COpaquePointer?, pcredentialblobsize: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredWrite((authidentity?.value ?: 0L), (psztargetname?.value ?: 0L), (pcredmancredentialtype?.value ?: 0L), (ppszcredmantargetname?.value ?: 0L), (ppszcredmanusername?.value ?: 0L), (ppcredentialblob?.value ?: 0L), (pcredentialblobsize?.value ?: 0L))

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsA((psztargetname?.value ?: 0L), (puiinfo?.value ?: 0L), dwautherror.toInt(), (pszpackage?.value ?: 0L), (pinputauthidentity?.value ?: 0L), (ppauthidentity?.value ?: 0L), (pfsave?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsW((psztargetname?.value ?: 0L), (puiinfo?.value ?: 0L), dwautherror.toInt(), (pszpackage?.value ?: 0L), (pinputauthidentity?.value ?: 0L), (ppauthidentity?.value ?: 0L), (pfsave?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sspiSetChannelBindingFlags(pbindings: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiSetChannelBindingFlags((pbindings?.value ?: 0L), flags.toInt())

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiUnmarshalAuthIdentity(authidentitylength.toInt(), (authidentitybytearray?.value ?: 0L), (ppauthidentity?.value ?: 0L))

public actual fun sspiValidateAuthIdentity(authdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiValidateAuthIdentity((authdata?.value ?: 0L))

public actual fun sspiZeroAuthIdentity(authdata: COpaquePointer?) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_sspiZeroAuthIdentity((authdata?.value ?: 0L))
}

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteAllBindings()

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteBinding((targeturl?.value ?: 0L))

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: COpaquePointer?, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: COpaquePointer?, tokenbinding: COpaquePointer?, tokenbindingsize: COpaquePointer?, resultdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateBinding(keytype, (targeturl?.value ?: 0L), bindingtype, (tlsekm?.value ?: 0L), tlsekmsize.toInt(), extensionformat, (extensiondata?.value ?: 0L), (tokenbinding?.value ?: 0L), (tokenbindingsize?.value ?: 0L), (resultdata?.value ?: 0L))

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: COpaquePointer?, publickeysize: UInt, resultdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateID(keytype, (publickey?.value ?: 0L), publickeysize.toInt(), (resultdata?.value ?: 0L))

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateIDForUri(keytype, (targeturi?.value ?: 0L), (resultdata?.value ?: 0L))

public actual fun tokenBindingGenerateMessage(tokenbindings: COpaquePointer?, tokenbindingssize: COpaquePointer?, tokenbindingscount: UInt, tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateMessage((tokenbindings?.value ?: 0L), (tokenbindingssize?.value ?: 0L), tokenbindingscount.toInt(), (tokenbindingmessage?.value ?: 0L), (tokenbindingmessagesize?.value ?: 0L))

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGetHighestSupportedVersion((majorversion?.value ?: 0L), (minorversion?.value ?: 0L))

public actual fun tokenBindingGetKeyTypesClient(keytypes: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesClient((keytypes?.value ?: 0L))

public actual fun tokenBindingGetKeyTypesServer(keytypes: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesServer((keytypes?.value ?: 0L))

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: COpaquePointer?, tlsekmsize: UInt, resultlist: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_tokenBindingVerifyMessage((tokenbindingmessage?.value ?: 0L), tokenbindingmessagesize.toInt(), keytype, (tlsekm?.value ?: 0L), tlsekmsize.toInt(), (resultlist?.value ?: 0L))

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_translateNameA((lpaccountname?.value ?: 0L), accountnameformat, desirednameformat, (lptranslatedname?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: COpaquePointer?): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_translateNameW((lpaccountname?.value ?: 0L), accountnameformat, desirednameformat, (lptranslatedname?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_verifySignature((phcontext?.value ?: 0L), (pmessage?.value ?: 0L), messageseqno.toInt(), (pfqop?.value ?: 0L))
