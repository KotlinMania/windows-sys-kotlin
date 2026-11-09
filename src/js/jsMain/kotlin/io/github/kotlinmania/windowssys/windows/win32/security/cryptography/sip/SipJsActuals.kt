@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CERT_QUERY_ENCODING_TYPE

private val _windowsWin32SecurityCryptographySipNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CryptSIPAddProvider(psnewprov: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPAddProvider(psnewprov.toString()) as Int) else 0

public actual fun CryptSIPCreateIndirectData(psubjectinfo: Long, pcbindirectdata: Long, pindirectdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPCreateIndirectData(psubjectinfo.toString(), pcbindirectdata.toString(), pindirectdata.toString()) as Int) else 0

public actual fun CryptSIPGetCaps(psubjinfo: Long, pcaps: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetCaps(psubjinfo.toString(), pcaps.toString()) as Int) else 0

public actual fun CryptSIPGetSealedDigest(psubjectinfo: Long, psig: Long, dwsig: UInt, pbdigest: Long, pcbdigest: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSealedDigest(psubjectinfo.toString(), psig.toString(), dwsig.toInt(), pbdigest.toString(), pcbdigest.toString()) as Int) else 0

public actual fun CryptSIPGetSignedDataMsg(psubjectinfo: Long, pdwencodingtype: Long, dwindex: UInt, pcbsigneddatamsg: Long, pbsigneddatamsg: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSignedDataMsg(psubjectinfo.toString(), pdwencodingtype.toString(), dwindex.toInt(), pcbsigneddatamsg.toString(), pbsigneddatamsg.toString()) as Int) else 0

public actual fun CryptSIPLoad(pgsubject: Long, dwflags: UInt, psipdispatch: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPLoad(pgsubject.toString(), dwflags.toInt(), psipdispatch.toString()) as Int) else 0

public actual fun CryptSIPPutSignedDataMsg(psubjectinfo: Long, dwencodingtype: CERT_QUERY_ENCODING_TYPE, pdwindex: Long, cbsigneddatamsg: UInt, pbsigneddatamsg: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPPutSignedDataMsg(psubjectinfo.toString(), dwencodingtype.toInt(), pdwindex.toString(), cbsigneddatamsg.toInt(), pbsigneddatamsg.toString()) as Int) else 0

public actual fun CryptSIPRemoveProvider(pgprov: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveProvider(pgprov.toString()) as Int) else 0

public actual fun CryptSIPRemoveSignedDataMsg(psubjectinfo: Long, dwindex: UInt): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveSignedDataMsg(psubjectinfo.toString(), dwindex.toInt()) as Int) else 0

public actual fun CryptSIPRetrieveSubjectGuid(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuid(filename.toString(), hfilein.toString(), pgsubject.toString()) as Int) else 0

public actual fun CryptSIPRetrieveSubjectGuidForCatalogFile(filename: PCWSTR, hfilein: HANDLE, pgsubject: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuidForCatalogFile(filename.toString(), hfilein.toString(), pgsubject.toString()) as Int) else 0

public actual fun CryptSIPVerifyIndirectData(psubjectinfo: Long, pindirectdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographySipNapiAddon != null) (_windowsWin32SecurityCryptographySipNapiAddon.windowssys_windows_win32_security_cryptography_sip_CryptSIPVerifyIndirectData(psubjectinfo.toString(), pindirectdata.toString()) as Int) else 0
