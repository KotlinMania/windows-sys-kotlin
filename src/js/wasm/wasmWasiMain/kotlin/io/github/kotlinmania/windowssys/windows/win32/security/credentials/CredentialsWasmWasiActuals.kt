@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public actual fun CredDeleteA(targetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    0

public actual fun CredDeleteW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    0

public actual fun CredEnumerateA(filter: PCSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    0

public actual fun CredEnumerateW(filter: PCWSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    0

public actual fun CredFindBestCredentialA(targetname: PCSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    0

public actual fun CredFindBestCredentialW(targetname: PCWSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    0

public actual fun CredFree(buffer: Long) {
}

public actual fun CredGetSessionTypes(maximumpersistcount: UInt, maximumpersist: Long): BOOL =
    0

public actual fun CredGetTargetInfoA(targetname: PCSTR, flags: UInt, targetinfo: Long): BOOL =
    0

public actual fun CredGetTargetInfoW(targetname: PCWSTR, flags: UInt, targetinfo: Long): BOOL =
    0

public actual fun CredIsMarshaledCredentialA(marshaledcredential: PCSTR): BOOL =
    0

public actual fun CredIsMarshaledCredentialW(marshaledcredential: PCWSTR): BOOL =
    0

public actual fun CredIsProtectedA(pszprotectedcredentials: PCSTR, pprotectiontype: Long): BOOL =
    0

public actual fun CredIsProtectedW(pszprotectedcredentials: PCWSTR, pprotectiontype: Long): BOOL =
    0

public actual fun CredMarshalCredentialA(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    0

public actual fun CredMarshalCredentialW(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    0

public actual fun CredPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pszusername: PCSTR, pszpassword: PCSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    0

public actual fun CredPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pszusername: PCWSTR, pszpassword: PCWSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    0

public actual fun CredProtectA(fasself: BOOL, pszcredentials: PCSTR, cchcredentials: UInt, pszprotectedcredentials: PSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    0

public actual fun CredProtectW(fasself: BOOL, pszcredentials: PCWSTR, cchcredentials: UInt, pszprotectedcredentials: PWSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    0

public actual fun CredReadA(targetname: PCSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    0

public actual fun CredReadDomainCredentialsA(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    0

public actual fun CredReadDomainCredentialsW(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    0

public actual fun CredReadW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    0

public actual fun CredRenameA(oldtargetname: PCSTR, newtargetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    0

public actual fun CredRenameW(oldtargetname: PCWSTR, newtargetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    0

public actual fun CredUICmdLinePromptForCredentialsA(psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, username: PSTR, uluserbuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    0u

public actual fun CredUICmdLinePromptForCredentialsW(psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, username: PWSTR, uluserbuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    0u

public actual fun CredUIConfirmCredentialsA(psztargetname: PCSTR, bconfirm: BOOL): UInt =
    0u

public actual fun CredUIConfirmCredentialsW(psztargetname: PCWSTR, bconfirm: BOOL): UInt =
    0u

public actual fun CredUIParseUserNameA(username: PCSTR, user: PSTR, userbuffersize: UInt, domain: PSTR, domainbuffersize: UInt): WIN32_ERROR =
    0u

public actual fun CredUIParseUserNameW(username: PCWSTR, user: PWSTR, userbuffersize: UInt, domain: PWSTR, domainbuffersize: UInt): WIN32_ERROR =
    0u

public actual fun CredUIPromptForCredentialsA(puiinfo: Long, psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, pszusername: PSTR, ulusernamebuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    0u

public actual fun CredUIPromptForCredentialsW(puiinfo: Long, psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, pszusername: PWSTR, ulusernamebuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    0u

public actual fun CredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    0u

public actual fun CredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    0u

public actual fun CredUIReadSSOCredW(pszrealm: PCWSTR, ppszusername: Long): UInt =
    0u

public actual fun CredUIStoreSSOCredW(pszrealm: PCWSTR, pszusername: PCWSTR, pszpassword: PCWSTR, bpersist: BOOL): UInt =
    0u

public actual fun CredUnPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PSTR, pcchlmaxusername: Long, pszdomainname: PSTR, pcchmaxdomainname: Long, pszpassword: PSTR, pcchmaxpassword: Long): BOOL =
    0

public actual fun CredUnPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PWSTR, pcchmaxusername: Long, pszdomainname: PWSTR, pcchmaxdomainname: Long, pszpassword: PWSTR, pcchmaxpassword: Long): BOOL =
    0

public actual fun CredUnmarshalCredentialA(marshaledcredential: PCSTR, credtype: Long, credential: Long): BOOL =
    0

public actual fun CredUnmarshalCredentialW(marshaledcredential: PCWSTR, credtype: Long, credential: Long): BOOL =
    0

public actual fun CredUnprotectA(fasself: BOOL, pszprotectedcredentials: PCSTR, cchprotectedcredentials: UInt, pszcredentials: PSTR, pcchmaxchars: Long): BOOL =
    0

public actual fun CredUnprotectW(fasself: BOOL, pszprotectedcredentials: PCWSTR, cchprotectedcredentials: UInt, pszcredentials: PWSTR, pcchmaxchars: Long): BOOL =
    0

public actual fun CredWriteA(credential: Long, flags: UInt): BOOL =
    0

public actual fun CredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    0

public actual fun CredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    0

public actual fun CredWriteW(credential: Long, flags: UInt): BOOL =
    0

public actual fun GetOpenCardNameA(param0: Long): Int =
    0

public actual fun GetOpenCardNameW(param0: Long): Int =
    0

public actual fun KeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long) {
}

public actual fun KeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): HRESULT =
    0

public actual fun KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: Long, keycredentialmanageroperationerrorstates: Long): HRESULT =
    0

public actual fun KeyCredentialManagerShowUIOperation(hwndowner: HWND, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): HRESULT =
    0

public actual fun SCardAccessStartedEvent(): HANDLE =
    0L

public actual fun SCardAddReaderToGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    0

public actual fun SCardAddReaderToGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    0

public actual fun SCardAudit(hcontext: ULong, dwevent: UInt): Int =
    0

public actual fun SCardBeginTransaction(hcard: ULong): Int =
    0

public actual fun SCardCancel(hcontext: ULong): Int =
    0

public actual fun SCardConnectA(hcontext: ULong, szreader: PCSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    0

public actual fun SCardConnectW(hcontext: ULong, szreader: PCWSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    0

public actual fun SCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): Int =
    0

public actual fun SCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    0

public actual fun SCardDlgExtendedError(): Int =
    0

public actual fun SCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    0

public actual fun SCardEstablishContext(dwscope: SCARD_SCOPE, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int =
    0

public actual fun SCardForgetCardTypeA(hcontext: ULong, szcardname: PCSTR): Int =
    0

public actual fun SCardForgetCardTypeW(hcontext: ULong, szcardname: PCWSTR): Int =
    0

public actual fun SCardForgetReaderA(hcontext: ULong, szreadername: PCSTR): Int =
    0

public actual fun SCardForgetReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    0

public actual fun SCardForgetReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    0

public actual fun SCardForgetReaderW(hcontext: ULong, szreadername: PCWSTR): Int =
    0

public actual fun SCardFreeMemory(hcontext: ULong, pvmem: Long): Int =
    0

public actual fun SCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, pcbattrlen: Long): Int =
    0

public actual fun SCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PSTR, pcchprovider: Long): Int =
    0

public actual fun SCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PWSTR, pcchprovider: Long): Int =
    0

public actual fun SCardGetDeviceTypeIdA(hcontext: ULong, szreadername: PCSTR, pdwdevicetypeid: Long): Int =
    0

public actual fun SCardGetDeviceTypeIdW(hcontext: ULong, szreadername: PCWSTR, pdwdevicetypeid: Long): Int =
    0

public actual fun SCardGetProviderIdA(hcontext: ULong, szcard: PCSTR, pguidproviderid: Long): Int =
    0

public actual fun SCardGetProviderIdW(hcontext: ULong, szcard: PCWSTR, pguidproviderid: Long): Int =
    0

public actual fun SCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: PCSTR, szdeviceinstanceid: PSTR, pcchdeviceinstanceid: Long): Int =
    0

public actual fun SCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: PCWSTR, szdeviceinstanceid: PWSTR, pcchdeviceinstanceid: Long): Int =
    0

public actual fun SCardGetReaderIconA(hcontext: ULong, szreadername: PCSTR, pbicon: Long, pcbicon: Long): Int =
    0

public actual fun SCardGetReaderIconW(hcontext: ULong, szreadername: PCWSTR, pbicon: Long, pcbicon: Long): Int =
    0

public actual fun SCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    0

public actual fun SCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    0

public actual fun SCardGetTransmitCount(hcard: ULong, pctransmitcount: Long): Int =
    0

public actual fun SCardIntroduceCardTypeA(hcontext: ULong, szcardname: PCSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    0

public actual fun SCardIntroduceCardTypeW(hcontext: ULong, szcardname: PCWSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    0

public actual fun SCardIntroduceReaderA(hcontext: ULong, szreadername: PCSTR, szdevicename: PCSTR): Int =
    0

public actual fun SCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    0

public actual fun SCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    0

public actual fun SCardIntroduceReaderW(hcontext: ULong, szreadername: PCWSTR, szdevicename: PCWSTR): Int =
    0

public actual fun SCardIsValidContext(hcontext: ULong): Int =
    0

public actual fun SCardListCardsA(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PSTR, pcchcards: Long): Int =
    0

public actual fun SCardListCardsW(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PWSTR, pcchcards: Long): Int =
    0

public actual fun SCardListInterfacesA(hcontext: ULong, szcard: PCSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    0

public actual fun SCardListInterfacesW(hcontext: ULong, szcard: PCWSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    0

public actual fun SCardListReaderGroupsA(hcontext: ULong, mszgroups: PSTR, pcchgroups: Long): Int =
    0

public actual fun SCardListReaderGroupsW(hcontext: ULong, mszgroups: PWSTR, pcchgroups: Long): Int =
    0

public actual fun SCardListReadersA(hcontext: ULong, mszgroups: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    0

public actual fun SCardListReadersW(hcontext: ULong, mszgroups: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    0

public actual fun SCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    0

public actual fun SCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    0

public actual fun SCardLocateCardsA(hcontext: ULong, mszcards: PCSTR, rgreaderstates: Long, creaders: UInt): Int =
    0

public actual fun SCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    0

public actual fun SCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    0

public actual fun SCardLocateCardsW(hcontext: ULong, mszcards: PCWSTR, rgreaderstates: Long, creaders: UInt): Int =
    0

public actual fun SCardReadCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: Long): Int =
    0

public actual fun SCardReadCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: Long): Int =
    0

public actual fun SCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: Long): Int =
    0

public actual fun SCardReleaseContext(hcontext: ULong): Int =
    0

public actual fun SCardReleaseStartedEvent() {
}

public actual fun SCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    0

public actual fun SCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    0

public actual fun SCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, cbattrlen: UInt): Int =
    0

public actual fun SCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PCSTR): Int =
    0

public actual fun SCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PCWSTR): Int =
    0

public actual fun SCardState(hcard: ULong, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    0

public actual fun SCardStatusA(hcard: ULong, mszreadernames: PSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    0

public actual fun SCardStatusW(hcard: ULong, mszreadernames: PWSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    0

public actual fun SCardTransmit(hcard: ULong, piosendpci: Long, pbsendbuffer: Long, cbsendlength: UInt, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int =
    0

public actual fun SCardUIDlgSelectCardA(param0: Long): Int =
    0

public actual fun SCardUIDlgSelectCardW(param0: Long): Int =
    0

public actual fun SCardWriteCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: UInt): Int =
    0

public actual fun SCardWriteCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: UInt): Int =
    0
