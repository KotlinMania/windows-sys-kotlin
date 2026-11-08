package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface pCryptSIPCreateIndirectDataFn {
    public operator fun invoke(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): BOOL
}

public typealias pCryptSIPCreateIndirectData = pCryptSIPCreateIndirectDataFn?

public fun interface pCryptSIPGetCapsFn {
    public operator fun invoke(psubjinfo: Long, pcaps: Long): BOOL
}

public typealias pCryptSIPGetCaps = pCryptSIPGetCapsFn?

public fun interface pCryptSIPGetSealedDigestFn {
    public operator fun invoke(psubjectinfo: Long, psig: Long, dwsig: UInt, pbdigest: Long, pcbdigest: Long): BOOL
}

public typealias pCryptSIPGetSealedDigest = pCryptSIPGetSealedDigestFn?

public fun interface pCryptSIPGetSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: Long, pdwencodingtype: Long, dwindex: UInt, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): BOOL
}

public typealias pCryptSIPGetSignedDataMsg = pCryptSIPGetSignedDataMsgFn?

public fun interface pCryptSIPPutSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: Long, dwencodingtype: UInt, pdwindex: Long, cbsigneddatamsg: UInt, pbsigneddatamsg: Long): BOOL
}

public typealias pCryptSIPPutSignedDataMsg = pCryptSIPPutSignedDataMsgFn?

public fun interface pCryptSIPRemoveSignedDataMsgFn {
    public operator fun invoke(psubjectinfo: Long, dwindex: UInt): BOOL
}

public typealias pCryptSIPRemoveSignedDataMsg = pCryptSIPRemoveSignedDataMsgFn?

public fun interface pCryptSIPVerifyIndirectDataFn {
    public operator fun invoke(psubjectinfo: Long, pindirectdata: Long): BOOL
}

public typealias pCryptSIPVerifyIndirectData = pCryptSIPVerifyIndirectDataFn?

public fun interface pfnIsFileSupportedFn {
    public operator fun invoke(hfile: HANDLE, pgsubject: Long): BOOL
}

public typealias pfnIsFileSupported = pfnIsFileSupportedFn?

public fun interface pfnIsFileSupportedNameFn {
    public operator fun invoke(pwszfilename: PCWSTR, pgsubject: Long): BOOL
}

public typealias pfnIsFileSupportedName = pfnIsFileSupportedNameFn?
