package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public fun interface PCryptSipcreateIndirectDataFn {
    public operator fun invoke(psubjectinfo: COpaquePointer?, pcbindirectdata: COpaquePointer?, pindirectdata: COpaquePointer?): Bool
}

public typealias PCryptSipcreateIndirectData = PCryptSipcreateIndirectDataFn?

public fun interface PCryptSipgetCapsFn {
    public operator fun invoke(psubjinfo: COpaquePointer?, pcaps: COpaquePointer?): Bool
}

public typealias PCryptSipgetCaps = PCryptSipgetCapsFn?

public fun interface PCryptSipgetSealedDigestFn {
    public operator fun invoke(psubjectinfo: COpaquePointer?, psig: COpaquePointer?, dwsig: UInt, pbdigest: COpaquePointer?, pcbdigest: COpaquePointer?): Bool
}

public typealias PCryptSipgetSealedDigest = PCryptSipgetSealedDigestFn?

public fun interface PCryptSipgetSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: COpaquePointer?, pdwencodingtype: COpaquePointer?, dwindex: UInt, pcbsigneddatamsg: COpaquePointer?, pbsigneddatamsg: COpaquePointer?): Bool
}

public typealias PCryptSipgetSignedDataMsg = PCryptSipgetSignedDataMsgFn?

public fun interface PCryptSipputSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: COpaquePointer?, dwencodingtype: UInt, pdwindex: COpaquePointer?, cbsigneddatamsg: UInt, pbsigneddatamsg: COpaquePointer?): Bool
}

public typealias PCryptSipputSignedDataMsg = PCryptSipputSignedDataMsgFn?

public fun interface PCryptSipremoveSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: COpaquePointer?, dwindex: UInt): Bool
}

public typealias PCryptSipremoveSignedDataMsg = PCryptSipremoveSignedDataMsgFn?

public fun interface PCryptSipverifyIndirectDataFn {
    public operator fun invoke(psubjectinfo: COpaquePointer?, pindirectdata: COpaquePointer?): Bool
}

public typealias PCryptSipverifyIndirectData = PCryptSipverifyIndirectDataFn?

public fun interface PfnIsFileSupportedFn {
    public operator fun invoke(hfile: Handle, pgsubject: COpaquePointer?): Bool
}

public typealias PfnIsFileSupported = PfnIsFileSupportedFn?

public fun interface PfnIsFileSupportedNameFn {
    public operator fun invoke(pwszfilename: Pcwstr, pgsubject: COpaquePointer?): Bool
}

public typealias PfnIsFileSupportedName = PfnIsFileSupportedNameFn?
