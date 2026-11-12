package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public fun interface PCryptSipcreateIndirectDataFn {
    public operator fun invoke(psubjectinfo: MutPtr<SipSubjectinfo>, pcbindirectdata: MutPtr<UInt>, pindirectdata: MutPtr<SipIndirectData>): Bool
}

public typealias PCryptSipcreateIndirectData = PCryptSipcreateIndirectDataFn?

public fun interface PCryptSipgetCapsFn {
    public operator fun invoke(psubjinfo: ConstPtr<SipSubjectinfo>, pcaps: MutPtr<SipCapSetV3>): Bool
}

public typealias PCryptSipgetCaps = PCryptSipgetCapsFn?

public fun interface PCryptSipgetSealedDigestFn {
    public operator fun invoke(psubjectinfo: ConstPtr<SipSubjectinfo>, psig: ConstPtr<UByte>, dwsig: UInt, pbdigest: MutPtr<UByte>, pcbdigest: MutPtr<UInt>): Bool
}

public typealias PCryptSipgetSealedDigest = PCryptSipgetSealedDigestFn?

public fun interface PCryptSipgetSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: MutPtr<SipSubjectinfo>, pdwencodingtype: MutPtr<UInt>, dwindex: UInt, pcbsigneddatamsg: MutPtr<UInt>, pbsigneddatamsg: MutPtr<UByte>): Bool
}

public typealias PCryptSipgetSignedDataMsg = PCryptSipgetSignedDataMsgFn?

public fun interface PCryptSipputSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: MutPtr<SipSubjectinfo>, dwencodingtype: UInt, pdwindex: MutPtr<UInt>, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr<UByte>): Bool
}

public typealias PCryptSipputSignedDataMsg = PCryptSipputSignedDataMsgFn?

public fun interface PCryptSipremoveSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: MutPtr<SipSubjectinfo>, dwindex: UInt): Bool
}

public typealias PCryptSipremoveSignedDataMsg = PCryptSipremoveSignedDataMsgFn?

public fun interface PCryptSipverifyIndirectDataFn {
    public operator fun invoke(psubjectinfo: MutPtr<SipSubjectinfo>, pindirectdata: MutPtr<SipIndirectData>): Bool
}

public typealias PCryptSipverifyIndirectData = PCryptSipverifyIndirectDataFn?

public fun interface PfnIsFileSupportedFn {
    public operator fun invoke(hfile: Handle, pgsubject: MutPtr<Guid>): Bool
}

public typealias PfnIsFileSupported = PfnIsFileSupportedFn?

public fun interface PfnIsFileSupportedNameFn {
    public operator fun invoke(pwszfilename: Pcwstr, pgsubject: MutPtr<Guid>): Bool
}

public typealias PfnIsFileSupportedName = PfnIsFileSupportedNameFn?
