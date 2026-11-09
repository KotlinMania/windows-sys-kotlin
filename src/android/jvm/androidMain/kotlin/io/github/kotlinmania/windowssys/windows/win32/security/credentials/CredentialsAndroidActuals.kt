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

private object WindowsWin32SecurityCredentialsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredDeleteA(targetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredDeleteW(targetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredEnumerateA(filter: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredEnumerateW(filter: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredFindBestCredentialA(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredFindBestCredentialW(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredFree(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredGetSessionTypes(maximumpersistcount: Int, maximumpersist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredGetTargetInfoA(targetname: Long, flags: Int, targetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredGetTargetInfoW(targetname: Long, flags: Int, targetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA(marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW(marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredIsProtectedA(pszprotectedcredentials: Long, pprotectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredIsProtectedW(pszprotectedcredentials: Long, pprotectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredMarshalCredentialA(credtype: Int, credential: Long, marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredMarshalCredentialW(credtype: Int, credential: Long, marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA(dwflags: Int, pszusername: Long, pszpassword: Long, ppackedcredentials: Long, pcbpackedcredentials: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW(dwflags: Int, pszusername: Long, pszpassword: Long, ppackedcredentials: Long, pcbpackedcredentials: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredProtectA(fasself: Int, pszcredentials: Long, cchcredentials: Int, pszprotectedcredentials: Long, pcchmaxchars: Long, protectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredProtectW(fasself: Int, pszcredentials: Long, cchcredentials: Int, pszprotectedcredentials: Long, pcchmaxchars: Long, protectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredReadA(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA(targetinfo: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW(targetinfo: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredReadW(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredRenameA(oldtargetname: Long, newtargetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredRenameW(oldtargetname: Long, newtargetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA(psztargetname: Long, pcontext: Long, dwautherror: Int, username: Long, uluserbuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW(psztargetname: Long, pcontext: Long, dwautherror: Int, username: Long, uluserbuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA(psztargetname: Long, bconfirm: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW(psztargetname: Long, bconfirm: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIParseUserNameA(username: Long, user: Long, userbuffersize: Int, domain: Long, domainbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIParseUserNameW(username: Long, user: Long, userbuffersize: Int, domain: Long, domainbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA(puiinfo: Long, psztargetname: Long, pcontext: Long, dwautherror: Int, pszusername: Long, ulusernamebuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, save: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW(puiinfo: Long, psztargetname: Long, pcontext: Long, dwautherror: Int, pszusername: Long, ulusernamebuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, save: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: Int, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: Int, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: Int, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: Int, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIReadSSOCredW(pszrealm: Long, ppszusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW(pszrealm: Long, pszusername: Long, pszpassword: Long, bpersist: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA(dwflags: Int, pauthbuffer: Long, cbauthbuffer: Int, pszusername: Long, pcchlmaxusername: Long, pszdomainname: Long, pcchmaxdomainname: Long, pszpassword: Long, pcchmaxpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW(dwflags: Int, pauthbuffer: Long, cbauthbuffer: Int, pszusername: Long, pcchmaxusername: Long, pszdomainname: Long, pcchmaxdomainname: Long, pszpassword: Long, pcchmaxpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA(marshaledcredential: Long, credtype: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW(marshaledcredential: Long, credtype: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUnprotectA(fasself: Int, pszprotectedcredentials: Long, cchprotectedcredentials: Int, pszcredentials: Long, pcchmaxchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredUnprotectW(fasself: Int, pszprotectedcredentials: Long, cchprotectedcredentials: Int, pszcredentials: Long, pcchmaxchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredWriteA(credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_CredWriteW(credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_GetOpenCardNameA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_GetOpenCardNameW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: Int, isready: Long, keycredentialmanageroperationerrorstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation(hwndowner: Long, keycredentialmanageroperationtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardAccessStartedEvent(): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardAudit(hcontext: Long, dwevent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardBeginTransaction(hcard: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardCancel(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardConnectA(hcontext: Long, szreader: Long, dwsharemode: Int, dwpreferredprotocols: Int, phcard: Long, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardConnectW(hcontext: Long, szreader: Long, dwsharemode: Int, dwpreferredprotocols: Int, phcard: Long, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardControl(hcard: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardDisconnect(hcard: Long, dwdisposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardDlgExtendedError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardEndTransaction(hcard: Long, dwdisposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardEstablishContext(dwscope: Int, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardForgetCardTypeA(hcontext: Long, szcardname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardForgetCardTypeW(hcontext: Long, szcardname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardForgetReaderA(hcontext: Long, szreadername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardForgetReaderW(hcontext: Long, szreadername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardFreeMemory(hcontext: Long, pvmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetAttrib(hcard: Long, dwattrid: Int, pbattr: Long, pcbattrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long, pcchprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long, pcchprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA(hcontext: Long, szreadername: Long, pdwdevicetypeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW(hcontext: Long, szreadername: Long, pdwdevicetypeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetProviderIdA(hcontext: Long, szcard: Long, pguidproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetProviderIdW(hcontext: Long, szcard: Long, pguidproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA(hcontext: Long, szreadername: Long, szdeviceinstanceid: Long, pcchdeviceinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW(hcontext: Long, szreadername: Long, szdeviceinstanceid: Long, pcchdeviceinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetReaderIconA(hcontext: Long, szreadername: Long, pbicon: Long, pcbicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetReaderIconW(hcontext: Long, szreadername: Long, pbicon: Long, pcbicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetStatusChangeA(hcontext: Long, dwtimeout: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetStatusChangeW(hcontext: Long, dwtimeout: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardGetTransmitCount(hcard: Long, pctransmitcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA(hcontext: Long, szcardname: Long, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: Int, pbatr: Long, pbatrmask: Long, cbatrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW(hcontext: Long, szcardname: Long, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: Int, pbatr: Long, pbatrmask: Long, cbatrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIntroduceReaderA(hcontext: Long, szreadername: Long, szdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIntroduceReaderW(hcontext: Long, szreadername: Long, szdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardIsValidContext(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListCardsA(hcontext: Long, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: Int, mszcards: Long, pcchcards: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListCardsW(hcontext: Long, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: Int, mszcards: Long, pcchcards: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListInterfacesA(hcontext: Long, szcard: Long, pguidinterfaces: Long, pcguidinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListInterfacesW(hcontext: Long, szcard: Long, pguidinterfaces: Long, pcguidinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListReaderGroupsA(hcontext: Long, mszgroups: Long, pcchgroups: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListReaderGroupsW(hcontext: Long, mszgroups: Long, pcchgroups: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListReadersA(hcontext: Long, mszgroups: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListReadersW(hcontext: Long, mszgroups: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA(hcontext: Long, szdeviceinstanceid: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW(hcontext: Long, szdeviceinstanceid: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardLocateCardsA(hcontext: Long, mszcards: Long, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA(hcontext: Long, rgatrmasks: Long, catrs: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW(hcontext: Long, rgatrmasks: Long, catrs: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardLocateCardsW(hcontext: Long, mszcards: Long, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardReadCacheA(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardReadCacheW(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardReconnect(hcard: Long, dwsharemode: Int, dwpreferredprotocols: Int, dwinitialization: Int, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardReleaseContext(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent()

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardSetAttrib(hcard: Long, dwattrid: Int, pbattr: Long, cbattrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardState(hcard: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardStatusA(hcard: Long, mszreadernames: Long, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardStatusW(hcard: Long, mszreadernames: Long, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardTransmit(hcard: Long, piosendpci: Long, pbsendbuffer: Long, cbsendlength: Int, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardWriteCacheA(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_SCardWriteCacheW(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Int): Int
}

public actual fun CredDeleteA(targetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredDeleteA(targetname, type.toInt(), flags.toInt())

public actual fun CredDeleteW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredDeleteW(targetname, type.toInt(), flags.toInt())

public actual fun CredEnumerateA(filter: PCSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredEnumerateA(filter, flags.toInt(), count, credential)

public actual fun CredEnumerateW(filter: PCWSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredEnumerateW(filter, flags.toInt(), count, credential)

public actual fun CredFindBestCredentialA(targetname: PCSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredFindBestCredentialA(targetname, type.toInt(), flags.toInt(), credential)

public actual fun CredFindBestCredentialW(targetname: PCWSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredFindBestCredentialW(targetname, type.toInt(), flags.toInt(), credential)

public actual fun CredFree(buffer: Long) {
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredFree(buffer)
}

public actual fun CredGetSessionTypes(maximumpersistcount: UInt, maximumpersist: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredGetSessionTypes(maximumpersistcount.toInt(), maximumpersist)

public actual fun CredGetTargetInfoA(targetname: PCSTR, flags: UInt, targetinfo: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredGetTargetInfoA(targetname, flags.toInt(), targetinfo)

public actual fun CredGetTargetInfoW(targetname: PCWSTR, flags: UInt, targetinfo: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredGetTargetInfoW(targetname, flags.toInt(), targetinfo)

public actual fun CredIsMarshaledCredentialA(marshaledcredential: PCSTR): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA(marshaledcredential)

public actual fun CredIsMarshaledCredentialW(marshaledcredential: PCWSTR): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW(marshaledcredential)

public actual fun CredIsProtectedA(pszprotectedcredentials: PCSTR, pprotectiontype: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredIsProtectedA(pszprotectedcredentials, pprotectiontype)

public actual fun CredIsProtectedW(pszprotectedcredentials: PCWSTR, pprotectiontype: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredIsProtectedW(pszprotectedcredentials, pprotectiontype)

public actual fun CredMarshalCredentialA(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredMarshalCredentialA(credtype, credential, marshaledcredential)

public actual fun CredMarshalCredentialW(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredMarshalCredentialW(credtype, credential, marshaledcredential)

public actual fun CredPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pszusername: PCSTR, pszpassword: PCSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA(dwflags.toInt(), pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials)

public actual fun CredPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pszusername: PCWSTR, pszpassword: PCWSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW(dwflags.toInt(), pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials)

public actual fun CredProtectA(fasself: BOOL, pszcredentials: PCSTR, cchcredentials: UInt, pszprotectedcredentials: PSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredProtectA(fasself, pszcredentials, cchcredentials.toInt(), pszprotectedcredentials, pcchmaxchars, protectiontype)

public actual fun CredProtectW(fasself: BOOL, pszcredentials: PCWSTR, cchcredentials: UInt, pszprotectedcredentials: PWSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredProtectW(fasself, pszcredentials, cchcredentials.toInt(), pszprotectedcredentials, pcchmaxchars, protectiontype)

public actual fun CredReadA(targetname: PCSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredReadA(targetname, type.toInt(), flags.toInt(), credential)

public actual fun CredReadDomainCredentialsA(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA(targetinfo, flags.toInt(), count, credential)

public actual fun CredReadDomainCredentialsW(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW(targetinfo, flags.toInt(), count, credential)

public actual fun CredReadW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredReadW(targetname, type.toInt(), flags.toInt(), credential)

public actual fun CredRenameA(oldtargetname: PCSTR, newtargetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredRenameA(oldtargetname, newtargetname, type.toInt(), flags.toInt())

public actual fun CredRenameW(oldtargetname: PCWSTR, newtargetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredRenameW(oldtargetname, newtargetname, type.toInt(), flags.toInt())

public actual fun CredUICmdLinePromptForCredentialsA(psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, username: PSTR, uluserbuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA(psztargetname, pcontext, dwautherror.toInt(), username, uluserbuffersize.toInt(), pszpassword, ulpasswordbuffersize.toInt(), pfsave, dwflags.toInt()).toUInt()

public actual fun CredUICmdLinePromptForCredentialsW(psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, username: PWSTR, uluserbuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW(psztargetname, pcontext, dwautherror.toInt(), username, uluserbuffersize.toInt(), pszpassword, ulpasswordbuffersize.toInt(), pfsave, dwflags.toInt()).toUInt()

public actual fun CredUIConfirmCredentialsA(psztargetname: PCSTR, bconfirm: BOOL): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA(psztargetname, bconfirm).toUInt()

public actual fun CredUIConfirmCredentialsW(psztargetname: PCWSTR, bconfirm: BOOL): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW(psztargetname, bconfirm).toUInt()

public actual fun CredUIParseUserNameA(username: PCSTR, user: PSTR, userbuffersize: UInt, domain: PSTR, domainbuffersize: UInt): WIN32_ERROR =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIParseUserNameA(username, user, userbuffersize.toInt(), domain, domainbuffersize.toInt()).toUInt()

public actual fun CredUIParseUserNameW(username: PCWSTR, user: PWSTR, userbuffersize: UInt, domain: PWSTR, domainbuffersize: UInt): WIN32_ERROR =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIParseUserNameW(username, user, userbuffersize.toInt(), domain, domainbuffersize.toInt()).toUInt()

public actual fun CredUIPromptForCredentialsA(puiinfo: Long, psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, pszusername: PSTR, ulusernamebuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA(puiinfo, psztargetname, pcontext, dwautherror.toInt(), pszusername, ulusernamebuffersize.toInt(), pszpassword, ulpasswordbuffersize.toInt(), save, dwflags.toInt()).toUInt()

public actual fun CredUIPromptForCredentialsW(puiinfo: Long, psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, pszusername: PWSTR, ulusernamebuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW(puiinfo, psztargetname, pcontext, dwautherror.toInt(), pszusername, ulusernamebuffersize.toInt(), pszpassword, ulpasswordbuffersize.toInt(), save, dwflags.toInt()).toUInt()

public actual fun CredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA(puiinfo, dwautherror.toInt(), pulauthpackage, pvinauthbuffer, ulinauthbuffersize.toInt(), ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags.toInt()).toUInt()

public actual fun CredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW(puiinfo, dwautherror.toInt(), pulauthpackage, pvinauthbuffer, ulinauthbuffersize.toInt(), ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags.toInt()).toUInt()

public actual fun CredUIReadSSOCredW(pszrealm: PCWSTR, ppszusername: Long): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIReadSSOCredW(pszrealm, ppszusername).toUInt()

public actual fun CredUIStoreSSOCredW(pszrealm: PCWSTR, pszusername: PCWSTR, pszpassword: PCWSTR, bpersist: BOOL): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW(pszrealm, pszusername, pszpassword, bpersist).toUInt()

public actual fun CredUnPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PSTR, pcchlmaxusername: Long, pszdomainname: PSTR, pcchmaxdomainname: Long, pszpassword: PSTR, pcchmaxpassword: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA(dwflags.toInt(), pauthbuffer, cbauthbuffer.toInt(), pszusername, pcchlmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword)

public actual fun CredUnPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PWSTR, pcchmaxusername: Long, pszdomainname: PWSTR, pcchmaxdomainname: Long, pszpassword: PWSTR, pcchmaxpassword: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW(dwflags.toInt(), pauthbuffer, cbauthbuffer.toInt(), pszusername, pcchmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword)

public actual fun CredUnmarshalCredentialA(marshaledcredential: PCSTR, credtype: Long, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA(marshaledcredential, credtype, credential)

public actual fun CredUnmarshalCredentialW(marshaledcredential: PCWSTR, credtype: Long, credential: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW(marshaledcredential, credtype, credential)

public actual fun CredUnprotectA(fasself: BOOL, pszprotectedcredentials: PCSTR, cchprotectedcredentials: UInt, pszcredentials: PSTR, pcchmaxchars: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUnprotectA(fasself, pszprotectedcredentials, cchprotectedcredentials.toInt(), pszcredentials, pcchmaxchars)

public actual fun CredUnprotectW(fasself: BOOL, pszprotectedcredentials: PCWSTR, cchprotectedcredentials: UInt, pszcredentials: PWSTR, pcchmaxchars: Long): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredUnprotectW(fasself, pszprotectedcredentials, cchprotectedcredentials.toInt(), pszcredentials, pcchmaxchars)

public actual fun CredWriteA(credential: Long, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredWriteA(credential, flags.toInt())

public actual fun CredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA(targetinfo, credential, flags.toInt())

public actual fun CredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW(targetinfo, credential, flags.toInt())

public actual fun CredWriteW(credential: Long, flags: UInt): BOOL =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_CredWriteW(credential, flags.toInt())

public actual fun GetOpenCardNameA(param0: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_GetOpenCardNameA(param0)

public actual fun GetOpenCardNameW(param0: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_GetOpenCardNameW(param0)

public actual fun KeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long) {
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation(keycredentialmanagerinfo)
}

public actual fun KeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): HRESULT =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation(keycredentialmanagerinfo)

public actual fun KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: Long, keycredentialmanageroperationerrorstates: Long): HRESULT =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready, keycredentialmanageroperationerrorstates)

public actual fun KeyCredentialManagerShowUIOperation(hwndowner: HWND, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): HRESULT =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation(hwndowner, keycredentialmanageroperationtype)

public actual fun SCardAccessStartedEvent(): HANDLE =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardAccessStartedEvent()

public actual fun SCardAddReaderToGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA(hcontext.toLong(), szreadername, szgroupname)

public actual fun SCardAddReaderToGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW(hcontext.toLong(), szreadername, szgroupname)

public actual fun SCardAudit(hcontext: ULong, dwevent: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardAudit(hcontext.toLong(), dwevent.toInt())

public actual fun SCardBeginTransaction(hcard: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardBeginTransaction(hcard.toLong())

public actual fun SCardCancel(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardCancel(hcontext.toLong())

public actual fun SCardConnectA(hcontext: ULong, szreader: PCSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardConnectA(hcontext.toLong(), szreader, dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard, pdwactiveprotocol)

public actual fun SCardConnectW(hcontext: ULong, szreader: PCWSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardConnectW(hcontext.toLong(), szreader, dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard, pdwactiveprotocol)

public actual fun SCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardControl(hcard.toLong(), dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned)

public actual fun SCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardDisconnect(hcard.toLong(), dwdisposition.toInt())

public actual fun SCardDlgExtendedError(): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardDlgExtendedError()

public actual fun SCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardEndTransaction(hcard.toLong(), dwdisposition.toInt())

public actual fun SCardEstablishContext(dwscope: SCARD_SCOPE, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardEstablishContext(dwscope.toInt(), pvreserved1, pvreserved2, phcontext)

public actual fun SCardForgetCardTypeA(hcontext: ULong, szcardname: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardForgetCardTypeA(hcontext.toLong(), szcardname)

public actual fun SCardForgetCardTypeW(hcontext: ULong, szcardname: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardForgetCardTypeW(hcontext.toLong(), szcardname)

public actual fun SCardForgetReaderA(hcontext: ULong, szreadername: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardForgetReaderA(hcontext.toLong(), szreadername)

public actual fun SCardForgetReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA(hcontext.toLong(), szgroupname)

public actual fun SCardForgetReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW(hcontext.toLong(), szgroupname)

public actual fun SCardForgetReaderW(hcontext: ULong, szreadername: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardForgetReaderW(hcontext.toLong(), szreadername)

public actual fun SCardFreeMemory(hcontext: ULong, pvmem: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardFreeMemory(hcontext.toLong(), pvmem)

public actual fun SCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, pcbattrlen: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetAttrib(hcard.toLong(), dwattrid.toInt(), pbattr, pcbattrlen)

public actual fun SCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PSTR, pcchprovider: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA(hcontext.toLong(), szcardname, dwproviderid.toInt(), szprovider, pcchprovider)

public actual fun SCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PWSTR, pcchprovider: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW(hcontext.toLong(), szcardname, dwproviderid.toInt(), szprovider, pcchprovider)

public actual fun SCardGetDeviceTypeIdA(hcontext: ULong, szreadername: PCSTR, pdwdevicetypeid: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA(hcontext.toLong(), szreadername, pdwdevicetypeid)

public actual fun SCardGetDeviceTypeIdW(hcontext: ULong, szreadername: PCWSTR, pdwdevicetypeid: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW(hcontext.toLong(), szreadername, pdwdevicetypeid)

public actual fun SCardGetProviderIdA(hcontext: ULong, szcard: PCSTR, pguidproviderid: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetProviderIdA(hcontext.toLong(), szcard, pguidproviderid)

public actual fun SCardGetProviderIdW(hcontext: ULong, szcard: PCWSTR, pguidproviderid: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetProviderIdW(hcontext.toLong(), szcard, pguidproviderid)

public actual fun SCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: PCSTR, szdeviceinstanceid: PSTR, pcchdeviceinstanceid: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA(hcontext.toLong(), szreadername, szdeviceinstanceid, pcchdeviceinstanceid)

public actual fun SCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: PCWSTR, szdeviceinstanceid: PWSTR, pcchdeviceinstanceid: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW(hcontext.toLong(), szreadername, szdeviceinstanceid, pcchdeviceinstanceid)

public actual fun SCardGetReaderIconA(hcontext: ULong, szreadername: PCSTR, pbicon: Long, pcbicon: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetReaderIconA(hcontext.toLong(), szreadername, pbicon, pcbicon)

public actual fun SCardGetReaderIconW(hcontext: ULong, szreadername: PCWSTR, pbicon: Long, pcbicon: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetReaderIconW(hcontext.toLong(), szreadername, pbicon, pcbicon)

public actual fun SCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetStatusChangeA(hcontext.toLong(), dwtimeout.toInt(), rgreaderstates, creaders.toInt())

public actual fun SCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetStatusChangeW(hcontext.toLong(), dwtimeout.toInt(), rgreaderstates, creaders.toInt())

public actual fun SCardGetTransmitCount(hcard: ULong, pctransmitcount: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardGetTransmitCount(hcard.toLong(), pctransmitcount)

public actual fun SCardIntroduceCardTypeA(hcontext: ULong, szcardname: PCSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA(hcontext.toLong(), szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount.toInt(), pbatr, pbatrmask, cbatrlen.toInt())

public actual fun SCardIntroduceCardTypeW(hcontext: ULong, szcardname: PCWSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW(hcontext.toLong(), szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount.toInt(), pbatr, pbatrmask, cbatrlen.toInt())

public actual fun SCardIntroduceReaderA(hcontext: ULong, szreadername: PCSTR, szdevicename: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIntroduceReaderA(hcontext.toLong(), szreadername, szdevicename)

public actual fun SCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA(hcontext.toLong(), szgroupname)

public actual fun SCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW(hcontext.toLong(), szgroupname)

public actual fun SCardIntroduceReaderW(hcontext: ULong, szreadername: PCWSTR, szdevicename: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIntroduceReaderW(hcontext.toLong(), szreadername, szdevicename)

public actual fun SCardIsValidContext(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardIsValidContext(hcontext.toLong())

public actual fun SCardListCardsA(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PSTR, pcchcards: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListCardsA(hcontext.toLong(), pbatr, rgquidinterfaces, cguidinterfacecount.toInt(), mszcards, pcchcards)

public actual fun SCardListCardsW(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PWSTR, pcchcards: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListCardsW(hcontext.toLong(), pbatr, rgquidinterfaces, cguidinterfacecount.toInt(), mszcards, pcchcards)

public actual fun SCardListInterfacesA(hcontext: ULong, szcard: PCSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListInterfacesA(hcontext.toLong(), szcard, pguidinterfaces, pcguidinterfaces)

public actual fun SCardListInterfacesW(hcontext: ULong, szcard: PCWSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListInterfacesW(hcontext.toLong(), szcard, pguidinterfaces, pcguidinterfaces)

public actual fun SCardListReaderGroupsA(hcontext: ULong, mszgroups: PSTR, pcchgroups: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListReaderGroupsA(hcontext.toLong(), mszgroups, pcchgroups)

public actual fun SCardListReaderGroupsW(hcontext: ULong, mszgroups: PWSTR, pcchgroups: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListReaderGroupsW(hcontext.toLong(), mszgroups, pcchgroups)

public actual fun SCardListReadersA(hcontext: ULong, mszgroups: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListReadersA(hcontext.toLong(), mszgroups, mszreaders, pcchreaders)

public actual fun SCardListReadersW(hcontext: ULong, mszgroups: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListReadersW(hcontext.toLong(), mszgroups, mszreaders, pcchreaders)

public actual fun SCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA(hcontext.toLong(), szdeviceinstanceid, mszreaders, pcchreaders)

public actual fun SCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW(hcontext.toLong(), szdeviceinstanceid, mszreaders, pcchreaders)

public actual fun SCardLocateCardsA(hcontext: ULong, mszcards: PCSTR, rgreaderstates: Long, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardLocateCardsA(hcontext.toLong(), mszcards, rgreaderstates, creaders.toInt())

public actual fun SCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA(hcontext.toLong(), rgatrmasks, catrs.toInt(), rgreaderstates, creaders.toInt())

public actual fun SCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW(hcontext.toLong(), rgatrmasks, catrs.toInt(), rgreaderstates, creaders.toInt())

public actual fun SCardLocateCardsW(hcontext: ULong, mszcards: PCWSTR, rgreaderstates: Long, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardLocateCardsW(hcontext.toLong(), mszcards, rgreaderstates, creaders.toInt())

public actual fun SCardReadCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardReadCacheA(hcontext.toLong(), cardidentifier, freshnesscounter.toInt(), lookupname, data, datalen)

public actual fun SCardReadCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardReadCacheW(hcontext.toLong(), cardidentifier, freshnesscounter.toInt(), lookupname, data, datalen)

public actual fun SCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardReconnect(hcard.toLong(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), pdwactiveprotocol)

public actual fun SCardReleaseContext(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardReleaseContext(hcontext.toLong())

public actual fun SCardReleaseStartedEvent() {
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent()
}

public actual fun SCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA(hcontext.toLong(), szreadername, szgroupname)

public actual fun SCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW(hcontext.toLong(), szreadername, szgroupname)

public actual fun SCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, cbattrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardSetAttrib(hcard.toLong(), dwattrid.toInt(), pbattr, cbattrlen.toInt())

public actual fun SCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PCSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA(hcontext.toLong(), szcardname, dwproviderid.toInt(), szprovider)

public actual fun SCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PCWSTR): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW(hcontext.toLong(), szcardname, dwproviderid.toInt(), szprovider)

public actual fun SCardState(hcard: ULong, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardState(hcard.toLong(), pdwstate, pdwprotocol, pbatr, pcbatrlen)

public actual fun SCardStatusA(hcard: ULong, mszreadernames: PSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardStatusA(hcard.toLong(), mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen)

public actual fun SCardStatusW(hcard: ULong, mszreadernames: PWSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardStatusW(hcard.toLong(), mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen)

public actual fun SCardTransmit(hcard: ULong, piosendpci: Long, pbsendbuffer: Long, cbsendlength: UInt, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardTransmit(hcard.toLong(), piosendpci, pbsendbuffer, cbsendlength.toInt(), piorecvpci, pbrecvbuffer, pcbrecvlength)

public actual fun SCardUIDlgSelectCardA(param0: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA(param0)

public actual fun SCardUIDlgSelectCardW(param0: Long): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW(param0)

public actual fun SCardWriteCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardWriteCacheA(hcontext.toLong(), cardidentifier, freshnesscounter.toInt(), lookupname, data, datalen.toInt())

public actual fun SCardWriteCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_SCardWriteCacheW(hcontext.toLong(), cardidentifier, freshnesscounter.toInt(), lookupname, data, datalen.toInt())
