@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredDeleteA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredDeleteW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredEnumerateA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredEnumerateW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredFree
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredIsProtectedA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredIsProtectedW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredProtectA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredProtectW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredReadA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredReadW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredRenameA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredRenameW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUnprotectA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredUnprotectW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredWriteA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsCredWriteW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardAudit
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardCancel
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardConnectA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardConnectW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardControl
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardDisconnect
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardEndTransaction
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardEstablishContext
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetAttrib
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardIsValidContext
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListCardsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListCardsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListReadersA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListReadersW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardReadCacheA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardReadCacheW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardReconnect
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardReleaseContext
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardSetAttrib
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardState
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardStatusA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardStatusW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardTransmit
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredDeleteA(targetname.rawAddress.toCPointer<ByteVar>(), type, flags)

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredDeleteW(targetname.rawAddress.toCPointer<ByteVar>(), type, flags)

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredEnumerateA(filter.rawAddress.toCPointer<ByteVar>(), flags, count.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>())

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredEnumerateW(filter.rawAddress.toCPointer<ByteVar>(), flags, count.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>())

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(targetname.rawAddress.toCPointer<ByteVar>(), type, flags, credential.rawAddress.toCPointer<ByteVar>())

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(targetname.rawAddress.toCPointer<ByteVar>(), type, flags, credential.rawAddress.toCPointer<ByteVar>())

public actual fun credFree(buffer: ConstPtr) {
    windowssysWindowsWin32SecurityCredentialsCredFree(buffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(maximumpersistcount, maximumpersist.rawAddress.toCPointer<ByteVar>())

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(targetname.rawAddress.toCPointer<ByteVar>(), flags, targetinfo.rawAddress.toCPointer<ByteVar>())

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(targetname.rawAddress.toCPointer<ByteVar>(), flags, targetinfo.rawAddress.toCPointer<ByteVar>())

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(marshaledcredential.rawAddress.toCPointer<ByteVar>())

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(marshaledcredential.rawAddress.toCPointer<ByteVar>())

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredIsProtectedA(pszprotectedcredentials.rawAddress.toCPointer<ByteVar>(), pprotectiontype.rawAddress.toCPointer<ByteVar>())

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredIsProtectedW(pszprotectedcredentials.rawAddress.toCPointer<ByteVar>(), pprotectiontype.rawAddress.toCPointer<ByteVar>())

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(credtype, credential.rawAddress.toCPointer<ByteVar>(), marshaledcredential.rawAddress.toCPointer<ByteVar>())

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(credtype, credential.rawAddress.toCPointer<ByteVar>(), marshaledcredential.rawAddress.toCPointer<ByteVar>())

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(dwflags, pszusername.rawAddress.toCPointer<ByteVar>(), pszpassword.rawAddress.toCPointer<ByteVar>(), ppackedcredentials.rawAddress.toCPointer<ByteVar>(), pcbpackedcredentials.rawAddress.toCPointer<ByteVar>())

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(dwflags, pszusername.rawAddress.toCPointer<ByteVar>(), pszpassword.rawAddress.toCPointer<ByteVar>(), ppackedcredentials.rawAddress.toCPointer<ByteVar>(), pcbpackedcredentials.rawAddress.toCPointer<ByteVar>())

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredProtectA(fasself, pszcredentials.rawAddress.toCPointer<ByteVar>(), cchcredentials, pszprotectedcredentials.rawAddress.toCPointer<ByteVar>(), pcchmaxchars.rawAddress.toCPointer<ByteVar>(), protectiontype.rawAddress.toCPointer<ByteVar>())

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredProtectW(fasself, pszcredentials.rawAddress.toCPointer<ByteVar>(), cchcredentials, pszprotectedcredentials.rawAddress.toCPointer<ByteVar>(), pcchmaxchars.rawAddress.toCPointer<ByteVar>(), protectiontype.rawAddress.toCPointer<ByteVar>())

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredReadA(targetname.rawAddress.toCPointer<ByteVar>(), type, flags, credential.rawAddress.toCPointer<ByteVar>())

public actual fun credReadDomainCredentialsA(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(targetinfo.rawAddress.toCPointer<ByteVar>(), flags, count.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>())

public actual fun credReadDomainCredentialsW(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(targetinfo.rawAddress.toCPointer<ByteVar>(), flags, count.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>())

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredReadW(targetname.rawAddress.toCPointer<ByteVar>(), type, flags, credential.rawAddress.toCPointer<ByteVar>())

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredRenameA(oldtargetname.rawAddress.toCPointer<ByteVar>(), newtargetname.rawAddress.toCPointer<ByteVar>(), type, flags)

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredRenameW(oldtargetname.rawAddress.toCPointer<ByteVar>(), newtargetname.rawAddress.toCPointer<ByteVar>(), type, flags)

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(psztargetname.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), dwautherror, username.rawAddress.toCPointer<ByteVar>(), uluserbuffersize, pszpassword.rawAddress.toCPointer<ByteVar>(), ulpasswordbuffersize, pfsave.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(psztargetname.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), dwautherror, username.rawAddress.toCPointer<ByteVar>(), uluserbuffersize, pszpassword.rawAddress.toCPointer<ByteVar>(), ulpasswordbuffersize, pfsave.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(psztargetname.rawAddress.toCPointer<ByteVar>(), bconfirm)

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(psztargetname.rawAddress.toCPointer<ByteVar>(), bconfirm)

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(username.rawAddress.toCPointer<ByteVar>(), user.rawAddress.toCPointer<ByteVar>(), userbuffersize, domain.rawAddress.toCPointer<ByteVar>(), domainbuffersize)

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(username.rawAddress.toCPointer<ByteVar>(), user.rawAddress.toCPointer<ByteVar>(), userbuffersize, domain.rawAddress.toCPointer<ByteVar>(), domainbuffersize)

public actual fun credUIPromptForCredentialsA(puiinfo: ConstPtr, psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error =
    windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(puiinfo.rawAddress.toCPointer<ByteVar>(), psztargetname.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), dwautherror, pszusername.rawAddress.toCPointer<ByteVar>(), ulusernamebuffersize, pszpassword.rawAddress.toCPointer<ByteVar>(), ulpasswordbuffersize, save.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun credUIPromptForCredentialsW(puiinfo: ConstPtr, psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error =
    windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(puiinfo.rawAddress.toCPointer<ByteVar>(), psztargetname.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), dwautherror, pszusername.rawAddress.toCPointer<ByteVar>(), ulusernamebuffersize, pszpassword.rawAddress.toCPointer<ByteVar>(), ulpasswordbuffersize, save.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(puiinfo.rawAddress.toCPointer<ByteVar>(), dwautherror, pulauthpackage.rawAddress.toCPointer<ByteVar>(), pvinauthbuffer.rawAddress.toCPointer<ByteVar>(), ulinauthbuffersize, ppvoutauthbuffer.rawAddress.toCPointer<ByteVar>(), puloutauthbuffersize.rawAddress.toCPointer<ByteVar>(), pfsave.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(puiinfo.rawAddress.toCPointer<ByteVar>(), dwautherror, pulauthpackage.rawAddress.toCPointer<ByteVar>(), pvinauthbuffer.rawAddress.toCPointer<ByteVar>(), ulinauthbuffersize, ppvoutauthbuffer.rawAddress.toCPointer<ByteVar>(), puloutauthbuffersize.rawAddress.toCPointer<ByteVar>(), pfsave.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(pszrealm.rawAddress.toCPointer<ByteVar>(), ppszusername.rawAddress.toCPointer<ByteVar>())

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(pszrealm.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), pszpassword.rawAddress.toCPointer<ByteVar>(), bpersist)

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr, pszdomainname: Pstr, pcchmaxdomainname: MutPtr, pszpassword: Pstr, pcchmaxpassword: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(dwflags, pauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, pszusername.rawAddress.toCPointer<ByteVar>(), pcchlmaxusername.rawAddress.toCPointer<ByteVar>(), pszdomainname.rawAddress.toCPointer<ByteVar>(), pcchmaxdomainname.rawAddress.toCPointer<ByteVar>(), pszpassword.rawAddress.toCPointer<ByteVar>(), pcchmaxpassword.rawAddress.toCPointer<ByteVar>())

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr, pszpassword: Pwstr, pcchmaxpassword: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(dwflags, pauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, pszusername.rawAddress.toCPointer<ByteVar>(), pcchmaxusername.rawAddress.toCPointer<ByteVar>(), pszdomainname.rawAddress.toCPointer<ByteVar>(), pcchmaxdomainname.rawAddress.toCPointer<ByteVar>(), pszpassword.rawAddress.toCPointer<ByteVar>(), pcchmaxpassword.rawAddress.toCPointer<ByteVar>())

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(marshaledcredential.rawAddress.toCPointer<ByteVar>(), credtype.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>())

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr, credential: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(marshaledcredential.rawAddress.toCPointer<ByteVar>(), credtype.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>())

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredUnprotectA(fasself, pszprotectedcredentials.rawAddress.toCPointer<ByteVar>(), cchprotectedcredentials, pszcredentials.rawAddress.toCPointer<ByteVar>(), pcchmaxchars.rawAddress.toCPointer<ByteVar>())

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr): Bool =
    windowssysWindowsWin32SecurityCredentialsCredUnprotectW(fasself, pszprotectedcredentials.rawAddress.toCPointer<ByteVar>(), cchprotectedcredentials, pszcredentials.rawAddress.toCPointer<ByteVar>(), pcchmaxchars.rawAddress.toCPointer<ByteVar>())

public actual fun credWriteA(credential: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredWriteA(credential.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun credWriteDomainCredentialsA(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(targetinfo.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun credWriteDomainCredentialsW(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(targetinfo.rawAddress.toCPointer<ByteVar>(), credential.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun credWriteW(credential: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32SecurityCredentialsCredWriteW(credential.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getOpenCardNameA(param0: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun getOpenCardNameW(param0: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr) {
    windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(keycredentialmanagerinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr): Hresult =
    windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(keycredentialmanagerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr, keycredentialmanageroperationerrorstates: MutPtr): Hresult =
    windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready.rawAddress.toCPointer<ByteVar>(), keycredentialmanageroperationerrorstates.rawAddress.toCPointer<ByteVar>())

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(hwndowner.rawAddress.toCPointer<ByteVar>(), keycredentialmanageroperationtype)

public actual fun sCardAccessStartedEvent(): Handle =
    MutPtr(windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent()?.toLong() ?: 0L)

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext, dwevent)

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard)

public actual fun sCardCancel(hcontext: ULong): Int =
    windowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext)

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardConnectA(hcontext, szreader.rawAddress.toCPointer<ByteVar>(), dwsharemode, dwpreferredprotocols, phcard.rawAddress.toCPointer<ByteVar>(), pdwactiveprotocol.rawAddress.toCPointer<ByteVar>())

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardConnectW(hcontext, szreader.rawAddress.toCPointer<ByteVar>(), dwsharemode, dwpreferredprotocols, phcard.rawAddress.toCPointer<ByteVar>(), pdwactiveprotocol.rawAddress.toCPointer<ByteVar>())

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardControl(hcard, dwcontrolcode, lpinbuffer.rawAddress.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.rawAddress.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard, dwdisposition)

public actual fun sCardDlgExtendedError(): Int =
    windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError()

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard, dwdisposition)

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr, pvreserved2: ConstPtr, phcontext: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardEstablishContext(dwscope, pvreserved1.rawAddress.toCPointer<ByteVar>(), pvreserved2.rawAddress.toCPointer<ByteVar>(), phcontext.rawAddress.toCPointer<ByteVar>())

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(hcontext, szcardname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(hcontext, szcardname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>())

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(hcontext, szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(hcontext, szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>())

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardFreeMemory(hcontext, pvmem.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr, pcbattrlen: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetAttrib(hcard, dwattrid, pbattr.rawAddress.toCPointer<ByteVar>(), pcbattrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(hcontext, szcardname.rawAddress.toCPointer<ByteVar>(), dwproviderid, szprovider.rawAddress.toCPointer<ByteVar>(), pcchprovider.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(hcontext, szcardname.rawAddress.toCPointer<ByteVar>(), dwproviderid, szprovider.rawAddress.toCPointer<ByteVar>(), pcchprovider.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), pdwdevicetypeid.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), pdwdevicetypeid.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(hcontext, szcard.rawAddress.toCPointer<ByteVar>(), pguidproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(hcontext, szcard.rawAddress.toCPointer<ByteVar>(), pguidproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szdeviceinstanceid.rawAddress.toCPointer<ByteVar>(), pcchdeviceinstanceid.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szdeviceinstanceid.rawAddress.toCPointer<ByteVar>(), pcchdeviceinstanceid.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr, pcbicon: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), pbicon.rawAddress.toCPointer<ByteVar>(), pcbicon.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr, pcbicon: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), pbicon.rawAddress.toCPointer<ByteVar>(), pcbicon.rawAddress.toCPointer<ByteVar>())

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(hcontext, dwtimeout, rgreaderstates.rawAddress.toCPointer<ByteVar>(), creaders)

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(hcontext, dwtimeout, rgreaderstates.rawAddress.toCPointer<ByteVar>(), creaders)

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(hcard, pctransmitcount.rawAddress.toCPointer<ByteVar>())

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(hcontext, szcardname.rawAddress.toCPointer<ByteVar>(), pguidprimaryprovider.rawAddress.toCPointer<ByteVar>(), rgguidinterfaces.rawAddress.toCPointer<ByteVar>(), dwinterfacecount, pbatr.rawAddress.toCPointer<ByteVar>(), pbatrmask.rawAddress.toCPointer<ByteVar>(), cbatrlen)

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(hcontext, szcardname.rawAddress.toCPointer<ByteVar>(), pguidprimaryprovider.rawAddress.toCPointer<ByteVar>(), rgguidinterfaces.rawAddress.toCPointer<ByteVar>(), dwinterfacecount, pbatr.rawAddress.toCPointer<ByteVar>(), pbatrmask.rawAddress.toCPointer<ByteVar>(), cbatrlen)

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(hcontext, szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(hcontext, szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    windowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext)

public actual fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListCardsA(hcontext, pbatr.rawAddress.toCPointer<ByteVar>(), rgquidinterfaces.rawAddress.toCPointer<ByteVar>(), cguidinterfacecount, mszcards.rawAddress.toCPointer<ByteVar>(), pcchcards.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListCardsW(hcontext, pbatr.rawAddress.toCPointer<ByteVar>(), rgquidinterfaces.rawAddress.toCPointer<ByteVar>(), cguidinterfacecount, mszcards.rawAddress.toCPointer<ByteVar>(), pcchcards.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(hcontext, szcard.rawAddress.toCPointer<ByteVar>(), pguidinterfaces.rawAddress.toCPointer<ByteVar>(), pcguidinterfaces.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(hcontext, szcard.rawAddress.toCPointer<ByteVar>(), pguidinterfaces.rawAddress.toCPointer<ByteVar>(), pcguidinterfaces.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(hcontext, mszgroups.rawAddress.toCPointer<ByteVar>(), pcchgroups.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(hcontext, mszgroups.rawAddress.toCPointer<ByteVar>(), pcchgroups.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListReadersA(hcontext, mszgroups.rawAddress.toCPointer<ByteVar>(), mszreaders.rawAddress.toCPointer<ByteVar>(), pcchreaders.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListReadersW(hcontext, mszgroups.rawAddress.toCPointer<ByteVar>(), mszreaders.rawAddress.toCPointer<ByteVar>(), pcchreaders.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(hcontext, szdeviceinstanceid.rawAddress.toCPointer<ByteVar>(), mszreaders.rawAddress.toCPointer<ByteVar>(), pcchreaders.rawAddress.toCPointer<ByteVar>())

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(hcontext, szdeviceinstanceid.rawAddress.toCPointer<ByteVar>(), mszreaders.rawAddress.toCPointer<ByteVar>(), pcchreaders.rawAddress.toCPointer<ByteVar>())

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr, creaders: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(hcontext, mszcards.rawAddress.toCPointer<ByteVar>(), rgreaderstates.rawAddress.toCPointer<ByteVar>(), creaders)

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(hcontext, rgatrmasks.rawAddress.toCPointer<ByteVar>(), catrs, rgreaderstates.rawAddress.toCPointer<ByteVar>(), creaders)

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(hcontext, rgatrmasks.rawAddress.toCPointer<ByteVar>(), catrs, rgreaderstates.rawAddress.toCPointer<ByteVar>(), creaders)

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr, creaders: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(hcontext, mszcards.rawAddress.toCPointer<ByteVar>(), rgreaderstates.rawAddress.toCPointer<ByteVar>(), creaders)

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr, datalen: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardReadCacheA(hcontext, cardidentifier.rawAddress.toCPointer<ByteVar>(), freshnesscounter, lookupname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), datalen.rawAddress.toCPointer<ByteVar>())

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr, datalen: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardReadCacheW(hcontext, cardidentifier.rawAddress.toCPointer<ByteVar>(), freshnesscounter, lookupname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), datalen.rawAddress.toCPointer<ByteVar>())

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardReconnect(hcard, dwsharemode, dwpreferredprotocols, dwinitialization, pdwactiveprotocol.rawAddress.toCPointer<ByteVar>())

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    windowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext)

public actual fun sCardReleaseStartedEvent() {
    windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(hcontext, szreadername.rawAddress.toCPointer<ByteVar>(), szgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr, cbattrlen: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardSetAttrib(hcard, dwattrid, pbattr.rawAddress.toCPointer<ByteVar>(), cbattrlen)

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(hcontext, szcardname.rawAddress.toCPointer<ByteVar>(), dwproviderid, szprovider.rawAddress.toCPointer<ByteVar>())

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(hcontext, szcardname.rawAddress.toCPointer<ByteVar>(), dwproviderid, szprovider.rawAddress.toCPointer<ByteVar>())

public actual fun sCardState(hcard: ULong, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardState(hcard, pdwstate.rawAddress.toCPointer<ByteVar>(), pdwprotocol.rawAddress.toCPointer<ByteVar>(), pbatr.rawAddress.toCPointer<ByteVar>(), pcbatrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardStatusA(hcard, mszreadernames.rawAddress.toCPointer<ByteVar>(), pcchreaderlen.rawAddress.toCPointer<ByteVar>(), pdwstate.rawAddress.toCPointer<ByteVar>(), pdwprotocol.rawAddress.toCPointer<ByteVar>(), pbatr.rawAddress.toCPointer<ByteVar>(), pcbatrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardStatusW(hcard, mszreadernames.rawAddress.toCPointer<ByteVar>(), pcchreaderlen.rawAddress.toCPointer<ByteVar>(), pdwstate.rawAddress.toCPointer<ByteVar>(), pdwprotocol.rawAddress.toCPointer<ByteVar>(), pbatr.rawAddress.toCPointer<ByteVar>(), pcbatrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr, pbsendbuffer: ConstPtr, cbsendlength: UInt, piorecvpci: MutPtr, pbrecvbuffer: MutPtr, pcbrecvlength: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardTransmit(hcard, piosendpci.rawAddress.toCPointer<ByteVar>(), pbsendbuffer.rawAddress.toCPointer<ByteVar>(), cbsendlength, piorecvpci.rawAddress.toCPointer<ByteVar>(), pbrecvbuffer.rawAddress.toCPointer<ByteVar>(), pcbrecvlength.rawAddress.toCPointer<ByteVar>())

public actual fun sCardUIDlgSelectCardA(param0: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun sCardUIDlgSelectCardW(param0: MutPtr): Int =
    windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr, datalen: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(hcontext, cardidentifier.rawAddress.toCPointer<ByteVar>(), freshnesscounter, lookupname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), datalen)

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr, datalen: UInt): Int =
    windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(hcontext, cardidentifier.rawAddress.toCPointer<ByteVar>(), freshnesscounter, lookupname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), datalen)
