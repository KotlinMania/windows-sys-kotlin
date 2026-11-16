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

public expect fun acceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun addCredentialsA(hcredentials: ConstPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult

public expect fun addCredentialsW(hcredentials: ConstPtr, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult

public expect fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr): Hresult

public expect fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr): Hresult

public expect fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult

public expect fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean

public expect fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean

public expect fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean

public expect fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr): Boolean

public expect fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean

public expect fun auditFree(buffer: ConstPtr)

public expect fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr): Boolean

public expect fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr, pauditcategoryid: MutPtr): Boolean

public expect fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean

public expect fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean

public expect fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean

public expect fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean

public expect fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr): Boolean

public expect fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr): Boolean

public expect fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean

public expect fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr): Boolean

public expect fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean

public expect fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr): Boolean

public expect fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr): Boolean

public expect fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean

public expect fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean

public expect fun auditSetSystemPolicy(pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean

public expect fun changeAccountPasswordA(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult

public expect fun changeAccountPasswordW(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult

public expect fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult

public expect fun credMarshalTargetInfo(intargetinfo: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Ntstatus

public expect fun credUnmarshalTargetInfo(buffer: ConstPtr, buffersize: UInt, rettargetinfo: MutPtr, retactualsize: MutPtr): Ntstatus

public expect fun decryptMessage(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult

public expect fun deleteSecurityContext(phcontext: ConstPtr): Hresult

public expect fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult

public expect fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult

public expect fun encryptMessage(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult

public expect fun enumerateSecurityPackagesA(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult

public expect fun enumerateSecurityPackagesW(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult

public expect fun exportSecurityContext(phcontext: ConstPtr, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult

public expect fun freeContextBuffer(pvcontextbuffer: MutPtr): Hresult

public expect fun freeCredentialsHandle(phcredential: ConstPtr): Hresult

public expect fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean

public expect fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean

public expect fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean

public expect fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean

public expect fun impersonateSecurityContext(phcontext: ConstPtr): Hresult

public expect fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult

public expect fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult

public expect fun initSecurityInterfaceA(): MutPtr

public expect fun initSecurityInterfaceW(): MutPtr

public expect fun initializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun initializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr, countofrights: UInt): Ntstatus

public expect fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus

public expect fun lsaClose(objecthandle: LsaHandle): Ntstatus

public expect fun lsaConnectUntrusted(lsahandle: MutPtr): Ntstatus

public expect fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr, authenticationinformation: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus

public expect fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus

public expect fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus

public expect fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr, countofrights: MutPtr): Ntstatus

public expect fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr, buffer: MutPtr, countreturned: MutPtr): Ntstatus

public expect fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr, logonsessionlist: MutPtr): Ntstatus

public expect fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus

public expect fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus

public expect fun lsaFreeMemory(buffer: ConstPtr): Ntstatus

public expect fun lsaFreeReturnBuffer(buffer: ConstPtr): Ntstatus

public expect fun lsaGetAppliedCAPIDs(systemname: ConstPtr, capids: MutPtr, capidcount: MutPtr): Ntstatus

public expect fun lsaGetLogonSessionData(logonid: ConstPtr, pplogonsessiondata: MutPtr): Ntstatus

public expect fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr, authenticationinformationlength: UInt, localgroups: ConstPtr, sourcecontext: ConstPtr, profilebuffer: MutPtr, profilebufferlength: MutPtr, logonid: MutPtr, token: MutPtr, quotas: MutPtr, substatus: MutPtr): Ntstatus

public expect fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr, authenticationpackage: MutPtr): Ntstatus

public expect fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus

public expect fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus

public expect fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus

public expect fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus

public expect fun lsaNtStatusToWinError(status: Ntstatus): UInt

public expect fun lsaOpenPolicy(systemname: ConstPtr, objectattributes: ConstPtr, desiredaccess: UInt, policyhandle: MutPtr): Ntstatus

public expect fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus

public expect fun lsaQueryCAPs(capids: ConstPtr, capidcount: UInt, caps: MutPtr, capcount: MutPtr): Ntstatus

public expect fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr): Ntstatus

public expect fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: MutPtr): Ntstatus

public expect fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr): Ntstatus

public expect fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr): Ntstatus

public expect fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus

public expect fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus

public expect fun lsaRegisterLogonProcess(logonprocessname: ConstPtr, lsahandle: MutPtr, securitymode: MutPtr): Ntstatus

public expect fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus

public expect fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr, countofrights: UInt): Ntstatus

public expect fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: MutPtr): Ntstatus

public expect fun lsaSetCAPs(capdns: ConstPtr, capdncount: UInt, flags: UInt): Ntstatus

public expect fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr): Ntstatus

public expect fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus

public expect fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus

public expect fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr): Ntstatus

public expect fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus

public expect fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus

public expect fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: ConstPtr): Ntstatus

public expect fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus

public expect fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult

public expect fun queryContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult

public expect fun queryContextAttributesExA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult

public expect fun queryContextAttributesExW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult

public expect fun queryContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult

public expect fun queryCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult

public expect fun queryCredentialsAttributesExA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult

public expect fun queryCredentialsAttributesExW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult

public expect fun queryCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult

public expect fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult

public expect fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr): Hresult

public expect fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr): Hresult

public expect fun revertSecurityContext(phcontext: ConstPtr): Hresult

public expect fun rtlDecryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus

public expect fun rtlEncryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus

public expect fun rtlGenRandom(randombuffer: MutPtr, randombufferlength: UInt): Boolean

public expect fun sLAcquireGenuineTicket(ppticketblob: MutPtr, pcbticketblob: MutPtr, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult

public expect fun sLActivateProduct(hslc: ConstPtr, pproductskuid: ConstPtr, cbappspecificdata: UInt, pvappspecificdata: ConstPtr, pactivationinfo: ConstPtr, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult

public expect fun sLClose(hslc: ConstPtr): Hresult

public expect fun sLConsumeRight(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pvreserved: ConstPtr): Hresult

public expect fun sLDepositOfflineConfirmationId(hslc: ConstPtr, pproductskuid: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult

public expect fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult

public expect fun sLFireEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr): Hresult

public expect fun sLGenerateOfflineInstallationId(hslc: ConstPtr, pproductskuid: ConstPtr, ppwszinstallationid: MutPtr): Hresult

public expect fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, ppwszinstallationid: MutPtr): Hresult

public expect fun sLGetApplicationInformation(hslc: ConstPtr, papplicationid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetInstalledProductKeyIds(hslc: ConstPtr, pproductskuid: ConstPtr, pnproductkeyids: MutPtr, ppproductkeyids: MutPtr): Hresult

public expect fun sLGetLicense(hslc: ConstPtr, plicensefileid: ConstPtr, pcblicensefile: MutPtr, ppblicensefile: MutPtr): Hresult

public expect fun sLGetLicenseFileId(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult

public expect fun sLGetLicenseInformation(hslc: ConstPtr, psllicenseid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetLicensingStatusInformation(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pnstatuscount: MutPtr, pplicensingstatus: MutPtr): Hresult

public expect fun sLGetPKeyId(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult

public expect fun sLGetPKeyInformation(hslc: ConstPtr, ppkeyid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetPolicyInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetPolicyInformationDWORD(hslc: ConstPtr, pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult

public expect fun sLGetProductSkuInformation(hslc: ConstPtr, pproductskuid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetReferralInformation(hslc: ConstPtr, ereferraltype: Slreferraltype, pskuorappid: ConstPtr, pwszvaluename: Pcwstr, ppwszvalue: MutPtr): Hresult

public expect fun sLGetSLIDList(hslc: ConstPtr, equeryidtype: Slidtype, pqueryid: ConstPtr, ereturnidtype: Slidtype, pnreturnids: MutPtr, ppreturnids: MutPtr): Hresult

public expect fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr): Hresult

public expect fun sLGetServiceInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult

public expect fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult

public expect fun sLInstallLicense(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult

public expect fun sLInstallProofOfPurchase(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult

public expect fun sLIsGenuineLocal(pappid: ConstPtr, pgenuinestate: MutPtr, puioptions: MutPtr): Hresult

public expect fun sLOpen(phslc: MutPtr): Hresult

public expect fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr, databuffer: MutPtr, datasize: UInt, resultdatasize: MutPtr): Hresult

public expect fun sLRegisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult

public expect fun sLSetCurrentProductKey(hslc: ConstPtr, pproductskuid: ConstPtr, pproductkeyid: ConstPtr): Hresult

public expect fun sLSetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr): Hresult

public expect fun sLUninstallLicense(hslc: ConstPtr, plicensefileid: ConstPtr): Hresult

public expect fun sLUninstallProofOfPurchase(hslc: ConstPtr, ppkeyid: ConstPtr): Hresult

public expect fun sLUnregisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult

public expect fun saslAcceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun saslEnumerateProfilesA(profilelist: MutPtr, profilecount: MutPtr): Hresult

public expect fun saslEnumerateProfilesW(profilelist: MutPtr, profilecount: MutPtr): Hresult

public expect fun saslGetContextOption(contexthandle: ConstPtr, option: UInt, value: MutPtr, size: UInt, needed: MutPtr): Hresult

public expect fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr): Hresult

public expect fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr): Hresult

public expect fun saslIdentifyPackageA(pinput: ConstPtr, packageinfo: MutPtr): Hresult

public expect fun saslIdentifyPackageW(pinput: ConstPtr, packageinfo: MutPtr): Hresult

public expect fun saslInitializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun saslInitializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult

public expect fun saslSetContextOption(contexthandle: ConstPtr, option: UInt, value: ConstPtr, size: UInt): Hresult

public expect fun sendSAS(asuser: Bool)

public expect fun setContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult

public expect fun setContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult

public expect fun setCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult

public expect fun setCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult

public expect fun sslCrackCertificate(pbcertificate: MutPtr, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr): Bool

public expect fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr): Hresult

public expect fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool

public expect fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool

public expect fun sslFreeCertificate(pcertificate: MutPtr)

public expect fun sslGenerateRandomBits(prandomdata: MutPtr, crandomdata: Int)

public expect fun sslGetExtensions(clienthello: ConstPtr, clienthellobytesize: UInt, genericextensions: MutPtr, genericextensionscount: UByte, bytestoread: MutPtr, flags: SchGetExtensionsOptions): Hresult

public expect fun sslGetMaximumKeySize(reserved: UInt): UInt

public expect fun sslGetServerIdentity(clienthello: ConstPtr, clienthellosize: UInt, serveridentity: MutPtr, serveridentitysize: MutPtr, flags: UInt): Hresult

public expect fun sspiCompareAuthIdentities(authidentity1: ConstPtr, authidentity2: ConstPtr, samesupplieduser: MutPtr, samesuppliedidentity: MutPtr): Hresult

public expect fun sspiCopyAuthIdentity(authdata: ConstPtr, authdatacopy: MutPtr): Hresult

public expect fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr): Hresult

public expect fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr): Hresult

public expect fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr, ppszusername: MutPtr, ppszdomainname: MutPtr, ppszpackedcredentialsstring: MutPtr): Hresult

public expect fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr): Hresult

public expect fun sspiEncryptAuthIdentity(authdata: MutPtr): Hresult

public expect fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr): Hresult

public expect fun sspiExcludePackage(authidentity: ConstPtr, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr): Hresult

public expect fun sspiFreeAuthIdentity(authdata: ConstPtr)

public expect fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr): Hresult

public expect fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr): Boolean

public expect fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean

public expect fun sspiLocalFree(databuffer: ConstPtr)

public expect fun sspiMarshalAuthIdentity(authidentity: ConstPtr, authidentitylength: MutPtr, authidentitybytearray: MutPtr): Hresult

public expect fun sspiPrepareForCredRead(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr): Hresult

public expect fun sspiPrepareForCredWrite(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr, ppszcredmanusername: MutPtr, ppcredentialblob: MutPtr, pcredentialblobsize: MutPtr): Hresult

public expect fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt

public expect fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt

public expect fun sspiSetChannelBindingFlags(pbindings: MutPtr, flags: UInt): Hresult

public expect fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr): Hresult

public expect fun sspiValidateAuthIdentity(authdata: ConstPtr): Hresult

public expect fun sspiZeroAuthIdentity(authdata: ConstPtr)

public expect fun tokenBindingDeleteAllBindings(): Hresult

public expect fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult

public expect fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr, tokenbinding: MutPtr, tokenbindingsize: MutPtr, resultdata: MutPtr): Hresult

public expect fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr, publickeysize: UInt, resultdata: MutPtr): Hresult

public expect fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr): Hresult

public expect fun tokenBindingGenerateMessage(tokenbindings: ConstPtr, tokenbindingssize: ConstPtr, tokenbindingscount: UInt, tokenbindingmessage: MutPtr, tokenbindingmessagesize: MutPtr): Hresult

public expect fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr, minorversion: MutPtr): Hresult

public expect fun tokenBindingGetKeyTypesClient(keytypes: MutPtr): Hresult

public expect fun tokenBindingGetKeyTypesServer(keytypes: MutPtr): Hresult

public expect fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr, tlsekmsize: UInt, resultlist: MutPtr): Hresult

public expect fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr): Boolean

public expect fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr): Boolean

public expect fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult
