@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CERT_QUERY_ENCODING_TYPE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CryptSIPAddProvider(psnewprov: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPAddProvider(psnewprov.toCPointer<ByteVar>())

public actual fun CryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPCreateIndirectData(psubjectinfo.toCPointer<ByteVar>(), pcbindirectdata.toCPointer<ByteVar>(), pindirectdata.toCPointer<ByteVar>())

public actual fun CryptSIPGetCaps(psubjinfo: Long, pcaps: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetCaps(psubjinfo.toCPointer<ByteVar>(), pcaps.toCPointer<ByteVar>())

public actual fun CryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: UInt, pbdigest: Long, pcbdigest: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSealedDigest(psubjectinfo.toCPointer<ByteVar>(), psig.toCPointer<ByteVar>(), dwsig, pbdigest.toCPointer<ByteVar>(), pcbdigest.toCPointer<ByteVar>())

public actual fun CryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: UInt, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSignedDataMsg(psubjectinfo.toCPointer<ByteVar>(), pdwencodingtype.toCPointer<ByteVar>(), dwindex, pcbsigneddatamsg.toCPointer<ByteVar>(), pbsigneddatamsg.toCPointer<ByteVar>())

public actual fun CryptSIPLoad(pgsubject: Long, dwflags: UInt, psipdispatch: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPLoad(pgsubject.toCPointer<ByteVar>(), dwflags, psipdispatch.toCPointer<ByteVar>())

public actual fun CryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: CERT_QUERY_ENCODING_TYPE, pdwindex: Long, cbsigneddatamsg: UInt, pbsigneddatamsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPPutSignedDataMsg(psubjectinfo.toCPointer<ByteVar>(), dwencodingtype, pdwindex.toCPointer<ByteVar>(), cbsigneddatamsg, pbsigneddatamsg.toCPointer<ByteVar>())

public actual fun CryptSIPRemoveProvider(pgprov: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveProvider(pgprov.toCPointer<ByteVar>())

public actual fun CryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveSignedDataMsg(psubjectinfo.toCPointer<ByteVar>(), dwindex)

public actual fun CryptSIPRetrieveSubjectGuid(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuid(filename.toCPointer<ByteVar>(), hfilein.toCPointer<ByteVar>(), pgsubject.toCPointer<ByteVar>())

public actual fun CryptSIPRetrieveSubjectGuidForCatalogFile(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuidForCatalogFile(filename.toCPointer<ByteVar>(), hfilein.toCPointer<ByteVar>(), pgsubject.toCPointer<ByteVar>())

public actual fun CryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_CryptSIPVerifyIndirectData(psubjectinfo.toCPointer<ByteVar>(), pindirectdata.toCPointer<ByteVar>())
