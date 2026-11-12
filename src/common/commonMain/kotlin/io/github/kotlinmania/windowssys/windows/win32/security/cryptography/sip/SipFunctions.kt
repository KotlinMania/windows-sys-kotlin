package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

public expect fun cryptSIPAddProvider(psnewprov: MutPtr<SipAddNewprovider>): Bool

public expect fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr<SipSubjectinfo>, pcbindirectdata: MutPtr<UInt>, pindirectdata: MutPtr<SipIndirectData>): Bool

public expect fun cryptSIPGetCaps(psubjinfo: ConstPtr<SipSubjectinfo>, pcaps: MutPtr<SipCapSetV3>): Bool

public expect fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr<SipSubjectinfo>, psig: ConstPtr<UByte>, dwsig: UInt, pbdigest: MutPtr<UByte>, pcbdigest: MutPtr<UInt>): Bool

public expect fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, pdwencodingtype: MutPtr<CertQueryEncodingType>, dwindex: UInt, pcbsigneddatamsg: MutPtr<UInt>, pbsigneddatamsg: MutPtr<UByte>): Bool

public expect fun cryptSIPLoad(pgsubject: ConstPtr<Guid>, dwflags: UInt, psipdispatch: MutPtr<SipDispatchInfo>): Bool

public expect fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr<UInt>, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr<UByte>): Bool

public expect fun cryptSIPRemoveProvider(pgprov: MutPtr<Guid>): Bool

public expect fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, dwindex: UInt): Bool

public expect fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr<Guid>): Bool

public expect fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr<Guid>): Bool

public expect fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr<SipSubjectinfo>, pindirectdata: MutPtr<SipIndirectData>): Bool
