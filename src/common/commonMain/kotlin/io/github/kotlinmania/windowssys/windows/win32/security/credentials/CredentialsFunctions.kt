package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool

public expect fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool

public expect fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr): Bool

public expect fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr): Bool

public expect fun credFree(buffer: ConstPtr)

public expect fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr): Bool

public expect fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr): Bool

public expect fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr): Bool

public expect fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool

public expect fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool

public expect fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr): Bool

public expect fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr): Bool

public expect fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool

public expect fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool

public expect fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool

public expect fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool

public expect fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool

public expect fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool

public expect fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr): Bool

public expect fun credReadDomainCredentialsA(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool

public expect fun credReadDomainCredentialsW(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool

public expect fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr): Bool

public expect fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool

public expect fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool

public expect fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt

public expect fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt

public expect fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt

public expect fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt

public expect fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error

public expect fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error

public expect fun credUIPromptForCredentialsA(puiinfo: ConstPtr, psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error

public expect fun credUIPromptForCredentialsW(puiinfo: ConstPtr, psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error

public expect fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt

public expect fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt

public expect fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr): UInt

public expect fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt

public expect fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr, pszdomainname: Pstr, pcchmaxdomainname: MutPtr, pszpassword: Pstr, pcchmaxpassword: MutPtr): Bool

public expect fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr, pszpassword: Pwstr, pcchmaxpassword: MutPtr): Bool

public expect fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr, credential: MutPtr): Bool

public expect fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr, credential: MutPtr): Bool

public expect fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr): Bool

public expect fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr): Bool

public expect fun credWriteA(credential: ConstPtr, flags: UInt): Bool

public expect fun credWriteDomainCredentialsA(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool

public expect fun credWriteDomainCredentialsW(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool

public expect fun credWriteW(credential: ConstPtr, flags: UInt): Bool

public expect fun getOpenCardNameA(param0: MutPtr): Int

public expect fun getOpenCardNameW(param0: MutPtr): Int

public expect fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr)

public expect fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr): Hresult

public expect fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr, keycredentialmanageroperationerrorstates: MutPtr): Hresult

public expect fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult

public expect fun sCardAccessStartedEvent(): Handle

public expect fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int

public expect fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int

public expect fun sCardAudit(hcontext: ULong, dwevent: UInt): Int

public expect fun sCardBeginTransaction(hcard: ULong): Int

public expect fun sCardCancel(hcontext: ULong): Int

public expect fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int

public expect fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int

public expect fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): Int

public expect fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int

public expect fun sCardDlgExtendedError(): Int

public expect fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int

public expect fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr, pvreserved2: ConstPtr, phcontext: MutPtr): Int

public expect fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int

public expect fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int

public expect fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int

public expect fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int

public expect fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int

public expect fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int

public expect fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr): Int

public expect fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr, pcbattrlen: MutPtr): Int

public expect fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr): Int

public expect fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr): Int

public expect fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr): Int

public expect fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr): Int

public expect fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr): Int

public expect fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr): Int

public expect fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr): Int

public expect fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr): Int

public expect fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr, pcbicon: MutPtr): Int

public expect fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr, pcbicon: MutPtr): Int

public expect fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int

public expect fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int

public expect fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr): Int

public expect fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int

public expect fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int

public expect fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int

public expect fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int

public expect fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int

public expect fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int

public expect fun sCardIsValidContext(hcontext: ULong): Int

public expect fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr): Int

public expect fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr): Int

public expect fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int

public expect fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int

public expect fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr): Int

public expect fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr): Int

public expect fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int

public expect fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int

public expect fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int

public expect fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int

public expect fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr, creaders: UInt): Int

public expect fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int

public expect fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int

public expect fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr, creaders: UInt): Int

public expect fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr, datalen: MutPtr): Int

public expect fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr, datalen: MutPtr): Int

public expect fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr): Int

public expect fun sCardReleaseContext(hcontext: ULong): Int

public expect fun sCardReleaseStartedEvent()

public expect fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int

public expect fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int

public expect fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr, cbattrlen: UInt): Int

public expect fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int

public expect fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int

public expect fun sCardState(hcard: ULong, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int

public expect fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int

public expect fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int

public expect fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr, pbsendbuffer: ConstPtr, cbsendlength: UInt, piorecvpci: MutPtr, pbrecvbuffer: MutPtr, pcbrecvlength: MutPtr): Int

public expect fun sCardUIDlgSelectCardA(param0: MutPtr): Int

public expect fun sCardUIDlgSelectCardW(param0: MutPtr): Int

public expect fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr, datalen: UInt): Int

public expect fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr, datalen: UInt): Int
