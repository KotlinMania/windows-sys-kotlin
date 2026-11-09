@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

private val _windowsWin32SecurityCryptographyUiNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CertSelectionGetSerializedBlob(pcsi.toString(), ppoutbuffer.toString(), puloutbuffersize.toString()) as Int) else 0

public actual fun CryptUIDlgCertMgr(pcryptuicertmgr: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgCertMgr(pcryptuicertmgr.toString()) as Int) else 0

public actual fun CryptUIDlgSelectCertificateFromStore(hcertstore: HCERTSTORE, hwnd: HWND, pwsztitle: PCWSTR, pwszdisplaystring: PCWSTR, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: Long): Long =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgSelectCertificateFromStore(hcertstore.toString(), hwnd.toString(), pwsztitle.toString(), pwszdisplaystring.toString(), dwdontusecolumn.toInt(), dwflags.toInt(), pvreserved.toString()) as String).toLong() else 0L

public actual fun CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateA(pcertviewinfo.toString(), pfpropertieschanged.toString()) as Int) else 0

public actual fun CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateW(pcertviewinfo.toString(), pfpropertieschanged.toString()) as Int) else 0

public actual fun CryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: Long, hwnd: HWND, pwsztitle: PCWSTR, dwflags: UInt, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewContext(dwcontexttype.toInt(), pvcontext.toString(), hwnd.toString(), pwsztitle.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun CryptUIWizDigitalSign(dwflags: UInt, hwndparent: HWND, pwszwizardtitle: PCWSTR, pdigitalsigninfo: Long, ppsigncontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIWizDigitalSign(dwflags.toInt(), hwndparent.toString(), pwszwizardtitle.toString(), pdigitalsigninfo.toString(), ppsigncontext.toString()) as Int) else 0

public actual fun CryptUIWizExport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pexportinfo: Long, pvoid: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIWizExport(dwflags.toInt(), hwndparent.toString(), pwszwizardtitle.toString(), pexportinfo.toString(), pvoid.toString()) as Int) else 0

public actual fun CryptUIWizFreeDigitalSignContext(psigncontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIWizFreeDigitalSignContext(psigncontext.toString()) as Int) else 0

public actual fun CryptUIWizImport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pimportsrc: Long, hdestcertstore: HCERTSTORE): BOOL =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_CryptUIWizImport(dwflags.toInt(), hwndparent.toString(), pwszwizardtitle.toString(), pimportsrc.toString(), hdestcertstore.toString()) as Int) else 0
