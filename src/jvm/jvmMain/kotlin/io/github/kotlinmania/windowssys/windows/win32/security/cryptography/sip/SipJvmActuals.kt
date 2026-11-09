@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CERT_QUERY_ENCODING_TYPE

private object WindowsWin32SecurityCryptographySipJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPAddProvider(psnewprov: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPGetCaps(psubjinfo: Long, pcaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: Int, pbdigest: Long, pcbdigest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: Int, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPLoad(pgsubject: Long, dwflags: Int, psipdispatch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: Int, pdwindex: Long, cbsigneddatamsg: Int, pbsigneddatamsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveProvider(pgprov: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuid(filename: Long, hfilein: Long, pgsubject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuidForCatalogFile(filename: Long, hfilein: Long, pgsubject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sip_CryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): Int
}

public actual fun CryptSIPAddProvider(psnewprov: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPAddProvider(psnewprov)

public actual fun CryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPCreateIndirectData(psubjectinfo, pcbindirectdata, pindirectdata)

public actual fun CryptSIPGetCaps(psubjinfo: Long, pcaps: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetCaps(psubjinfo, pcaps)

public actual fun CryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: UInt, pbdigest: Long, pcbdigest: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSealedDigest(psubjectinfo, psig, dwsig.toInt(), pbdigest, pcbdigest)

public actual fun CryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: UInt, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSignedDataMsg(psubjectinfo, pdwencodingtype, dwindex.toInt(), pcbsigneddatamsg, pbsigneddatamsg)

public actual fun CryptSIPLoad(pgsubject: Long, dwflags: UInt, psipdispatch: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPLoad(pgsubject, dwflags.toInt(), psipdispatch)

public actual fun CryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: CERT_QUERY_ENCODING_TYPE, pdwindex: Long, cbsigneddatamsg: UInt, pbsigneddatamsg: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPPutSignedDataMsg(psubjectinfo, dwencodingtype.toInt(), pdwindex, cbsigneddatamsg.toInt(), pbsigneddatamsg)

public actual fun CryptSIPRemoveProvider(pgprov: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveProvider(pgprov)

public actual fun CryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: UInt): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveSignedDataMsg(psubjectinfo, dwindex.toInt())

public actual fun CryptSIPRetrieveSubjectGuid(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuid(filename, hfilein, pgsubject)

public actual fun CryptSIPRetrieveSubjectGuidForCatalogFile(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuidForCatalogFile(filename, hfilein, pgsubject)

public actual fun CryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): BOOL =
    WindowsWin32SecurityCryptographySipJniBridge.windowssys_windows_win32_security_cryptography_sip_CryptSIPVerifyIndirectData(psubjectinfo, pindirectdata)
