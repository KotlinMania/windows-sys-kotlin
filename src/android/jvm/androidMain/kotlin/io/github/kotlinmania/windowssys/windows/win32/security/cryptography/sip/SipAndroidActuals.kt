@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

private object WindowsWin32SecurityCryptographySipJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(psnewprov: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(psubjinfo: Long, pcaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: Int, pbdigest: Long, pcbdigest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: Int, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(pgsubject: Long, dwflags: Int, psipdispatch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: Int, pdwindex: Long, cbsigneddatamsg: Int, pbsigneddatamsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(pgprov: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(filename: Long, hfilein: Long, pgsubject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(filename: Long, hfilein: Long, pgsubject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): Int
}

public actual fun cryptSIPAddProvider(psnewprov: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(psnewprov.rawAddress)

public actual fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr, pcbindirectdata: MutPtr, pindirectdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(psubjectinfo.rawAddress, pcbindirectdata.rawAddress, pindirectdata.rawAddress)

public actual fun cryptSIPGetCaps(psubjinfo: ConstPtr, pcaps: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(psubjinfo.rawAddress, pcaps.rawAddress)

public actual fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr, psig: ConstPtr, dwsig: UInt, pbdigest: MutPtr, pcbdigest: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(psubjectinfo.rawAddress, psig.rawAddress, dwsig.toInt(), pbdigest.rawAddress, pcbdigest.rawAddress)

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr, pdwencodingtype: MutPtr, dwindex: UInt, pcbsigneddatamsg: MutPtr, pbsigneddatamsg: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(psubjectinfo.rawAddress, pdwencodingtype.rawAddress, dwindex.toInt(), pcbsigneddatamsg.rawAddress, pbsigneddatamsg.rawAddress)

public actual fun cryptSIPLoad(pgsubject: ConstPtr, dwflags: UInt, psipdispatch: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(pgsubject.rawAddress, dwflags.toInt(), psipdispatch.rawAddress)

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(psubjectinfo.rawAddress, dwencodingtype.toInt(), pdwindex.rawAddress, cbsigneddatamsg.toInt(), pbsigneddatamsg.rawAddress)

public actual fun cryptSIPRemoveProvider(pgprov: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(pgprov.rawAddress)

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr, dwindex: UInt): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(psubjectinfo.rawAddress, dwindex.toInt())

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(filename.rawAddress, hfilein.rawAddress, pgsubject.rawAddress)

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(filename.rawAddress, hfilein.rawAddress, pgsubject.rawAddress)

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr, pindirectdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographySipJniBridge.windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(psubjectinfo.rawAddress, pindirectdata.rawAddress)
