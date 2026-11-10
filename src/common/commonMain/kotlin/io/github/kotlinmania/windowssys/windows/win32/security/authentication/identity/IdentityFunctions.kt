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

public expect fun acceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun addCredentialsA(hcredentials: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun addCredentialsW(hcredentials: COpaquePointer?, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun addSecurityPackageA(pszpackagename: Pcstr, poptions: COpaquePointer?): Hresult

public expect fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: COpaquePointer?): Hresult

public expect fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult

public expect fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean

public expect fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean

public expect fun auditEnumerateCategories(ppauditcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean

public expect fun auditEnumeratePerUserPolicy(ppauditsidarray: COpaquePointer?): Boolean

public expect fun auditEnumerateSubCategories(pauditcategoryguid: COpaquePointer?, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean

public expect fun auditFree(buffer: COpaquePointer?)

public expect fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: COpaquePointer?): Boolean

public expect fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: COpaquePointer?, pauditcategoryid: COpaquePointer?): Boolean

public expect fun auditLookupCategoryNameA(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean

public expect fun auditLookupCategoryNameW(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean

public expect fun auditLookupSubCategoryNameA(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean

public expect fun auditLookupSubCategoryNameW(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean

public expect fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean

public expect fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean

public expect fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean

public expect fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: COpaquePointer?): Boolean

public expect fun auditQuerySystemPolicy(psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean

public expect fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean

public expect fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean

public expect fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean

public expect fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean

public expect fun auditSetSystemPolicy(pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean

public expect fun changeAccountPasswordA(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult

public expect fun changeAccountPasswordW(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult

public expect fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult

public expect fun credMarshalTargetInfo(intargetinfo: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus

public expect fun credUnmarshalTargetInfo(buffer: COpaquePointer?, buffersize: UInt, rettargetinfo: COpaquePointer?, retactualsize: COpaquePointer?): Ntstatus

public expect fun decryptMessage(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult

public expect fun deleteSecurityContext(phcontext: COpaquePointer?): Hresult

public expect fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult

public expect fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult

public expect fun encryptMessage(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult

public expect fun enumerateSecurityPackagesA(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult

public expect fun enumerateSecurityPackagesW(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult

public expect fun exportSecurityContext(phcontext: COpaquePointer?, fflags: ExportSecurityContextFlags, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult

public expect fun freeContextBuffer(pvcontextbuffer: COpaquePointer?): Hresult

public expect fun freeCredentialsHandle(phcredential: COpaquePointer?): Hresult

public expect fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean

public expect fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean

public expect fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean

public expect fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean

public expect fun impersonateSecurityContext(phcontext: COpaquePointer?): Hresult

public expect fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult

public expect fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult

public expect fun initSecurityInterfaceA(): COpaquePointer?

public expect fun initSecurityInterfaceW(): COpaquePointer?

public expect fun initializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun initializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: UInt): Ntstatus

public expect fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus

public expect fun lsaClose(objecthandle: LsaHandle): Ntstatus

public expect fun lsaConnectUntrusted(lsahandle: COpaquePointer?): Ntstatus

public expect fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: COpaquePointer?, authenticationinformation: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus

public expect fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus

public expect fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus

public expect fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: COpaquePointer?): Ntstatus

public expect fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: COpaquePointer?, buffer: COpaquePointer?, countreturned: COpaquePointer?): Ntstatus

public expect fun lsaEnumerateLogonSessions(logonsessioncount: COpaquePointer?, logonsessionlist: COpaquePointer?): Ntstatus

public expect fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus

public expect fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus

public expect fun lsaFreeMemory(buffer: COpaquePointer?): Ntstatus

public expect fun lsaFreeReturnBuffer(buffer: COpaquePointer?): Ntstatus

public expect fun lsaGetAppliedCAPIDs(systemname: COpaquePointer?, capids: COpaquePointer?, capidcount: COpaquePointer?): Ntstatus

public expect fun lsaGetLogonSessionData(logonid: COpaquePointer?, pplogonsessiondata: COpaquePointer?): Ntstatus

public expect fun lsaLogonUser(lsahandle: Handle, originname: COpaquePointer?, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: COpaquePointer?, authenticationinformationlength: UInt, localgroups: COpaquePointer?, sourcecontext: COpaquePointer?, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, token: COpaquePointer?, quotas: COpaquePointer?, substatus: COpaquePointer?): Ntstatus

public expect fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: COpaquePointer?, authenticationpackage: COpaquePointer?): Ntstatus

public expect fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus

public expect fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus

public expect fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus

public expect fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus

public expect fun lsaNtStatusToWinError(status: Ntstatus): UInt

public expect fun lsaOpenPolicy(systemname: COpaquePointer?, objectattributes: COpaquePointer?, desiredaccess: UInt, policyhandle: COpaquePointer?): Ntstatus

public expect fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus

public expect fun lsaQueryCAPs(capids: COpaquePointer?, capidcount: UInt, caps: COpaquePointer?, capcount: COpaquePointer?): Ntstatus

public expect fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?): Ntstatus

public expect fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?): Ntstatus

public expect fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaRegisterLogonProcess(logonprocessname: COpaquePointer?, lsahandle: COpaquePointer?, securitymode: COpaquePointer?): Ntstatus

public expect fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus

public expect fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: COpaquePointer?, countofrights: UInt): Ntstatus

public expect fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus

public expect fun lsaSetCAPs(capdns: COpaquePointer?, capdncount: UInt, flags: UInt): Ntstatus

public expect fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus

public expect fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus

public expect fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus

public expect fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus

public expect fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus

public expect fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult

public expect fun queryContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult

public expect fun queryContextAttributesExA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun queryContextAttributesExW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun queryContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult

public expect fun queryCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult

public expect fun queryCredentialsAttributesExA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun queryCredentialsAttributesExW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun queryCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult

public expect fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult

public expect fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: COpaquePointer?): Hresult

public expect fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: COpaquePointer?): Hresult

public expect fun revertSecurityContext(phcontext: COpaquePointer?): Hresult

public expect fun rtlDecryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus

public expect fun rtlEncryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus

public expect fun rtlGenRandom(randombuffer: COpaquePointer?, randombufferlength: UInt): Boolean

public expect fun sLAcquireGenuineTicket(ppticketblob: COpaquePointer?, pcbticketblob: COpaquePointer?, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult

public expect fun sLActivateProduct(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, cbappspecificdata: UInt, pvappspecificdata: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult

public expect fun sLClose(hslc: COpaquePointer?): Hresult

public expect fun sLConsumeRight(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pvreserved: COpaquePointer?): Hresult

public expect fun sLDepositOfflineConfirmationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult

public expect fun sLDepositOfflineConfirmationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult

public expect fun sLFireEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?): Hresult

public expect fun sLGenerateOfflineInstallationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult

public expect fun sLGenerateOfflineInstallationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult

public expect fun sLGetApplicationInformation(hslc: COpaquePointer?, papplicationid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetInstalledProductKeyIds(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pnproductkeyids: COpaquePointer?, ppproductkeyids: COpaquePointer?): Hresult

public expect fun sLGetLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?, pcblicensefile: COpaquePointer?, ppblicensefile: COpaquePointer?): Hresult

public expect fun sLGetLicenseFileId(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult

public expect fun sLGetLicenseInformation(hslc: COpaquePointer?, psllicenseid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetLicensingStatusInformation(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pnstatuscount: COpaquePointer?, pplicensingstatus: COpaquePointer?): Hresult

public expect fun sLGetPKeyId(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult

public expect fun sLGetPKeyInformation(hslc: COpaquePointer?, ppkeyid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetPolicyInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetPolicyInformationDWORD(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult

public expect fun sLGetProductSkuInformation(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetReferralInformation(hslc: COpaquePointer?, ereferraltype: Slreferraltype, pskuorappid: COpaquePointer?, pwszvaluename: Pcwstr, ppwszvalue: COpaquePointer?): Hresult

public expect fun sLGetSLIDList(hslc: COpaquePointer?, equeryidtype: Slidtype, pqueryid: COpaquePointer?, ereturnidtype: Slidtype, pnreturnids: COpaquePointer?, ppreturnids: COpaquePointer?): Hresult

public expect fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: COpaquePointer?): Hresult

public expect fun sLGetServiceInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult

public expect fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult

public expect fun sLInstallLicense(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult

public expect fun sLInstallProofOfPurchase(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult

public expect fun sLIsGenuineLocal(pappid: COpaquePointer?, pgenuinestate: COpaquePointer?, puioptions: COpaquePointer?): Hresult

public expect fun sLOpen(phslc: COpaquePointer?): Hresult

public expect fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: COpaquePointer?, databuffer: COpaquePointer?, datasize: UInt, resultdatasize: COpaquePointer?): Hresult

public expect fun sLRegisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult

public expect fun sLSetCurrentProductKey(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pproductkeyid: COpaquePointer?): Hresult

public expect fun sLSetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: COpaquePointer?): Hresult

public expect fun sLUninstallLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult

public expect fun sLUninstallProofOfPurchase(hslc: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult

public expect fun sLUnregisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult

public expect fun saslAcceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun saslEnumerateProfilesA(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult

public expect fun saslEnumerateProfilesW(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult

public expect fun saslGetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt, needed: COpaquePointer?): Hresult

public expect fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: COpaquePointer?): Hresult

public expect fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: COpaquePointer?): Hresult

public expect fun saslIdentifyPackageA(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult

public expect fun saslIdentifyPackageW(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult

public expect fun saslInitializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun saslInitializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun saslSetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt): Hresult

public expect fun sendSAS(asuser: Bool)

public expect fun setContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun setCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun setCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun sslCrackCertificate(pbcertificate: COpaquePointer?, cbcertificate: UInt, dwflags: UInt, ppcertificate: COpaquePointer?): Bool

public expect fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: COpaquePointer?): Hresult

public expect fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool

public expect fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool

public expect fun sslFreeCertificate(pcertificate: COpaquePointer?)

public expect fun sslGenerateRandomBits(prandomdata: COpaquePointer?, crandomdata: Int)

public expect fun sslGetExtensions(clienthello: COpaquePointer?, clienthellobytesize: UInt, genericextensions: COpaquePointer?, genericextensionscount: UByte, bytestoread: COpaquePointer?, flags: SchGetExtensionsOptions): Hresult

public expect fun sslGetMaximumKeySize(reserved: UInt): UInt

public expect fun sslGetServerIdentity(clienthello: COpaquePointer?, clienthellosize: UInt, serveridentity: COpaquePointer?, serveridentitysize: COpaquePointer?, flags: UInt): Hresult

public expect fun sspiCompareAuthIdentities(authidentity1: COpaquePointer?, authidentity2: COpaquePointer?, samesupplieduser: COpaquePointer?, samesuppliedidentity: COpaquePointer?): Hresult

public expect fun sspiCopyAuthIdentity(authdata: COpaquePointer?, authdatacopy: COpaquePointer?): Hresult

public expect fun sspiDecryptAuthIdentity(encryptedauthdata: COpaquePointer?): Hresult

public expect fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: COpaquePointer?): Hresult

public expect fun sspiEncodeAuthIdentityAsStrings(pauthidentity: COpaquePointer?, ppszusername: COpaquePointer?, ppszdomainname: COpaquePointer?, ppszpackedcredentialsstring: COpaquePointer?): Hresult

public expect fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: COpaquePointer?): Hresult

public expect fun sspiEncryptAuthIdentity(authdata: COpaquePointer?): Hresult

public expect fun sspiEncryptAuthIdentityEx(options: UInt, authdata: COpaquePointer?): Hresult

public expect fun sspiExcludePackage(authidentity: COpaquePointer?, pszpackagename: Pcwstr, ppnewauthidentity: COpaquePointer?): Hresult

public expect fun sspiFreeAuthIdentity(authdata: COpaquePointer?)

public expect fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: COpaquePointer?): Hresult

public expect fun sspiIsAuthIdentityEncrypted(encryptedauthdata: COpaquePointer?): Boolean

public expect fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean

public expect fun sspiLocalFree(databuffer: COpaquePointer?)

public expect fun sspiMarshalAuthIdentity(authidentity: COpaquePointer?, authidentitylength: COpaquePointer?, authidentitybytearray: COpaquePointer?): Hresult

public expect fun sspiPrepareForCredRead(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?): Hresult

public expect fun sspiPrepareForCredWrite(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?, ppszcredmanusername: COpaquePointer?, ppcredentialblob: COpaquePointer?, pcredentialblobsize: COpaquePointer?): Hresult

public expect fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt

public expect fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt

public expect fun sspiSetChannelBindingFlags(pbindings: COpaquePointer?, flags: UInt): Hresult

public expect fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: COpaquePointer?): Hresult

public expect fun sspiValidateAuthIdentity(authdata: COpaquePointer?): Hresult

public expect fun sspiZeroAuthIdentity(authdata: COpaquePointer?)

public expect fun tokenBindingDeleteAllBindings(): Hresult

public expect fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult

public expect fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: COpaquePointer?, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: COpaquePointer?, tokenbinding: COpaquePointer?, tokenbindingsize: COpaquePointer?, resultdata: COpaquePointer?): Hresult

public expect fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: COpaquePointer?, publickeysize: UInt, resultdata: COpaquePointer?): Hresult

public expect fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: COpaquePointer?): Hresult

public expect fun tokenBindingGenerateMessage(tokenbindings: COpaquePointer?, tokenbindingssize: COpaquePointer?, tokenbindingscount: UInt, tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: COpaquePointer?): Hresult

public expect fun tokenBindingGetHighestSupportedVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?): Hresult

public expect fun tokenBindingGetKeyTypesClient(keytypes: COpaquePointer?): Hresult

public expect fun tokenBindingGetKeyTypesServer(keytypes: COpaquePointer?): Hresult

public expect fun tokenBindingVerifyMessage(tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: COpaquePointer?, tlsekmsize: UInt, resultlist: COpaquePointer?): Hresult

public expect fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: COpaquePointer?): Boolean

public expect fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: COpaquePointer?): Boolean

public expect fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult
