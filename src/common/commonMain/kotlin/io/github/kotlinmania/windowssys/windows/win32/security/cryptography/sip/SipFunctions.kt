package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CERT_QUERY_ENCODING_TYPE

public fun CryptSIPAddProvider(psnewprov: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSIPAddProvider", longArrayOf(psnewprov)).toInt()
}

public fun CryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPCreateIndirectData", longArrayOf(psubjectinfo, pcbindirectdata, pindirectdata)).toInt()
}

public fun CryptSIPGetCaps(psubjinfo: Long, pcaps: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPGetCaps", longArrayOf(psubjinfo, pcaps)).toInt()
}

public fun CryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: UInt, pbdigest: Long, pcbdigest: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPGetSealedDigest", longArrayOf(psubjectinfo, psig, dwsig.toLong(), pbdigest, pcbdigest)).toInt()
}

public fun CryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: UInt, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPGetSignedDataMsg", longArrayOf(psubjectinfo, pdwencodingtype, dwindex.toLong(), pcbsigneddatamsg, pbsigneddatamsg)).toInt()
}

public fun CryptSIPLoad(pgsubject: Long, dwflags: UInt, psipdispatch: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSIPLoad", longArrayOf(pgsubject, dwflags.toLong(), psipdispatch)).toInt()
}

public fun CryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: CERT_QUERY_ENCODING_TYPE, pdwindex: Long, cbsigneddatamsg: UInt, pbsigneddatamsg: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPPutSignedDataMsg", longArrayOf(psubjectinfo, dwencodingtype.toLong(), pdwindex, cbsigneddatamsg.toLong(), pbsigneddatamsg)).toInt()
}

public fun CryptSIPRemoveProvider(pgprov: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSIPRemoveProvider", longArrayOf(pgprov)).toInt()
}

public fun CryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPRemoveSignedDataMsg", longArrayOf(psubjectinfo, dwindex.toLong())).toInt()
}

public fun CryptSIPRetrieveSubjectGuid(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSIPRetrieveSubjectGuid", longArrayOf(filename, hfilein, pgsubject)).toInt()
}

public fun CryptSIPRetrieveSubjectGuidForCatalogFile(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSIPRetrieveSubjectGuidForCatalogFile", longArrayOf(filename, hfilein, pgsubject)).toInt()
}

public fun CryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "CryptSIPVerifyIndirectData", longArrayOf(psubjectinfo, pindirectdata)).toInt()
}
