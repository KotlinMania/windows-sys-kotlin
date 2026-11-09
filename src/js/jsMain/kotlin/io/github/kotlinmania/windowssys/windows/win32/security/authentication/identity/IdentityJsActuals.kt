@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SecurityAuthenticationIdentityNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext(phcredential.toString(), phcontext.toString(), pinput.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun AcquireCredentialsHandleA(pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA(pszprincipal.toString(), pszpackage.toString(), fcredentialuse.toInt(), pvlogonid.toString(), pauthdata.toString(), pgetkeyfn.toLong().toString(), pvgetkeyargument.toString(), phcredential.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun AcquireCredentialsHandleW(pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW(pszprincipal.toString(), pszpackage.toString(), fcredentialuse.toInt(), pvlogonid.toString(), pauthdata.toString(), pgetkeyfn.toLong().toString(), pvgetkeyargument.toString(), phcredential.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun AddCredentialsA(hcredentials: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AddCredentialsA(hcredentials.toString(), pszprincipal.toString(), pszpackage.toString(), fcredentialuse.toInt(), pauthdata.toString(), pgetkeyfn.toLong().toString(), pvgetkeyargument.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun AddCredentialsW(hcredentials: Long, pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AddCredentialsW(hcredentials.toString(), pszprincipal.toString(), pszpackage.toString(), fcredentialuse.toInt(), pauthdata.toString(), pgetkeyfn.toLong().toString(), pvgetkeyargument.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun AddSecurityPackageA(pszpackagename: PCSTR, poptions: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA(pszpackagename.toString(), poptions.toString()) as Int) else 0

public actual fun AddSecurityPackageW(pszpackagename: PCWSTR, poptions: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW(pszpackagename.toString(), poptions.toString()) as Int) else 0

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ApplyControlToken(phcontext.toString(), pinput.toString()) as Int) else 0

public actual fun AuditComputeEffectivePolicyBySid(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid(psid.toString(), psubcategoryguids.toString(), dwpolicycount.toInt(), ppauditpolicy.toString()) as Boolean) else false

public actual fun AuditComputeEffectivePolicyByToken(htokenhandle: HANDLE, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken(htokenhandle.toString(), psubcategoryguids.toString(), dwpolicycount.toInt(), ppauditpolicy.toString()) as Boolean) else false

public actual fun AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories(ppauditcategoriesarray.toString(), pdwcountreturned.toString()) as Boolean) else false

public actual fun AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy(ppauditsidarray.toString()) as Boolean) else false

public actual fun AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories(pauditcategoryguid.toString(), bretrieveallsubcategories, ppauditsubcategoriesarray.toString(), pdwcountreturned.toString()) as Boolean) else false

public actual fun AuditFree(buffer: Long) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditFree(buffer.toString())
    }
}

public actual fun AuditLookupCategoryGuidFromCategoryId(auditcategoryid: POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid.toString()) as Boolean) else false

public actual fun AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid.toString(), pauditcategoryid.toString()) as Boolean) else false

public actual fun AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA(pauditcategoryguid.toString(), ppszcategoryname.toString()) as Boolean) else false

public actual fun AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW(pauditcategoryguid.toString(), ppszcategoryname.toString()) as Boolean) else false

public actual fun AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA(pauditsubcategoryguid.toString(), ppszsubcategoryname.toString()) as Boolean) else false

public actual fun AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW(pauditsubcategoryguid.toString(), ppszsubcategoryname.toString()) as Boolean) else false

public actual fun AuditQueryGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA(objecttypename.toString(), acl.toString()) as Boolean) else false

public actual fun AuditQueryGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW(objecttypename.toString(), acl.toString()) as Boolean) else false

public actual fun AuditQueryPerUserPolicy(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy(psid.toString(), psubcategoryguids.toString(), dwpolicycount.toInt(), ppauditpolicy.toString()) as Boolean) else false

public actual fun AuditQuerySecurity(securityinformation: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity(securityinformation.toInt(), ppsecuritydescriptor.toString()) as Boolean) else false

public actual fun AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy(psubcategoryguids.toString(), dwpolicycount.toInt(), ppauditpolicy.toString()) as Boolean) else false

public actual fun AuditSetGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA(objecttypename.toString(), acl.toString()) as Boolean) else false

public actual fun AuditSetGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW(objecttypename.toString(), acl.toString()) as Boolean) else false

public actual fun AuditSetPerUserPolicy(psid: PSID, pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy(psid.toString(), pauditpolicy.toString(), dwpolicycount.toInt()) as Boolean) else false

public actual fun AuditSetSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditSetSecurity(securityinformation.toInt(), psecuritydescriptor.toString()) as Boolean) else false

public actual fun AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy(pauditpolicy.toString(), dwpolicycount.toInt()) as Boolean) else false

public actual fun ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA(pszpackagename.toString(), pszdomainname.toString(), pszaccountname.toString(), pszoldpassword.toString(), psznewpassword.toString(), bimpersonating, dwreserved.toInt(), poutput.toString()) as Int) else 0

public actual fun ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW(pszpackagename.toString(), pszdomainname.toString(), pszaccountname.toString(), pszoldpassword.toString(), psznewpassword.toString(), bimpersonating, dwreserved.toInt(), poutput.toString()) as Int) else 0

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_CompleteAuthToken(phcontext.toString(), ptoken.toString()) as Int) else 0

public actual fun CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo(intargetinfo.toString(), buffer.toString(), buffersize.toString()) as Int) else 0

public actual fun CredUnmarshalTargetInfo(buffer: Long, buffersize: UInt, rettargetinfo: Long, retactualsize: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo(buffer.toString(), buffersize.toInt(), rettargetinfo.toString(), retactualsize.toString()) as Int) else 0

public actual fun DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_DecryptMessage(phcontext.toString(), pmessage.toString(), messageseqno.toInt(), pfqop.toString()) as Int) else 0

public actual fun DeleteSecurityContext(phcontext: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext(phcontext.toString()) as Int) else 0

public actual fun DeleteSecurityPackageA(pszpackagename: PCSTR): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA(pszpackagename.toString()) as Int) else 0

public actual fun DeleteSecurityPackageW(pszpackagename: PCWSTR): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW(pszpackagename.toString()) as Int) else 0

public actual fun EncryptMessage(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_EncryptMessage(phcontext.toString(), fqop.toInt(), pmessage.toString(), messageseqno.toInt()) as Int) else 0

public actual fun EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA(pcpackages.toString(), pppackageinfo.toString()) as Int) else 0

public actual fun EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW(pcpackages.toString(), pppackageinfo.toString()) as Int) else 0

public actual fun ExportSecurityContext(phcontext: Long, fflags: EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext: Long, ptoken: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ExportSecurityContext(phcontext.toString(), fflags.toInt(), ppackedcontext.toString(), ptoken.toString()) as Int) else 0

public actual fun FreeContextBuffer(pvcontextbuffer: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_FreeContextBuffer(pvcontextbuffer.toString()) as Int) else 0

public actual fun FreeCredentialsHandle(phcredential: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle(phcredential.toString()) as Int) else 0

public actual fun GetComputerObjectNameA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA(nameformat, lpnamebuffer.toString(), nsize.toString()) as Boolean) else false

public actual fun GetComputerObjectNameW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW(nameformat, lpnamebuffer.toString(), nsize.toString()) as Boolean) else false

public actual fun GetUserNameExA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_GetUserNameExA(nameformat, lpnamebuffer.toString(), nsize.toString()) as Boolean) else false

public actual fun GetUserNameExW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_GetUserNameExW(nameformat, lpnamebuffer.toString(), nsize.toString()) as Boolean) else false

public actual fun ImpersonateSecurityContext(phcontext: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext(phcontext.toString()) as Int) else 0

public actual fun ImportSecurityContextA(pszpackage: PCSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA(pszpackage.toString(), ppackedcontext.toString(), token.toString(), phcontext.toString()) as Int) else 0

public actual fun ImportSecurityContextW(pszpackage: PCWSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW(pszpackage.toString(), ppackedcontext.toString(), token.toString(), phcontext.toString()) as Int) else 0

public actual fun InitSecurityInterfaceA(): Long =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA() as String).toLong() else 0L

public actual fun InitSecurityInterfaceW(): Long =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW() as String).toLong() else 0L

public actual fun InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA(phcredential.toString(), phcontext.toString(), psztargetname.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.toString(), reserved2.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW(phcredential.toString(), phcontext.toString(), psztargetname.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.toString(), reserved2.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun LsaAddAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: UInt): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights(policyhandle.toString(), accountsid.toString(), userrights.toString(), countofrights.toInt()) as Int) else 0

public actual fun LsaCallAuthenticationPackage(lsahandle: HANDLE, authenticationpackage: UInt, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage(lsahandle.toString(), authenticationpackage.toInt(), protocolsubmitbuffer.toString(), submitbufferlength.toInt(), protocolreturnbuffer.toString(), returnbufferlength.toString(), protocolstatus.toString()) as Int) else 0

public actual fun LsaClose(objecthandle: LSA_HANDLE): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaClose(objecthandle.toString()) as Int) else 0

public actual fun LsaConnectUntrusted(lsahandle: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted(lsahandle.toString()) as Int) else 0

public actual fun LsaCreateTrustedDomainEx(policyhandle: LSA_HANDLE, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx(policyhandle.toString(), trusteddomaininformation.toString(), authenticationinformation.toString(), desiredaccess.toInt(), trusteddomainhandle.toString()) as Int) else 0

public actual fun LsaDeleteTrustedDomain(policyhandle: LSA_HANDLE, trusteddomainsid: PSID): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain(policyhandle.toString(), trusteddomainsid.toString()) as Int) else 0

public actual fun LsaDeregisterLogonProcess(lsahandle: HANDLE): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess(lsahandle.toString()) as Int) else 0

public actual fun LsaEnumerateAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights(policyhandle.toString(), accountsid.toString(), userrights.toString(), countofrights.toString()) as Int) else 0

public actual fun LsaEnumerateAccountsWithUserRight(policyhandle: LSA_HANDLE, userright: Long, buffer: Long, countreturned: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight(policyhandle.toString(), userright.toString(), buffer.toString(), countreturned.toString()) as Int) else 0

public actual fun LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions(logonsessioncount.toString(), logonsessionlist.toString()) as Int) else 0

public actual fun LsaEnumerateTrustedDomains(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains(policyhandle.toString(), enumerationcontext.toString(), buffer.toString(), preferedmaximumlength.toInt(), countreturned.toString()) as Int) else 0

public actual fun LsaEnumerateTrustedDomainsEx(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx(policyhandle.toString(), enumerationcontext.toString(), buffer.toString(), preferedmaximumlength.toInt(), countreturned.toString()) as Int) else 0

public actual fun LsaFreeMemory(buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaFreeMemory(buffer.toString()) as Int) else 0

public actual fun LsaFreeReturnBuffer(buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer(buffer.toString()) as Int) else 0

public actual fun LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs(systemname.toString(), capids.toString(), capidcount.toString()) as Int) else 0

public actual fun LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData(logonid.toString(), pplogonsessiondata.toString()) as Int) else 0

public actual fun LsaLogonUser(lsahandle: HANDLE, originname: Long, logontype: SECURITY_LOGON_TYPE, authenticationpackage: UInt, authenticationinformation: Long, authenticationinformationlength: UInt, localgroups: Long, sourcecontext: Long, profilebuffer: Long, profilebufferlength: Long, logonid: Long, token: Long, quotas: Long, substatus: Long): NTSTATUS =
    0

public actual fun LsaLookupAuthenticationPackage(lsahandle: HANDLE, packagename: Long, authenticationpackage: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage(lsahandle.toString(), packagename.toString(), authenticationpackage.toString()) as Int) else 0

public actual fun LsaLookupNames(policyhandle: LSA_HANDLE, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaLookupNames(policyhandle.toString(), count.toInt(), names.toString(), referenceddomains.toString(), sids.toString()) as Int) else 0

public actual fun LsaLookupNames2(policyhandle: LSA_HANDLE, flags: UInt, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaLookupNames2(policyhandle.toString(), flags.toInt(), count.toInt(), names.toString(), referenceddomains.toString(), sids.toString()) as Int) else 0

public actual fun LsaLookupSids(policyhandle: LSA_HANDLE, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaLookupSids(policyhandle.toString(), count.toInt(), sids.toString(), referenceddomains.toString(), names.toString()) as Int) else 0

public actual fun LsaLookupSids2(policyhandle: LSA_HANDLE, lookupoptions: UInt, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaLookupSids2(policyhandle.toString(), lookupoptions.toInt(), count.toInt(), sids.toString(), referenceddomains.toString(), names.toString()) as Int) else 0

public actual fun LsaNtStatusToWinError(status: NTSTATUS): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError(status) as Int).toUInt() else 0u

public actual fun LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: UInt, policyhandle: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy(systemname.toString(), objectattributes.toString(), desiredaccess.toInt(), policyhandle.toString()) as Int) else 0

public actual fun LsaOpenTrustedDomainByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName(policyhandle.toString(), trusteddomainname.toString(), desiredaccess.toInt(), trusteddomainhandle.toString()) as Int) else 0

public actual fun LsaQueryCAPs(capids: Long, capidcount: UInt, caps: Long, capcount: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs(capids.toString(), capidcount.toInt(), caps.toString(), capcount.toString()) as Int) else 0

public actual fun LsaQueryDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaQueryForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation(policyhandle.toString(), trusteddomainname.toString(), foresttrustinfo.toString()) as Int) else 0

public actual fun LsaQueryForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2(policyhandle.toString(), trusteddomainname.toString(), highestrecordtype, foresttrustinfo.toString()) as Int) else 0

public actual fun LsaQueryInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy(policyhandle.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaQueryTrustedDomainInfo(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo(policyhandle.toString(), trusteddomainsid.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaQueryTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess(logonprocessname.toString(), lsahandle.toString(), securitymode.toString()) as Int) else 0

public actual fun LsaRegisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle.toString()) as Int) else 0

public actual fun LsaRemoveAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, allrights: Boolean, userrights: Long, countofrights: UInt): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights(policyhandle.toString(), accountsid.toString(), allrights, userrights.toString(), countofrights.toInt()) as Int) else 0

public actual fun LsaRetrievePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData(policyhandle.toString(), keyname.toString(), privatedata.toString()) as Int) else 0

public actual fun LsaSetCAPs(capdns: Long, capdncount: UInt, flags: UInt): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetCAPs(capdns.toString(), capdncount.toInt(), flags.toInt()) as Int) else 0

public actual fun LsaSetDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaSetForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation(policyhandle.toString(), trusteddomainname.toString(), foresttrustinfo.toString(), checkonly, collisioninfo.toString()) as Int) else 0

public actual fun LsaSetForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2(policyhandle.toString(), trusteddomainname.toString(), highestrecordtype, foresttrustinfo.toString(), checkonly, collisioninfo.toString()) as Int) else 0

public actual fun LsaSetInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy(policyhandle.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaSetTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaSetTrustedDomainInformation(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation(policyhandle.toString(), trusteddomainsid.toString(), informationclass, buffer.toString()) as Int) else 0

public actual fun LsaStorePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData(policyhandle.toString(), keyname.toString(), privatedata.toString()) as Int) else 0

public actual fun LsaUnregisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle.toString()) as Int) else 0

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_MakeSignature(phcontext.toString(), fqop.toInt(), pmessage.toString(), messageseqno.toInt()) as Int) else 0

public actual fun QueryContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA(phcontext.toString(), ulattribute.toInt(), pbuffer.toString()) as Int) else 0

public actual fun QueryContextAttributesExA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA(phcontext.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun QueryContextAttributesExW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW(phcontext.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun QueryContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW(phcontext.toString(), ulattribute.toInt(), pbuffer.toString()) as Int) else 0

public actual fun QueryCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA(phcredential.toString(), ulattribute.toInt(), pbuffer.toString()) as Int) else 0

public actual fun QueryCredentialsAttributesExA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA(phcredential.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun QueryCredentialsAttributesExW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW(phcredential.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun QueryCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW(phcredential.toString(), ulattribute.toInt(), pbuffer.toString()) as Int) else 0

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken(phcontext.toString(), token.toString()) as Int) else 0

public actual fun QuerySecurityPackageInfoA(pszpackagename: PCSTR, pppackageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA(pszpackagename.toString(), pppackageinfo.toString()) as Int) else 0

public actual fun QuerySecurityPackageInfoW(pszpackagename: PCWSTR, pppackageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW(pszpackagename.toString(), pppackageinfo.toString()) as Int) else 0

public actual fun RevertSecurityContext(phcontext: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_RevertSecurityContext(phcontext.toString()) as Int) else 0

public actual fun RtlDecryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory(memory.toString(), memorysize.toInt(), optionflags.toInt()) as Int) else 0

public actual fun RtlEncryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory(memory.toString(), memorysize.toInt(), optionflags.toInt()) as Int) else 0

public actual fun RtlGenRandom(randombuffer: Long, randombufferlength: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_RtlGenRandom(randombuffer.toString(), randombufferlength.toInt()) as Boolean) else false

public actual fun SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: PCWSTR, pwszserverurl: PCWSTR, pwszclienttoken: PCWSTR): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket(ppticketblob.toString(), pcbticketblob.toString(), pwsztemplateid.toString(), pwszserverurl.toString(), pwszclienttoken.toString()) as Int) else 0

public actual fun SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: UInt, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: PCWSTR, wproxyport: UShort): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLActivateProduct(hslc.toString(), pproductskuid.toString(), cbappspecificdata.toInt(), pvappspecificdata.toString(), pactivationinfo.toString(), pwszproxyserver.toString(), wproxyport.toInt()) as Int) else 0

public actual fun SLClose(hslc: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLClose(hslc.toString()) as Int) else 0

public actual fun SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pvreserved: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLConsumeRight(hslc.toString(), pappid.toString(), pproductskuid.toString(), pwszrightname.toString(), pvreserved.toString()) as Int) else 0

public actual fun SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId(hslc.toString(), pproductskuid.toString(), pwszinstallationid.toString(), pwszconfirmationid.toString()) as Int) else 0

public actual fun SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx(hslc.toString(), pproductskuid.toString(), pactivationinfo.toString(), pwszinstallationid.toString(), pwszconfirmationid.toString()) as Int) else 0

public actual fun SLFireEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLFireEvent(hslc.toString(), pwszeventid.toString(), papplicationid.toString()) as Int) else 0

public actual fun SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId(hslc.toString(), pproductskuid.toString(), ppwszinstallationid.toString()) as Int) else 0

public actual fun SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx(hslc.toString(), pproductskuid.toString(), pactivationinfo.toString(), ppwszinstallationid.toString()) as Int) else 0

public actual fun SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation(hslc.toString(), papplicationid.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation(pqueryid.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds(hslc.toString(), pproductskuid.toString(), pnproductkeyids.toString(), ppproductkeyids.toString()) as Int) else 0

public actual fun SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetLicense(hslc.toString(), plicensefileid.toString(), pcblicensefile.toString(), ppblicensefile.toString()) as Int) else 0

public actual fun SLGetLicenseFileId(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId(hslc.toString(), cblicenseblob.toInt(), pblicenseblob.toString(), plicensefileid.toString()) as Int) else 0

public actual fun SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation(hslc.toString(), psllicenseid.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pnstatuscount: Long, pplicensingstatus: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation(hslc.toString(), pappid.toString(), pproductskuid.toString(), pwszrightname.toString(), pnstatuscount.toString(), pplicensingstatus.toString()) as Int) else 0

public actual fun SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetPKeyId(hslc.toString(), pwszpkeyalgorithm.toString(), pwszpkeystring.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.toString(), ppkeyid.toString()) as Int) else 0

public actual fun SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation(hslc.toString(), ppkeyid.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetPolicyInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation(hslc.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD(hslc.toString(), pwszvaluename.toString(), pdwvalue.toString()) as Int) else 0

public actual fun SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation(hslc.toString(), pproductskuid.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetReferralInformation(hslc: Long, ereferraltype: SLREFERRALTYPE, pskuorappid: Long, pwszvaluename: PCWSTR, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation(hslc.toString(), ereferraltype, pskuorappid.toString(), pwszvaluename.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun SLGetSLIDList(hslc: Long, equeryidtype: SLIDTYPE, pqueryid: Long, ereturnidtype: SLIDTYPE, pnreturnids: Long, ppreturnids: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetSLIDList(hslc.toString(), equeryidtype, pqueryid.toString(), ereturnidtype, pnreturnids.toString(), ppreturnids.toString()) as Int) else 0

public actual fun SLGetServerStatus(pwszserverurl: PCWSTR, pwszacquisitiontype: PCWSTR, pwszproxyserver: PCWSTR, wproxyport: UShort, phrstatus: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetServerStatus(pwszserverurl.toString(), pwszacquisitiontype.toString(), pwszproxyserver.toString(), wproxyport.toInt(), phrstatus.toString()) as Int) else 0

public actual fun SLGetServiceInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation(hslc.toString(), pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetWindowsInformation(pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation(pwszvaluename.toString(), pedatatype.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun SLGetWindowsInformationDWORD(pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD(pwszvaluename.toString(), pdwvalue.toString()) as Int) else 0

public actual fun SLInstallLicense(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLInstallLicense(hslc.toString(), cblicenseblob.toInt(), pblicenseblob.toString(), plicensefileid.toString()) as Int) else 0

public actual fun SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase(hslc.toString(), pwszpkeyalgorithm.toString(), pwszpkeystring.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.toString(), ppkeyid.toString()) as Int) else 0

public actual fun SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal(pappid.toString(), pgenuinestate.toString(), puioptions.toString()) as Int) else 0

public actual fun SLOpen(phslc: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLOpen(phslc.toString()) as Int) else 0

public actual fun SLQueryLicenseValueFromApp(valuename: PCWSTR, valuetype: Long, databuffer: Long, datasize: UInt, resultdatasize: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp(valuename.toString(), valuetype.toString(), databuffer.toString(), datasize.toInt(), resultdatasize.toString()) as Int) else 0

public actual fun SLRegisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLRegisterEvent(hslc.toString(), pwszeventid.toString(), papplicationid.toString(), hevent.toString()) as Int) else 0

public actual fun SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey(hslc.toString(), pproductskuid.toString(), pproductkeyid.toString()) as Int) else 0

public actual fun SLSetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, edatatype: SLDATATYPE, cbvalue: UInt, pbvalue: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation(pqueryid.toString(), pwszvaluename.toString(), edatatype.toInt(), cbvalue.toInt(), pbvalue.toString()) as Int) else 0

public actual fun SLUninstallLicense(hslc: Long, plicensefileid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLUninstallLicense(hslc.toString(), plicensefileid.toString()) as Int) else 0

public actual fun SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase(hslc.toString(), ppkeyid.toString()) as Int) else 0

public actual fun SLUnregisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent(hslc.toString(), pwszeventid.toString(), papplicationid.toString(), hevent.toString()) as Int) else 0

public actual fun SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext(phcredential.toString(), phcontext.toString(), pinput.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA(profilelist.toString(), profilecount.toString()) as Int) else 0

public actual fun SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW(profilelist.toString(), profilecount.toString()) as Int) else 0

public actual fun SaslGetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt, needed: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslGetContextOption(contexthandle.toString(), option.toInt(), value.toString(), size.toInt(), needed.toString()) as Int) else 0

public actual fun SaslGetProfilePackageA(profilename: PCSTR, packageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA(profilename.toString(), packageinfo.toString()) as Int) else 0

public actual fun SaslGetProfilePackageW(profilename: PCWSTR, packageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW(profilename.toString(), packageinfo.toString()) as Int) else 0

public actual fun SaslIdentifyPackageA(pinput: Long, packageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA(pinput.toString(), packageinfo.toString()) as Int) else 0

public actual fun SaslIdentifyPackageW(pinput: Long, packageinfo: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW(pinput.toString(), packageinfo.toString()) as Int) else 0

public actual fun SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA(phcredential.toString(), phcontext.toString(), psztargetname.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.toString(), reserved2.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: PCWSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW(phcredential.toString(), phcontext.toString(), psztargetname.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.toString(), reserved2.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun SaslSetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SaslSetContextOption(contexthandle.toString(), option.toInt(), value.toString(), size.toInt()) as Int) else 0

public actual fun SendSAS(asuser: BOOL) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SendSAS(asuser)
    }
}

public actual fun SetContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SetContextAttributesA(phcontext.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SetContextAttributesW(phcontext.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun SetCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA(phcredential.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun SetCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW(phcredential.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun SslCrackCertificate(pbcertificate: Long, cbcertificate: UInt, dwflags: UInt, ppcertificate: Long): BOOL =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslCrackCertificate(pbcertificate.toString(), cbcertificate.toInt(), dwflags.toInt(), ppcertificate.toString()) as Int) else 0

public actual fun SslDeserializeCertificateStore(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT =
    0

public actual fun SslEmptyCacheA(psztargetname: PCSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA(psztargetname.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslEmptyCacheW(psztargetname: PCWSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW(psztargetname.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslFreeCertificate(pcertificate: Long) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslFreeCertificate(pcertificate.toString())
    }
}

public actual fun SslGenerateRandomBits(prandomdata: Long, crandomdata: Int) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits(prandomdata.toString(), crandomdata)
    }
}

public actual fun SslGetExtensions(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslGetExtensions(clienthello.toString(), clienthellobytesize.toInt(), genericextensions.toString(), genericextensionscount.toInt(), bytestoread.toString(), flags) as Int) else 0

public actual fun SslGetMaximumKeySize(reserved: UInt): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize(reserved.toInt()) as Int).toUInt() else 0u

public actual fun SslGetServerIdentity(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity(clienthello.toString(), clienthellosize.toInt(), serveridentity.toString(), serveridentitysize.toString(), flags.toInt()) as Int) else 0

public actual fun SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities(authidentity1.toString(), authidentity2.toString(), samesupplieduser.toString(), samesuppliedidentity.toString()) as Int) else 0

public actual fun SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity(authdata.toString(), authdatacopy.toString()) as Int) else 0

public actual fun SspiDecryptAuthIdentity(encryptedauthdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity(encryptedauthdata.toString()) as Int) else 0

public actual fun SspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx(options.toInt(), encryptedauthdata.toString()) as Int) else 0

public actual fun SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings(pauthidentity.toString(), ppszusername.toString(), ppszdomainname.toString(), ppszpackedcredentialsstring.toString()) as Int) else 0

public actual fun SspiEncodeStringsAsAuthIdentity(pszusername: PCWSTR, pszdomainname: PCWSTR, pszpackedcredentialsstring: PCWSTR, ppauthidentity: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity(pszusername.toString(), pszdomainname.toString(), pszpackedcredentialsstring.toString(), ppauthidentity.toString()) as Int) else 0

public actual fun SspiEncryptAuthIdentity(authdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity(authdata.toString()) as Int) else 0

public actual fun SspiEncryptAuthIdentityEx(options: UInt, authdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx(options.toInt(), authdata.toString()) as Int) else 0

public actual fun SspiExcludePackage(authidentity: Long, pszpackagename: PCWSTR, ppnewauthidentity: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiExcludePackage(authidentity.toString(), pszpackagename.toString(), ppnewauthidentity.toString()) as Int) else 0

public actual fun SspiFreeAuthIdentity(authdata: Long) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity(authdata.toString())
    }
}

public actual fun SspiGetTargetHostName(psztargetname: PCWSTR, pszhostname: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName(psztargetname.toString(), pszhostname.toString()) as Int) else 0

public actual fun SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted(encryptedauthdata.toString()) as Boolean) else false

public actual fun SspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded(errororntstatus.toInt()) as Boolean) else false

public actual fun SspiLocalFree(databuffer: Long) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiLocalFree(databuffer.toString())
    }
}

public actual fun SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity(authidentity.toString(), authidentitylength.toString(), authidentitybytearray.toString()) as Int) else 0

public actual fun SspiPrepareForCredRead(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead(authidentity.toString(), psztargetname.toString(), pcredmancredentialtype.toString(), ppszcredmantargetname.toString()) as Int) else 0

public actual fun SspiPrepareForCredWrite(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite(authidentity.toString(), psztargetname.toString(), pcredmancredentialtype.toString(), ppszcredmantargetname.toString(), ppszcredmanusername.toString(), ppcredentialblob.toString(), pcredentialblobsize.toString()) as Int) else 0

public actual fun SspiPromptForCredentialsA(psztargetname: PCSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA(psztargetname.toString(), puiinfo.toString(), dwautherror.toInt(), pszpackage.toString(), pinputauthidentity.toString(), ppauthidentity.toString(), pfsave.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SspiPromptForCredentialsW(psztargetname: PCWSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCWSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW(psztargetname.toString(), puiinfo.toString(), dwautherror.toInt(), pszpackage.toString(), pinputauthidentity.toString(), ppauthidentity.toString(), pfsave.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SspiSetChannelBindingFlags(pbindings: Long, flags: UInt): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags(pbindings.toString(), flags.toInt()) as Int) else 0

public actual fun SspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: PCSTR, ppauthidentity: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity(authidentitylength.toInt(), authidentitybytearray.toString(), ppauthidentity.toString()) as Int) else 0

public actual fun SspiValidateAuthIdentity(authdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity(authdata.toString()) as Int) else 0

public actual fun SspiZeroAuthIdentity(authdata: Long) {
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) {
        _windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity(authdata.toString())
    }
}

public actual fun TokenBindingDeleteAllBindings(): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings() as Int) else 0

public actual fun TokenBindingDeleteBinding(targeturl: PCWSTR): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding(targeturl.toString()) as Int) else 0

public actual fun TokenBindingGenerateBinding(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl: PCWSTR, bindingtype: TOKENBINDING_TYPE, tlsekm: Long, tlsekmsize: UInt, extensionformat: TOKENBINDING_EXTENSION_FORMAT, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding(keytype, targeturl.toString(), bindingtype, tlsekm.toString(), tlsekmsize.toInt(), extensionformat, extensiondata.toString(), tokenbinding.toString(), tokenbindingsize.toString(), resultdata.toString()) as Int) else 0

public actual fun TokenBindingGenerateID(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, publickey: Long, publickeysize: UInt, resultdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID(keytype, publickey.toString(), publickeysize.toInt(), resultdata.toString()) as Int) else 0

public actual fun TokenBindingGenerateIDForUri(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi: PCWSTR, resultdata: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri(keytype, targeturi.toString(), resultdata.toString()) as Int) else 0

public actual fun TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: UInt, tokenbindingmessage: Long, tokenbindingmessagesize: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage(tokenbindings.toString(), tokenbindingssize.toString(), tokenbindingscount.toInt(), tokenbindingmessage.toString(), tokenbindingmessagesize.toString()) as Int) else 0

public actual fun TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion(majorversion.toString(), minorversion.toString()) as Int) else 0

public actual fun TokenBindingGetKeyTypesClient(keytypes: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient(keytypes.toString()) as Int) else 0

public actual fun TokenBindingGetKeyTypesServer(keytypes: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer(keytypes.toString()) as Int) else 0

public actual fun TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: UInt, keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm: Long, tlsekmsize: UInt, resultlist: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage(tokenbindingmessage.toString(), tokenbindingmessagesize.toInt(), keytype, tlsekm.toString(), tlsekmsize.toInt(), resultlist.toString()) as Int) else 0

public actual fun TranslateNameA(lpaccountname: PCSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PSTR, nsize: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TranslateNameA(lpaccountname.toString(), accountnameformat, desirednameformat, lptranslatedname.toString(), nsize.toString()) as Boolean) else false

public actual fun TranslateNameW(lpaccountname: PCWSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PWSTR, nsize: Long): Boolean =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_TranslateNameW(lpaccountname.toString(), accountnameformat, desirednameformat, lptranslatedname.toString(), nsize.toString()) as Boolean) else false

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    if (_windowsWin32SecurityAuthenticationIdentityNapiAddon != null) (_windowsWin32SecurityAuthenticationIdentityNapiAddon.windowssys_windows_win32_security_authentication_identity_VerifySignature(phcontext.toString(), pmessage.toString(), messageseqno.toInt(), pfqop.toString()) as Int) else 0
