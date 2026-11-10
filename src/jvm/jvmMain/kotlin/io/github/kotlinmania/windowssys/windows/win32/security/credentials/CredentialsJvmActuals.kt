@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32SecurityCredentialsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credDeleteA(targetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credDeleteW(targetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credEnumerateA(filter: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credEnumerateW(filter: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credFindBestCredentialA(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credFindBestCredentialW(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credFree(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credGetSessionTypes(maximumpersistcount: Int, maximumpersist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credGetTargetInfoA(targetname: Long, flags: Int, targetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credGetTargetInfoW(targetname: Long, flags: Int, targetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credIsMarshaledCredentialA(marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credIsMarshaledCredentialW(marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credIsProtectedA(pszprotectedcredentials: Long, pprotectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credIsProtectedW(pszprotectedcredentials: Long, pprotectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credMarshalCredentialA(credtype: Int, credential: Long, marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credMarshalCredentialW(credtype: Int, credential: Long, marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credPackAuthenticationBufferA(dwflags: Int, pszusername: Long, pszpassword: Long, ppackedcredentials: Long, pcbpackedcredentials: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credPackAuthenticationBufferW(dwflags: Int, pszusername: Long, pszpassword: Long, ppackedcredentials: Long, pcbpackedcredentials: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credProtectA(fasself: Int, pszcredentials: Long, cchcredentials: Int, pszprotectedcredentials: Long, pcchmaxchars: Long, protectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credProtectW(fasself: Int, pszcredentials: Long, cchcredentials: Int, pszprotectedcredentials: Long, pcchmaxchars: Long, protectiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credReadA(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credReadDomainCredentialsA(targetinfo: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credReadDomainCredentialsW(targetinfo: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credReadW(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credRenameA(oldtargetname: Long, newtargetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credRenameW(oldtargetname: Long, newtargetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsA(psztargetname: Long, pcontext: Long, dwautherror: Int, username: Long, uluserbuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsW(psztargetname: Long, pcontext: Long, dwautherror: Int, username: Long, uluserbuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIConfirmCredentialsA(psztargetname: Long, bconfirm: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIConfirmCredentialsW(psztargetname: Long, bconfirm: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIParseUserNameA(username: Long, user: Long, userbuffersize: Int, domain: Long, domainbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIParseUserNameW(username: Long, user: Long, userbuffersize: Int, domain: Long, domainbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIPromptForCredentialsA(puiinfo: Long, psztargetname: Long, pcontext: Long, dwautherror: Int, pszusername: Long, ulusernamebuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, save: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIPromptForCredentialsW(puiinfo: Long, psztargetname: Long, pcontext: Long, dwautherror: Int, pszusername: Long, ulusernamebuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, save: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: Int, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: Int, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: Int, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: Int, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIReadSSOCredW(pszrealm: Long, ppszusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUIStoreSSOCredW(pszrealm: Long, pszusername: Long, pszpassword: Long, bpersist: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferA(dwflags: Int, pauthbuffer: Long, cbauthbuffer: Int, pszusername: Long, pcchlmaxusername: Long, pszdomainname: Long, pcchmaxdomainname: Long, pszpassword: Long, pcchmaxpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferW(dwflags: Int, pauthbuffer: Long, cbauthbuffer: Int, pszusername: Long, pcchmaxusername: Long, pszdomainname: Long, pcchmaxdomainname: Long, pszpassword: Long, pcchmaxpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUnmarshalCredentialA(marshaledcredential: Long, credtype: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUnmarshalCredentialW(marshaledcredential: Long, credtype: Long, credential: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUnprotectA(fasself: Int, pszprotectedcredentials: Long, cchprotectedcredentials: Int, pszcredentials: Long, pcchmaxchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credUnprotectW(fasself: Int, pszprotectedcredentials: Long, cchprotectedcredentials: Int, pszcredentials: Long, pcchmaxchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credWriteA(credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_credWriteW(credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_getOpenCardNameA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_getOpenCardNameW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_keyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_keyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: Int, isready: Long, keycredentialmanageroperationerrorstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_keyCredentialManagerShowUIOperation(hwndowner: Long, keycredentialmanageroperationtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardAccessStartedEvent(): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardAddReaderToGroupA(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardAddReaderToGroupW(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardAudit(hcontext: Long, dwevent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardBeginTransaction(hcard: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardCancel(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardConnectA(hcontext: Long, szreader: Long, dwsharemode: Int, dwpreferredprotocols: Int, phcard: Long, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardConnectW(hcontext: Long, szreader: Long, dwsharemode: Int, dwpreferredprotocols: Int, phcard: Long, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardControl(hcard: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardDisconnect(hcard: Long, dwdisposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardDlgExtendedError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardEndTransaction(hcard: Long, dwdisposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardEstablishContext(dwscope: Int, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardForgetCardTypeA(hcontext: Long, szcardname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardForgetCardTypeW(hcontext: Long, szcardname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardForgetReaderA(hcontext: Long, szreadername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardForgetReaderGroupA(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardForgetReaderGroupW(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardForgetReaderW(hcontext: Long, szreadername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardFreeMemory(hcontext: Long, pvmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetAttrib(hcard: Long, dwattrid: Int, pbattr: Long, pcbattrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameA(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long, pcchprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameW(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long, pcchprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdA(hcontext: Long, szreadername: Long, pdwdevicetypeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdW(hcontext: Long, szreadername: Long, pdwdevicetypeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetProviderIdA(hcontext: Long, szcard: Long, pguidproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetProviderIdW(hcontext: Long, szcard: Long, pguidproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdA(hcontext: Long, szreadername: Long, szdeviceinstanceid: Long, pcchdeviceinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdW(hcontext: Long, szreadername: Long, szdeviceinstanceid: Long, pcchdeviceinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetReaderIconA(hcontext: Long, szreadername: Long, pbicon: Long, pcbicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetReaderIconW(hcontext: Long, szreadername: Long, pbicon: Long, pcbicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetStatusChangeA(hcontext: Long, dwtimeout: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetStatusChangeW(hcontext: Long, dwtimeout: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardGetTransmitCount(hcard: Long, pctransmitcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeA(hcontext: Long, szcardname: Long, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: Int, pbatr: Long, pbatrmask: Long, cbatrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeW(hcontext: Long, szcardname: Long, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: Int, pbatr: Long, pbatrmask: Long, cbatrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIntroduceReaderA(hcontext: Long, szreadername: Long, szdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupA(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupW(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIntroduceReaderW(hcontext: Long, szreadername: Long, szdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardIsValidContext(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListCardsA(hcontext: Long, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: Int, mszcards: Long, pcchcards: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListCardsW(hcontext: Long, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: Int, mszcards: Long, pcchcards: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListInterfacesA(hcontext: Long, szcard: Long, pguidinterfaces: Long, pcguidinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListInterfacesW(hcontext: Long, szcard: Long, pguidinterfaces: Long, pcguidinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListReaderGroupsA(hcontext: Long, mszgroups: Long, pcchgroups: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListReaderGroupsW(hcontext: Long, mszgroups: Long, pcchgroups: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListReadersA(hcontext: Long, mszgroups: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListReadersW(hcontext: Long, mszgroups: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdA(hcontext: Long, szdeviceinstanceid: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdW(hcontext: Long, szdeviceinstanceid: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardLocateCardsA(hcontext: Long, mszcards: Long, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardLocateCardsByATRA(hcontext: Long, rgatrmasks: Long, catrs: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardLocateCardsByATRW(hcontext: Long, rgatrmasks: Long, catrs: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardLocateCardsW(hcontext: Long, mszcards: Long, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardReadCacheA(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardReadCacheW(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardReconnect(hcard: Long, dwsharemode: Int, dwpreferredprotocols: Int, dwinitialization: Int, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardReleaseContext(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardReleaseStartedEvent()

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupA(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupW(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardSetAttrib(hcard: Long, dwattrid: Int, pbattr: Long, cbattrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameA(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameW(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardState(hcard: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardStatusA(hcard: Long, mszreadernames: Long, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardStatusW(hcard: Long, mszreadernames: Long, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardTransmit(hcard: Long, piosendpci: Long, pbsendbuffer: Long, cbsendlength: Int, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardWriteCacheA(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_credentials_sCardWriteCacheW(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Int): Int
}

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credDeleteA((targetname?.value ?: 0L), type.toInt(), flags.toInt())

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credDeleteW((targetname?.value ?: 0L), type.toInt(), flags.toInt())

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credEnumerateA((filter?.value ?: 0L), flags.toInt(), (count?.value ?: 0L), (credential?.value ?: 0L))

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credEnumerateW((filter?.value ?: 0L), flags.toInt(), (count?.value ?: 0L), (credential?.value ?: 0L))

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credFindBestCredentialA((targetname?.value ?: 0L), type.toInt(), flags.toInt(), (credential?.value ?: 0L))

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credFindBestCredentialW((targetname?.value ?: 0L), type.toInt(), flags.toInt(), (credential?.value ?: 0L))

public actual fun credFree(buffer: COpaquePointer?) {
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credFree((buffer?.value ?: 0L))
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credGetSessionTypes(maximumpersistcount.toInt(), (maximumpersist?.value ?: 0L))

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credGetTargetInfoA((targetname?.value ?: 0L), flags.toInt(), (targetinfo?.value ?: 0L))

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credGetTargetInfoW((targetname?.value ?: 0L), flags.toInt(), (targetinfo?.value ?: 0L))

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credIsMarshaledCredentialA((marshaledcredential?.value ?: 0L))

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credIsMarshaledCredentialW((marshaledcredential?.value ?: 0L))

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credIsProtectedA((pszprotectedcredentials?.value ?: 0L), (pprotectiontype?.value ?: 0L))

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credIsProtectedW((pszprotectedcredentials?.value ?: 0L), (pprotectiontype?.value ?: 0L))

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credMarshalCredentialA(credtype, (credential?.value ?: 0L), (marshaledcredential?.value ?: 0L))

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credMarshalCredentialW(credtype, (credential?.value ?: 0L), (marshaledcredential?.value ?: 0L))

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credPackAuthenticationBufferA(dwflags.toInt(), (pszusername?.value ?: 0L), (pszpassword?.value ?: 0L), (ppackedcredentials?.value ?: 0L), (pcbpackedcredentials?.value ?: 0L))

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credPackAuthenticationBufferW(dwflags.toInt(), (pszusername?.value ?: 0L), (pszpassword?.value ?: 0L), (ppackedcredentials?.value ?: 0L), (pcbpackedcredentials?.value ?: 0L))

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credProtectA(fasself, (pszcredentials?.value ?: 0L), cchcredentials.toInt(), (pszprotectedcredentials?.value ?: 0L), (pcchmaxchars?.value ?: 0L), (protectiontype?.value ?: 0L))

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credProtectW(fasself, (pszcredentials?.value ?: 0L), cchcredentials.toInt(), (pszprotectedcredentials?.value ?: 0L), (pcchmaxchars?.value ?: 0L), (protectiontype?.value ?: 0L))

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credReadA((targetname?.value ?: 0L), type.toInt(), flags.toInt(), (credential?.value ?: 0L))

public actual fun credReadDomainCredentialsA(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credReadDomainCredentialsA((targetinfo?.value ?: 0L), flags.toInt(), (count?.value ?: 0L), (credential?.value ?: 0L))

public actual fun credReadDomainCredentialsW(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credReadDomainCredentialsW((targetinfo?.value ?: 0L), flags.toInt(), (count?.value ?: 0L), (credential?.value ?: 0L))

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credReadW((targetname?.value ?: 0L), type.toInt(), flags.toInt(), (credential?.value ?: 0L))

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credRenameA((oldtargetname?.value ?: 0L), (newtargetname?.value ?: 0L), type.toInt(), flags.toInt())

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credRenameW((oldtargetname?.value ?: 0L), (newtargetname?.value ?: 0L), type.toInt(), flags.toInt())

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsA((psztargetname?.value ?: 0L), (pcontext?.value ?: 0L), dwautherror.toInt(), (username?.value ?: 0L), uluserbuffersize.toInt(), (pszpassword?.value ?: 0L), ulpasswordbuffersize.toInt(), (pfsave?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsW((psztargetname?.value ?: 0L), (pcontext?.value ?: 0L), dwautherror.toInt(), (username?.value ?: 0L), uluserbuffersize.toInt(), (pszpassword?.value ?: 0L), ulpasswordbuffersize.toInt(), (pfsave?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIConfirmCredentialsA((psztargetname?.value ?: 0L), bconfirm).toUInt()

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIConfirmCredentialsW((psztargetname?.value ?: 0L), bconfirm).toUInt()

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIParseUserNameA((username?.value ?: 0L), (user?.value ?: 0L), userbuffersize.toInt(), (domain?.value ?: 0L), domainbuffersize.toInt()).toUInt()

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIParseUserNameW((username?.value ?: 0L), (user?.value ?: 0L), userbuffersize.toInt(), (domain?.value ?: 0L), domainbuffersize.toInt()).toUInt()

public actual fun credUIPromptForCredentialsA(puiinfo: COpaquePointer?, psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIPromptForCredentialsA((puiinfo?.value ?: 0L), (psztargetname?.value ?: 0L), (pcontext?.value ?: 0L), dwautherror.toInt(), (pszusername?.value ?: 0L), ulusernamebuffersize.toInt(), (pszpassword?.value ?: 0L), ulpasswordbuffersize.toInt(), (save?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun credUIPromptForCredentialsW(puiinfo: COpaquePointer?, psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIPromptForCredentialsW((puiinfo?.value ?: 0L), (psztargetname?.value ?: 0L), (pcontext?.value ?: 0L), dwautherror.toInt(), (pszusername?.value ?: 0L), ulusernamebuffersize.toInt(), (pszpassword?.value ?: 0L), ulpasswordbuffersize.toInt(), (save?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsA((puiinfo?.value ?: 0L), dwautherror.toInt(), (pulauthpackage?.value ?: 0L), (pvinauthbuffer?.value ?: 0L), ulinauthbuffersize.toInt(), (ppvoutauthbuffer?.value ?: 0L), (puloutauthbuffersize?.value ?: 0L), (pfsave?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsW((puiinfo?.value ?: 0L), dwautherror.toInt(), (pulauthpackage?.value ?: 0L), (pvinauthbuffer?.value ?: 0L), ulinauthbuffersize.toInt(), (ppvoutauthbuffer?.value ?: 0L), (puloutauthbuffersize?.value ?: 0L), (pfsave?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: COpaquePointer?): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIReadSSOCredW((pszrealm?.value ?: 0L), (ppszusername?.value ?: 0L)).toUInt()

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUIStoreSSOCredW((pszrealm?.value ?: 0L), (pszusername?.value ?: 0L), (pszpassword?.value ?: 0L), bpersist).toUInt()

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: COpaquePointer?, pszdomainname: Pstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pstr, pcchmaxpassword: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferA(dwflags.toInt(), (pauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), (pszusername?.value ?: 0L), (pcchlmaxusername?.value ?: 0L), (pszdomainname?.value ?: 0L), (pcchmaxdomainname?.value ?: 0L), (pszpassword?.value ?: 0L), (pcchmaxpassword?.value ?: 0L))

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: COpaquePointer?, pszdomainname: Pwstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pwstr, pcchmaxpassword: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferW(dwflags.toInt(), (pauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), (pszusername?.value ?: 0L), (pcchmaxusername?.value ?: 0L), (pszdomainname?.value ?: 0L), (pcchmaxdomainname?.value ?: 0L), (pszpassword?.value ?: 0L), (pcchmaxpassword?.value ?: 0L))

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUnmarshalCredentialA((marshaledcredential?.value ?: 0L), (credtype?.value ?: 0L), (credential?.value ?: 0L))

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUnmarshalCredentialW((marshaledcredential?.value ?: 0L), (credtype?.value ?: 0L), (credential?.value ?: 0L))

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUnprotectA(fasself, (pszprotectedcredentials?.value ?: 0L), cchprotectedcredentials.toInt(), (pszcredentials?.value ?: 0L), (pcchmaxchars?.value ?: 0L))

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: COpaquePointer?): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credUnprotectW(fasself, (pszprotectedcredentials?.value ?: 0L), cchprotectedcredentials.toInt(), (pszcredentials?.value ?: 0L), (pcchmaxchars?.value ?: 0L))

public actual fun credWriteA(credential: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credWriteA((credential?.value ?: 0L), flags.toInt())

public actual fun credWriteDomainCredentialsA(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credWriteDomainCredentialsA((targetinfo?.value ?: 0L), (credential?.value ?: 0L), flags.toInt())

public actual fun credWriteDomainCredentialsW(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credWriteDomainCredentialsW((targetinfo?.value ?: 0L), (credential?.value ?: 0L), flags.toInt())

public actual fun credWriteW(credential: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_credWriteW((credential?.value ?: 0L), flags.toInt())

public actual fun getOpenCardNameA(param0: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_getOpenCardNameA((param0?.value ?: 0L))

public actual fun getOpenCardNameW(param0: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_getOpenCardNameW((param0?.value ?: 0L))

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: COpaquePointer?) {
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_keyCredentialManagerFreeInformation((keycredentialmanagerinfo?.value ?: 0L))
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_keyCredentialManagerGetInformation((keycredentialmanagerinfo?.value ?: 0L))

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: COpaquePointer?, keycredentialmanageroperationerrorstates: COpaquePointer?): Hresult =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, (isready?.value ?: 0L), (keycredentialmanageroperationerrorstates?.value ?: 0L))

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_keyCredentialManagerShowUIOperation((hwndowner?.value ?: 0L), keycredentialmanageroperationtype)

public actual fun sCardAccessStartedEvent(): Handle =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardAccessStartedEvent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardAddReaderToGroupA(hcontext.toLong(), (szreadername?.value ?: 0L), (szgroupname?.value ?: 0L))

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardAddReaderToGroupW(hcontext.toLong(), (szreadername?.value ?: 0L), (szgroupname?.value ?: 0L))

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardAudit(hcontext.toLong(), dwevent.toInt())

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardBeginTransaction(hcard.toLong())

public actual fun sCardCancel(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardCancel(hcontext.toLong())

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardConnectA(hcontext.toLong(), (szreader?.value ?: 0L), dwsharemode.toInt(), dwpreferredprotocols.toInt(), (phcard?.value ?: 0L), (pdwactiveprotocol?.value ?: 0L))

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardConnectW(hcontext.toLong(), (szreader?.value ?: 0L), dwsharemode.toInt(), dwpreferredprotocols.toInt(), (phcard?.value ?: 0L), (pdwactiveprotocol?.value ?: 0L))

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardControl(hcard.toLong(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardDisconnect(hcard.toLong(), dwdisposition.toInt())

public actual fun sCardDlgExtendedError(): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardDlgExtendedError()

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardEndTransaction(hcard.toLong(), dwdisposition.toInt())

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: COpaquePointer?, pvreserved2: COpaquePointer?, phcontext: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardEstablishContext(dwscope.toInt(), (pvreserved1?.value ?: 0L), (pvreserved2?.value ?: 0L), (phcontext?.value ?: 0L))

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardForgetCardTypeA(hcontext.toLong(), (szcardname?.value ?: 0L))

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardForgetCardTypeW(hcontext.toLong(), (szcardname?.value ?: 0L))

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardForgetReaderA(hcontext.toLong(), (szreadername?.value ?: 0L))

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardForgetReaderGroupA(hcontext.toLong(), (szgroupname?.value ?: 0L))

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardForgetReaderGroupW(hcontext.toLong(), (szgroupname?.value ?: 0L))

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardForgetReaderW(hcontext.toLong(), (szreadername?.value ?: 0L))

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardFreeMemory(hcontext.toLong(), (pvmem?.value ?: 0L))

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, pcbattrlen: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetAttrib(hcard.toLong(), dwattrid.toInt(), (pbattr?.value ?: 0L), (pcbattrlen?.value ?: 0L))

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameA(hcontext.toLong(), (szcardname?.value ?: 0L), dwproviderid.toInt(), (szprovider?.value ?: 0L), (pcchprovider?.value ?: 0L))

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameW(hcontext.toLong(), (szcardname?.value ?: 0L), dwproviderid.toInt(), (szprovider?.value ?: 0L), (pcchprovider?.value ?: 0L))

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdA(hcontext.toLong(), (szreadername?.value ?: 0L), (pdwdevicetypeid?.value ?: 0L))

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdW(hcontext.toLong(), (szreadername?.value ?: 0L), (pdwdevicetypeid?.value ?: 0L))

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetProviderIdA(hcontext.toLong(), (szcard?.value ?: 0L), (pguidproviderid?.value ?: 0L))

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetProviderIdW(hcontext.toLong(), (szcard?.value ?: 0L), (pguidproviderid?.value ?: 0L))

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdA(hcontext.toLong(), (szreadername?.value ?: 0L), (szdeviceinstanceid?.value ?: 0L), (pcchdeviceinstanceid?.value ?: 0L))

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdW(hcontext.toLong(), (szreadername?.value ?: 0L), (szdeviceinstanceid?.value ?: 0L), (pcchdeviceinstanceid?.value ?: 0L))

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetReaderIconA(hcontext.toLong(), (szreadername?.value ?: 0L), (pbicon?.value ?: 0L), (pcbicon?.value ?: 0L))

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetReaderIconW(hcontext.toLong(), (szreadername?.value ?: 0L), (pbicon?.value ?: 0L), (pcbicon?.value ?: 0L))

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetStatusChangeA(hcontext.toLong(), dwtimeout.toInt(), (rgreaderstates?.value ?: 0L), creaders.toInt())

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetStatusChangeW(hcontext.toLong(), dwtimeout.toInt(), (rgreaderstates?.value ?: 0L), creaders.toInt())

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardGetTransmitCount(hcard.toLong(), (pctransmitcount?.value ?: 0L))

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeA(hcontext.toLong(), (szcardname?.value ?: 0L), (pguidprimaryprovider?.value ?: 0L), (rgguidinterfaces?.value ?: 0L), dwinterfacecount.toInt(), (pbatr?.value ?: 0L), (pbatrmask?.value ?: 0L), cbatrlen.toInt())

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeW(hcontext.toLong(), (szcardname?.value ?: 0L), (pguidprimaryprovider?.value ?: 0L), (rgguidinterfaces?.value ?: 0L), dwinterfacecount.toInt(), (pbatr?.value ?: 0L), (pbatrmask?.value ?: 0L), cbatrlen.toInt())

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIntroduceReaderA(hcontext.toLong(), (szreadername?.value ?: 0L), (szdevicename?.value ?: 0L))

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupA(hcontext.toLong(), (szgroupname?.value ?: 0L))

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupW(hcontext.toLong(), (szgroupname?.value ?: 0L))

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIntroduceReaderW(hcontext.toLong(), (szreadername?.value ?: 0L), (szdevicename?.value ?: 0L))

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardIsValidContext(hcontext.toLong())

public actual fun sCardListCardsA(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListCardsA(hcontext.toLong(), (pbatr?.value ?: 0L), (rgquidinterfaces?.value ?: 0L), cguidinterfacecount.toInt(), (mszcards?.value ?: 0L), (pcchcards?.value ?: 0L))

public actual fun sCardListCardsW(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListCardsW(hcontext.toLong(), (pbatr?.value ?: 0L), (rgquidinterfaces?.value ?: 0L), cguidinterfacecount.toInt(), (mszcards?.value ?: 0L), (pcchcards?.value ?: 0L))

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListInterfacesA(hcontext.toLong(), (szcard?.value ?: 0L), (pguidinterfaces?.value ?: 0L), (pcguidinterfaces?.value ?: 0L))

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListInterfacesW(hcontext.toLong(), (szcard?.value ?: 0L), (pguidinterfaces?.value ?: 0L), (pcguidinterfaces?.value ?: 0L))

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListReaderGroupsA(hcontext.toLong(), (mszgroups?.value ?: 0L), (pcchgroups?.value ?: 0L))

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListReaderGroupsW(hcontext.toLong(), (mszgroups?.value ?: 0L), (pcchgroups?.value ?: 0L))

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListReadersA(hcontext.toLong(), (mszgroups?.value ?: 0L), (mszreaders?.value ?: 0L), (pcchreaders?.value ?: 0L))

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListReadersW(hcontext.toLong(), (mszgroups?.value ?: 0L), (mszreaders?.value ?: 0L), (pcchreaders?.value ?: 0L))

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdA(hcontext.toLong(), (szdeviceinstanceid?.value ?: 0L), (mszreaders?.value ?: 0L), (pcchreaders?.value ?: 0L))

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdW(hcontext.toLong(), (szdeviceinstanceid?.value ?: 0L), (mszreaders?.value ?: 0L), (pcchreaders?.value ?: 0L))

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardLocateCardsA(hcontext.toLong(), (mszcards?.value ?: 0L), (rgreaderstates?.value ?: 0L), creaders.toInt())

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardLocateCardsByATRA(hcontext.toLong(), (rgatrmasks?.value ?: 0L), catrs.toInt(), (rgreaderstates?.value ?: 0L), creaders.toInt())

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardLocateCardsByATRW(hcontext.toLong(), (rgatrmasks?.value ?: 0L), catrs.toInt(), (rgreaderstates?.value ?: 0L), creaders.toInt())

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardLocateCardsW(hcontext.toLong(), (mszcards?.value ?: 0L), (rgreaderstates?.value ?: 0L), creaders.toInt())

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardReadCacheA(hcontext.toLong(), (cardidentifier?.value ?: 0L), freshnesscounter.toInt(), (lookupname?.value ?: 0L), (data?.value ?: 0L), (datalen?.value ?: 0L))

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardReadCacheW(hcontext.toLong(), (cardidentifier?.value ?: 0L), freshnesscounter.toInt(), (lookupname?.value ?: 0L), (data?.value ?: 0L), (datalen?.value ?: 0L))

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardReconnect(hcard.toLong(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), (pdwactiveprotocol?.value ?: 0L))

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardReleaseContext(hcontext.toLong())

public actual fun sCardReleaseStartedEvent() {
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardReleaseStartedEvent()
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupA(hcontext.toLong(), (szreadername?.value ?: 0L), (szgroupname?.value ?: 0L))

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupW(hcontext.toLong(), (szreadername?.value ?: 0L), (szgroupname?.value ?: 0L))

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, cbattrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardSetAttrib(hcard.toLong(), dwattrid.toInt(), (pbattr?.value ?: 0L), cbattrlen.toInt())

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameA(hcontext.toLong(), (szcardname?.value ?: 0L), dwproviderid.toInt(), (szprovider?.value ?: 0L))

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameW(hcontext.toLong(), (szcardname?.value ?: 0L), dwproviderid.toInt(), (szprovider?.value ?: 0L))

public actual fun sCardState(hcard: ULong, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardState(hcard.toLong(), (pdwstate?.value ?: 0L), (pdwprotocol?.value ?: 0L), (pbatr?.value ?: 0L), (pcbatrlen?.value ?: 0L))

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardStatusA(hcard.toLong(), (mszreadernames?.value ?: 0L), (pcchreaderlen?.value ?: 0L), (pdwstate?.value ?: 0L), (pdwprotocol?.value ?: 0L), (pbatr?.value ?: 0L), (pcbatrlen?.value ?: 0L))

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardStatusW(hcard.toLong(), (mszreadernames?.value ?: 0L), (pcchreaderlen?.value ?: 0L), (pdwstate?.value ?: 0L), (pdwprotocol?.value ?: 0L), (pbatr?.value ?: 0L), (pcbatrlen?.value ?: 0L))

public actual fun sCardTransmit(hcard: ULong, piosendpci: COpaquePointer?, pbsendbuffer: COpaquePointer?, cbsendlength: UInt, piorecvpci: COpaquePointer?, pbrecvbuffer: COpaquePointer?, pcbrecvlength: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardTransmit(hcard.toLong(), (piosendpci?.value ?: 0L), (pbsendbuffer?.value ?: 0L), cbsendlength.toInt(), (piorecvpci?.value ?: 0L), (pbrecvbuffer?.value ?: 0L), (pcbrecvlength?.value ?: 0L))

public actual fun sCardUIDlgSelectCardA(param0: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardA((param0?.value ?: 0L))

public actual fun sCardUIDlgSelectCardW(param0: COpaquePointer?): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardW((param0?.value ?: 0L))

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardWriteCacheA(hcontext.toLong(), (cardidentifier?.value ?: 0L), freshnesscounter.toInt(), (lookupname?.value ?: 0L), (data?.value ?: 0L), datalen.toInt())

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssys_windows_win32_security_credentials_sCardWriteCacheW(hcontext.toLong(), (cardidentifier?.value ?: 0L), freshnesscounter.toInt(), (lookupname?.value ?: 0L), (data?.value ?: 0L), datalen.toInt())
