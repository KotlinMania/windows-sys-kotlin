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

public expect fun AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun AcquireCredentialsHandleA(pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT

public expect fun AcquireCredentialsHandleW(pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT

public expect fun AddCredentialsA(hcredentials: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT

public expect fun AddCredentialsW(hcredentials: Long, pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT

public expect fun AddSecurityPackageA(pszpackagename: PCSTR, poptions: Long): HRESULT

public expect fun AddSecurityPackageW(pszpackagename: PCWSTR, poptions: Long): HRESULT

public expect fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT

public expect fun AuditComputeEffectivePolicyBySid(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean

public expect fun AuditComputeEffectivePolicyByToken(htokenhandle: HANDLE, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean

public expect fun AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean

public expect fun AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean

public expect fun AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean

public expect fun AuditFree(buffer: Long)

public expect fun AuditLookupCategoryGuidFromCategoryId(auditcategoryid: POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid: Long): Boolean

public expect fun AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean

public expect fun AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

public expect fun AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean

public expect fun AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

public expect fun AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean

public expect fun AuditQueryGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean

public expect fun AuditQueryGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean

public expect fun AuditQueryPerUserPolicy(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean

public expect fun AuditQuerySecurity(securityinformation: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor: Long): Boolean

public expect fun AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean

public expect fun AuditSetGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean

public expect fun AuditSetGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean

public expect fun AuditSetPerUserPolicy(psid: PSID, pauditpolicy: Long, dwpolicycount: UInt): Boolean

public expect fun AuditSetSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): Boolean

public expect fun AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: UInt): Boolean

public expect fun ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT

public expect fun ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT

public expect fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT

public expect fun CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): NTSTATUS

public expect fun CredUnmarshalTargetInfo(buffer: Long, buffersize: UInt, rettargetinfo: Long, retactualsize: Long): NTSTATUS

public expect fun DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT

public expect fun DeleteSecurityContext(phcontext: Long): HRESULT

public expect fun DeleteSecurityPackageA(pszpackagename: PCSTR): HRESULT

public expect fun DeleteSecurityPackageW(pszpackagename: PCWSTR): HRESULT

public expect fun EncryptMessage(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT

public expect fun EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): HRESULT

public expect fun EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): HRESULT

public expect fun ExportSecurityContext(phcontext: Long, fflags: EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext: Long, ptoken: Long): HRESULT

public expect fun FreeContextBuffer(pvcontextbuffer: Long): HRESULT

public expect fun FreeCredentialsHandle(phcredential: Long): HRESULT

public expect fun GetComputerObjectNameA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean

public expect fun GetComputerObjectNameW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean

public expect fun GetUserNameExA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean

public expect fun GetUserNameExW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean

public expect fun ImpersonateSecurityContext(phcontext: Long): HRESULT

public expect fun ImportSecurityContextA(pszpackage: PCSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT

public expect fun ImportSecurityContextW(pszpackage: PCWSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT

public expect fun InitSecurityInterfaceA(): Long

public expect fun InitSecurityInterfaceW(): Long

public expect fun InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun LsaAddAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: UInt): NTSTATUS

public expect fun LsaCallAuthenticationPackage(lsahandle: HANDLE, authenticationpackage: UInt, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS

public expect fun LsaClose(objecthandle: LSA_HANDLE): NTSTATUS

public expect fun LsaConnectUntrusted(lsahandle: Long): NTSTATUS

public expect fun LsaCreateTrustedDomainEx(policyhandle: LSA_HANDLE, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS

public expect fun LsaDeleteTrustedDomain(policyhandle: LSA_HANDLE, trusteddomainsid: PSID): NTSTATUS

public expect fun LsaDeregisterLogonProcess(lsahandle: HANDLE): NTSTATUS

public expect fun LsaEnumerateAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: Long): NTSTATUS

public expect fun LsaEnumerateAccountsWithUserRight(policyhandle: LSA_HANDLE, userright: Long, buffer: Long, countreturned: Long): NTSTATUS

public expect fun LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): NTSTATUS

public expect fun LsaEnumerateTrustedDomains(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS

public expect fun LsaEnumerateTrustedDomainsEx(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS

public expect fun LsaFreeMemory(buffer: Long): NTSTATUS

public expect fun LsaFreeReturnBuffer(buffer: Long): NTSTATUS

public expect fun LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): NTSTATUS

public expect fun LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): NTSTATUS

public expect fun LsaLogonUser(lsahandle: HANDLE, originname: Long, logontype: SECURITY_LOGON_TYPE, authenticationpackage: UInt, authenticationinformation: Long, authenticationinformationlength: UInt, localgroups: Long, sourcecontext: Long, profilebuffer: Long, profilebufferlength: Long, logonid: Long, token: Long, quotas: Long, substatus: Long): NTSTATUS

public expect fun LsaLookupAuthenticationPackage(lsahandle: HANDLE, packagename: Long, authenticationpackage: Long): NTSTATUS

public expect fun LsaLookupNames(policyhandle: LSA_HANDLE, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS

public expect fun LsaLookupNames2(policyhandle: LSA_HANDLE, flags: UInt, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS

public expect fun LsaLookupSids(policyhandle: LSA_HANDLE, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS

public expect fun LsaLookupSids2(policyhandle: LSA_HANDLE, lookupoptions: UInt, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS

public expect fun LsaNtStatusToWinError(status: NTSTATUS): UInt

public expect fun LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: UInt, policyhandle: Long): NTSTATUS

public expect fun LsaOpenTrustedDomainByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS

public expect fun LsaQueryCAPs(capids: Long, capidcount: UInt, caps: Long, capcount: Long): NTSTATUS

public expect fun LsaQueryDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaQueryForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long): NTSTATUS

public expect fun LsaQueryForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long): NTSTATUS

public expect fun LsaQueryInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaQueryTrustedDomainInfo(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaQueryTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): NTSTATUS

public expect fun LsaRegisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS

public expect fun LsaRemoveAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, allrights: Boolean, userrights: Long, countofrights: UInt): NTSTATUS

public expect fun LsaRetrievePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS

public expect fun LsaSetCAPs(capdns: Long, capdncount: UInt, flags: UInt): NTSTATUS

public expect fun LsaSetDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaSetForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS

public expect fun LsaSetForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS

public expect fun LsaSetInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaSetTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaSetTrustedDomainInformation(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS

public expect fun LsaStorePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS

public expect fun LsaUnregisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS

public expect fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT

public expect fun QueryContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT

public expect fun QueryContextAttributesExA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun QueryContextAttributesExW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun QueryContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT

public expect fun QueryCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT

public expect fun QueryCredentialsAttributesExA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun QueryCredentialsAttributesExW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun QueryCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT

public expect fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT

public expect fun QuerySecurityPackageInfoA(pszpackagename: PCSTR, pppackageinfo: Long): HRESULT

public expect fun QuerySecurityPackageInfoW(pszpackagename: PCWSTR, pppackageinfo: Long): HRESULT

public expect fun RevertSecurityContext(phcontext: Long): HRESULT

public expect fun RtlDecryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS

public expect fun RtlEncryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS

public expect fun RtlGenRandom(randombuffer: Long, randombufferlength: UInt): Boolean

public expect fun SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: PCWSTR, pwszserverurl: PCWSTR, pwszclienttoken: PCWSTR): HRESULT

public expect fun SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: UInt, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: PCWSTR, wproxyport: UShort): HRESULT

public expect fun SLClose(hslc: Long): HRESULT

public expect fun SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pvreserved: Long): HRESULT

public expect fun SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT

public expect fun SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT

public expect fun SLFireEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long): HRESULT

public expect fun SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): HRESULT

public expect fun SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): HRESULT

public expect fun SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): HRESULT

public expect fun SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): HRESULT

public expect fun SLGetLicenseFileId(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT

public expect fun SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pnstatuscount: Long, pplicensingstatus: Long): HRESULT

public expect fun SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT

public expect fun SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetPolicyInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT

public expect fun SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetReferralInformation(hslc: Long, ereferraltype: SLREFERRALTYPE, pskuorappid: Long, pwszvaluename: PCWSTR, ppwszvalue: Long): HRESULT

public expect fun SLGetSLIDList(hslc: Long, equeryidtype: SLIDTYPE, pqueryid: Long, ereturnidtype: SLIDTYPE, pnreturnids: Long, ppreturnids: Long): HRESULT

public expect fun SLGetServerStatus(pwszserverurl: PCWSTR, pwszacquisitiontype: PCWSTR, pwszproxyserver: PCWSTR, wproxyport: UShort, phrstatus: Long): HRESULT

public expect fun SLGetServiceInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetWindowsInformation(pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT

public expect fun SLGetWindowsInformationDWORD(pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT

public expect fun SLInstallLicense(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT

public expect fun SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT

public expect fun SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): HRESULT

public expect fun SLOpen(phslc: Long): HRESULT

public expect fun SLQueryLicenseValueFromApp(valuename: PCWSTR, valuetype: Long, databuffer: Long, datasize: UInt, resultdatasize: Long): HRESULT

public expect fun SLRegisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT

public expect fun SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): HRESULT

public expect fun SLSetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, edatatype: SLDATATYPE, cbvalue: UInt, pbvalue: Long): HRESULT

public expect fun SLUninstallLicense(hslc: Long, plicensefileid: Long): HRESULT

public expect fun SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): HRESULT

public expect fun SLUnregisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT

public expect fun SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): HRESULT

public expect fun SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): HRESULT

public expect fun SaslGetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt, needed: Long): HRESULT

public expect fun SaslGetProfilePackageA(profilename: PCSTR, packageinfo: Long): HRESULT

public expect fun SaslGetProfilePackageW(profilename: PCWSTR, packageinfo: Long): HRESULT

public expect fun SaslIdentifyPackageA(pinput: Long, packageinfo: Long): HRESULT

public expect fun SaslIdentifyPackageW(pinput: Long, packageinfo: Long): HRESULT

public expect fun SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: PCWSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun SaslSetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt): HRESULT

public expect fun SendSAS(asuser: BOOL)

public expect fun SetContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun SetContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun SetCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun SetCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun SslCrackCertificate(pbcertificate: Long, cbcertificate: UInt, dwflags: UInt, ppcertificate: Long): BOOL

public expect fun SslDeserializeCertificateStore(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT

public expect fun SslEmptyCacheA(psztargetname: PCSTR, dwflags: UInt): BOOL

public expect fun SslEmptyCacheW(psztargetname: PCWSTR, dwflags: UInt): BOOL

public expect fun SslFreeCertificate(pcertificate: Long)

public expect fun SslGenerateRandomBits(prandomdata: Long, crandomdata: Int)

public expect fun SslGetExtensions(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT

public expect fun SslGetMaximumKeySize(reserved: UInt): UInt

public expect fun SslGetServerIdentity(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT

public expect fun SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): HRESULT

public expect fun SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): HRESULT

public expect fun SspiDecryptAuthIdentity(encryptedauthdata: Long): HRESULT

public expect fun SspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: Long): HRESULT

public expect fun SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): HRESULT

public expect fun SspiEncodeStringsAsAuthIdentity(pszusername: PCWSTR, pszdomainname: PCWSTR, pszpackedcredentialsstring: PCWSTR, ppauthidentity: Long): HRESULT

public expect fun SspiEncryptAuthIdentity(authdata: Long): HRESULT

public expect fun SspiEncryptAuthIdentityEx(options: UInt, authdata: Long): HRESULT

public expect fun SspiExcludePackage(authidentity: Long, pszpackagename: PCWSTR, ppnewauthidentity: Long): HRESULT

public expect fun SspiFreeAuthIdentity(authdata: Long)

public expect fun SspiGetTargetHostName(psztargetname: PCWSTR, pszhostname: Long): HRESULT

public expect fun SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean

public expect fun SspiIsPromptingNeeded(errororntstatus: UInt): Boolean

public expect fun SspiLocalFree(databuffer: Long)

public expect fun SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): HRESULT

public expect fun SspiPrepareForCredRead(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long): HRESULT

public expect fun SspiPrepareForCredWrite(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): HRESULT

public expect fun SspiPromptForCredentialsA(psztargetname: PCSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt

public expect fun SspiPromptForCredentialsW(psztargetname: PCWSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCWSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt

public expect fun SspiSetChannelBindingFlags(pbindings: Long, flags: UInt): HRESULT

public expect fun SspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: PCSTR, ppauthidentity: Long): HRESULT

public expect fun SspiValidateAuthIdentity(authdata: Long): HRESULT

public expect fun SspiZeroAuthIdentity(authdata: Long)

public expect fun TokenBindingDeleteAllBindings(): HRESULT

public expect fun TokenBindingDeleteBinding(targeturl: PCWSTR): HRESULT

public expect fun TokenBindingGenerateBinding(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl: PCWSTR, bindingtype: TOKENBINDING_TYPE, tlsekm: Long, tlsekmsize: UInt, extensionformat: TOKENBINDING_EXTENSION_FORMAT, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): HRESULT

public expect fun TokenBindingGenerateID(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, publickey: Long, publickeysize: UInt, resultdata: Long): HRESULT

public expect fun TokenBindingGenerateIDForUri(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi: PCWSTR, resultdata: Long): HRESULT

public expect fun TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: UInt, tokenbindingmessage: Long, tokenbindingmessagesize: Long): HRESULT

public expect fun TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): HRESULT

public expect fun TokenBindingGetKeyTypesClient(keytypes: Long): HRESULT

public expect fun TokenBindingGetKeyTypesServer(keytypes: Long): HRESULT

public expect fun TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: UInt, keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm: Long, tlsekmsize: UInt, resultlist: Long): HRESULT

public expect fun TranslateNameA(lpaccountname: PCSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PSTR, nsize: Long): Boolean

public expect fun TranslateNameW(lpaccountname: PCWSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PWSTR, nsize: Long): Boolean

public expect fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT
