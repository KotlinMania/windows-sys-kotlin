package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CERT_QUERY_ENCODING_TYPE

public expect fun CryptSIPAddProvider(psnewprov: Long): BOOL

public expect fun CryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): BOOL

public expect fun CryptSIPGetCaps(psubjinfo: Long, pcaps: Long): BOOL

public expect fun CryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: UInt, pbdigest: Long, pcbdigest: Long): BOOL

public expect fun CryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: UInt, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): BOOL

public expect fun CryptSIPLoad(pgsubject: Long, dwflags: UInt, psipdispatch: Long): BOOL

public expect fun CryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: CERT_QUERY_ENCODING_TYPE, pdwindex: Long, cbsigneddatamsg: UInt, pbsigneddatamsg: Long): BOOL

public expect fun CryptSIPRemoveProvider(pgprov: Long): BOOL

public expect fun CryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: UInt): BOOL

public expect fun CryptSIPRetrieveSubjectGuid(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL

public expect fun CryptSIPRetrieveSubjectGuidForCatalogFile(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL

public expect fun CryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): BOOL
