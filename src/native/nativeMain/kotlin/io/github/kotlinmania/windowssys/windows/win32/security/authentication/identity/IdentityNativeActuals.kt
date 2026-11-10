@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun acceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_acceptSecurityContext(phcredential?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>(), pinput?.value?.toCPointer<ByteVar>(), fcontextreq, targetdatarep, phnewcontext?.value?.toCPointer<ByteVar>(), poutput?.value?.toCPointer<ByteVar>(), pfcontextattr?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleA(pszprincipal?.value?.toCPointer<ByteVar>(), pszpackage?.value?.toCPointer<ByteVar>(), fcredentialuse, pvlogonid?.value?.toCPointer<ByteVar>(), pauthdata?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvgetkeyargument?.value?.toCPointer<ByteVar>(), phcredential?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_acquireCredentialsHandleW(pszprincipal?.value?.toCPointer<ByteVar>(), pszpackage?.value?.toCPointer<ByteVar>(), fcredentialuse, pvlogonid?.value?.toCPointer<ByteVar>(), pauthdata?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvgetkeyargument?.value?.toCPointer<ByteVar>(), phcredential?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun addCredentialsA(hcredentials: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_addCredentialsA(hcredentials?.value?.toCPointer<ByteVar>(), pszprincipal?.value?.toCPointer<ByteVar>(), pszpackage?.value?.toCPointer<ByteVar>(), fcredentialuse, pauthdata?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvgetkeyargument?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun addCredentialsW(hcredentials: COpaquePointer?, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_addCredentialsW(hcredentials?.value?.toCPointer<ByteVar>(), pszprincipal?.value?.toCPointer<ByteVar>(), pszpackage?.value?.toCPointer<ByteVar>(), fcredentialuse, pauthdata?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvgetkeyargument?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_addSecurityPackageA(pszpackagename?.value?.toCPointer<ByteVar>(), poptions?.value?.toCPointer<ByteVar>())

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_addSecurityPackageW(pszpackagename?.value?.toCPointer<ByteVar>(), poptions?.value?.toCPointer<ByteVar>())

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_applyControlToken(phcontext?.value?.toCPointer<ByteVar>(), pinput?.value?.toCPointer<ByteVar>())

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyBySid(psid?.value?.toCPointer<ByteVar>(), psubcategoryguids?.value?.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy?.value?.toCPointer<ByteVar>())

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditComputeEffectivePolicyByToken(htokenhandle?.value?.toCPointer<ByteVar>(), psubcategoryguids?.value?.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy?.value?.toCPointer<ByteVar>())

public actual fun auditEnumerateCategories(ppauditcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditEnumerateCategories(ppauditcategoriesarray?.value?.toCPointer<ByteVar>(), pdwcountreturned?.value?.toCPointer<ByteVar>())

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditEnumeratePerUserPolicy(ppauditsidarray?.value?.toCPointer<ByteVar>())

public actual fun auditEnumerateSubCategories(pauditcategoryguid: COpaquePointer?, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: COpaquePointer?, pdwcountreturned: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditEnumerateSubCategories(pauditcategoryguid?.value?.toCPointer<ByteVar>(), bretrieveallsubcategories, ppauditsubcategoriesarray?.value?.toCPointer<ByteVar>(), pdwcountreturned?.value?.toCPointer<ByteVar>())

public actual fun auditFree(buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditFree(buffer?.value?.toCPointer<ByteVar>())
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid?.value?.toCPointer<ByteVar>())

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: COpaquePointer?, pauditcategoryid: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid?.value?.toCPointer<ByteVar>(), pauditcategoryid?.value?.toCPointer<ByteVar>())

public actual fun auditLookupCategoryNameA(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameA(pauditcategoryguid?.value?.toCPointer<ByteVar>(), ppszcategoryname?.value?.toCPointer<ByteVar>())

public actual fun auditLookupCategoryNameW(pauditcategoryguid: COpaquePointer?, ppszcategoryname: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditLookupCategoryNameW(pauditcategoryguid?.value?.toCPointer<ByteVar>(), ppszcategoryname?.value?.toCPointer<ByteVar>())

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameA(pauditsubcategoryguid?.value?.toCPointer<ByteVar>(), ppszsubcategoryname?.value?.toCPointer<ByteVar>())

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: COpaquePointer?, ppszsubcategoryname: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditLookupSubCategoryNameW(pauditsubcategoryguid?.value?.toCPointer<ByteVar>(), ppszsubcategoryname?.value?.toCPointer<ByteVar>())

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclA(objecttypename?.value?.toCPointer<ByteVar>(), acl?.value?.toCPointer<ByteVar>())

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditQueryGlobalSaclW(objecttypename?.value?.toCPointer<ByteVar>(), acl?.value?.toCPointer<ByteVar>())

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditQueryPerUserPolicy(psid?.value?.toCPointer<ByteVar>(), psubcategoryguids?.value?.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy?.value?.toCPointer<ByteVar>())

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditQuerySecurity(securityinformation, ppsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun auditQuerySystemPolicy(psubcategoryguids: COpaquePointer?, dwpolicycount: UInt, ppauditpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditQuerySystemPolicy(psubcategoryguids?.value?.toCPointer<ByteVar>(), dwpolicycount, ppauditpolicy?.value?.toCPointer<ByteVar>())

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclA(objecttypename?.value?.toCPointer<ByteVar>(), acl?.value?.toCPointer<ByteVar>())

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditSetGlobalSaclW(objecttypename?.value?.toCPointer<ByteVar>(), acl?.value?.toCPointer<ByteVar>())

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditSetPerUserPolicy(psid?.value?.toCPointer<ByteVar>(), pauditpolicy?.value?.toCPointer<ByteVar>(), dwpolicycount)

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditSetSecurity(securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun auditSetSystemPolicy(pauditpolicy: COpaquePointer?, dwpolicycount: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_auditSetSystemPolicy(pauditpolicy?.value?.toCPointer<ByteVar>(), dwpolicycount)

public actual fun changeAccountPasswordA(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_changeAccountPasswordA(pszpackagename?.value?.toCPointer<ByteVar>(), pszdomainname?.value?.toCPointer<ByteVar>(), pszaccountname?.value?.toCPointer<ByteVar>(), pszoldpassword?.value?.toCPointer<ByteVar>(), psznewpassword?.value?.toCPointer<ByteVar>(), bimpersonating, dwreserved, poutput?.value?.toCPointer<ByteVar>())

public actual fun changeAccountPasswordW(pszpackagename: COpaquePointer?, pszdomainname: COpaquePointer?, pszaccountname: COpaquePointer?, pszoldpassword: COpaquePointer?, psznewpassword: COpaquePointer?, bimpersonating: Boolean, dwreserved: UInt, poutput: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_changeAccountPasswordW(pszpackagename?.value?.toCPointer<ByteVar>(), pszdomainname?.value?.toCPointer<ByteVar>(), pszaccountname?.value?.toCPointer<ByteVar>(), pszoldpassword?.value?.toCPointer<ByteVar>(), psznewpassword?.value?.toCPointer<ByteVar>(), bimpersonating, dwreserved, poutput?.value?.toCPointer<ByteVar>())

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_completeAuthToken(phcontext?.value?.toCPointer<ByteVar>(), ptoken?.value?.toCPointer<ByteVar>())

public actual fun credMarshalTargetInfo(intargetinfo: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_credMarshalTargetInfo(intargetinfo?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun credUnmarshalTargetInfo(buffer: COpaquePointer?, buffersize: UInt, rettargetinfo: COpaquePointer?, retactualsize: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_credUnmarshalTargetInfo(buffer?.value?.toCPointer<ByteVar>(), buffersize, rettargetinfo?.value?.toCPointer<ByteVar>(), retactualsize?.value?.toCPointer<ByteVar>())

public actual fun decryptMessage(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_decryptMessage(phcontext?.value?.toCPointer<ByteVar>(), pmessage?.value?.toCPointer<ByteVar>(), messageseqno, pfqop?.value?.toCPointer<ByteVar>())

public actual fun deleteSecurityContext(phcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_deleteSecurityContext(phcontext?.value?.toCPointer<ByteVar>())

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageA(pszpackagename?.value?.toCPointer<ByteVar>())

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_deleteSecurityPackageW(pszpackagename?.value?.toCPointer<ByteVar>())

public actual fun encryptMessage(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_encryptMessage(phcontext?.value?.toCPointer<ByteVar>(), fqop, pmessage?.value?.toCPointer<ByteVar>(), messageseqno)

public actual fun enumerateSecurityPackagesA(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesA(pcpackages?.value?.toCPointer<ByteVar>(), pppackageinfo?.value?.toCPointer<ByteVar>())

public actual fun enumerateSecurityPackagesW(pcpackages: COpaquePointer?, pppackageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_enumerateSecurityPackagesW(pcpackages?.value?.toCPointer<ByteVar>(), pppackageinfo?.value?.toCPointer<ByteVar>())

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: ExportSecurityContextFlags, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_exportSecurityContext(phcontext?.value?.toCPointer<ByteVar>(), fflags, ppackedcontext?.value?.toCPointer<ByteVar>(), ptoken?.value?.toCPointer<ByteVar>())

public actual fun freeContextBuffer(pvcontextbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_freeContextBuffer(pvcontextbuffer?.value?.toCPointer<ByteVar>())

public actual fun freeCredentialsHandle(phcredential: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_freeCredentialsHandle(phcredential?.value?.toCPointer<ByteVar>())

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_getComputerObjectNameA(nameformat, lpnamebuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_getComputerObjectNameW(nameformat, lpnamebuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_getUserNameExA(nameformat, lpnamebuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_getUserNameExW(nameformat, lpnamebuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun impersonateSecurityContext(phcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_impersonateSecurityContext(phcontext?.value?.toCPointer<ByteVar>())

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_importSecurityContextA(pszpackage?.value?.toCPointer<ByteVar>(), ppackedcontext?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>())

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: COpaquePointer?, token: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_importSecurityContextW(pszpackage?.value?.toCPointer<ByteVar>(), ppackedcontext?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>())

public actual fun initSecurityInterfaceA(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceA()?.let { COpaquePointer(it.toLong()) }

public actual fun initSecurityInterfaceW(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_initSecurityInterfaceW()?.let { COpaquePointer(it.toLong()) }

public actual fun initializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_initializeSecurityContextA(phcredential?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput?.value?.toCPointer<ByteVar>(), reserved2, phnewcontext?.value?.toCPointer<ByteVar>(), poutput?.value?.toCPointer<ByteVar>(), pfcontextattr?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun initializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_initializeSecurityContextW(phcredential?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput?.value?.toCPointer<ByteVar>(), reserved2, phnewcontext?.value?.toCPointer<ByteVar>(), poutput?.value?.toCPointer<ByteVar>(), pfcontextattr?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaAddAccountRights(policyhandle.toLong(), accountsid?.value?.toCPointer<ByteVar>(), userrights?.value?.toCPointer<ByteVar>(), countofrights)

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaCallAuthenticationPackage(lsahandle?.value?.toCPointer<ByteVar>(), authenticationpackage, protocolsubmitbuffer?.value?.toCPointer<ByteVar>(), submitbufferlength, protocolreturnbuffer?.value?.toCPointer<ByteVar>(), returnbufferlength?.value?.toCPointer<ByteVar>(), protocolstatus?.value?.toCPointer<ByteVar>())

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaClose(objecthandle.toLong())

public actual fun lsaConnectUntrusted(lsahandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaConnectUntrusted(lsahandle?.value?.toCPointer<ByteVar>())

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: COpaquePointer?, authenticationinformation: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaCreateTrustedDomainEx(policyhandle.toLong(), trusteddomaininformation?.value?.toCPointer<ByteVar>(), authenticationinformation?.value?.toCPointer<ByteVar>(), desiredaccess, trusteddomainhandle?.value?.toCPointer<ByteVar>())

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaDeleteTrustedDomain(policyhandle.toLong(), trusteddomainsid?.value?.toCPointer<ByteVar>())

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaDeregisterLogonProcess(lsahandle?.value?.toCPointer<ByteVar>())

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: COpaquePointer?, countofrights: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountRights(policyhandle.toLong(), accountsid?.value?.toCPointer<ByteVar>(), userrights?.value?.toCPointer<ByteVar>(), countofrights?.value?.toCPointer<ByteVar>())

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: COpaquePointer?, buffer: COpaquePointer?, countreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaEnumerateAccountsWithUserRight(policyhandle.toLong(), userright?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), countreturned?.value?.toCPointer<ByteVar>())

public actual fun lsaEnumerateLogonSessions(logonsessioncount: COpaquePointer?, logonsessionlist: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaEnumerateLogonSessions(logonsessioncount?.value?.toCPointer<ByteVar>(), logonsessionlist?.value?.toCPointer<ByteVar>())

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomains(policyhandle.toLong(), enumerationcontext?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), preferedmaximumlength, countreturned?.value?.toCPointer<ByteVar>())

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: COpaquePointer?, buffer: COpaquePointer?, preferedmaximumlength: UInt, countreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaEnumerateTrustedDomainsEx(policyhandle.toLong(), enumerationcontext?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), preferedmaximumlength, countreturned?.value?.toCPointer<ByteVar>())

public actual fun lsaFreeMemory(buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaFreeMemory(buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaFreeReturnBuffer(buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaFreeReturnBuffer(buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaGetAppliedCAPIDs(systemname: COpaquePointer?, capids: COpaquePointer?, capidcount: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaGetAppliedCAPIDs(systemname?.value?.toCPointer<ByteVar>(), capids?.value?.toCPointer<ByteVar>(), capidcount?.value?.toCPointer<ByteVar>())

public actual fun lsaGetLogonSessionData(logonid: COpaquePointer?, pplogonsessiondata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaGetLogonSessionData(logonid?.value?.toCPointer<ByteVar>(), pplogonsessiondata?.value?.toCPointer<ByteVar>())

public actual fun lsaLogonUser(lsahandle: Handle, originname: COpaquePointer?, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: COpaquePointer?, authenticationinformationlength: UInt, localgroups: COpaquePointer?, sourcecontext: COpaquePointer?, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, token: COpaquePointer?, quotas: COpaquePointer?, substatus: COpaquePointer?): Ntstatus =
    0

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: COpaquePointer?, authenticationpackage: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaLookupAuthenticationPackage(lsahandle?.value?.toCPointer<ByteVar>(), packagename?.value?.toCPointer<ByteVar>(), authenticationpackage?.value?.toCPointer<ByteVar>())

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaLookupNames(policyhandle.toLong(), count, names?.value?.toCPointer<ByteVar>(), referenceddomains?.value?.toCPointer<ByteVar>(), sids?.value?.toCPointer<ByteVar>())

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: COpaquePointer?, referenceddomains: COpaquePointer?, sids: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaLookupNames2(policyhandle.toLong(), flags, count, names?.value?.toCPointer<ByteVar>(), referenceddomains?.value?.toCPointer<ByteVar>(), sids?.value?.toCPointer<ByteVar>())

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaLookupSids(policyhandle.toLong(), count, sids?.value?.toCPointer<ByteVar>(), referenceddomains?.value?.toCPointer<ByteVar>(), names?.value?.toCPointer<ByteVar>())

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: COpaquePointer?, referenceddomains: COpaquePointer?, names: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaLookupSids2(policyhandle.toLong(), lookupoptions, count, sids?.value?.toCPointer<ByteVar>(), referenceddomains?.value?.toCPointer<ByteVar>(), names?.value?.toCPointer<ByteVar>())

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaNtStatusToWinError(status)

public actual fun lsaOpenPolicy(systemname: COpaquePointer?, objectattributes: COpaquePointer?, desiredaccess: UInt, policyhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaOpenPolicy(systemname?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>(), desiredaccess, policyhandle?.value?.toCPointer<ByteVar>())

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, desiredaccess: UInt, trusteddomainhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaOpenTrustedDomainByName(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), desiredaccess, trusteddomainhandle?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryCAPs(capids: COpaquePointer?, capidcount: UInt, caps: COpaquePointer?, capcount: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryCAPs(capids?.value?.toCPointer<ByteVar>(), capidcount, caps?.value?.toCPointer<ByteVar>(), capcount?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryDomainInformationPolicy(policyhandle.toLong(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), foresttrustinfo?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryForestTrustInformation2(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), highestrecordtype, foresttrustinfo?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryInformationPolicy(policyhandle.toLong(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfo(policyhandle.toLong(), trusteddomainsid?.value?.toCPointer<ByteVar>(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaQueryTrustedDomainInfoByName(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaRegisterLogonProcess(logonprocessname: COpaquePointer?, lsahandle: COpaquePointer?, securitymode: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaRegisterLogonProcess(logonprocessname?.value?.toCPointer<ByteVar>(), lsahandle?.value?.toCPointer<ByteVar>(), securitymode?.value?.toCPointer<ByteVar>())

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle?.value?.toCPointer<ByteVar>())

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: COpaquePointer?, countofrights: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaRemoveAccountRights(policyhandle.toLong(), accountsid?.value?.toCPointer<ByteVar>(), allrights, userrights?.value?.toCPointer<ByteVar>(), countofrights)

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaRetrievePrivateData(policyhandle.toLong(), keyname?.value?.toCPointer<ByteVar>(), privatedata?.value?.toCPointer<ByteVar>())

public actual fun lsaSetCAPs(capdns: COpaquePointer?, capdncount: UInt, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetCAPs(capdns?.value?.toCPointer<ByteVar>(), capdncount, flags)

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetDomainInformationPolicy(policyhandle.toLong(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), foresttrustinfo?.value?.toCPointer<ByteVar>(), checkonly, collisioninfo?.value?.toCPointer<ByteVar>())

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: COpaquePointer?, checkonly: Boolean, collisioninfo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetForestTrustInformation2(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), highestrecordtype, foresttrustinfo?.value?.toCPointer<ByteVar>(), checkonly, collisioninfo?.value?.toCPointer<ByteVar>())

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetInformationPolicy(policyhandle.toLong(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: COpaquePointer?, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInfoByName(policyhandle.toLong(), trusteddomainname?.value?.toCPointer<ByteVar>(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaSetTrustedDomainInformation(policyhandle.toLong(), trusteddomainsid?.value?.toCPointer<ByteVar>(), informationclass, buffer?.value?.toCPointer<ByteVar>())

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: COpaquePointer?, privatedata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaStorePrivateData(policyhandle.toLong(), keyname?.value?.toCPointer<ByteVar>(), privatedata?.value?.toCPointer<ByteVar>())

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_lsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle?.value?.toCPointer<ByteVar>())

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_makeSignature(phcontext?.value?.toCPointer<ByteVar>(), fqop, pmessage?.value?.toCPointer<ByteVar>(), messageseqno)

public actual fun queryContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryContextAttributesA(phcontext?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun queryContextAttributesExA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryContextAttributesExA(phcontext?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun queryContextAttributesExW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryContextAttributesExW(phcontext?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun queryContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryContextAttributesW(phcontext?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun queryCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesA(phcredential?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun queryCredentialsAttributesExA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExA(phcredential?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun queryCredentialsAttributesExW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesExW(phcredential?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun queryCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_queryCredentialsAttributesW(phcredential?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_querySecurityContextToken(phcontext?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>())

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoA(pszpackagename?.value?.toCPointer<ByteVar>(), pppackageinfo?.value?.toCPointer<ByteVar>())

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_querySecurityPackageInfoW(pszpackagename?.value?.toCPointer<ByteVar>(), pppackageinfo?.value?.toCPointer<ByteVar>())

public actual fun revertSecurityContext(phcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_revertSecurityContext(phcontext?.value?.toCPointer<ByteVar>())

public actual fun rtlDecryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_rtlDecryptMemory(memory?.value?.toCPointer<ByteVar>(), memorysize, optionflags)

public actual fun rtlEncryptMemory(memory: COpaquePointer?, memorysize: UInt, optionflags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_rtlEncryptMemory(memory?.value?.toCPointer<ByteVar>(), memorysize, optionflags)

public actual fun rtlGenRandom(randombuffer: COpaquePointer?, randombufferlength: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_rtlGenRandom(randombuffer?.value?.toCPointer<ByteVar>(), randombufferlength)

public actual fun sLAcquireGenuineTicket(ppticketblob: COpaquePointer?, pcbticketblob: COpaquePointer?, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLAcquireGenuineTicket(ppticketblob?.value?.toCPointer<ByteVar>(), pcbticketblob?.value?.toCPointer<ByteVar>(), pwsztemplateid?.value?.toCPointer<ByteVar>(), pwszserverurl?.value?.toCPointer<ByteVar>(), pwszclienttoken?.value?.toCPointer<ByteVar>())

public actual fun sLActivateProduct(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, cbappspecificdata: UInt, pvappspecificdata: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLActivateProduct(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), cbappspecificdata, pvappspecificdata?.value?.toCPointer<ByteVar>(), pactivationinfo?.value?.toCPointer<ByteVar>(), pwszproxyserver?.value?.toCPointer<ByteVar>(), wproxyport)

public actual fun sLClose(hslc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLClose(hslc?.value?.toCPointer<ByteVar>())

public actual fun sLConsumeRight(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLConsumeRight(hslc?.value?.toCPointer<ByteVar>(), pappid?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pwszrightname?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun sLDepositOfflineConfirmationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationId(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pwszinstallationid?.value?.toCPointer<ByteVar>(), pwszconfirmationid?.value?.toCPointer<ByteVar>())

public actual fun sLDepositOfflineConfirmationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLDepositOfflineConfirmationIdEx(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pactivationinfo?.value?.toCPointer<ByteVar>(), pwszinstallationid?.value?.toCPointer<ByteVar>(), pwszconfirmationid?.value?.toCPointer<ByteVar>())

public actual fun sLFireEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLFireEvent(hslc?.value?.toCPointer<ByteVar>(), pwszeventid?.value?.toCPointer<ByteVar>(), papplicationid?.value?.toCPointer<ByteVar>())

public actual fun sLGenerateOfflineInstallationId(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationId(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), ppwszinstallationid?.value?.toCPointer<ByteVar>())

public actual fun sLGenerateOfflineInstallationIdEx(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pactivationinfo: COpaquePointer?, ppwszinstallationid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGenerateOfflineInstallationIdEx(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pactivationinfo?.value?.toCPointer<ByteVar>(), ppwszinstallationid?.value?.toCPointer<ByteVar>())

public actual fun sLGetApplicationInformation(hslc: COpaquePointer?, papplicationid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetApplicationInformation(hslc?.value?.toCPointer<ByteVar>(), papplicationid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetGenuineInformation(pqueryid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetInstalledProductKeyIds(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pnproductkeyids: COpaquePointer?, ppproductkeyids: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetInstalledProductKeyIds(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pnproductkeyids?.value?.toCPointer<ByteVar>(), ppproductkeyids?.value?.toCPointer<ByteVar>())

public actual fun sLGetLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?, pcblicensefile: COpaquePointer?, ppblicensefile: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetLicense(hslc?.value?.toCPointer<ByteVar>(), plicensefileid?.value?.toCPointer<ByteVar>(), pcblicensefile?.value?.toCPointer<ByteVar>(), ppblicensefile?.value?.toCPointer<ByteVar>())

public actual fun sLGetLicenseFileId(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetLicenseFileId(hslc?.value?.toCPointer<ByteVar>(), cblicenseblob, pblicenseblob?.value?.toCPointer<ByteVar>(), plicensefileid?.value?.toCPointer<ByteVar>())

public actual fun sLGetLicenseInformation(hslc: COpaquePointer?, psllicenseid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetLicenseInformation(hslc?.value?.toCPointer<ByteVar>(), psllicenseid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetLicensingStatusInformation(hslc: COpaquePointer?, pappid: COpaquePointer?, pproductskuid: COpaquePointer?, pwszrightname: Pcwstr, pnstatuscount: COpaquePointer?, pplicensingstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetLicensingStatusInformation(hslc?.value?.toCPointer<ByteVar>(), pappid?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pwszrightname?.value?.toCPointer<ByteVar>(), pnstatuscount?.value?.toCPointer<ByteVar>(), pplicensingstatus?.value?.toCPointer<ByteVar>())

public actual fun sLGetPKeyId(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetPKeyId(hslc?.value?.toCPointer<ByteVar>(), pwszpkeyalgorithm?.value?.toCPointer<ByteVar>(), pwszpkeystring?.value?.toCPointer<ByteVar>(), cbpkeyspecificdata, pbpkeyspecificdata?.value?.toCPointer<ByteVar>(), ppkeyid?.value?.toCPointer<ByteVar>())

public actual fun sLGetPKeyInformation(hslc: COpaquePointer?, ppkeyid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetPKeyInformation(hslc?.value?.toCPointer<ByteVar>(), ppkeyid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetPolicyInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformation(hslc?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetPolicyInformationDWORD(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetPolicyInformationDWORD(hslc?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pdwvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetProductSkuInformation(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetProductSkuInformation(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetReferralInformation(hslc: COpaquePointer?, ereferraltype: Slreferraltype, pskuorappid: COpaquePointer?, pwszvaluename: Pcwstr, ppwszvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetReferralInformation(hslc?.value?.toCPointer<ByteVar>(), ereferraltype, pskuorappid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetSLIDList(hslc: COpaquePointer?, equeryidtype: Slidtype, pqueryid: COpaquePointer?, ereturnidtype: Slidtype, pnreturnids: COpaquePointer?, ppreturnids: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetSLIDList(hslc?.value?.toCPointer<ByteVar>(), equeryidtype, pqueryid?.value?.toCPointer<ByteVar>(), ereturnidtype, pnreturnids?.value?.toCPointer<ByteVar>(), ppreturnids?.value?.toCPointer<ByteVar>())

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetServerStatus(pwszserverurl?.value?.toCPointer<ByteVar>(), pwszacquisitiontype?.value?.toCPointer<ByteVar>(), pwszproxyserver?.value?.toCPointer<ByteVar>(), wproxyport, phrstatus?.value?.toCPointer<ByteVar>())

public actual fun sLGetServiceInformation(hslc: COpaquePointer?, pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetServiceInformation(hslc?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: COpaquePointer?, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformation(pwszvaluename?.value?.toCPointer<ByteVar>(), pedatatype?.value?.toCPointer<ByteVar>(), pcbvalue?.value?.toCPointer<ByteVar>(), ppbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLGetWindowsInformationDWORD(pwszvaluename?.value?.toCPointer<ByteVar>(), pdwvalue?.value?.toCPointer<ByteVar>())

public actual fun sLInstallLicense(hslc: COpaquePointer?, cblicenseblob: UInt, pblicenseblob: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLInstallLicense(hslc?.value?.toCPointer<ByteVar>(), cblicenseblob, pblicenseblob?.value?.toCPointer<ByteVar>(), plicensefileid?.value?.toCPointer<ByteVar>())

public actual fun sLInstallProofOfPurchase(hslc: COpaquePointer?, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLInstallProofOfPurchase(hslc?.value?.toCPointer<ByteVar>(), pwszpkeyalgorithm?.value?.toCPointer<ByteVar>(), pwszpkeystring?.value?.toCPointer<ByteVar>(), cbpkeyspecificdata, pbpkeyspecificdata?.value?.toCPointer<ByteVar>(), ppkeyid?.value?.toCPointer<ByteVar>())

public actual fun sLIsGenuineLocal(pappid: COpaquePointer?, pgenuinestate: COpaquePointer?, puioptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLIsGenuineLocal(pappid?.value?.toCPointer<ByteVar>(), pgenuinestate?.value?.toCPointer<ByteVar>(), puioptions?.value?.toCPointer<ByteVar>())

public actual fun sLOpen(phslc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLOpen(phslc?.value?.toCPointer<ByteVar>())

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: COpaquePointer?, databuffer: COpaquePointer?, datasize: UInt, resultdatasize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLQueryLicenseValueFromApp(valuename?.value?.toCPointer<ByteVar>(), valuetype?.value?.toCPointer<ByteVar>(), databuffer?.value?.toCPointer<ByteVar>(), datasize, resultdatasize?.value?.toCPointer<ByteVar>())

public actual fun sLRegisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLRegisterEvent(hslc?.value?.toCPointer<ByteVar>(), pwszeventid?.value?.toCPointer<ByteVar>(), papplicationid?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>())

public actual fun sLSetCurrentProductKey(hslc: COpaquePointer?, pproductskuid: COpaquePointer?, pproductkeyid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLSetCurrentProductKey(hslc?.value?.toCPointer<ByteVar>(), pproductskuid?.value?.toCPointer<ByteVar>(), pproductkeyid?.value?.toCPointer<ByteVar>())

public actual fun sLSetGenuineInformation(pqueryid: COpaquePointer?, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLSetGenuineInformation(pqueryid?.value?.toCPointer<ByteVar>(), pwszvaluename?.value?.toCPointer<ByteVar>(), edatatype, cbvalue, pbvalue?.value?.toCPointer<ByteVar>())

public actual fun sLUninstallLicense(hslc: COpaquePointer?, plicensefileid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLUninstallLicense(hslc?.value?.toCPointer<ByteVar>(), plicensefileid?.value?.toCPointer<ByteVar>())

public actual fun sLUninstallProofOfPurchase(hslc: COpaquePointer?, ppkeyid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLUninstallProofOfPurchase(hslc?.value?.toCPointer<ByteVar>(), ppkeyid?.value?.toCPointer<ByteVar>())

public actual fun sLUnregisterEvent(hslc: COpaquePointer?, pwszeventid: Pcwstr, papplicationid: COpaquePointer?, hevent: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sLUnregisterEvent(hslc?.value?.toCPointer<ByteVar>(), pwszeventid?.value?.toCPointer<ByteVar>(), papplicationid?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>())

public actual fun saslAcceptSecurityContext(phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslAcceptSecurityContext(phcredential?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>(), pinput?.value?.toCPointer<ByteVar>(), fcontextreq, targetdatarep, phnewcontext?.value?.toCPointer<ByteVar>(), poutput?.value?.toCPointer<ByteVar>(), pfcontextattr?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun saslEnumerateProfilesA(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesA(profilelist?.value?.toCPointer<ByteVar>(), profilecount?.value?.toCPointer<ByteVar>())

public actual fun saslEnumerateProfilesW(profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslEnumerateProfilesW(profilelist?.value?.toCPointer<ByteVar>(), profilecount?.value?.toCPointer<ByteVar>())

public actual fun saslGetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt, needed: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslGetContextOption(contexthandle?.value?.toCPointer<ByteVar>(), option, value?.value?.toCPointer<ByteVar>(), size, needed?.value?.toCPointer<ByteVar>())

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageA(profilename?.value?.toCPointer<ByteVar>(), packageinfo?.value?.toCPointer<ByteVar>())

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslGetProfilePackageW(profilename?.value?.toCPointer<ByteVar>(), packageinfo?.value?.toCPointer<ByteVar>())

public actual fun saslIdentifyPackageA(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageA(pinput?.value?.toCPointer<ByteVar>(), packageinfo?.value?.toCPointer<ByteVar>())

public actual fun saslIdentifyPackageW(pinput: COpaquePointer?, packageinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslIdentifyPackageW(pinput?.value?.toCPointer<ByteVar>(), packageinfo?.value?.toCPointer<ByteVar>())

public actual fun saslInitializeSecurityContextA(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextA(phcredential?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput?.value?.toCPointer<ByteVar>(), reserved2, phnewcontext?.value?.toCPointer<ByteVar>(), poutput?.value?.toCPointer<ByteVar>(), pfcontextattr?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun saslInitializeSecurityContextW(phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslInitializeSecurityContextW(phcredential?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput?.value?.toCPointer<ByteVar>(), reserved2, phnewcontext?.value?.toCPointer<ByteVar>(), poutput?.value?.toCPointer<ByteVar>(), pfcontextattr?.value?.toCPointer<ByteVar>(), ptsexpiry?.value?.toCPointer<ByteVar>())

public actual fun saslSetContextOption(contexthandle: COpaquePointer?, option: UInt, value: COpaquePointer?, size: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_saslSetContextOption(contexthandle?.value?.toCPointer<ByteVar>(), option, value?.value?.toCPointer<ByteVar>(), size)

public actual fun sendSAS(asuser: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sendSAS(asuser)
}

public actual fun setContextAttributesA(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_setContextAttributesA(phcontext?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: SecpkgAttr, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_setContextAttributesW(phcontext?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun setCredentialsAttributesA(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesA(phcredential?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun setCredentialsAttributesW(phcredential: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_setCredentialsAttributesW(phcredential?.value?.toCPointer<ByteVar>(), ulattribute, pbuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun sslCrackCertificate(pbcertificate: COpaquePointer?, cbcertificate: UInt, dwflags: UInt, ppcertificate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslCrackCertificate(pbcertificate?.value?.toCPointer<ByteVar>(), cbcertificate, dwflags, ppcertificate?.value?.toCPointer<ByteVar>())

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: COpaquePointer?): Hresult =
    0

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslEmptyCacheA(psztargetname?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslEmptyCacheW(psztargetname?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun sslFreeCertificate(pcertificate: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslFreeCertificate(pcertificate?.value?.toCPointer<ByteVar>())
}

public actual fun sslGenerateRandomBits(prandomdata: COpaquePointer?, crandomdata: Int) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslGenerateRandomBits(prandomdata?.value?.toCPointer<ByteVar>(), crandomdata)
}

public actual fun sslGetExtensions(clienthello: COpaquePointer?, clienthellobytesize: UInt, genericextensions: COpaquePointer?, genericextensionscount: UByte, bytestoread: COpaquePointer?, flags: SchGetExtensionsOptions): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslGetExtensions(clienthello?.value?.toCPointer<ByteVar>(), clienthellobytesize, genericextensions?.value?.toCPointer<ByteVar>(), genericextensionscount, bytestoread?.value?.toCPointer<ByteVar>(), flags)

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslGetMaximumKeySize(reserved)

public actual fun sslGetServerIdentity(clienthello: COpaquePointer?, clienthellosize: UInt, serveridentity: COpaquePointer?, serveridentitysize: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sslGetServerIdentity(clienthello?.value?.toCPointer<ByteVar>(), clienthellosize, serveridentity?.value?.toCPointer<ByteVar>(), serveridentitysize?.value?.toCPointer<ByteVar>(), flags)

public actual fun sspiCompareAuthIdentities(authidentity1: COpaquePointer?, authidentity2: COpaquePointer?, samesupplieduser: COpaquePointer?, samesuppliedidentity: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiCompareAuthIdentities(authidentity1?.value?.toCPointer<ByteVar>(), authidentity2?.value?.toCPointer<ByteVar>(), samesupplieduser?.value?.toCPointer<ByteVar>(), samesuppliedidentity?.value?.toCPointer<ByteVar>())

public actual fun sspiCopyAuthIdentity(authdata: COpaquePointer?, authdatacopy: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiCopyAuthIdentity(authdata?.value?.toCPointer<ByteVar>(), authdatacopy?.value?.toCPointer<ByteVar>())

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentity(encryptedauthdata?.value?.toCPointer<ByteVar>())

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiDecryptAuthIdentityEx(options, encryptedauthdata?.value?.toCPointer<ByteVar>())

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: COpaquePointer?, ppszusername: COpaquePointer?, ppszdomainname: COpaquePointer?, ppszpackedcredentialsstring: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiEncodeAuthIdentityAsStrings(pauthidentity?.value?.toCPointer<ByteVar>(), ppszusername?.value?.toCPointer<ByteVar>(), ppszdomainname?.value?.toCPointer<ByteVar>(), ppszpackedcredentialsstring?.value?.toCPointer<ByteVar>())

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiEncodeStringsAsAuthIdentity(pszusername?.value?.toCPointer<ByteVar>(), pszdomainname?.value?.toCPointer<ByteVar>(), pszpackedcredentialsstring?.value?.toCPointer<ByteVar>(), ppauthidentity?.value?.toCPointer<ByteVar>())

public actual fun sspiEncryptAuthIdentity(authdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentity(authdata?.value?.toCPointer<ByteVar>())

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiEncryptAuthIdentityEx(options, authdata?.value?.toCPointer<ByteVar>())

public actual fun sspiExcludePackage(authidentity: COpaquePointer?, pszpackagename: Pcwstr, ppnewauthidentity: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiExcludePackage(authidentity?.value?.toCPointer<ByteVar>(), pszpackagename?.value?.toCPointer<ByteVar>(), ppnewauthidentity?.value?.toCPointer<ByteVar>())

public actual fun sspiFreeAuthIdentity(authdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiFreeAuthIdentity(authdata?.value?.toCPointer<ByteVar>())
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiGetTargetHostName(psztargetname?.value?.toCPointer<ByteVar>(), pszhostname?.value?.toCPointer<ByteVar>())

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiIsAuthIdentityEncrypted(encryptedauthdata?.value?.toCPointer<ByteVar>())

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiIsPromptingNeeded(errororntstatus)

public actual fun sspiLocalFree(databuffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiLocalFree(databuffer?.value?.toCPointer<ByteVar>())
}

public actual fun sspiMarshalAuthIdentity(authidentity: COpaquePointer?, authidentitylength: COpaquePointer?, authidentitybytearray: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiMarshalAuthIdentity(authidentity?.value?.toCPointer<ByteVar>(), authidentitylength?.value?.toCPointer<ByteVar>(), authidentitybytearray?.value?.toCPointer<ByteVar>())

public actual fun sspiPrepareForCredRead(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredRead(authidentity?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), pcredmancredentialtype?.value?.toCPointer<ByteVar>(), ppszcredmantargetname?.value?.toCPointer<ByteVar>())

public actual fun sspiPrepareForCredWrite(authidentity: COpaquePointer?, psztargetname: Pcwstr, pcredmancredentialtype: COpaquePointer?, ppszcredmantargetname: COpaquePointer?, ppszcredmanusername: COpaquePointer?, ppcredentialblob: COpaquePointer?, pcredentialblobsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiPrepareForCredWrite(authidentity?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), pcredmancredentialtype?.value?.toCPointer<ByteVar>(), ppszcredmantargetname?.value?.toCPointer<ByteVar>(), ppszcredmanusername?.value?.toCPointer<ByteVar>(), ppcredentialblob?.value?.toCPointer<ByteVar>(), pcredentialblobsize?.value?.toCPointer<ByteVar>())

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsA(psztargetname?.value?.toCPointer<ByteVar>(), puiinfo?.value?.toCPointer<ByteVar>(), dwautherror, pszpackage?.value?.toCPointer<ByteVar>(), pinputauthidentity?.value?.toCPointer<ByteVar>(), ppauthidentity?.value?.toCPointer<ByteVar>(), pfsave?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: COpaquePointer?, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: COpaquePointer?, ppauthidentity: COpaquePointer?, pfsave: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiPromptForCredentialsW(psztargetname?.value?.toCPointer<ByteVar>(), puiinfo?.value?.toCPointer<ByteVar>(), dwautherror, pszpackage?.value?.toCPointer<ByteVar>(), pinputauthidentity?.value?.toCPointer<ByteVar>(), ppauthidentity?.value?.toCPointer<ByteVar>(), pfsave?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun sspiSetChannelBindingFlags(pbindings: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiSetChannelBindingFlags(pbindings?.value?.toCPointer<ByteVar>(), flags)

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiUnmarshalAuthIdentity(authidentitylength, authidentitybytearray?.value?.toCPointer<ByteVar>(), ppauthidentity?.value?.toCPointer<ByteVar>())

public actual fun sspiValidateAuthIdentity(authdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiValidateAuthIdentity(authdata?.value?.toCPointer<ByteVar>())

public actual fun sspiZeroAuthIdentity(authdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_sspiZeroAuthIdentity(authdata?.value?.toCPointer<ByteVar>())
}

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteAllBindings()

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingDeleteBinding(targeturl?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: COpaquePointer?, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: COpaquePointer?, tokenbinding: COpaquePointer?, tokenbindingsize: COpaquePointer?, resultdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateBinding(keytype, targeturl?.value?.toCPointer<ByteVar>(), bindingtype, tlsekm?.value?.toCPointer<ByteVar>(), tlsekmsize, extensionformat, extensiondata?.value?.toCPointer<ByteVar>(), tokenbinding?.value?.toCPointer<ByteVar>(), tokenbindingsize?.value?.toCPointer<ByteVar>(), resultdata?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: COpaquePointer?, publickeysize: UInt, resultdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateID(keytype, publickey?.value?.toCPointer<ByteVar>(), publickeysize, resultdata?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateIDForUri(keytype, targeturi?.value?.toCPointer<ByteVar>(), resultdata?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGenerateMessage(tokenbindings: COpaquePointer?, tokenbindingssize: COpaquePointer?, tokenbindingscount: UInt, tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGenerateMessage(tokenbindings?.value?.toCPointer<ByteVar>(), tokenbindingssize?.value?.toCPointer<ByteVar>(), tokenbindingscount, tokenbindingmessage?.value?.toCPointer<ByteVar>(), tokenbindingmessagesize?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGetHighestSupportedVersion(majorversion?.value?.toCPointer<ByteVar>(), minorversion?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGetKeyTypesClient(keytypes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesClient(keytypes?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingGetKeyTypesServer(keytypes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingGetKeyTypesServer(keytypes?.value?.toCPointer<ByteVar>())

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: COpaquePointer?, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: COpaquePointer?, tlsekmsize: UInt, resultlist: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_tokenBindingVerifyMessage(tokenbindingmessage?.value?.toCPointer<ByteVar>(), tokenbindingmessagesize, keytype, tlsekm?.value?.toCPointer<ByteVar>(), tlsekmsize, resultlist?.value?.toCPointer<ByteVar>())

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_translateNameA(lpaccountname?.value?.toCPointer<ByteVar>(), accountnameformat, desirednameformat, lptranslatedname?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_translateNameW(lpaccountname?.value?.toCPointer<ByteVar>(), accountnameformat, desirednameformat, lptranslatedname?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.cinterop.windowssys_windows_win32_security_authentication_identity_verifySignature(phcontext?.value?.toCPointer<ByteVar>(), pmessage?.value?.toCPointer<ByteVar>(), messageseqno, pfqop?.value?.toCPointer<ByteVar>())
