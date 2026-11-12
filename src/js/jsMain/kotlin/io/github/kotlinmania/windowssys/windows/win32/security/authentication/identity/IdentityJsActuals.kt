@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SecurityAuthenticationIdentityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun acceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pvlogonid.rawAddress.toString(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), phcredential.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pvlogonid.rawAddress.toString(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), phcredential.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsA(hcredentials: ConstPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(hcredentials.rawAddress.toString(), pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsW(hcredentials: ConstPtr, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(hcredentials.rawAddress.toString(), pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(pszpackagename.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(pszpackagename.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(phcontext.rawAddress.toString(), pinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(psid.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(htokenhandle.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(ppauditcategoriesarray.rawAddress.toString(), pdwcountreturned.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(ppauditsidarray.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr, pdwcountreturned: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(pauditcategoryguid.rawAddress.toString(), bretrieveallsubcategories, ppauditsubcategoriesarray.rawAddress.toString(), pdwcountreturned.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditFree(buffer: ConstPtr) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr, pauditcategoryid: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid.rawAddress.toString(), pauditcategoryid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(pauditcategoryguid.rawAddress.toString(), ppszcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr, ppszcategoryname: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(pauditcategoryguid.rawAddress.toString(), ppszcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(pauditsubcategoryguid.rawAddress.toString(), ppszsubcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr, ppszsubcategoryname: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(pauditsubcategoryguid.rawAddress.toString(), ppszsubcategoryname.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(psid.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr, dwpolicycount: UInt, ppauditpolicy: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(psid.rawAddress.toString(), pauditpolicy.rawAddress.toString(), dwpolicycount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSystemPolicy(pauditpolicy: ConstPtr, dwpolicycount: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(pauditpolicy.rawAddress.toString(), dwpolicycount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordA(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(pszpackagename.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszaccountname.rawAddress.toString(), pszoldpassword.rawAddress.toString(), psznewpassword.rawAddress.toString(), bimpersonating, dwreserved.toInt(), poutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordW(pszpackagename: ConstPtr, pszdomainname: ConstPtr, pszaccountname: ConstPtr, pszoldpassword: ConstPtr, psznewpassword: ConstPtr, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(pszpackagename.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszaccountname.rawAddress.toString(), pszoldpassword.rawAddress.toString(), psznewpassword.rawAddress.toString(), bimpersonating, dwreserved.toInt(), poutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(phcontext.rawAddress.toString(), ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalTargetInfo(intargetinfo: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(intargetinfo.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalTargetInfo(buffer: ConstPtr, buffersize: UInt, rettargetinfo: MutPtr, retactualsize: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(buffer.rawAddress.toString(), buffersize.toInt(), rettargetinfo.rawAddress.toString(), retactualsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptMessage(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityContext(phcontext: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(pszpackagename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(pszpackagename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptMessage(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesA(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(pcpackages.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesW(pcpackages: MutPtr, pppackageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(pcpackages.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: ConstPtr, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(phcontext.rawAddress.toString(), fflags.toInt(), ppackedcontext.rawAddress.toString(), ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeContextBuffer(pvcontextbuffer: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(pvcontextbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeCredentialsHandle(phcredential: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(phcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSecurityContext(phcontext: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(pszpackage.rawAddress.toString(), ppackedcontext.rawAddress.toString(), token.rawAddress.toString(), phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr, token: ConstPtr, phcontext: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(pszpackage.rawAddress.toString(), ppackedcontext.rawAddress.toString(), token.rawAddress.toString(), phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceA(): MutPtr =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) MutPtr((windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceW(): MutPtr =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) MutPtr((windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr, countofrights: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), userrights.rawAddress.toString(), countofrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(lsahandle.rawAddress.toString(), authenticationpackage.toInt(), protocolsubmitbuffer.rawAddress.toString(), submitbufferlength.toInt(), protocolreturnbuffer.rawAddress.toString(), returnbufferlength.rawAddress.toString(), protocolstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaConnectUntrusted(lsahandle: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(lsahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr, authenticationinformation: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(policyhandle.toString(), trusteddomaininformation.rawAddress.toString(), authenticationinformation.rawAddress.toString(), desiredaccess.toInt(), trusteddomainhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(policyhandle.toString(), trusteddomainsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(lsahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr, countofrights: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), userrights.rawAddress.toString(), countofrights.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr, buffer: MutPtr, countreturned: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(policyhandle.toString(), userright.rawAddress.toString(), buffer.rawAddress.toString(), countreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr, logonsessionlist: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(logonsessioncount.rawAddress.toString(), logonsessionlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(policyhandle.toString(), enumerationcontext.rawAddress.toString(), buffer.rawAddress.toString(), preferedmaximumlength.toInt(), countreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr, buffer: MutPtr, preferedmaximumlength: UInt, countreturned: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(policyhandle.toString(), enumerationcontext.rawAddress.toString(), buffer.rawAddress.toString(), preferedmaximumlength.toInt(), countreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeMemory(buffer: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeReturnBuffer(buffer: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetAppliedCAPIDs(systemname: ConstPtr, capids: MutPtr, capidcount: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(systemname.rawAddress.toString(), capids.rawAddress.toString(), capidcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetLogonSessionData(logonid: ConstPtr, pplogonsessiondata: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(logonid.rawAddress.toString(), pplogonsessiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr, authenticationinformationlength: UInt, localgroups: ConstPtr, sourcecontext: ConstPtr, profilebuffer: MutPtr, profilebufferlength: MutPtr, logonid: MutPtr, token: MutPtr, quotas: MutPtr, substatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr, authenticationpackage: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(lsahandle.rawAddress.toString(), packagename.rawAddress.toString(), authenticationpackage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(policyhandle.toString(), count.toInt(), names.rawAddress.toString(), referenceddomains.rawAddress.toString(), sids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr, referenceddomains: MutPtr, sids: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(policyhandle.toString(), flags.toInt(), count.toInt(), names.rawAddress.toString(), referenceddomains.rawAddress.toString(), sids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(policyhandle.toString(), count.toInt(), sids.rawAddress.toString(), referenceddomains.rawAddress.toString(), names.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr, referenceddomains: MutPtr, names: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(policyhandle.toString(), lookupoptions.toInt(), count.toInt(), sids.rawAddress.toString(), referenceddomains.rawAddress.toString(), names.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenPolicy(systemname: ConstPtr, objectattributes: ConstPtr, desiredaccess: UInt, policyhandle: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(systemname.rawAddress.toString(), objectattributes.rawAddress.toString(), desiredaccess.toInt(), policyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, desiredaccess: UInt, trusteddomainhandle: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), desiredaccess.toInt(), trusteddomainhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryCAPs(capids: ConstPtr, capidcount: UInt, caps: MutPtr, capcount: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(capids.rawAddress.toString(), capidcount.toInt(), caps.rawAddress.toString(), capcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(policyhandle.toString(), trusteddomainname.rawAddress.toString(), foresttrustinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(policyhandle.toString(), trusteddomainname.rawAddress.toString(), highestrecordtype, foresttrustinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(policyhandle.toString(), trusteddomainsid.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterLogonProcess(logonprocessname: ConstPtr, lsahandle: MutPtr, securitymode: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(logonprocessname.rawAddress.toString(), lsahandle.rawAddress.toString(), securitymode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr, countofrights: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), allrights, userrights.rawAddress.toString(), countofrights.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(policyhandle.toString(), keyname.rawAddress.toString(), privatedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetCAPs(capdns: ConstPtr, capdncount: UInt, flags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(capdns.rawAddress.toString(), capdncount.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(policyhandle.toString(), trusteddomainname.rawAddress.toString(), foresttrustinfo.rawAddress.toString(), checkonly, collisioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr, checkonly: Boolean, collisioninfo: MutPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(policyhandle.toString(), trusteddomainname.rawAddress.toString(), highestrecordtype, foresttrustinfo.rawAddress.toString(), checkonly, collisioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(policyhandle.toString(), trusteddomainsid.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr, privatedata: ConstPtr): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(policyhandle.toString(), keyname.rawAddress.toString(), privatedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(phcontext.rawAddress.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(pszpackagename.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(pszpackagename.rawAddress.toString(), pppackageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertSecurityContext(phcontext: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(memory.rawAddress.toString(), memorysize.toInt(), optionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEncryptMemory(memory: MutPtr, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(memory.rawAddress.toString(), memorysize.toInt(), optionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenRandom(randombuffer: MutPtr, randombufferlength: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(randombuffer.rawAddress.toString(), randombufferlength.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLAcquireGenuineTicket(ppticketblob: MutPtr, pcbticketblob: MutPtr, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(ppticketblob.rawAddress.toString(), pcbticketblob.rawAddress.toString(), pwsztemplateid.rawAddress.toString(), pwszserverurl.rawAddress.toString(), pwszclienttoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLActivateProduct(hslc: ConstPtr, pproductskuid: ConstPtr, cbappspecificdata: UInt, pvappspecificdata: ConstPtr, pactivationinfo: ConstPtr, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), cbappspecificdata.toInt(), pvappspecificdata.rawAddress.toString(), pactivationinfo.rawAddress.toString(), pwszproxyserver.rawAddress.toString(), wproxyport.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLClose(hslc: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(hslc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLConsumeRight(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pvreserved: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(hslc.rawAddress.toString(), pappid.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszrightname.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationId(hslc: ConstPtr, pproductskuid: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszinstallationid.rawAddress.toString(), pwszconfirmationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pactivationinfo.rawAddress.toString(), pwszinstallationid.rawAddress.toString(), pwszconfirmationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLFireEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationId(hslc: ConstPtr, pproductskuid: ConstPtr, ppwszinstallationid: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), ppwszinstallationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr, pproductskuid: ConstPtr, pactivationinfo: ConstPtr, ppwszinstallationid: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pactivationinfo.rawAddress.toString(), ppwszinstallationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetApplicationInformation(hslc: ConstPtr, papplicationid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(hslc.rawAddress.toString(), papplicationid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(pqueryid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetInstalledProductKeyIds(hslc: ConstPtr, pproductskuid: ConstPtr, pnproductkeyids: MutPtr, ppproductkeyids: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pnproductkeyids.rawAddress.toString(), ppproductkeyids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicense(hslc: ConstPtr, plicensefileid: ConstPtr, pcblicensefile: MutPtr, ppblicensefile: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(hslc.rawAddress.toString(), plicensefileid.rawAddress.toString(), pcblicensefile.rawAddress.toString(), ppblicensefile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseFileId(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(hslc.rawAddress.toString(), cblicenseblob.toInt(), pblicenseblob.rawAddress.toString(), plicensefileid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseInformation(hslc: ConstPtr, psllicenseid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(hslc.rawAddress.toString(), psllicenseid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicensingStatusInformation(hslc: ConstPtr, pappid: ConstPtr, pproductskuid: ConstPtr, pwszrightname: Pcwstr, pnstatuscount: MutPtr, pplicensingstatus: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(hslc.rawAddress.toString(), pappid.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszrightname.rawAddress.toString(), pnstatuscount.rawAddress.toString(), pplicensingstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyId(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(hslc.rawAddress.toString(), pwszpkeyalgorithm.rawAddress.toString(), pwszpkeystring.rawAddress.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress.toString(), ppkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyInformation(hslc: ConstPtr, ppkeyid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(hslc.rawAddress.toString(), ppkeyid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformationDWORD(hslc: ConstPtr, pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetProductSkuInformation(hslc: ConstPtr, pproductskuid: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetReferralInformation(hslc: ConstPtr, ereferraltype: Slreferraltype, pskuorappid: ConstPtr, pwszvaluename: Pcwstr, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(hslc.rawAddress.toString(), ereferraltype, pskuorappid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetSLIDList(hslc: ConstPtr, equeryidtype: Slidtype, pqueryid: ConstPtr, ereturnidtype: Slidtype, pnreturnids: MutPtr, ppreturnids: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(hslc.rawAddress.toString(), equeryidtype, pqueryid.rawAddress.toString(), ereturnidtype, pnreturnids.rawAddress.toString(), ppreturnids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(pwszserverurl.rawAddress.toString(), pwszacquisitiontype.rawAddress.toString(), pwszproxyserver.rawAddress.toString(), wproxyport.toInt(), phrstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServiceInformation(hslc: ConstPtr, pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr, pcbvalue: MutPtr, ppbvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(pwszvaluename.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallLicense(hslc: ConstPtr, cblicenseblob: UInt, pblicenseblob: ConstPtr, plicensefileid: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(hslc.rawAddress.toString(), cblicenseblob.toInt(), pblicenseblob.rawAddress.toString(), plicensefileid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallProofOfPurchase(hslc: ConstPtr, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr, ppkeyid: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(hslc.rawAddress.toString(), pwszpkeyalgorithm.rawAddress.toString(), pwszpkeystring.rawAddress.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress.toString(), ppkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLIsGenuineLocal(pappid: ConstPtr, pgenuinestate: MutPtr, puioptions: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(pappid.rawAddress.toString(), pgenuinestate.rawAddress.toString(), puioptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLOpen(phslc: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(phslc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr, databuffer: MutPtr, datasize: UInt, resultdatasize: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(valuename.rawAddress.toString(), valuetype.rawAddress.toString(), databuffer.rawAddress.toString(), datasize.toInt(), resultdatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLRegisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetCurrentProductKey(hslc: ConstPtr, pproductskuid: ConstPtr, pproductkeyid: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pproductkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetGenuineInformation(pqueryid: ConstPtr, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(pqueryid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), edatatype.toInt(), cbvalue.toInt(), pbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallLicense(hslc: ConstPtr, plicensefileid: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(hslc.rawAddress.toString(), plicensefileid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallProofOfPurchase(hslc: ConstPtr, ppkeyid: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(hslc.rawAddress.toString(), ppkeyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUnregisterEvent(hslc: ConstPtr, pwszeventid: Pcwstr, papplicationid: ConstPtr, hevent: Handle): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslAcceptSecurityContext(phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesA(profilelist: MutPtr, profilecount: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(profilelist.rawAddress.toString(), profilecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesW(profilelist: MutPtr, profilecount: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(profilelist.rawAddress.toString(), profilecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetContextOption(contexthandle: ConstPtr, option: UInt, value: MutPtr, size: UInt, needed: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(contexthandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString(), size.toInt(), needed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(profilename.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(profilename.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageA(pinput: ConstPtr, packageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(pinput.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageW(pinput: ConstPtr, packageinfo: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(pinput.rawAddress.toString(), packageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextA(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextW(phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: MutPtr, poutput: MutPtr, pfcontextattr: MutPtr, ptsexpiry: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslSetContextOption(contexthandle: ConstPtr, option: UInt, value: ConstPtr, size: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(contexthandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSAS(asuser: Bool) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setContextAttributesA(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: ConstPtr, ulattribute: SecpkgAttr, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesA(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesW(phcredential: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCrackCertificate(pbcertificate: MutPtr, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(pbcertificate.rawAddress.toString(), cbcertificate.toInt(), dwflags.toInt(), ppcertificate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(psztargetname.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(psztargetname.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeCertificate(pcertificate: MutPtr) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(pcertificate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGenerateRandomBits(prandomdata: MutPtr, crandomdata: Int) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(prandomdata.rawAddress.toString(), crandomdata)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGetExtensions(clienthello: ConstPtr, clienthellobytesize: UInt, genericextensions: MutPtr, genericextensionscount: UByte, bytestoread: MutPtr, flags: SchGetExtensionsOptions): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(clienthello.rawAddress.toString(), clienthellobytesize.toInt(), genericextensions.rawAddress.toString(), genericextensionscount.toInt(), bytestoread.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetServerIdentity(clienthello: ConstPtr, clienthellosize: UInt, serveridentity: MutPtr, serveridentitysize: MutPtr, flags: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(clienthello.rawAddress.toString(), clienthellosize.toInt(), serveridentity.rawAddress.toString(), serveridentitysize.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCompareAuthIdentities(authidentity1: ConstPtr, authidentity2: ConstPtr, samesupplieduser: MutPtr, samesuppliedidentity: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(authidentity1.rawAddress.toString(), authidentity2.rawAddress.toString(), samesupplieduser.rawAddress.toString(), samesuppliedidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCopyAuthIdentity(authdata: ConstPtr, authdatacopy: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(authdata.rawAddress.toString(), authdatacopy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(encryptedauthdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(options.toInt(), encryptedauthdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr, ppszusername: MutPtr, ppszdomainname: MutPtr, ppszpackedcredentialsstring: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(pauthidentity.rawAddress.toString(), ppszusername.rawAddress.toString(), ppszdomainname.rawAddress.toString(), ppszpackedcredentialsstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(pszusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszpackedcredentialsstring.rawAddress.toString(), ppauthidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentity(authdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(authdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(options.toInt(), authdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiExcludePackage(authidentity: ConstPtr, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(authidentity.rawAddress.toString(), pszpackagename.rawAddress.toString(), ppnewauthidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAuthIdentity(authdata: ConstPtr) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(authdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(psztargetname.rawAddress.toString(), pszhostname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(encryptedauthdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiLocalFree(databuffer: ConstPtr) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(databuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiMarshalAuthIdentity(authidentity: ConstPtr, authidentitylength: MutPtr, authidentitybytearray: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(authidentity.rawAddress.toString(), authidentitylength.rawAddress.toString(), authidentitybytearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredRead(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(authidentity.rawAddress.toString(), psztargetname.rawAddress.toString(), pcredmancredentialtype.rawAddress.toString(), ppszcredmantargetname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredWrite(authidentity: ConstPtr, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr, ppszcredmantargetname: MutPtr, ppszcredmanusername: MutPtr, ppcredentialblob: MutPtr, pcredentialblobsize: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(authidentity.rawAddress.toString(), psztargetname.rawAddress.toString(), pcredmancredentialtype.rawAddress.toString(), ppszcredmantargetname.rawAddress.toString(), ppszcredmanusername.rawAddress.toString(), ppcredentialblob.rawAddress.toString(), pcredentialblobsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(psztargetname.rawAddress.toString(), puiinfo.rawAddress.toString(), dwautherror.toInt(), pszpackage.rawAddress.toString(), pinputauthidentity.rawAddress.toString(), ppauthidentity.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr, ppauthidentity: MutPtr, pfsave: MutPtr, dwflags: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(psztargetname.rawAddress.toString(), puiinfo.rawAddress.toString(), dwautherror.toInt(), pszpackage.rawAddress.toString(), pinputauthidentity.rawAddress.toString(), ppauthidentity.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetChannelBindingFlags(pbindings: MutPtr, flags: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(pbindings.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(authidentitylength.toInt(), authidentitybytearray.rawAddress.toString(), ppauthidentity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiValidateAuthIdentity(authdata: ConstPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(authdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiZeroAuthIdentity(authdata: ConstPtr) {
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

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr, tokenbinding: MutPtr, tokenbindingsize: MutPtr, resultdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(keytype, targeturl.rawAddress.toString(), bindingtype, tlsekm.rawAddress.toString(), tlsekmsize.toInt(), extensionformat, extensiondata.rawAddress.toString(), tokenbinding.rawAddress.toString(), tokenbindingsize.rawAddress.toString(), resultdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr, publickeysize: UInt, resultdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(keytype, publickey.rawAddress.toString(), publickeysize.toInt(), resultdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(keytype, targeturi.rawAddress.toString(), resultdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateMessage(tokenbindings: ConstPtr, tokenbindingssize: ConstPtr, tokenbindingscount: UInt, tokenbindingmessage: MutPtr, tokenbindingmessagesize: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(tokenbindings.rawAddress.toString(), tokenbindingssize.rawAddress.toString(), tokenbindingscount.toInt(), tokenbindingmessage.rawAddress.toString(), tokenbindingmessagesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr, minorversion: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(majorversion.rawAddress.toString(), minorversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesClient(keytypes: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(keytypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesServer(keytypes: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(keytypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr, tlsekmsize: UInt, resultlist: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(tokenbindingmessage.rawAddress.toString(), tokenbindingmessagesize.toInt(), keytype, tlsekm.rawAddress.toString(), tlsekmsize.toInt(), resultlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(lpaccountname.rawAddress.toString(), accountnameformat, desirednameformat, lptranslatedname.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(lpaccountname.rawAddress.toString(), accountnameformat, desirednameformat, lptranslatedname.rawAddress.toString(), nsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
