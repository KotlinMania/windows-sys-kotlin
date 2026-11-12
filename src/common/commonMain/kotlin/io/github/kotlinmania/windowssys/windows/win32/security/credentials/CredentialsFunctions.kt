package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
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

public expect fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentiala>>>): Bool

public expect fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentialw>>>): Bool

public expect fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<Credentiala>>): Bool

public expect fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<Credentialw>>): Bool

public expect fun credFree(buffer: ConstPtr<CVoid>)

public expect fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr<UInt>): Bool

public expect fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr<MutPtr<CredentialTargetInformationa>>): Bool

public expect fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>): Bool

public expect fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool

public expect fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool

public expect fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr<CredProtectionType>): Bool

public expect fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr<CredProtectionType>): Bool

public expect fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr<CVoid>, marshaledcredential: MutPtr<Pstr>): Bool

public expect fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr<CVoid>, marshaledcredential: MutPtr<Pwstr>): Bool

public expect fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr<UByte>, pcbpackedcredentials: MutPtr<UInt>): Bool

public expect fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr<UByte>, pcbpackedcredentials: MutPtr<UInt>): Bool

public expect fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr<UInt>, protectiontype: MutPtr<CredProtectionType>): Bool

public expect fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr<UInt>, protectiontype: MutPtr<CredProtectionType>): Bool

public expect fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr<MutPtr<Credentiala>>): Bool

public expect fun credReadDomainCredentialsA(targetinfo: ConstPtr<CredentialTargetInformationa>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentiala>>>): Bool

public expect fun credReadDomainCredentialsW(targetinfo: ConstPtr<CredentialTargetInformationw>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentialw>>>): Bool

public expect fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr<MutPtr<Credentialw>>): Bool

public expect fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool

public expect fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool

public expect fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr<Bool>, dwflags: CreduiFlags): UInt

public expect fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr<Bool>, dwflags: CreduiFlags): UInt

public expect fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt

public expect fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt

public expect fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error

public expect fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error

public expect fun credUIPromptForCredentialsA(puiinfo: ConstPtr<CreduiInfoa>, psztargetname: Pcstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr<Bool>, dwflags: CreduiFlags): Win32Error

public expect fun credUIPromptForCredentialsW(puiinfo: ConstPtr<CreduiInfow>, psztargetname: Pcwstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr<Bool>, dwflags: CreduiFlags): Win32Error

public expect fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr<CreduiInfoa>, dwautherror: UInt, pulauthpackage: MutPtr<UInt>, pvinauthbuffer: ConstPtr<CVoid>, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr<MutPtr<CVoid>>, puloutauthbuffersize: MutPtr<UInt>, pfsave: MutPtr<Bool>, dwflags: CreduiwinFlags): UInt

public expect fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr<CreduiInfow>, dwautherror: UInt, pulauthpackage: MutPtr<UInt>, pvinauthbuffer: ConstPtr<CVoid>, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr<MutPtr<CVoid>>, puloutauthbuffersize: MutPtr<UInt>, pfsave: MutPtr<Bool>, dwflags: CreduiwinFlags): UInt

public expect fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr<Pwstr>): UInt

public expect fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt

public expect fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr<UInt>, pszdomainname: Pstr, pcchmaxdomainname: MutPtr<UInt>, pszpassword: Pstr, pcchmaxpassword: MutPtr<UInt>): Bool

public expect fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr<UInt>, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr<UInt>, pszpassword: Pwstr, pcchmaxpassword: MutPtr<UInt>): Bool

public expect fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr<CredMarshalType>, credential: MutPtr<MutPtr<CVoid>>): Bool

public expect fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr<CredMarshalType>, credential: MutPtr<MutPtr<CVoid>>): Bool

public expect fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr<UInt>): Bool

public expect fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr<UInt>): Bool

public expect fun credWriteA(credential: ConstPtr<Credentiala>, flags: UInt): Bool

public expect fun credWriteDomainCredentialsA(targetinfo: ConstPtr<CredentialTargetInformationa>, credential: ConstPtr<Credentiala>, flags: UInt): Bool

public expect fun credWriteDomainCredentialsW(targetinfo: ConstPtr<CredentialTargetInformationw>, credential: ConstPtr<Credentialw>, flags: UInt): Bool

public expect fun credWriteW(credential: ConstPtr<Credentialw>, flags: UInt): Bool

public expect fun getOpenCardNameA(param0: MutPtr<Opencardnamea>): Int

public expect fun getOpenCardNameW(param0: MutPtr<Opencardnamew>): Int

public expect fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr<KeyCredentialManagerInfo>)

public expect fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr<MutPtr<KeyCredentialManagerInfo>>): Hresult

public expect fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr<Bool>, keycredentialmanageroperationerrorstates: MutPtr<KeyCredentialManagerOperationErrorStates>): Hresult

public expect fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult

public expect fun sCardAccessStartedEvent(): Handle

public expect fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int

public expect fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int

public expect fun sCardAudit(hcontext: ULong, dwevent: UInt): Int

public expect fun sCardBeginTransaction(hcard: ULong): Int

public expect fun sCardCancel(hcontext: ULong): Int

public expect fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr<ULong>, pdwactiveprotocol: MutPtr<UInt>): Int

public expect fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr<ULong>, pdwactiveprotocol: MutPtr<UInt>): Int

public expect fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Int

public expect fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int

public expect fun sCardDlgExtendedError(): Int

public expect fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int

public expect fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr<CVoid>, pvreserved2: ConstPtr<CVoid>, phcontext: MutPtr<ULong>): Int

public expect fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int

public expect fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int

public expect fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int

public expect fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int

public expect fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int

public expect fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int

public expect fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr<CVoid>): Int

public expect fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr<UByte>, pcbattrlen: MutPtr<UInt>): Int

public expect fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr<UInt>): Int

public expect fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr<UInt>): Int

public expect fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr<UInt>): Int

public expect fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr<UInt>): Int

public expect fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr<Guid>): Int

public expect fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr<Guid>): Int

public expect fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr<UInt>): Int

public expect fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr<UInt>): Int

public expect fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr<UByte>, pcbicon: MutPtr<UInt>): Int

public expect fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr<UByte>, pcbicon: MutPtr<UInt>): Int

public expect fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int

public expect fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int

public expect fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr<UInt>): Int

public expect fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr<Guid>, rgguidinterfaces: ConstPtr<Guid>, dwinterfacecount: UInt, pbatr: ConstPtr<UByte>, pbatrmask: ConstPtr<UByte>, cbatrlen: UInt): Int

public expect fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr<Guid>, rgguidinterfaces: ConstPtr<Guid>, dwinterfacecount: UInt, pbatr: ConstPtr<UByte>, pbatrmask: ConstPtr<UByte>, cbatrlen: UInt): Int

public expect fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int

public expect fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int

public expect fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int

public expect fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int

public expect fun sCardIsValidContext(hcontext: ULong): Int

public expect fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr<UByte>, rgquidinterfaces: ConstPtr<Guid>, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr<UInt>): Int

public expect fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr<UByte>, rgquidinterfaces: ConstPtr<Guid>, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr<UInt>): Int

public expect fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr<Guid>, pcguidinterfaces: MutPtr<UInt>): Int

public expect fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr<Guid>, pcguidinterfaces: MutPtr<UInt>): Int

public expect fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr<UInt>): Int

public expect fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr<UInt>): Int

public expect fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr<UInt>): Int

public expect fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr<UInt>): Int

public expect fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr<UInt>): Int

public expect fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr<UInt>): Int

public expect fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int

public expect fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr<ScardAtrmask>, catrs: UInt, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int

public expect fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr<ScardAtrmask>, catrs: UInt, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int

public expect fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int

public expect fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr<UByte>, datalen: MutPtr<UInt>): Int

public expect fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr<UByte>, datalen: MutPtr<UInt>): Int

public expect fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr<UInt>): Int

public expect fun sCardReleaseContext(hcontext: ULong): Int

public expect fun sCardReleaseStartedEvent()

public expect fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int

public expect fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int

public expect fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr<UByte>, cbattrlen: UInt): Int

public expect fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int

public expect fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int

public expect fun sCardState(hcard: ULong, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int

public expect fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr<UInt>, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int

public expect fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr<UInt>, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int

public expect fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr<ScardIoRequest>, pbsendbuffer: ConstPtr<UByte>, cbsendlength: UInt, piorecvpci: MutPtr<ScardIoRequest>, pbrecvbuffer: MutPtr<UByte>, pcbrecvlength: MutPtr<UInt>): Int

public expect fun sCardUIDlgSelectCardA(param0: MutPtr<OpencardnameExa>): Int

public expect fun sCardUIDlgSelectCardW(param0: MutPtr<OpencardnameExw>): Int

public expect fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr<UByte>, datalen: UInt): Int

public expect fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr<UByte>, datalen: UInt): Int
