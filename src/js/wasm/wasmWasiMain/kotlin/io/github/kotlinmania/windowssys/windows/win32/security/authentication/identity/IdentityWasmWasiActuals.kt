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

public actual fun AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun AcquireCredentialsHandleA(pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun AcquireCredentialsHandleW(pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun AddCredentialsA(hcredentials: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun AddCredentialsW(hcredentials: Long, pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun AddSecurityPackageA(pszpackagename: PCSTR, poptions: Long): HRESULT =
    0

public actual fun AddSecurityPackageW(pszpackagename: PCWSTR, poptions: Long): HRESULT =
    0

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    0

public actual fun AuditComputeEffectivePolicyBySid(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    false

public actual fun AuditComputeEffectivePolicyByToken(htokenhandle: HANDLE, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    false

public actual fun AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    false

public actual fun AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean =
    false

public actual fun AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    false

public actual fun AuditFree(buffer: Long) {
}

public actual fun AuditLookupCategoryGuidFromCategoryId(auditcategoryid: POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid: Long): Boolean =
    false

public actual fun AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean =
    false

public actual fun AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    false

public actual fun AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    false

public actual fun AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    false

public actual fun AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    false

public actual fun AuditQueryGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    false

public actual fun AuditQueryGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    false

public actual fun AuditQueryPerUserPolicy(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    false

public actual fun AuditQuerySecurity(securityinformation: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor: Long): Boolean =
    false

public actual fun AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    false

public actual fun AuditSetGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    false

public actual fun AuditSetGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    false

public actual fun AuditSetPerUserPolicy(psid: PSID, pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    false

public actual fun AuditSetSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    false

public actual fun AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    false

public actual fun ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    0

public actual fun ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    0

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    0

public actual fun CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): NTSTATUS =
    0

public actual fun CredUnmarshalTargetInfo(buffer: Long, buffersize: UInt, rettargetinfo: Long, retactualsize: Long): NTSTATUS =
    0

public actual fun DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    0

public actual fun DeleteSecurityContext(phcontext: Long): HRESULT =
    0

public actual fun DeleteSecurityPackageA(pszpackagename: PCSTR): HRESULT =
    0

public actual fun DeleteSecurityPackageW(pszpackagename: PCWSTR): HRESULT =
    0

public actual fun EncryptMessage(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    0

public actual fun EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): HRESULT =
    0

public actual fun EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): HRESULT =
    0

public actual fun ExportSecurityContext(phcontext: Long, fflags: EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext: Long, ptoken: Long): HRESULT =
    0

public actual fun FreeContextBuffer(pvcontextbuffer: Long): HRESULT =
    0

public actual fun FreeCredentialsHandle(phcredential: Long): HRESULT =
    0

public actual fun GetComputerObjectNameA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    false

public actual fun GetComputerObjectNameW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    false

public actual fun GetUserNameExA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    false

public actual fun GetUserNameExW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    false

public actual fun ImpersonateSecurityContext(phcontext: Long): HRESULT =
    0

public actual fun ImportSecurityContextA(pszpackage: PCSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    0

public actual fun ImportSecurityContextW(pszpackage: PCWSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    0

public actual fun InitSecurityInterfaceA(): Long =
    0L

public actual fun InitSecurityInterfaceW(): Long =
    0L

public actual fun InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun LsaAddAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: UInt): NTSTATUS =
    0

public actual fun LsaCallAuthenticationPackage(lsahandle: HANDLE, authenticationpackage: UInt, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS =
    0

public actual fun LsaClose(objecthandle: LSA_HANDLE): NTSTATUS =
    0

public actual fun LsaConnectUntrusted(lsahandle: Long): NTSTATUS =
    0

public actual fun LsaCreateTrustedDomainEx(policyhandle: LSA_HANDLE, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    0

public actual fun LsaDeleteTrustedDomain(policyhandle: LSA_HANDLE, trusteddomainsid: PSID): NTSTATUS =
    0

public actual fun LsaDeregisterLogonProcess(lsahandle: HANDLE): NTSTATUS =
    0

public actual fun LsaEnumerateAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: Long): NTSTATUS =
    0

public actual fun LsaEnumerateAccountsWithUserRight(policyhandle: LSA_HANDLE, userright: Long, buffer: Long, countreturned: Long): NTSTATUS =
    0

public actual fun LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): NTSTATUS =
    0

public actual fun LsaEnumerateTrustedDomains(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    0

public actual fun LsaEnumerateTrustedDomainsEx(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    0

public actual fun LsaFreeMemory(buffer: Long): NTSTATUS =
    0

public actual fun LsaFreeReturnBuffer(buffer: Long): NTSTATUS =
    0

public actual fun LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): NTSTATUS =
    0

public actual fun LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): NTSTATUS =
    0

public actual fun LsaLogonUser(lsahandle: HANDLE, originname: Long, logontype: SECURITY_LOGON_TYPE, authenticationpackage: UInt, authenticationinformation: Long, authenticationinformationlength: UInt, localgroups: Long, sourcecontext: Long, profilebuffer: Long, profilebufferlength: Long, logonid: Long, token: Long, quotas: Long, substatus: Long): NTSTATUS =
    0

public actual fun LsaLookupAuthenticationPackage(lsahandle: HANDLE, packagename: Long, authenticationpackage: Long): NTSTATUS =
    0

public actual fun LsaLookupNames(policyhandle: LSA_HANDLE, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    0

public actual fun LsaLookupNames2(policyhandle: LSA_HANDLE, flags: UInt, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    0

public actual fun LsaLookupSids(policyhandle: LSA_HANDLE, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    0

public actual fun LsaLookupSids2(policyhandle: LSA_HANDLE, lookupoptions: UInt, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    0

public actual fun LsaNtStatusToWinError(status: NTSTATUS): UInt =
    0u

public actual fun LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: UInt, policyhandle: Long): NTSTATUS =
    0

public actual fun LsaOpenTrustedDomainByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    0

public actual fun LsaQueryCAPs(capids: Long, capidcount: UInt, caps: Long, capcount: Long): NTSTATUS =
    0

public actual fun LsaQueryDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaQueryForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long): NTSTATUS =
    0

public actual fun LsaQueryForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long): NTSTATUS =
    0

public actual fun LsaQueryInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaQueryTrustedDomainInfo(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaQueryTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): NTSTATUS =
    0

public actual fun LsaRegisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    0

public actual fun LsaRemoveAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, allrights: Boolean, userrights: Long, countofrights: UInt): NTSTATUS =
    0

public actual fun LsaRetrievePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    0

public actual fun LsaSetCAPs(capdns: Long, capdncount: UInt, flags: UInt): NTSTATUS =
    0

public actual fun LsaSetDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaSetForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    0

public actual fun LsaSetForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    0

public actual fun LsaSetInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaSetTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaSetTrustedDomainInformation(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    0

public actual fun LsaStorePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    0

public actual fun LsaUnregisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    0

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    0

public actual fun QueryContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    0

public actual fun QueryContextAttributesExA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun QueryContextAttributesExW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun QueryContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    0

public actual fun QueryCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    0

public actual fun QueryCredentialsAttributesExA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun QueryCredentialsAttributesExW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun QueryCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    0

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    0

public actual fun QuerySecurityPackageInfoA(pszpackagename: PCSTR, pppackageinfo: Long): HRESULT =
    0

public actual fun QuerySecurityPackageInfoW(pszpackagename: PCWSTR, pppackageinfo: Long): HRESULT =
    0

public actual fun RevertSecurityContext(phcontext: Long): HRESULT =
    0

public actual fun RtlDecryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    0

public actual fun RtlEncryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    0

public actual fun RtlGenRandom(randombuffer: Long, randombufferlength: UInt): Boolean =
    false

public actual fun SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: PCWSTR, pwszserverurl: PCWSTR, pwszclienttoken: PCWSTR): HRESULT =
    0

public actual fun SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: UInt, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: PCWSTR, wproxyport: UShort): HRESULT =
    0

public actual fun SLClose(hslc: Long): HRESULT =
    0

public actual fun SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pvreserved: Long): HRESULT =
    0

public actual fun SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    0

public actual fun SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    0

public actual fun SLFireEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long): HRESULT =
    0

public actual fun SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): HRESULT =
    0

public actual fun SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): HRESULT =
    0

public actual fun SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): HRESULT =
    0

public actual fun SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): HRESULT =
    0

public actual fun SLGetLicenseFileId(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    0

public actual fun SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pnstatuscount: Long, pplicensingstatus: Long): HRESULT =
    0

public actual fun SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    0

public actual fun SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetPolicyInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    0

public actual fun SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetReferralInformation(hslc: Long, ereferraltype: SLREFERRALTYPE, pskuorappid: Long, pwszvaluename: PCWSTR, ppwszvalue: Long): HRESULT =
    0

public actual fun SLGetSLIDList(hslc: Long, equeryidtype: SLIDTYPE, pqueryid: Long, ereturnidtype: SLIDTYPE, pnreturnids: Long, ppreturnids: Long): HRESULT =
    0

public actual fun SLGetServerStatus(pwszserverurl: PCWSTR, pwszacquisitiontype: PCWSTR, pwszproxyserver: PCWSTR, wproxyport: UShort, phrstatus: Long): HRESULT =
    0

public actual fun SLGetServiceInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetWindowsInformation(pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    0

public actual fun SLGetWindowsInformationDWORD(pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    0

public actual fun SLInstallLicense(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    0

public actual fun SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    0

public actual fun SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): HRESULT =
    0

public actual fun SLOpen(phslc: Long): HRESULT =
    0

public actual fun SLQueryLicenseValueFromApp(valuename: PCWSTR, valuetype: Long, databuffer: Long, datasize: UInt, resultdatasize: Long): HRESULT =
    0

public actual fun SLRegisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    0

public actual fun SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): HRESULT =
    0

public actual fun SLSetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, edatatype: SLDATATYPE, cbvalue: UInt, pbvalue: Long): HRESULT =
    0

public actual fun SLUninstallLicense(hslc: Long, plicensefileid: Long): HRESULT =
    0

public actual fun SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): HRESULT =
    0

public actual fun SLUnregisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    0

public actual fun SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): HRESULT =
    0

public actual fun SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): HRESULT =
    0

public actual fun SaslGetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt, needed: Long): HRESULT =
    0

public actual fun SaslGetProfilePackageA(profilename: PCSTR, packageinfo: Long): HRESULT =
    0

public actual fun SaslGetProfilePackageW(profilename: PCWSTR, packageinfo: Long): HRESULT =
    0

public actual fun SaslIdentifyPackageA(pinput: Long, packageinfo: Long): HRESULT =
    0

public actual fun SaslIdentifyPackageW(pinput: Long, packageinfo: Long): HRESULT =
    0

public actual fun SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: PCWSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SaslSetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt): HRESULT =
    0

public actual fun SendSAS(asuser: BOOL) {
}

public actual fun SetContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun SetCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun SetCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun SslCrackCertificate(pbcertificate: Long, cbcertificate: UInt, dwflags: UInt, ppcertificate: Long): BOOL =
    0

public actual fun SslDeserializeCertificateStore(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT =
    0

public actual fun SslEmptyCacheA(psztargetname: PCSTR, dwflags: UInt): BOOL =
    0

public actual fun SslEmptyCacheW(psztargetname: PCWSTR, dwflags: UInt): BOOL =
    0

public actual fun SslFreeCertificate(pcertificate: Long) {
}

public actual fun SslGenerateRandomBits(prandomdata: Long, crandomdata: Int) {
}

public actual fun SslGetExtensions(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT =
    0

public actual fun SslGetMaximumKeySize(reserved: UInt): UInt =
    0u

public actual fun SslGetServerIdentity(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT =
    0

public actual fun SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): HRESULT =
    0

public actual fun SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): HRESULT =
    0

public actual fun SspiDecryptAuthIdentity(encryptedauthdata: Long): HRESULT =
    0

public actual fun SspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: Long): HRESULT =
    0

public actual fun SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): HRESULT =
    0

public actual fun SspiEncodeStringsAsAuthIdentity(pszusername: PCWSTR, pszdomainname: PCWSTR, pszpackedcredentialsstring: PCWSTR, ppauthidentity: Long): HRESULT =
    0

public actual fun SspiEncryptAuthIdentity(authdata: Long): HRESULT =
    0

public actual fun SspiEncryptAuthIdentityEx(options: UInt, authdata: Long): HRESULT =
    0

public actual fun SspiExcludePackage(authidentity: Long, pszpackagename: PCWSTR, ppnewauthidentity: Long): HRESULT =
    0

public actual fun SspiFreeAuthIdentity(authdata: Long) {
}

public actual fun SspiGetTargetHostName(psztargetname: PCWSTR, pszhostname: Long): HRESULT =
    0

public actual fun SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean =
    false

public actual fun SspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    false

public actual fun SspiLocalFree(databuffer: Long) {
}

public actual fun SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): HRESULT =
    0

public actual fun SspiPrepareForCredRead(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long): HRESULT =
    0

public actual fun SspiPrepareForCredWrite(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): HRESULT =
    0

public actual fun SspiPromptForCredentialsA(psztargetname: PCSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    0u

public actual fun SspiPromptForCredentialsW(psztargetname: PCWSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCWSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    0u

public actual fun SspiSetChannelBindingFlags(pbindings: Long, flags: UInt): HRESULT =
    0

public actual fun SspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: PCSTR, ppauthidentity: Long): HRESULT =
    0

public actual fun SspiValidateAuthIdentity(authdata: Long): HRESULT =
    0

public actual fun SspiZeroAuthIdentity(authdata: Long) {
}

public actual fun TokenBindingDeleteAllBindings(): HRESULT =
    0

public actual fun TokenBindingDeleteBinding(targeturl: PCWSTR): HRESULT =
    0

public actual fun TokenBindingGenerateBinding(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl: PCWSTR, bindingtype: TOKENBINDING_TYPE, tlsekm: Long, tlsekmsize: UInt, extensionformat: TOKENBINDING_EXTENSION_FORMAT, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): HRESULT =
    0

public actual fun TokenBindingGenerateID(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, publickey: Long, publickeysize: UInt, resultdata: Long): HRESULT =
    0

public actual fun TokenBindingGenerateIDForUri(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi: PCWSTR, resultdata: Long): HRESULT =
    0

public actual fun TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: UInt, tokenbindingmessage: Long, tokenbindingmessagesize: Long): HRESULT =
    0

public actual fun TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): HRESULT =
    0

public actual fun TokenBindingGetKeyTypesClient(keytypes: Long): HRESULT =
    0

public actual fun TokenBindingGetKeyTypesServer(keytypes: Long): HRESULT =
    0

public actual fun TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: UInt, keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm: Long, tlsekmsize: UInt, resultlist: Long): HRESULT =
    0

public actual fun TranslateNameA(lpaccountname: PCSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PSTR, nsize: Long): Boolean =
    false

public actual fun TranslateNameW(lpaccountname: PCWSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PWSTR, nsize: Long): Boolean =
    false

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    0
