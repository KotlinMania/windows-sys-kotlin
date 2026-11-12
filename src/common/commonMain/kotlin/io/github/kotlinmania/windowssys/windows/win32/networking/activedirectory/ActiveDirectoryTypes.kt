package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias AdsiDialectEnum = Int

public typealias Adstype = Int

public typealias AdsAceflagEnum = Int

public typealias AdsAcetypeEnum = Int

public typealias AdsAuthenticationEnum = UInt

public typealias AdsChaseReferralsEnum = Int

public typealias AdsDerefenum = Int

public typealias AdsDisplayEnum = Int

public typealias AdsEscapeModeEnum = Int

public typealias AdsFlagtypeEnum = Int

public typealias AdsFormatEnum = Int

public typealias AdsGroupTypeEnum = Int

public typealias AdsNameInittypeEnum = Int

public typealias AdsNameTypeEnum = Int

public typealias AdsOptionEnum = Int

public typealias AdsPasswordEncodingEnum = Int

public typealias AdsPathtypeEnum = Int

public typealias AdsPreferencesEnum = Int

public typealias AdsPropertyOperationEnum = Int

public typealias AdsRightsEnum = Int

public typealias AdsScopeenum = Int

public typealias AdsSdControlEnum = Int

public typealias AdsSdFormatEnum = Int

public typealias AdsSdRevisionEnum = Int

public typealias AdsSearchprefEnum = Int

public typealias AdsSearchHandle = Long

public typealias AdsSecurityInfoEnum = Int

public typealias AdsSettypeEnum = Int

public typealias AdsStatusenum = Int

public typealias AdsSystemflagEnum = Int

public typealias AdsUserFlagEnum = Int

public typealias DsroleMachineRole = Int

public typealias DsroleOperationState = Int

public typealias DsrolePrimaryDomainInfoLevel = Int

public typealias DsroleServerState = Int

public typealias DsKccTaskid = Int

public typealias DsMangleFor = Int

public typealias DsNameError = Int

public typealias DsNameFlags = Int

public typealias DsNameFormat = Int

public typealias DsReplInfoType = Int

public typealias DsReplOpType = Int

public typealias DsRepsyncallError = Int

public typealias DsRepsyncallEvent = Int

public typealias DsSpnNameType = Int

public typealias DsSpnWriteOp = Int

public fun interface LpcqaddformsprocFn {
    public operator fun invoke(lparam: Lparam, pform: MutPtr<Cqform>): Hresult
}

public typealias Lpcqaddformsproc = LpcqaddformsprocFn?

public fun interface LpcqaddpagesprocFn {
    public operator fun invoke(lparam: Lparam, clsidform: ConstPtr<Guid>, ppage: MutPtr<Cqpage>): Hresult
}

public typealias Lpcqaddpagesproc = LpcqaddpagesprocFn?

public fun interface LpcqpageprocFn {
    public operator fun invoke(ppage: MutPtr<Cqpage>, hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Hresult
}

public typealias Lpcqpageproc = LpcqpageprocFn?

public fun interface LpdsenumattributesFn {
    public operator fun invoke(lparam: Lparam, pszattributename: Pcwstr, pszdisplayname: Pcwstr, dwflags: UInt): Hresult
}

public typealias Lpdsenumattributes = LpdsenumattributesFn?
