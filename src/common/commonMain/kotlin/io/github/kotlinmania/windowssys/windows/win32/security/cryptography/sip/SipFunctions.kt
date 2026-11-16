package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

public expect fun cryptSIPAddProvider(psnewprov: MutPtr): Bool

public expect fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr, pcbindirectdata: MutPtr, pindirectdata: MutPtr): Bool

public expect fun cryptSIPGetCaps(psubjinfo: ConstPtr, pcaps: MutPtr): Bool

public expect fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr, psig: ConstPtr, dwsig: UInt, pbdigest: MutPtr, pcbdigest: MutPtr): Bool

public expect fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr, pdwencodingtype: MutPtr, dwindex: UInt, pcbsigneddatamsg: MutPtr, pbsigneddatamsg: MutPtr): Bool

public expect fun cryptSIPLoad(pgsubject: ConstPtr, dwflags: UInt, psipdispatch: MutPtr): Bool

public expect fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr): Bool

public expect fun cryptSIPRemoveProvider(pgprov: MutPtr): Bool

public expect fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr, dwindex: UInt): Bool

public expect fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool

public expect fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool

public expect fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr, pindirectdata: MutPtr): Bool
