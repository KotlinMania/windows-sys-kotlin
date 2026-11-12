@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun cryptSIPAddProvider(psnewprov: MutPtr<SipAddNewprovider>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(psnewprov.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr<SipSubjectinfo>, pcbindirectdata: MutPtr<UInt>, pindirectdata: MutPtr<SipIndirectData>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(psubjectinfo.rawAddress.toCPointer<ByteVar>(), pcbindirectdata.rawAddress.toCPointer<ByteVar>(), pindirectdata.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPGetCaps(psubjinfo: ConstPtr<SipSubjectinfo>, pcaps: MutPtr<SipCapSetV3>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(psubjinfo.rawAddress.toCPointer<ByteVar>(), pcaps.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr<SipSubjectinfo>, psig: ConstPtr<UByte>, dwsig: UInt, pbdigest: MutPtr<UByte>, pcbdigest: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(psubjectinfo.rawAddress.toCPointer<ByteVar>(), psig.rawAddress.toCPointer<ByteVar>(), dwsig, pbdigest.rawAddress.toCPointer<ByteVar>(), pcbdigest.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, pdwencodingtype: MutPtr<CertQueryEncodingType>, dwindex: UInt, pcbsigneddatamsg: MutPtr<UInt>, pbsigneddatamsg: MutPtr<UByte>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(psubjectinfo.rawAddress.toCPointer<ByteVar>(), pdwencodingtype.rawAddress.toCPointer<ByteVar>(), dwindex, pcbsigneddatamsg.rawAddress.toCPointer<ByteVar>(), pbsigneddatamsg.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPLoad(pgsubject: ConstPtr<Guid>, dwflags: UInt, psipdispatch: MutPtr<SipDispatchInfo>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(pgsubject.rawAddress.toCPointer<ByteVar>(), dwflags, psipdispatch.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr<UInt>, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr<UByte>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(psubjectinfo.rawAddress.toCPointer<ByteVar>(), dwencodingtype, pdwindex.rawAddress.toCPointer<ByteVar>(), cbsigneddatamsg, pbsigneddatamsg.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPRemoveProvider(pgprov: MutPtr<Guid>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(pgprov.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, dwindex: UInt): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(psubjectinfo.rawAddress.toCPointer<ByteVar>(), dwindex)

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr<Guid>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(filename.rawAddress.toCPointer<ByteVar>(), hfilein.rawAddress.toCPointer<ByteVar>(), pgsubject.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr<Guid>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(filename.rawAddress.toCPointer<ByteVar>(), hfilein.rawAddress.toCPointer<ByteVar>(), pgsubject.rawAddress.toCPointer<ByteVar>())

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr<SipSubjectinfo>, pindirectdata: MutPtr<SipIndirectData>): Bool =
    windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(psubjectinfo.rawAddress.toCPointer<ByteVar>(), pindirectdata.rawAddress.toCPointer<ByteVar>())
