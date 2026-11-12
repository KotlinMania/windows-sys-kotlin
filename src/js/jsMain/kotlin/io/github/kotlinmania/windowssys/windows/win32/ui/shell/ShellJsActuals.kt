@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32UiShellNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun assocCreate(clsid: Guid, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocCreateForClasses(rgclasses: ConstPtr, cclasses: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocCreateForClasses(rgclasses.rawAddress.toString(), cclasses.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocGetDetailsOfPropKey(psf: MutPtr, pidl: ConstPtr, pkey: ConstPtr, pv: MutPtr, pffoundpropkey: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocGetDetailsOfPropKey(psf.rawAddress.toString(), pidl.rawAddress.toString(), pkey.rawAddress.toString(), pv.rawAddress.toString(), pffoundpropkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: MutPtr, pflag: MutPtr, ppsztype: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocGetPerceivedType(pszext.rawAddress.toString(), ptype.rawAddress.toString(), pflag.rawAddress.toString(), ppsztype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocIsDangerous(pszassoc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocQueryKeyA(flags.toInt(), key, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), phkeyout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocQueryKeyW(flags.toInt(), key, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), phkeyout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocQueryStringA(flags.toInt(), str, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocQueryStringByKeyA(flags.toInt(), str, hkassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocQueryStringByKeyW(flags.toInt(), str, hkassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellAssocQueryStringW(flags.toInt(), str, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cdefFolderMenuCreate2(pidlfolder: ConstPtr, hwnd: Hwnd, cidl: UInt, apidl: ConstPtr, psf: MutPtr, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: ConstPtr, ppcm: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellCdefFolderMenuCreate2(pidlfolder.rawAddress.toString(), hwnd.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), psf.rawAddress.toString(), 0L.toString(), nkeys.toInt(), ahkeys.rawAddress.toString(), ppcm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cidldataCreateFromIdarray(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, ppdtobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellCidldataCreateFromIdarray(pidlfolder.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), ppdtobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellChrCmpIA(w1.toInt(), w2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellChrCmpIW(w1.toInt(), w2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellColorAdjustLuma(clrrgb.toInt(), n, fscale) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellColorHLSToRGB(whue.toInt(), wluminance.toInt(), wsaturation.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: MutPtr, pwluminance: MutPtr, pwsaturation: MutPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellColorRGBToHLS(clrrgb.toInt(), pwhue.rawAddress.toString(), pwluminance.rawAddress.toString(), pwsaturation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: MutPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellCommandLineToArgvW(lpcmdline.rawAddress.toString(), pnumargs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectToConnectionPoint(punk: MutPtr, riidevent: ConstPtr, fconnect: Bool, punktarget: MutPtr, pdwcookie: MutPtr, ppcpout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellConnectToConnectionPoint(punk.rawAddress.toString(), riidevent.rawAddress.toString(), fconnect, punktarget.rawAddress.toString(), pdwcookie.rawAddress.toString(), ppcpout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellCreateProfile(pszusersid.rawAddress.toString(), pszusername.rawAddress.toString(), pszprofilepath.rawAddress.toString(), cchprofilepath.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadAutoScroll(hwnd: Hwnd, pad: MutPtr, pptnow: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDadAutoScroll(hwnd.rawAddress.toString(), pad.rawAddress.toString(), pptnow.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragLeave(): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDadDragLeave() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragMove(pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadSetDragImage(him: Himagelist, pptoffset: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDadSetDragImage(him.toString(), pptoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadShowDragImage(fshow: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDadShowDragImage(fshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDefSubclassProc(hwnd.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDeleteProfileA(lpsidstring.rawAddress.toString(), lpprofilepath.rawAddress.toString(), lpcomputername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDeleteProfileW(lpsidstring.rawAddress.toString(), lpprofilepath.rawAddress.toString(), lpcomputername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDoEnvironmentSubstA(pszsrc.rawAddress.toString(), cchsrc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDoEnvironmentSubstW(pszsrc.rawAddress.toString(), cchsrc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDragAcceptFiles(hwnd.rawAddress.toString(), faccept)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dragFinish(hdrop: Hdrop) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDragFinish(hdrop.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDragQueryFileA(hdrop.rawAddress.toString(), ifile.toInt(), lpszfile.rawAddress.toString(), cch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDragQueryFileW(hdrop.rawAddress.toString(), ifile.toInt(), lpszfile.rawAddress.toString(), cch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDragQueryPoint(hdrop.rawAddress.toString(), ppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driveType(idrive: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDriveType(idrive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellDuplicateIcon(hinst.rawAddress.toString(), hicon.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: MutPtr): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractAssociatedIconA(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piicon.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: MutPtr, piiconid: MutPtr): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractAssociatedIconExA(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piiconindex.rawAddress.toString(), piiconid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: MutPtr, piiconid: MutPtr): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractAssociatedIconExW(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piiconindex.rawAddress.toString(), piiconid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: MutPtr): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractAssociatedIconW(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piicon.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractIconA(hinst.rawAddress.toString(), pszexefilename.rawAddress.toString(), niconindex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: MutPtr, phiconsmall: MutPtr, nicons: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractIconExA(lpszfile.rawAddress.toString(), niconindex, phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), nicons.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: MutPtr, phiconsmall: MutPtr, nicons: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractIconExW(lpszfile.rawAddress.toString(), niconindex, phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), nicons.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellExtractIconW(hinst.rawAddress.toString(), pszexefilename.rawAddress.toString(), niconindex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellFindExecutableA(lpfile.rawAddress.toString(), lpdirectory.rawAddress.toString(), lpresult.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellFindExecutableW(lpfile.rawAddress.toString(), lpdirectory.rawAddress.toString(), lpresult.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetAcceptLanguagesA(pszlanguages.rawAddress.toString(), pcchlanguages.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetAcceptLanguagesW(pszlanguages.rawAddress.toString(), pcchlanguages.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessExplicitAppUserModelID(appid: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID(appid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetDpiForShellUIComponent(param0) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetFileNameFromBrowse(hwnd.rawAddress.toString(), pszfilepath.rawAddress.toString(), cchfilepath.toInt(), pszworkingdir.rawAddress.toString(), pszdefext.rawAddress.toString(), pszfilters.rawAddress.toString(), psztitle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetMenuContextHelpId(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetMenuPosFromID(hmenu.rawAddress.toString(), id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileType(dwflags: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetProfileType(dwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetProfilesDirectoryA(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetProfilesDirectoryW(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetScaleFactorForDevice(devicetype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetScaleFactorForMonitor(hmon.rawAddress.toString(), pscale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetUserProfileDirectoryA(htoken.rawAddress.toString(), lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetUserProfileDirectoryW(htoken.rawAddress.toString(), lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetWindowContextHelpId(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellGetWindowSubclass(hwnd.rawAddress.toString(), 0L.toString(), uidsubclass.toString(), pdwrefdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmonitorUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmonitorUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHmonitorUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashData(pbdata: ConstPtr, cbdata: UInt, pbhash: MutPtr, cbhash: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHashData(pbdata.rawAddress.toString(), cbdata.toInt(), pbhash.rawAddress.toString(), cbhash.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkClone(pihl: MutPtr, riid: ConstPtr, pihlsiteforclone: MutPtr, dwsitedata: UInt, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkClone(pihl.rawAddress.toString(), riid.rawAddress.toString(), pihlsiteforclone.rawAddress.toString(), dwsitedata.toInt(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateBrowseContext(piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateBrowseContext(piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateExtensionServices(pwzadditionalheaders.rawAddress.toString(), phwnd.rawAddress.toString(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromData(pidataobj: MutPtr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateFromData(pidataobj.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromMoniker(pimktrgt: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateFromMoniker(pimktrgt.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateFromString(pwztarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: MutPtr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateShortcut(grfhlshortcutf.toInt(), pihl.rawAddress.toString(), pwzdir.rawAddress.toString(), pwzfilename.rawAddress.toString(), ppwzshortcutfile.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: MutPtr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), pimktarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzdir.rawAddress.toString(), pwzfilename.rawAddress.toString(), ppwzshortcutfile.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkCreateShortcutFromString(grfhlshortcutf.toInt(), pwztarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzdir.rawAddress.toString(), pwzfilename.rawAddress.toString(), ppwzshortcutfile.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkGetSpecialReference(ureference.toInt(), ppwzreference.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkGetValueFromParams(pwzparams.rawAddress.toString(), pwzname.rawAddress.toString(), ppwzvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkIsShortcut(pwzfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigate(pihl: MutPtr, pihlframe: MutPtr, grfhlnf: UInt, pbc: MutPtr, pibsc: MutPtr, pihlbc: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkNavigate(pihl.rawAddress.toString(), pihlframe.rawAddress.toString(), grfhlnf.toInt(), pbc.rawAddress.toString(), pibsc.rawAddress.toString(), pihlbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, pihlframe: MutPtr, grfhlnf: UInt, pibc: MutPtr, pibsc: MutPtr, pihlbc: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkNavigateToStringReference(pwztarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), pihlframe.rawAddress.toString(), grfhlnf.toInt(), pibc.rawAddress.toString(), pibsc.rawAddress.toString(), pihlbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkOnNavigate(pihlframe: MutPtr, pihlbc: MutPtr, grfhlnf: UInt, pimktarget: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkOnNavigate(pihlframe.rawAddress.toString(), pihlbc.rawAddress.toString(), grfhlnf.toInt(), pimktarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), puhlid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: MutPtr, pimkold: MutPtr, pimknew: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkOnRenameDocument(dwreserved.toInt(), pihlbc.rawAddress.toString(), pimkold.rawAddress.toString(), pimknew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkParseDisplayName(pibc: MutPtr, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: MutPtr, ppimk: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkParseDisplayName(pibc.rawAddress.toString(), pwzdisplayname.rawAddress.toString(), fnoforceabs, pccheaten.rawAddress.toString(), ppimk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkPreprocessMoniker(pibc: MutPtr, pimkin: MutPtr, ppimkout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkPreprocessMoniker(pibc.rawAddress.toString(), pimkin.rawAddress.toString(), ppimkout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkQueryCreateFromData(pidataobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkQueryCreateFromData(pidataobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveMonikerForData(pimkreference: MutPtr, reserved: UInt, pibc: MutPtr, cfmtetc: UInt, rgfmtetc: MutPtr, pibsc: MutPtr, pimkbase: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkResolveMonikerForData(pimkreference.rawAddress.toString(), reserved.toInt(), pibc.rawAddress.toString(), cfmtetc.toInt(), rgfmtetc.rawAddress.toString(), pibsc.rawAddress.toString(), pimkbase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkResolveShortcut(pwzshortcutfilename.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: MutPtr, ppwzlocation: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker(pwzshortcutfilename.rawAddress.toString(), ppimktarget.rawAddress.toString(), ppwzlocation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: MutPtr, ppwzlocation: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkResolveShortcutToString(pwzshortcutfilename.rawAddress.toString(), ppwztarget.rawAddress.toString(), ppwzlocation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: MutPtr, cfmtetc: UInt, rgfmtetc: MutPtr, pibsc: MutPtr, pimkbase: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkResolveStringForData(pwzreference.rawAddress.toString(), reserved.toInt(), pibc.rawAddress.toString(), cfmtetc.toInt(), rgfmtetc.rawAddress.toString(), pibsc.rawAddress.toString(), pimkbase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkSetSpecialReference(ureference.toInt(), pwzreference.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkTranslateURL(pwzurl.rawAddress.toString(), grfflags.toInt(), ppwztranslatedurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkUpdateStackItem(pihlframe: MutPtr, pihlbc: MutPtr, uhlid: UInt, pimktrgt: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellHlinkUpdateStackItem(pihlframe.rawAddress.toString(), pihlbc.rawAddress.toString(), uhlid.toInt(), pimktrgt.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLAppendID(pidl: ConstPtr, pmkid: ConstPtr, fappend: Bool): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILAppendID(pidl.rawAddress.toString(), pmkid.rawAddress.toString(), fappend) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLClone(pidl: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILClone(pidl.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCloneFirst(pidl: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILCloneFirst(pidl.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCombine(pidl1: ConstPtr, pidl2: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILCombine(pidl1.rawAddress.toString(), pidl2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCreateFromPathA(pszpath: Pcstr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILCreateFromPathA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCreateFromPathW(pszpath: Pcwstr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILCreateFromPathW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFindChild(pidlparent: ConstPtr, pidlchild: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILFindChild(pidlparent.rawAddress.toString(), pidlchild.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFindLastID(pidl: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILFindLastID(pidl.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFree(pidl: ConstPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILFree(pidl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iLGetNext(pidl: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILGetNext(pidl.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLGetSize(pidl: ConstPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILGetSize(pidl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLIsEqual(pidl1: ConstPtr, pidl2: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILIsEqual(pidl1.rawAddress.toString(), pidl2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLIsParent(pidl1: ConstPtr, pidl2: ConstPtr, fimmediate: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILIsParent(pidl1.rawAddress.toString(), pidl2.rawAddress.toString(), fimmediate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLLoadFromStreamEx(pstm: MutPtr, pidl: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILLoadFromStreamEx(pstm.rawAddress.toString(), pidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLRemoveLastID(pidl: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILRemoveLastID(pidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLSaveToStream(pstm: MutPtr, pidl: ConstPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellILSaveToStream(pstm.rawAddress.toString(), pidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamCopy(pstmfrom: MutPtr, pstmto: MutPtr, cb: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamCopy(pstmfrom.rawAddress.toString(), pstmto.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamRead(pstm: MutPtr, pv: MutPtr, cb: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamRead(pstm.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReadPidl(pstm: MutPtr, ppidlout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamReadPidl(pstm.rawAddress.toString(), ppidlout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReadStr(pstm: MutPtr, ppsz: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamReadStr(pstm.rawAddress.toString(), ppsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReset(pstm: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamReset(pstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamSize(pstm: MutPtr, pui: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamSize(pstm.rawAddress.toString(), pui.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWrite(pstm: MutPtr, pv: ConstPtr, cb: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamWrite(pstm.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWritePidl(pstm: MutPtr, pidlwrite: ConstPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamWritePidl(pstm.rawAddress.toString(), pidlwrite.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWriteStr(pstm: MutPtr, psz: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIstreamWriteStr(pstm.rawAddress.toString(), psz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownAtomicRelease(ppunk: MutPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIunknownAtomicRelease(ppunk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iunknownGetSite(punk: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIunknownGetSite(punk.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownGetWindow(punk: MutPtr, phwnd: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIunknownGetWindow(punk.rawAddress.toString(), phwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownQueryService(punk: MutPtr, guidservice: ConstPtr, riid: ConstPtr, ppvout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIunknownQueryService(punk.rawAddress.toString(), guidservice.rawAddress.toString(), riid.rawAddress.toString(), ppvout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownSet(ppunk: MutPtr, punk: MutPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIunknownSet(ppunk.rawAddress.toString(), punk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iunknownSetSite(punk: MutPtr, punksite: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIunknownSetSite(punk.rawAddress.toString(), punksite.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: MutPtr, pfparsepersiterules: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellImportPrivacySettings(pszfilename.rawAddress.toString(), pfparseprivacypreferences.rawAddress.toString(), pfparsepersiterules.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initNetworkAddressControl(): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellInitNetworkAddressControl() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStrRet(pstrret: MutPtr, pidl: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellInitPropVariantFromStrRet(pstrret.rawAddress.toString(), pidl.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromStrRet(pstrret: ConstPtr, pidl: ConstPtr, pvar: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellInitVariantFromStrRet(pstrret.rawAddress.toString(), pidl.rawAddress.toString(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIntlStrEqWorkerA(fcasesens, lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIntlStrEqWorkerW(fcasesens, lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharSpaceA(wch: Byte): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsCharSpaceA(wch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharSpaceW(wch: UShort): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsCharSpaceW(wch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isInternetESCEnabled(): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsInternetESCEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsLFNDriveA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsLFNDriveW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNetDrive(idrive: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsNetDrive(idrive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isOS(dwos: OS): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsOS(dwos.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserAnAdmin(): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellIsUserAnAdmin() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellLoadUserProfileA(htoken.rawAddress.toString(), lpprofileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellLoadUserProfileW(htoken.rawAddress.toString(), lpprofileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSaveToStreamEx(piunk: MutPtr, pistm: MutPtr, fcleardirty: Bool): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellOleSaveToStreamEx(piunk.rawAddress.toString(), pistm.rawAddress.toString(), fcleardirty) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellOpenRegStream(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseURLA(pcszurl: Pcstr, ppu: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellParseURLA(pcszurl.rawAddress.toString(), ppu.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseURLW(pcszurl: Pcwstr, ppu: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellParseURLW(pcszurl.rawAddress.toString(), ppu.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAddBackslashA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAddBackslashW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAddExtensionA(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAddExtensionW(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAllocCanonicalize(pszpathin.rawAddress.toString(), dwflags.toInt(), ppszpathout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAllocCombine(pszpathin.rawAddress.toString(), pszmore.rawAddress.toString(), dwflags.toInt(), ppszpathout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAppendA(pszpath.rawAddress.toString(), pszmore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathAppendW(pszpath.rawAddress.toString(), pszmore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathBuildRootA(pszroot.rawAddress.toString(), idrive) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathBuildRootW(pszroot.rawAddress.toString(), idrive) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCanonicalizeA(pszbuf.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCanonicalizeW(pszbuf.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchAddBackslash(pszpath.rawAddress.toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr, pcchremaining: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchAddBackslashEx(pszpath.rawAddress.toString(), cchpath.toString(), ppszend.rawAddress.toString(), pcchremaining.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchAddExtension(pszpath.rawAddress.toString(), cchpath.toString(), pszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchAppend(pszpath.rawAddress.toString(), cchpath.toString(), pszmore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchAppendEx(pszpath.rawAddress.toString(), cchpath.toString(), pszmore.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchCanonicalize(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchCanonicalizeEx(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchCombine(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString(), pszmore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchCombineEx(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString(), pszmore.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchFindExtension(pszpath.rawAddress.toString(), cchpath.toString(), ppszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchIsRoot(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchRemoveBackslash(pszpath.rawAddress.toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr, pcchremaining: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchRemoveBackslashEx(pszpath.rawAddress.toString(), cchpath.toString(), ppszend.rawAddress.toString(), pcchremaining.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchRemoveExtension(pszpath.rawAddress.toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchRemoveFileSpec(pszpath.rawAddress.toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchRenameExtension(pszpath.rawAddress.toString(), cchpath.toString(), pszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchSkipRoot(pszpath.rawAddress.toString(), ppszrootend.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchStripPrefix(pszpath.rawAddress.toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCchStripToRoot(pszpath.rawAddress.toString(), cchpath.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCleanupSpec(pszdir.rawAddress.toString(), pszspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCombineA(pszdest.rawAddress.toString(), pszdir.rawAddress.toString(), pszfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCombineW(pszdest.rawAddress.toString(), pszdir.rawAddress.toString(), pszfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCommonPrefixA(pszfile1.rawAddress.toString(), pszfile2.rawAddress.toString(), achpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCommonPrefixW(pszfile1.rawAddress.toString(), pszfile2.rawAddress.toString(), achpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCompactPathA(hdc.rawAddress.toString(), pszpath.rawAddress.toString(), dx.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCompactPathExA(pszout.rawAddress.toString(), pszsrc.rawAddress.toString(), cchmax.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCompactPathExW(pszout.rawAddress.toString(), pszsrc.rawAddress.toString(), cchmax.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCompactPathW(hdc.rawAddress.toString(), pszpath.rawAddress.toString(), dx.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCreateFromUrlA(pszurl.rawAddress.toString(), pszpath.rawAddress.toString(), pcchpath.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCreateFromUrlAlloc(pszin.rawAddress.toString(), ppszout.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathCreateFromUrlW(pszurl.rawAddress.toString(), pszpath.rawAddress.toString(), pcchpath.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFileExistsA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFileExistsW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindExtensionA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindExtensionW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindFileNameA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindFileNameW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindNextComponentA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindNextComponentW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindOnPathA(pszpath.rawAddress.toString(), ppszotherdirs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindOnPathW(pszpath.rawAddress.toString(), ppszotherdirs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: ConstPtr, iarraysize: Int): Pcstr =
    if (windowsWin32UiShellNapiAddon != null) ConstPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindSuffixArrayA(pszpath.rawAddress.toString(), apszsuffix.rawAddress.toString(), iarraysize) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: ConstPtr, iarraysize: Int): Pcwstr =
    if (windowsWin32UiShellNapiAddon != null) ConstPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathFindSuffixArrayW(pszpath.rawAddress.toString(), apszsuffix.rawAddress.toString(), iarraysize) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetArgsA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetArgsW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetCharTypeA(ch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetCharTypeW(ch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetDriveNumberA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetDriveNumberW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetShortPath(pszlongpath: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathGetShortPath(pszlongpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsContentTypeA(pszpath.rawAddress.toString(), pszcontenttype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsContentTypeW(pszpath.rawAddress.toString(), pszcontenttype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsDirectoryA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsDirectoryEmptyA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsDirectoryEmptyW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsDirectoryW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsExe(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsFileSpecA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsFileSpecW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsLFNFileSpecA(pszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsLFNFileSpecW(pszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsNetworkPathA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsNetworkPathW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsPrefixA(pszprefix.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsPrefixW(pszprefix.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsRelativeA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsRelativeW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsRootA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsRootW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsSameRootA(pszpath1.rawAddress.toString(), pszpath2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsSameRootW(pszpath1.rawAddress.toString(), pszpath2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsSlowA(pszfile.rawAddress.toString(), dwattr.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsSlowW(pszfile.rawAddress.toString(), dwattr.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsSystemFolderA(pszpath.rawAddress.toString(), dwattrb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsSystemFolderW(pszpath.rawAddress.toString(), dwattrb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCEx(pszpath.rawAddress.toString(), ppszserver.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCServerA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCServerShareA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCServerShareW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCServerW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsUNCW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsURLA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathIsURLW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMakePrettyA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMakePrettyW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMakeSystemFolderA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMakeSystemFolderW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMakeUniqueName(pszuniquename.rawAddress.toString(), cchmax.toInt(), psztemplate.rawAddress.toString(), pszlongplate.rawAddress.toString(), pszdir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMatchSpecA(pszfile.rawAddress.toString(), pszspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMatchSpecExA(pszfile.rawAddress.toString(), pszspec.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMatchSpecExW(pszfile.rawAddress.toString(), pszspec.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathMatchSpecW(pszfile.rawAddress.toString(), pszspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathParseIconLocationA(psziconfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathParseIconLocationW(psziconfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathQualify(psz: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathQualify(psz.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathQuoteSpacesA(lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathQuoteSpacesW(lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRelativePathToA(pszpath.rawAddress.toString(), pszfrom.rawAddress.toString(), dwattrfrom.toInt(), pszto.rawAddress.toString(), dwattrto.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRelativePathToW(pszpath.rawAddress.toString(), pszfrom.rawAddress.toString(), dwattrfrom.toInt(), pszto.rawAddress.toString(), dwattrto.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveArgsA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveArgsA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveArgsW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveArgsW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveBackslashA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveBackslashW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveBlanksA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveBlanksA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveBlanksW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveBlanksW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveExtensionA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveExtensionA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveExtensionW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveExtensionW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveFileSpecA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRemoveFileSpecW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRenameExtensionA(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathRenameExtensionW(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathResolve(pszpath: Pwstr, dirs: ConstPtr, fflags: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathResolve(pszpath.rawAddress.toString(), dirs.rawAddress.toString(), fflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathSearchAndQualifyA(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathSearchAndQualifyW(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathSetDlgItemPathA(hdlg.rawAddress.toString(), id, pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathSetDlgItemPathW(hdlg.rawAddress.toString(), id, pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathSkipRootA(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathSkipRootW(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathStripPathA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathStripPathA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathStripPathW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathStripPathW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathStripToRootA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathStripToRootW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUnExpandEnvStringsA(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUnExpandEnvStringsW(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUndecorateA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUndecorateA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathUndecorateW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUndecorateW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUnmakeSystemFolderA(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUnmakeSystemFolderW(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUnquoteSpacesA(lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathUnquoteSpacesW(lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName(pszuniquename.rawAddress.toString(), pszpath.rawAddress.toString(), pszshort.rawAddress.toString(), pszfilespec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: MutPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPickIconDlg(hwnd.rawAddress.toString(), psziconpath.rawAddress.toString(), cchiconpath.toInt(), piiconindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStrRet(propvar: ConstPtr, pstrret: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellPropVariantToStrRet(propvar.rawAddress.toString(), pstrret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qISearch(that: MutPtr, pqit: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellQISearch(that.rawAddress.toString(), pqit.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readCabinetState(pcs: MutPtr, clength: Int): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellReadCabinetState(pcs.rawAddress.toString(), clength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRealDriveType(idrive, foktohitnet) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: ConstPtr, registration: MutPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification(0L.toString(), context.rawAddress.toString(), registration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: ConstPtr, registration: MutPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRegisterAppStateChangeNotification(0L.toString(), context.rawAddress.toString(), registration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRegisterScaleChangeEvent(hevent.rawAddress.toString(), pdwcookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRegisterScaleChangeNotifications(displaydevice, hwndnotify.rawAddress.toString(), umsgnotify.toInt(), pdwcookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRemoveWindowSubclass(hwnd.rawAddress.toString(), 0L.toString(), uidsubclass.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRestartDialog(hwnd.rawAddress.toString(), pszprompt.rawAddress.toString(), dwreturn.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRestartDialogEx(hwnd.rawAddress.toString(), pszprompt.rawAddress.toString(), dwreturn.toInt(), dwreasoncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellRevokeScaleChangeNotifications(displaydevice, dwcookie.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddToRecentDocs(uflags: UInt, pv: ConstPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAddToRecentDocs(uflags.toInt(), pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHAlloc(cb: ULong): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAlloc(cb.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAllocShared(pvdata: ConstPtr, dwsize: UInt, dwprocessid: UInt): Handle =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAllocShared(pvdata.rawAddress.toString(), dwsize.toInt(), dwprocessid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAnsiToAnsi(pszsrc.rawAddress.toString(), pszdst.rawAddress.toString(), cchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAnsiToUnicode(pszsrc.rawAddress.toString(), pwszdst.rawAddress.toString(), cwchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: MutPtr): ULong =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAppBarMessage(dwmessage.toInt(), pdata.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAssocEnumHandlers(pszextra.rawAddress.toString(), affilter, ppenumhandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: ConstPtr, enumhandlers: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication(protocol.rawAddress.toString(), riid.rawAddress.toString(), enumhandlers.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHAutoComplete(hwndedit.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToFolderIDListParent(psfroot: MutPtr, pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHBindToFolderIDListParent(psfroot.rawAddress.toString(), pidl.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString(), ppidllast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToFolderIDListParentEx(psfroot: MutPtr, pidl: ConstPtr, ppbc: MutPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHBindToFolderIDListParentEx(psfroot.rawAddress.toString(), pidl.rawAddress.toString(), ppbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString(), ppidllast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToObject(psf: MutPtr, pidl: ConstPtr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHBindToObject(psf.rawAddress.toString(), pidl.rawAddress.toString(), pbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToParent(pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHBindToParent(pidl.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString(), ppidllast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBrowseForFolderA(lpbi: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHBrowseForFolderA(lpbi.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBrowseForFolderW(lpbi: ConstPtr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHBrowseForFolderW(lpbi.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCLSIDFromString(psz.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: MutPtr, plevent: MutPtr): Handle =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShchangeNotificationLock(hchange.rawAddress.toString(), dwprocid.toInt(), pppidl.rawAddress.toString(), plevent.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShchangeNotificationUnlock(hlock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: ConstPtr, dwitem2: ConstPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHChangeNotify(weventid, uflags.toInt(), dwitem1.rawAddress.toString(), dwitem2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHChangeNotifyDeregister(ulid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: ConstPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHChangeNotifyRegister(hwnd.rawAddress.toString(), fsources, fevents, wmsg.toInt(), centries, pshcne.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCloneSpecialIDList(hwnd.rawAddress.toString(), csidl, fcreate) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCoCreateInstance(pszclsid.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCopyKeyA(hkeysrc.rawAddress.toString(), pszsrcsubkey.rawAddress.toString(), hkeydest.rawAddress.toString(), freserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCopyKeyW(hkeysrc.rawAddress.toString(), pszsrcsubkey.rawAddress.toString(), hkeydest.rawAddress.toString(), freserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateAssociationRegistration(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateAssociationRegistration(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDataObject(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, pdtinner: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDataObject(pidlfolder.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), pdtinner.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultContextMenu(pdcm: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDefaultContextMenu(pdcm.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultExtractIcon(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDefaultExtractIcon(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultPropertiesOp(psi: MutPtr, ppfileop: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp(psi.rawAddress.toString(), ppfileop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDirectory(hwnd.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: ConstPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDirectoryExA(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), psa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: ConstPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateDirectoryExW(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), psa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateFileExtractIconW(pszfile.rawAddress.toString(), dwfileattributes.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromIDList(pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateItemFromIDList(pidl.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateItemFromParsingName(pszpath.rawAddress.toString(), pbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromRelativeName(psiparent: MutPtr, pszname: Pcwstr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateItemFromRelativeName(psiparent.rawAddress.toString(), pszname.rawAddress.toString(), pbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemInKnownFolder(kfid: ConstPtr, dwkfflags: UInt, pszitem: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateItemInKnownFolder(kfid.rawAddress.toString(), dwkfflags.toInt(), pszitem.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemWithParent(pidlparent: ConstPtr, psfparent: MutPtr, pidl: ConstPtr, riid: ConstPtr, ppvitem: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateItemWithParent(pidlparent.rawAddress.toString(), psfparent.rawAddress.toString(), pidl.rawAddress.toString(), riid.rawAddress.toString(), ppvitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateMemStream(pinit: ConstPtr, cbinit: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateMemStream(pinit.rawAddress.toString(), cbinit.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateProcessAsUserW(pscpi: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateProcessAsUserW(pscpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreatePropSheetExtArray(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), maxIface.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker(ppmoniker.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellFolderView(pcsfv: ConstPtr, ppsv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellFolderView(pcsfv.rawAddress.toString(), ppsv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellFolderViewEx(pcsfv: ConstPtr, ppsv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellFolderViewEx(pcsfv.rawAddress.toString(), ppsv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItem(pidlparent: ConstPtr, psfparent: MutPtr, pidl: ConstPtr, ppsi: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellItem(pidlparent.rawAddress.toString(), psfparent.rawAddress.toString(), pidl.rawAddress.toString(), ppsi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArray(pidlparent: ConstPtr, psf: MutPtr, cidl: UInt, ppidl: ConstPtr, ppsiitemarray: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellItemArray(pidlparent.rawAddress.toString(), psf.rawAddress.toString(), cidl.toInt(), ppidl.rawAddress.toString(), ppsiitemarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromDataObject(pdo: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject(pdo.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: ConstPtr, ppsiitemarray: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists(cidl.toInt(), rgpidl.rawAddress.toString(), ppsiitemarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromShellItem(psi: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem(psi.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateShellPalette(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: ConstPtr, ppenumformatetc: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc(cfmt.toInt(), afmt.rawAddress.toString(), ppenumformatetc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateStreamOnFileA(pszfile.rawAddress.toString(), grfmode.toInt(), ppstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: MutPtr, ppstm: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateStreamOnFileEx(pszfile.rawAddress.toString(), grfmode.toInt(), dwattributes.toInt(), fcreate, pstmtemplate.rawAddress.toString(), ppstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateStreamOnFileW(pszfile.rawAddress.toString(), grfmode.toInt(), ppstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateThread(0L.toString(), pdata.rawAddress.toString(), flags.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThreadRef(pcref: MutPtr, ppunk: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateThreadRef(pcref.rawAddress.toString(), ppunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHCreateThreadWithHandle(0L.toString(), pdata.rawAddress.toString(), flags.toInt(), 0L.toString(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr, phiconsmall: MutPtr, niconsize: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDefExtractIconA(psziconfile.rawAddress.toString(), iindex, uflags.toInt(), phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), niconsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr, phiconsmall: MutPtr, niconsize: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDefExtractIconW(psziconfile.rawAddress.toString(), iindex, uflags.toInt(), phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), niconsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDeleteEmptyKeyA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDeleteEmptyKeyW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDeleteKeyA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDeleteKeyW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDeleteValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDeleteValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDestroyPropSheetExtArray(hpsxa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: MutPtr, pdsrc: MutPtr, dweffect: Dropeffect, pdweffect: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHDoDragDrop(hwnd.rawAddress.toString(), pdata.rawAddress.toString(), pdsrc.rawAddress.toString(), dweffect.toInt(), pdweffect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEmptyRecycleBinA(hwnd.rawAddress.toString(), pszrootpath.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEmptyRecycleBinW(hwnd.rawAddress.toString(), pszrootpath.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEnumKeyExA(hkey.rawAddress.toString(), dwindex.toInt(), pszname.rawAddress.toString(), pcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEnumKeyExW(hkey.rawAddress.toString(), dwindex.toInt(), pszname.rawAddress.toString(), pcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEnumValueA(hkey.rawAddress.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEnumValueW(hkey.rawAddress.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW(hkeyuser.rawAddress.toString(), dwindex.toInt(), pszmailaddress.rawAddress.toString(), cchmailaddress) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: MutPtr, ppszcommandline: MutPtr, ppszparameters: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate(pszcmdtemplate.rawAddress.toString(), ppszapplication.rawAddress.toString(), ppszcommandline.rawAddress.toString(), ppszparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFileOperationA(lpfileop: MutPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFileOperationA(lpfileop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFileOperationW(lpfileop: MutPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFileOperationW(lpfileop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFindFiles(pidlfolder: ConstPtr, pidlsavefile: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFindFiles(pidlfolder.rawAddress.toString(), pidlsavefile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShfindInitMenuPopup(hmenu.rawAddress.toString(), hwndowner.rawAddress.toString(), idcmdfirst.toInt(), idcmdlast.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFlushSFCache() {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFlushSFCache()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFormatDateTimeA(pft: ConstPtr, pdwflags: MutPtr, pszbuf: Pstr, cchbuf: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFormatDateTimeA(pft.rawAddress.toString(), pdwflags.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFormatDateTimeW(pft: ConstPtr, pdwflags: MutPtr, pszbuf: Pwstr, cchbuf: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFormatDateTimeW(pft.rawAddress.toString(), pdwflags.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFormatDrive(hwnd.rawAddress.toString(), drive.toInt(), fmtid.toInt(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFree(pv: ConstPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFreeNameMappings(hnamemappings: Handle) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFreeNameMappings(hnamemappings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHFreeShared(hdata.rawAddress.toString(), dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetAttributesFromDataObject(pdo: MutPtr, dwattributemask: UInt, pdwattributes: MutPtr, pcitems: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetAttributesFromDataObject(pdo.rawAddress.toString(), dwattributemask.toInt(), pdwattributes.rawAddress.toString(), pcitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDataFromIDListA(psf: MutPtr, pidl: ConstPtr, nformat: ShgdfilFormat, pv: MutPtr, cb: Int): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetDataFromIDListA(psf.rawAddress.toString(), pidl.rawAddress.toString(), nformat, pv.rawAddress.toString(), cb) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDataFromIDListW(psf: MutPtr, pidl: ConstPtr, nformat: ShgdfilFormat, pv: MutPtr, cb: Int): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetDataFromIDListW(psf.rawAddress.toString(), pidl.rawAddress.toString(), nformat, pv.rawAddress.toString(), cb) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDesktopFolder(ppshf: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetDesktopFolder(ppshf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: MutPtr, pultotalnumberofbytes: MutPtr, pultotalnumberoffreebytes: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA(pszdirectoryname.rawAddress.toString(), pulfreebytesavailabletocaller.rawAddress.toString(), pultotalnumberofbytes.rawAddress.toString(), pultotalnumberoffreebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: MutPtr, pultotalnumberofbytes: MutPtr, pultotalnumberoffreebytes: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW(pszdirectoryname.rawAddress.toString(), pulfreebytesavailabletocaller.rawAddress.toString(), pultotalnumberofbytes.rawAddress.toString(), pultotalnumberoffreebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetDriveMedia(pszdrive.rawAddress.toString(), pdwmediacontent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFileInfoA(pszpath.rawAddress.toString(), dwfileattributes.toInt(), psfi.rawAddress.toString(), cbfileinfo.toInt(), uflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFileInfoW(pszpath.rawAddress.toString(), dwfileattributes.toInt(), psfi.rawAddress.toString(), cbfileinfo.toInt(), uflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFolderLocation(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), ppidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFolderPathA(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszsubdir.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszsubdir.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetFolderPathW(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIDListFromObject(punk: MutPtr, ppidl: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetIDListFromObject(punk.rawAddress.toString(), ppidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetIconOverlayIndexA(psziconpath.rawAddress.toString(), iiconindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetIconOverlayIndexW(psziconpath.rawAddress.toString(), iiconindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetImageList(iimagelist: Int, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetImageList(iimagelist, riid.rawAddress.toString(), ppvobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetInstanceExplorer(ppunk: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetInstanceExplorer(ppunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetInverseCMAP(pbmap: MutPtr, cbmap: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetInverseCMAP(pbmap.rawAddress.toString(), cbmap.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetItemFromDataObject(pdtobj: MutPtr, dwflags: DataobjGetItemFlags, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetItemFromDataObject(pdtobj.rawAddress.toString(), dwflags, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetItemFromObject(punk: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetItemFromObject(punk.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderIDList(rfid: ConstPtr, dwflags: UInt, htoken: Handle, ppidl: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetKnownFolderIDList(rfid.rawAddress.toString(), dwflags.toInt(), htoken.rawAddress.toString(), ppidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderItem(rfid: ConstPtr, flags: KnownFolderFlag, htoken: Handle, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetKnownFolderItem(rfid.rawAddress.toString(), flags, htoken.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderPath(rfid: ConstPtr, dwflags: UInt, htoken: Handle, ppszpath: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetKnownFolderPath(rfid.rawAddress.toString(), dwflags.toInt(), htoken.rawAddress.toString(), ppszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetLocalizedName(pszpath.rawAddress.toString(), pszresmodule.rawAddress.toString(), cch.toInt(), pidsres.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetMalloc(ppmalloc: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetMalloc(ppmalloc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNameFromIDList(pidl: ConstPtr, sigdnname: Sigdn, ppszname: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetNameFromIDList(pidl.rawAddress.toString(), sigdnname, ppszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: MutPtr, uflags: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetNewLinkInfoA(pszlinkto.rawAddress.toString(), pszdir.rawAddress.toString(), pszname.rawAddress.toString(), pfmustcopy.rawAddress.toString(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: MutPtr, uflags: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetNewLinkInfoW(pszlinkto.rawAddress.toString(), pszdir.rawAddress.toString(), pszname.rawAddress.toString(), pfmustcopy.rawAddress.toString(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListA(pidl: ConstPtr, pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetPathFromIDListA(pidl.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListEx(pidl: ConstPtr, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetPathFromIDListEx(pidl.rawAddress.toString(), pszpath.rawAddress.toString(), cchpath.toInt(), uopts.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListW(pidl: ConstPtr, pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetPathFromIDListW(pidl.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetRealIDL(psf: MutPtr, pidlsimple: ConstPtr, ppidlreal: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetRealIDL(psf.rawAddress.toString(), pidlsimple.rawAddress.toString(), ppidlreal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSetFolderCustomSettings(pfcs: MutPtr, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetSetFolderCustomSettings(pfcs.rawAddress.toString(), pszpath.rawAddress.toString(), dwreadwrite.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSetSettings(lpss: MutPtr, dwmask: SsfMask, bset: Bool) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetSetSettings(lpss.rawAddress.toString(), dwmask.toInt(), bset)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHGetSettings(psfs: MutPtr, dwmask: UInt) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetSettings(psfs.rawAddress.toString(), dwmask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetSpecialFolderLocation(hwnd.rawAddress.toString(), csidl, ppidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetSpecialFolderPathA(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), csidl, fcreate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetSpecialFolderPathW(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), csidl, fcreate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetStockIconInfo(siid, uflags.toInt(), psii.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetTemporaryPropertyForItem(psi: MutPtr, propkey: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem(psi.rawAddress.toString(), propkey.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetThreadRef(ppunk: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetThreadRef(ppunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: MutPtr, pfiletime: MutPtr, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetUnreadMailCountW(hkeyuser.rawAddress.toString(), pszmailaddress.rawAddress.toString(), pdwcount.rawAddress.toString(), pfiletime.rawAddress.toString(), pszshellexecutecommand.rawAddress.toString(), cchshellexecutecommand) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetViewStatePropertyBag(pidl: ConstPtr, pszbagname: Pcwstr, dwflags: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGetViewStatePropertyBag(pidl.rawAddress.toString(), pszbagname.rawAddress.toString(), dwflags.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGlobalCounterDecrement(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGlobalCounterGetValue(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHGlobalCounterIncrement(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHHandleUpdateImage(pidlextra: ConstPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHHandleUpdateImage(pidlextra.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: MutPtr, rgfinout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHILCreateFromPath(pszpath.rawAddress.toString(), ppidl.rawAddress.toString(), rgfinout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHInvokePrinterCommandA(hwnd.rawAddress.toString(), uaction.toInt(), lpbuf1.rawAddress.toString(), lpbuf2.rawAddress.toString(), fmodal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHInvokePrinterCommandW(hwnd.rawAddress.toString(), uaction.toInt(), lpbuf1.rawAddress.toString(), lpbuf2.rawAddress.toString(), fmodal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHIsFileAvailableOffline(pwszpath.rawAddress.toString(), pdwstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHIsLowMemoryMachine(dwtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHLimitInputEdit(hwndedit.rawAddress.toString(), psf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadInProc(rclsid: ConstPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHLoadInProc(rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: ConstPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHLoadIndirectString(pszsource.rawAddress.toString(), pszoutbuf.rawAddress.toString(), cchoutbuf.toInt(), ppvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHLockShared(hdata.rawAddress.toString(), dwprocessid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMapPIDLToSystemImageListIndex(pshf: MutPtr, pidl: ConstPtr, piindexsel: MutPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex(pshf.rawAddress.toString(), pidl.rawAddress.toString(), piindexsel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHMessageBoxCheckA(hwnd.rawAddress.toString(), psztext.rawAddress.toString(), pszcaption.rawAddress.toString(), utype.toInt(), idefault, pszregval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHMessageBoxCheckW(hwnd.rawAddress.toString(), psztext.rawAddress.toString(), pszcaption.rawAddress.toString(), utype.toInt(), idefault, pszregval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMultiFileProperties(pdtobj: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHMultiFileProperties(pdtobj.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHObjectProperties(hwnd.rawAddress.toString(), shopobjecttype.toInt(), pszobjectname.rawAddress.toString(), pszpropertypage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenFolderAndSelectItems(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenFolderAndSelectItems(pidlfolder.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: ConstPtr, ckeys: UInt, pclsiddefault: ConstPtr, pdtobj: MutPtr, psb: MutPtr, pstartpage: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenPropSheetW(pszcaption.rawAddress.toString(), ahkeys.rawAddress.toString(), ckeys.toInt(), pclsiddefault.rawAddress.toString(), pdtobj.rawAddress.toString(), psb.rawAddress.toString(), pstartpage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenRegStream2A(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenRegStream2W(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenRegStreamA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenRegStreamW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: ConstPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHOpenWithDialog(hwndparent.rawAddress.toString(), poainfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: MutPtr, ppidl: MutPtr, sfgaoin: UInt, psfgaoout: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHParseDisplayName(pszname.rawAddress.toString(), pbc.rawAddress.toString(), ppidl.rawAddress.toString(), sfgaoin.toInt(), psfgaoout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: MutPtr, pszpath: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHPathPrepareForWriteA(hwnd.rawAddress.toString(), punkenablemodless.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: MutPtr, pszpath: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHPathPrepareForWriteW(hwnd.rawAddress.toString(), punkenablemodless.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryInfoKeyA(hkey.rawAddress.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryInfoKeyW(hkey.rawAddress.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryRecycleBinA(pszrootpath.rawAddress.toString(), pshqueryrbinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryRecycleBinW(pszrootpath.rawAddress.toString(), pshqueryrbinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryUserNotificationState(pquns: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryUserNotificationState(pquns.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: ConstPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryValueExA(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwreserved.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: ConstPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHQueryValueExW(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwreserved.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegCloseUSKey(huskey.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegCreateUSKeyA(pszpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegCreateUSKeyW(pwzpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA(huskey.toString(), pszsubkey.rawAddress.toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW(huskey.toString(), pwzsubkey.rawAddress.toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegDeleteUSValueA(huskey.toString(), pszvalue.rawAddress.toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegDeleteUSValueW(huskey.toString(), pwzvalue.rawAddress.toString(), delregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegDuplicateHKey(hkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegEnumUSKeyA(huskey.toString(), dwindex.toInt(), pszname.rawAddress.toString(), pcchname.rawAddress.toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegEnumUSKeyW(huskey.toString(), dwindex.toInt(), pwzname.rawAddress.toString(), pcchname.rawAddress.toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegEnumUSValueA(huskey.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegEnumUSValueW(huskey.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetBoolUSValueA(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), fignorehkcu, fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetBoolUSValueW(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), fignorehkcu, fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetIntW(hk.rawAddress.toString(), pwzkey.rawAddress.toString(), idefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetPathA(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetPathW(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetUSValueA(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetUSValueW(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), srrfflags, pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM(pwszkey.rawAddress.toString(), pwszvalue.rawAddress.toString(), srrfflags, pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegGetValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), srrfflags, pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, fignorehkcu: Bool): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegOpenUSKeyA(pszpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), fignorehkcu) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, fignorehkcu: Bool): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegOpenUSKeyW(pwzpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), fignorehkcu) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA(huskey.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW(huskey.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString(), enumregflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegQueryUSValueA(huskey.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegQueryUSValueW(huskey.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegSetPathA(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pcszpath.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegSetPathW(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pcszpath.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegSetUSValueA(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegSetUSValueW(pwzsubkey.rawAddress.toString(), pwzvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegWriteUSValueA(huskey.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRegWriteUSValueW(huskey.toString(), pwzvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHReleaseThreadRef(): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHReleaseThreadRef() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRemoveLocalizedName(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHResolveLibrary(psilibrary: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHResolveLibrary(psilibrary.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRestricted(rest: Restrictions): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHRestricted(rest) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSendMessageBroadcastA(umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSendMessageBroadcastW(umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: MutPtr, dwfileopflags: UInt, pfops: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetDefaultProperties(hwnd.rawAddress.toString(), psi.rawAddress.toString(), dwfileopflags.toInt(), pfops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetFolderPathA(csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetFolderPathW(csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetInstanceExplorer(punk: MutPtr) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetInstanceExplorer(punk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHSetKnownFolderPath(rfid: ConstPtr, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetKnownFolderPath(rfid.rawAddress.toString(), dwflags.toInt(), htoken.rawAddress.toString(), pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetLocalizedName(pszpath.rawAddress.toString(), pszresmodule.rawAddress.toString(), idsres) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetTemporaryPropertyForItem(psi: MutPtr, propkey: ConstPtr, propvar: ConstPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem(psi.rawAddress.toString(), propkey.rawAddress.toString(), propvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetThreadRef(punk: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetThreadRef(punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetUnreadMailCountW(pszmailaddress.rawAddress.toString(), dwcount.toInt(), pszshellexecutecommand.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSetValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShshellFolderViewMessage(hwndmain.rawAddress.toString(), umsg.toInt(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHShowManageLibraryUI(psilibrary: MutPtr, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHShowManageLibraryUI(psilibrary.rawAddress.toString(), hwndowner.rawAddress.toString(), psztitle.rawAddress.toString(), pszinstruction.rawAddress.toString(), lmdoptions) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): MutPtr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSimpleIDListFromPath(pszpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSkipJunction(pbc: MutPtr, pclsid: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHSkipJunction(pbc.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHStartNetConnectionDialogW(hwnd.rawAddress.toString(), pszremotename.rawAddress.toString(), dwtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStrDupA(psz: Pcstr, ppwsz: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHStrDupA(psz.rawAddress.toString(), ppwsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHStrDupW(psz.rawAddress.toString(), ppwsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHStripMneumonicA(pszmenu.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHStripMneumonicW(pszmenu.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHTestTokenMembership(htoken.rawAddress.toString(), ulrid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHUnicodeToAnsi(pwszsrc.rawAddress.toString(), pszdst.rawAddress.toString(), cchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHUnicodeToUnicode(pwzsrc.rawAddress.toString(), pwzdst.rawAddress.toString(), cwchbuf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnlockShared(pvdata: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHUnlockShared(pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHUpdateImageA(pszhashitem.rawAddress.toString(), iindex, uflags.toInt(), iimageindex)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHUpdateImageW(pszhashitem.rawAddress.toString(), iindex, uflags.toInt(), iimageindex)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSHValidateUNC(hwndowner.rawAddress.toString(), pszfile.rawAddress.toString(), fconnect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID(appid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSetMenuContextHelpId(param0.rawAddress.toString(), param1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSetWindowContextHelpId(param0.rawAddress.toString(), param1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSetWindowSubclass(hwnd.rawAddress.toString(), 0L.toString(), uidsubclass.toString(), dwrefdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellAboutA(hwnd.rawAddress.toString(), szapp.rawAddress.toString(), szotherstuff.rawAddress.toString(), hicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellAboutW(hwnd.rawAddress.toString(), szapp.rawAddress.toString(), szotherstuff.rawAddress.toString(), hicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellExecuteA(hwnd.rawAddress.toString(), lpoperation.rawAddress.toString(), lpfile.rawAddress.toString(), lpparameters.rawAddress.toString(), lpdirectory.rawAddress.toString(), nshowcmd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteExA(pexecinfo: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellExecuteExA(pexecinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteExW(pexecinfo: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellExecuteExW(pexecinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellExecuteW(hwnd.rawAddress.toString(), lpoperation.rawAddress.toString(), lpfile.rawAddress.toString(), lpparameters.rawAddress.toString(), lpdirectory.rawAddress.toString(), nshowcmd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellMessageBoxA(happinst.rawAddress.toString(), hwnd.rawAddress.toString(), lpctext.rawAddress.toString(), lpctitle.rawAddress.toString(), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellMessageBoxW(happinst.rawAddress.toString(), hwnd.rawAddress.toString(), lpctext.rawAddress.toString(), lpctitle.rawAddress.toString(), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellGetCachedImageIndex(pwsziconpath.rawAddress.toString(), iiconindex, uiconflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellGetCachedImageIndexA(psziconpath.rawAddress.toString(), iiconindex, uiconflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellGetCachedImageIndexW(psziconpath.rawAddress.toString(), iiconindex, uiconflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetImageLists(phiml: MutPtr, phimlsmall: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellGetImageLists(phiml.rawAddress.toString(), phimlsmall.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellMergeMenus(hmdst.rawAddress.toString(), hmsrc.rawAddress.toString(), uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellNotifyIconA(dwmessage.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconGetRect(identifier: ConstPtr, iconlocation: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellNotifyIconGetRect(identifier.rawAddress.toString(), iconlocation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellShellNotifyIconW(dwmessage.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalFileOpen(pidl: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSignalFileOpen(pidl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: MutPtr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellSoftwareUpdateMessageBox(hwnd.rawAddress.toString(), pszdistunit.rawAddress.toString(), dwflags.toInt(), psdi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgMakeUniqueName(pstgparent: MutPtr, pszfilespec: Pcwstr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStgMakeUniqueName(pstgparent.rawAddress.toString(), pszfilespec.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCSpnA(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCSpnIA(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCSpnIW(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCSpnW(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCatBuffA(pszdest.rawAddress.toString(), pszsrc.rawAddress.toString(), cchdestbuffsize) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCatBuffW(pszdest.rawAddress.toString(), pszsrc.rawAddress.toString(), cchdestbuffsize) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCatChainW(pszdst.rawAddress.toString(), cchdst.toInt(), ichat.toInt(), pszsrc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCatW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrChrA(pszstart.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrChrIA(pszstart.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrChrIW(pszstart.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrChrNIW(pszstart.rawAddress.toString(), wmatch.toInt(), cchmax.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrChrNW(pszstart.rawAddress.toString(), wmatch.toInt(), cchmax.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrChrW(pszstart.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpCA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpCW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpICA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpICW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpIW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpLogicalW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNCA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNCW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNIA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNICA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNICW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNIW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpNW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCmpW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCpyNW(pszdst.rawAddress.toString(), pszsrc.rawAddress.toString(), cchmax) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrCpyW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrDupA(pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrDupW(pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFormatByteSize64A(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFormatByteSizeA(dw.toInt(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFormatByteSizeEx(ull.toString(), flags, pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFormatByteSizeW(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFormatKBSizeA(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFormatKBSizeW(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFromTimeIntervalA(pszout.rawAddress.toString(), cchmax.toInt(), dwtimems.toInt(), digits) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrFromTimeIntervalW(pszout.rawAddress.toString(), cchmax.toInt(), dwtimems.toInt(), digits) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrIsIntlEqualA(fcasesens, pszstring1.rawAddress.toString(), pszstring2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrIsIntlEqualW(fcasesens, pszstring1.rawAddress.toString(), pszstring2.rawAddress.toString(), nchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrNCatA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), cchmax) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrNCatW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), cchmax) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrPBrkA(psz.rawAddress.toString(), pszset.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrPBrkW(psz.rawAddress.toString(), pszset.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRChrA(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRChrIA(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRChrIW(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRChrW(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRStrIA(pszsource.rawAddress.toString(), pszlast.rawAddress.toString(), pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRStrIW(pszsource.rawAddress.toString(), pszlast.rawAddress.toString(), pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBSTR(pstr: MutPtr, pidl: ConstPtr, pbstr: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRetToBSTR(pstr.rawAddress.toString(), pidl.rawAddress.toString(), pbstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBufA(pstr: MutPtr, pidl: ConstPtr, pszbuf: Pstr, cchbuf: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRetToBufA(pstr.rawAddress.toString(), pidl.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBufW(pstr: MutPtr, pidl: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRetToBufW(pstr.rawAddress.toString(), pidl.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToStrA(pstr: MutPtr, pidl: ConstPtr, ppsz: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRetToStrA(pstr.rawAddress.toString(), pidl.rawAddress.toString(), ppsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToStrW(pstr: MutPtr, pidl: ConstPtr, ppsz: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrRetToStrW(pstr.rawAddress.toString(), pidl.rawAddress.toString(), ppsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrSpnA(psz.rawAddress.toString(), pszset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrSpnW(psz.rawAddress.toString(), pszset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrStrA(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrStrIA(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrStrIW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrStrNIW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString(), cchmax.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrStrNW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString(), cchmax.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAddon != null) MutPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrStrW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrToInt64ExA(pszstring.rawAddress.toString(), dwflags, pllret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrToInt64ExW(pszstring.rawAddress.toString(), dwflags, pllret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntA(pszsrc: Pcstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrToIntA(pszsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrToIntExA(pszstring.rawAddress.toString(), dwflags, piret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: MutPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrToIntExW(pszstring.rawAddress.toString(), dwflags, piret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrToIntW(pszsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrTrimA(psz.rawAddress.toString(), psztrimchars.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellStrTrimW(psz.rawAddress.toString(), psztrimchars.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUnloadUserProfile(htoken.rawAddress.toString(), hprofile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration) {
    if (windowsWin32UiShellNapiAddon != null) {
        windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUnregisterScaleChangeEvent(dwcookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlApplySchemeA(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlApplySchemeW(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCanonicalizeA(pszurl.rawAddress.toString(), pszcanonicalized.rawAddress.toString(), pcchcanonicalized.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCanonicalizeW(pszurl.rawAddress.toString(), pszcanonicalized.rawAddress.toString(), pcchcanonicalized.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCombineA(pszbase.rawAddress.toString(), pszrelative.rawAddress.toString(), pszcombined.rawAddress.toString(), pcchcombined.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCombineW(pszbase.rawAddress.toString(), pszrelative.rawAddress.toString(), pszcombined.rawAddress.toString(), pcchcombined.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCompareA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), fignoreslash) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCompareW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), fignoreslash) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCreateFromPathA(pszpath.rawAddress.toString(), pszurl.rawAddress.toString(), pcchurl.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlCreateFromPathW(pszpath.rawAddress.toString(), pszurl.rawAddress.toString(), pcchurl.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlEscapeA(pszurl.rawAddress.toString(), pszescaped.rawAddress.toString(), pcchescaped.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlEscapeW(pszurl.rawAddress.toString(), pszescaped.rawAddress.toString(), pcchescaped.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlFixupW(pcszurl.rawAddress.toString(), psztranslatedurl.rawAddress.toString(), cchmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    if (windowsWin32UiShellNapiAddon != null) ConstPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlGetLocationA(pszurl.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    if (windowsWin32UiShellNapiAddon != null) ConstPtr((windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlGetLocationW(pszurl.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr, dwpart: UInt, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlGetPartA(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwpart.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr, dwpart: UInt, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlGetPartW(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwpart.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlHashA(pszurl: Pcstr, pbhash: MutPtr, cbhash: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlHashA(pszurl.rawAddress.toString(), pbhash.rawAddress.toString(), cbhash.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlHashW(pszurl: Pcwstr, pbhash: MutPtr, cbhash: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlHashW(pszurl.rawAddress.toString(), pbhash.rawAddress.toString(), cbhash.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlIsA(pszurl.rawAddress.toString(), urlis) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlIsNoHistoryA(pszurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlIsNoHistoryW(pszurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlIsOpaqueA(pszurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlIsOpaqueW(pszurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlIsW(pszurl.rawAddress.toString(), urlis) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlUnescapeA(pszurl.rawAddress.toString(), pszunescaped.rawAddress.toString(), pcchunescaped.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellUrlUnescapeW(pszurl.rawAddress.toString(), pszunescaped.rawAddress.toString(), pcchunescaped.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStrRet(varin: ConstPtr, pstrret: MutPtr): Hresult =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellVariantToStrRet(varin.rawAddress.toString(), pstrret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun whichPlatform(): UInt =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWhichPlatform() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWin32DeleteFile(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWinHelpA(hwndmain.rawAddress.toString(), lpszhelp.rawAddress.toString(), ucommand.toInt(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWinHelpW(hwndmain.rawAddress.toString(), lpszhelp.rawAddress.toString(), ucommand.toInt(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeCabinetState(pcs: ConstPtr): Bool =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWriteCabinetState(pcs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWnsprintfA(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWnsprintfW(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: ConstPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWvnsprintfA(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), arglist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: ConstPtr): Int =
    if (windowsWin32UiShellNapiAddon != null) (windowsWin32UiShellNapiAddon.windowssysWindowsWin32UiShellWvnsprintfW(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), arglist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
