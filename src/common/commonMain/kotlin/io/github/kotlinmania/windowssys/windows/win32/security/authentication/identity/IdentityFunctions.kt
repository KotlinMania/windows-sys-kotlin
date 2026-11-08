package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(arg: Long, principal: Long, keyver: UInt, key: Long, status: Long)
}

public fun AcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AcceptSecurityContext", longArrayOf(phcredential, phcontext, pinput, fcontextreq.toLong(), targetdatarep.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun AcquireCredentialsHandleA(pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AcquireCredentialsHandleA", longArrayOf(pszprincipal, pszpackage, fcredentialuse.toLong(), pvlogonid, pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, phcredential, ptsexpiry)).toInt()
}

public fun AcquireCredentialsHandleW(pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: SECPKG_CRED, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AcquireCredentialsHandleW", longArrayOf(pszprincipal, pszpackage, fcredentialuse.toLong(), pvlogonid, pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, phcredential, ptsexpiry)).toInt()
}

public fun AddCredentialsA(hcredentials: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AddCredentialsA", longArrayOf(hcredentials, pszprincipal, pszpackage, fcredentialuse.toLong(), pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, ptsexpiry)).toInt()
}

public fun AddCredentialsW(hcredentials: Long, pszprincipal: PCWSTR, pszpackage: PCWSTR, fcredentialuse: UInt, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AddCredentialsW", longArrayOf(hcredentials, pszprincipal, pszpackage, fcredentialuse.toLong(), pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, ptsexpiry)).toInt()
}

public fun AddSecurityPackageA(pszpackagename: PCSTR, poptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AddSecurityPackageA", longArrayOf(pszpackagename, poptions)).toInt()
}

public fun AddSecurityPackageW(pszpackagename: PCWSTR, poptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "AddSecurityPackageW", longArrayOf(pszpackagename, poptions)).toInt()
}

public fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ApplyControlToken", longArrayOf(phcontext, pinput)).toInt()
}

public fun AuditComputeEffectivePolicyBySid(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditComputeEffectivePolicyBySid", longArrayOf(psid, psubcategoryguids, dwpolicycount.toLong(), ppauditpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditComputeEffectivePolicyByToken(htokenhandle: HANDLE, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditComputeEffectivePolicyByToken", longArrayOf(htokenhandle, psubcategoryguids, dwpolicycount.toLong(), ppauditpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditEnumerateCategories(ppauditcategoriesarray: Long, pdwcountreturned: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditEnumerateCategories", longArrayOf(ppauditcategoriesarray, pdwcountreturned))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditEnumeratePerUserPolicy(ppauditsidarray: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditEnumeratePerUserPolicy", longArrayOf(ppauditsidarray))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditEnumerateSubCategories(pauditcategoryguid: Long, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: Long, pdwcountreturned: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditEnumerateSubCategories", longArrayOf(pauditcategoryguid, if (bretrieveallsubcategories) 1L else 0L, ppauditsubcategoriesarray, pdwcountreturned))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditFree(buffer: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "AuditFree", longArrayOf(buffer))
}

public fun AuditLookupCategoryGuidFromCategoryId(auditcategoryid: POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditLookupCategoryGuidFromCategoryId", longArrayOf(auditcategoryid.toLong(), pauditcategoryguid))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: Long, pauditcategoryid: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditLookupCategoryIdFromCategoryGuid", longArrayOf(pauditcategoryguid, pauditcategoryid))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditLookupCategoryNameA(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditLookupCategoryNameA", longArrayOf(pauditcategoryguid, ppszcategoryname))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditLookupCategoryNameW(pauditcategoryguid: Long, ppszcategoryname: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditLookupCategoryNameW", longArrayOf(pauditcategoryguid, ppszcategoryname))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditLookupSubCategoryNameA(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditLookupSubCategoryNameA", longArrayOf(pauditsubcategoryguid, ppszsubcategoryname))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditLookupSubCategoryNameW(pauditsubcategoryguid: Long, ppszsubcategoryname: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditLookupSubCategoryNameW", longArrayOf(pauditsubcategoryguid, ppszsubcategoryname))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditQueryGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditQueryGlobalSaclA", longArrayOf(objecttypename, acl))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditQueryGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditQueryGlobalSaclW", longArrayOf(objecttypename, acl))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditQueryPerUserPolicy(psid: PSID, psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditQueryPerUserPolicy", longArrayOf(psid, psubcategoryguids, dwpolicycount.toLong(), ppauditpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditQuerySecurity(securityinformation: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditQuerySecurity", longArrayOf(securityinformation.toLong(), ppsecuritydescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditQuerySystemPolicy(psubcategoryguids: Long, dwpolicycount: UInt, ppauditpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditQuerySystemPolicy", longArrayOf(psubcategoryguids, dwpolicycount.toLong(), ppauditpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditSetGlobalSaclA(objecttypename: PCSTR, acl: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditSetGlobalSaclA", longArrayOf(objecttypename, acl))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditSetGlobalSaclW(objecttypename: PCWSTR, acl: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditSetGlobalSaclW", longArrayOf(objecttypename, acl))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditSetPerUserPolicy(psid: PSID, pauditpolicy: Long, dwpolicycount: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditSetPerUserPolicy", longArrayOf(psid, pauditpolicy, dwpolicycount.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditSetSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditSetSecurity", longArrayOf(securityinformation.toLong(), psecuritydescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun AuditSetSystemPolicy(pauditpolicy: Long, dwpolicycount: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "AuditSetSystemPolicy", longArrayOf(pauditpolicy, dwpolicycount.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun ChangeAccountPasswordA(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ChangeAccountPasswordA", longArrayOf(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, if (bimpersonating) 1L else 0L, dwreserved.toLong(), poutput)).toInt()
}

public fun ChangeAccountPasswordW(pszpackagename: Long, pszdomainname: Long, pszaccountname: Long, pszoldpassword: Long, psznewpassword: Long, bimpersonating: Boolean, dwreserved: UInt, poutput: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ChangeAccountPasswordW", longArrayOf(pszpackagename, pszdomainname, pszaccountname, pszoldpassword, psznewpassword, if (bimpersonating) 1L else 0L, dwreserved.toLong(), poutput)).toInt()
}

public fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "CompleteAuthToken", longArrayOf(phcontext, ptoken)).toInt()
}

public fun CredMarshalTargetInfo(intargetinfo: Long, buffer: Long, buffersize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "CredMarshalTargetInfo", longArrayOf(intargetinfo, buffer, buffersize)).toInt()
}

public fun CredUnmarshalTargetInfo(buffer: Long, buffersize: UInt, rettargetinfo: Long, retactualsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "CredUnmarshalTargetInfo", longArrayOf(buffer, buffersize.toLong(), rettargetinfo, retactualsize)).toInt()
}

public fun DecryptMessage(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "DecryptMessage", longArrayOf(phcontext, pmessage, messageseqno.toLong(), pfqop)).toInt()
}

public fun DeleteSecurityContext(phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "DeleteSecurityContext", longArrayOf(phcontext)).toInt()
}

public fun DeleteSecurityPackageA(pszpackagename: PCSTR): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "DeleteSecurityPackageA", longArrayOf(pszpackagename)).toInt()
}

public fun DeleteSecurityPackageW(pszpackagename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "DeleteSecurityPackageW", longArrayOf(pszpackagename)).toInt()
}

public fun EncryptMessage(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "EncryptMessage", longArrayOf(phcontext, fqop.toLong(), pmessage, messageseqno.toLong())).toInt()
}

public fun EnumerateSecurityPackagesA(pcpackages: Long, pppackageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "EnumerateSecurityPackagesA", longArrayOf(pcpackages, pppackageinfo)).toInt()
}

public fun EnumerateSecurityPackagesW(pcpackages: Long, pppackageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "EnumerateSecurityPackagesW", longArrayOf(pcpackages, pppackageinfo)).toInt()
}

public fun ExportSecurityContext(phcontext: Long, fflags: EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext: Long, ptoken: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ExportSecurityContext", longArrayOf(phcontext, fflags.toLong(), ppackedcontext, ptoken)).toInt()
}

public fun FreeContextBuffer(pvcontextbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "FreeContextBuffer", longArrayOf(pvcontextbuffer)).toInt()
}

public fun FreeCredentialsHandle(phcredential: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "FreeCredentialsHandle", longArrayOf(phcredential)).toInt()
}

public fun GetComputerObjectNameA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "GetComputerObjectNameA", longArrayOf(nameformat.toLong(), lpnamebuffer, nsize))
    return (rawRet and 0xFFL) != 0L
}

public fun GetComputerObjectNameW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "GetComputerObjectNameW", longArrayOf(nameformat.toLong(), lpnamebuffer, nsize))
    return (rawRet and 0xFFL) != 0L
}

public fun GetUserNameExA(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PSTR, nsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "GetUserNameExA", longArrayOf(nameformat.toLong(), lpnamebuffer, nsize))
    return (rawRet and 0xFFL) != 0L
}

public fun GetUserNameExW(nameformat: EXTENDED_NAME_FORMAT, lpnamebuffer: PWSTR, nsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "GetUserNameExW", longArrayOf(nameformat.toLong(), lpnamebuffer, nsize))
    return (rawRet and 0xFFL) != 0L
}

public fun ImpersonateSecurityContext(phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ImpersonateSecurityContext", longArrayOf(phcontext)).toInt()
}

public fun ImportSecurityContextA(pszpackage: PCSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ImportSecurityContextA", longArrayOf(pszpackage, ppackedcontext, token, phcontext)).toInt()
}

public fun ImportSecurityContextW(pszpackage: PCWSTR, ppackedcontext: Long, token: Long, phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ImportSecurityContextW", longArrayOf(pszpackage, ppackedcontext, token, phcontext)).toInt()
}

public fun InitSecurityInterfaceA(): Long {
    return Win32DynamicFfi.invoke("secur32.dll", "InitSecurityInterfaceA", longArrayOf())
}

public fun InitSecurityInterfaceW(): Long {
    return Win32DynamicFfi.invoke("secur32.dll", "InitSecurityInterfaceW", longArrayOf())
}

public fun InitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "InitializeSecurityContextA", longArrayOf(phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun InitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "InitializeSecurityContextW", longArrayOf(phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun LsaAddAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaAddAccountRights", longArrayOf(policyhandle, accountsid, userrights, countofrights.toLong())).toInt()
}

public fun LsaCallAuthenticationPackage(lsahandle: HANDLE, authenticationpackage: UInt, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaCallAuthenticationPackage", longArrayOf(lsahandle, authenticationpackage.toLong(), protocolsubmitbuffer, submitbufferlength.toLong(), protocolreturnbuffer, returnbufferlength, protocolstatus)).toInt()
}

public fun LsaClose(objecthandle: LSA_HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaClose", longArrayOf(objecthandle)).toInt()
}

public fun LsaConnectUntrusted(lsahandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaConnectUntrusted", longArrayOf(lsahandle)).toInt()
}

public fun LsaCreateTrustedDomainEx(policyhandle: LSA_HANDLE, trusteddomaininformation: Long, authenticationinformation: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaCreateTrustedDomainEx", longArrayOf(policyhandle, trusteddomaininformation, authenticationinformation, desiredaccess.toLong(), trusteddomainhandle)).toInt()
}

public fun LsaDeleteTrustedDomain(policyhandle: LSA_HANDLE, trusteddomainsid: PSID): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaDeleteTrustedDomain", longArrayOf(policyhandle, trusteddomainsid)).toInt()
}

public fun LsaDeregisterLogonProcess(lsahandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaDeregisterLogonProcess", longArrayOf(lsahandle)).toInt()
}

public fun LsaEnumerateAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, userrights: Long, countofrights: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaEnumerateAccountRights", longArrayOf(policyhandle, accountsid, userrights, countofrights)).toInt()
}

public fun LsaEnumerateAccountsWithUserRight(policyhandle: LSA_HANDLE, userright: Long, buffer: Long, countreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaEnumerateAccountsWithUserRight", longArrayOf(policyhandle, userright, buffer, countreturned)).toInt()
}

public fun LsaEnumerateLogonSessions(logonsessioncount: Long, logonsessionlist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaEnumerateLogonSessions", longArrayOf(logonsessioncount, logonsessionlist)).toInt()
}

public fun LsaEnumerateTrustedDomains(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaEnumerateTrustedDomains", longArrayOf(policyhandle, enumerationcontext, buffer, preferedmaximumlength.toLong(), countreturned)).toInt()
}

public fun LsaEnumerateTrustedDomainsEx(policyhandle: LSA_HANDLE, enumerationcontext: Long, buffer: Long, preferedmaximumlength: UInt, countreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaEnumerateTrustedDomainsEx", longArrayOf(policyhandle, enumerationcontext, buffer, preferedmaximumlength.toLong(), countreturned)).toInt()
}

public fun LsaFreeMemory(buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaFreeMemory", longArrayOf(buffer)).toInt()
}

public fun LsaFreeReturnBuffer(buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaFreeReturnBuffer", longArrayOf(buffer)).toInt()
}

public fun LsaGetAppliedCAPIDs(systemname: Long, capids: Long, capidcount: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaGetAppliedCAPIDs", longArrayOf(systemname, capids, capidcount)).toInt()
}

public fun LsaGetLogonSessionData(logonid: Long, pplogonsessiondata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaGetLogonSessionData", longArrayOf(logonid, pplogonsessiondata)).toInt()
}

public fun LsaLogonUser(lsahandle: HANDLE, originname: Long, logontype: SECURITY_LOGON_TYPE, authenticationpackage: UInt, authenticationinformation: Long, authenticationinformationlength: UInt, localgroups: Long, sourcecontext: Long, profilebuffer: Long, profilebufferlength: Long, logonid: Long, token: Long, quotas: Long, substatus: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaLogonUser", longArrayOf(lsahandle, originname, (logontype.value.toLong() and 0xFFFF_FFFFL), authenticationpackage.toLong(), authenticationinformation, authenticationinformationlength.toLong(), localgroups, sourcecontext, profilebuffer, profilebufferlength, logonid, token, quotas, substatus)).toInt()
}

public fun LsaLookupAuthenticationPackage(lsahandle: HANDLE, packagename: Long, authenticationpackage: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaLookupAuthenticationPackage", longArrayOf(lsahandle, packagename, authenticationpackage)).toInt()
}

public fun LsaLookupNames(policyhandle: LSA_HANDLE, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaLookupNames", longArrayOf(policyhandle, count.toLong(), names, referenceddomains, sids)).toInt()
}

public fun LsaLookupNames2(policyhandle: LSA_HANDLE, flags: UInt, count: UInt, names: Long, referenceddomains: Long, sids: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaLookupNames2", longArrayOf(policyhandle, flags.toLong(), count.toLong(), names, referenceddomains, sids)).toInt()
}

public fun LsaLookupSids(policyhandle: LSA_HANDLE, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaLookupSids", longArrayOf(policyhandle, count.toLong(), sids, referenceddomains, names)).toInt()
}

public fun LsaLookupSids2(policyhandle: LSA_HANDLE, lookupoptions: UInt, count: UInt, sids: Long, referenceddomains: Long, names: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaLookupSids2", longArrayOf(policyhandle, lookupoptions.toLong(), count.toLong(), sids, referenceddomains, names)).toInt()
}

public fun LsaNtStatusToWinError(status: NTSTATUS): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaNtStatusToWinError", longArrayOf(status.toLong())).toUInt()
}

public fun LsaOpenPolicy(systemname: Long, objectattributes: Long, desiredaccess: UInt, policyhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaOpenPolicy", longArrayOf(systemname, objectattributes, desiredaccess.toLong(), policyhandle)).toInt()
}

public fun LsaOpenTrustedDomainByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, desiredaccess: UInt, trusteddomainhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaOpenTrustedDomainByName", longArrayOf(policyhandle, trusteddomainname, desiredaccess.toLong(), trusteddomainhandle)).toInt()
}

public fun LsaQueryCAPs(capids: Long, capidcount: UInt, caps: Long, capcount: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryCAPs", longArrayOf(capids, capidcount.toLong(), caps, capcount)).toInt()
}

public fun LsaQueryDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryDomainInformationPolicy", longArrayOf(policyhandle, informationclass.toLong(), buffer)).toInt()
}

public fun LsaQueryForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryForestTrustInformation", longArrayOf(policyhandle, trusteddomainname, foresttrustinfo)).toInt()
}

public fun LsaQueryForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryForestTrustInformation2", longArrayOf(policyhandle, trusteddomainname, highestrecordtype.toLong(), foresttrustinfo)).toInt()
}

public fun LsaQueryInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryInformationPolicy", longArrayOf(policyhandle, informationclass.toLong(), buffer)).toInt()
}

public fun LsaQueryTrustedDomainInfo(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryTrustedDomainInfo", longArrayOf(policyhandle, trusteddomainsid, informationclass.toLong(), buffer)).toInt()
}

public fun LsaQueryTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaQueryTrustedDomainInfoByName", longArrayOf(policyhandle, trusteddomainname, informationclass.toLong(), buffer)).toInt()
}

public fun LsaRegisterLogonProcess(logonprocessname: Long, lsahandle: Long, securitymode: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaRegisterLogonProcess", longArrayOf(logonprocessname, lsahandle, securitymode)).toInt()
}

public fun LsaRegisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaRegisterPolicyChangeNotification", longArrayOf(informationclass.toLong(), notificationeventhandle)).toInt()
}

public fun LsaRemoveAccountRights(policyhandle: LSA_HANDLE, accountsid: PSID, allrights: Boolean, userrights: Long, countofrights: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaRemoveAccountRights", longArrayOf(policyhandle, accountsid, if (allrights) 1L else 0L, userrights, countofrights.toLong())).toInt()
}

public fun LsaRetrievePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaRetrievePrivateData", longArrayOf(policyhandle, keyname, privatedata)).toInt()
}

public fun LsaSetCAPs(capdns: Long, capdncount: UInt, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetCAPs", longArrayOf(capdns, capdncount.toLong(), flags.toLong())).toInt()
}

public fun LsaSetDomainInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_DOMAIN_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetDomainInformationPolicy", longArrayOf(policyhandle, informationclass.toLong(), buffer)).toInt()
}

public fun LsaSetForestTrustInformation(policyhandle: LSA_HANDLE, trusteddomainname: Long, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetForestTrustInformation", longArrayOf(policyhandle, trusteddomainname, foresttrustinfo, if (checkonly) 1L else 0L, collisioninfo)).toInt()
}

public fun LsaSetForestTrustInformation2(policyhandle: LSA_HANDLE, trusteddomainname: Long, highestrecordtype: LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo: Long, checkonly: Boolean, collisioninfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetForestTrustInformation2", longArrayOf(policyhandle, trusteddomainname, highestrecordtype.toLong(), foresttrustinfo, if (checkonly) 1L else 0L, collisioninfo)).toInt()
}

public fun LsaSetInformationPolicy(policyhandle: LSA_HANDLE, informationclass: POLICY_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetInformationPolicy", longArrayOf(policyhandle, informationclass.toLong(), buffer)).toInt()
}

public fun LsaSetTrustedDomainInfoByName(policyhandle: LSA_HANDLE, trusteddomainname: Long, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetTrustedDomainInfoByName", longArrayOf(policyhandle, trusteddomainname, informationclass.toLong(), buffer)).toInt()
}

public fun LsaSetTrustedDomainInformation(policyhandle: LSA_HANDLE, trusteddomainsid: PSID, informationclass: TRUSTED_INFORMATION_CLASS, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaSetTrustedDomainInformation", longArrayOf(policyhandle, trusteddomainsid, informationclass.toLong(), buffer)).toInt()
}

public fun LsaStorePrivateData(policyhandle: LSA_HANDLE, keyname: Long, privatedata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "LsaStorePrivateData", longArrayOf(policyhandle, keyname, privatedata)).toInt()
}

public fun LsaUnregisterPolicyChangeNotification(informationclass: POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "LsaUnregisterPolicyChangeNotification", longArrayOf(informationclass.toLong(), notificationeventhandle)).toInt()
}

public fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "MakeSignature", longArrayOf(phcontext, fqop.toLong(), pmessage, messageseqno.toLong())).toInt()
}

public fun QueryContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QueryContextAttributesA", longArrayOf(phcontext, ulattribute.toLong(), pbuffer)).toInt()
}

public fun QueryContextAttributesExA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "QueryContextAttributesExA", longArrayOf(phcontext, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun QueryContextAttributesExW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "QueryContextAttributesExW", longArrayOf(phcontext, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun QueryContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QueryContextAttributesW", longArrayOf(phcontext, ulattribute.toLong(), pbuffer)).toInt()
}

public fun QueryCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QueryCredentialsAttributesA", longArrayOf(phcredential, ulattribute.toLong(), pbuffer)).toInt()
}

public fun QueryCredentialsAttributesExA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "QueryCredentialsAttributesExA", longArrayOf(phcredential, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun QueryCredentialsAttributesExW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "QueryCredentialsAttributesExW", longArrayOf(phcredential, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun QueryCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QueryCredentialsAttributesW", longArrayOf(phcredential, ulattribute.toLong(), pbuffer)).toInt()
}

public fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QuerySecurityContextToken", longArrayOf(phcontext, token)).toInt()
}

public fun QuerySecurityPackageInfoA(pszpackagename: PCSTR, pppackageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QuerySecurityPackageInfoA", longArrayOf(pszpackagename, pppackageinfo)).toInt()
}

public fun QuerySecurityPackageInfoW(pszpackagename: PCWSTR, pppackageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QuerySecurityPackageInfoW", longArrayOf(pszpackagename, pppackageinfo)).toInt()
}

public fun RevertSecurityContext(phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "RevertSecurityContext", longArrayOf(phcontext)).toInt()
}

public fun RtlDecryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "SystemFunction041", longArrayOf(memory, memorysize.toLong(), optionflags.toLong())).toInt()
}

public fun RtlEncryptMemory(memory: Long, memorysize: UInt, optionflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("advapi32.dll", "SystemFunction040", longArrayOf(memory, memorysize.toLong(), optionflags.toLong())).toInt()
}

public fun RtlGenRandom(randombuffer: Long, randombufferlength: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "SystemFunction036", longArrayOf(randombuffer, randombufferlength.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SLAcquireGenuineTicket(ppticketblob: Long, pcbticketblob: Long, pwsztemplateid: PCWSTR, pwszserverurl: PCWSTR, pwszclienttoken: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("slcext.dll", "SLAcquireGenuineTicket", longArrayOf(ppticketblob, pcbticketblob, pwsztemplateid, pwszserverurl, pwszclienttoken)).toInt()
}

public fun SLActivateProduct(hslc: Long, pproductskuid: Long, cbappspecificdata: UInt, pvappspecificdata: Long, pactivationinfo: Long, pwszproxyserver: PCWSTR, wproxyport: UShort): HRESULT {
    return Win32DynamicFfi.invoke("slcext.dll", "SLActivateProduct", longArrayOf(hslc, pproductskuid, cbappspecificdata.toLong(), pvappspecificdata, pactivationinfo, pwszproxyserver, wproxyport.toLong())).toInt()
}

public fun SLClose(hslc: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLClose", longArrayOf(hslc)).toInt()
}

public fun SLConsumeRight(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLConsumeRight", longArrayOf(hslc, pappid, pproductskuid, pwszrightname, pvreserved)).toInt()
}

public fun SLDepositOfflineConfirmationId(hslc: Long, pproductskuid: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLDepositOfflineConfirmationId", longArrayOf(hslc, pproductskuid, pwszinstallationid, pwszconfirmationid)).toInt()
}

public fun SLDepositOfflineConfirmationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, pwszinstallationid: PCWSTR, pwszconfirmationid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLDepositOfflineConfirmationIdEx", longArrayOf(hslc, pproductskuid, pactivationinfo, pwszinstallationid, pwszconfirmationid)).toInt()
}

public fun SLFireEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLFireEvent", longArrayOf(hslc, pwszeventid, papplicationid)).toInt()
}

public fun SLGenerateOfflineInstallationId(hslc: Long, pproductskuid: Long, ppwszinstallationid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGenerateOfflineInstallationId", longArrayOf(hslc, pproductskuid, ppwszinstallationid)).toInt()
}

public fun SLGenerateOfflineInstallationIdEx(hslc: Long, pproductskuid: Long, pactivationinfo: Long, ppwszinstallationid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGenerateOfflineInstallationIdEx", longArrayOf(hslc, pproductskuid, pactivationinfo, ppwszinstallationid)).toInt()
}

public fun SLGetApplicationInformation(hslc: Long, papplicationid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetApplicationInformation", longArrayOf(hslc, papplicationid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetGenuineInformation", longArrayOf(pqueryid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetInstalledProductKeyIds(hslc: Long, pproductskuid: Long, pnproductkeyids: Long, ppproductkeyids: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetInstalledProductKeyIds", longArrayOf(hslc, pproductskuid, pnproductkeyids, ppproductkeyids)).toInt()
}

public fun SLGetLicense(hslc: Long, plicensefileid: Long, pcblicensefile: Long, ppblicensefile: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetLicense", longArrayOf(hslc, plicensefileid, pcblicensefile, ppblicensefile)).toInt()
}

public fun SLGetLicenseFileId(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetLicenseFileId", longArrayOf(hslc, cblicenseblob.toLong(), pblicenseblob, plicensefileid)).toInt()
}

public fun SLGetLicenseInformation(hslc: Long, psllicenseid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetLicenseInformation", longArrayOf(hslc, psllicenseid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetLicensingStatusInformation(hslc: Long, pappid: Long, pproductskuid: Long, pwszrightname: PCWSTR, pnstatuscount: Long, pplicensingstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetLicensingStatusInformation", longArrayOf(hslc, pappid, pproductskuid, pwszrightname, pnstatuscount, pplicensingstatus)).toInt()
}

public fun SLGetPKeyId(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetPKeyId", longArrayOf(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata.toLong(), pbpkeyspecificdata, ppkeyid)).toInt()
}

public fun SLGetPKeyInformation(hslc: Long, ppkeyid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetPKeyInformation", longArrayOf(hslc, ppkeyid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetPolicyInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetPolicyInformation", longArrayOf(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetPolicyInformationDWORD(hslc: Long, pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetPolicyInformationDWORD", longArrayOf(hslc, pwszvaluename, pdwvalue)).toInt()
}

public fun SLGetProductSkuInformation(hslc: Long, pproductskuid: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetProductSkuInformation", longArrayOf(hslc, pproductskuid, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetReferralInformation(hslc: Long, ereferraltype: SLREFERRALTYPE, pskuorappid: Long, pwszvaluename: PCWSTR, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slcext.dll", "SLGetReferralInformation", longArrayOf(hslc, ereferraltype.toLong(), pskuorappid, pwszvaluename, ppwszvalue)).toInt()
}

public fun SLGetSLIDList(hslc: Long, equeryidtype: SLIDTYPE, pqueryid: Long, ereturnidtype: SLIDTYPE, pnreturnids: Long, ppreturnids: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetSLIDList", longArrayOf(hslc, equeryidtype.toLong(), pqueryid, ereturnidtype.toLong(), pnreturnids, ppreturnids)).toInt()
}

public fun SLGetServerStatus(pwszserverurl: PCWSTR, pwszacquisitiontype: PCWSTR, pwszproxyserver: PCWSTR, wproxyport: UShort, phrstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("slcext.dll", "SLGetServerStatus", longArrayOf(pwszserverurl, pwszacquisitiontype, pwszproxyserver, wproxyport.toLong(), phrstatus)).toInt()
}

public fun SLGetServiceInformation(hslc: Long, pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetServiceInformation", longArrayOf(hslc, pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetWindowsInformation(pwszvaluename: PCWSTR, pedatatype: Long, pcbvalue: Long, ppbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetWindowsInformation", longArrayOf(pwszvaluename, pedatatype, pcbvalue, ppbvalue)).toInt()
}

public fun SLGetWindowsInformationDWORD(pwszvaluename: PCWSTR, pdwvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLGetWindowsInformationDWORD", longArrayOf(pwszvaluename, pdwvalue)).toInt()
}

public fun SLInstallLicense(hslc: Long, cblicenseblob: UInt, pblicenseblob: Long, plicensefileid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLInstallLicense", longArrayOf(hslc, cblicenseblob.toLong(), pblicenseblob, plicensefileid)).toInt()
}

public fun SLInstallProofOfPurchase(hslc: Long, pwszpkeyalgorithm: PCWSTR, pwszpkeystring: PCWSTR, cbpkeyspecificdata: UInt, pbpkeyspecificdata: Long, ppkeyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLInstallProofOfPurchase", longArrayOf(hslc, pwszpkeyalgorithm, pwszpkeystring, cbpkeyspecificdata.toLong(), pbpkeyspecificdata, ppkeyid)).toInt()
}

public fun SLIsGenuineLocal(pappid: Long, pgenuinestate: Long, puioptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("slwga.dll", "SLIsGenuineLocal", longArrayOf(pappid, pgenuinestate, puioptions)).toInt()
}

public fun SLOpen(phslc: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLOpen", longArrayOf(phslc)).toInt()
}

public fun SLQueryLicenseValueFromApp(valuename: PCWSTR, valuetype: Long, databuffer: Long, datasize: UInt, resultdatasize: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-slapi-l1-1-0.dll", "SLQueryLicenseValueFromApp", longArrayOf(valuename, valuetype, databuffer, datasize.toLong(), resultdatasize)).toInt()
}

public fun SLRegisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLRegisterEvent", longArrayOf(hslc, pwszeventid, papplicationid, hevent)).toInt()
}

public fun SLSetCurrentProductKey(hslc: Long, pproductskuid: Long, pproductkeyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLSetCurrentProductKey", longArrayOf(hslc, pproductskuid, pproductkeyid)).toInt()
}

public fun SLSetGenuineInformation(pqueryid: Long, pwszvaluename: PCWSTR, edatatype: SLDATATYPE, cbvalue: UInt, pbvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLSetGenuineInformation", longArrayOf(pqueryid, pwszvaluename, edatatype.toLong(), cbvalue.toLong(), pbvalue)).toInt()
}

public fun SLUninstallLicense(hslc: Long, plicensefileid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLUninstallLicense", longArrayOf(hslc, plicensefileid)).toInt()
}

public fun SLUninstallProofOfPurchase(hslc: Long, ppkeyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLUninstallProofOfPurchase", longArrayOf(hslc, ppkeyid)).toInt()
}

public fun SLUnregisterEvent(hslc: Long, pwszeventid: PCWSTR, papplicationid: Long, hevent: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("slc.dll", "SLUnregisterEvent", longArrayOf(hslc, pwszeventid, papplicationid, hevent)).toInt()
}

public fun SaslAcceptSecurityContext(phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: ASC_REQ_FLAGS, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslAcceptSecurityContext", longArrayOf(phcredential, phcontext, pinput, fcontextreq.toLong(), targetdatarep.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SaslEnumerateProfilesA(profilelist: Long, profilecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslEnumerateProfilesA", longArrayOf(profilelist, profilecount)).toInt()
}

public fun SaslEnumerateProfilesW(profilelist: Long, profilecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslEnumerateProfilesW", longArrayOf(profilelist, profilecount)).toInt()
}

public fun SaslGetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt, needed: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslGetContextOption", longArrayOf(contexthandle, option.toLong(), value, size.toLong(), needed)).toInt()
}

public fun SaslGetProfilePackageA(profilename: PCSTR, packageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslGetProfilePackageA", longArrayOf(profilename, packageinfo)).toInt()
}

public fun SaslGetProfilePackageW(profilename: PCWSTR, packageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslGetProfilePackageW", longArrayOf(profilename, packageinfo)).toInt()
}

public fun SaslIdentifyPackageA(pinput: Long, packageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslIdentifyPackageA", longArrayOf(pinput, packageinfo)).toInt()
}

public fun SaslIdentifyPackageW(pinput: Long, packageinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslIdentifyPackageW", longArrayOf(pinput, packageinfo)).toInt()
}

public fun SaslInitializeSecurityContextA(phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslInitializeSecurityContextA", longArrayOf(phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SaslInitializeSecurityContextW(phcredential: Long, phcontext: Long, psztargetname: PCWSTR, fcontextreq: ISC_REQ_FLAGS, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslInitializeSecurityContextW", longArrayOf(phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SaslSetContextOption(contexthandle: Long, option: UInt, value: Long, size: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SaslSetContextOption", longArrayOf(contexthandle, option.toLong(), value, size.toLong())).toInt()
}

public fun SendSAS(asuser: BOOL) {
    Win32DynamicFfi.invoke("sas.dll", "SendSAS", longArrayOf(asuser.toLong()))
}

public fun SetContextAttributesA(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SetContextAttributesA", longArrayOf(phcontext, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun SetContextAttributesW(phcontext: Long, ulattribute: SECPKG_ATTR, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SetContextAttributesW", longArrayOf(phcontext, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun SetCredentialsAttributesA(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SetCredentialsAttributesA", longArrayOf(phcredential, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun SetCredentialsAttributesW(phcredential: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SetCredentialsAttributesW", longArrayOf(phcredential, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun SslCrackCertificate(pbcertificate: Long, cbcertificate: UInt, dwflags: UInt, ppcertificate: Long): BOOL {
    return Win32DynamicFfi.invoke("schannel.dll", "SslCrackCertificate", longArrayOf(pbcertificate, cbcertificate.toLong(), dwflags.toLong(), ppcertificate)).toInt()
}

public fun SslDeserializeCertificateStore(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("schannel.dll", "SslDeserializeCertificateStore", longArrayOf(run { val buf = ByteArray(16); buf[0] = (serializedcertificatestore.cbData.toInt() and 0xFF).toByte(); buf[1] = ((serializedcertificatestore.cbData.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((serializedcertificatestore.cbData.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((serializedcertificatestore.cbData.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (serializedcertificatestore.pbData and 0xFF).toByte(); buf[9] = ((serializedcertificatestore.pbData ushr 8) and 0xFF).toByte(); buf[10] = ((serializedcertificatestore.pbData ushr 16) and 0xFF).toByte(); buf[11] = ((serializedcertificatestore.pbData ushr 24) and 0xFF).toByte(); buf[12] = ((serializedcertificatestore.pbData ushr 32) and 0xFF).toByte(); buf[13] = ((serializedcertificatestore.pbData ushr 40) and 0xFF).toByte(); buf[14] = ((serializedcertificatestore.pbData ushr 48) and 0xFF).toByte(); buf[15] = ((serializedcertificatestore.pbData ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, ppcertcontext)).toInt()
}

public fun SslEmptyCacheA(psztargetname: PCSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("schannel.dll", "SslEmptyCacheA", longArrayOf(psztargetname, dwflags.toLong())).toInt()
}

public fun SslEmptyCacheW(psztargetname: PCWSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("schannel.dll", "SslEmptyCacheW", longArrayOf(psztargetname, dwflags.toLong())).toInt()
}

public fun SslFreeCertificate(pcertificate: Long) {
    Win32DynamicFfi.invoke("schannel.dll", "SslFreeCertificate", longArrayOf(pcertificate))
}

public fun SslGenerateRandomBits(prandomdata: Long, crandomdata: Int) {
    Win32DynamicFfi.invoke("schannel.dll", "SslGenerateRandomBits", longArrayOf(prandomdata, crandomdata.toLong()))
}

public fun SslGetExtensions(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT {
    return Win32DynamicFfi.invoke("schannel.dll", "SslGetExtensions", longArrayOf(clienthello, clienthellobytesize.toLong(), genericextensions, genericextensionscount.toLong(), bytestoread, flags.toLong())).toInt()
}

public fun SslGetMaximumKeySize(reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("schannel.dll", "SslGetMaximumKeySize", longArrayOf(reserved.toLong())).toUInt()
}

public fun SslGetServerIdentity(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("schannel.dll", "SslGetServerIdentity", longArrayOf(clienthello, clienthellosize.toLong(), serveridentity, serveridentitysize, flags.toLong())).toInt()
}

public fun SspiCompareAuthIdentities(authidentity1: Long, authidentity2: Long, samesupplieduser: Long, samesuppliedidentity: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiCompareAuthIdentities", longArrayOf(authidentity1, authidentity2, samesupplieduser, samesuppliedidentity)).toInt()
}

public fun SspiCopyAuthIdentity(authdata: Long, authdatacopy: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiCopyAuthIdentity", longArrayOf(authdata, authdatacopy)).toInt()
}

public fun SspiDecryptAuthIdentity(encryptedauthdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiDecryptAuthIdentity", longArrayOf(encryptedauthdata)).toInt()
}

public fun SspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "SspiDecryptAuthIdentityEx", longArrayOf(options.toLong(), encryptedauthdata)).toInt()
}

public fun SspiEncodeAuthIdentityAsStrings(pauthidentity: Long, ppszusername: Long, ppszdomainname: Long, ppszpackedcredentialsstring: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiEncodeAuthIdentityAsStrings", longArrayOf(pauthidentity, ppszusername, ppszdomainname, ppszpackedcredentialsstring)).toInt()
}

public fun SspiEncodeStringsAsAuthIdentity(pszusername: PCWSTR, pszdomainname: PCWSTR, pszpackedcredentialsstring: PCWSTR, ppauthidentity: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiEncodeStringsAsAuthIdentity", longArrayOf(pszusername, pszdomainname, pszpackedcredentialsstring, ppauthidentity)).toInt()
}

public fun SspiEncryptAuthIdentity(authdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiEncryptAuthIdentity", longArrayOf(authdata)).toInt()
}

public fun SspiEncryptAuthIdentityEx(options: UInt, authdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "SspiEncryptAuthIdentityEx", longArrayOf(options.toLong(), authdata)).toInt()
}

public fun SspiExcludePackage(authidentity: Long, pszpackagename: PCWSTR, ppnewauthidentity: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiExcludePackage", longArrayOf(authidentity, pszpackagename, ppnewauthidentity)).toInt()
}

public fun SspiFreeAuthIdentity(authdata: Long) {
    Win32DynamicFfi.invoke("secur32.dll", "SspiFreeAuthIdentity", longArrayOf(authdata))
}

public fun SspiGetTargetHostName(psztargetname: PCWSTR, pszhostname: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiGetTargetHostName", longArrayOf(psztargetname, pszhostname)).toInt()
}

public fun SspiIsAuthIdentityEncrypted(encryptedauthdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "SspiIsAuthIdentityEncrypted", longArrayOf(encryptedauthdata))
    return (rawRet and 0xFFL) != 0L
}

public fun SspiIsPromptingNeeded(errororntstatus: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("credui.dll", "SspiIsPromptingNeeded", longArrayOf(errororntstatus.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SspiLocalFree(databuffer: Long) {
    Win32DynamicFfi.invoke("secur32.dll", "SspiLocalFree", longArrayOf(databuffer))
}

public fun SspiMarshalAuthIdentity(authidentity: Long, authidentitylength: Long, authidentitybytearray: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiMarshalAuthIdentity", longArrayOf(authidentity, authidentitylength, authidentitybytearray)).toInt()
}

public fun SspiPrepareForCredRead(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiPrepareForCredRead", longArrayOf(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname)).toInt()
}

public fun SspiPrepareForCredWrite(authidentity: Long, psztargetname: PCWSTR, pcredmancredentialtype: Long, ppszcredmantargetname: Long, ppszcredmanusername: Long, ppcredentialblob: Long, pcredentialblobsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiPrepareForCredWrite", longArrayOf(authidentity, psztargetname, pcredmancredentialtype, ppszcredmantargetname, ppszcredmanusername, ppcredentialblob, pcredentialblobsize)).toInt()
}

public fun SspiPromptForCredentialsA(psztargetname: PCSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "SspiPromptForCredentialsA", longArrayOf(psztargetname, puiinfo, dwautherror.toLong(), pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags.toLong())).toUInt()
}

public fun SspiPromptForCredentialsW(psztargetname: PCWSTR, puiinfo: Long, dwautherror: UInt, pszpackage: PCWSTR, pinputauthidentity: Long, ppauthidentity: Long, pfsave: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "SspiPromptForCredentialsW", longArrayOf(psztargetname, puiinfo, dwautherror.toLong(), pszpackage, pinputauthidentity, ppauthidentity, pfsave, dwflags.toLong())).toUInt()
}

public fun SspiSetChannelBindingFlags(pbindings: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("sspicli.dll", "SspiSetChannelBindingFlags", longArrayOf(pbindings, flags.toLong())).toInt()
}

public fun SspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: PCSTR, ppauthidentity: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiUnmarshalAuthIdentity", longArrayOf(authidentitylength.toLong(), authidentitybytearray, ppauthidentity)).toInt()
}

public fun SspiValidateAuthIdentity(authdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SspiValidateAuthIdentity", longArrayOf(authdata)).toInt()
}

public fun SspiZeroAuthIdentity(authdata: Long) {
    Win32DynamicFfi.invoke("secur32.dll", "SspiZeroAuthIdentity", longArrayOf(authdata))
}

public fun TokenBindingDeleteAllBindings(): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingDeleteAllBindings", longArrayOf()).toInt()
}

public fun TokenBindingDeleteBinding(targeturl: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingDeleteBinding", longArrayOf(targeturl)).toInt()
}

public fun TokenBindingGenerateBinding(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl: PCWSTR, bindingtype: TOKENBINDING_TYPE, tlsekm: Long, tlsekmsize: UInt, extensionformat: TOKENBINDING_EXTENSION_FORMAT, extensiondata: Long, tokenbinding: Long, tokenbindingsize: Long, resultdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGenerateBinding", longArrayOf(keytype.toLong(), targeturl, bindingtype.toLong(), tlsekm, tlsekmsize.toLong(), extensionformat.toLong(), extensiondata, tokenbinding, tokenbindingsize, resultdata)).toInt()
}

public fun TokenBindingGenerateID(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, publickey: Long, publickeysize: UInt, resultdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGenerateID", longArrayOf(keytype.toLong(), publickey, publickeysize.toLong(), resultdata)).toInt()
}

public fun TokenBindingGenerateIDForUri(keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi: PCWSTR, resultdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGenerateIDForUri", longArrayOf(keytype.toLong(), targeturi, resultdata)).toInt()
}

public fun TokenBindingGenerateMessage(tokenbindings: Long, tokenbindingssize: Long, tokenbindingscount: UInt, tokenbindingmessage: Long, tokenbindingmessagesize: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGenerateMessage", longArrayOf(tokenbindings, tokenbindingssize, tokenbindingscount.toLong(), tokenbindingmessage, tokenbindingmessagesize)).toInt()
}

public fun TokenBindingGetHighestSupportedVersion(majorversion: Long, minorversion: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGetHighestSupportedVersion", longArrayOf(majorversion, minorversion)).toInt()
}

public fun TokenBindingGetKeyTypesClient(keytypes: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGetKeyTypesClient", longArrayOf(keytypes)).toInt()
}

public fun TokenBindingGetKeyTypesServer(keytypes: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingGetKeyTypesServer", longArrayOf(keytypes)).toInt()
}

public fun TokenBindingVerifyMessage(tokenbindingmessage: Long, tokenbindingmessagesize: UInt, keytype: TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm: Long, tlsekmsize: UInt, resultlist: Long): HRESULT {
    return Win32DynamicFfi.invoke("tokenbinding.dll", "TokenBindingVerifyMessage", longArrayOf(tokenbindingmessage, tokenbindingmessagesize.toLong(), keytype.toLong(), tlsekm, tlsekmsize.toLong(), resultlist)).toInt()
}

public fun TranslateNameA(lpaccountname: PCSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PSTR, nsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "TranslateNameA", longArrayOf(lpaccountname, accountnameformat.toLong(), desirednameformat.toLong(), lptranslatedname, nsize))
    return (rawRet and 0xFFL) != 0L
}

public fun TranslateNameW(lpaccountname: PCWSTR, accountnameformat: EXTENDED_NAME_FORMAT, desirednameformat: EXTENDED_NAME_FORMAT, lptranslatedname: PWSTR, nsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("secur32.dll", "TranslateNameW", longArrayOf(lpaccountname, accountnameformat.toLong(), desirednameformat.toLong(), lptranslatedname, nsize))
    return (rawRet and 0xFFL) != 0L
}

public fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "VerifySignature", longArrayOf(phcontext, pmessage, messageseqno.toLong(), pfqop)).toInt()
}
