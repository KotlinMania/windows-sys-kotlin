@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun acceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW")

public actual fun addCredentialsA(hcredentials: ConstPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA")

public actual fun addCredentialsW(hcredentials: ConstPtr, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW")

public actual fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories")

public actual fun auditFree(buffer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree")

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr, pauditcategoryid: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity")

public actual fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity")

public actual fun auditSetSystemPolicy(pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy")

public actual fun changeAccountPasswordA(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA")

public actual fun changeAccountPasswordW(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW")

public actual fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken")

public actual fun credMarshalTargetInfo(intargetinfo: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo")

public actual fun credUnmarshalTargetInfo(buffer: ConstPtr, buffersize: UInt, rettargetinfo: MutPtr, retactualsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo")

public actual fun decryptMessage(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage")

public actual fun deleteSecurityContext(phcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW")

public actual fun encryptMessage(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage")

public actual fun enumerateSecurityPackagesA(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA")

public actual fun enumerateSecurityPackagesW(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW")

public actual fun exportSecurityContext(phcontext: ConstPtr, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext")

public actual fun freeContextBuffer(pvcontextbuffer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer")

public actual fun freeCredentialsHandle(phcredential: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW")

public actual fun impersonateSecurityContext(phcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW")

public actual fun initSecurityInterfaceA(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA")

public actual fun initSecurityInterfaceW(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW")

public actual fun initializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA")

public actual fun initializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr, countofrights: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle: Long): Int

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle)

public actual fun lsaConnectUntrusted(lsahandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr, authenticationinformation: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr, countofrights: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr, buffer: MutPtr, countreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr, logonsessionlist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx")

public actual fun lsaFreeMemory(buffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory")

public actual fun lsaFreeReturnBuffer(buffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer")

public actual fun lsaGetAppliedCAPIDs(systemname: ConstPtr, capids: MutPtr, capidcount: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs")

public actual fun lsaGetLogonSessionData(logonid: ConstPtr, pplogonsessiondata: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData")

public actual fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr, authenticationinformationlength: UInt, localgroups: ConstPtr, sourcecontext: ConstPtr, profilebuffer: MutPtr, profilebufferlength: MutPtr, logonid: MutPtr, token: MutPtr, quotas: MutPtr, substatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLogonUser")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr, authenticationpackage: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status: Int): Int

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status).toUInt()

public actual fun lsaOpenPolicy(systemname: ConstPtr, objectattributes: ConstPtr, desiredaccess: UInt, policyhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName")

public actual fun lsaQueryCAPs(capids: ConstPtr, capidcount: UInt, caps: MutPtr, capcount: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName")

public actual fun lsaRegisterLogonProcess(logonprocessname: ConstPtr, lsahandle: MutPtr, securitymode: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr, countofrights: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData")

public actual fun lsaSetCAPs(capdns: ConstPtr, capdncount: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification")

public actual fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature")

public actual fun queryContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA")

public actual fun queryContextAttributesExA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA")

public actual fun queryContextAttributesExW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW")

public actual fun queryContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW")

public actual fun queryCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA")

public actual fun queryCredentialsAttributesExA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA")

public actual fun queryCredentialsAttributesExW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW")

public actual fun queryCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW")

public actual fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW")

public actual fun revertSecurityContext(phcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext")

public actual fun rtlDecryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory")

public actual fun rtlEncryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory")

public actual fun rtlGenRandom(randombuffer: MutPtr, randombufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom")

public actual fun sLAcquireGenuineTicket(ppticketblob: MutPtr, pcbticketblob: MutPtr, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket")

public actual fun sLActivateProduct(hslc: ConstPtr, pproductskuid: ConstPtr, cbappspecificdata: UInt, pvappspecificdata: ConstPtr, pactivationinfo: ConstPtr, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct")

public actual fun sLClose(hslc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLClose")

public actual fun sLConsumeRight(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pvreserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight")

public actual fun sLDepositOfflineConfirmationId(hslc: ConstPtr, pproductskuid: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx")

public actual fun sLFireEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent")

public actual fun sLGenerateOfflineInstallationId(hslc: ConstPtr, pproductskuid: ConstPtr, ppwszinstallationid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, ppwszinstallationid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx")

public actual fun sLGetApplicationInformation(hslc: ConstPtr, papplicationid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation")

public actual fun sLGetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation")

public actual fun sLGetInstalledProductKeyIds(hslc: ConstPtr, pproductskuid: ConstPtr, pnproductkeyids: MutPtr, ppproductkeyids: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds")

public actual fun sLGetLicense(hslc: ConstPtr, plicensefileid: ConstPtr, pcblicensefile: MutPtr, ppblicensefile: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense")

public actual fun sLGetLicenseFileId(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId")

public actual fun sLGetLicenseInformation(hslc: ConstPtr, psllicenseid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation")

public actual fun sLGetLicensingStatusInformation(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pnstatuscount: MutPtr, pplicensingstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation")

public actual fun sLGetPKeyId(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId")

public actual fun sLGetPKeyInformation(hslc: ConstPtr, ppkeyid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation")

public actual fun sLGetPolicyInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation")

public actual fun sLGetPolicyInformationDWORD(hslc: ConstPtr, pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD")

public actual fun sLGetProductSkuInformation(hslc: ConstPtr, pproductskuid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation")

public actual fun sLGetReferralInformation(hslc: ConstPtr, ereferraltype: Slreferraltype, pskuorappid: ConstPtr, pwszvaluename: Pcwstr, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation")

public actual fun sLGetSLIDList(hslc: ConstPtr, equeryidtype: Slidtype, pqueryid: ConstPtr, ereturnidtype: Slidtype, pnreturnids: MutPtr, ppreturnids: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus")

public actual fun sLGetServiceInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD")

public actual fun sLInstallLicense(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense")

public actual fun sLInstallProofOfPurchase(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase")

public actual fun sLIsGenuineLocal(pappid: ConstPtr, pgenuinestate: MutPtr, puioptions: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal")

public actual fun sLOpen(phslc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr, databuffer: MutPtr, datasize: UInt, resultdatasize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp")

public actual fun sLRegisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent")

public actual fun sLSetCurrentProductKey(hslc: ConstPtr, pproductskuid: ConstPtr, pproductkeyid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey")

public actual fun sLSetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation")

public actual fun sLUninstallLicense(hslc: ConstPtr, plicensefileid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense")

public actual fun sLUninstallProofOfPurchase(hslc: ConstPtr, ppkeyid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase")

public actual fun sLUnregisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent")

public actual fun saslAcceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext")

public actual fun saslEnumerateProfilesA(profilelist: MutPtr, profilecount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA")

public actual fun saslEnumerateProfilesW(profilelist: MutPtr, profilecount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW")

public actual fun saslGetContextOption(contexthandle: ConstPtr, option: UInt, value: MutPtr, size: UInt, needed: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW")

public actual fun saslIdentifyPackageA(pinput: ConstPtr, packageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA")

public actual fun saslIdentifyPackageW(pinput: ConstPtr, packageinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW")

public actual fun saslInitializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA")

public actual fun saslInitializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW")

public actual fun saslSetContextOption(contexthandle: ConstPtr, option: UInt, value: ConstPtr, size: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser: Int): Unit

public actual fun sendSAS(asuser: Bool): Unit =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser)

public actual fun setContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA")

public actual fun setContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW")

public actual fun setCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA")

public actual fun setCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW")

public actual fun sslCrackCertificate(pbcertificate: MutPtr, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslDeserializeCertificateStore")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW")

public actual fun sslFreeCertificate(pcertificate: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate")

public actual fun sslGenerateRandomBits(prandomdata: MutPtr, crandomdata: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits")

public actual fun sslGetExtensions(clienthello: ConstPtr, clienthellobytesize: UInt, genericextensions: MutPtr, genericextensionscount: UByte, bytestoread: MutPtr, flags: SchGetExtensionsOptions): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved: Int): Int

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved.toInt()).toUInt()

public actual fun sslGetServerIdentity(clienthello: ConstPtr, clienthellosize: UInt, serveridentity: MutPtr, serveridentitysize: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity")

public actual fun sspiCompareAuthIdentities(authidentity1: ConstPtr, authidentity2: ConstPtr, samesupplieduser: MutPtr, samesuppliedidentity: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities")

public actual fun sspiCopyAuthIdentity(authdata: ConstPtr, authdatacopy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr, ppszusername: MutPtr, ppszdomainname: MutPtr, ppszpackedcredentialsstring: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity")

public actual fun sspiEncryptAuthIdentity(authdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx")

public actual fun sspiExcludePackage(authidentity: ConstPtr, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage")

public actual fun sspiFreeAuthIdentity(authdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity")

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus: Int): Int

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    (wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus.toInt()) != 0)

public actual fun sspiLocalFree(databuffer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree")

public actual fun sspiMarshalAuthIdentity(authidentity: ConstPtr, authidentitylength: MutPtr, authidentitybytearray: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity")

public actual fun sspiPrepareForCredRead(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead")

public actual fun sspiPrepareForCredWrite(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr, ppszcredmanusername: MutPtr, ppcredentialblob: MutPtr, pcredentialblobsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW")

public actual fun sspiSetChannelBindingFlags(pbindings: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity")

public actual fun sspiValidateAuthIdentity(authdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity")

public actual fun sspiZeroAuthIdentity(authdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings(): Int

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings()

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding")

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr, tokenbinding: MutPtr, tokenbindingsize: MutPtr, resultdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr, publickeysize: UInt, resultdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri")

public actual fun tokenBindingGenerateMessage(tokenbindings: ConstPtr, tokenbindingssize: ConstPtr, tokenbindingscount: UInt, tokenbindingmessage: MutPtr, tokenbindingmessagesize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr, minorversion: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion")

public actual fun tokenBindingGetKeyTypesClient(keytypes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient")

public actual fun tokenBindingGetKeyTypesServer(keytypes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr, tlsekmsize: UInt, resultlist: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW")

public actual fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature")
