@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SecurityAuthenticationIdentityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun acceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pvlogonid.rawAddress.toString(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), phcredential.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pvlogonid.rawAddress.toString(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), phcredential.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsA(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(hcredentials.rawAddress.toString(), pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsW(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(hcredentials.rawAddress.toString(), pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(pszpackagename.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(pszpackagename.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(phcontext.rawAddress.toString(), pinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(psid.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(htokenhandle.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(ppauditcategoriesarray.rawAddress.toString(), pdwcountreturned.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr<MutPtr<PolicyAuditSidArray>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(ppauditsidarray.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr<Guid>, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(pauditcategoryguid.rawAddress.toString(), bretrieveallsubcategories, ppauditsubcategoriesarray.rawAddress.toString(), pdwcountreturned.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditFree(buffer: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr<Guid>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr<Guid>, pauditcategoryid: MutPtr<PolicyAuditEventType>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid.rawAddress.toString(), pauditcategoryid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(pauditcategoryguid.rawAddress.toString(), ppszcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pwstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(pauditcategoryguid.rawAddress.toString(), ppszcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(pauditsubcategoryguid.rawAddress.toString(), ppszsubcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pwstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(pauditsubcategoryguid.rawAddress.toString(), ppszsubcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr<MutPtr<Acl>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr<MutPtr<Acl>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(psid.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr<Acl>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr<Acl>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(psid.rawAddress.toString(), pauditpolicy.rawAddress.toString(), dwpolicycount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSystemPolicy(pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(pauditpolicy.rawAddress.toString(), dwpolicycount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordA(pszpackagename: ConstPtr<Byte>, pszdomainname: ConstPtr<Byte>, pszaccountname: ConstPtr<Byte>, pszoldpassword: ConstPtr<Byte>, psznewpassword: ConstPtr<Byte>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(pszpackagename.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszaccountname.rawAddress.toString(), pszoldpassword.rawAddress.toString(), psznewpassword.rawAddress.toString(), bimpersonating, dwreserved.toInt(), poutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordW(pszpackagename: ConstPtr<UShort>, pszdomainname: ConstPtr<UShort>, pszaccountname: ConstPtr<UShort>, pszoldpassword: ConstPtr<UShort>, psznewpassword: ConstPtr<UShort>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(pszpackagename.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszaccountname.rawAddress.toString(), pszoldpassword.rawAddress.toString(), psznewpassword.rawAddress.toString(), bimpersonating, dwreserved.toInt(), poutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(phcontext.rawAddress.toString(), ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalTargetInfo(intargetinfo: ConstPtr<CredentialTargetInformationw>, buffer: MutPtr<MutPtr<UShort>>, buffersize: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(intargetinfo.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalTargetInfo(buffer: ConstPtr<UShort>, buffersize: UInt, rettargetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>, retactualsize: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(buffer.rawAddress.toString(), buffersize.toInt(), rettargetinfo.rawAddress.toString(), retactualsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptMessage(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(pszpackagename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(pszpackagename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptMessage(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesA(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(pcpackages.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesW(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(pcpackages.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(phcontext.rawAddress.toString(), fflags.toInt(), ppackedcontext.rawAddress.toString(), ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeContextBuffer(pvcontextbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(pvcontextbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeCredentialsHandle(phcredential: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(phcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(pszpackage.rawAddress.toString(), ppackedcontext.rawAddress.toString(), token.rawAddress.toString(), phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(pszpackage.rawAddress.toString(), ppackedcontext.rawAddress.toString(), token.rawAddress.toString(), phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceA(): MutPtr<SecurityFunctionTableA> =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) MutPtr((windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceW(): MutPtr<SecurityFunctionTableW> =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) MutPtr((windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<Byte>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UShort>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), userrights.rawAddress.toString(), countofrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(lsahandle.rawAddress.toString(), authenticationpackage.toInt(), protocolsubmitbuffer.rawAddress.toString(), submitbufferlength.toInt(), protocolreturnbuffer.rawAddress.toString(), returnbufferlength.rawAddress.toString(), protocolstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaConnectUntrusted(lsahandle: MutPtr<Handle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(lsahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr<TrustedDomainInformationEx>, authenticationinformation: ConstPtr<TrustedDomainAuthInformation>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(policyhandle.toString(), trusteddomaininformation.rawAddress.toString(), authenticationinformation.rawAddress.toString(), desiredaccess.toInt(), trusteddomainhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(policyhandle.toString(), trusteddomainsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(lsahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr<MutPtr<LsaUnicodeString>>, countofrights: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), userrights.rawAddress.toString(), countofrights.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr<LsaUnicodeString>, buffer: MutPtr<MutPtr<CVoid>>, countreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(policyhandle.toString(), userright.rawAddress.toString(), buffer.rawAddress.toString(), countreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr<UInt>, logonsessionlist: MutPtr<MutPtr<Luid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(logonsessioncount.rawAddress.toString(), logonsessionlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(policyhandle.toString(), enumerationcontext.rawAddress.toString(), buffer.rawAddress.toString(), preferedmaximumlength.toInt(), countreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(policyhandle.toString(), enumerationcontext.rawAddress.toString(), buffer.rawAddress.toString(), preferedmaximumlength.toInt(), countreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeMemory(buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeReturnBuffer(buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetAppliedCAPIDs(systemname: ConstPtr<LsaUnicodeString>, capids: MutPtr<MutPtr<Psid>>, capidcount: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(systemname.rawAddress.toString(), capids.rawAddress.toString(), capidcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetLogonSessionData(logonid: ConstPtr<Luid>, pplogonsessiondata: MutPtr<MutPtr<SecurityLogonSessionData>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(logonid.rawAddress.toString(), pplogonsessiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr<LsaString>, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr<CVoid>, authenticationinformationlength: UInt, localgroups: ConstPtr<TokenGroups>, sourcecontext: ConstPtr<TokenSource>, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebufferlength: MutPtr<UInt>, logonid: MutPtr<Luid>, token: MutPtr<Handle>, quotas: MutPtr<QuotaLimits>, substatus: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr<LsaString>, authenticationpackage: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(lsahandle.rawAddress.toString(), packagename.rawAddress.toString(), authenticationpackage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(policyhandle.toString(), count.toInt(), names.rawAddress.toString(), referenceddomains.rawAddress.toString(), sids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid2>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(policyhandle.toString(), flags.toInt(), count.toInt(), names.rawAddress.toString(), referenceddomains.rawAddress.toString(), sids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(policyhandle.toString(), count.toInt(), sids.rawAddress.toString(), referenceddomains.rawAddress.toString(), names.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(policyhandle.toString(), lookupoptions.toInt(), count.toInt(), sids.rawAddress.toString(), referenceddomains.rawAddress.toString(), names.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenPolicy(systemname: ConstPtr<LsaUnicodeString>, objectattributes: ConstPtr<LsaObjectAttributes>, desiredaccess: UInt, policyhandle: MutPtr<LsaHandle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(systemname.rawAddress.toString(), objectattributes.rawAddress.toString(), desiredaccess.toInt(), policyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), desiredaccess.toInt(), trusteddomainhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryCAPs(capids: ConstPtr<Psid>, capidcount: UInt, caps: MutPtr<MutPtr<CentralAccessPolicy>>, capcount: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(capids.rawAddress.toString(), capidcount.toInt(), caps.rawAddress.toString(), capcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(policyhandle.toString(), trusteddomainname.rawAddress.toString(), foresttrustinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation2>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(policyhandle.toString(), trusteddomainname.rawAddress.toString(), highestrecordtype, foresttrustinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(policyhandle.toString(), trusteddomainsid.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterLogonProcess(logonprocessname: ConstPtr<LsaString>, lsahandle: MutPtr<Handle>, securitymode: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(logonprocessname.rawAddress.toString(), lsahandle.rawAddress.toString(), securitymode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), allrights, userrights.rawAddress.toString(), countofrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: MutPtr<MutPtr<LsaUnicodeString>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(policyhandle.toString(), keyname.rawAddress.toString(), privatedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetCAPs(capdns: ConstPtr<LsaUnicodeString>, capdncount: UInt, flags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(capdns.rawAddress.toString(), capdncount.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: ConstPtr<LsaForestTrustInformation>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(policyhandle.toString(), trusteddomainname.rawAddress.toString(), foresttrustinfo.rawAddress.toString(), checkonly, collisioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr<LsaForestTrustInformation2>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(policyhandle.toString(), trusteddomainname.rawAddress.toString(), highestrecordtype, foresttrustinfo.rawAddress.toString(), checkonly, collisioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(policyhandle.toString(), trusteddomainsid.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: ConstPtr<LsaUnicodeString>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(policyhandle.toString(), keyname.rawAddress.toString(), privatedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(phcontext.rawAddress.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(pszpackagename.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(pszpackagename.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(memory.rawAddress.toString(), memorysize.toInt(), optionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEncryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(memory.rawAddress.toString(), memorysize.toInt(), optionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenRandom(randombuffer: MutPtr<CVoid>, randombufferlength: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(randombuffer.rawAddress.toString(), randombufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLAcquireGenuineTicket(ppticketblob: MutPtr<MutPtr<CVoid>>, pcbticketblob: MutPtr<UInt>, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(ppticketblob.rawAddress.toString(), pcbticketblob.rawAddress.toString(), pwsztemplateid.rawAddress.toString(), pwszserverurl.rawAddress.toString(), pwszclienttoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLActivateProduct(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, cbappspecificdata: UInt, pvappspecificdata: ConstPtr<CVoid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), cbappspecificdata.toInt(), pvappspecificdata.rawAddress.toString(), pactivationinfo.rawAddress.toString(), pwszproxyserver.rawAddress.toString(), wproxyport.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLClose(hslc: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(hslc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLConsumeRight(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(hslc.rawAddress.toString(), pappid.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszrightname.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszinstallationid.rawAddress.toString(), pwszconfirmationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pactivationinfo.rawAddress.toString(), pwszinstallationid.rawAddress.toString(), pwszconfirmationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLFireEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, ppwszinstallationid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), ppwszinstallationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, ppwszinstallationid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pactivationinfo.rawAddress.toString(), ppwszinstallationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetApplicationInformation(hslc: ConstPtr<CVoid>, papplicationid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(hslc.rawAddress.toString(), papplicationid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(pqueryid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetInstalledProductKeyIds(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pnproductkeyids: MutPtr<UInt>, ppproductkeyids: MutPtr<MutPtr<Guid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pnproductkeyids.rawAddress.toString(), ppproductkeyids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>, pcblicensefile: MutPtr<UInt>, ppblicensefile: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(hslc.rawAddress.toString(), plicensefileid.rawAddress.toString(), pcblicensefile.rawAddress.toString(), ppblicensefile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseFileId(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(hslc.rawAddress.toString(), cblicenseblob.toInt(), pblicenseblob.rawAddress.toString(), plicensefileid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseInformation(hslc: ConstPtr<CVoid>, psllicenseid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(hslc.rawAddress.toString(), psllicenseid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicensingStatusInformation(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pnstatuscount: MutPtr<UInt>, pplicensingstatus: MutPtr<MutPtr<SlLicensingStatus>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(hslc.rawAddress.toString(), pappid.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszrightname.rawAddress.toString(), pnstatuscount.rawAddress.toString(), pplicensingstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyId(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(hslc.rawAddress.toString(), pwszpkeyalgorithm.rawAddress.toString(), pwszpkeystring.rawAddress.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress.toString(), ppkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyInformation(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(hslc.rawAddress.toString(), ppkeyid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformationDWORD(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetProductSkuInformation(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetReferralInformation(hslc: ConstPtr<CVoid>, ereferraltype: Slreferraltype, pskuorappid: ConstPtr<Guid>, pwszvaluename: Pcwstr, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(hslc.rawAddress.toString(), ereferraltype, pskuorappid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetSLIDList(hslc: ConstPtr<CVoid>, equeryidtype: Slidtype, pqueryid: ConstPtr<Guid>, ereturnidtype: Slidtype, pnreturnids: MutPtr<UInt>, ppreturnids: MutPtr<MutPtr<Guid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(hslc.rawAddress.toString(), equeryidtype, pqueryid.rawAddress.toString(), ereturnidtype, pnreturnids.rawAddress.toString(), ppreturnids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr<Hresult>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(pwszserverurl.rawAddress.toString(), pwszacquisitiontype.rawAddress.toString(), pwszproxyserver.rawAddress.toString(), wproxyport.toInt(), phrstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServiceInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(pwszvaluename.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallLicense(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(hslc.rawAddress.toString(), cblicenseblob.toInt(), pblicenseblob.rawAddress.toString(), plicensefileid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallProofOfPurchase(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(hslc.rawAddress.toString(), pwszpkeyalgorithm.rawAddress.toString(), pwszpkeystring.rawAddress.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress.toString(), ppkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLIsGenuineLocal(pappid: ConstPtr<Guid>, pgenuinestate: MutPtr<SlGenuineState>, puioptions: MutPtr<SlNongenuineUiOptions>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(pappid.rawAddress.toString(), pgenuinestate.rawAddress.toString(), puioptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLOpen(phslc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(phslc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr<UInt>, databuffer: MutPtr<CVoid>, datasize: UInt, resultdatasize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(valuename.rawAddress.toString(), valuetype.rawAddress.toString(), databuffer.rawAddress.toString(), datasize.toInt(), resultdatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLRegisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetCurrentProductKey(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pproductkeyid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pproductkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(pqueryid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), edatatype.toInt(), cbvalue.toInt(), pbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(hslc.rawAddress.toString(), plicensefileid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallProofOfPurchase(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(hslc.rawAddress.toString(), ppkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUnregisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslAcceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesA(profilelist: MutPtr<Pstr>, profilecount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(profilelist.rawAddress.toString(), profilecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesW(profilelist: MutPtr<Pwstr>, profilecount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(profilelist.rawAddress.toString(), profilecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: MutPtr<CVoid>, size: UInt, needed: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(contexthandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString(), size.toInt(), needed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(profilename.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(profilename.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageA(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(pinput.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageW(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(pinput.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslSetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: ConstPtr<CVoid>, size: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(contexthandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSAS(asuser: Bool) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCrackCertificate(pbcertificate: MutPtr<UByte>, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr<MutPtr<X509Certificate>>): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(pbcertificate.rawAddress.toString(), cbcertificate.toInt(), dwflags.toInt(), ppcertificate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr<MutPtr<CertContext>>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(psztargetname.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(psztargetname.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeCertificate(pcertificate: MutPtr<X509Certificate>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(pcertificate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGenerateRandomBits(prandomdata: MutPtr<UByte>, crandomdata: Int) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(prandomdata.rawAddress.toString(), crandomdata)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGetExtensions(clienthello: ConstPtr<UByte>, clienthellobytesize: UInt, genericextensions: MutPtr<SchExtensionData>, genericextensionscount: UByte, bytestoread: MutPtr<UInt>, flags: SchGetExtensionsOptions): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(clienthello.rawAddress.toString(), clienthellobytesize.toInt(), genericextensions.rawAddress.toString(), genericextensionscount.toInt(), bytestoread.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetServerIdentity(clienthello: ConstPtr<UByte>, clienthellosize: UInt, serveridentity: MutPtr<MutPtr<UByte>>, serveridentitysize: MutPtr<UInt>, flags: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(clienthello.rawAddress.toString(), clienthellosize.toInt(), serveridentity.rawAddress.toString(), serveridentitysize.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCompareAuthIdentities(authidentity1: ConstPtr<CVoid>, authidentity2: ConstPtr<CVoid>, samesupplieduser: MutPtr<Boolean>, samesuppliedidentity: MutPtr<Boolean>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(authidentity1.rawAddress.toString(), authidentity2.rawAddress.toString(), samesupplieduser.rawAddress.toString(), samesuppliedidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCopyAuthIdentity(authdata: ConstPtr<CVoid>, authdatacopy: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(authdata.rawAddress.toString(), authdatacopy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(encryptedauthdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(options.toInt(), encryptedauthdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr<CVoid>, ppszusername: MutPtr<Pcwstr>, ppszdomainname: MutPtr<Pcwstr>, ppszpackedcredentialsstring: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(pauthidentity.rawAddress.toString(), ppszusername.rawAddress.toString(), ppszdomainname.rawAddress.toString(), ppszpackedcredentialsstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(pszusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszpackedcredentialsstring.rawAddress.toString(), ppauthidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentity(authdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(authdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(options.toInt(), authdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiExcludePackage(authidentity: ConstPtr<CVoid>, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(authidentity.rawAddress.toString(), pszpackagename.rawAddress.toString(), ppnewauthidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAuthIdentity(authdata: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(authdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(psztargetname.rawAddress.toString(), pszhostname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr<CVoid>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(encryptedauthdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiLocalFree(databuffer: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(databuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiMarshalAuthIdentity(authidentity: ConstPtr<CVoid>, authidentitylength: MutPtr<UInt>, authidentitybytearray: MutPtr<MutPtr<Byte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(authidentity.rawAddress.toString(), authidentitylength.rawAddress.toString(), authidentitybytearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredRead(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(authidentity.rawAddress.toString(), psztargetname.rawAddress.toString(), pcredmancredentialtype.rawAddress.toString(), ppszcredmantargetname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredWrite(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>, ppszcredmanusername: MutPtr<Pcwstr>, ppcredentialblob: MutPtr<MutPtr<UByte>>, pcredentialblobsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(authidentity.rawAddress.toString(), psztargetname.rawAddress.toString(), pcredmancredentialtype.rawAddress.toString(), ppszcredmantargetname.rawAddress.toString(), ppszcredmanusername.rawAddress.toString(), ppcredentialblob.rawAddress.toString(), pcredentialblobsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(psztargetname.rawAddress.toString(), puiinfo.rawAddress.toString(), dwautherror.toInt(), pszpackage.rawAddress.toString(), pinputauthidentity.rawAddress.toString(), ppauthidentity.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(psztargetname.rawAddress.toString(), puiinfo.rawAddress.toString(), dwautherror.toInt(), pszpackage.rawAddress.toString(), pinputauthidentity.rawAddress.toString(), ppauthidentity.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetChannelBindingFlags(pbindings: MutPtr<SecPkgContextBindings>, flags: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(pbindings.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(authidentitylength.toInt(), authidentitybytearray.rawAddress.toString(), ppauthidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiValidateAuthIdentity(authdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(authdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiZeroAuthIdentity(authdata: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(authdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(targeturl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr<CVoid>, tokenbinding: MutPtr<MutPtr<CVoid>>, tokenbindingsize: MutPtr<UInt>, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(keytype, targeturl.rawAddress.toString(), bindingtype, tlsekm.rawAddress.toString(), tlsekmsize.toInt(), extensionformat, extensiondata.rawAddress.toString(), tokenbinding.rawAddress.toString(), tokenbindingsize.rawAddress.toString(), resultdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr<CVoid>, publickeysize: UInt, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(keytype, publickey.rawAddress.toString(), publickeysize.toInt(), resultdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(keytype, targeturi.rawAddress.toString(), resultdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateMessage(tokenbindings: ConstPtr<ConstPtr<CVoid>>, tokenbindingssize: ConstPtr<UInt>, tokenbindingscount: UInt, tokenbindingmessage: MutPtr<MutPtr<CVoid>>, tokenbindingmessagesize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(tokenbindings.rawAddress.toString(), tokenbindingssize.rawAddress.toString(), tokenbindingscount.toInt(), tokenbindingmessage.rawAddress.toString(), tokenbindingmessagesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr<UByte>, minorversion: MutPtr<UByte>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(majorversion.rawAddress.toString(), minorversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesClient(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(keytypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesServer(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(keytypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr<CVoid>, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, resultlist: MutPtr<MutPtr<TokenbindingResultList>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(tokenbindingmessage.rawAddress.toString(), tokenbindingmessagesize.toInt(), keytype, tlsekm.rawAddress.toString(), tlsekmsize.toInt(), resultlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(lpaccountname.rawAddress.toString(), accountnameformat, desirednameformat, lptranslatedname.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(lpaccountname.rawAddress.toString(), accountnameformat, desirednameformat, lptranslatedname.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
