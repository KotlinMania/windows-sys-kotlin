package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public fun CredDeleteA(targetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredDeleteA", longArrayOf(targetname, type.toLong(), flags.toLong())).toInt()
}

public fun CredDeleteW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredDeleteW", longArrayOf(targetname, type.toLong(), flags.toLong())).toInt()
}

public fun CredEnumerateA(filter: PCSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredEnumerateA", longArrayOf(filter, flags.toLong(), count, credential)).toInt()
}

public fun CredEnumerateW(filter: PCWSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredEnumerateW", longArrayOf(filter, flags.toLong(), count, credential)).toInt()
}

public fun CredFindBestCredentialA(targetname: PCSTR, type: UInt, flags: UInt, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredFindBestCredentialA", longArrayOf(targetname, type.toLong(), flags.toLong(), credential)).toInt()
}

public fun CredFindBestCredentialW(targetname: PCWSTR, type: UInt, flags: UInt, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredFindBestCredentialW", longArrayOf(targetname, type.toLong(), flags.toLong(), credential)).toInt()
}

public fun CredFree(buffer: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "CredFree", longArrayOf(buffer))
}

public fun CredGetSessionTypes(maximumpersistcount: UInt, maximumpersist: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredGetSessionTypes", longArrayOf(maximumpersistcount.toLong(), maximumpersist)).toInt()
}

public fun CredGetTargetInfoA(targetname: PCSTR, flags: UInt, targetinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredGetTargetInfoA", longArrayOf(targetname, flags.toLong(), targetinfo)).toInt()
}

public fun CredGetTargetInfoW(targetname: PCWSTR, flags: UInt, targetinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredGetTargetInfoW", longArrayOf(targetname, flags.toLong(), targetinfo)).toInt()
}

public fun CredIsMarshaledCredentialA(marshaledcredential: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredIsMarshaledCredentialA", longArrayOf(marshaledcredential)).toInt()
}

public fun CredIsMarshaledCredentialW(marshaledcredential: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredIsMarshaledCredentialW", longArrayOf(marshaledcredential)).toInt()
}

public fun CredIsProtectedA(pszprotectedcredentials: PCSTR, pprotectiontype: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredIsProtectedA", longArrayOf(pszprotectedcredentials, pprotectiontype)).toInt()
}

public fun CredIsProtectedW(pszprotectedcredentials: PCWSTR, pprotectiontype: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredIsProtectedW", longArrayOf(pszprotectedcredentials, pprotectiontype)).toInt()
}

public fun CredMarshalCredentialA(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredMarshalCredentialA", longArrayOf(credtype.toLong(), credential, marshaledcredential)).toInt()
}

public fun CredMarshalCredentialW(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredMarshalCredentialW", longArrayOf(credtype.toLong(), credential, marshaledcredential)).toInt()
}

public fun CredPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pszusername: PCSTR, pszpassword: PCSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL {
    return Win32DynamicFfi.invoke("credui.dll", "CredPackAuthenticationBufferA", longArrayOf(dwflags.toLong(), pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials)).toInt()
}

public fun CredPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pszusername: PCWSTR, pszpassword: PCWSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL {
    return Win32DynamicFfi.invoke("credui.dll", "CredPackAuthenticationBufferW", longArrayOf(dwflags.toLong(), pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials)).toInt()
}

public fun CredProtectA(fasself: BOOL, pszcredentials: PCSTR, cchcredentials: UInt, pszprotectedcredentials: PSTR, pcchmaxchars: Long, protectiontype: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredProtectA", longArrayOf(fasself.toLong(), pszcredentials, cchcredentials.toLong(), pszprotectedcredentials, pcchmaxchars, protectiontype)).toInt()
}

public fun CredProtectW(fasself: BOOL, pszcredentials: PCWSTR, cchcredentials: UInt, pszprotectedcredentials: PWSTR, pcchmaxchars: Long, protectiontype: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredProtectW", longArrayOf(fasself.toLong(), pszcredentials, cchcredentials.toLong(), pszprotectedcredentials, pcchmaxchars, protectiontype)).toInt()
}

public fun CredReadA(targetname: PCSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredReadA", longArrayOf(targetname, type.toLong(), flags.toLong(), credential)).toInt()
}

public fun CredReadDomainCredentialsA(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredReadDomainCredentialsA", longArrayOf(targetinfo, flags.toLong(), count, credential)).toInt()
}

public fun CredReadDomainCredentialsW(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredReadDomainCredentialsW", longArrayOf(targetinfo, flags.toLong(), count, credential)).toInt()
}

public fun CredReadW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredReadW", longArrayOf(targetname, type.toLong(), flags.toLong(), credential)).toInt()
}

public fun CredRenameA(oldtargetname: PCSTR, newtargetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredRenameA", longArrayOf(oldtargetname, newtargetname, type.toLong(), flags.toLong())).toInt()
}

public fun CredRenameW(oldtargetname: PCWSTR, newtargetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredRenameW", longArrayOf(oldtargetname, newtargetname, type.toLong(), flags.toLong())).toInt()
}

public fun CredUICmdLinePromptForCredentialsA(psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, username: PSTR, uluserbuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUICmdLinePromptForCredentialsA", longArrayOf(psztargetname, pcontext, dwautherror.toLong(), username, uluserbuffersize.toLong(), pszpassword, ulpasswordbuffersize.toLong(), pfsave, dwflags.toLong())).toUInt()
}

public fun CredUICmdLinePromptForCredentialsW(psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, username: PWSTR, uluserbuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUICmdLinePromptForCredentialsW", longArrayOf(psztargetname, pcontext, dwautherror.toLong(), username, uluserbuffersize.toLong(), pszpassword, ulpasswordbuffersize.toLong(), pfsave, dwflags.toLong())).toUInt()
}

public fun CredUIConfirmCredentialsA(psztargetname: PCSTR, bconfirm: BOOL): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIConfirmCredentialsA", longArrayOf(psztargetname, bconfirm.toLong())).toUInt()
}

public fun CredUIConfirmCredentialsW(psztargetname: PCWSTR, bconfirm: BOOL): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIConfirmCredentialsW", longArrayOf(psztargetname, bconfirm.toLong())).toUInt()
}

public fun CredUIParseUserNameA(username: PCSTR, user: PSTR, userbuffersize: UInt, domain: PSTR, domainbuffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIParseUserNameA", longArrayOf(username, user, userbuffersize.toLong(), domain, domainbuffersize.toLong())).toUInt()
}

public fun CredUIParseUserNameW(username: PCWSTR, user: PWSTR, userbuffersize: UInt, domain: PWSTR, domainbuffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIParseUserNameW", longArrayOf(username, user, userbuffersize.toLong(), domain, domainbuffersize.toLong())).toUInt()
}

public fun CredUIPromptForCredentialsA(puiinfo: Long, psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, pszusername: PSTR, ulusernamebuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIPromptForCredentialsA", longArrayOf(puiinfo, psztargetname, pcontext, dwautherror.toLong(), pszusername, ulusernamebuffersize.toLong(), pszpassword, ulpasswordbuffersize.toLong(), save, dwflags.toLong())).toUInt()
}

public fun CredUIPromptForCredentialsW(puiinfo: Long, psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, pszusername: PWSTR, ulusernamebuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIPromptForCredentialsW", longArrayOf(puiinfo, psztargetname, pcontext, dwautherror.toLong(), pszusername, ulusernamebuffersize.toLong(), pszpassword, ulpasswordbuffersize.toLong(), save, dwflags.toLong())).toUInt()
}

public fun CredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIPromptForWindowsCredentialsA", longArrayOf(puiinfo, dwautherror.toLong(), pulauthpackage, pvinauthbuffer, ulinauthbuffersize.toLong(), ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags.toLong())).toUInt()
}

public fun CredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIPromptForWindowsCredentialsW", longArrayOf(puiinfo, dwautherror.toLong(), pulauthpackage, pvinauthbuffer, ulinauthbuffersize.toLong(), ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags.toLong())).toUInt()
}

public fun CredUIReadSSOCredW(pszrealm: PCWSTR, ppszusername: Long): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIReadSSOCredW", longArrayOf(pszrealm, ppszusername)).toUInt()
}

public fun CredUIStoreSSOCredW(pszrealm: PCWSTR, pszusername: PCWSTR, pszpassword: PCWSTR, bpersist: BOOL): UInt {
    return Win32DynamicFfi.invoke("credui.dll", "CredUIStoreSSOCredW", longArrayOf(pszrealm, pszusername, pszpassword, bpersist.toLong())).toUInt()
}

public fun CredUnPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PSTR, pcchlmaxusername: Long, pszdomainname: PSTR, pcchmaxdomainname: Long, pszpassword: PSTR, pcchmaxpassword: Long): BOOL {
    return Win32DynamicFfi.invoke("credui.dll", "CredUnPackAuthenticationBufferA", longArrayOf(dwflags.toLong(), pauthbuffer, cbauthbuffer.toLong(), pszusername, pcchlmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword)).toInt()
}

public fun CredUnPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PWSTR, pcchmaxusername: Long, pszdomainname: PWSTR, pcchmaxdomainname: Long, pszpassword: PWSTR, pcchmaxpassword: Long): BOOL {
    return Win32DynamicFfi.invoke("credui.dll", "CredUnPackAuthenticationBufferW", longArrayOf(dwflags.toLong(), pauthbuffer, cbauthbuffer.toLong(), pszusername, pcchmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword)).toInt()
}

public fun CredUnmarshalCredentialA(marshaledcredential: PCSTR, credtype: Long, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredUnmarshalCredentialA", longArrayOf(marshaledcredential, credtype, credential)).toInt()
}

public fun CredUnmarshalCredentialW(marshaledcredential: PCWSTR, credtype: Long, credential: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredUnmarshalCredentialW", longArrayOf(marshaledcredential, credtype, credential)).toInt()
}

public fun CredUnprotectA(fasself: BOOL, pszprotectedcredentials: PCSTR, cchprotectedcredentials: UInt, pszcredentials: PSTR, pcchmaxchars: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredUnprotectA", longArrayOf(fasself.toLong(), pszprotectedcredentials, cchprotectedcredentials.toLong(), pszcredentials, pcchmaxchars)).toInt()
}

public fun CredUnprotectW(fasself: BOOL, pszprotectedcredentials: PCWSTR, cchprotectedcredentials: UInt, pszcredentials: PWSTR, pcchmaxchars: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredUnprotectW", longArrayOf(fasself.toLong(), pszprotectedcredentials, cchprotectedcredentials.toLong(), pszcredentials, pcchmaxchars)).toInt()
}

public fun CredWriteA(credential: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredWriteA", longArrayOf(credential, flags.toLong())).toInt()
}

public fun CredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredWriteDomainCredentialsA", longArrayOf(targetinfo, credential, flags.toLong())).toInt()
}

public fun CredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredWriteDomainCredentialsW", longArrayOf(targetinfo, credential, flags.toLong())).toInt()
}

public fun CredWriteW(credential: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CredWriteW", longArrayOf(credential, flags.toLong())).toInt()
}

public fun GetOpenCardNameA(param0: Long): Int {
    return Win32DynamicFfi.invoke("scarddlg.dll", "GetOpenCardNameA", longArrayOf(param0)).toInt()
}

public fun GetOpenCardNameW(param0: Long): Int {
    return Win32DynamicFfi.invoke("scarddlg.dll", "GetOpenCardNameW", longArrayOf(param0)).toInt()
}

public fun KeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long) {
    Win32DynamicFfi.invoke("keycredmgr.dll", "KeyCredentialManagerFreeInformation", longArrayOf(keycredentialmanagerinfo))
}

public fun KeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("keycredmgr.dll", "KeyCredentialManagerGetInformation", longArrayOf(keycredentialmanagerinfo)).toInt()
}

public fun KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: Long, keycredentialmanageroperationerrorstates: Long): HRESULT {
    return Win32DynamicFfi.invoke("keycredmgr.dll", "KeyCredentialManagerGetOperationErrorStates", longArrayOf(keycredentialmanageroperationtype.toLong(), isready, keycredentialmanageroperationerrorstates)).toInt()
}

public fun KeyCredentialManagerShowUIOperation(hwndowner: HWND, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): HRESULT {
    return Win32DynamicFfi.invoke("keycredmgr.dll", "KeyCredentialManagerShowUIOperation", longArrayOf(hwndowner, keycredentialmanageroperationtype.toLong())).toInt()
}

public fun SCardAccessStartedEvent(): HANDLE {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardAccessStartedEvent", longArrayOf())
}

public fun SCardAddReaderToGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardAddReaderToGroupA", longArrayOf(hcontext.toLong(), szreadername, szgroupname)).toInt()
}

public fun SCardAddReaderToGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardAddReaderToGroupW", longArrayOf(hcontext.toLong(), szreadername, szgroupname)).toInt()
}

public fun SCardAudit(hcontext: ULong, dwevent: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardAudit", longArrayOf(hcontext.toLong(), dwevent.toLong())).toInt()
}

public fun SCardBeginTransaction(hcard: ULong): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardBeginTransaction", longArrayOf(hcard.toLong())).toInt()
}

public fun SCardCancel(hcontext: ULong): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardCancel", longArrayOf(hcontext.toLong())).toInt()
}

public fun SCardConnectA(hcontext: ULong, szreader: PCSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardConnectA", longArrayOf(hcontext.toLong(), szreader, dwsharemode.toLong(), dwpreferredprotocols.toLong(), phcard, pdwactiveprotocol)).toInt()
}

public fun SCardConnectW(hcontext: ULong, szreader: PCWSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardConnectW", longArrayOf(hcontext.toLong(), szreader, dwsharemode.toLong(), dwpreferredprotocols.toLong(), phcard, pdwactiveprotocol)).toInt()
}

public fun SCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardControl", longArrayOf(hcard.toLong(), dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun SCardDisconnect(hcard: ULong, dwdisposition: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardDisconnect", longArrayOf(hcard.toLong(), dwdisposition.toLong())).toInt()
}

public fun SCardDlgExtendedError(): Int {
    return Win32DynamicFfi.invoke("scarddlg.dll", "SCardDlgExtendedError", longArrayOf()).toInt()
}

public fun SCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardEndTransaction", longArrayOf(hcard.toLong(), dwdisposition.toLong())).toInt()
}

public fun SCardEstablishContext(dwscope: SCARD_SCOPE, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardEstablishContext", longArrayOf(dwscope.toLong(), pvreserved1, pvreserved2, phcontext)).toInt()
}

public fun SCardForgetCardTypeA(hcontext: ULong, szcardname: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardForgetCardTypeA", longArrayOf(hcontext.toLong(), szcardname)).toInt()
}

public fun SCardForgetCardTypeW(hcontext: ULong, szcardname: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardForgetCardTypeW", longArrayOf(hcontext.toLong(), szcardname)).toInt()
}

public fun SCardForgetReaderA(hcontext: ULong, szreadername: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardForgetReaderA", longArrayOf(hcontext.toLong(), szreadername)).toInt()
}

public fun SCardForgetReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardForgetReaderGroupA", longArrayOf(hcontext.toLong(), szgroupname)).toInt()
}

public fun SCardForgetReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardForgetReaderGroupW", longArrayOf(hcontext.toLong(), szgroupname)).toInt()
}

public fun SCardForgetReaderW(hcontext: ULong, szreadername: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardForgetReaderW", longArrayOf(hcontext.toLong(), szreadername)).toInt()
}

public fun SCardFreeMemory(hcontext: ULong, pvmem: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardFreeMemory", longArrayOf(hcontext.toLong(), pvmem)).toInt()
}

public fun SCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, pcbattrlen: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetAttrib", longArrayOf(hcard.toLong(), dwattrid.toLong(), pbattr, pcbattrlen)).toInt()
}

public fun SCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PSTR, pcchprovider: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetCardTypeProviderNameA", longArrayOf(hcontext.toLong(), szcardname, dwproviderid.toLong(), szprovider, pcchprovider)).toInt()
}

public fun SCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PWSTR, pcchprovider: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetCardTypeProviderNameW", longArrayOf(hcontext.toLong(), szcardname, dwproviderid.toLong(), szprovider, pcchprovider)).toInt()
}

public fun SCardGetDeviceTypeIdA(hcontext: ULong, szreadername: PCSTR, pdwdevicetypeid: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetDeviceTypeIdA", longArrayOf(hcontext.toLong(), szreadername, pdwdevicetypeid)).toInt()
}

public fun SCardGetDeviceTypeIdW(hcontext: ULong, szreadername: PCWSTR, pdwdevicetypeid: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetDeviceTypeIdW", longArrayOf(hcontext.toLong(), szreadername, pdwdevicetypeid)).toInt()
}

public fun SCardGetProviderIdA(hcontext: ULong, szcard: PCSTR, pguidproviderid: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetProviderIdA", longArrayOf(hcontext.toLong(), szcard, pguidproviderid)).toInt()
}

public fun SCardGetProviderIdW(hcontext: ULong, szcard: PCWSTR, pguidproviderid: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetProviderIdW", longArrayOf(hcontext.toLong(), szcard, pguidproviderid)).toInt()
}

public fun SCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: PCSTR, szdeviceinstanceid: PSTR, pcchdeviceinstanceid: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetReaderDeviceInstanceIdA", longArrayOf(hcontext.toLong(), szreadername, szdeviceinstanceid, pcchdeviceinstanceid)).toInt()
}

public fun SCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: PCWSTR, szdeviceinstanceid: PWSTR, pcchdeviceinstanceid: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetReaderDeviceInstanceIdW", longArrayOf(hcontext.toLong(), szreadername, szdeviceinstanceid, pcchdeviceinstanceid)).toInt()
}

public fun SCardGetReaderIconA(hcontext: ULong, szreadername: PCSTR, pbicon: Long, pcbicon: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetReaderIconA", longArrayOf(hcontext.toLong(), szreadername, pbicon, pcbicon)).toInt()
}

public fun SCardGetReaderIconW(hcontext: ULong, szreadername: PCWSTR, pbicon: Long, pcbicon: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetReaderIconW", longArrayOf(hcontext.toLong(), szreadername, pbicon, pcbicon)).toInt()
}

public fun SCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetStatusChangeA", longArrayOf(hcontext.toLong(), dwtimeout.toLong(), rgreaderstates, creaders.toLong())).toInt()
}

public fun SCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetStatusChangeW", longArrayOf(hcontext.toLong(), dwtimeout.toLong(), rgreaderstates, creaders.toLong())).toInt()
}

public fun SCardGetTransmitCount(hcard: ULong, pctransmitcount: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardGetTransmitCount", longArrayOf(hcard.toLong(), pctransmitcount)).toInt()
}

public fun SCardIntroduceCardTypeA(hcontext: ULong, szcardname: PCSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIntroduceCardTypeA", longArrayOf(hcontext.toLong(), szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount.toLong(), pbatr, pbatrmask, cbatrlen.toLong())).toInt()
}

public fun SCardIntroduceCardTypeW(hcontext: ULong, szcardname: PCWSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIntroduceCardTypeW", longArrayOf(hcontext.toLong(), szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount.toLong(), pbatr, pbatrmask, cbatrlen.toLong())).toInt()
}

public fun SCardIntroduceReaderA(hcontext: ULong, szreadername: PCSTR, szdevicename: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIntroduceReaderA", longArrayOf(hcontext.toLong(), szreadername, szdevicename)).toInt()
}

public fun SCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIntroduceReaderGroupA", longArrayOf(hcontext.toLong(), szgroupname)).toInt()
}

public fun SCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIntroduceReaderGroupW", longArrayOf(hcontext.toLong(), szgroupname)).toInt()
}

public fun SCardIntroduceReaderW(hcontext: ULong, szreadername: PCWSTR, szdevicename: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIntroduceReaderW", longArrayOf(hcontext.toLong(), szreadername, szdevicename)).toInt()
}

public fun SCardIsValidContext(hcontext: ULong): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardIsValidContext", longArrayOf(hcontext.toLong())).toInt()
}

public fun SCardListCardsA(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PSTR, pcchcards: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListCardsA", longArrayOf(hcontext.toLong(), pbatr, rgquidinterfaces, cguidinterfacecount.toLong(), mszcards, pcchcards)).toInt()
}

public fun SCardListCardsW(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PWSTR, pcchcards: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListCardsW", longArrayOf(hcontext.toLong(), pbatr, rgquidinterfaces, cguidinterfacecount.toLong(), mszcards, pcchcards)).toInt()
}

public fun SCardListInterfacesA(hcontext: ULong, szcard: PCSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListInterfacesA", longArrayOf(hcontext.toLong(), szcard, pguidinterfaces, pcguidinterfaces)).toInt()
}

public fun SCardListInterfacesW(hcontext: ULong, szcard: PCWSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListInterfacesW", longArrayOf(hcontext.toLong(), szcard, pguidinterfaces, pcguidinterfaces)).toInt()
}

public fun SCardListReaderGroupsA(hcontext: ULong, mszgroups: PSTR, pcchgroups: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListReaderGroupsA", longArrayOf(hcontext.toLong(), mszgroups, pcchgroups)).toInt()
}

public fun SCardListReaderGroupsW(hcontext: ULong, mszgroups: PWSTR, pcchgroups: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListReaderGroupsW", longArrayOf(hcontext.toLong(), mszgroups, pcchgroups)).toInt()
}

public fun SCardListReadersA(hcontext: ULong, mszgroups: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListReadersA", longArrayOf(hcontext.toLong(), mszgroups, mszreaders, pcchreaders)).toInt()
}

public fun SCardListReadersW(hcontext: ULong, mszgroups: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListReadersW", longArrayOf(hcontext.toLong(), mszgroups, mszreaders, pcchreaders)).toInt()
}

public fun SCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListReadersWithDeviceInstanceIdA", longArrayOf(hcontext.toLong(), szdeviceinstanceid, mszreaders, pcchreaders)).toInt()
}

public fun SCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardListReadersWithDeviceInstanceIdW", longArrayOf(hcontext.toLong(), szdeviceinstanceid, mszreaders, pcchreaders)).toInt()
}

public fun SCardLocateCardsA(hcontext: ULong, mszcards: PCSTR, rgreaderstates: Long, creaders: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardLocateCardsA", longArrayOf(hcontext.toLong(), mszcards, rgreaderstates, creaders.toLong())).toInt()
}

public fun SCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardLocateCardsByATRA", longArrayOf(hcontext.toLong(), rgatrmasks, catrs.toLong(), rgreaderstates, creaders.toLong())).toInt()
}

public fun SCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardLocateCardsByATRW", longArrayOf(hcontext.toLong(), rgatrmasks, catrs.toLong(), rgreaderstates, creaders.toLong())).toInt()
}

public fun SCardLocateCardsW(hcontext: ULong, mszcards: PCWSTR, rgreaderstates: Long, creaders: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardLocateCardsW", longArrayOf(hcontext.toLong(), mszcards, rgreaderstates, creaders.toLong())).toInt()
}

public fun SCardReadCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardReadCacheA", longArrayOf(hcontext.toLong(), cardidentifier, freshnesscounter.toLong(), lookupname, data, datalen)).toInt()
}

public fun SCardReadCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardReadCacheW", longArrayOf(hcontext.toLong(), cardidentifier, freshnesscounter.toLong(), lookupname, data, datalen)).toInt()
}

public fun SCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardReconnect", longArrayOf(hcard.toLong(), dwsharemode.toLong(), dwpreferredprotocols.toLong(), dwinitialization.toLong(), pdwactiveprotocol)).toInt()
}

public fun SCardReleaseContext(hcontext: ULong): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardReleaseContext", longArrayOf(hcontext.toLong())).toInt()
}

public fun SCardReleaseStartedEvent() {
    Win32DynamicFfi.invoke("winscard.dll", "SCardReleaseStartedEvent", longArrayOf())
}

public fun SCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardRemoveReaderFromGroupA", longArrayOf(hcontext.toLong(), szreadername, szgroupname)).toInt()
}

public fun SCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardRemoveReaderFromGroupW", longArrayOf(hcontext.toLong(), szreadername, szgroupname)).toInt()
}

public fun SCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, cbattrlen: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardSetAttrib", longArrayOf(hcard.toLong(), dwattrid.toLong(), pbattr, cbattrlen.toLong())).toInt()
}

public fun SCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PCSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardSetCardTypeProviderNameA", longArrayOf(hcontext.toLong(), szcardname, dwproviderid.toLong(), szprovider)).toInt()
}

public fun SCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PCWSTR): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardSetCardTypeProviderNameW", longArrayOf(hcontext.toLong(), szcardname, dwproviderid.toLong(), szprovider)).toInt()
}

public fun SCardState(hcard: ULong, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardState", longArrayOf(hcard.toLong(), pdwstate, pdwprotocol, pbatr, pcbatrlen)).toInt()
}

public fun SCardStatusA(hcard: ULong, mszreadernames: PSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardStatusA", longArrayOf(hcard.toLong(), mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen)).toInt()
}

public fun SCardStatusW(hcard: ULong, mszreadernames: PWSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardStatusW", longArrayOf(hcard.toLong(), mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen)).toInt()
}

public fun SCardTransmit(hcard: ULong, piosendpci: Long, pbsendbuffer: Long, cbsendlength: UInt, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardTransmit", longArrayOf(hcard.toLong(), piosendpci, pbsendbuffer, cbsendlength.toLong(), piorecvpci, pbrecvbuffer, pcbrecvlength)).toInt()
}

public fun SCardUIDlgSelectCardA(param0: Long): Int {
    return Win32DynamicFfi.invoke("scarddlg.dll", "SCardUIDlgSelectCardA", longArrayOf(param0)).toInt()
}

public fun SCardUIDlgSelectCardW(param0: Long): Int {
    return Win32DynamicFfi.invoke("scarddlg.dll", "SCardUIDlgSelectCardW", longArrayOf(param0)).toInt()
}

public fun SCardWriteCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardWriteCacheA", longArrayOf(hcontext.toLong(), cardidentifier, freshnesscounter.toLong(), lookupname, data, datalen.toLong())).toInt()
}

public fun SCardWriteCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: UInt): Int {
    return Win32DynamicFfi.invoke("winscard.dll", "SCardWriteCacheW", longArrayOf(hcontext.toLong(), cardidentifier, freshnesscounter.toLong(), lookupname, data, datalen.toLong())).toInt()
}
