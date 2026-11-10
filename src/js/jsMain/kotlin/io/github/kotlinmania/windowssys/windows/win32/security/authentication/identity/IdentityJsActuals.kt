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

private val _windowsWin32SecurityAuthenticationIdentityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun acceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_acceptSecurityContext((phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (pinput?.value ?: 0L).toString(), fcontextreq.toInt(), targetdatarep.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleA((pszprincipal?.value ?: 0L).toString(), (pszpackage?.value ?: 0L).toString(), fcredentialuse.toInt(), (pvlogonid?.value ?: 0L).toString(), (pauthdata?.value ?: 0L).toString(), 0L.toString(), (pvgetkeyargument?.value ?: 0L).toString(), (phcredential?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleW((pszprincipal?.value ?: 0L).toString(), (pszpackage?.value ?: 0L).toString(), fcredentialuse.toInt(), (pvlogonid?.value ?: 0L).toString(), (pauthdata?.value ?: 0L).toString(), 0L.toString(), (pvgetkeyargument?.value ?: 0L).toString(), (phcredential?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsA(hcredentials: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_addCredentialsA((hcredentials?.value ?: 0L).toString(), (pszprincipal?.value ?: 0L).toString(), (pszpackage?.value ?: 0L).toString(), fcredentialuse.toInt(), (pauthdata?.value ?: 0L).toString(), 0L.toString(), (pvgetkeyargument?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsW(hcredentials: COpaquePointer?, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_addCredentialsW((hcredentials?.value ?: 0L).toString(), (pszprincipal?.value ?: 0L).toString(), (pszpackage?.value ?: 0L).toString(), fcredentialuse.toInt(), (pauthdata?.value ?: 0L).toString(), 0L.toString(), (pvgetkeyargument?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_addSecurityPackageA((pszpackagename?.value ?: 0L).toString(), (poptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_addSecurityPackageW((pszpackagename?.value ?: 0L).toString(), (poptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_applyControlToken((phcontext?.value ?: 0L).toString(), (pinput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyBySid((psid?.value ?: 0L).toString(), (psubcategoryguids?.value ?: 0L).toString(), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyByToken((htokenhandle?.value ?: 0L).toString(), (psubcategoryguids?.value ?: 0L).toString(), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditEnumerateCategories((ppauditcategoriesarray?.value ?: 0L).toString(), (pdwcountreturned?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditEnumeratePerUserPolicy((ppauditsidarray?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: COpaquePointer?, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditEnumerateSubCategories((pauditcategoryguid?.value ?: 0L).toString(), bretrieveallsubcategories, (ppauditsubcategoriesarray?.value ?: 0L).toString(), (pdwcountreturned?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditFree(buffer: COpaquePointer?) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditFree((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryGuidFromCategoryId(auditcategoryid, (pauditcategoryguid?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: COpaquePointer?, pauditcategoryid: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryIdFromCategoryGuid((pauditcategoryguid?.value ?: 0L).toString(), (pauditcategoryid?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameA((pauditcategoryguid?.value ?: 0L).toString(), (ppszcategoryname?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameW((pauditcategoryguid?.value ?: 0L).toString(), (ppszcategoryname?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameA((pauditsubcategoryguid?.value ?: 0L).toString(), (ppszsubcategoryname?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameW((pauditsubcategoryguid?.value ?: 0L).toString(), (ppszsubcategoryname?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclA((objecttypename?.value ?: 0L).toString(), (acl?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclW((objecttypename?.value ?: 0L).toString(), (acl?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditQueryPerUserPolicy((psid?.value ?: 0L).toString(), (psubcategoryguids?.value ?: 0L).toString(), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditQuerySecurity(securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySystemPolicy(psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditQuerySystemPolicy((psubcategoryguids?.value ?: 0L).toString(), dwpolicycount.toInt(), (ppauditpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclA((objecttypename?.value ?: 0L).toString(), (acl?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclW((objecttypename?.value ?: 0L).toString(), (acl?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditSetPerUserPolicy((psid?.value ?: 0L).toString(), (pauditpolicy?.value ?: 0L).toString(), dwpolicycount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditSetSecurity(securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSystemPolicy(pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_auditSetSystemPolicy((pauditpolicy?.value ?: 0L).toString(), dwpolicycount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordA(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_changeAccountPasswordA((pszpackagename?.value ?: 0L).toString(), (pszdomainname?.value ?: 0L).toString(), (pszaccountname?.value ?: 0L).toString(), (pszoldpassword?.value ?: 0L).toString(), (psznewpassword?.value ?: 0L).toString(), bimpersonating, dwreserved.toInt(), (poutput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordW(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_changeAccountPasswordW((pszpackagename?.value ?: 0L).toString(), (pszdomainname?.value ?: 0L).toString(), (pszaccountname?.value ?: 0L).toString(), (pszoldpassword?.value ?: 0L).toString(), (psznewpassword?.value ?: 0L).toString(), bimpersonating, dwreserved.toInt(), (poutput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_completeAuthToken((phcontext?.value ?: 0L).toString(), (ptoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalTargetInfo(intargetinfo: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_credMarshalTargetInfo((intargetinfo?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalTargetInfo(buffer: COpaquePointer?, buffersize: UInt, rettargetinfo: COpaquePointer?, retactualsize: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_credUnmarshalTargetInfo((buffer?.value ?: 0L).toString(), buffersize.toInt(), (rettargetinfo?.value ?: 0L).toString(), (retactualsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptMessage(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_decryptMessage((phcontext?.value ?: 0L).toString(), (pmessage?.value ?: 0L).toString(), messageseqno.toInt(), (pfqop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityContext(phcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_deleteSecurityContext((phcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageA((pszpackagename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageW((pszpackagename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptMessage(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_encryptMessage((phcontext?.value ?: 0L).toString(), fqop.toInt(), (pmessage?.value ?: 0L).toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesA(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesA((pcpackages?.value ?: 0L).toString(), (pppackageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesW(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesW((pcpackages?.value ?: 0L).toString(), (pppackageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: ExportSecurityContextFlags, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_exportSecurityContext((phcontext?.value ?: 0L).toString(), fflags.toInt(), (ppackedcontext?.value ?: 0L).toString(), (ptoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeContextBuffer(pvcontextbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_freeContextBuffer((pvcontextbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeCredentialsHandle(phcredential: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_freeCredentialsHandle((phcredential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_getComputerObjectNameA(nameformat, (lpnamebuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_getComputerObjectNameW(nameformat, (lpnamebuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_getUserNameExA(nameformat, (lpnamebuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_getUserNameExW(nameformat, (lpnamebuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSecurityContext(phcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_impersonateSecurityContext((phcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_importSecurityContextA((pszpackage?.value ?: 0L).toString(), (ppackedcontext?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_importSecurityContextW((pszpackage?.value ?: 0L).toString(), (ppackedcontext?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceA(): COpaquePointer? =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceA() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceW(): COpaquePointer? =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceW() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_initializeSecurityContextA((phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L).toString(), reserved2.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_initializeSecurityContextW((phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L).toString(), reserved2.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaAddAccountRights(policyhandle.toString(), (accountsid?.value ?: 0L).toString(), (userrights?.value ?: 0L).toString(), countofrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaCallAuthenticationPackage((lsahandle?.value ?: 0L).toString(), authenticationpackage.toInt(), (protocolsubmitbuffer?.value ?: 0L).toString(), submitbufferlength.toInt(), (protocolreturnbuffer?.value ?: 0L).toString(), (returnbufferlength?.value ?: 0L).toString(), (protocolstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaClose(objecthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaConnectUntrusted(lsahandle: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaConnectUntrusted((lsahandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: COpaquePointer?, authenticationinformation: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaCreateTrustedDomainEx(policyhandle.toString(), (trusteddomaininformation?.value ?: 0L).toString(), (authenticationinformation?.value ?: 0L).toString(), desiredaccess.toInt(), (trusteddomainhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaDeleteTrustedDomain(policyhandle.toString(), (trusteddomainsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaDeregisterLogonProcess((lsahandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountRights(policyhandle.toString(), (accountsid?.value ?: 0L).toString(), (userrights?.value ?: 0L).toString(), (countofrights?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: COpaquePointer?, buffer: COpaquePointer?, countreturned: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountsWithUserRight(policyhandle.toString(), (userright?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (countreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: COpaquePointer?, logonsessionlist: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaEnumerateLogonSessions((logonsessioncount?.value ?: 0L).toString(), (logonsessionlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomains(policyhandle.toString(), (enumerationcontext?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), preferedmaximumlength.toInt(), (countreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomainsEx(policyhandle.toString(), (enumerationcontext?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), preferedmaximumlength.toInt(), (countreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeMemory(buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaFreeMemory((buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeReturnBuffer(buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaFreeReturnBuffer((buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetAppliedCAPIDs(systemname: COpaquePointer?, capids: COpaquePointer?, capidcount: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaGetAppliedCAPIDs((systemname?.value ?: 0L).toString(), (capids?.value ?: 0L).toString(), (capidcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetLogonSessionData(logonid: COpaquePointer?, pplogonsessiondata: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaGetLogonSessionData((logonid?.value ?: 0L).toString(), (pplogonsessiondata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLogonUser(lsahandle: Handle, originname: COpaquePointer?, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: COpaquePointer?, authenticationinformationlength: UInt, localgroups: COpaquePointer?, sourcecontext: COpaquePointer?, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, token: COpaquePointer?, quotas: COpaquePointer?, substatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: COpaquePointer?, authenticationpackage: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaLookupAuthenticationPackage((lsahandle?.value ?: 0L).toString(), (packagename?.value ?: 0L).toString(), (authenticationpackage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaLookupNames(policyhandle.toString(), count.toInt(), (names?.value ?: 0L).toString(), (referenceddomains?.value ?: 0L).toString(), (sids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaLookupNames2(policyhandle.toString(), flags.toInt(), count.toInt(), (names?.value ?: 0L).toString(), (referenceddomains?.value ?: 0L).toString(), (sids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaLookupSids(policyhandle.toString(), count.toInt(), (sids?.value ?: 0L).toString(), (referenceddomains?.value ?: 0L).toString(), (names?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaLookupSids2(policyhandle.toString(), lookupoptions.toInt(), count.toInt(), (sids?.value ?: 0L).toString(), (referenceddomains?.value ?: 0L).toString(), (names?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaNtStatusToWinError(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenPolicy(systemname: COpaquePointer?, objectattributes: COpaquePointer?, desiredaccess: UInt, policyhandle: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaOpenPolicy((systemname?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), desiredaccess.toInt(), (policyhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaOpenTrustedDomainByName(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), desiredaccess.toInt(), (trusteddomainhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryCAPs(capids: COpaquePointer?, capidcount: UInt, caps: COpaquePointer?, capcount: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryCAPs((capids?.value ?: 0L).toString(), capidcount.toInt(), (caps?.value ?: 0L).toString(), (capcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryDomainInformationPolicy(policyhandle.toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), (foresttrustinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation2(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), highestrecordtype, (foresttrustinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryInformationPolicy(policyhandle.toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfo(policyhandle.toString(), (trusteddomainsid?.value ?: 0L).toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfoByName(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterLogonProcess(logonprocessname: COpaquePointer?, lsahandle: COpaquePointer?, securitymode: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaRegisterLogonProcess((logonprocessname?.value ?: 0L).toString(), (lsahandle?.value ?: 0L).toString(), (securitymode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaRegisterPolicyChangeNotification(informationclass, (notificationeventhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaRemoveAccountRights(policyhandle.toString(), (accountsid?.value ?: 0L).toString(), allrights, (userrights?.value ?: 0L).toString(), countofrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaRetrievePrivateData(policyhandle.toString(), (keyname?.value ?: 0L).toString(), (privatedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetCAPs(capdns: COpaquePointer?, capdncount: UInt, flags: UInt): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetCAPs((capdns?.value ?: 0L).toString(), capdncount.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetDomainInformationPolicy(policyhandle.toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), (foresttrustinfo?.value ?: 0L).toString(), checkonly, (collisioninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation2(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), highestrecordtype, (foresttrustinfo?.value ?: 0L).toString(), checkonly, (collisioninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetInformationPolicy(policyhandle.toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInfoByName(policyhandle.toString(), (trusteddomainname?.value ?: 0L).toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInformation(policyhandle.toString(), (trusteddomainsid?.value ?: 0L).toString(), informationclass, (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaStorePrivateData(policyhandle.toString(), (keyname?.value ?: 0L).toString(), (privatedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_lsaUnregisterPolicyChangeNotification(informationclass, (notificationeventhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_makeSignature((phcontext?.value ?: 0L).toString(), fqop.toInt(), (pmessage?.value ?: 0L).toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryContextAttributesA((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryContextAttributesExA((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryContextAttributesExW((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryContextAttributesW((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesA((phcredential?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExA((phcredential?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExW((phcredential?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesW((phcredential?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_querySecurityContextToken((phcontext?.value ?: 0L).toString(), (token?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoA((pszpackagename?.value ?: 0L).toString(), (pppackageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoW((pszpackagename?.value ?: 0L).toString(), (pppackageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertSecurityContext(phcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_revertSecurityContext((phcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_rtlDecryptMemory((memory?.value ?: 0L).toString(), memorysize.toInt(), optionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEncryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_rtlEncryptMemory((memory?.value ?: 0L).toString(), memorysize.toInt(), optionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenRandom(randombuffer: COpaquePointer?, randombufferlength: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_rtlGenRandom((randombuffer?.value ?: 0L).toString(), randombufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLAcquireGenuineTicket(ppticketblob: COpaquePointer?, pcbticketblob: COpaquePointer?, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLAcquireGenuineTicket((ppticketblob?.value ?: 0L).toString(), (pcbticketblob?.value ?: 0L).toString(), (pwsztemplateid?.value ?: 0L).toString(), (pwszserverurl?.value ?: 0L).toString(), (pwszclienttoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLActivateProduct(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, cbappspecificdata: UInt, pvappspecificdata: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLActivateProduct((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), cbappspecificdata.toInt(), (pvappspecificdata?.value ?: 0L).toString(), (pactivationinfo?.value ?: 0L).toString(), (pwszproxyserver?.value ?: 0L).toString(), wproxyport.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLClose(hslc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLClose((hslc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLConsumeRight(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLConsumeRight((hslc?.value ?: 0L).toString(), (pappid?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pwszrightname?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationId((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pwszinstallationid?.value ?: 0L).toString(), (pwszconfirmationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationIdEx((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pactivationinfo?.value ?: 0L).toString(), (pwszinstallationid?.value ?: 0L).toString(), (pwszconfirmationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLFireEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLFireEvent((hslc?.value ?: 0L).toString(), (pwszeventid?.value ?: 0L).toString(), (papplicationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationId((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (ppwszinstallationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationIdEx((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pactivationinfo?.value ?: 0L).toString(), (ppwszinstallationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetApplicationInformation(hslc: COpaquePointer?, papplicationid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetApplicationInformation((hslc?.value ?: 0L).toString(), (papplicationid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetGenuineInformation((pqueryid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetInstalledProductKeyIds(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pnproductkeyids: COpaquePointer?, ppproductkeyids: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetInstalledProductKeyIds((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pnproductkeyids?.value ?: 0L).toString(), (ppproductkeyids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?, pcblicensefile: COpaquePointer?, ppblicensefile: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetLicense((hslc?.value ?: 0L).toString(), (plicensefileid?.value ?: 0L).toString(), (pcblicensefile?.value ?: 0L).toString(), (ppblicensefile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseFileId(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetLicenseFileId((hslc?.value ?: 0L).toString(), cblicenseblob.toInt(), (pblicenseblob?.value ?: 0L).toString(), (plicensefileid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseInformation(hslc: COpaquePointer?, psllicenseid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetLicenseInformation((hslc?.value ?: 0L).toString(), (psllicenseid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicensingStatusInformation(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pnstatuscount: COpaquePointer?, pplicensingstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetLicensingStatusInformation((hslc?.value ?: 0L).toString(), (pappid?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pwszrightname?.value ?: 0L).toString(), (pnstatuscount?.value ?: 0L).toString(), (pplicensingstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyId(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetPKeyId((hslc?.value ?: 0L).toString(), (pwszpkeyalgorithm?.value ?: 0L).toString(), (pwszpkeystring?.value ?: 0L).toString(), cbpkeyspecificdata.toInt(), (pbpkeyspecificdata?.value ?: 0L).toString(), (ppkeyid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyInformation(hslc: COpaquePointer?, ppkeyid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetPKeyInformation((hslc?.value ?: 0L).toString(), (ppkeyid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformation((hslc?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformationDWORD(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformationDWORD((hslc?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pdwvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetProductSkuInformation(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetProductSkuInformation((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetReferralInformation(hslc: COpaquePointer?, ereferraltype: Slreferraltype, pskuorappid: COpaquePointer?, pwszvaluename: Pcwstr, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetReferralInformation((hslc?.value ?: 0L).toString(), ereferraltype, (pskuorappid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetSLIDList(hslc: COpaquePointer?, equeryidtype: Slidtype, pqueryid: COpaquePointer?, ereturnidtype: Slidtype, pnreturnids: COpaquePointer?, ppreturnids: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetSLIDList((hslc?.value ?: 0L).toString(), equeryidtype, (pqueryid?.value ?: 0L).toString(), ereturnidtype, (pnreturnids?.value ?: 0L).toString(), (ppreturnids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetServerStatus((pwszserverurl?.value ?: 0L).toString(), (pwszacquisitiontype?.value ?: 0L).toString(), (pwszproxyserver?.value ?: 0L).toString(), wproxyport.toInt(), (phrstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServiceInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetServiceInformation((hslc?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformation((pwszvaluename?.value ?: 0L).toString(), (pedatatype?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformationDWORD((pwszvaluename?.value ?: 0L).toString(), (pdwvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallLicense(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLInstallLicense((hslc?.value ?: 0L).toString(), cblicenseblob.toInt(), (pblicenseblob?.value ?: 0L).toString(), (plicensefileid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallProofOfPurchase(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLInstallProofOfPurchase((hslc?.value ?: 0L).toString(), (pwszpkeyalgorithm?.value ?: 0L).toString(), (pwszpkeystring?.value ?: 0L).toString(), cbpkeyspecificdata.toInt(), (pbpkeyspecificdata?.value ?: 0L).toString(), (ppkeyid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLIsGenuineLocal(pappid: COpaquePointer?, pgenuinestate: COpaquePointer?, puioptions: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLIsGenuineLocal((pappid?.value ?: 0L).toString(), (pgenuinestate?.value ?: 0L).toString(), (puioptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLOpen(phslc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLOpen((phslc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: COpaquePointer?, databuffer: COpaquePointer?, datasize: UInt, resultdatasize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLQueryLicenseValueFromApp((valuename?.value ?: 0L).toString(), (valuetype?.value ?: 0L).toString(), (databuffer?.value ?: 0L).toString(), datasize.toInt(), (resultdatasize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLRegisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLRegisterEvent((hslc?.value ?: 0L).toString(), (pwszeventid?.value ?: 0L).toString(), (papplicationid?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetCurrentProductKey(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pproductkeyid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLSetCurrentProductKey((hslc?.value ?: 0L).toString(), (pproductskuid?.value ?: 0L).toString(), (pproductkeyid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLSetGenuineInformation((pqueryid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), edatatype.toInt(), cbvalue.toInt(), (pbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLUninstallLicense((hslc?.value ?: 0L).toString(), (plicensefileid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallProofOfPurchase(hslc: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLUninstallProofOfPurchase((hslc?.value ?: 0L).toString(), (ppkeyid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUnregisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sLUnregisterEvent((hslc?.value ?: 0L).toString(), (pwszeventid?.value ?: 0L).toString(), (papplicationid?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslAcceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslAcceptSecurityContext((phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (pinput?.value ?: 0L).toString(), fcontextreq.toInt(), targetdatarep.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesA(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesA((profilelist?.value ?: 0L).toString(), (profilecount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesW(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesW((profilelist?.value ?: 0L).toString(), (profilecount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt, needed: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslGetContextOption((contexthandle?.value ?: 0L).toString(), option.toInt(), (value?.value ?: 0L).toString(), size.toInt(), (needed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageA((profilename?.value ?: 0L).toString(), (packageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageW((profilename?.value ?: 0L).toString(), (packageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageA(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageA((pinput?.value ?: 0L).toString(), (packageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageW(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageW((pinput?.value ?: 0L).toString(), (packageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextA((phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L).toString(), reserved2.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextW((phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L).toString(), reserved2.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslSetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_saslSetContextOption((contexthandle?.value ?: 0L).toString(), option.toInt(), (value?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSAS(asuser: Bool) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sendSAS(asuser)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_setContextAttributesA((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_setContextAttributesW((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesA((phcredential?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesW((phcredential?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCrackCertificate(pbcertificate: COpaquePointer?, cbcertificate: UInt, dwflags: UInt, ppcertificate: COpaquePointer?): Bool =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslCrackCertificate((pbcertificate?.value ?: 0L).toString(), cbcertificate.toInt(), dwflags.toInt(), (ppcertificate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslEmptyCacheA((psztargetname?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslEmptyCacheW((psztargetname?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeCertificate(pcertificate: COpaquePointer?) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslFreeCertificate((pcertificate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGenerateRandomBits(prandomdata: COpaquePointer?, crandomdata: Int) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslGenerateRandomBits((prandomdata?.value ?: 0L).toString(), crandomdata)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGetExtensions(clienthello: COpaquePointer?, clienthellobytesize: UInt, genericextensions: COpaquePointer?, genericextensionscount: UByte, bytestoread: COpaquePointer?, flags: SchGetExtensionsOptions): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslGetExtensions((clienthello?.value ?: 0L).toString(), clienthellobytesize.toInt(), (genericextensions?.value ?: 0L).toString(), genericextensionscount.toInt(), (bytestoread?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslGetMaximumKeySize(reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetServerIdentity(clienthello: COpaquePointer?, clienthellosize: UInt, serveridentity: COpaquePointer?, serveridentitysize: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sslGetServerIdentity((clienthello?.value ?: 0L).toString(), clienthellosize.toInt(), (serveridentity?.value ?: 0L).toString(), (serveridentitysize?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCompareAuthIdentities(authidentity1: COpaquePointer?, authidentity2: COpaquePointer?, samesupplieduser: COpaquePointer?, samesuppliedidentity: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiCompareAuthIdentities((authidentity1?.value ?: 0L).toString(), (authidentity2?.value ?: 0L).toString(), (samesupplieduser?.value ?: 0L).toString(), (samesuppliedidentity?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCopyAuthIdentity(authdata: COpaquePointer?, authdatacopy: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiCopyAuthIdentity((authdata?.value ?: 0L).toString(), (authdatacopy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentity((encryptedauthdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentityEx(options.toInt(), (encryptedauthdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: COpaquePointer?, ppszusername: COpaquePointer?, ppszdomainname: COpaquePointer?, ppszpackedcredentialsstring: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiEncodeAuthIdentityAsStrings((pauthidentity?.value ?: 0L).toString(), (ppszusername?.value ?: 0L).toString(), (ppszdomainname?.value ?: 0L).toString(), (ppszpackedcredentialsstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiEncodeStringsAsAuthIdentity((pszusername?.value ?: 0L).toString(), (pszdomainname?.value ?: 0L).toString(), (pszpackedcredentialsstring?.value ?: 0L).toString(), (ppauthidentity?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentity(authdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentity((authdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentityEx(options.toInt(), (authdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiExcludePackage(authidentity: COpaquePointer?, pszpackagename: Pcwstr, ppnewauthidentity: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiExcludePackage((authidentity?.value ?: 0L).toString(), (pszpackagename?.value ?: 0L).toString(), (ppnewauthidentity?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAuthIdentity(authdata: COpaquePointer?) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiFreeAuthIdentity((authdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiGetTargetHostName((psztargetname?.value ?: 0L).toString(), (pszhostname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiIsAuthIdentityEncrypted((encryptedauthdata?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiIsPromptingNeeded(errororntstatus.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiLocalFree(databuffer: COpaquePointer?) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiLocalFree((databuffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiMarshalAuthIdentity(authidentity: COpaquePointer?, authidentitylength: COpaquePointer?, authidentitybytearray: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiMarshalAuthIdentity((authidentity?.value ?: 0L).toString(), (authidentitylength?.value ?: 0L).toString(), (authidentitybytearray?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredRead(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredRead((authidentity?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), (pcredmancredentialtype?.value ?: 0L).toString(), (ppszcredmantargetname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredWrite(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?, ppszcredmanusername: COpaquePointer?, ppcredentialblob: COpaquePointer?, pcredentialblobsize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredWrite((authidentity?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), (pcredmancredentialtype?.value ?: 0L).toString(), (ppszcredmantargetname?.value ?: 0L).toString(), (ppszcredmanusername?.value ?: 0L).toString(), (ppcredentialblob?.value ?: 0L).toString(), (pcredentialblobsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsA((psztargetname?.value ?: 0L).toString(), (puiinfo?.value ?: 0L).toString(), dwautherror.toInt(), (pszpackage?.value ?: 0L).toString(), (pinputauthidentity?.value ?: 0L).toString(), (ppauthidentity?.value ?: 0L).toString(), (pfsave?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsW((psztargetname?.value ?: 0L).toString(), (puiinfo?.value ?: 0L).toString(), dwautherror.toInt(), (pszpackage?.value ?: 0L).toString(), (pinputauthidentity?.value ?: 0L).toString(), (ppauthidentity?.value ?: 0L).toString(), (pfsave?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetChannelBindingFlags(pbindings: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiSetChannelBindingFlags((pbindings?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiUnmarshalAuthIdentity(authidentitylength.toInt(), (authidentitybytearray?.value ?: 0L).toString(), (ppauthidentity?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiValidateAuthIdentity(authdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiValidateAuthIdentity((authdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiZeroAuthIdentity(authdata: COpaquePointer?) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_sspiZeroAuthIdentity((authdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteAllBindings() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteBinding((targeturl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: COpaquePointer?, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: COpaquePointer?, tokenbinding: COpaquePointer?, tokenbindingsize: COpaquePointer?, resultdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateBinding(keytype, (targeturl?.value ?: 0L).toString(), bindingtype, (tlsekm?.value ?: 0L).toString(), tlsekmsize.toInt(), extensionformat, (extensiondata?.value ?: 0L).toString(), (tokenbinding?.value ?: 0L).toString(), (tokenbindingsize?.value ?: 0L).toString(), (resultdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: COpaquePointer?, publickeysize: UInt, resultdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateID(keytype, (publickey?.value ?: 0L).toString(), publickeysize.toInt(), (resultdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateIDForUri(keytype, (targeturi?.value ?: 0L).toString(), (resultdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateMessage(tokenbindings: COpaquePointer?, tokenbindingssize: COpaquePointer?, tokenbindingscount: UInt, tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateMessage((tokenbindings?.value ?: 0L).toString(), (tokenbindingssize?.value ?: 0L).toString(), tokenbindingscount.toInt(), (tokenbindingmessage?.value ?: 0L).toString(), (tokenbindingmessagesize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGetHighestSupportedVersion((majorversion?.value ?: 0L).toString(), (minorversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesClient(keytypes: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesClient((keytypes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesServer(keytypes: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesServer((keytypes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: COpaquePointer?, tlsekmsize: UInt, resultlist: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_tokenBindingVerifyMessage((tokenbindingmessage?.value ?: 0L).toString(), tokenbindingmessagesize.toInt(), keytype, (tlsekm?.value ?: 0L).toString(), tlsekmsize.toInt(), (resultlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_translateNameA((lpaccountname?.value ?: 0L).toString(), accountnameformat, desirednameformat, (lptranslatedname?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: COpaquePointer?): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_translateNameW((lpaccountname?.value ?: 0L).toString(), accountnameformat, desirednameformat, (lptranslatedname?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_verifySignature((phcontext?.value ?: 0L).toString(), (pmessage?.value ?: 0L).toString(), messageseqno.toInt(), (pfqop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
