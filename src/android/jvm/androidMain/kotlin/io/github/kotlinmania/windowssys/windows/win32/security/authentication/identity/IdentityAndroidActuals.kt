@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_INTEGER_BLOB

private object WindowsWin32SecurityAuthenticationIdentityJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA(pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW(pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pvlogonid: Long, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AddCredentialsA(hcredentials: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AddCredentialsW(hcredentials: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: Int, pauthdata: Long, pgetkeyfn: Long, pvgetkeyargument: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA(pszpackagename: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW(pszpackagename: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ApplyControlToken(phcontext: Long, pinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid(psid: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken(htokenhandle: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditFree(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId(auditcategoryid: Int, pauditcategoryguid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy(psid: Long, psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity(securityinformation: Int, ppsecuritydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: Int, ppauditpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW(objecttypename: Long, acl: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy(psid: Long, pauditpolicy: Long, dwpolicycount: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditSetSecurity(securityinformation: Int, psecuritydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: Int, poutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: Int, poutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_CompleteAuthToken(phcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo(buffer: Long, buffersize: Int, rettargetinfo: Long, retactualsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA(pszpackagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW(pszpackagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_EncryptMessage(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ExportSecurityContext(phcontext: Long, fflags: Int, ppackedcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_FreeContextBuffer(pvcontextbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle(phcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_GetUserNameExA(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_GetUserNameExW(nameformat: Int, lpnamebuffer: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA(pszpackage: Long, ppackedcontext: Long, token: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW(pszpackage: Long, ppackedcontext: Long, token: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA(): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW(): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights(policyhandle: Long, accountsid: Long, userrights: Long, countofrights: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage(lsahandle: Long, authenticationpackage: Int, protocolsubmitbuffer: Long, submitbufferlength: Int, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaClose(objecthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted(lsahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx(policyhandle: Long, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: Int, trusteddomainhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain(policyhandle: Long, trusteddomainsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess(lsahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights(policyhandle: Long, accountsid: Long, userrights: Long, countofrights: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight(policyhandle: Long, userright: Long, buffer: Long, countreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains(policyhandle: Long, enumerationcontext: Long, buffer: Long, preferedmaximumlength: Int, countreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx(policyhandle: Long, enumerationcontext: Long, buffer: Long, preferedmaximumlength: Int, countreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaFreeMemory(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage(lsahandle: Long, packagename: Long, authenticationpackage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaLookupNames(policyhandle: Long, count: Int, names: Long, referenceddomains: Long, sids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaLookupNames2(policyhandle: Long, flags: Int, count: Int, names: Long, referenceddomains: Long, sids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaLookupSids(policyhandle: Long, count: Int, sids: Long, referenceddomains: Long, names: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaLookupSids2(policyhandle: Long, lookupoptions: Int, count: Int, sids: Long, referenceddomains: Long, names: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: Int, policyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName(policyhandle: Long, trusteddomainname: Long, desiredaccess: Int, trusteddomainhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs(capids: Long, capidcount: Int, caps: Long, capcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation(policyhandle: Long, trusteddomainname: Long, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2(policyhandle: Long, trusteddomainname: Long, highestrecordtype: Int, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo(policyhandle: Long, trusteddomainsid: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName(policyhandle: Long, trusteddomainname: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification(informationclass: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights(policyhandle: Long, accountsid: Long, allrights: Boolean, userrights: Long, countofrights: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData(policyhandle: Long, keyname: Long, privatedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetCAPs(capdns: Long, capdncount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation(policyhandle: Long, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2(policyhandle: Long, trusteddomainname: Long, highestrecordtype: Int, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy(policyhandle: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName(policyhandle: Long, trusteddomainname: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation(policyhandle: Long, trusteddomainsid: Long, informationclass: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData(policyhandle: Long, keyname: Long, privatedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification(informationclass: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_MakeSignature(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA(phcontext: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA(phcredential: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW(phcredential: Long, ulattribute: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken(phcontext: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA(pszpackagename: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW(pszpackagename: Long, pppackageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_RevertSecurityContext(phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory(memory: Long, memorysize: Int, optionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory(memory: Long, memorysize: Int, optionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_RtlGenRandom(randombuffer: Long, randombufferlength: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: Long, pwszserverurl: Long, pwszclienttoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: Int, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: Long, wproxyport: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLClose(hslc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: Long, pwszconfirmationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: Long, pwszconfirmationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLFireEvent(hslc: Long, pwszeventid: Long, papplicationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation(pqueryid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId(hslc: Long, cblicenseblob: Int, pblicenseblob: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: Long, pnstatuscount: Long, pplicensingstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: Long, pwszpkeystring: Long, cbpkeyspecificdata: Int, pbpkeyspecificdata: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation(hslc: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation(hslc: Long, ereferraltype: Int, pskuorappid: Long, pwszvaluename: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetSLIDList(hslc: Long, equeryidtype: Int, pqueryid: Long, ereturnidtype: Int, pnreturnids: Long, ppreturnids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetServerStatus(pwszserverurl: Long, pwszacquisitiontype: Long, pwszproxyserver: Long, wproxyport: Short, phrstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation(hslc: Long, pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation(pwszvaluename: Long, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD(pwszvaluename: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLInstallLicense(hslc: Long, cblicenseblob: Int, pblicenseblob: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: Long, pwszpkeystring: Long, cbpkeyspecificdata: Int, pbpkeyspecificdata: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLOpen(phslc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp(valuename: Long, valuetype: Long, databuffer: Long, datasize: Int, resultdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLRegisterEvent(hslc: Long, pwszeventid: Long, papplicationid: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation(pqueryid: Long, pwszvaluename: Long, edatatype: Int, cbvalue: Int, pbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLUninstallLicense(hslc: Long, plicensefileid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent(hslc: Long, pwszeventid: Long, papplicationid: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslGetContextOption(contexthandle: Long, option: Int, value: Long, size: Int, needed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA(profilename: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW(profilename: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA(pinput: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW(pinput: Long, packageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SaslSetContextOption(contexthandle: Long, option: Int, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SendSAS(asuser: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SetContextAttributesA(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SetContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW(phcredential: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslCrackCertificate(pbcertificate: Long, cbcertificate: Int, dwflags: Int, ppcertificate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA(psztargetname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW(psztargetname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslFreeCertificate(pcertificate: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits(prandomdata: Long, crandomdata: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslGetExtensions(clienthello: Long, clienthellobytesize: Int, genericextensions: Long, genericextensionscount: Byte, bytestoread: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize(reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity(clienthello: Long, clienthellosize: Int, serveridentity: Long, serveridentitysize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity(encryptedauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx(options: Int, encryptedauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity(pszusername: Long, pszdomainname: Long, pszpackedcredentialsstring: Long, ppauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity(authdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx(options: Int, authdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiExcludePackage(authidentity: Long, pszpackagename: Long, ppnewauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity(authdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName(psztargetname: Long, pszhostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded(errororntstatus: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiLocalFree(databuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead(authidentity: Long, psztargetname: Long, pcredmancredentialtype: Long, ppszcredmantargetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite(authidentity: Long, psztargetname: Long, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA(psztargetname: Long, puiinfo: Long, dwautherror: Int, pszpackage: Long, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW(psztargetname: Long, puiinfo: Long, dwautherror: Int, pszpackage: Long, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags(pbindings: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity(authidentitylength: Int, authidentitybytearray: Long, ppauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity(authdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity(authdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding(targeturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding(keytype: Int, targeturl: Long, bindingtype: Int, tlsekm: Long, tlsekmsize: Int, extensionformat: Int, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID(keytype: Int, publickey: Long, publickeysize: Int, resultdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri(keytype: Int, targeturi: Long, resultdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: Int, tokenbindingmessage: Long, tokenbindingmessagesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient(keytypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer(keytypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: Int, keytype: Int, tlsekm: Long, tlsekmsize: Int, resultlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TranslateNameA(lpaccountname: Long, accountnameformat: Int, desirednameformat: Int, lptranslatedname: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_TranslateNameW(lpaccountname: Long, accountnameformat: Int, desirednameformat: Int, lptranslatedname: Long, nsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_security_authentication_identity_VerifySignature(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int
}

public actual fun AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext(phcredential, phcontext, pinput, fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun AcquireCredentialsHandleA(pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA(pszprincipal, pszpackage, fcredentialuse.toInt(), pvlogonid, pauthdata, pgetkeyfn.toLong(), pvgetkeyargument, phcredential, ptsexpiry)

public actual fun AcquireCredentialsHandleW(pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW(pszprincipal, pszpackage, fcredentialuse.toInt(), pvlogonid, pauthdata, pgetkeyfn.toLong(), pvgetkeyargument, phcredential, ptsexpiry)

public actual fun AddCredentialsA(hcredentials: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AddCredentialsA(hcredentials, pszprincipal, pszpackage, fcredentialuse.toInt(), pauthdata, pgetkeyfn.toLong(), pvgetkeyargument, ptsexpiry)

public actual fun AddCredentialsW(hcredentials: Long, pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AddCredentialsW(hcredentials, pszprincipal, pszpackage, fcredentialuse.toInt(), pauthdata, pgetkeyfn.toLong(), pvgetkeyargument, ptsexpiry)

public actual fun AddSecurityPackageA(pszpackagename: PCSTR, poptions: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA(pszpackagename, poptions)

public actual fun AddSecurityPackageW(pszpackagename: PCWSTR, poptions: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW(pszpackagename, poptions)

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ApplyControlToken(phcontext, pinput)

public actual fun AuditComputeEffectivePolicyBySid(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid(psid, psubcategoryguids, dwpolicycount.toInt(), ppauditpolicy)

public actual fun AuditComputeEffectivePolicyByToken(htokenhandle: HANDLE, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken(htokenhandle, psubcategoryguids, dwpolicycount.toInt(), ppauditpolicy)

public actual fun AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories(ppauditcategoriesarray, pdwcountreturned)

public actual fun AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy(ppauditsidarray)

public actual fun AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories(pauditcategoryguid, bretrieveallsubcategories, ppauditsubcategoriesarray, pdwcountreturned)

public actual fun AuditFree(buffer: Long) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditFree(buffer)
}

public actual fun AuditLookupCategoryGuidFromCategoryId(auditcategoryid: POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid)

public actual fun AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid, pauditcategoryid)

public actual fun AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA(pauditcategoryguid, ppszcategoryname)

public actual fun AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW(pauditcategoryguid, ppszcategoryname)

public actual fun AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA(pauditsubcategoryguid, ppszsubcategoryname)

public actual fun AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW(pauditsubcategoryguid, ppszsubcategoryname)

public actual fun AuditQueryGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA(objecttypename, acl)

public actual fun AuditQueryGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW(objecttypename, acl)

public actual fun AuditQueryPerUserPolicy(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy(psid, psubcategoryguids, dwpolicycount.toInt(), ppauditpolicy)

public actual fun AuditQuerySecurity(securityinformation: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity(securityinformation.toInt(), ppsecuritydescriptor)

public actual fun AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy(psubcategoryguids, dwpolicycount.toInt(), ppauditpolicy)

public actual fun AuditSetGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA(objecttypename, acl)

public actual fun AuditSetGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW(objecttypename, acl)

public actual fun AuditSetPerUserPolicy(psid: PSID, pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy(psid, pauditpolicy, dwpolicycount.toInt())

public actual fun AuditSetSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditSetSecurity(securityinformation.toInt(), psecuritydescriptor)

public actual fun AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy(pauditpolicy, dwpolicycount.toInt())

public actual fun ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, bimpersonating, dwreserved.toInt(), poutput)

public actual fun ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, bimpersonating, dwreserved.toInt(), poutput)

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_CompleteAuthToken(phcontext, ptoken)

public actual fun CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo(intargetinfo, buffer, buffersize)

public actual fun CredUnmarshalTargetInfo(buffer: Long, buffersize: UInt, rettargetinfo: Long, retactualsize: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo(buffer, buffersize.toInt(), rettargetinfo, retactualsize)

public actual fun DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_DecryptMessage(phcontext, pmessage, messageseqno.toInt(), pfqop)

public actual fun DeleteSecurityContext(phcontext: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext(phcontext)

public actual fun DeleteSecurityPackageA(pszpackagename: PCSTR): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA(pszpackagename)

public actual fun DeleteSecurityPackageW(pszpackagename: PCWSTR): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW(pszpackagename)

public actual fun EncryptMessage(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_EncryptMessage(phcontext, fqop.toInt(), pmessage, messageseqno.toInt())

public actual fun EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA(pcpackages, pppackageinfo)

public actual fun EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW(pcpackages, pppackageinfo)

public actual fun ExportSecurityContext(phcontext: Long, fflags: EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext: Long, ptoken: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ExportSecurityContext(phcontext, fflags.toInt(), ppackedcontext, ptoken)

public actual fun FreeContextBuffer(pvcontextbuffer: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_FreeContextBuffer(pvcontextbuffer)

public actual fun FreeCredentialsHandle(phcredential: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle(phcredential)

public actual fun GetComputerObjectNameA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA(nameformat, lpnamebuffer, nsize)

public actual fun GetComputerObjectNameW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW(nameformat, lpnamebuffer, nsize)

public actual fun GetUserNameExA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_GetUserNameExA(nameformat, lpnamebuffer, nsize)

public actual fun GetUserNameExW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_GetUserNameExW(nameformat, lpnamebuffer, nsize)

public actual fun ImpersonateSecurityContext(phcontext: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext(phcontext)

public actual fun ImportSecurityContextA(pszpackage: PCSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA(pszpackage, ppackedcontext, token, phcontext)

public actual fun ImportSecurityContextW(pszpackage: PCWSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW(pszpackage, ppackedcontext, token, phcontext)

public actual fun InitSecurityInterfaceA(): Long =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA()

public actual fun InitSecurityInterfaceW(): Long =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW()

public actual fun InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA(phcredential, phcontext, psztargetname, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput, reserved2.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW(phcredential, phcontext, psztargetname, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput, reserved2.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun LsaAddAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: UInt): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights(policyhandle, accountsid, userrights, countofrights.toInt())

public actual fun LsaCallAuthenticationPackage(lsahandle: HANDLE, authenticationpackage: UInt, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage(lsahandle, authenticationpackage.toInt(), protocolsubmitbuffer, submitbufferlength.toInt(), protocolreturnbuffer, returnbufferlength, protocolstatus)

public actual fun LsaClose(objecthandle: LSA_HANDLE): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaClose(objecthandle)

public actual fun LsaConnectUntrusted(lsahandle: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted(lsahandle)

public actual fun LsaCreateTrustedDomainEx(policyhandle: LSA_HANDLE, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx(policyhandle, trusteddomaininformation, authenticationinformation, desiredaccess.toInt(), trusteddomainhandle)

public actual fun LsaDeleteTrustedDomain(policyhandle: LSA_HANDLE, trusteddomainsid: PSID): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain(policyhandle, trusteddomainsid)

public actual fun LsaDeregisterLogonProcess(lsahandle: HANDLE): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess(lsahandle)

public actual fun LsaEnumerateAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights(policyhandle, accountsid, userrights, countofrights)

public actual fun LsaEnumerateAccountsWithUserRight(policyhandle: LSA_HANDLE, userright: Long, buffer: Long, countreturned: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight(policyhandle, userright, buffer, countreturned)

public actual fun LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions(logonsessioncount, logonsessionlist)

public actual fun LsaEnumerateTrustedDomains(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains(policyhandle, enumerationcontext, buffer, preferedmaximumlength.toInt(), countreturned)

public actual fun LsaEnumerateTrustedDomainsEx(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx(policyhandle, enumerationcontext, buffer, preferedmaximumlength.toInt(), countreturned)

public actual fun LsaFreeMemory(buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaFreeMemory(buffer)

public actual fun LsaFreeReturnBuffer(buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer(buffer)

public actual fun LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs(systemname, capids, capidcount)

public actual fun LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData(logonid, pplogonsessiondata)

public actual fun LsaLogonUser(lsahandle: HANDLE, originname: Long, logontype: SECURITY_LOGON_TYPE, authenticationpackage: UInt, authenticationinformation: Long, authenticationinformationlength: UInt, localgroups: Long, sourcecontext: Long, profilebuffer: Long, profilebufferlength: Long, logonid: Long, token: Long, quotas: Long, substatus: Long): NTSTATUS =
    0

public actual fun LsaLookupAuthenticationPackage(lsahandle: HANDLE, packagename: Long, authenticationpackage: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage(lsahandle, packagename, authenticationpackage)

public actual fun LsaLookupNames(policyhandle: LSA_HANDLE, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaLookupNames(policyhandle, count.toInt(), names, referenceddomains, sids)

public actual fun LsaLookupNames2(policyhandle: LSA_HANDLE, flags: UInt, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaLookupNames2(policyhandle, flags.toInt(), count.toInt(), names, referenceddomains, sids)

public actual fun LsaLookupSids(policyhandle: LSA_HANDLE, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaLookupSids(policyhandle, count.toInt(), sids, referenceddomains, names)

public actual fun LsaLookupSids2(policyhandle: LSA_HANDLE, lookupoptions: UInt, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaLookupSids2(policyhandle, lookupoptions.toInt(), count.toInt(), sids, referenceddomains, names)

public actual fun LsaNtStatusToWinError(status: NTSTATUS): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError(status).toUInt()

public actual fun LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: UInt, policyhandle: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy(systemname, objectattributes, desiredaccess.toInt(), policyhandle)

public actual fun LsaOpenTrustedDomainByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName(policyhandle, trusteddomainname, desiredaccess.toInt(), trusteddomainhandle)

public actual fun LsaQueryCAPs(capids: Long, capidcount: UInt, caps: Long, capcount: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs(capids, capidcount.toInt(), caps, capcount)

public actual fun LsaQueryDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy(policyhandle, informationclass, buffer)

public actual fun LsaQueryForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation(policyhandle, trusteddomainname, foresttrustinfo)

public actual fun LsaQueryForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2(policyhandle, trusteddomainname, highestrecordtype, foresttrustinfo)

public actual fun LsaQueryInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy(policyhandle, informationclass, buffer)

public actual fun LsaQueryTrustedDomainInfo(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo(policyhandle, trusteddomainsid, informationclass, buffer)

public actual fun LsaQueryTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName(policyhandle, trusteddomainname, informationclass, buffer)

public actual fun LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess(logonprocessname, lsahandle, securitymode)

public actual fun LsaRegisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle)

public actual fun LsaRemoveAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, allrights: Boolean, userrights: Long, countofrights: UInt): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights(policyhandle, accountsid, allrights, userrights, countofrights.toInt())

public actual fun LsaRetrievePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData(policyhandle, keyname, privatedata)

public actual fun LsaSetCAPs(capdns: Long, capdncount: UInt, flags: UInt): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetCAPs(capdns, capdncount.toInt(), flags.toInt())

public actual fun LsaSetDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy(policyhandle, informationclass, buffer)

public actual fun LsaSetForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation(policyhandle, trusteddomainname, foresttrustinfo, checkonly, collisioninfo)

public actual fun LsaSetForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2(policyhandle, trusteddomainname, highestrecordtype, foresttrustinfo, checkonly, collisioninfo)

public actual fun LsaSetInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy(policyhandle, informationclass, buffer)

public actual fun LsaSetTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName(policyhandle, trusteddomainname, informationclass, buffer)

public actual fun LsaSetTrustedDomainInformation(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation(policyhandle, trusteddomainsid, informationclass, buffer)

public actual fun LsaStorePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData(policyhandle, keyname, privatedata)

public actual fun LsaUnregisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle)

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_MakeSignature(phcontext, fqop.toInt(), pmessage, messageseqno.toInt())

public actual fun QueryContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA(phcontext, ulattribute.toInt(), pbuffer)

public actual fun QueryContextAttributesExA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA(phcontext, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun QueryContextAttributesExW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW(phcontext, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun QueryContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW(phcontext, ulattribute.toInt(), pbuffer)

public actual fun QueryCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA(phcredential, ulattribute.toInt(), pbuffer)

public actual fun QueryCredentialsAttributesExA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA(phcredential, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun QueryCredentialsAttributesExW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW(phcredential, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun QueryCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW(phcredential, ulattribute.toInt(), pbuffer)

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken(phcontext, token)

public actual fun QuerySecurityPackageInfoA(pszpackagename: PCSTR, pppackageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA(pszpackagename, pppackageinfo)

public actual fun QuerySecurityPackageInfoW(pszpackagename: PCWSTR, pppackageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW(pszpackagename, pppackageinfo)

public actual fun RevertSecurityContext(phcontext: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_RevertSecurityContext(phcontext)

public actual fun RtlDecryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory(memory, memorysize.toInt(), optionflags.toInt())

public actual fun RtlEncryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory(memory, memorysize.toInt(), optionflags.toInt())

public actual fun RtlGenRandom(randombuffer: Long, randombufferlength: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_RtlGenRandom(randombuffer, randombufferlength.toInt())

public actual fun SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: PCWSTR, pwszserverurl: PCWSTR, pwszclienttoken: PCWSTR): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket(ppticketblob, pcbticketblob, pwsztemplateid, pwszserverurl, pwszclienttoken)

public actual fun SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: UInt, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: PCWSTR, wproxyport: UShort): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLActivateProduct(hslc, pproductskuid, cbappspecificdata.toInt(), pvappspecificdata, pactivationinfo, pwszproxyserver, wproxyport.toShort())

public actual fun SLClose(hslc: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLClose(hslc)

public actual fun SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pvreserved: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLConsumeRight(hslc, pappid, pproductskuid, pwszrightname, pvreserved)

public actual fun SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId(hslc, pproductskuid, pwszinstallationid, pwszconfirmationid)

public actual fun SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx(hslc, pproductskuid, pactivationinfo, pwszinstallationid, pwszconfirmationid)

public actual fun SLFireEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLFireEvent(hslc, pwszeventid, papplicationid)

public actual fun SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId(hslc, pproductskuid, ppwszinstallationid)

public actual fun SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx(hslc, pproductskuid, pactivationinfo, ppwszinstallationid)

public actual fun SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation(hslc, papplicationid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation(pqueryid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds(hslc, pproductskuid, pnproductkeyids, ppproductkeyids)

public actual fun SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetLicense(hslc, plicensefileid, pcblicensefile, ppblicensefile)

public actual fun SLGetLicenseFileId(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId(hslc, cblicenseblob.toInt(), pblicenseblob, plicensefileid)

public actual fun SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation(hslc, psllicenseid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pnstatuscount: Long, pplicensingstatus: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation(hslc, pappid, pproductskuid, pwszrightname, pnstatuscount, pplicensingstatus)

public actual fun SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetPKeyId(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata.toInt(), pbpkeyspecificdata, ppkeyid)

public actual fun SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation(hslc, ppkeyid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetPolicyInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD(hslc, pwszvaluename, pdwvalue)

public actual fun SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation(hslc, pproductskuid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetReferralInformation(hslc: Long, ereferraltype: SLREFERRALTYPE, pskuorappid: Long, pwszvaluename: PCWSTR, ppwszvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation(hslc, ereferraltype, pskuorappid, pwszvaluename, ppwszvalue)

public actual fun SLGetSLIDList(hslc: Long, equeryidtype: SLIDTYPE, pqueryid: Long, ereturnidtype: SLIDTYPE, pnreturnids: Long, ppreturnids: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetSLIDList(hslc, equeryidtype, pqueryid, ereturnidtype, pnreturnids, ppreturnids)

public actual fun SLGetServerStatus(pwszserverurl: PCWSTR, pwszacquisitiontype: PCWSTR, pwszproxyserver: PCWSTR, wproxyport: UShort, phrstatus: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetServerStatus(pwszserverurl, pwszacquisitiontype, pwszproxyserver, wproxyport.toShort(), phrstatus)

public actual fun SLGetServiceInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetWindowsInformation(pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation(pwszvaluename, pedatatype, pcbvalue, ppbvalue)

public actual fun SLGetWindowsInformationDWORD(pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD(pwszvaluename, pdwvalue)

public actual fun SLInstallLicense(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLInstallLicense(hslc, cblicenseblob.toInt(), pblicenseblob, plicensefileid)

public actual fun SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata.toInt(), pbpkeyspecificdata, ppkeyid)

public actual fun SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal(pappid, pgenuinestate, puioptions)

public actual fun SLOpen(phslc: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLOpen(phslc)

public actual fun SLQueryLicenseValueFromApp(valuename: PCWSTR, valuetype: Long, databuffer: Long, datasize: UInt, resultdatasize: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp(valuename, valuetype, databuffer, datasize.toInt(), resultdatasize)

public actual fun SLRegisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLRegisterEvent(hslc, pwszeventid, papplicationid, hevent)

public actual fun SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey(hslc, pproductskuid, pproductkeyid)

public actual fun SLSetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, edatatype: SLDATATYPE, cbvalue: UInt, pbvalue: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation(pqueryid, pwszvaluename, edatatype.toInt(), cbvalue.toInt(), pbvalue)

public actual fun SLUninstallLicense(hslc: Long, plicensefileid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLUninstallLicense(hslc, plicensefileid)

public actual fun SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase(hslc, ppkeyid)

public actual fun SLUnregisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent(hslc, pwszeventid, papplicationid, hevent)

public actual fun SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext(phcredential, phcontext, pinput, fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA(profilelist, profilecount)

public actual fun SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW(profilelist, profilecount)

public actual fun SaslGetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt, needed: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslGetContextOption(contexthandle, option.toInt(), value, size.toInt(), needed)

public actual fun SaslGetProfilePackageA(profilename: PCSTR, packageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA(profilename, packageinfo)

public actual fun SaslGetProfilePackageW(profilename: PCWSTR, packageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW(profilename, packageinfo)

public actual fun SaslIdentifyPackageA(pinput: Long, packageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA(pinput, packageinfo)

public actual fun SaslIdentifyPackageW(pinput: Long, packageinfo: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW(pinput, packageinfo)

public actual fun SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA(phcredential, phcontext, psztargetname, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput, reserved2.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: PCWSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW(phcredential, phcontext, psztargetname, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput, reserved2.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun SaslSetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SaslSetContextOption(contexthandle, option.toInt(), value, size.toInt())

public actual fun SendSAS(asuser: BOOL) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SendSAS(asuser)
}

public actual fun SetContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SetContextAttributesA(phcontext, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SetContextAttributesW(phcontext, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun SetCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA(phcredential, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun SetCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW(phcredential, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun SslCrackCertificate(pbcertificate: Long, cbcertificate: UInt, dwflags: UInt, ppcertificate: Long): BOOL =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslCrackCertificate(pbcertificate, cbcertificate.toInt(), dwflags.toInt(), ppcertificate)

public actual fun SslDeserializeCertificateStore(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT =
    0

public actual fun SslEmptyCacheA(psztargetname: PCSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA(psztargetname, dwflags.toInt())

public actual fun SslEmptyCacheW(psztargetname: PCWSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW(psztargetname, dwflags.toInt())

public actual fun SslFreeCertificate(pcertificate: Long) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslFreeCertificate(pcertificate)
}

public actual fun SslGenerateRandomBits(prandomdata: Long, crandomdata: Int) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits(prandomdata, crandomdata)
}

public actual fun SslGetExtensions(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslGetExtensions(clienthello, clienthellobytesize.toInt(), genericextensions, genericextensionscount.toByte(), bytestoread, flags)

public actual fun SslGetMaximumKeySize(reserved: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize(reserved.toInt()).toUInt()

public actual fun SslGetServerIdentity(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity(clienthello, clienthellosize.toInt(), serveridentity, serveridentitysize, flags.toInt())

public actual fun SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities(authidentity1, authidentity2, samesupplieduser, samesuppliedidentity)

public actual fun SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity(authdata, authdatacopy)

public actual fun SspiDecryptAuthIdentity(encryptedauthdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity(encryptedauthdata)

public actual fun SspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx(options.toInt(), encryptedauthdata)

public actual fun SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings(pauthidentity, ppszusername, ppszdomainname, ppszpackedcredentialsstring)

public actual fun SspiEncodeStringsAsAuthIdentity(pszusername: PCWSTR, pszdomainname: PCWSTR, pszpackedcredentialsstring: PCWSTR, ppauthidentity: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity(pszusername, pszdomainname, pszpackedcredentialsstring, ppauthidentity)

public actual fun SspiEncryptAuthIdentity(authdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity(authdata)

public actual fun SspiEncryptAuthIdentityEx(options: UInt, authdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx(options.toInt(), authdata)

public actual fun SspiExcludePackage(authidentity: Long, pszpackagename: PCWSTR, ppnewauthidentity: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiExcludePackage(authidentity, pszpackagename, ppnewauthidentity)

public actual fun SspiFreeAuthIdentity(authdata: Long) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity(authdata)
}

public actual fun SspiGetTargetHostName(psztargetname: PCWSTR, pszhostname: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName(psztargetname, pszhostname)

public actual fun SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted(encryptedauthdata)

public actual fun SspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded(errororntstatus.toInt())

public actual fun SspiLocalFree(databuffer: Long) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiLocalFree(databuffer)
}

public actual fun SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity(authidentity, authidentitylength, authidentitybytearray)

public actual fun SspiPrepareForCredRead(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname)

public actual fun SspiPrepareForCredWrite(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname, ppszcredmanusername, ppcredentialblob, pcredentialblobsize)

public actual fun SspiPromptForCredentialsA(psztargetname: PCSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA(psztargetname, puiinfo, dwautherror.toInt(), pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags.toInt()).toUInt()

public actual fun SspiPromptForCredentialsW(psztargetname: PCWSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCWSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW(psztargetname, puiinfo, dwautherror.toInt(), pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags.toInt()).toUInt()

public actual fun SspiSetChannelBindingFlags(pbindings: Long, flags: UInt): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags(pbindings, flags.toInt())

public actual fun SspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: PCSTR, ppauthidentity: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity(authidentitylength.toInt(), authidentitybytearray, ppauthidentity)

public actual fun SspiValidateAuthIdentity(authdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity(authdata)

public actual fun SspiZeroAuthIdentity(authdata: Long) {
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity(authdata)
}

public actual fun TokenBindingDeleteAllBindings(): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings()

public actual fun TokenBindingDeleteBinding(targeturl: PCWSTR): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding(targeturl)

public actual fun TokenBindingGenerateBinding(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl: PCWSTR, bindingtype: TOKENBINDING_TYPE, tlsekm: Long, tlsekmsize: UInt, extensionformat: TOKENBINDING_EXTENSION_FORMAT, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding(keytype, targeturl, bindingtype, tlsekm, tlsekmsize.toInt(), extensionformat, extensiondata, tokenbinding, tokenbindingsize, resultdata)

public actual fun TokenBindingGenerateID(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, publickey: Long, publickeysize: UInt, resultdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID(keytype, publickey, publickeysize.toInt(), resultdata)

public actual fun TokenBindingGenerateIDForUri(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi: PCWSTR, resultdata: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri(keytype, targeturi, resultdata)

public actual fun TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: UInt, tokenbindingmessage: Long, tokenbindingmessagesize: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage(tokenbindings, tokenbindingssize, tokenbindingscount.toInt(), tokenbindingmessage, tokenbindingmessagesize)

public actual fun TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion(majorversion, minorversion)

public actual fun TokenBindingGetKeyTypesClient(keytypes: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient(keytypes)

public actual fun TokenBindingGetKeyTypesServer(keytypes: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer(keytypes)

public actual fun TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: UInt, keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm: Long, tlsekmsize: UInt, resultlist: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage(tokenbindingmessage, tokenbindingmessagesize.toInt(), keytype, tlsekm, tlsekmsize.toInt(), resultlist)

public actual fun TranslateNameA(lpaccountname: PCSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PSTR, nsize: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TranslateNameA(lpaccountname, accountnameformat, desirednameformat, lptranslatedname, nsize)

public actual fun TranslateNameW(lpaccountname: PCWSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PWSTR, nsize: Long): Boolean =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_TranslateNameW(lpaccountname, accountnameformat, desirednameformat, lptranslatedname, nsize)

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    WindowsWin32SecurityAuthenticationIdentityJniBridge.windowssys_windows_win32_security_authentication_identity_VerifySignature(phcontext, pmessage, messageseqno.toInt(), pfqop)
