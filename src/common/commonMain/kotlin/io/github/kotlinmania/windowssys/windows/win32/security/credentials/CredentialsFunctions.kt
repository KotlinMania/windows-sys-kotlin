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

public expect fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool

public expect fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool

public expect fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool

public expect fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool

public expect fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool

public expect fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool

public expect fun credFree(buffer: COpaquePointer?)

public expect fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: COpaquePointer?): Bool

public expect fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: COpaquePointer?): Bool

public expect fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: COpaquePointer?): Bool

public expect fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool

public expect fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool

public expect fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: COpaquePointer?): Bool

public expect fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: COpaquePointer?): Bool

public expect fun credMarshalCredentialA(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool

public expect fun credMarshalCredentialW(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool

public expect fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool

public expect fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool

public expect fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool

public expect fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool

public expect fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool

public expect fun credReadDomainCredentialsA(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool

public expect fun credReadDomainCredentialsW(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool

public expect fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool

public expect fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool

public expect fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool

public expect fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt

public expect fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt

public expect fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt

public expect fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt

public expect fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error

public expect fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error

public expect fun credUIPromptForCredentialsA(puiinfo: COpaquePointer?, psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error

public expect fun credUIPromptForCredentialsW(puiinfo: COpaquePointer?, psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error

public expect fun credUIPromptForWindowsCredentialsA(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt

public expect fun credUIPromptForWindowsCredentialsW(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt

public expect fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: COpaquePointer?): UInt

public expect fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt

public expect fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: COpaquePointer?, pszdomainname: Pstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pstr, pcchmaxpassword: COpaquePointer?): Bool

public expect fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: COpaquePointer?, pszdomainname: Pwstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pwstr, pcchmaxpassword: COpaquePointer?): Bool

public expect fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool

public expect fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool

public expect fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: COpaquePointer?): Bool

public expect fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: COpaquePointer?): Bool

public expect fun credWriteA(credential: COpaquePointer?, flags: UInt): Bool

public expect fun credWriteDomainCredentialsA(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool

public expect fun credWriteDomainCredentialsW(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool

public expect fun credWriteW(credential: COpaquePointer?, flags: UInt): Bool

public expect fun getOpenCardNameA(param0: COpaquePointer?): Int

public expect fun getOpenCardNameW(param0: COpaquePointer?): Int

public expect fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: COpaquePointer?)

public expect fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: COpaquePointer?): Hresult

public expect fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: COpaquePointer?, keycredentialmanageroperationerrorstates: COpaquePointer?): Hresult

public expect fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult

public expect fun sCardAccessStartedEvent(): Handle

public expect fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int

public expect fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int

public expect fun sCardAudit(hcontext: ULong, dwevent: UInt): Int

public expect fun sCardBeginTransaction(hcard: ULong): Int

public expect fun sCardCancel(hcontext: ULong): Int

public expect fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int

public expect fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int

public expect fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Int

public expect fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int

public expect fun sCardDlgExtendedError(): Int

public expect fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int

public expect fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: COpaquePointer?, pvreserved2: COpaquePointer?, phcontext: COpaquePointer?): Int

public expect fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int

public expect fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int

public expect fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int

public expect fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int

public expect fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int

public expect fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int

public expect fun sCardFreeMemory(hcontext: ULong, pvmem: COpaquePointer?): Int

public expect fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, pcbattrlen: COpaquePointer?): Int

public expect fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: COpaquePointer?): Int

public expect fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: COpaquePointer?): Int

public expect fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: COpaquePointer?): Int

public expect fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: COpaquePointer?): Int

public expect fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: COpaquePointer?): Int

public expect fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: COpaquePointer?): Int

public expect fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: COpaquePointer?): Int

public expect fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: COpaquePointer?): Int

public expect fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int

public expect fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int

public expect fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int

public expect fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int

public expect fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: COpaquePointer?): Int

public expect fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int

public expect fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int

public expect fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int

public expect fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int

public expect fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int

public expect fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int

public expect fun sCardIsValidContext(hcontext: ULong): Int

public expect fun sCardListCardsA(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: COpaquePointer?): Int

public expect fun sCardListCardsW(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: COpaquePointer?): Int

public expect fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int

public expect fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int

public expect fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: COpaquePointer?): Int

public expect fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: COpaquePointer?): Int

public expect fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int

public expect fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int

public expect fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int

public expect fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int

public expect fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int

public expect fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int

public expect fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int

public expect fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int

public expect fun sCardReadCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: COpaquePointer?): Int

public expect fun sCardReadCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: COpaquePointer?): Int

public expect fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: COpaquePointer?): Int

public expect fun sCardReleaseContext(hcontext: ULong): Int

public expect fun sCardReleaseStartedEvent()

public expect fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int

public expect fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int

public expect fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, cbattrlen: UInt): Int

public expect fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int

public expect fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int

public expect fun sCardState(hcard: ULong, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int

public expect fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int

public expect fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int

public expect fun sCardTransmit(hcard: ULong, piosendpci: COpaquePointer?, pbsendbuffer: COpaquePointer?, cbsendlength: UInt, piorecvpci: COpaquePointer?, pbrecvbuffer: COpaquePointer?, pcbrecvlength: COpaquePointer?): Int

public expect fun sCardUIDlgSelectCardA(param0: COpaquePointer?): Int

public expect fun sCardUIDlgSelectCardW(param0: COpaquePointer?): Int

public expect fun sCardWriteCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: UInt): Int

public expect fun sCardWriteCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: UInt): Int
