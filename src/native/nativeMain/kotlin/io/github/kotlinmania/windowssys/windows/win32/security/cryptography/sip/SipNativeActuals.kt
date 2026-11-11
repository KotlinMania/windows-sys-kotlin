@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.cinterop.windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun cryptSIPAddProvider(psnewprov: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider(psnewprov?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPCreateIndirectData(psubjectinfo: COpaquePointer?, pcbindirectdata: COpaquePointer?, pindirectdata: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData(psubjectinfo?.value?.toCPointer<ByteVar>(), pcbindirectdata?.value?.toCPointer<ByteVar>(), pindirectdata?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPGetCaps(psubjinfo: COpaquePointer?, pcaps: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps(psubjinfo?.value?.toCPointer<ByteVar>(), pcaps?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPGetSealedDigest(psubjectinfo: COpaquePointer?, psig: COpaquePointer?, dwsig: UInt, pbdigest: COpaquePointer?, pcbdigest: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest(psubjectinfo?.value?.toCPointer<ByteVar>(), psig?.value?.toCPointer<ByteVar>(), dwsig, pbdigest?.value?.toCPointer<ByteVar>(), pcbdigest?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: COpaquePointer?, pdwencodingtype: COpaquePointer?, dwindex: UInt, pcbsigneddatamsg: COpaquePointer?, pbsigneddatamsg: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg(psubjectinfo?.value?.toCPointer<ByteVar>(), pdwencodingtype?.value?.toCPointer<ByteVar>(), dwindex, pcbsigneddatamsg?.value?.toCPointer<ByteVar>(), pbsigneddatamsg?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPLoad(pgsubject: COpaquePointer?, dwflags: UInt, psipdispatch: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad(pgsubject?.value?.toCPointer<ByteVar>(), dwflags, psipdispatch?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: COpaquePointer?, dwencodingtype: CertQueryEncodingType, pdwindex: COpaquePointer?, cbsigneddatamsg: UInt, pbsigneddatamsg: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg(psubjectinfo?.value?.toCPointer<ByteVar>(), dwencodingtype, pdwindex?.value?.toCPointer<ByteVar>(), cbsigneddatamsg, pbsigneddatamsg?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPRemoveProvider(pgprov: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider(pgprov?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: COpaquePointer?, dwindex: UInt): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg(psubjectinfo?.value?.toCPointer<ByteVar>(), dwindex)

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid(filename?.value?.toCPointer<ByteVar>(), hfilein?.value?.toCPointer<ByteVar>(), pgsubject?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile(filename?.value?.toCPointer<ByteVar>(), hfilein?.value?.toCPointer<ByteVar>(), pgsubject?.value?.toCPointer<ByteVar>())

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: COpaquePointer?, pindirectdata: COpaquePointer?): Bool =
    windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData(psubjectinfo?.value?.toCPointer<ByteVar>(), pindirectdata?.value?.toCPointer<ByteVar>())
