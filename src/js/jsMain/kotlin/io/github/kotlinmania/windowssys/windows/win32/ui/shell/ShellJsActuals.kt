@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Dropeffect
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DeviceScaleFactor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ShowWindowCmd

private val _windowsWin32UiShellNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun assocCreate(clsid: Guid, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocCreateForClasses(rgclasses: COpaquePointer?, cclasses: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocCreateForClasses((rgclasses?.value ?: 0L).toString(), cclasses.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocGetDetailsOfPropKey(psf: COpaquePointer?, pidl: COpaquePointer?, pkey: COpaquePointer?, pv: COpaquePointer?, pffoundpropkey: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocGetDetailsOfPropKey((psf?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), (pffoundpropkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: COpaquePointer?, pflag: COpaquePointer?, ppsztype: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocGetPerceivedType((pszext?.value ?: 0L).toString(), (ptype?.value ?: 0L).toString(), (pflag?.value ?: 0L).toString(), (ppsztype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocIsDangerous((pszassoc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocQueryKeyA(flags.toInt(), key, (pszassoc?.value ?: 0L).toString(), (pszextra?.value ?: 0L).toString(), (phkeyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocQueryKeyW(flags.toInt(), key, (pszassoc?.value ?: 0L).toString(), (pszextra?.value ?: 0L).toString(), (phkeyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocQueryStringA(flags.toInt(), str, (pszassoc?.value ?: 0L).toString(), (pszextra?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocQueryStringByKeyA(flags.toInt(), str, (hkassoc?.value ?: 0L).toString(), (pszextra?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocQueryStringByKeyW(flags.toInt(), str, (hkassoc?.value ?: 0L).toString(), (pszextra?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_assocQueryStringW(flags.toInt(), str, (pszassoc?.value ?: 0L).toString(), (pszextra?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cdefFolderMenuCreate2(pidlfolder: COpaquePointer?, hwnd: Hwnd, cidl: UInt, apidl: COpaquePointer?, psf: COpaquePointer?, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: COpaquePointer?, ppcm: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_cdefFolderMenuCreate2((pidlfolder?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), cidl.toInt(), (apidl?.value ?: 0L).toString(), (psf?.value ?: 0L).toString(), 0L.toString(), nkeys.toInt(), (ahkeys?.value ?: 0L).toString(), (ppcm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cidldataCreateFromIdarray(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, ppdtobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_cidldataCreateFromIdarray((pidlfolder?.value ?: 0L).toString(), cidl.toInt(), (apidl?.value ?: 0L).toString(), (ppdtobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_chrCmpIA(w1.toInt(), w2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_chrCmpIW(w1.toInt(), w2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_colorAdjustLuma(clrrgb.toInt(), n, fscale) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_colorHLSToRGB(whue.toInt(), wluminance.toInt(), wsaturation.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: COpaquePointer?, pwluminance: COpaquePointer?, pwsaturation: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_colorRGBToHLS(clrrgb.toInt(), (pwhue?.value ?: 0L).toString(), (pwluminance?.value ?: 0L).toString(), (pwsaturation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_commandLineToArgvW((lpcmdline?.value ?: 0L).toString(), (pnumargs?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectToConnectionPoint(punk: COpaquePointer?, riidevent: COpaquePointer?, fconnect: Bool, punktarget: COpaquePointer?, pdwcookie: COpaquePointer?, ppcpout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_connectToConnectionPoint((punk?.value ?: 0L).toString(), (riidevent?.value ?: 0L).toString(), fconnect, (punktarget?.value ?: 0L).toString(), (pdwcookie?.value ?: 0L).toString(), (ppcpout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_createProfile((pszusersid?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszprofilepath?.value ?: 0L).toString(), cchprofilepath.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadAutoScroll(hwnd: Hwnd, pad: COpaquePointer?, pptnow: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dadAutoScroll((hwnd?.value ?: 0L).toString(), (pad?.value ?: 0L).toString(), (pptnow?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragLeave(): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dadDragLeave() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragMove(pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadSetDragImage(him: Himagelist, pptoffset: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dadSetDragImage(him.toString(), (pptoffset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadShowDragImage(fshow: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dadShowDragImage(fshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_defSubclassProc((hwnd?.value ?: 0L).toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_deleteProfileA((lpsidstring?.value ?: 0L).toString(), (lpprofilepath?.value ?: 0L).toString(), (lpcomputername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_deleteProfileW((lpsidstring?.value ?: 0L).toString(), (lpprofilepath?.value ?: 0L).toString(), (lpcomputername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_doEnvironmentSubstA((pszsrc?.value ?: 0L).toString(), cchsrc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_doEnvironmentSubstW((pszsrc?.value ?: 0L).toString(), cchsrc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dragAcceptFiles((hwnd?.value ?: 0L).toString(), faccept)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dragFinish(hdrop: Hdrop) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dragFinish((hdrop?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dragQueryFileA((hdrop?.value ?: 0L).toString(), ifile.toInt(), (lpszfile?.value ?: 0L).toString(), cch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dragQueryFileW((hdrop?.value ?: 0L).toString(), ifile.toInt(), (lpszfile?.value ?: 0L).toString(), cch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_dragQueryPoint((hdrop?.value ?: 0L).toString(), (ppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driveType(idrive: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_driveType(idrive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_duplicateIcon((hinst?.value ?: 0L).toString(), (hicon?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: COpaquePointer?): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractAssociatedIconA((hinst?.value ?: 0L).toString(), (psziconpath?.value ?: 0L).toString(), (piicon?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractAssociatedIconExA((hinst?.value ?: 0L).toString(), (psziconpath?.value ?: 0L).toString(), (piiconindex?.value ?: 0L).toString(), (piiconid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractAssociatedIconExW((hinst?.value ?: 0L).toString(), (psziconpath?.value ?: 0L).toString(), (piiconindex?.value ?: 0L).toString(), (piiconid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: COpaquePointer?): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractAssociatedIconW((hinst?.value ?: 0L).toString(), (psziconpath?.value ?: 0L).toString(), (piicon?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractIconA((hinst?.value ?: 0L).toString(), (pszexefilename?.value ?: 0L).toString(), niconindex.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractIconExA((lpszfile?.value ?: 0L).toString(), niconindex, (phiconlarge?.value ?: 0L).toString(), (phiconsmall?.value ?: 0L).toString(), nicons.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractIconExW((lpszfile?.value ?: 0L).toString(), niconindex, (phiconlarge?.value ?: 0L).toString(), (phiconsmall?.value ?: 0L).toString(), nicons.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_extractIconW((hinst?.value ?: 0L).toString(), (pszexefilename?.value ?: 0L).toString(), niconindex.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_findExecutableA((lpfile?.value ?: 0L).toString(), (lpdirectory?.value ?: 0L).toString(), (lpresult?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_findExecutableW((lpfile?.value ?: 0L).toString(), (lpdirectory?.value ?: 0L).toString(), (lpresult?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getAcceptLanguagesA((pszlanguages?.value ?: 0L).toString(), (pcchlanguages?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getAcceptLanguagesW((pszlanguages?.value ?: 0L).toString(), (pcchlanguages?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryA((lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryW((lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessExplicitAppUserModelID(appid: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getCurrentProcessExplicitAppUserModelID((appid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryA((lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryW((lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getDpiForShellUIComponent(param0) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getFileNameFromBrowse((hwnd?.value ?: 0L).toString(), (pszfilepath?.value ?: 0L).toString(), cchfilepath.toInt(), (pszworkingdir?.value ?: 0L).toString(), (pszdefext?.value ?: 0L).toString(), (pszfilters?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getMenuContextHelpId((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getMenuPosFromID((hmenu?.value ?: 0L).toString(), id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileType(dwflags: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getProfileType((dwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getProfilesDirectoryA((lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getProfilesDirectoryW((lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getScaleFactorForDevice(devicetype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getScaleFactorForMonitor((hmon?.value ?: 0L).toString(), (pscale?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getUserProfileDirectoryA((htoken?.value ?: 0L).toString(), (lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getUserProfileDirectoryW((htoken?.value ?: 0L).toString(), (lpprofiledir?.value ?: 0L).toString(), (lpcchsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getWindowContextHelpId((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_getWindowSubclass((hwnd?.value ?: 0L).toString(), 0L.toString(), uidsubclass.toString(), (pdwrefdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmonitorUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmonitorUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashData(pbdata: COpaquePointer?, cbdata: UInt, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hashData((pbdata?.value ?: 0L).toString(), cbdata.toInt(), (pbhash?.value ?: 0L).toString(), cbhash.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkClone(pihl: COpaquePointer?, riid: COpaquePointer?, pihlsiteforclone: COpaquePointer?, dwsitedata: UInt, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkClone((pihl?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (pihlsiteforclone?.value ?: 0L).toString(), dwsitedata.toInt(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateBrowseContext(piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateBrowseContext((piunkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateExtensionServices((pwzadditionalheaders?.value ?: 0L).toString(), (phwnd?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszpassword?.value ?: 0L).toString(), (piunkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromData(pidataobj: COpaquePointer?, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateFromData((pidataobj?.value ?: 0L).toString(), (pihlsite?.value ?: 0L).toString(), dwsitedata.toInt(), (piunkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromMoniker(pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateFromMoniker((pimktrgt?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pwzfriendlyname?.value ?: 0L).toString(), (pihlsite?.value ?: 0L).toString(), dwsitedata.toInt(), (piunkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateFromString((pwztarget?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pwzfriendlyname?.value ?: 0L).toString(), (pihlsite?.value ?: 0L).toString(), dwsitedata.toInt(), (piunkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: COpaquePointer?, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateShortcut(grfhlshortcutf.toInt(), (pihl?.value ?: 0L).toString(), (pwzdir?.value ?: 0L).toString(), (pwzfilename?.value ?: 0L).toString(), (ppwzshortcutfile?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), (pimktarget?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pwzdir?.value ?: 0L).toString(), (pwzfilename?.value ?: 0L).toString(), (ppwzshortcutfile?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromString(grfhlshortcutf.toInt(), (pwztarget?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pwzdir?.value ?: 0L).toString(), (pwzfilename?.value ?: 0L).toString(), (ppwzshortcutfile?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkGetSpecialReference(ureference.toInt(), (ppwzreference?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkGetValueFromParams((pwzparams?.value ?: 0L).toString(), (pwzname?.value ?: 0L).toString(), (ppwzvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkIsShortcut((pwzfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigate(pihl: COpaquePointer?, pihlframe: COpaquePointer?, grfhlnf: UInt, pbc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkNavigate((pihl?.value ?: 0L).toString(), (pihlframe?.value ?: 0L).toString(), grfhlnf.toInt(), (pbc?.value ?: 0L).toString(), (pibsc?.value ?: 0L).toString(), (pihlbc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, pihlframe: COpaquePointer?, grfhlnf: UInt, pibc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkNavigateToStringReference((pwztarget?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pihlsite?.value ?: 0L).toString(), dwsitedata.toInt(), (pihlframe?.value ?: 0L).toString(), grfhlnf.toInt(), (pibc?.value ?: 0L).toString(), (pibsc?.value ?: 0L).toString(), (pihlbc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkOnNavigate(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, grfhlnf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkOnNavigate((pihlframe?.value ?: 0L).toString(), (pihlbc?.value ?: 0L).toString(), grfhlnf.toInt(), (pimktarget?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pwzfriendlyname?.value ?: 0L).toString(), (puhlid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: COpaquePointer?, pimkold: COpaquePointer?, pimknew: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkOnRenameDocument(dwreserved.toInt(), (pihlbc?.value ?: 0L).toString(), (pimkold?.value ?: 0L).toString(), (pimknew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkParseDisplayName(pibc: COpaquePointer?, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: COpaquePointer?, ppimk: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkParseDisplayName((pibc?.value ?: 0L).toString(), (pwzdisplayname?.value ?: 0L).toString(), fnoforceabs, (pccheaten?.value ?: 0L).toString(), (ppimk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkPreprocessMoniker(pibc: COpaquePointer?, pimkin: COpaquePointer?, ppimkout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkPreprocessMoniker((pibc?.value ?: 0L).toString(), (pimkin?.value ?: 0L).toString(), (ppimkout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkQueryCreateFromData(pidataobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkQueryCreateFromData((pidataobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveMonikerForData(pimkreference: COpaquePointer?, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkResolveMonikerForData((pimkreference?.value ?: 0L).toString(), reserved.toInt(), (pibc?.value ?: 0L).toString(), cfmtetc.toInt(), (rgfmtetc?.value ?: 0L).toString(), (pibsc?.value ?: 0L).toString(), (pimkbase?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkResolveShortcut((pwzshortcutfilename?.value ?: 0L).toString(), (pihlsite?.value ?: 0L).toString(), dwsitedata.toInt(), (piunkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkResolveShortcutToMoniker((pwzshortcutfilename?.value ?: 0L).toString(), (ppimktarget?.value ?: 0L).toString(), (ppwzlocation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkResolveShortcutToString((pwzshortcutfilename?.value ?: 0L).toString(), (ppwztarget?.value ?: 0L).toString(), (ppwzlocation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkResolveStringForData((pwzreference?.value ?: 0L).toString(), reserved.toInt(), (pibc?.value ?: 0L).toString(), cfmtetc.toInt(), (rgfmtetc?.value ?: 0L).toString(), (pibsc?.value ?: 0L).toString(), (pimkbase?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkSetSpecialReference(ureference.toInt(), (pwzreference?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkTranslateURL((pwzurl?.value ?: 0L).toString(), grfflags.toInt(), (ppwztranslatedurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkUpdateStackItem(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, uhlid: UInt, pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_hlinkUpdateStackItem((pihlframe?.value ?: 0L).toString(), (pihlbc?.value ?: 0L).toString(), uhlid.toInt(), (pimktrgt?.value ?: 0L).toString(), (pwzlocation?.value ?: 0L).toString(), (pwzfriendlyname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLAppendID(pidl: COpaquePointer?, pmkid: COpaquePointer?, fappend: Bool): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLAppendID((pidl?.value ?: 0L).toString(), (pmkid?.value ?: 0L).toString(), fappend) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLClone(pidl: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLClone((pidl?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCloneFirst(pidl: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLCloneFirst((pidl?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCombine(pidl1: COpaquePointer?, pidl2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLCombine((pidl1?.value ?: 0L).toString(), (pidl2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCreateFromPathA(pszpath: Pcstr): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLCreateFromPathA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCreateFromPathW(pszpath: Pcwstr): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLCreateFromPathW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFindChild(pidlparent: COpaquePointer?, pidlchild: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLFindChild((pidlparent?.value ?: 0L).toString(), (pidlchild?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFindLastID(pidl: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLFindLastID((pidl?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFree(pidl: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLFree((pidl?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iLGetNext(pidl: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLGetNext((pidl?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLGetSize(pidl: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLGetSize((pidl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLIsEqual(pidl1: COpaquePointer?, pidl2: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLIsEqual((pidl1?.value ?: 0L).toString(), (pidl2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLIsParent(pidl1: COpaquePointer?, pidl2: COpaquePointer?, fimmediate: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLIsParent((pidl1?.value ?: 0L).toString(), (pidl2?.value ?: 0L).toString(), fimmediate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLLoadFromStreamEx(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLLoadFromStreamEx((pstm?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLRemoveLastID(pidl: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLRemoveLastID((pidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLSaveToStream(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iLSaveToStream((pstm?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamCopy(pstmfrom: COpaquePointer?, pstmto: COpaquePointer?, cb: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamCopy((pstmfrom?.value ?: 0L).toString(), (pstmto?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamRead(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamRead((pstm?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReadPidl(pstm: COpaquePointer?, ppidlout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamReadPidl((pstm?.value ?: 0L).toString(), (ppidlout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReadStr(pstm: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamReadStr((pstm?.value ?: 0L).toString(), (ppsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReset(pstm: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamReset((pstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamSize(pstm: COpaquePointer?, pui: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamSize((pstm?.value ?: 0L).toString(), (pui?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWrite(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamWrite((pstm?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWritePidl(pstm: COpaquePointer?, pidlwrite: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamWritePidl((pstm?.value ?: 0L).toString(), (pidlwrite?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWriteStr(pstm: COpaquePointer?, psz: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_istreamWriteStr((pstm?.value ?: 0L).toString(), (psz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownAtomicRelease(ppunk: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iunknownAtomicRelease((ppunk?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iunknownGetSite(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iunknownGetSite((punk?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownGetWindow(punk: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iunknownGetWindow((punk?.value ?: 0L).toString(), (phwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownQueryService(punk: COpaquePointer?, guidservice: COpaquePointer?, riid: COpaquePointer?, ppvout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iunknownQueryService((punk?.value ?: 0L).toString(), (guidservice?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownSet(ppunk: COpaquePointer?, punk: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iunknownSet((ppunk?.value ?: 0L).toString(), (punk?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iunknownSetSite(punk: COpaquePointer?, punksite: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_iunknownSetSite((punk?.value ?: 0L).toString(), (punksite?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: COpaquePointer?, pfparsepersiterules: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_importPrivacySettings((pszfilename?.value ?: 0L).toString(), (pfparseprivacypreferences?.value ?: 0L).toString(), (pfparsepersiterules?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initNetworkAddressControl(): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_initNetworkAddressControl() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_initPropVariantFromStrRet((pstrret?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_initVariantFromStrRet((pstrret?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_intlStrEqWorkerA(fcasesens, (lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_intlStrEqWorkerW(fcasesens, (lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharSpaceA(wch: Byte): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isCharSpaceA(wch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharSpaceW(wch: UShort): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isCharSpaceW(wch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isInternetESCEnabled(): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isInternetESCEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isLFNDriveA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isLFNDriveW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNetDrive(idrive: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isNetDrive(idrive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isOS(dwos: OS): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isOS(dwos.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserAnAdmin(): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_isUserAnAdmin() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_loadUserProfileA((htoken?.value ?: 0L).toString(), (lpprofileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_loadUserProfileW((htoken?.value ?: 0L).toString(), (lpprofileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSaveToStreamEx(piunk: COpaquePointer?, pistm: COpaquePointer?, fcleardirty: Bool): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_oleSaveToStreamEx((piunk?.value ?: 0L).toString(), (pistm?.value ?: 0L).toString(), fcleardirty) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_openRegStream((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), grfmode.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseURLA(pcszurl: Pcstr, ppu: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_parseURLA((pcszurl?.value ?: 0L).toString(), (ppu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseURLW(pcszurl: Pcwstr, ppu: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_parseURLW((pcszurl?.value ?: 0L).toString(), (ppu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAddBackslashA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAddBackslashW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAddExtensionA((pszpath?.value ?: 0L).toString(), (pszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAddExtensionW((pszpath?.value ?: 0L).toString(), (pszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAllocCanonicalize((pszpathin?.value ?: 0L).toString(), dwflags.toInt(), (ppszpathout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAllocCombine((pszpathin?.value ?: 0L).toString(), (pszmore?.value ?: 0L).toString(), dwflags.toInt(), (ppszpathout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAppendA((pszpath?.value ?: 0L).toString(), (pszmore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathAppendW((pszpath?.value ?: 0L).toString(), (pszmore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathBuildRootA((pszroot?.value ?: 0L).toString(), idrive) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathBuildRootW((pszroot?.value ?: 0L).toString(), idrive) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCanonicalizeA((pszbuf?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCanonicalizeW((pszbuf?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchAddBackslash((pszpath?.value ?: 0L).toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchAddBackslashEx((pszpath?.value ?: 0L).toString(), cchpath.toString(), (ppszend?.value ?: 0L).toString(), (pcchremaining?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchAddExtension((pszpath?.value ?: 0L).toString(), cchpath.toString(), (pszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchAppend((pszpath?.value ?: 0L).toString(), cchpath.toString(), (pszmore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchAppendEx((pszpath?.value ?: 0L).toString(), cchpath.toString(), (pszmore?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchCanonicalize((pszpathout?.value ?: 0L).toString(), cchpathout.toString(), (pszpathin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchCanonicalizeEx((pszpathout?.value ?: 0L).toString(), cchpathout.toString(), (pszpathin?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchCombine((pszpathout?.value ?: 0L).toString(), cchpathout.toString(), (pszpathin?.value ?: 0L).toString(), (pszmore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchCombineEx((pszpathout?.value ?: 0L).toString(), cchpathout.toString(), (pszpathin?.value ?: 0L).toString(), (pszmore?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchFindExtension((pszpath?.value ?: 0L).toString(), cchpath.toString(), (ppszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchIsRoot((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchRemoveBackslash((pszpath?.value ?: 0L).toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchRemoveBackslashEx((pszpath?.value ?: 0L).toString(), cchpath.toString(), (ppszend?.value ?: 0L).toString(), (pcchremaining?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchRemoveExtension((pszpath?.value ?: 0L).toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchRemoveFileSpec((pszpath?.value ?: 0L).toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchRenameExtension((pszpath?.value ?: 0L).toString(), cchpath.toString(), (pszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchSkipRoot((pszpath?.value ?: 0L).toString(), (ppszrootend?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchStripPrefix((pszpath?.value ?: 0L).toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCchStripToRoot((pszpath?.value ?: 0L).toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCleanupSpec((pszdir?.value ?: 0L).toString(), (pszspec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCombineA((pszdest?.value ?: 0L).toString(), (pszdir?.value ?: 0L).toString(), (pszfile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCombineW((pszdest?.value ?: 0L).toString(), (pszdir?.value ?: 0L).toString(), (pszfile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCommonPrefixA((pszfile1?.value ?: 0L).toString(), (pszfile2?.value ?: 0L).toString(), (achpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCommonPrefixW((pszfile1?.value ?: 0L).toString(), (pszfile2?.value ?: 0L).toString(), (achpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCompactPathA((hdc?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dx.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCompactPathExA((pszout?.value ?: 0L).toString(), (pszsrc?.value ?: 0L).toString(), cchmax.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCompactPathExW((pszout?.value ?: 0L).toString(), (pszsrc?.value ?: 0L).toString(), cchmax.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCompactPathW((hdc?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dx.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCreateFromUrlA((pszurl?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), (pcchpath?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCreateFromUrlAlloc((pszin?.value ?: 0L).toString(), (ppszout?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathCreateFromUrlW((pszurl?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), (pcchpath?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFileExistsA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFileExistsW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindExtensionA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindExtensionW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindFileNameA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindFileNameW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindNextComponentA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindNextComponentW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindOnPathA((pszpath?.value ?: 0L).toString(), (ppszotherdirs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindOnPathW((pszpath?.value ?: 0L).toString(), (ppszotherdirs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindSuffixArrayA((pszpath?.value ?: 0L).toString(), (apszsuffix?.value ?: 0L).toString(), iarraysize) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathFindSuffixArrayW((pszpath?.value ?: 0L).toString(), (apszsuffix?.value ?: 0L).toString(), iarraysize) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetArgsA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetArgsW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetCharTypeA(ch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetCharTypeW(ch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetDriveNumberA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetDriveNumberW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetShortPath(pszlongpath: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathGetShortPath((pszlongpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsContentTypeA((pszpath?.value ?: 0L).toString(), (pszcontenttype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsContentTypeW((pszpath?.value ?: 0L).toString(), (pszcontenttype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsDirectoryA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsDirectoryW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsExe((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsFileSpecA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsFileSpecW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsLFNFileSpecA((pszname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsLFNFileSpecW((pszname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsNetworkPathA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsNetworkPathW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsPrefixA((pszprefix?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsPrefixW((pszprefix?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsRelativeA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsRelativeW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsRootA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsRootW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsSameRootA((pszpath1?.value ?: 0L).toString(), (pszpath2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsSameRootW((pszpath1?.value ?: 0L).toString(), (pszpath2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsSlowA((pszfile?.value ?: 0L).toString(), dwattr.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsSlowW((pszfile?.value ?: 0L).toString(), dwattr.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsSystemFolderA((pszpath?.value ?: 0L).toString(), dwattrb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsSystemFolderW((pszpath?.value ?: 0L).toString(), dwattrb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCEx((pszpath?.value ?: 0L).toString(), (ppszserver?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCServerA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCServerShareA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCServerShareW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCServerW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsUNCW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsURLA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathIsURLW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMakePrettyA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMakePrettyW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMakeSystemFolderA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMakeSystemFolderW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMakeUniqueName((pszuniquename?.value ?: 0L).toString(), cchmax.toInt(), (psztemplate?.value ?: 0L).toString(), (pszlongplate?.value ?: 0L).toString(), (pszdir?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMatchSpecA((pszfile?.value ?: 0L).toString(), (pszspec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMatchSpecExA((pszfile?.value ?: 0L).toString(), (pszspec?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMatchSpecExW((pszfile?.value ?: 0L).toString(), (pszspec?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathMatchSpecW((pszfile?.value ?: 0L).toString(), (pszspec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathParseIconLocationA((psziconfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathParseIconLocationW((psziconfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathQualify(psz: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathQualify((psz?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathQuoteSpacesA((lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathQuoteSpacesW((lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRelativePathToA((pszpath?.value ?: 0L).toString(), (pszfrom?.value ?: 0L).toString(), dwattrfrom.toInt(), (pszto?.value ?: 0L).toString(), dwattrto.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRelativePathToW((pszpath?.value ?: 0L).toString(), (pszfrom?.value ?: 0L).toString(), dwattrfrom.toInt(), (pszto?.value ?: 0L).toString(), dwattrto.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveArgsA(pszpath: Pstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveArgsA((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveArgsW(pszpath: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveArgsW((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveBackslashA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveBackslashW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveBlanksA(pszpath: Pstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveBlanksA((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveBlanksW(pszpath: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveBlanksW((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveExtensionA(pszpath: Pstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveExtensionA((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveExtensionW(pszpath: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveExtensionW((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveFileSpecA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRemoveFileSpecW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRenameExtensionA((pszpath?.value ?: 0L).toString(), (pszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathRenameExtensionW((pszpath?.value ?: 0L).toString(), (pszext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathResolve(pszpath: Pwstr, dirs: COpaquePointer?, fflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathResolve((pszpath?.value ?: 0L).toString(), (dirs?.value ?: 0L).toString(), fflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathSearchAndQualifyA((pszpath?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathSearchAndQualifyW((pszpath?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathSetDlgItemPathA((hdlg?.value ?: 0L).toString(), id, (pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathSetDlgItemPathW((hdlg?.value ?: 0L).toString(), id, (pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathSkipRootA((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathSkipRootW((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathStripPathA(pszpath: Pstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathStripPathA((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathStripPathW(pszpath: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathStripPathW((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathStripToRootA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathStripToRootW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsA((pszpath?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsW((pszpath?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUndecorateA(pszpath: Pstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUndecorateA((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathUndecorateW(pszpath: Pwstr) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUndecorateW((pszpath?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderA((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderW((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUnquoteSpacesA((lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathUnquoteSpacesW((lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pathYetAnotherMakeUniqueName((pszuniquename?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), (pszshort?.value ?: 0L).toString(), (pszfilespec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_pickIconDlg((hwnd?.value ?: 0L).toString(), (psziconpath?.value ?: 0L).toString(), cchiconpath.toInt(), (piiconindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStrRet(propvar: COpaquePointer?, pstrret: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_propVariantToStrRet((propvar?.value ?: 0L).toString(), (pstrret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qISearch(that: COpaquePointer?, pqit: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_qISearch((that?.value ?: 0L).toString(), (pqit?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readCabinetState(pcs: COpaquePointer?, clength: Int): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_readCabinetState((pcs?.value ?: 0L).toString(), clength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_realDriveType(idrive, foktohitnet) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_registerAppConstrainedChangeNotification(0L.toString(), (context?.value ?: 0L).toString(), (registration?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_registerAppStateChangeNotification(0L.toString(), (context?.value ?: 0L).toString(), (registration?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_registerScaleChangeEvent((hevent?.value ?: 0L).toString(), (pdwcookie?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_registerScaleChangeNotifications(displaydevice, (hwndnotify?.value ?: 0L).toString(), umsgnotify.toInt(), (pdwcookie?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_removeWindowSubclass((hwnd?.value ?: 0L).toString(), 0L.toString(), uidsubclass.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_restartDialog((hwnd?.value ?: 0L).toString(), (pszprompt?.value ?: 0L).toString(), dwreturn.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_restartDialogEx((hwnd?.value ?: 0L).toString(), (pszprompt?.value ?: 0L).toString(), dwreturn.toInt(), dwreasoncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_revokeScaleChangeNotifications(displaydevice, dwcookie.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddToRecentDocs(uflags: UInt, pv: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAddToRecentDocs(uflags.toInt(), (pv?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHAlloc(cb: ULong): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAlloc(cb.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAllocShared(pvdata: COpaquePointer?, dwsize: UInt, dwprocessid: UInt): Handle =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAllocShared((pvdata?.value ?: 0L).toString(), dwsize.toInt(), dwprocessid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAnsiToAnsi((pszsrc?.value ?: 0L).toString(), (pszdst?.value ?: 0L).toString(), cchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAnsiToUnicode((pszsrc?.value ?: 0L).toString(), (pwszdst?.value ?: 0L).toString(), cwchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: COpaquePointer?): ULong =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAppBarMessage(dwmessage.toInt(), (pdata?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAssocEnumHandlers((pszextra?.value ?: 0L).toString(), affilter, (ppenumhandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: COpaquePointer?, enumhandlers: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAssocEnumHandlersForProtocolByApplication((protocol?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (enumhandlers?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHAutoComplete((hwndedit?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToFolderIDListParent(psfroot: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHBindToFolderIDListParent((psfroot?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString(), (ppidllast?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToFolderIDListParentEx(psfroot: COpaquePointer?, pidl: COpaquePointer?, ppbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHBindToFolderIDListParentEx((psfroot?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (ppbc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString(), (ppidllast?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToObject(psf: COpaquePointer?, pidl: COpaquePointer?, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHBindToObject((psf?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToParent(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHBindToParent((pidl?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString(), (ppidllast?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBrowseForFolderA(lpbi: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHBrowseForFolderA((lpbi?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBrowseForFolderW(lpbi: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHBrowseForFolderW((lpbi?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCLSIDFromString((psz?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: COpaquePointer?, plevent: COpaquePointer?): Handle =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shchangeNotificationLock((hchange?.value ?: 0L).toString(), dwprocid.toInt(), (pppidl?.value ?: 0L).toString(), (plevent?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shchangeNotificationUnlock((hlock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: COpaquePointer?, dwitem2: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHChangeNotify(weventid, uflags.toInt(), (dwitem1?.value ?: 0L).toString(), (dwitem2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHChangeNotifyDeregister(ulid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHChangeNotifyRegister((hwnd?.value ?: 0L).toString(), fsources, fevents, wmsg.toInt(), centries, (pshcne?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHChangeNotifyRegisterThread(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCloneSpecialIDList((hwnd?.value ?: 0L).toString(), csidl, fcreate) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCoCreateInstance((pszclsid?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCopyKeyA((hkeysrc?.value ?: 0L).toString(), (pszsrcsubkey?.value ?: 0L).toString(), (hkeydest?.value ?: 0L).toString(), freserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCopyKeyW((hkeysrc?.value ?: 0L).toString(), (pszsrcsubkey?.value ?: 0L).toString(), (hkeydest?.value ?: 0L).toString(), freserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateAssociationRegistration(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateAssociationRegistration((riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDataObject(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, pdtinner: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDataObject((pidlfolder?.value ?: 0L).toString(), cidl.toInt(), (apidl?.value ?: 0L).toString(), (pdtinner?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultContextMenu(pdcm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDefaultContextMenu((pdcm?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultExtractIcon(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDefaultExtractIcon((riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultPropertiesOp(psi: COpaquePointer?, ppfileop: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDefaultPropertiesOp((psi?.value ?: 0L).toString(), (ppfileop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDirectory((hwnd?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDirectoryExA((hwnd?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), (psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateDirectoryExW((hwnd?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), (psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateFileExtractIconW((pszfile?.value ?: 0L).toString(), dwfileattributes.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromIDList(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateItemFromIDList((pidl?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateItemFromParsingName((pszpath?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromRelativeName(psiparent: COpaquePointer?, pszname: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateItemFromRelativeName((psiparent?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemInKnownFolder(kfid: COpaquePointer?, dwkfflags: UInt, pszitem: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateItemInKnownFolder((kfid?.value ?: 0L).toString(), dwkfflags.toInt(), (pszitem?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemWithParent(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppvitem: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateItemWithParent((pidlparent?.value ?: 0L).toString(), (psfparent?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateMemStream(pinit: COpaquePointer?, cbinit: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateMemStream((pinit?.value ?: 0L).toString(), cbinit.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateProcessAsUserW(pscpi: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateProcessAsUserW((pscpi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreatePropSheetExtArray((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), maxIface.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateQueryCancelAutoPlayMoniker((ppmoniker?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellFolderView(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellFolderView((pcsfv?.value ?: 0L).toString(), (ppsv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellFolderViewEx(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellFolderViewEx((pcsfv?.value ?: 0L).toString(), (ppsv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItem(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, ppsi: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellItem((pidlparent?.value ?: 0L).toString(), (psfparent?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (ppsi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArray(pidlparent: COpaquePointer?, psf: COpaquePointer?, cidl: UInt, ppidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellItemArray((pidlparent?.value ?: 0L).toString(), (psf?.value ?: 0L).toString(), cidl.toInt(), (ppidl?.value ?: 0L).toString(), (ppsiitemarray?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromDataObject(pdo: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromDataObject((pdo?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromIDLists(cidl.toInt(), (rgpidl?.value ?: 0L).toString(), (ppsiitemarray?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromShellItem(psi: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromShellItem((psi?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateShellPalette((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: COpaquePointer?, ppenumformatetc: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateStdEnumFmtEtc(cfmt.toInt(), (afmt?.value ?: 0L).toString(), (ppenumformatetc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateStreamOnFileA((pszfile?.value ?: 0L).toString(), grfmode.toInt(), (ppstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: COpaquePointer?, ppstm: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateStreamOnFileEx((pszfile?.value ?: 0L).toString(), grfmode.toInt(), dwattributes.toInt(), fcreate, (pstmtemplate?.value ?: 0L).toString(), (ppstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateStreamOnFileW((pszfile?.value ?: 0L).toString(), grfmode.toInt(), (ppstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateThread(0L.toString(), (pdata?.value ?: 0L).toString(), flags.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThreadRef(pcref: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateThreadRef((pcref?.value ?: 0L).toString(), (ppunk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHCreateThreadWithHandle(0L.toString(), (pdata?.value ?: 0L).toString(), flags.toInt(), 0L.toString(), (phandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDefExtractIconA((psziconfile?.value ?: 0L).toString(), iindex, uflags.toInt(), (phiconlarge?.value ?: 0L).toString(), (phiconsmall?.value ?: 0L).toString(), niconsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDefExtractIconW((psziconfile?.value ?: 0L).toString(), iindex, uflags.toInt(), (phiconlarge?.value ?: 0L).toString(), (phiconsmall?.value ?: 0L).toString(), niconsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDeleteKeyA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDeleteKeyW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDeleteValueA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDeleteValueW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDestroyPropSheetExtArray((hpsxa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: COpaquePointer?, pdsrc: COpaquePointer?, dweffect: Dropeffect, pdweffect: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHDoDragDrop((hwnd?.value ?: 0L).toString(), (pdata?.value ?: 0L).toString(), (pdsrc?.value ?: 0L).toString(), dweffect.toInt(), (pdweffect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEmptyRecycleBinA((hwnd?.value ?: 0L).toString(), (pszrootpath?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEmptyRecycleBinW((hwnd?.value ?: 0L).toString(), (pszrootpath?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEnumKeyExA((hkey?.value ?: 0L).toString(), dwindex.toInt(), (pszname?.value ?: 0L).toString(), (pcchname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEnumKeyExW((hkey?.value ?: 0L).toString(), dwindex.toInt(), (pszname?.value ?: 0L).toString(), (pcchname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEnumValueA((hkey?.value ?: 0L).toString(), dwindex.toInt(), (pszvaluename?.value ?: 0L).toString(), (pcchvaluename?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEnumValueW((hkey?.value ?: 0L).toString(), dwindex.toInt(), (pszvaluename?.value ?: 0L).toString(), (pcchvaluename?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEnumerateUnreadMailAccountsW((hkeyuser?.value ?: 0L).toString(), dwindex.toInt(), (pszmailaddress?.value ?: 0L).toString(), cchmailaddress) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: COpaquePointer?, ppszcommandline: COpaquePointer?, ppszparameters: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHEvaluateSystemCommandTemplate((pszcmdtemplate?.value ?: 0L).toString(), (ppszapplication?.value ?: 0L).toString(), (ppszcommandline?.value ?: 0L).toString(), (ppszparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFileOperationA(lpfileop: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFileOperationA((lpfileop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFileOperationW(lpfileop: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFileOperationW((lpfileop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFindFiles(pidlfolder: COpaquePointer?, pidlsavefile: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFindFiles((pidlfolder?.value ?: 0L).toString(), (pidlsavefile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shfindInitMenuPopup((hmenu?.value ?: 0L).toString(), (hwndowner?.value ?: 0L).toString(), idcmdfirst.toInt(), idcmdlast.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFlushSFCache() {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFlushSFCache()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFormatDateTimeA(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFormatDateTimeA((pft?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFormatDateTimeW(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFormatDateTimeW((pft?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFormatDrive((hwnd?.value ?: 0L).toString(), drive.toInt(), fmtid.toInt(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFree(pv: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFree((pv?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFreeNameMappings(hnamemappings: Handle) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFreeNameMappings((hnamemappings?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHFreeShared((hdata?.value ?: 0L).toString(), dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetAttributesFromDataObject(pdo: COpaquePointer?, dwattributemask: UInt, pdwattributes: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetAttributesFromDataObject((pdo?.value ?: 0L).toString(), dwattributemask.toInt(), (pdwattributes?.value ?: 0L).toString(), (pcitems?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDataFromIDListA(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetDataFromIDListA((psf?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), nformat, (pv?.value ?: 0L).toString(), cb) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDataFromIDListW(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetDataFromIDListW((psf?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), nformat, (pv?.value ?: 0L).toString(), cb) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDesktopFolder(ppshf: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetDesktopFolder((ppshf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExA((pszdirectoryname?.value ?: 0L).toString(), (pulfreebytesavailabletocaller?.value ?: 0L).toString(), (pultotalnumberofbytes?.value ?: 0L).toString(), (pultotalnumberoffreebytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExW((pszdirectoryname?.value ?: 0L).toString(), (pulfreebytesavailabletocaller?.value ?: 0L).toString(), (pultotalnumberofbytes?.value ?: 0L).toString(), (pultotalnumberoffreebytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetDriveMedia((pszdrive?.value ?: 0L).toString(), (pdwmediacontent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFileInfoA((pszpath?.value ?: 0L).toString(), dwfileattributes.toInt(), (psfi?.value ?: 0L).toString(), cbfileinfo.toInt(), uflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFileInfoW((pszpath?.value ?: 0L).toString(), dwfileattributes.toInt(), (psfi?.value ?: 0L).toString(), cbfileinfo.toInt(), uflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFolderLocation((hwnd?.value ?: 0L).toString(), csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (ppidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFolderPathA((hwnd?.value ?: 0L).toString(), csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirA((hwnd?.value ?: 0L).toString(), csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (pszsubdir?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirW((hwnd?.value ?: 0L).toString(), csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (pszsubdir?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetFolderPathW((hwnd?.value ?: 0L).toString(), csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIDListFromObject(punk: COpaquePointer?, ppidl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetIDListFromObject((punk?.value ?: 0L).toString(), (ppidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexA((psziconpath?.value ?: 0L).toString(), iiconindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexW((psziconpath?.value ?: 0L).toString(), iiconindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetImageList(iimagelist: Int, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetImageList(iimagelist, (riid?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetInstanceExplorer(ppunk: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetInstanceExplorer((ppunk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetInverseCMAP(pbmap: COpaquePointer?, cbmap: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetInverseCMAP((pbmap?.value ?: 0L).toString(), cbmap.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetItemFromDataObject(pdtobj: COpaquePointer?, dwflags: DataobjGetItemFlags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetItemFromDataObject((pdtobj?.value ?: 0L).toString(), dwflags, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetItemFromObject(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetItemFromObject((punk?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderIDList(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppidl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetKnownFolderIDList((rfid?.value ?: 0L).toString(), dwflags.toInt(), (htoken?.value ?: 0L).toString(), (ppidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderItem(rfid: COpaquePointer?, flags: KnownFolderFlag, htoken: Handle, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetKnownFolderItem((rfid?.value ?: 0L).toString(), flags, (htoken?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppszpath: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetKnownFolderPath((rfid?.value ?: 0L).toString(), dwflags.toInt(), (htoken?.value ?: 0L).toString(), (ppszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetLocalizedName((pszpath?.value ?: 0L).toString(), (pszresmodule?.value ?: 0L).toString(), cch.toInt(), (pidsres?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetMalloc(ppmalloc: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetMalloc((ppmalloc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNameFromIDList(pidl: COpaquePointer?, sigdnname: Sigdn, ppszname: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetNameFromIDList((pidl?.value ?: 0L).toString(), sigdnname, (ppszname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetNewLinkInfoA((pszlinkto?.value ?: 0L).toString(), (pszdir?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), (pfmustcopy?.value ?: 0L).toString(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetNewLinkInfoW((pszlinkto?.value ?: 0L).toString(), (pszdir?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), (pfmustcopy?.value ?: 0L).toString(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListA(pidl: COpaquePointer?, pszpath: Pstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetPathFromIDListA((pidl?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListEx(pidl: COpaquePointer?, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetPathFromIDListEx((pidl?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), cchpath.toInt(), uopts.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListW(pidl: COpaquePointer?, pszpath: Pwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetPathFromIDListW((pidl?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetRealIDL(psf: COpaquePointer?, pidlsimple: COpaquePointer?, ppidlreal: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetRealIDL((psf?.value ?: 0L).toString(), (pidlsimple?.value ?: 0L).toString(), (ppidlreal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSetFolderCustomSettings(pfcs: COpaquePointer?, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetSetFolderCustomSettings((pfcs?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dwreadwrite.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSetSettings(lpss: COpaquePointer?, dwmask: SsfMask, bset: Bool) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetSetSettings((lpss?.value ?: 0L).toString(), dwmask.toInt(), bset)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHGetSettings(psfs: COpaquePointer?, dwmask: UInt) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetSettings((psfs?.value ?: 0L).toString(), dwmask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetSpecialFolderLocation((hwnd?.value ?: 0L).toString(), csidl, (ppidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathA((hwnd?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), csidl, fcreate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathW((hwnd?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), csidl, fcreate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetStockIconInfo(siid, uflags.toInt(), (psii?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetTemporaryPropertyForItem((psi?.value ?: 0L).toString(), (propkey?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetThreadRef(ppunk: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetThreadRef((ppunk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: COpaquePointer?, pfiletime: COpaquePointer?, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetUnreadMailCountW((hkeyuser?.value ?: 0L).toString(), (pszmailaddress?.value ?: 0L).toString(), (pdwcount?.value ?: 0L).toString(), (pfiletime?.value ?: 0L).toString(), (pszshellexecutecommand?.value ?: 0L).toString(), cchshellexecutecommand) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetValueA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetValueW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetViewStatePropertyBag(pidl: COpaquePointer?, pszbagname: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGetViewStatePropertyBag((pidl?.value ?: 0L).toString(), (pszbagname?.value ?: 0L).toString(), dwflags.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGlobalCounterDecrement(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGlobalCounterGetValue(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHGlobalCounterIncrement(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHHandleUpdateImage(pidlextra: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHHandleUpdateImage((pidlextra?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: COpaquePointer?, rgfinout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHILCreateFromPath((pszpath?.value ?: 0L).toString(), (ppidl?.value ?: 0L).toString(), (rgfinout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHInvokePrinterCommandA((hwnd?.value ?: 0L).toString(), uaction.toInt(), (lpbuf1?.value ?: 0L).toString(), (lpbuf2?.value ?: 0L).toString(), fmodal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHInvokePrinterCommandW((hwnd?.value ?: 0L).toString(), uaction.toInt(), (lpbuf1?.value ?: 0L).toString(), (lpbuf2?.value ?: 0L).toString(), fmodal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHIsFileAvailableOffline((pwszpath?.value ?: 0L).toString(), (pdwstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHIsLowMemoryMachine(dwtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHLimitInputEdit((hwndedit?.value ?: 0L).toString(), (psf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadInProc(rclsid: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHLoadInProc((rclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHLoadIndirectString((pszsource?.value ?: 0L).toString(), (pszoutbuf?.value ?: 0L).toString(), cchoutbuf.toInt(), (ppvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHLoadNonloadedIconOverlayIdentifiers() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHLockShared((hdata?.value ?: 0L).toString(), dwprocessid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMapPIDLToSystemImageListIndex(pshf: COpaquePointer?, pidl: COpaquePointer?, piindexsel: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHMapPIDLToSystemImageListIndex((pshf?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (piindexsel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHMessageBoxCheckA((hwnd?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), (pszcaption?.value ?: 0L).toString(), utype.toInt(), idefault, (pszregval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHMessageBoxCheckW((hwnd?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), (pszcaption?.value ?: 0L).toString(), utype.toInt(), idefault, (pszregval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMultiFileProperties(pdtobj: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHMultiFileProperties((pdtobj?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHObjectProperties((hwnd?.value ?: 0L).toString(), shopobjecttype.toInt(), (pszobjectname?.value ?: 0L).toString(), (pszpropertypage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenFolderAndSelectItems(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenFolderAndSelectItems((pidlfolder?.value ?: 0L).toString(), cidl.toInt(), (apidl?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: COpaquePointer?, ckeys: UInt, pclsiddefault: COpaquePointer?, pdtobj: COpaquePointer?, psb: COpaquePointer?, pstartpage: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenPropSheetW((pszcaption?.value ?: 0L).toString(), (ahkeys?.value ?: 0L).toString(), ckeys.toInt(), (pclsiddefault?.value ?: 0L).toString(), (pdtobj?.value ?: 0L).toString(), (psb?.value ?: 0L).toString(), (pstartpage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenRegStream2A((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), grfmode.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenRegStream2W((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), grfmode.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenRegStreamA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), grfmode.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenRegStreamW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), grfmode.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHOpenWithDialog((hwndparent?.value ?: 0L).toString(), (poainfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: COpaquePointer?, ppidl: COpaquePointer?, sfgaoin: UInt, psfgaoout: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHParseDisplayName((pszname?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (ppidl?.value ?: 0L).toString(), sfgaoin.toInt(), (psfgaoout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHPathPrepareForWriteA((hwnd?.value ?: 0L).toString(), (punkenablemodless?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHPathPrepareForWriteW((hwnd?.value ?: 0L).toString(), (punkenablemodless?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryInfoKeyA((hkey?.value ?: 0L).toString(), (pcsubkeys?.value ?: 0L).toString(), (pcchmaxsubkeylen?.value ?: 0L).toString(), (pcvalues?.value ?: 0L).toString(), (pcchmaxvaluenamelen?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryInfoKeyW((hkey?.value ?: 0L).toString(), (pcsubkeys?.value ?: 0L).toString(), (pcchmaxsubkeylen?.value ?: 0L).toString(), (pcvalues?.value ?: 0L).toString(), (pcchmaxvaluenamelen?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryRecycleBinA((pszrootpath?.value ?: 0L).toString(), (pshqueryrbinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryRecycleBinW((pszrootpath?.value ?: 0L).toString(), (pshqueryrbinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryUserNotificationState(pquns: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryUserNotificationState((pquns?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryValueExA((hkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pdwreserved?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHQueryValueExW((hkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pdwreserved?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegCloseUSKey(huskey.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegCreateUSKeyA((pszpath?.value ?: 0L).toString(), samdesired.toInt(), hrelativeuskey.toString(), (phnewuskey?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegCreateUSKeyW((pwzpath?.value ?: 0L).toString(), samdesired.toInt(), hrelativeuskey.toString(), (phnewuskey?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyA(huskey.toString(), (pszsubkey?.value ?: 0L).toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyW(huskey.toString(), (pwzsubkey?.value ?: 0L).toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegDeleteUSValueA(huskey.toString(), (pszvalue?.value ?: 0L).toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegDeleteUSValueW(huskey.toString(), (pwzvalue?.value ?: 0L).toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegDuplicateHKey((hkey?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegEnumUSKeyA(huskey.toString(), dwindex.toInt(), (pszname?.value ?: 0L).toString(), (pcchname?.value ?: 0L).toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegEnumUSKeyW(huskey.toString(), dwindex.toInt(), (pwzname?.value ?: 0L).toString(), (pcchname?.value ?: 0L).toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegEnumUSValueA(huskey.toString(), dwindex.toInt(), (pszvaluename?.value ?: 0L).toString(), (pcchvaluename?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegEnumUSValueW(huskey.toString(), dwindex.toInt(), (pszvaluename?.value ?: 0L).toString(), (pcchvaluename?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueA((pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), fignorehkcu, fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueW((pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), fignorehkcu, fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetIntW((hk?.value ?: 0L).toString(), (pwzkey?.value ?: 0L).toString(), idefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetPathA((hkey?.value ?: 0L).toString(), (pcszsubkey?.value ?: 0L).toString(), (pcszvalue?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetPathW((hkey?.value ?: 0L).toString(), (pcszsubkey?.value ?: 0L).toString(), (pcszvalue?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetUSValueA((pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), fignorehkcu, (pvdefaultdata?.value ?: 0L).toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetUSValueW((pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), fignorehkcu, (pvdefaultdata?.value ?: 0L).toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetValueA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), srrfflags, (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetValueFromHKCUHKLM((pwszkey?.value ?: 0L).toString(), (pwszvalue?.value ?: 0L).toString(), srrfflags, (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegGetValueW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), srrfflags, (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, fignorehkcu: Bool): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegOpenUSKeyA((pszpath?.value ?: 0L).toString(), samdesired.toInt(), hrelativeuskey.toString(), (phnewuskey?.value ?: 0L).toString(), fignorehkcu) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, fignorehkcu: Bool): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegOpenUSKeyW((pwzpath?.value ?: 0L).toString(), samdesired.toInt(), hrelativeuskey.toString(), (phnewuskey?.value ?: 0L).toString(), fignorehkcu) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyA(huskey.toString(), (pcsubkeys?.value ?: 0L).toString(), (pcchmaxsubkeylen?.value ?: 0L).toString(), (pcvalues?.value ?: 0L).toString(), (pcchmaxvaluenamelen?.value ?: 0L).toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyW(huskey.toString(), (pcsubkeys?.value ?: 0L).toString(), (pcchmaxsubkeylen?.value ?: 0L).toString(), (pcvalues?.value ?: 0L).toString(), (pcchmaxvaluenamelen?.value ?: 0L).toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegQueryUSValueA(huskey.toString(), (pszvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), fignorehkcu, (pvdefaultdata?.value ?: 0L).toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegQueryUSValueW(huskey.toString(), (pszvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), fignorehkcu, (pvdefaultdata?.value ?: 0L).toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegSetPathA((hkey?.value ?: 0L).toString(), (pcszsubkey?.value ?: 0L).toString(), (pcszvalue?.value ?: 0L).toString(), (pcszpath?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegSetPathW((hkey?.value ?: 0L).toString(), (pcszsubkey?.value ?: 0L).toString(), (pcszvalue?.value ?: 0L).toString(), (pcszpath?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegSetUSValueA((pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), dwtype.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegSetUSValueW((pwzsubkey?.value ?: 0L).toString(), (pwzvalue?.value ?: 0L).toString(), dwtype.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegWriteUSValueA(huskey.toString(), (pszvalue?.value ?: 0L).toString(), dwtype.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRegWriteUSValueW(huskey.toString(), (pwzvalue?.value ?: 0L).toString(), dwtype.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHReleaseThreadRef(): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHReleaseThreadRef() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRemoveLocalizedName((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHResolveLibrary(psilibrary: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHResolveLibrary((psilibrary?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRestricted(rest: Restrictions): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHRestricted(rest) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSendMessageBroadcastA(umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSendMessageBroadcastW(umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: COpaquePointer?, dwfileopflags: UInt, pfops: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetDefaultProperties((hwnd?.value ?: 0L).toString(), (psi?.value ?: 0L).toString(), dwfileopflags.toInt(), (pfops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetFolderPathA(csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetFolderPathW(csidl, (htoken?.value ?: 0L).toString(), dwflags.toInt(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetInstanceExplorer(punk: COpaquePointer?) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetInstanceExplorer((punk?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHSetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetKnownFolderPath((rfid?.value ?: 0L).toString(), dwflags.toInt(), (htoken?.value ?: 0L).toString(), (pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetLocalizedName((pszpath?.value ?: 0L).toString(), (pszresmodule?.value ?: 0L).toString(), idsres) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetTemporaryPropertyForItem((psi?.value ?: 0L).toString(), (propkey?.value ?: 0L).toString(), (propvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetThreadRef(punk: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetThreadRef((punk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetUnreadMailCountW((pszmailaddress?.value ?: 0L).toString(), dwcount.toInt(), (pszshellexecutecommand?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetValueA((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), dwtype.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSetValueW((hkey?.value ?: 0L).toString(), (pszsubkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), dwtype.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shshellFolderViewMessage((hwndmain?.value ?: 0L).toString(), umsg.toInt(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHShowManageLibraryUI(psilibrary: COpaquePointer?, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHShowManageLibraryUI((psilibrary?.value ?: 0L).toString(), (hwndowner?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString(), (pszinstruction?.value ?: 0L).toString(), lmdoptions) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): COpaquePointer? =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSimpleIDListFromPath((pszpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSkipJunction(pbc: COpaquePointer?, pclsid: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHSkipJunction((pbc?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHStartNetConnectionDialogW((hwnd?.value ?: 0L).toString(), (pszremotename?.value ?: 0L).toString(), dwtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStrDupA(psz: Pcstr, ppwsz: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHStrDupA((psz?.value ?: 0L).toString(), (ppwsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHStrDupW((psz?.value ?: 0L).toString(), (ppwsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHStripMneumonicA((pszmenu?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHStripMneumonicW((pszmenu?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHTestTokenMembership((htoken?.value ?: 0L).toString(), ulrid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHUnicodeToAnsi((pwszsrc?.value ?: 0L).toString(), (pszdst?.value ?: 0L).toString(), cchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHUnicodeToUnicode((pwzsrc?.value ?: 0L).toString(), (pwzdst?.value ?: 0L).toString(), cwchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnlockShared(pvdata: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHUnlockShared((pvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHUpdateImageA((pszhashitem?.value ?: 0L).toString(), iindex, uflags.toInt(), iimageindex)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHUpdateImageW((pszhashitem?.value ?: 0L).toString(), iindex, uflags.toInt(), iimageindex)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_sHValidateUNC((hwndowner?.value ?: 0L).toString(), (pszfile?.value ?: 0L).toString(), fconnect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_setCurrentProcessExplicitAppUserModelID((appid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_setMenuContextHelpId((param0?.value ?: 0L).toString(), param1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_setWindowContextHelpId((param0?.value ?: 0L).toString(), param1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_setWindowSubclass((hwnd?.value ?: 0L).toString(), 0L.toString(), uidsubclass.toString(), dwrefdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellAboutA((hwnd?.value ?: 0L).toString(), (szapp?.value ?: 0L).toString(), (szotherstuff?.value ?: 0L).toString(), (hicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellAboutW((hwnd?.value ?: 0L).toString(), (szapp?.value ?: 0L).toString(), (szotherstuff?.value ?: 0L).toString(), (hicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellExecuteA((hwnd?.value ?: 0L).toString(), (lpoperation?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), (lpparameters?.value ?: 0L).toString(), (lpdirectory?.value ?: 0L).toString(), nshowcmd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteExA(pexecinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellExecuteExA((pexecinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteExW(pexecinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellExecuteExW((pexecinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellExecuteW((hwnd?.value ?: 0L).toString(), (lpoperation?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), (lpparameters?.value ?: 0L).toString(), (lpdirectory?.value ?: 0L).toString(), nshowcmd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellMessageBoxA((happinst?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (lpctext?.value ?: 0L).toString(), (lpctitle?.value ?: 0L).toString(), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellMessageBoxW((happinst?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (lpctext?.value ?: 0L).toString(), (lpctitle?.value ?: 0L).toString(), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellGetCachedImageIndex((pwsziconpath?.value ?: 0L).toString(), iiconindex, uiconflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellGetCachedImageIndexA((psziconpath?.value ?: 0L).toString(), iiconindex, uiconflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellGetCachedImageIndexW((psziconpath?.value ?: 0L).toString(), iiconindex, uiconflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetImageLists(phiml: COpaquePointer?, phimlsmall: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellGetImageLists((phiml?.value ?: 0L).toString(), (phimlsmall?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellMergeMenus((hmdst?.value ?: 0L).toString(), (hmsrc?.value ?: 0L).toString(), uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellNotifyIconA(dwmessage.toInt(), (lpdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconGetRect(identifier: COpaquePointer?, iconlocation: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellNotifyIconGetRect((identifier?.value ?: 0L).toString(), (iconlocation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_shellNotifyIconW(dwmessage.toInt(), (lpdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalFileOpen(pidl: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_signalFileOpen((pidl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: COpaquePointer?): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_softwareUpdateMessageBox((hwnd?.value ?: 0L).toString(), (pszdistunit?.value ?: 0L).toString(), dwflags.toInt(), (psdi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgMakeUniqueName(pstgparent: COpaquePointer?, pszfilespec: Pcwstr, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_stgMakeUniqueName((pstgparent?.value ?: 0L).toString(), (pszfilespec?.value ?: 0L).toString(), grfmode.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCSpnA((pszstr?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCSpnIA((pszstr?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCSpnIW((pszstr?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCSpnW((pszstr?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCatBuffA((pszdest?.value ?: 0L).toString(), (pszsrc?.value ?: 0L).toString(), cchdestbuffsize) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCatBuffW((pszdest?.value ?: 0L).toString(), (pszsrc?.value ?: 0L).toString(), cchdestbuffsize) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCatChainW((pszdst?.value ?: 0L).toString(), cchdst.toInt(), ichat.toInt(), (pszsrc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCatW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strChrA((pszstart?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strChrIA((pszstart?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strChrIW((pszstart?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strChrNIW((pszstart?.value ?: 0L).toString(), wmatch.toInt(), cchmax.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strChrNW((pszstart?.value ?: 0L).toString(), wmatch.toInt(), cchmax.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strChrW((pszstart?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpCA((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpCW((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpICA((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpICW((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpIW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpLogicalW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNA((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNCA((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNCW((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNIA((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNICA((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNICW((pszstr1?.value ?: 0L).toString(), (pszstr2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNIW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpNW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCmpW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCpyNW((pszdst?.value ?: 0L).toString(), (pszsrc?.value ?: 0L).toString(), cchmax) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strCpyW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strDupA((pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strDupW((pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFormatByteSize64A(qdw.toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFormatByteSizeA(dw.toInt(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFormatByteSizeEx(ull.toString(), flags, (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFormatByteSizeW(qdw.toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFormatKBSizeA(qdw.toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFormatKBSizeW(qdw.toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFromTimeIntervalA((pszout?.value ?: 0L).toString(), cchmax.toInt(), dwtimems.toInt(), digits) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strFromTimeIntervalW((pszout?.value ?: 0L).toString(), cchmax.toInt(), dwtimems.toInt(), digits) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strIsIntlEqualA(fcasesens, (pszstring1?.value ?: 0L).toString(), (pszstring2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strIsIntlEqualW(fcasesens, (pszstring1?.value ?: 0L).toString(), (pszstring2?.value ?: 0L).toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strNCatA((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), cchmax) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strNCatW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), cchmax) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strPBrkA((psz?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strPBrkW((psz?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRChrA((pszstart?.value ?: 0L).toString(), (pszend?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRChrIA((pszstart?.value ?: 0L).toString(), (pszend?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRChrIW((pszstart?.value ?: 0L).toString(), (pszend?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRChrW((pszstart?.value ?: 0L).toString(), (pszend?.value ?: 0L).toString(), wmatch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRStrIA((pszsource?.value ?: 0L).toString(), (pszlast?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRStrIW((pszsource?.value ?: 0L).toString(), (pszlast?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBSTR(pstr: COpaquePointer?, pidl: COpaquePointer?, pbstr: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRetToBSTR((pstr?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (pbstr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBufA(pstr: COpaquePointer?, pidl: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRetToBufA((pstr?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBufW(pstr: COpaquePointer?, pidl: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRetToBufW((pstr?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToStrA(pstr: COpaquePointer?, pidl: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRetToStrA((pstr?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (ppsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToStrW(pstr: COpaquePointer?, pidl: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strRetToStrW((pstr?.value ?: 0L).toString(), (pidl?.value ?: 0L).toString(), (ppsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strSpnA((psz?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strSpnW((psz?.value ?: 0L).toString(), (pszset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strStrA((pszfirst?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strStrIA((pszfirst?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strStrIW((pszfirst?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strStrNIW((pszfirst?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString(), cchmax.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strStrNW((pszfirst?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString(), cchmax.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strStrW((pszfirst?.value ?: 0L).toString(), (pszsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strToInt64ExA((pszstring?.value ?: 0L).toString(), dwflags, (pllret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strToInt64ExW((pszstring?.value ?: 0L).toString(), dwflags, (pllret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntA(pszsrc: Pcstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strToIntA((pszsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strToIntExA((pszstring?.value ?: 0L).toString(), dwflags, (piret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strToIntExW((pszstring?.value ?: 0L).toString(), dwflags, (piret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strToIntW((pszsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strTrimA((psz?.value ?: 0L).toString(), (psztrimchars?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_strTrimW((psz?.value ?: 0L).toString(), (psztrimchars?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_unloadUserProfile((htoken?.value ?: 0L).toString(), (hprofile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_unregisterAppConstrainedChangeNotification(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_unregisterAppStateChangeNotification(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_unregisterScaleChangeEvent(dwcookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlApplySchemeA((pszin?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlApplySchemeW((pszin?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCanonicalizeA((pszurl?.value ?: 0L).toString(), (pszcanonicalized?.value ?: 0L).toString(), (pcchcanonicalized?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCanonicalizeW((pszurl?.value ?: 0L).toString(), (pszcanonicalized?.value ?: 0L).toString(), (pcchcanonicalized?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCombineA((pszbase?.value ?: 0L).toString(), (pszrelative?.value ?: 0L).toString(), (pszcombined?.value ?: 0L).toString(), (pcchcombined?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCombineW((pszbase?.value ?: 0L).toString(), (pszrelative?.value ?: 0L).toString(), (pszcombined?.value ?: 0L).toString(), (pcchcombined?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCompareA((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), fignoreslash) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCompareW((psz1?.value ?: 0L).toString(), (psz2?.value ?: 0L).toString(), fignoreslash) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCreateFromPathA((pszpath?.value ?: 0L).toString(), (pszurl?.value ?: 0L).toString(), (pcchurl?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlCreateFromPathW((pszpath?.value ?: 0L).toString(), (pszurl?.value ?: 0L).toString(), (pcchurl?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlEscapeA((pszurl?.value ?: 0L).toString(), (pszescaped?.value ?: 0L).toString(), (pcchescaped?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlEscapeW((pszurl?.value ?: 0L).toString(), (pszescaped?.value ?: 0L).toString(), (pcchescaped?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlFixupW((pcszurl?.value ?: 0L).toString(), (psztranslatedurl?.value ?: 0L).toString(), cchmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlGetLocationA((pszurl?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlGetLocationW((pszurl?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: COpaquePointer?, dwpart: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlGetPartA((pszin?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString(), dwpart.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?, dwpart: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlGetPartW((pszin?.value ?: 0L).toString(), (pszout?.value ?: 0L).toString(), (pcchout?.value ?: 0L).toString(), dwpart.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlHashA(pszurl: Pcstr, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlHashA((pszurl?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), cbhash.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlHashW(pszurl: Pcwstr, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlHashW((pszurl?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), cbhash.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlIsA((pszurl?.value ?: 0L).toString(), urlis) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlIsNoHistoryA((pszurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlIsNoHistoryW((pszurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlIsOpaqueA((pszurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlIsOpaqueW((pszurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlIsW((pszurl?.value ?: 0L).toString(), urlis) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlUnescapeA((pszurl?.value ?: 0L).toString(), (pszunescaped?.value ?: 0L).toString(), (pcchunescaped?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_urlUnescapeW((pszurl?.value ?: 0L).toString(), (pszunescaped?.value ?: 0L).toString(), (pcchunescaped?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStrRet(varin: COpaquePointer?, pstrret: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_variantToStrRet((varin?.value ?: 0L).toString(), (pstrret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun whichPlatform(): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_whichPlatform() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_win32DeleteFile((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_winHelpA((hwndmain?.value ?: 0L).toString(), (lpszhelp?.value ?: 0L).toString(), ucommand.toInt(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_winHelpW((hwndmain?.value ?: 0L).toString(), (lpszhelp?.value ?: 0L).toString(), ucommand.toInt(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeCabinetState(pcs: COpaquePointer?): Bool =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_writeCabinetState((pcs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_wnsprintfA((pszdest?.value ?: 0L).toString(), cchdest, (pszfmt?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_wnsprintfW((pszdest?.value ?: 0L).toString(), cchdest, (pszfmt?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_wvnsprintfA((pszdest?.value ?: 0L).toString(), cchdest, (pszfmt?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: COpaquePointer?): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_wvnsprintfW((pszdest?.value ?: 0L).toString(), cchdest, (pszfmt?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
