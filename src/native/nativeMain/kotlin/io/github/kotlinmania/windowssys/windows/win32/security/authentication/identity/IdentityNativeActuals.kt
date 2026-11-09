@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AcceptSecurityContext(phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), pinput.toCPointer<ByteVar>(), fcontextreq, targetdatarep, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun AcquireCredentialsHandleA(pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleA(pszprincipal.toCPointer<ByteVar>(), pszpackage.toCPointer<ByteVar>(), fcredentialuse, pvlogonid.toCPointer<ByteVar>(), pauthdata.toCPointer<ByteVar>(), pgetkeyfn.toLong().toCPointer<ByteVar>(), pvgetkeyargument.toCPointer<ByteVar>(), phcredential.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun AcquireCredentialsHandleW(pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AcquireCredentialsHandleW(pszprincipal.toCPointer<ByteVar>(), pszpackage.toCPointer<ByteVar>(), fcredentialuse, pvlogonid.toCPointer<ByteVar>(), pauthdata.toCPointer<ByteVar>(), pgetkeyfn.toLong().toCPointer<ByteVar>(), pvgetkeyargument.toCPointer<ByteVar>(), phcredential.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun AddCredentialsA(hcredentials: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AddCredentialsA(hcredentials.toCPointer<ByteVar>(), pszprincipal.toCPointer<ByteVar>(), pszpackage.toCPointer<ByteVar>(), fcredentialuse, pauthdata.toCPointer<ByteVar>(), pgetkeyfn.toLong().toCPointer<ByteVar>(), pvgetkeyargument.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun AddCredentialsW(hcredentials: Long, pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AddCredentialsW(hcredentials.toCPointer<ByteVar>(), pszprincipal.toCPointer<ByteVar>(), pszpackage.toCPointer<ByteVar>(), fcredentialuse, pauthdata.toCPointer<ByteVar>(), pgetkeyfn.toLong().toCPointer<ByteVar>(), pvgetkeyargument.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun AddSecurityPackageA(pszpackagename: PCSTR, poptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AddSecurityPackageA(pszpackagename.toCPointer<ByteVar>(), poptions.toCPointer<ByteVar>())

public actual fun AddSecurityPackageW(pszpackagename: PCWSTR, poptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AddSecurityPackageW(pszpackagename.toCPointer<ByteVar>(), poptions.toCPointer<ByteVar>())

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ApplyControlToken(phcontext.toCPointer<ByteVar>(), pinput.toCPointer<ByteVar>())

public actual fun AuditComputeEffectivePolicyBySid(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyBySid(psid.toCPointer<ByteVar>(), psubcategoryguids.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy.toCPointer<ByteVar>())

public actual fun AuditComputeEffectivePolicyByToken(htokenhandle: HANDLE, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditComputeEffectivePolicyByToken(htokenhandle.toCPointer<ByteVar>(), psubcategoryguids.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy.toCPointer<ByteVar>())

public actual fun AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditEnumerateCategories(ppauditcategoriesarray.toCPointer<ByteVar>(), pdwcountreturned.toCPointer<ByteVar>())

public actual fun AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditEnumeratePerUserPolicy(ppauditsidarray.toCPointer<ByteVar>())

public actual fun AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditEnumerateSubCategories(pauditcategoryguid.toCPointer<ByteVar>(), bretrieveallsubcategories, ppauditsubcategoriesarray.toCPointer<ByteVar>(), pdwcountreturned.toCPointer<ByteVar>())

public actual fun AuditFree(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditFree(buffer.toCPointer<ByteVar>())
}

public actual fun AuditLookupCategoryGuidFromCategoryId(auditcategoryid: POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid.toCPointer<ByteVar>())

public actual fun AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid.toCPointer<ByteVar>(), pauditcategoryid.toCPointer<ByteVar>())

public actual fun AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameA(pauditcategoryguid.toCPointer<ByteVar>(), ppszcategoryname.toCPointer<ByteVar>())

public actual fun AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditLookupCategoryNameW(pauditcategoryguid.toCPointer<ByteVar>(), ppszcategoryname.toCPointer<ByteVar>())

public actual fun AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameA(pauditsubcategoryguid.toCPointer<ByteVar>(), ppszsubcategoryname.toCPointer<ByteVar>())

public actual fun AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditLookupSubCategoryNameW(pauditsubcategoryguid.toCPointer<ByteVar>(), ppszsubcategoryname.toCPointer<ByteVar>())

public actual fun AuditQueryGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclA(objecttypename.toCPointer<ByteVar>(), acl.toCPointer<ByteVar>())

public actual fun AuditQueryGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditQueryGlobalSaclW(objecttypename.toCPointer<ByteVar>(), acl.toCPointer<ByteVar>())

public actual fun AuditQueryPerUserPolicy(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditQueryPerUserPolicy(psid.toCPointer<ByteVar>(), psubcategoryguids.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy.toCPointer<ByteVar>())

public actual fun AuditQuerySecurity(securityinformation: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditQuerySecurity(securityinformation, ppsecuritydescriptor.toCPointer<ByteVar>())

public actual fun AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditQuerySystemPolicy(psubcategoryguids.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy.toCPointer<ByteVar>())

public actual fun AuditSetGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclA(objecttypename.toCPointer<ByteVar>(), acl.toCPointer<ByteVar>())

public actual fun AuditSetGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditSetGlobalSaclW(objecttypename.toCPointer<ByteVar>(), acl.toCPointer<ByteVar>())

public actual fun AuditSetPerUserPolicy(psid: PSID, pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditSetPerUserPolicy(psid.toCPointer<ByteVar>(), pauditpolicy.toCPointer<ByteVar>(), dwpolicycount)

public actual fun AuditSetSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditSetSecurity(securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_AuditSetSystemPolicy(pauditpolicy.toCPointer<ByteVar>(), dwpolicycount)

public actual fun ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordA(pszpackagename.toCPointer<ByteVar>(), pszdomainname.toCPointer<ByteVar>(), pszaccountname.toCPointer<ByteVar>(), pszoldpassword.toCPointer<ByteVar>(), psznewpassword.toCPointer<ByteVar>(), bimpersonating, dwreserved, poutput.toCPointer<ByteVar>())

public actual fun ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ChangeAccountPasswordW(pszpackagename.toCPointer<ByteVar>(), pszdomainname.toCPointer<ByteVar>(), pszaccountname.toCPointer<ByteVar>(), pszoldpassword.toCPointer<ByteVar>(), psznewpassword.toCPointer<ByteVar>(), bimpersonating, dwreserved, poutput.toCPointer<ByteVar>())

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_CompleteAuthToken(phcontext.toCPointer<ByteVar>(), ptoken.toCPointer<ByteVar>())

public actual fun CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_CredMarshalTargetInfo(intargetinfo.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun CredUnmarshalTargetInfo(buffer: Long, buffersize: UInt, rettargetinfo: Long, retactualsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_CredUnmarshalTargetInfo(buffer.toCPointer<ByteVar>(), buffersize, rettargetinfo.toCPointer<ByteVar>(), retactualsize.toCPointer<ByteVar>())

public actual fun DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_DecryptMessage(phcontext.toCPointer<ByteVar>(), pmessage.toCPointer<ByteVar>(), messageseqno, pfqop.toCPointer<ByteVar>())

public actual fun DeleteSecurityContext(phcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_DeleteSecurityContext(phcontext.toCPointer<ByteVar>())

public actual fun DeleteSecurityPackageA(pszpackagename: PCSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageA(pszpackagename.toCPointer<ByteVar>())

public actual fun DeleteSecurityPackageW(pszpackagename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_DeleteSecurityPackageW(pszpackagename.toCPointer<ByteVar>())

public actual fun EncryptMessage(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_EncryptMessage(phcontext.toCPointer<ByteVar>(), fqop, pmessage.toCPointer<ByteVar>(), messageseqno)

public actual fun EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesA(pcpackages.toCPointer<ByteVar>(), pppackageinfo.toCPointer<ByteVar>())

public actual fun EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_EnumerateSecurityPackagesW(pcpackages.toCPointer<ByteVar>(), pppackageinfo.toCPointer<ByteVar>())

public actual fun ExportSecurityContext(phcontext: Long, fflags: EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext: Long, ptoken: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ExportSecurityContext(phcontext.toCPointer<ByteVar>(), fflags, ppackedcontext.toCPointer<ByteVar>(), ptoken.toCPointer<ByteVar>())

public actual fun FreeContextBuffer(pvcontextbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_FreeContextBuffer(pvcontextbuffer.toCPointer<ByteVar>())

public actual fun FreeCredentialsHandle(phcredential: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_FreeCredentialsHandle(phcredential.toCPointer<ByteVar>())

public actual fun GetComputerObjectNameA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameA(nameformat, lpnamebuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetComputerObjectNameW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_GetComputerObjectNameW(nameformat, lpnamebuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetUserNameExA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_GetUserNameExA(nameformat, lpnamebuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetUserNameExW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_GetUserNameExW(nameformat, lpnamebuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun ImpersonateSecurityContext(phcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ImpersonateSecurityContext(phcontext.toCPointer<ByteVar>())

public actual fun ImportSecurityContextA(pszpackage: PCSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ImportSecurityContextA(pszpackage.toCPointer<ByteVar>(), ppackedcontext.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>())

public actual fun ImportSecurityContextW(pszpackage: PCWSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_ImportSecurityContextW(pszpackage.toCPointer<ByteVar>(), ppackedcontext.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>())

public actual fun InitSecurityInterfaceA(): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceA()?.toLong() ?: 0L

public actual fun InitSecurityInterfaceW(): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_InitSecurityInterfaceW()?.toLong() ?: 0L

public actual fun InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextA(phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput.toCPointer<ByteVar>(), reserved2, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_InitializeSecurityContextW(phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput.toCPointer<ByteVar>(), reserved2, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun LsaAddAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaAddAccountRights(policyhandle, accountsid.toCPointer<ByteVar>(), userrights.toCPointer<ByteVar>(), countofrights)

public actual fun LsaCallAuthenticationPackage(lsahandle: HANDLE, authenticationpackage: UInt, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaCallAuthenticationPackage(lsahandle.toCPointer<ByteVar>(), authenticationpackage, protocolsubmitbuffer.toCPointer<ByteVar>(), submitbufferlength, protocolreturnbuffer.toCPointer<ByteVar>(), returnbufferlength.toCPointer<ByteVar>(), protocolstatus.toCPointer<ByteVar>())

public actual fun LsaClose(objecthandle: LSA_HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaClose(objecthandle)

public actual fun LsaConnectUntrusted(lsahandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaConnectUntrusted(lsahandle.toCPointer<ByteVar>())

public actual fun LsaCreateTrustedDomainEx(policyhandle: LSA_HANDLE, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaCreateTrustedDomainEx(policyhandle, trusteddomaininformation.toCPointer<ByteVar>(), authenticationinformation.toCPointer<ByteVar>(), desiredaccess, trusteddomainhandle.toCPointer<ByteVar>())

public actual fun LsaDeleteTrustedDomain(policyhandle: LSA_HANDLE, trusteddomainsid: PSID): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaDeleteTrustedDomain(policyhandle, trusteddomainsid.toCPointer<ByteVar>())

public actual fun LsaDeregisterLogonProcess(lsahandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaDeregisterLogonProcess(lsahandle.toCPointer<ByteVar>())

public actual fun LsaEnumerateAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountRights(policyhandle, accountsid.toCPointer<ByteVar>(), userrights.toCPointer<ByteVar>(), countofrights.toCPointer<ByteVar>())

public actual fun LsaEnumerateAccountsWithUserRight(policyhandle: LSA_HANDLE, userright: Long, buffer: Long, countreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaEnumerateAccountsWithUserRight(policyhandle, userright.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), countreturned.toCPointer<ByteVar>())

public actual fun LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaEnumerateLogonSessions(logonsessioncount.toCPointer<ByteVar>(), logonsessionlist.toCPointer<ByteVar>())

public actual fun LsaEnumerateTrustedDomains(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomains(policyhandle, enumerationcontext.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), preferedmaximumlength, countreturned.toCPointer<ByteVar>())

public actual fun LsaEnumerateTrustedDomainsEx(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaEnumerateTrustedDomainsEx(policyhandle, enumerationcontext.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), preferedmaximumlength, countreturned.toCPointer<ByteVar>())

public actual fun LsaFreeMemory(buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaFreeMemory(buffer.toCPointer<ByteVar>())

public actual fun LsaFreeReturnBuffer(buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaFreeReturnBuffer(buffer.toCPointer<ByteVar>())

public actual fun LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaGetAppliedCAPIDs(systemname.toCPointer<ByteVar>(), capids.toCPointer<ByteVar>(), capidcount.toCPointer<ByteVar>())

public actual fun LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaGetLogonSessionData(logonid.toCPointer<ByteVar>(), pplogonsessiondata.toCPointer<ByteVar>())

public actual fun LsaLogonUser(lsahandle: HANDLE, originname: Long, logontype: SECURITY_LOGON_TYPE, authenticationpackage: UInt, authenticationinformation: Long, authenticationinformationlength: UInt, localgroups: Long, sourcecontext: Long, profilebuffer: Long, profilebufferlength: Long, logonid: Long, token: Long, quotas: Long, substatus: Long): NTSTATUS =
    0

public actual fun LsaLookupAuthenticationPackage(lsahandle: HANDLE, packagename: Long, authenticationpackage: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaLookupAuthenticationPackage(lsahandle.toCPointer<ByteVar>(), packagename.toCPointer<ByteVar>(), authenticationpackage.toCPointer<ByteVar>())

public actual fun LsaLookupNames(policyhandle: LSA_HANDLE, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaLookupNames(policyhandle, count, names.toCPointer<ByteVar>(), referenceddomains.toCPointer<ByteVar>(), sids.toCPointer<ByteVar>())

public actual fun LsaLookupNames2(policyhandle: LSA_HANDLE, flags: UInt, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaLookupNames2(policyhandle, flags, count, names.toCPointer<ByteVar>(), referenceddomains.toCPointer<ByteVar>(), sids.toCPointer<ByteVar>())

public actual fun LsaLookupSids(policyhandle: LSA_HANDLE, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaLookupSids(policyhandle, count, sids.toCPointer<ByteVar>(), referenceddomains.toCPointer<ByteVar>(), names.toCPointer<ByteVar>())

public actual fun LsaLookupSids2(policyhandle: LSA_HANDLE, lookupoptions: UInt, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaLookupSids2(policyhandle, lookupoptions, count, sids.toCPointer<ByteVar>(), referenceddomains.toCPointer<ByteVar>(), names.toCPointer<ByteVar>())

public actual fun LsaNtStatusToWinError(status: NTSTATUS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaNtStatusToWinError(status)

public actual fun LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: UInt, policyhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaOpenPolicy(systemname.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), desiredaccess, policyhandle.toCPointer<ByteVar>())

public actual fun LsaOpenTrustedDomainByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaOpenTrustedDomainByName(policyhandle, trusteddomainname.toCPointer<ByteVar>(), desiredaccess, trusteddomainhandle.toCPointer<ByteVar>())

public actual fun LsaQueryCAPs(capids: Long, capidcount: UInt, caps: Long, capcount: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryCAPs(capids.toCPointer<ByteVar>(), capidcount, caps.toCPointer<ByteVar>(), capcount.toCPointer<ByteVar>())

public actual fun LsaQueryDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryDomainInformationPolicy(policyhandle, informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaQueryForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation(policyhandle, trusteddomainname.toCPointer<ByteVar>(), foresttrustinfo.toCPointer<ByteVar>())

public actual fun LsaQueryForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryForestTrustInformation2(policyhandle, trusteddomainname.toCPointer<ByteVar>(), highestrecordtype, foresttrustinfo.toCPointer<ByteVar>())

public actual fun LsaQueryInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryInformationPolicy(policyhandle, informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaQueryTrustedDomainInfo(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfo(policyhandle, trusteddomainsid.toCPointer<ByteVar>(), informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaQueryTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaQueryTrustedDomainInfoByName(policyhandle, trusteddomainname.toCPointer<ByteVar>(), informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaRegisterLogonProcess(logonprocessname.toCPointer<ByteVar>(), lsahandle.toCPointer<ByteVar>(), securitymode.toCPointer<ByteVar>())

public actual fun LsaRegisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle.toCPointer<ByteVar>())

public actual fun LsaRemoveAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, allrights: Boolean, userrights: Long, countofrights: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaRemoveAccountRights(policyhandle, accountsid.toCPointer<ByteVar>(), allrights, userrights.toCPointer<ByteVar>(), countofrights)

public actual fun LsaRetrievePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaRetrievePrivateData(policyhandle, keyname.toCPointer<ByteVar>(), privatedata.toCPointer<ByteVar>())

public actual fun LsaSetCAPs(capdns: Long, capdncount: UInt, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetCAPs(capdns.toCPointer<ByteVar>(), capdncount, flags)

public actual fun LsaSetDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetDomainInformationPolicy(policyhandle, informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaSetForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation(policyhandle, trusteddomainname.toCPointer<ByteVar>(), foresttrustinfo.toCPointer<ByteVar>(), checkonly, collisioninfo.toCPointer<ByteVar>())

public actual fun LsaSetForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetForestTrustInformation2(policyhandle, trusteddomainname.toCPointer<ByteVar>(), highestrecordtype, foresttrustinfo.toCPointer<ByteVar>(), checkonly, collisioninfo.toCPointer<ByteVar>())

public actual fun LsaSetInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetInformationPolicy(policyhandle, informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaSetTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInfoByName(policyhandle, trusteddomainname.toCPointer<ByteVar>(), informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaSetTrustedDomainInformation(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaSetTrustedDomainInformation(policyhandle, trusteddomainsid.toCPointer<ByteVar>(), informationclass, buffer.toCPointer<ByteVar>())

public actual fun LsaStorePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaStorePrivateData(policyhandle, keyname.toCPointer<ByteVar>(), privatedata.toCPointer<ByteVar>())

public actual fun LsaUnregisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_LsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle.toCPointer<ByteVar>())

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_MakeSignature(phcontext.toCPointer<ByteVar>(), fqop, pmessage.toCPointer<ByteVar>(), messageseqno)

public actual fun QueryContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesA(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>())

public actual fun QueryContextAttributesExA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExA(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun QueryContextAttributesExW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesExW(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun QueryContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryContextAttributesW(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>())

public actual fun QueryCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesA(phcredential.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>())

public actual fun QueryCredentialsAttributesExA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExA(phcredential.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun QueryCredentialsAttributesExW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesExW(phcredential.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun QueryCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QueryCredentialsAttributesW(phcredential.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>())

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QuerySecurityContextToken(phcontext.toCPointer<ByteVar>(), token.toCPointer<ByteVar>())

public actual fun QuerySecurityPackageInfoA(pszpackagename: PCSTR, pppackageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoA(pszpackagename.toCPointer<ByteVar>(), pppackageinfo.toCPointer<ByteVar>())

public actual fun QuerySecurityPackageInfoW(pszpackagename: PCWSTR, pppackageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_QuerySecurityPackageInfoW(pszpackagename.toCPointer<ByteVar>(), pppackageinfo.toCPointer<ByteVar>())

public actual fun RevertSecurityContext(phcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_RevertSecurityContext(phcontext.toCPointer<ByteVar>())

public actual fun RtlDecryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_RtlDecryptMemory(memory.toCPointer<ByteVar>(), memorysize, optionflags)

public actual fun RtlEncryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_RtlEncryptMemory(memory.toCPointer<ByteVar>(), memorysize, optionflags)

public actual fun RtlGenRandom(randombuffer: Long, randombufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_RtlGenRandom(randombuffer.toCPointer<ByteVar>(), randombufferlength)

public actual fun SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: PCWSTR, pwszserverurl: PCWSTR, pwszclienttoken: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLAcquireGenuineTicket(ppticketblob.toCPointer<ByteVar>(), pcbticketblob.toCPointer<ByteVar>(), pwsztemplateid.toCPointer<ByteVar>(), pwszserverurl.toCPointer<ByteVar>(), pwszclienttoken.toCPointer<ByteVar>())

public actual fun SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: UInt, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: PCWSTR, wproxyport: UShort): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLActivateProduct(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), cbappspecificdata, pvappspecificdata.toCPointer<ByteVar>(), pactivationinfo.toCPointer<ByteVar>(), pwszproxyserver.toCPointer<ByteVar>(), wproxyport)

public actual fun SLClose(hslc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLClose(hslc.toCPointer<ByteVar>())

public actual fun SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLConsumeRight(hslc.toCPointer<ByteVar>(), pappid.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pwszrightname.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationId(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pwszinstallationid.toCPointer<ByteVar>(), pwszconfirmationid.toCPointer<ByteVar>())

public actual fun SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLDepositOfflineConfirmationIdEx(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pactivationinfo.toCPointer<ByteVar>(), pwszinstallationid.toCPointer<ByteVar>(), pwszconfirmationid.toCPointer<ByteVar>())

public actual fun SLFireEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLFireEvent(hslc.toCPointer<ByteVar>(), pwszeventid.toCPointer<ByteVar>(), papplicationid.toCPointer<ByteVar>())

public actual fun SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationId(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), ppwszinstallationid.toCPointer<ByteVar>())

public actual fun SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGenerateOfflineInstallationIdEx(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pactivationinfo.toCPointer<ByteVar>(), ppwszinstallationid.toCPointer<ByteVar>())

public actual fun SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetApplicationInformation(hslc.toCPointer<ByteVar>(), papplicationid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetGenuineInformation(pqueryid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetInstalledProductKeyIds(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pnproductkeyids.toCPointer<ByteVar>(), ppproductkeyids.toCPointer<ByteVar>())

public actual fun SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetLicense(hslc.toCPointer<ByteVar>(), plicensefileid.toCPointer<ByteVar>(), pcblicensefile.toCPointer<ByteVar>(), ppblicensefile.toCPointer<ByteVar>())

public actual fun SLGetLicenseFileId(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetLicenseFileId(hslc.toCPointer<ByteVar>(), cblicenseblob, pblicenseblob.toCPointer<ByteVar>(), plicensefileid.toCPointer<ByteVar>())

public actual fun SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetLicenseInformation(hslc.toCPointer<ByteVar>(), psllicenseid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pnstatuscount: Long, pplicensingstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetLicensingStatusInformation(hslc.toCPointer<ByteVar>(), pappid.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pwszrightname.toCPointer<ByteVar>(), pnstatuscount.toCPointer<ByteVar>(), pplicensingstatus.toCPointer<ByteVar>())

public actual fun SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetPKeyId(hslc.toCPointer<ByteVar>(), pwszpkeyalgorithm.toCPointer<ByteVar>(), pwszpkeystring.toCPointer<ByteVar>(), cbpkeyspecificdata, pbpkeyspecificdata.toCPointer<ByteVar>(), ppkeyid.toCPointer<ByteVar>())

public actual fun SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetPKeyInformation(hslc.toCPointer<ByteVar>(), ppkeyid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetPolicyInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformation(hslc.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetPolicyInformationDWORD(hslc.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pdwvalue.toCPointer<ByteVar>())

public actual fun SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetProductSkuInformation(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetReferralInformation(hslc: Long, ereferraltype: SLREFERRALTYPE, pskuorappid: Long, pwszvaluename: PCWSTR, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetReferralInformation(hslc.toCPointer<ByteVar>(), ereferraltype, pskuorappid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun SLGetSLIDList(hslc: Long, equeryidtype: SLIDTYPE, pqueryid: Long, ereturnidtype: SLIDTYPE, pnreturnids: Long, ppreturnids: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetSLIDList(hslc.toCPointer<ByteVar>(), equeryidtype, pqueryid.toCPointer<ByteVar>(), ereturnidtype, pnreturnids.toCPointer<ByteVar>(), ppreturnids.toCPointer<ByteVar>())

public actual fun SLGetServerStatus(pwszserverurl: PCWSTR, pwszacquisitiontype: PCWSTR, pwszproxyserver: PCWSTR, wproxyport: UShort, phrstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetServerStatus(pwszserverurl.toCPointer<ByteVar>(), pwszacquisitiontype.toCPointer<ByteVar>(), pwszproxyserver.toCPointer<ByteVar>(), wproxyport, phrstatus.toCPointer<ByteVar>())

public actual fun SLGetServiceInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetServiceInformation(hslc.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetWindowsInformation(pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformation(pwszvaluename.toCPointer<ByteVar>(), pedatatype.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun SLGetWindowsInformationDWORD(pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLGetWindowsInformationDWORD(pwszvaluename.toCPointer<ByteVar>(), pdwvalue.toCPointer<ByteVar>())

public actual fun SLInstallLicense(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLInstallLicense(hslc.toCPointer<ByteVar>(), cblicenseblob, pblicenseblob.toCPointer<ByteVar>(), plicensefileid.toCPointer<ByteVar>())

public actual fun SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLInstallProofOfPurchase(hslc.toCPointer<ByteVar>(), pwszpkeyalgorithm.toCPointer<ByteVar>(), pwszpkeystring.toCPointer<ByteVar>(), cbpkeyspecificdata, pbpkeyspecificdata.toCPointer<ByteVar>(), ppkeyid.toCPointer<ByteVar>())

public actual fun SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLIsGenuineLocal(pappid.toCPointer<ByteVar>(), pgenuinestate.toCPointer<ByteVar>(), puioptions.toCPointer<ByteVar>())

public actual fun SLOpen(phslc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLOpen(phslc.toCPointer<ByteVar>())

public actual fun SLQueryLicenseValueFromApp(valuename: PCWSTR, valuetype: Long, databuffer: Long, datasize: UInt, resultdatasize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLQueryLicenseValueFromApp(valuename.toCPointer<ByteVar>(), valuetype.toCPointer<ByteVar>(), databuffer.toCPointer<ByteVar>(), datasize, resultdatasize.toCPointer<ByteVar>())

public actual fun SLRegisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLRegisterEvent(hslc.toCPointer<ByteVar>(), pwszeventid.toCPointer<ByteVar>(), papplicationid.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>())

public actual fun SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLSetCurrentProductKey(hslc.toCPointer<ByteVar>(), pproductskuid.toCPointer<ByteVar>(), pproductkeyid.toCPointer<ByteVar>())

public actual fun SLSetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, edatatype: SLDATATYPE, cbvalue: UInt, pbvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLSetGenuineInformation(pqueryid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), edatatype, cbvalue, pbvalue.toCPointer<ByteVar>())

public actual fun SLUninstallLicense(hslc: Long, plicensefileid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLUninstallLicense(hslc.toCPointer<ByteVar>(), plicensefileid.toCPointer<ByteVar>())

public actual fun SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLUninstallProofOfPurchase(hslc.toCPointer<ByteVar>(), ppkeyid.toCPointer<ByteVar>())

public actual fun SLUnregisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SLUnregisterEvent(hslc.toCPointer<ByteVar>(), pwszeventid.toCPointer<ByteVar>(), papplicationid.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>())

public actual fun SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslAcceptSecurityContext(phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), pinput.toCPointer<ByteVar>(), fcontextreq, targetdatarep, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesA(profilelist.toCPointer<ByteVar>(), profilecount.toCPointer<ByteVar>())

public actual fun SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslEnumerateProfilesW(profilelist.toCPointer<ByteVar>(), profilecount.toCPointer<ByteVar>())

public actual fun SaslGetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt, needed: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslGetContextOption(contexthandle.toCPointer<ByteVar>(), option, value.toCPointer<ByteVar>(), size, needed.toCPointer<ByteVar>())

public actual fun SaslGetProfilePackageA(profilename: PCSTR, packageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageA(profilename.toCPointer<ByteVar>(), packageinfo.toCPointer<ByteVar>())

public actual fun SaslGetProfilePackageW(profilename: PCWSTR, packageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslGetProfilePackageW(profilename.toCPointer<ByteVar>(), packageinfo.toCPointer<ByteVar>())

public actual fun SaslIdentifyPackageA(pinput: Long, packageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageA(pinput.toCPointer<ByteVar>(), packageinfo.toCPointer<ByteVar>())

public actual fun SaslIdentifyPackageW(pinput: Long, packageinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslIdentifyPackageW(pinput.toCPointer<ByteVar>(), packageinfo.toCPointer<ByteVar>())

public actual fun SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextA(phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput.toCPointer<ByteVar>(), reserved2, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: PCWSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslInitializeSecurityContextW(phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput.toCPointer<ByteVar>(), reserved2, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun SaslSetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SaslSetContextOption(contexthandle.toCPointer<ByteVar>(), option, value.toCPointer<ByteVar>(), size)

public actual fun SendSAS(asuser: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SendSAS(asuser)
}

public actual fun SetContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SetContextAttributesA(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SetContextAttributesW(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun SetCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesA(phcredential.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun SetCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SetCredentialsAttributesW(phcredential.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun SslCrackCertificate(pbcertificate: Long, cbcertificate: UInt, dwflags: UInt, ppcertificate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslCrackCertificate(pbcertificate.toCPointer<ByteVar>(), cbcertificate, dwflags, ppcertificate.toCPointer<ByteVar>())

public actual fun SslDeserializeCertificateStore(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT =
    0

public actual fun SslEmptyCacheA(psztargetname: PCSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslEmptyCacheA(psztargetname.toCPointer<ByteVar>(), dwflags)

public actual fun SslEmptyCacheW(psztargetname: PCWSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslEmptyCacheW(psztargetname.toCPointer<ByteVar>(), dwflags)

public actual fun SslFreeCertificate(pcertificate: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslFreeCertificate(pcertificate.toCPointer<ByteVar>())
}

public actual fun SslGenerateRandomBits(prandomdata: Long, crandomdata: Int) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslGenerateRandomBits(prandomdata.toCPointer<ByteVar>(), crandomdata)
}

public actual fun SslGetExtensions(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslGetExtensions(clienthello.toCPointer<ByteVar>(), clienthellobytesize, genericextensions.toCPointer<ByteVar>(), genericextensionscount, bytestoread.toCPointer<ByteVar>(), flags)

public actual fun SslGetMaximumKeySize(reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslGetMaximumKeySize(reserved)

public actual fun SslGetServerIdentity(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SslGetServerIdentity(clienthello.toCPointer<ByteVar>(), clienthellosize, serveridentity.toCPointer<ByteVar>(), serveridentitysize.toCPointer<ByteVar>(), flags)

public actual fun SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiCompareAuthIdentities(authidentity1.toCPointer<ByteVar>(), authidentity2.toCPointer<ByteVar>(), samesupplieduser.toCPointer<ByteVar>(), samesuppliedidentity.toCPointer<ByteVar>())

public actual fun SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiCopyAuthIdentity(authdata.toCPointer<ByteVar>(), authdatacopy.toCPointer<ByteVar>())

public actual fun SspiDecryptAuthIdentity(encryptedauthdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentity(encryptedauthdata.toCPointer<ByteVar>())

public actual fun SspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiDecryptAuthIdentityEx(options, encryptedauthdata.toCPointer<ByteVar>())

public actual fun SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiEncodeAuthIdentityAsStrings(pauthidentity.toCPointer<ByteVar>(), ppszusername.toCPointer<ByteVar>(), ppszdomainname.toCPointer<ByteVar>(), ppszpackedcredentialsstring.toCPointer<ByteVar>())

public actual fun SspiEncodeStringsAsAuthIdentity(pszusername: PCWSTR, pszdomainname: PCWSTR, pszpackedcredentialsstring: PCWSTR, ppauthidentity: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiEncodeStringsAsAuthIdentity(pszusername.toCPointer<ByteVar>(), pszdomainname.toCPointer<ByteVar>(), pszpackedcredentialsstring.toCPointer<ByteVar>(), ppauthidentity.toCPointer<ByteVar>())

public actual fun SspiEncryptAuthIdentity(authdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentity(authdata.toCPointer<ByteVar>())

public actual fun SspiEncryptAuthIdentityEx(options: UInt, authdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiEncryptAuthIdentityEx(options, authdata.toCPointer<ByteVar>())

public actual fun SspiExcludePackage(authidentity: Long, pszpackagename: PCWSTR, ppnewauthidentity: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiExcludePackage(authidentity.toCPointer<ByteVar>(), pszpackagename.toCPointer<ByteVar>(), ppnewauthidentity.toCPointer<ByteVar>())

public actual fun SspiFreeAuthIdentity(authdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiFreeAuthIdentity(authdata.toCPointer<ByteVar>())
}

public actual fun SspiGetTargetHostName(psztargetname: PCWSTR, pszhostname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiGetTargetHostName(psztargetname.toCPointer<ByteVar>(), pszhostname.toCPointer<ByteVar>())

public actual fun SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiIsAuthIdentityEncrypted(encryptedauthdata.toCPointer<ByteVar>())

public actual fun SspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiIsPromptingNeeded(errororntstatus)

public actual fun SspiLocalFree(databuffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiLocalFree(databuffer.toCPointer<ByteVar>())
}

public actual fun SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiMarshalAuthIdentity(authidentity.toCPointer<ByteVar>(), authidentitylength.toCPointer<ByteVar>(), authidentitybytearray.toCPointer<ByteVar>())

public actual fun SspiPrepareForCredRead(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredRead(authidentity.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), pcredmancredentialtype.toCPointer<ByteVar>(), ppszcredmantargetname.toCPointer<ByteVar>())

public actual fun SspiPrepareForCredWrite(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiPrepareForCredWrite(authidentity.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), pcredmancredentialtype.toCPointer<ByteVar>(), ppszcredmantargetname.toCPointer<ByteVar>(), ppszcredmanusername.toCPointer<ByteVar>(), ppcredentialblob.toCPointer<ByteVar>(), pcredentialblobsize.toCPointer<ByteVar>())

public actual fun SspiPromptForCredentialsA(psztargetname: PCSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsA(psztargetname.toCPointer<ByteVar>(), puiinfo.toCPointer<ByteVar>(), dwautherror, pszpackage.toCPointer<ByteVar>(), pinputauthidentity.toCPointer<ByteVar>(), ppauthidentity.toCPointer<ByteVar>(), pfsave.toCPointer<ByteVar>(), dwflags)

public actual fun SspiPromptForCredentialsW(psztargetname: PCWSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCWSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiPromptForCredentialsW(psztargetname.toCPointer<ByteVar>(), puiinfo.toCPointer<ByteVar>(), dwautherror, pszpackage.toCPointer<ByteVar>(), pinputauthidentity.toCPointer<ByteVar>(), ppauthidentity.toCPointer<ByteVar>(), pfsave.toCPointer<ByteVar>(), dwflags)

public actual fun SspiSetChannelBindingFlags(pbindings: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiSetChannelBindingFlags(pbindings.toCPointer<ByteVar>(), flags)

public actual fun SspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: PCSTR, ppauthidentity: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiUnmarshalAuthIdentity(authidentitylength, authidentitybytearray.toCPointer<ByteVar>(), ppauthidentity.toCPointer<ByteVar>())

public actual fun SspiValidateAuthIdentity(authdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiValidateAuthIdentity(authdata.toCPointer<ByteVar>())

public actual fun SspiZeroAuthIdentity(authdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_SspiZeroAuthIdentity(authdata.toCPointer<ByteVar>())
}

public actual fun TokenBindingDeleteAllBindings(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteAllBindings()

public actual fun TokenBindingDeleteBinding(targeturl: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingDeleteBinding(targeturl.toCPointer<ByteVar>())

public actual fun TokenBindingGenerateBinding(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl: PCWSTR, bindingtype: TOKENBINDING_TYPE, tlsekm: Long, tlsekmsize: UInt, extensionformat: TOKENBINDING_EXTENSION_FORMAT, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateBinding(keytype, targeturl.toCPointer<ByteVar>(), bindingtype, tlsekm.toCPointer<ByteVar>(), tlsekmsize, extensionformat, extensiondata.toCPointer<ByteVar>(), tokenbinding.toCPointer<ByteVar>(), tokenbindingsize.toCPointer<ByteVar>(), resultdata.toCPointer<ByteVar>())

public actual fun TokenBindingGenerateID(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, publickey: Long, publickeysize: UInt, resultdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateID(keytype, publickey.toCPointer<ByteVar>(), publickeysize, resultdata.toCPointer<ByteVar>())

public actual fun TokenBindingGenerateIDForUri(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi: PCWSTR, resultdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateIDForUri(keytype, targeturi.toCPointer<ByteVar>(), resultdata.toCPointer<ByteVar>())

public actual fun TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: UInt, tokenbindingmessage: Long, tokenbindingmessagesize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGenerateMessage(tokenbindings.toCPointer<ByteVar>(), tokenbindingssize.toCPointer<ByteVar>(), tokenbindingscount, tokenbindingmessage.toCPointer<ByteVar>(), tokenbindingmessagesize.toCPointer<ByteVar>())

public actual fun TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGetHighestSupportedVersion(majorversion.toCPointer<ByteVar>(), minorversion.toCPointer<ByteVar>())

public actual fun TokenBindingGetKeyTypesClient(keytypes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesClient(keytypes.toCPointer<ByteVar>())

public actual fun TokenBindingGetKeyTypesServer(keytypes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingGetKeyTypesServer(keytypes.toCPointer<ByteVar>())

public actual fun TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: UInt, keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm: Long, tlsekmsize: UInt, resultlist: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TokenBindingVerifyMessage(tokenbindingmessage.toCPointer<ByteVar>(), tokenbindingmessagesize, keytype, tlsekm.toCPointer<ByteVar>(), tlsekmsize, resultlist.toCPointer<ByteVar>())

public actual fun TranslateNameA(lpaccountname: PCSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PSTR, nsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TranslateNameA(lpaccountname.toCPointer<ByteVar>(), accountnameformat, desirednameformat, lptranslatedname.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun TranslateNameW(lpaccountname: PCWSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PWSTR, nsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_TranslateNameW(lpaccountname.toCPointer<ByteVar>(), accountnameformat, desirednameformat, lptranslatedname.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_VerifySignature(phcontext.toCPointer<ByteVar>(), pmessage.toCPointer<ByteVar>(), messageseqno, pfqop.toCPointer<ByteVar>())
