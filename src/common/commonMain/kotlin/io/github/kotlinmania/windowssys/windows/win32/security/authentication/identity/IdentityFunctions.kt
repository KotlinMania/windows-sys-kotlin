package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.QuotaLimits
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenSource
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.CredentialTargetInformationw
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.SecHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob

public expect fun acceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun addCredentialsA(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun addCredentialsW(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult

public expect fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult

public expect fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult

public expect fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean

public expect fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean

public expect fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean

public expect fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr<MutPtr<PolicyAuditSidArray>>): Boolean

public expect fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr<Guid>, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean

public expect fun auditFree(buffer: ConstPtr<CVoid>)

public expect fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr<Guid>): Boolean

public expect fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr<Guid>, pauditcategoryid: MutPtr<PolicyAuditEventType>): Boolean

public expect fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pstr>): Boolean

public expect fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pwstr>): Boolean

public expect fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pstr>): Boolean

public expect fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pwstr>): Boolean

public expect fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr<MutPtr<Acl>>): Boolean

public expect fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr<MutPtr<Acl>>): Boolean

public expect fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean

public expect fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Boolean

public expect fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean

public expect fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr<Acl>): Boolean

public expect fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr<Acl>): Boolean

public expect fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean

public expect fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean

public expect fun auditSetSystemPolicy(pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean

public expect fun changeAccountPasswordA(pszpackagename: ConstPtr<Byte>, pszdomainname: ConstPtr<Byte>, pszaccountname: ConstPtr<Byte>, pszoldpassword: ConstPtr<Byte>, psznewpassword: ConstPtr<Byte>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult

public expect fun changeAccountPasswordW(pszpackagename: ConstPtr<UShort>, pszdomainname: ConstPtr<UShort>, pszaccountname: ConstPtr<UShort>, pszoldpassword: ConstPtr<UShort>, psznewpassword: ConstPtr<UShort>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult

public expect fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult

public expect fun credMarshalTargetInfo(intargetinfo: ConstPtr<CredentialTargetInformationw>, buffer: MutPtr<MutPtr<UShort>>, buffersize: MutPtr<UInt>): Ntstatus

public expect fun credUnmarshalTargetInfo(buffer: ConstPtr<UShort>, buffersize: UInt, rettargetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>, retactualsize: MutPtr<UInt>): Ntstatus

public expect fun decryptMessage(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult

public expect fun deleteSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult

public expect fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult

public expect fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult

public expect fun encryptMessage(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult

public expect fun enumerateSecurityPackagesA(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult

public expect fun enumerateSecurityPackagesW(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult

public expect fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun freeContextBuffer(pvcontextbuffer: MutPtr<CVoid>): Hresult

public expect fun freeCredentialsHandle(phcredential: ConstPtr<SecHandle>): Hresult

public expect fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean

public expect fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean

public expect fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean

public expect fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean

public expect fun impersonateSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult

public expect fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult

public expect fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult

public expect fun initSecurityInterfaceA(): MutPtr<SecurityFunctionTableA>

public expect fun initSecurityInterfaceW(): MutPtr<SecurityFunctionTableW>

public expect fun initializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<Byte>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun initializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UShort>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus

public expect fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus

public expect fun lsaClose(objecthandle: LsaHandle): Ntstatus

public expect fun lsaConnectUntrusted(lsahandle: MutPtr<Handle>): Ntstatus

public expect fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr<TrustedDomainInformationEx>, authenticationinformation: ConstPtr<TrustedDomainAuthInformation>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus

public expect fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus

public expect fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus

public expect fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr<MutPtr<LsaUnicodeString>>, countofrights: MutPtr<UInt>): Ntstatus

public expect fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr<LsaUnicodeString>, buffer: MutPtr<MutPtr<CVoid>>, countreturned: MutPtr<UInt>): Ntstatus

public expect fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr<UInt>, logonsessionlist: MutPtr<MutPtr<Luid>>): Ntstatus

public expect fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus

public expect fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus

public expect fun lsaFreeMemory(buffer: ConstPtr<CVoid>): Ntstatus

public expect fun lsaFreeReturnBuffer(buffer: ConstPtr<CVoid>): Ntstatus

public expect fun lsaGetAppliedCAPIDs(systemname: ConstPtr<LsaUnicodeString>, capids: MutPtr<MutPtr<Psid>>, capidcount: MutPtr<UInt>): Ntstatus

public expect fun lsaGetLogonSessionData(logonid: ConstPtr<Luid>, pplogonsessiondata: MutPtr<MutPtr<SecurityLogonSessionData>>): Ntstatus

public expect fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr<LsaString>, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr<CVoid>, authenticationinformationlength: UInt, localgroups: ConstPtr<TokenGroups>, sourcecontext: ConstPtr<TokenSource>, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebufferlength: MutPtr<UInt>, logonid: MutPtr<Luid>, token: MutPtr<Handle>, quotas: MutPtr<QuotaLimits>, substatus: MutPtr<Int>): Ntstatus

public expect fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr<LsaString>, authenticationpackage: MutPtr<UInt>): Ntstatus

public expect fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid>>): Ntstatus

public expect fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid2>>): Ntstatus

public expect fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus

public expect fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus

public expect fun lsaNtStatusToWinError(status: Ntstatus): UInt

public expect fun lsaOpenPolicy(systemname: ConstPtr<LsaUnicodeString>, objectattributes: ConstPtr<LsaObjectAttributes>, desiredaccess: UInt, policyhandle: MutPtr<LsaHandle>): Ntstatus

public expect fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus

public expect fun lsaQueryCAPs(capids: ConstPtr<Psid>, capidcount: UInt, caps: MutPtr<MutPtr<CentralAccessPolicy>>, capcount: MutPtr<UInt>): Ntstatus

public expect fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): Ntstatus

public expect fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation2>>): Ntstatus

public expect fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun lsaRegisterLogonProcess(logonprocessname: ConstPtr<LsaString>, lsahandle: MutPtr<Handle>, securitymode: MutPtr<UInt>): Ntstatus

public expect fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus

public expect fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus

public expect fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: MutPtr<MutPtr<LsaUnicodeString>>): Ntstatus

public expect fun lsaSetCAPs(capdns: ConstPtr<LsaUnicodeString>, capdncount: UInt, flags: UInt): Ntstatus

public expect fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: ConstPtr<LsaForestTrustInformation>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus

public expect fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr<LsaForestTrustInformation2>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus

public expect fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: ConstPtr<LsaUnicodeString>): Ntstatus

public expect fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus

public expect fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult

public expect fun queryContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult

public expect fun queryContextAttributesExA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun queryContextAttributesExW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun queryContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult

public expect fun queryCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult

public expect fun queryCredentialsAttributesExA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun queryCredentialsAttributesExW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun queryCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult

public expect fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult

public expect fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult

public expect fun revertSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult

public expect fun rtlDecryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus

public expect fun rtlEncryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus

public expect fun rtlGenRandom(randombuffer: MutPtr<CVoid>, randombufferlength: UInt): Boolean

public expect fun sLAcquireGenuineTicket(ppticketblob: MutPtr<MutPtr<CVoid>>, pcbticketblob: MutPtr<UInt>, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult

public expect fun sLActivateProduct(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, cbappspecificdata: UInt, pvappspecificdata: ConstPtr<CVoid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult

public expect fun sLClose(hslc: ConstPtr<CVoid>): Hresult

public expect fun sLConsumeRight(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pvreserved: ConstPtr<CVoid>): Hresult

public expect fun sLDepositOfflineConfirmationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult

public expect fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult

public expect fun sLFireEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>): Hresult

public expect fun sLGenerateOfflineInstallationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, ppwszinstallationid: MutPtr<Pwstr>): Hresult

public expect fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, ppwszinstallationid: MutPtr<Pwstr>): Hresult

public expect fun sLGetApplicationInformation(hslc: ConstPtr<CVoid>, papplicationid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetInstalledProductKeyIds(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pnproductkeyids: MutPtr<UInt>, ppproductkeyids: MutPtr<MutPtr<Guid>>): Hresult

public expect fun sLGetLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>, pcblicensefile: MutPtr<UInt>, ppblicensefile: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetLicenseFileId(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult

public expect fun sLGetLicenseInformation(hslc: ConstPtr<CVoid>, psllicenseid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetLicensingStatusInformation(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pnstatuscount: MutPtr<UInt>, pplicensingstatus: MutPtr<MutPtr<SlLicensingStatus>>): Hresult

public expect fun sLGetPKeyId(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult

public expect fun sLGetPKeyInformation(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetPolicyInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetPolicyInformationDWORD(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult

public expect fun sLGetProductSkuInformation(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetReferralInformation(hslc: ConstPtr<CVoid>, ereferraltype: Slreferraltype, pskuorappid: ConstPtr<Guid>, pwszvaluename: Pcwstr, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun sLGetSLIDList(hslc: ConstPtr<CVoid>, equeryidtype: Slidtype, pqueryid: ConstPtr<Guid>, ereturnidtype: Slidtype, pnreturnids: MutPtr<UInt>, ppreturnids: MutPtr<MutPtr<Guid>>): Hresult

public expect fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr<Hresult>): Hresult

public expect fun sLGetServiceInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult

public expect fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult

public expect fun sLInstallLicense(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult

public expect fun sLInstallProofOfPurchase(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult

public expect fun sLIsGenuineLocal(pappid: ConstPtr<Guid>, pgenuinestate: MutPtr<SlGenuineState>, puioptions: MutPtr<SlNongenuineUiOptions>): Hresult

public expect fun sLOpen(phslc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr<UInt>, databuffer: MutPtr<CVoid>, datasize: UInt, resultdatasize: MutPtr<UInt>): Hresult

public expect fun sLRegisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult

public expect fun sLSetCurrentProductKey(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pproductkeyid: ConstPtr<Guid>): Hresult

public expect fun sLSetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Hresult

public expect fun sLUninstallLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>): Hresult

public expect fun sLUninstallProofOfPurchase(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>): Hresult

public expect fun sLUnregisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult

public expect fun saslAcceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun saslEnumerateProfilesA(profilelist: MutPtr<Pstr>, profilecount: MutPtr<UInt>): Hresult

public expect fun saslEnumerateProfilesW(profilelist: MutPtr<Pwstr>, profilecount: MutPtr<UInt>): Hresult

public expect fun saslGetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: MutPtr<CVoid>, size: UInt, needed: MutPtr<UInt>): Hresult

public expect fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult

public expect fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult

public expect fun saslIdentifyPackageA(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult

public expect fun saslIdentifyPackageW(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult

public expect fun saslInitializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun saslInitializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult

public expect fun saslSetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: ConstPtr<CVoid>, size: UInt): Hresult

public expect fun sendSAS(asuser: Bool)

public expect fun setContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun setCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun setCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult

public expect fun sslCrackCertificate(pbcertificate: MutPtr<UByte>, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr<MutPtr<X509Certificate>>): Bool

public expect fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr<MutPtr<CertContext>>): Hresult

public expect fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool

public expect fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool

public expect fun sslFreeCertificate(pcertificate: MutPtr<X509Certificate>)

public expect fun sslGenerateRandomBits(prandomdata: MutPtr<UByte>, crandomdata: Int)

public expect fun sslGetExtensions(clienthello: ConstPtr<UByte>, clienthellobytesize: UInt, genericextensions: MutPtr<SchExtensionData>, genericextensionscount: UByte, bytestoread: MutPtr<UInt>, flags: SchGetExtensionsOptions): Hresult

public expect fun sslGetMaximumKeySize(reserved: UInt): UInt

public expect fun sslGetServerIdentity(clienthello: ConstPtr<UByte>, clienthellosize: UInt, serveridentity: MutPtr<MutPtr<UByte>>, serveridentitysize: MutPtr<UInt>, flags: UInt): Hresult

public expect fun sspiCompareAuthIdentities(authidentity1: ConstPtr<CVoid>, authidentity2: ConstPtr<CVoid>, samesupplieduser: MutPtr<Boolean>, samesuppliedidentity: MutPtr<Boolean>): Hresult

public expect fun sspiCopyAuthIdentity(authdata: ConstPtr<CVoid>, authdatacopy: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr<CVoid>): Hresult

public expect fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr<CVoid>): Hresult

public expect fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr<CVoid>, ppszusername: MutPtr<Pcwstr>, ppszdomainname: MutPtr<Pcwstr>, ppszpackedcredentialsstring: MutPtr<Pcwstr>): Hresult

public expect fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sspiEncryptAuthIdentity(authdata: MutPtr<CVoid>): Hresult

public expect fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr<CVoid>): Hresult

public expect fun sspiExcludePackage(authidentity: ConstPtr<CVoid>, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sspiFreeAuthIdentity(authdata: ConstPtr<CVoid>)

public expect fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr<Pwstr>): Hresult

public expect fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr<CVoid>): Boolean

public expect fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean

public expect fun sspiLocalFree(databuffer: ConstPtr<CVoid>)

public expect fun sspiMarshalAuthIdentity(authidentity: ConstPtr<CVoid>, authidentitylength: MutPtr<UInt>, authidentitybytearray: MutPtr<MutPtr<Byte>>): Hresult

public expect fun sspiPrepareForCredRead(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>): Hresult

public expect fun sspiPrepareForCredWrite(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>, ppszcredmanusername: MutPtr<Pcwstr>, ppcredentialblob: MutPtr<MutPtr<UByte>>, pcredentialblobsize: MutPtr<UInt>): Hresult

public expect fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt

public expect fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt

public expect fun sspiSetChannelBindingFlags(pbindings: MutPtr<SecPkgContextBindings>, flags: UInt): Hresult

public expect fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sspiValidateAuthIdentity(authdata: ConstPtr<CVoid>): Hresult

public expect fun sspiZeroAuthIdentity(authdata: ConstPtr<CVoid>)

public expect fun tokenBindingDeleteAllBindings(): Hresult

public expect fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult

public expect fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr<CVoid>, tokenbinding: MutPtr<MutPtr<CVoid>>, tokenbindingsize: MutPtr<UInt>, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult

public expect fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr<CVoid>, publickeysize: UInt, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult

public expect fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult

public expect fun tokenBindingGenerateMessage(tokenbindings: ConstPtr<ConstPtr<CVoid>>, tokenbindingssize: ConstPtr<UInt>, tokenbindingscount: UInt, tokenbindingmessage: MutPtr<MutPtr<CVoid>>, tokenbindingmessagesize: MutPtr<UInt>): Hresult

public expect fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr<UByte>, minorversion: MutPtr<UByte>): Hresult

public expect fun tokenBindingGetKeyTypesClient(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult

public expect fun tokenBindingGetKeyTypesServer(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult

public expect fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr<CVoid>, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, resultlist: MutPtr<MutPtr<TokenbindingResultList>>): Hresult

public expect fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr<UInt>): Boolean

public expect fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr<UInt>): Boolean

public expect fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult
