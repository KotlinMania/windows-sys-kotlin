@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun acceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW")

public actual fun addCredentialsA(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA")

public actual fun addCredentialsW(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW")

public actual fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr<MutPtr<PolicyAuditSidArray>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr<Guid>, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories")

public actual fun auditFree(buffer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree")

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr<Guid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr<Guid>, pauditcategoryid: MutPtr<PolicyAuditEventType>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pstr>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pwstr>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pstr>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pwstr>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr<MutPtr<Acl>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr<MutPtr<Acl>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity")

public actual fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr<Acl>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr<Acl>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity")

public actual fun auditSetSystemPolicy(pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy")

public actual fun changeAccountPasswordA(pszpackagename: ConstPtr<Byte>, pszdomainname: ConstPtr<Byte>, pszaccountname: ConstPtr<Byte>, pszoldpassword: ConstPtr<Byte>, psznewpassword: ConstPtr<Byte>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA")

public actual fun changeAccountPasswordW(pszpackagename: ConstPtr<UShort>, pszdomainname: ConstPtr<UShort>, pszaccountname: ConstPtr<UShort>, pszoldpassword: ConstPtr<UShort>, psznewpassword: ConstPtr<UShort>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW")

public actual fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken")

public actual fun credMarshalTargetInfo(intargetinfo: ConstPtr<CredentialTargetInformationw>, buffer: MutPtr<MutPtr<UShort>>, buffersize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo")

public actual fun credUnmarshalTargetInfo(buffer: ConstPtr<UShort>, buffersize: UInt, rettargetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>, retactualsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo")

public actual fun decryptMessage(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage")

public actual fun deleteSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW")

public actual fun encryptMessage(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage")

public actual fun enumerateSecurityPackagesA(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA")

public actual fun enumerateSecurityPackagesW(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW")

public actual fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext")

public actual fun freeContextBuffer(pvcontextbuffer: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer")

public actual fun freeCredentialsHandle(phcredential: ConstPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW")

public actual fun impersonateSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW")

public actual fun initSecurityInterfaceA(): MutPtr<SecurityFunctionTableA> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA")

public actual fun initSecurityInterfaceW(): MutPtr<SecurityFunctionTableW> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW")

public actual fun initializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<Byte>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA")

public actual fun initializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UShort>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle: Long): Int

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle).toInt()

public actual fun lsaConnectUntrusted(lsahandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr<TrustedDomainInformationEx>, authenticationinformation: ConstPtr<TrustedDomainAuthInformation>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr<MutPtr<LsaUnicodeString>>, countofrights: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr<LsaUnicodeString>, buffer: MutPtr<MutPtr<CVoid>>, countreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr<UInt>, logonsessionlist: MutPtr<MutPtr<Luid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx")

public actual fun lsaFreeMemory(buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory")

public actual fun lsaFreeReturnBuffer(buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer")

public actual fun lsaGetAppliedCAPIDs(systemname: ConstPtr<LsaUnicodeString>, capids: MutPtr<MutPtr<Psid>>, capidcount: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs")

public actual fun lsaGetLogonSessionData(logonid: ConstPtr<Luid>, pplogonsessiondata: MutPtr<MutPtr<SecurityLogonSessionData>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData")

public actual fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr<LsaString>, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr<CVoid>, authenticationinformationlength: UInt, localgroups: ConstPtr<TokenGroups>, sourcecontext: ConstPtr<TokenSource>, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebufferlength: MutPtr<UInt>, logonid: MutPtr<Luid>, token: MutPtr<Handle>, quotas: MutPtr<QuotaLimits>, substatus: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLogonUser")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr<LsaString>, authenticationpackage: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid2>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status: Int): Int

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status).toUInt()

public actual fun lsaOpenPolicy(systemname: ConstPtr<LsaUnicodeString>, objectattributes: ConstPtr<LsaObjectAttributes>, desiredaccess: UInt, policyhandle: MutPtr<LsaHandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName")

public actual fun lsaQueryCAPs(capids: ConstPtr<Psid>, capidcount: UInt, caps: MutPtr<MutPtr<CentralAccessPolicy>>, capcount: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation2>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName")

public actual fun lsaRegisterLogonProcess(logonprocessname: ConstPtr<LsaString>, lsahandle: MutPtr<Handle>, securitymode: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: MutPtr<MutPtr<LsaUnicodeString>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData")

public actual fun lsaSetCAPs(capdns: ConstPtr<LsaUnicodeString>, capdncount: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: ConstPtr<LsaForestTrustInformation>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr<LsaForestTrustInformation2>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: ConstPtr<LsaUnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification")

public actual fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature")

public actual fun queryContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA")

public actual fun queryContextAttributesExA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA")

public actual fun queryContextAttributesExW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW")

public actual fun queryContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW")

public actual fun queryCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA")

public actual fun queryCredentialsAttributesExA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA")

public actual fun queryCredentialsAttributesExW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW")

public actual fun queryCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW")

public actual fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW")

public actual fun revertSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext")

public actual fun rtlDecryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory")

public actual fun rtlEncryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory")

public actual fun rtlGenRandom(randombuffer: MutPtr<CVoid>, randombufferlength: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom")

public actual fun sLAcquireGenuineTicket(ppticketblob: MutPtr<MutPtr<CVoid>>, pcbticketblob: MutPtr<UInt>, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket")

public actual fun sLActivateProduct(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, cbappspecificdata: UInt, pvappspecificdata: ConstPtr<CVoid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct")

public actual fun sLClose(hslc: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLClose")

public actual fun sLConsumeRight(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight")

public actual fun sLDepositOfflineConfirmationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx")

public actual fun sLFireEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent")

public actual fun sLGenerateOfflineInstallationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, ppwszinstallationid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, ppwszinstallationid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx")

public actual fun sLGetApplicationInformation(hslc: ConstPtr<CVoid>, papplicationid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation")

public actual fun sLGetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation")

public actual fun sLGetInstalledProductKeyIds(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pnproductkeyids: MutPtr<UInt>, ppproductkeyids: MutPtr<MutPtr<Guid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds")

public actual fun sLGetLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>, pcblicensefile: MutPtr<UInt>, ppblicensefile: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense")

public actual fun sLGetLicenseFileId(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId")

public actual fun sLGetLicenseInformation(hslc: ConstPtr<CVoid>, psllicenseid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation")

public actual fun sLGetLicensingStatusInformation(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pnstatuscount: MutPtr<UInt>, pplicensingstatus: MutPtr<MutPtr<SlLicensingStatus>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation")

public actual fun sLGetPKeyId(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId")

public actual fun sLGetPKeyInformation(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation")

public actual fun sLGetPolicyInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation")

public actual fun sLGetPolicyInformationDWORD(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD")

public actual fun sLGetProductSkuInformation(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation")

public actual fun sLGetReferralInformation(hslc: ConstPtr<CVoid>, ereferraltype: Slreferraltype, pskuorappid: ConstPtr<Guid>, pwszvaluename: Pcwstr, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation")

public actual fun sLGetSLIDList(hslc: ConstPtr<CVoid>, equeryidtype: Slidtype, pqueryid: ConstPtr<Guid>, ereturnidtype: Slidtype, pnreturnids: MutPtr<UInt>, ppreturnids: MutPtr<MutPtr<Guid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr<Hresult>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus")

public actual fun sLGetServiceInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD")

public actual fun sLInstallLicense(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense")

public actual fun sLInstallProofOfPurchase(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase")

public actual fun sLIsGenuineLocal(pappid: ConstPtr<Guid>, pgenuinestate: MutPtr<SlGenuineState>, puioptions: MutPtr<SlNongenuineUiOptions>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal")

public actual fun sLOpen(phslc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr<UInt>, databuffer: MutPtr<CVoid>, datasize: UInt, resultdatasize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp")

public actual fun sLRegisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent")

public actual fun sLSetCurrentProductKey(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pproductkeyid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey")

public actual fun sLSetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation")

public actual fun sLUninstallLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense")

public actual fun sLUninstallProofOfPurchase(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase")

public actual fun sLUnregisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent")

public actual fun saslAcceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext")

public actual fun saslEnumerateProfilesA(profilelist: MutPtr<Pstr>, profilecount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA")

public actual fun saslEnumerateProfilesW(profilelist: MutPtr<Pwstr>, profilecount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW")

public actual fun saslGetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: MutPtr<CVoid>, size: UInt, needed: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW")

public actual fun saslIdentifyPackageA(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA")

public actual fun saslIdentifyPackageW(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW")

public actual fun saslInitializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA")

public actual fun saslInitializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW")

public actual fun saslSetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: ConstPtr<CVoid>, size: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser: Int): Unit

public actual fun sendSAS(asuser: Bool): Unit =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser)

public actual fun setContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA")

public actual fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW")

public actual fun setCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA")

public actual fun setCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW")

public actual fun sslCrackCertificate(pbcertificate: MutPtr<UByte>, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr<MutPtr<X509Certificate>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr<MutPtr<CertContext>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslDeserializeCertificateStore")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW")

public actual fun sslFreeCertificate(pcertificate: MutPtr<X509Certificate>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate")

public actual fun sslGenerateRandomBits(prandomdata: MutPtr<UByte>, crandomdata: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits")

public actual fun sslGetExtensions(clienthello: ConstPtr<UByte>, clienthellobytesize: UInt, genericextensions: MutPtr<SchExtensionData>, genericextensionscount: UByte, bytestoread: MutPtr<UInt>, flags: SchGetExtensionsOptions): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved: Int): Int

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved.toInt()).toUInt()

public actual fun sslGetServerIdentity(clienthello: ConstPtr<UByte>, clienthellosize: UInt, serveridentity: MutPtr<MutPtr<UByte>>, serveridentitysize: MutPtr<UInt>, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity")

public actual fun sspiCompareAuthIdentities(authidentity1: ConstPtr<CVoid>, authidentity2: ConstPtr<CVoid>, samesupplieduser: MutPtr<Boolean>, samesuppliedidentity: MutPtr<Boolean>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities")

public actual fun sspiCopyAuthIdentity(authdata: ConstPtr<CVoid>, authdatacopy: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr<CVoid>, ppszusername: MutPtr<Pcwstr>, ppszdomainname: MutPtr<Pcwstr>, ppszpackedcredentialsstring: MutPtr<Pcwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity")

public actual fun sspiEncryptAuthIdentity(authdata: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx")

public actual fun sspiExcludePackage(authidentity: ConstPtr<CVoid>, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage")

public actual fun sspiFreeAuthIdentity(authdata: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity")

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus: Int): Int

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    (wasiWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus.toInt()) != 0)

public actual fun sspiLocalFree(databuffer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree")

public actual fun sspiMarshalAuthIdentity(authidentity: ConstPtr<CVoid>, authidentitylength: MutPtr<UInt>, authidentitybytearray: MutPtr<MutPtr<Byte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity")

public actual fun sspiPrepareForCredRead(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead")

public actual fun sspiPrepareForCredWrite(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>, ppszcredmanusername: MutPtr<Pcwstr>, ppcredentialblob: MutPtr<MutPtr<UByte>>, pcredentialblobsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW")

public actual fun sspiSetChannelBindingFlags(pbindings: MutPtr<SecPkgContextBindings>, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity")

public actual fun sspiValidateAuthIdentity(authdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity")

public actual fun sspiZeroAuthIdentity(authdata: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings")
private external fun wasiWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings(): Int

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    wasiWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings().toInt()

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding")

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr<CVoid>, tokenbinding: MutPtr<MutPtr<CVoid>>, tokenbindingsize: MutPtr<UInt>, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr<CVoid>, publickeysize: UInt, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri")

public actual fun tokenBindingGenerateMessage(tokenbindings: ConstPtr<ConstPtr<CVoid>>, tokenbindingssize: ConstPtr<UInt>, tokenbindingscount: UInt, tokenbindingmessage: MutPtr<MutPtr<CVoid>>, tokenbindingmessagesize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr<UByte>, minorversion: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion")

public actual fun tokenBindingGetKeyTypesClient(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient")

public actual fun tokenBindingGetKeyTypesServer(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr<CVoid>, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, resultlist: MutPtr<MutPtr<TokenbindingResultList>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW")

public actual fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature")
