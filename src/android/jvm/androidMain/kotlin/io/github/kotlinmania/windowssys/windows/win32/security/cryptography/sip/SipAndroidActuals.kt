@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

private object WindowsWin32SecurityCryptographySipJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider(psnewprov: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps(psubjinfo: Long, pcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: Int, pbdigest: Long, pcbdigest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: Int, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad(pgsubject: Long, dwflags: Int, psipdispatch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: Int, pdwindex: Long, cbsigneddatamsg: Int, pbsigneddatamsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider(pgprov: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid(filename: Long, hfilein: Long, pgsubject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Long, hfilein: Long, pgsubject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): Int
}

public actual fun cryptSIPAddProvider(psnewprov: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider((psnewprov?.value ?: 0L))

public actual fun cryptSIPCreateIndirectData(psubjectinfo: COpaquePointer?, pcbindirectdata: COpaquePointer?, pindirectdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData((psubjectinfo?.value ?: 0L), (pcbindirectdata?.value ?: 0L), (pindirectdata?.value ?: 0L))

public actual fun cryptSIPGetCaps(psubjinfo: COpaquePointer?, pcaps: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps((psubjinfo?.value ?: 0L), (pcaps?.value ?: 0L))

public actual fun cryptSIPGetSealedDigest(psubjectinfo: COpaquePointer?, psig: COpaquePointer?, dwsig: UInt, pbdigest: COpaquePointer?, pcbdigest: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest((psubjectinfo?.value ?: 0L), (psig?.value ?: 0L), dwsig.toInt(), (pbdigest?.value ?: 0L), (pcbdigest?.value ?: 0L))

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: COpaquePointer?, pdwencodingtype: COpaquePointer?, dwindex: UInt, pcbsigneddatamsg: COpaquePointer?, pbsigneddatamsg: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg((psubjectinfo?.value ?: 0L), (pdwencodingtype?.value ?: 0L), dwindex.toInt(), (pcbsigneddatamsg?.value ?: 0L), (pbsigneddatamsg?.value ?: 0L))

public actual fun cryptSIPLoad(pgsubject: COpaquePointer?, dwflags: UInt, psipdispatch: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad((pgsubject?.value ?: 0L), dwflags.toInt(), (psipdispatch?.value ?: 0L))

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: COpaquePointer?, dwencodingtype: CertQueryEncodingType, pdwindex: COpaquePointer?, cbsigneddatamsg: UInt, pbsigneddatamsg: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg((psubjectinfo?.value ?: 0L), dwencodingtype.toInt(), (pdwindex?.value ?: 0L), cbsigneddatamsg.toInt(), (pbsigneddatamsg?.value ?: 0L))

public actual fun cryptSIPRemoveProvider(pgprov: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider((pgprov?.value ?: 0L))

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: COpaquePointer?, dwindex: UInt): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg((psubjectinfo?.value ?: 0L), dwindex.toInt())

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid((filename?.value ?: 0L), (hfilein?.value ?: 0L), (pgsubject?.value ?: 0L))

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile((filename?.value ?: 0L), (hfilein?.value ?: 0L), (pgsubject?.value ?: 0L))

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: COpaquePointer?, pindirectdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData((psubjectinfo?.value ?: 0L), (pindirectdata?.value ?: 0L))
