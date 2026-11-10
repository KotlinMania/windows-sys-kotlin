package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

public expect fun cryptSIPAddProvider(psnewprov: COpaquePointer?): Bool

public expect fun cryptSIPCreateIndirectData(psubjectinfo: COpaquePointer?, pcbindirectdata: COpaquePointer?, pindirectdata: COpaquePointer?): Bool

public expect fun cryptSIPGetCaps(psubjinfo: COpaquePointer?, pcaps: COpaquePointer?): Bool

public expect fun cryptSIPGetSealedDigest(psubjectinfo: COpaquePointer?, psig: COpaquePointer?, dwsig: UInt, pbdigest: COpaquePointer?, pcbdigest: COpaquePointer?): Bool

public expect fun cryptSIPGetSignedDataMsg(psubjectinfo: COpaquePointer?, pdwencodingtype: COpaquePointer?, dwindex: UInt, pcbsigneddatamsg: COpaquePointer?, pbsigneddatamsg: COpaquePointer?): Bool

public expect fun cryptSIPLoad(pgsubject: COpaquePointer?, dwflags: UInt, psipdispatch: COpaquePointer?): Bool

public expect fun cryptSIPPutSignedDataMsg(psubjectinfo: COpaquePointer?, dwencodingtype: CertQueryEncodingType, pdwindex: COpaquePointer?, cbsigneddatamsg: UInt, pbsigneddatamsg: COpaquePointer?): Bool

public expect fun cryptSIPRemoveProvider(pgprov: COpaquePointer?): Bool

public expect fun cryptSIPRemoveSignedDataMsg(psubjectinfo: COpaquePointer?, dwindex: UInt): Bool

public expect fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool

public expect fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool

public expect fun cryptSIPVerifyIndirectData(psubjectinfo: COpaquePointer?, pindirectdata: COpaquePointer?): Bool
