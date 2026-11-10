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

public actual fun acceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addCredentialsA(hcredentials: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addCredentialsW(hcredentials: COpaquePointer?, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: COpaquePointer?, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditFree(buffer: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: COpaquePointer?, pauditcategoryid: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditQuerySystemPolicy(psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auditSetSystemPolicy(pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeAccountPasswordA(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeAccountPasswordW(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun credMarshalTargetInfo(intargetinfo: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun credUnmarshalTargetInfo(buffer: COpaquePointer?, buffersize: UInt, rettargetinfo: COpaquePointer?, retactualsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decryptMessage(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteSecurityContext(phcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun encryptMessage(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateSecurityPackagesA(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateSecurityPackagesW(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: ExportSecurityContextFlags, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeContextBuffer(pvcontextbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeCredentialsHandle(phcredential: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun impersonateSecurityContext(phcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initSecurityInterfaceA(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initSecurityInterfaceW(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaConnectUntrusted(lsahandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: COpaquePointer?, authenticationinformation: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: COpaquePointer?, buffer: COpaquePointer?, countreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: COpaquePointer?, logonsessionlist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaFreeMemory(buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaFreeReturnBuffer(buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaGetAppliedCAPIDs(systemname: COpaquePointer?, capids: COpaquePointer?, capidcount: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaGetLogonSessionData(logonid: COpaquePointer?, pplogonsessiondata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaLogonUser(lsahandle: Handle, originname: COpaquePointer?, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: COpaquePointer?, authenticationinformationlength: UInt, localgroups: COpaquePointer?, sourcecontext: COpaquePointer?, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, token: COpaquePointer?, quotas: COpaquePointer?, substatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: COpaquePointer?, authenticationpackage: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaOpenPolicy(systemname: COpaquePointer?, objectattributes: COpaquePointer?, desiredaccess: UInt, policyhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryCAPs(capids: COpaquePointer?, capidcount: UInt, caps: COpaquePointer?, capcount: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaRegisterLogonProcess(logonprocessname: COpaquePointer?, lsahandle: COpaquePointer?, securitymode: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetCAPs(capdns: COpaquePointer?, capdncount: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryContextAttributesExA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryContextAttributesExW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryCredentialsAttributesExA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryCredentialsAttributesExW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun revertSecurityContext(phcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEncryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGenRandom(randombuffer: COpaquePointer?, randombufferlength: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLAcquireGenuineTicket(ppticketblob: COpaquePointer?, pcbticketblob: COpaquePointer?, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLActivateProduct(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, cbappspecificdata: UInt, pvappspecificdata: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLClose(hslc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLConsumeRight(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLDepositOfflineConfirmationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLFireEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGenerateOfflineInstallationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetApplicationInformation(hslc: COpaquePointer?, papplicationid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetInstalledProductKeyIds(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pnproductkeyids: COpaquePointer?, ppproductkeyids: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?, pcblicensefile: COpaquePointer?, ppblicensefile: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetLicenseFileId(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetLicenseInformation(hslc: COpaquePointer?, psllicenseid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetLicensingStatusInformation(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pnstatuscount: COpaquePointer?, pplicensingstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetPKeyId(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetPKeyInformation(hslc: COpaquePointer?, ppkeyid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetPolicyInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetPolicyInformationDWORD(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetProductSkuInformation(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetReferralInformation(hslc: COpaquePointer?, ereferraltype: Slreferraltype, pskuorappid: COpaquePointer?, pwszvaluename: Pcwstr, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetSLIDList(hslc: COpaquePointer?, equeryidtype: Slidtype, pqueryid: COpaquePointer?, ereturnidtype: Slidtype, pnreturnids: COpaquePointer?, ppreturnids: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetServiceInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLInstallLicense(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLInstallProofOfPurchase(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLIsGenuineLocal(pappid: COpaquePointer?, pgenuinestate: COpaquePointer?, puioptions: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLOpen(phslc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: COpaquePointer?, databuffer: COpaquePointer?, datasize: UInt, resultdatasize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLRegisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLSetCurrentProductKey(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pproductkeyid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLSetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLUninstallLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLUninstallProofOfPurchase(hslc: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sLUnregisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslAcceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslEnumerateProfilesA(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslEnumerateProfilesW(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslGetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt, needed: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslIdentifyPackageA(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslIdentifyPackageW(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslInitializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslInitializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saslSetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendSAS(asuser: Bool): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslCrackCertificate(pbcertificate: COpaquePointer?, cbcertificate: UInt, dwflags: UInt, ppcertificate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslFreeCertificate(pcertificate: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGenerateRandomBits(prandomdata: COpaquePointer?, crandomdata: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGetExtensions(clienthello: COpaquePointer?, clienthellobytesize: UInt, genericextensions: COpaquePointer?, genericextensionscount: UByte, bytestoread: COpaquePointer?, flags: SchGetExtensionsOptions): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGetServerIdentity(clienthello: COpaquePointer?, clienthellosize: UInt, serveridentity: COpaquePointer?, serveridentitysize: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiCompareAuthIdentities(authidentity1: COpaquePointer?, authidentity2: COpaquePointer?, samesupplieduser: COpaquePointer?, samesuppliedidentity: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiCopyAuthIdentity(authdata: COpaquePointer?, authdatacopy: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: COpaquePointer?, ppszusername: COpaquePointer?, ppszdomainname: COpaquePointer?, ppszpackedcredentialsstring: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiEncryptAuthIdentity(authdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiExcludePackage(authidentity: COpaquePointer?, pszpackagename: Pcwstr, ppnewauthidentity: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiFreeAuthIdentity(authdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiLocalFree(databuffer: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiMarshalAuthIdentity(authidentity: COpaquePointer?, authidentitylength: COpaquePointer?, authidentitybytearray: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiPrepareForCredRead(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiPrepareForCredWrite(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?, ppszcredmanusername: COpaquePointer?, ppcredentialblob: COpaquePointer?, pcredentialblobsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiSetChannelBindingFlags(pbindings: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiValidateAuthIdentity(authdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiZeroAuthIdentity(authdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: COpaquePointer?, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: COpaquePointer?, tokenbinding: COpaquePointer?, tokenbindingsize: COpaquePointer?, resultdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: COpaquePointer?, publickeysize: UInt, resultdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGenerateMessage(tokenbindings: COpaquePointer?, tokenbindingssize: COpaquePointer?, tokenbindingscount: UInt, tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGetKeyTypesClient(keytypes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingGetKeyTypesServer(keytypes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: COpaquePointer?, tlsekmsize: UInt, resultlist: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
