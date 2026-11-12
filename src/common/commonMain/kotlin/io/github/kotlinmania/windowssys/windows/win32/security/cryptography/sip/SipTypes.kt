package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public fun interface PCryptSipcreateIndirectDataFn {
    public operator fun invoke(psubjectinfo: MutPtr, pcbindirectdata: MutPtr, pindirectdata: MutPtr): Bool
}

public typealias PCryptSipcreateIndirectData = PCryptSipcreateIndirectDataFn?

public fun interface PCryptSipgetCapsFn {
    public operator fun invoke(psubjinfo: ConstPtr, pcaps: MutPtr): Bool
}

public typealias PCryptSipgetCaps = PCryptSipgetCapsFn?

public fun interface PCryptSipgetSealedDigestFn {
    public operator fun invoke(psubjectinfo: ConstPtr, psig: ConstPtr, dwsig: UInt, pbdigest: MutPtr, pcbdigest: MutPtr): Bool
}

public typealias PCryptSipgetSealedDigest = PCryptSipgetSealedDigestFn?

public fun interface PCryptSipgetSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: MutPtr, pdwencodingtype: MutPtr, dwindex: UInt, pcbsigneddatamsg: MutPtr, pbsigneddatamsg: MutPtr): Bool
}

public typealias PCryptSipgetSignedDataMsg = PCryptSipgetSignedDataMsgFn?

public fun interface PCryptSipputSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: MutPtr, dwencodingtype: UInt, pdwindex: MutPtr, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr): Bool
}

public typealias PCryptSipputSignedDataMsg = PCryptSipputSignedDataMsgFn?

public fun interface PCryptSipremoveSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: MutPtr, dwindex: UInt): Bool
}

public typealias PCryptSipremoveSignedDataMsg = PCryptSipremoveSignedDataMsgFn?

public fun interface PCryptSipverifyIndirectDataFn {
    public operator fun invoke(psubjectinfo: MutPtr, pindirectdata: MutPtr): Bool
}

public typealias PCryptSipverifyIndirectData = PCryptSipverifyIndirectDataFn?

public fun interface PfnIsFileSupportedFn {
    public operator fun invoke(hfile: Handle, pgsubject: MutPtr): Bool
}

public typealias PfnIsFileSupported = PfnIsFileSupportedFn?

public fun interface PfnIsFileSupportedNameFn {
    public operator fun invoke(pwszfilename: Pcwstr, pgsubject: MutPtr): Bool
}

public typealias PfnIsFileSupportedName = PfnIsFileSupportedNameFn?
