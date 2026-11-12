@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.Softdistinfo
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Dropeffect
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DeviceScaleFactor
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Itemidlist
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Perceived
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Shitemid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Strret
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ShowWindowCmd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun assocCreate(clsid: Guid, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocCreate")

public actual fun assocCreateForClasses(rgclasses: ConstPtr<Associationelement>, cclasses: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocCreateForClasses")

public actual fun assocGetDetailsOfPropKey(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, pkey: ConstPtr<Propertykey>, pv: MutPtr<Variant.Variant>, pffoundpropkey: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocGetDetailsOfPropKey")

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: MutPtr<Perceived>, pflag: MutPtr<UInt>, ppsztype: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocGetPerceivedType")

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocIsDangerous")

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: MutPtr<Hkey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocQueryKeyA")

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: MutPtr<Hkey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocQueryKeyW")

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocQueryStringA")

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocQueryStringByKeyA")

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocQueryStringByKeyW")

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellAssocQueryStringW")

public actual fun cdefFolderMenuCreate2(pidlfolder: ConstPtr<Itemidlist>, hwnd: Hwnd, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, psf: MutPtr<CVoid>, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: ConstPtr<Hkey>, ppcm: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellCdefFolderMenuCreate2")

public actual fun cidldataCreateFromIdarray(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, ppdtobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellCidldataCreateFromIdarray")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellChrCmpIA")
private external fun wasiWindowssysWindowsWin32UiShellChrCmpIA(w1: Int, w2: Int): Int

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    wasiWindowssysWindowsWin32UiShellChrCmpIA(w1.toInt(), w2.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellChrCmpIW")
private external fun wasiWindowssysWindowsWin32UiShellChrCmpIW(w1: Int, w2: Int): Int

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    wasiWindowssysWindowsWin32UiShellChrCmpIW(w1.toInt(), w2.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellColorAdjustLuma")
private external fun wasiWindowssysWindowsWin32UiShellColorAdjustLuma(clrrgb: Int, n: Int, fscale: Int): Int

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    wasiWindowssysWindowsWin32UiShellColorAdjustLuma(clrrgb.toInt(), n, fscale).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellColorHLSToRGB")
private external fun wasiWindowssysWindowsWin32UiShellColorHLSToRGB(whue: Int, wluminance: Int, wsaturation: Int): Int

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    wasiWindowssysWindowsWin32UiShellColorHLSToRGB(whue.toInt(), wluminance.toInt(), wsaturation.toInt()).toUInt()

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: MutPtr<UShort>, pwluminance: MutPtr<UShort>, pwsaturation: MutPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellColorRGBToHLS")

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: MutPtr<Int>): MutPtr<Pwstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellCommandLineToArgvW")

public actual fun connectToConnectionPoint(punk: MutPtr<CVoid>, riidevent: ConstPtr<Guid>, fconnect: Bool, punktarget: MutPtr<CVoid>, pdwcookie: MutPtr<UInt>, ppcpout: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellConnectToConnectionPoint")

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellCreateProfile")

public actual fun dadAutoScroll(hwnd: Hwnd, pad: MutPtr<AutoScrollData>, pptnow: ConstPtr<Point>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDadAutoScroll")

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDadDragEnterEx")

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDadDragEnterEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellDadDragLeave")
private external fun wasiWindowssysWindowsWin32UiShellDadDragLeave(): Int

public actual fun dadDragLeave(): Bool =
    wasiWindowssysWindowsWin32UiShellDadDragLeave()

public actual fun dadDragMove(pt: Point): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDadDragMove")

public actual fun dadSetDragImage(him: Himagelist, pptoffset: MutPtr<Point>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDadSetDragImage")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellDadShowDragImage")
private external fun wasiWindowssysWindowsWin32UiShellDadShowDragImage(fshow: Int): Int

public actual fun dadShowDragImage(fshow: Bool): Bool =
    wasiWindowssysWindowsWin32UiShellDadShowDragImage(fshow)

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDefSubclassProc")

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDeleteProfileA")

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDeleteProfileW")

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDoEnvironmentSubstA")

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDoEnvironmentSubstW")

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDragAcceptFiles")

public actual fun dragFinish(hdrop: Hdrop): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDragFinish")

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDragQueryFileA")

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDragQueryFileW")

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: MutPtr<Point>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDragQueryPoint")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellDriveType")
private external fun wasiWindowssysWindowsWin32UiShellDriveType(idrive: Int): Int

public actual fun driveType(idrive: Int): Int =
    wasiWindowssysWindowsWin32UiShellDriveType(idrive)

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellDuplicateIcon")

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: MutPtr<UShort>): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractAssociatedIconA")

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: MutPtr<UShort>, piiconid: MutPtr<UShort>): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractAssociatedIconExA")

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: MutPtr<UShort>, piiconid: MutPtr<UShort>): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractAssociatedIconExW")

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: MutPtr<UShort>): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractAssociatedIconW")

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractIconA")

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, nicons: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractIconExA")

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, nicons: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractIconExW")

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellExtractIconW")

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellFindExecutableA")

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellFindExecutableW")

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetAcceptLanguagesA")

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetAcceptLanguagesW")

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA")

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW")

public actual fun getCurrentProcessExplicitAppUserModelID(appid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID")

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA")

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellGetDpiForShellUIComponent")
private external fun wasiWindowssysWindowsWin32UiShellGetDpiForShellUIComponent(param0: Int): Int

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    wasiWindowssysWindowsWin32UiShellGetDpiForShellUIComponent(param0).toUInt()

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetFileNameFromBrowse")

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetMenuContextHelpId")

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetMenuPosFromID")

public actual fun getProfileType(dwflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetProfileType")

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetProfilesDirectoryA")

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetProfilesDirectoryW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellGetScaleFactorForDevice")
private external fun wasiWindowssysWindowsWin32UiShellGetScaleFactorForDevice(devicetype: Int): Int

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    wasiWindowssysWindowsWin32UiShellGetScaleFactorForDevice(devicetype)

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: MutPtr<DeviceScaleFactor>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetScaleFactorForMonitor")

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetUserProfileDirectoryA")

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetUserProfileDirectoryW")

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetWindowContextHelpId")

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellGetWindowSubclass")

public actual fun hmonitorUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmonitor>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserFree")

public actual fun hmonitorUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmonitor>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserFree64")

public actual fun hmonitorUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmonitor>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserMarshal")

public actual fun hmonitorUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmonitor>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserMarshal64")

public actual fun hmonitorUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmonitor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserSize")

public actual fun hmonitorUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmonitor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserSize64")

public actual fun hmonitorUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmonitor>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserUnmarshal")

public actual fun hmonitorUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmonitor>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHmonitorUserUnmarshal64")

public actual fun hashData(pbdata: ConstPtr<UByte>, cbdata: UInt, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHashData")

public actual fun hlinkClone(pihl: MutPtr<CVoid>, riid: ConstPtr<Guid>, pihlsiteforclone: MutPtr<CVoid>, dwsitedata: UInt, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkClone")

public actual fun hlinkCreateBrowseContext(piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateBrowseContext")

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateExtensionServices")

public actual fun hlinkCreateFromData(pidataobj: MutPtr<CVoid>, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateFromData")

public actual fun hlinkCreateFromMoniker(pimktrgt: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateFromMoniker")

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateFromString")

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: MutPtr<CVoid>, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateShortcut")

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker")

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkCreateShortcutFromString")

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkGetSpecialReference")

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkGetValueFromParams")

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkIsShortcut")

public actual fun hlinkNavigate(pihl: MutPtr<CVoid>, pihlframe: MutPtr<CVoid>, grfhlnf: UInt, pbc: MutPtr<CVoid>, pibsc: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkNavigate")

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, pihlframe: MutPtr<CVoid>, grfhlnf: UInt, pibc: MutPtr<CVoid>, pibsc: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkNavigateToStringReference")

public actual fun hlinkOnNavigate(pihlframe: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>, grfhlnf: UInt, pimktarget: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkOnNavigate")

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: MutPtr<CVoid>, pimkold: MutPtr<CVoid>, pimknew: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkOnRenameDocument")

public actual fun hlinkParseDisplayName(pibc: MutPtr<CVoid>, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: MutPtr<UInt>, ppimk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkParseDisplayName")

public actual fun hlinkPreprocessMoniker(pibc: MutPtr<CVoid>, pimkin: MutPtr<CVoid>, ppimkout: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkPreprocessMoniker")

public actual fun hlinkQueryCreateFromData(pidataobj: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkQueryCreateFromData")

public actual fun hlinkResolveMonikerForData(pimkreference: MutPtr<CVoid>, reserved: UInt, pibc: MutPtr<CVoid>, cfmtetc: UInt, rgfmtetc: MutPtr<Formatetc>, pibsc: MutPtr<CVoid>, pimkbase: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkResolveMonikerForData")

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkResolveShortcut")

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: MutPtr<MutPtr<CVoid>>, ppwzlocation: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker")

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: MutPtr<Pwstr>, ppwzlocation: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkResolveShortcutToString")

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: MutPtr<CVoid>, cfmtetc: UInt, rgfmtetc: MutPtr<Formatetc>, pibsc: MutPtr<CVoid>, pimkbase: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkResolveStringForData")

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkSetSpecialReference")

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkTranslateURL")

public actual fun hlinkUpdateStackItem(pihlframe: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>, uhlid: UInt, pimktrgt: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellHlinkUpdateStackItem")

public actual fun iLAppendID(pidl: ConstPtr<Itemidlist>, pmkid: ConstPtr<Shitemid>, fappend: Bool): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILAppendID")

public actual fun iLClone(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILClone")

public actual fun iLCloneFirst(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILCloneFirst")

public actual fun iLCombine(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILCombine")

public actual fun iLCreateFromPathA(pszpath: Pcstr): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILCreateFromPathA")

public actual fun iLCreateFromPathW(pszpath: Pcwstr): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILCreateFromPathW")

public actual fun iLFindChild(pidlparent: ConstPtr<Itemidlist>, pidlchild: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILFindChild")

public actual fun iLFindLastID(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILFindLastID")

public actual fun iLFree(pidl: ConstPtr<Itemidlist>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILFree")

public actual fun iLGetNext(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILGetNext")

public actual fun iLGetSize(pidl: ConstPtr<Itemidlist>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILGetSize")

public actual fun iLIsEqual(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILIsEqual")

public actual fun iLIsParent(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>, fimmediate: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILIsParent")

public actual fun iLLoadFromStreamEx(pstm: MutPtr<CVoid>, pidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILLoadFromStreamEx")

public actual fun iLRemoveLastID(pidl: MutPtr<Itemidlist>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILRemoveLastID")

public actual fun iLSaveToStream(pstm: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellILSaveToStream")

public actual fun istreamCopy(pstmfrom: MutPtr<CVoid>, pstmto: MutPtr<CVoid>, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamCopy")

public actual fun istreamRead(pstm: MutPtr<CVoid>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamRead")

public actual fun istreamReadPidl(pstm: MutPtr<CVoid>, ppidlout: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamReadPidl")

public actual fun istreamReadStr(pstm: MutPtr<CVoid>, ppsz: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamReadStr")

public actual fun istreamReset(pstm: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamReset")

public actual fun istreamSize(pstm: MutPtr<CVoid>, pui: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamSize")

public actual fun istreamWrite(pstm: MutPtr<CVoid>, pv: ConstPtr<CVoid>, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamWrite")

public actual fun istreamWritePidl(pstm: MutPtr<CVoid>, pidlwrite: ConstPtr<Itemidlist>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamWritePidl")

public actual fun istreamWriteStr(pstm: MutPtr<CVoid>, psz: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIstreamWriteStr")

public actual fun iunknownAtomicRelease(ppunk: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIunknownAtomicRelease")

public actual fun iunknownGetSite(punk: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIunknownGetSite")

public actual fun iunknownGetWindow(punk: MutPtr<CVoid>, phwnd: MutPtr<Hwnd>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIunknownGetWindow")

public actual fun iunknownQueryService(punk: MutPtr<CVoid>, guidservice: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppvout: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIunknownQueryService")

public actual fun iunknownSet(ppunk: MutPtr<MutPtr<CVoid>>, punk: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIunknownSet")

public actual fun iunknownSetSite(punk: MutPtr<CVoid>, punksite: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIunknownSetSite")

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: MutPtr<Bool>, pfparsepersiterules: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellImportPrivacySettings")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellInitNetworkAddressControl")
private external fun wasiWindowssysWindowsWin32UiShellInitNetworkAddressControl(): Int

public actual fun initNetworkAddressControl(): Bool =
    wasiWindowssysWindowsWin32UiShellInitNetworkAddressControl()

public actual fun initPropVariantFromStrRet(pstrret: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellInitPropVariantFromStrRet")

public actual fun initVariantFromStrRet(pstrret: ConstPtr<Strret>, pidl: ConstPtr<Itemidlist>, pvar: MutPtr<Variant.Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellInitVariantFromStrRet")

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIntlStrEqWorkerA")

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIntlStrEqWorkerW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellIsCharSpaceA")
private external fun wasiWindowssysWindowsWin32UiShellIsCharSpaceA(wch: Int): Int

public actual fun isCharSpaceA(wch: Byte): Bool =
    wasiWindowssysWindowsWin32UiShellIsCharSpaceA(wch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellIsCharSpaceW")
private external fun wasiWindowssysWindowsWin32UiShellIsCharSpaceW(wch: Int): Int

public actual fun isCharSpaceW(wch: UShort): Bool =
    wasiWindowssysWindowsWin32UiShellIsCharSpaceW(wch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellIsInternetESCEnabled")
private external fun wasiWindowssysWindowsWin32UiShellIsInternetESCEnabled(): Int

public actual fun isInternetESCEnabled(): Bool =
    wasiWindowssysWindowsWin32UiShellIsInternetESCEnabled()

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIsLFNDriveA")

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellIsLFNDriveW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellIsNetDrive")
private external fun wasiWindowssysWindowsWin32UiShellIsNetDrive(idrive: Int): Int

public actual fun isNetDrive(idrive: Int): Int =
    wasiWindowssysWindowsWin32UiShellIsNetDrive(idrive)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellIsOS")
private external fun wasiWindowssysWindowsWin32UiShellIsOS(dwos: Int): Int

public actual fun isOS(dwos: OS): Bool =
    wasiWindowssysWindowsWin32UiShellIsOS(dwos.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellIsUserAnAdmin")
private external fun wasiWindowssysWindowsWin32UiShellIsUserAnAdmin(): Int

public actual fun isUserAnAdmin(): Bool =
    wasiWindowssysWindowsWin32UiShellIsUserAnAdmin()

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: MutPtr<Profileinfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellLoadUserProfileA")

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: MutPtr<Profileinfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellLoadUserProfileW")

public actual fun oleSaveToStreamEx(piunk: MutPtr<CVoid>, pistm: MutPtr<CVoid>, fcleardirty: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellOleSaveToStreamEx")

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellOpenRegStream")

public actual fun parseURLA(pcszurl: Pcstr, ppu: MutPtr<Parsedurla>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellParseURLA")

public actual fun parseURLW(pcszurl: Pcwstr, ppu: MutPtr<Parsedurlw>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellParseURLW")

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAddBackslashA")

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAddBackslashW")

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAddExtensionA")

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAddExtensionW")

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAllocCanonicalize")

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAllocCombine")

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAppendA")

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathAppendW")

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathBuildRootA")

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathBuildRootW")

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCanonicalizeA")

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCanonicalizeW")

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchAddBackslash")

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr<Pwstr>, pcchremaining: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchAddBackslashEx")

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchAddExtension")

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchAppend")

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchAppendEx")

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchCanonicalize")

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchCanonicalizeEx")

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchCombine")

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchCombineEx")

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: MutPtr<Pcwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchFindExtension")

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchIsRoot")

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchRemoveBackslash")

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr<Pwstr>, pcchremaining: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchRemoveBackslashEx")

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchRemoveExtension")

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchRemoveFileSpec")

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchRenameExtension")

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: MutPtr<Pcwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchSkipRoot")

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchStripPrefix")

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCchStripToRoot")

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCleanupSpec")

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCombineA")

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCombineW")

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCommonPrefixA")

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCommonPrefixW")

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCompactPathA")

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCompactPathExA")

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCompactPathExW")

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCompactPathW")

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCreateFromUrlA")

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: MutPtr<Pwstr>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCreateFromUrlAlloc")

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathCreateFromUrlW")

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFileExistsA")

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFileExistsW")

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindExtensionA")

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindExtensionW")

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindFileNameA")

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindFileNameW")

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindNextComponentA")

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindNextComponentW")

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: ConstPtr<ConstPtr<Byte>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindOnPathA")

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: ConstPtr<ConstPtr<UShort>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindOnPathW")

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: ConstPtr<Pcstr>, iarraysize: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindSuffixArrayA")

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: ConstPtr<Pcwstr>, iarraysize: Int): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathFindSuffixArrayW")

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathGetArgsA")

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathGetArgsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellPathGetCharTypeA")
private external fun wasiWindowssysWindowsWin32UiShellPathGetCharTypeA(ch: Int): Int

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    wasiWindowssysWindowsWin32UiShellPathGetCharTypeA(ch.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellPathGetCharTypeW")
private external fun wasiWindowssysWindowsWin32UiShellPathGetCharTypeW(ch: Int): Int

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    wasiWindowssysWindowsWin32UiShellPathGetCharTypeW(ch.toInt()).toUInt()

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathGetDriveNumberA")

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathGetDriveNumberW")

public actual fun pathGetShortPath(pszlongpath: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathGetShortPath")

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsContentTypeA")

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsContentTypeW")

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsDirectoryA")

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsDirectoryEmptyA")

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsDirectoryEmptyW")

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsDirectoryW")

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsExe")

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsFileSpecA")

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsFileSpecW")

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsLFNFileSpecA")

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsLFNFileSpecW")

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsNetworkPathA")

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsNetworkPathW")

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsPrefixA")

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsPrefixW")

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsRelativeA")

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsRelativeW")

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsRootA")

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsRootW")

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsSameRootA")

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsSameRootW")

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsSlowA")

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsSlowW")

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsSystemFolderA")

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsSystemFolderW")

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCA")

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: MutPtr<Pcwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCEx")

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCServerA")

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCServerShareA")

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCServerShareW")

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCServerW")

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsUNCW")

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsURLA")

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathIsURLW")

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMakePrettyA")

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMakePrettyW")

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMakeSystemFolderA")

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMakeSystemFolderW")

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMakeUniqueName")

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMatchSpecA")

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMatchSpecExA")

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMatchSpecExW")

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathMatchSpecW")

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathParseIconLocationA")

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathParseIconLocationW")

public actual fun pathQualify(psz: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathQualify")

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathQuoteSpacesA")

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathQuoteSpacesW")

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRelativePathToA")

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRelativePathToW")

public actual fun pathRemoveArgsA(pszpath: Pstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveArgsA")

public actual fun pathRemoveArgsW(pszpath: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveArgsW")

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveBackslashA")

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveBackslashW")

public actual fun pathRemoveBlanksA(pszpath: Pstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveBlanksA")

public actual fun pathRemoveBlanksW(pszpath: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveBlanksW")

public actual fun pathRemoveExtensionA(pszpath: Pstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveExtensionA")

public actual fun pathRemoveExtensionW(pszpath: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveExtensionW")

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveFileSpecA")

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRemoveFileSpecW")

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRenameExtensionA")

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathRenameExtensionW")

public actual fun pathResolve(pszpath: Pwstr, dirs: ConstPtr<ConstPtr<UShort>>, fflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathResolve")

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathSearchAndQualifyA")

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathSearchAndQualifyW")

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathSetDlgItemPathA")

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathSetDlgItemPathW")

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathSkipRootA")

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathSkipRootW")

public actual fun pathStripPathA(pszpath: Pstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathStripPathA")

public actual fun pathStripPathW(pszpath: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathStripPathW")

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathStripToRootA")

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathStripToRootW")

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUnExpandEnvStringsA")

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUnExpandEnvStringsW")

public actual fun pathUndecorateA(pszpath: Pstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUndecorateA")

public actual fun pathUndecorateW(pszpath: Pwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUndecorateW")

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUnmakeSystemFolderA")

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUnmakeSystemFolderW")

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUnquoteSpacesA")

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathUnquoteSpacesW")

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName")

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPickIconDlg")

public actual fun propVariantToStrRet(propvar: ConstPtr<Propvariant>, pstrret: MutPtr<Strret>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropVariantToStrRet")

public actual fun qISearch(that: MutPtr<CVoid>, pqit: ConstPtr<Qitab>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellQISearch")

public actual fun readCabinetState(pcs: MutPtr<Cabinetstate>, clength: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellReadCabinetState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellRealDriveType")
private external fun wasiWindowssysWindowsWin32UiShellRealDriveType(idrive: Int, foktohitnet: Int): Int

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    wasiWindowssysWindowsWin32UiShellRealDriveType(idrive, foktohitnet)

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: ConstPtr<CVoid>, registration: MutPtr<PappconstrainRegistration>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification")

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: ConstPtr<CVoid>, registration: MutPtr<PappstateRegistration>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRegisterAppStateChangeNotification")

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRegisterScaleChangeEvent")

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRegisterScaleChangeNotifications")

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRemoveWindowSubclass")

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRestartDialog")

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellRestartDialogEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellRevokeScaleChangeNotifications")
private external fun wasiWindowssysWindowsWin32UiShellRevokeScaleChangeNotifications(displaydevice: Int, dwcookie: Int): Int

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    wasiWindowssysWindowsWin32UiShellRevokeScaleChangeNotifications(displaydevice, dwcookie.toInt())

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAddFromPropSheetExtArray")

public actual fun sHAddToRecentDocs(uflags: UInt, pv: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAddToRecentDocs")

public actual fun sHAlloc(cb: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAlloc")

public actual fun sHAllocShared(pvdata: ConstPtr<CVoid>, dwsize: UInt, dwprocessid: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAllocShared")

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAnsiToAnsi")

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAnsiToUnicode")

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: MutPtr<Appbardata>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAppBarMessage")

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAssocEnumHandlers")

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: ConstPtr<Guid>, enumhandlers: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication")

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHAutoComplete")

public actual fun sHBindToFolderIDListParent(psfroot: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHBindToFolderIDListParent")

public actual fun sHBindToFolderIDListParentEx(psfroot: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, ppbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHBindToFolderIDListParentEx")

public actual fun sHBindToObject(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHBindToObject")

public actual fun sHBindToParent(pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHBindToParent")

public actual fun sHBrowseForFolderA(lpbi: ConstPtr<Browseinfoa>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHBrowseForFolderA")

public actual fun sHBrowseForFolderW(lpbi: ConstPtr<Browseinfow>): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHBrowseForFolderW")

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCLSIDFromString")

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: MutPtr<MutPtr<MutPtr<Itemidlist>>>, plevent: MutPtr<Int>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShchangeNotificationLock")

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShchangeNotificationUnlock")

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: ConstPtr<CVoid>, dwitem2: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHChangeNotify")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHChangeNotifyDeregister")
private external fun wasiWindowssysWindowsWin32UiShellSHChangeNotifyDeregister(ulid: Int): Int

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    wasiWindowssysWindowsWin32UiShellSHChangeNotifyDeregister(ulid.toInt())

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: ConstPtr<SHChangeNotifyEntry>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHChangeNotifyRegister")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHChangeNotifyRegisterThread")
private external fun wasiWindowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(status: Int): Unit

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus): Unit =
    wasiWindowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(status)

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCloneSpecialIDList")

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCoCreateInstance")

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCopyKeyA")

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCopyKeyW")

public actual fun sHCreateAssociationRegistration(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateAssociationRegistration")

public actual fun sHCreateDataObject(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, pdtinner: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDataObject")

public actual fun sHCreateDefaultContextMenu(pdcm: ConstPtr<Defcontextmenu>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDefaultContextMenu")

public actual fun sHCreateDefaultExtractIcon(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDefaultExtractIcon")

public actual fun sHCreateDefaultPropertiesOp(psi: MutPtr<CVoid>, ppfileop: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp")

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDirectory")

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: ConstPtr<SecurityAttributes>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDirectoryExA")

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: ConstPtr<SecurityAttributes>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateDirectoryExW")

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateFileExtractIconW")

public actual fun sHCreateItemFromIDList(pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateItemFromIDList")

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateItemFromParsingName")

public actual fun sHCreateItemFromRelativeName(psiparent: MutPtr<CVoid>, pszname: Pcwstr, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateItemFromRelativeName")

public actual fun sHCreateItemInKnownFolder(kfid: ConstPtr<Guid>, dwkfflags: UInt, pszitem: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateItemInKnownFolder")

public actual fun sHCreateItemWithParent(pidlparent: ConstPtr<Itemidlist>, psfparent: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppvitem: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateItemWithParent")

public actual fun sHCreateMemStream(pinit: ConstPtr<UByte>, cbinit: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateMemStream")

public actual fun sHCreateProcessAsUserW(pscpi: MutPtr<Shcreateprocessinfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateProcessAsUserW")

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreatePropSheetExtArray")

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker")

public actual fun sHCreateShellFolderView(pcsfv: ConstPtr<SfvCreate>, ppsv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellFolderView")

public actual fun sHCreateShellFolderViewEx(pcsfv: ConstPtr<Csfv>, ppsv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellFolderViewEx")

public actual fun sHCreateShellItem(pidlparent: ConstPtr<Itemidlist>, psfparent: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, ppsi: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellItem")

public actual fun sHCreateShellItemArray(pidlparent: ConstPtr<Itemidlist>, psf: MutPtr<CVoid>, cidl: UInt, ppidl: ConstPtr<ConstPtr<Itemidlist>>, ppsiitemarray: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellItemArray")

public actual fun sHCreateShellItemArrayFromDataObject(pdo: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject")

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: ConstPtr<ConstPtr<Itemidlist>>, ppsiitemarray: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists")

public actual fun sHCreateShellItemArrayFromShellItem(psi: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem")

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateShellPalette")

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: ConstPtr<Formatetc>, ppenumformatetc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc")

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateStreamOnFileA")

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateStreamOnFileEx")

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateStreamOnFileW")

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr<CVoid>, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateThread")

public actual fun sHCreateThreadRef(pcref: MutPtr<Int>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateThreadRef")

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr<CVoid>, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHCreateThreadWithHandle")

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, niconsize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDefExtractIconA")

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, niconsize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDefExtractIconW")

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDeleteEmptyKeyA")

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDeleteEmptyKeyW")

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDeleteKeyA")

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDeleteKeyW")

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDeleteValueA")

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDeleteValueW")

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDestroyPropSheetExtArray")

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: MutPtr<CVoid>, pdsrc: MutPtr<CVoid>, dweffect: Dropeffect, pdweffect: MutPtr<Dropeffect>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHDoDragDrop")

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEmptyRecycleBinA")

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEmptyRecycleBinW")

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEnumKeyExA")

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEnumKeyExW")

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEnumValueA")

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEnumValueW")

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW")

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: MutPtr<Pwstr>, ppszcommandline: MutPtr<Pwstr>, ppszparameters: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate")

public actual fun sHFileOperationA(lpfileop: MutPtr<Shfileopstructa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFileOperationA")

public actual fun sHFileOperationW(lpfileop: MutPtr<Shfileopstructw>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFileOperationW")

public actual fun sHFindFiles(pidlfolder: ConstPtr<Itemidlist>, pidlsavefile: ConstPtr<Itemidlist>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFindFiles")

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShfindInitMenuPopup")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHFlushSFCache")
private external fun wasiWindowssysWindowsWin32UiShellSHFlushSFCache(): Unit

public actual fun sHFlushSFCache(): Unit =
    wasiWindowssysWindowsWin32UiShellSHFlushSFCache()

public actual fun sHFormatDateTimeA(pft: ConstPtr<Filetime>, pdwflags: MutPtr<UInt>, pszbuf: Pstr, cchbuf: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFormatDateTimeA")

public actual fun sHFormatDateTimeW(pft: ConstPtr<Filetime>, pdwflags: MutPtr<UInt>, pszbuf: Pwstr, cchbuf: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFormatDateTimeW")

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFormatDrive")

public actual fun sHFree(pv: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFree")

public actual fun sHFreeNameMappings(hnamemappings: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFreeNameMappings")

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHFreeShared")

public actual fun sHGetAttributesFromDataObject(pdo: MutPtr<CVoid>, dwattributemask: UInt, pdwattributes: MutPtr<UInt>, pcitems: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetAttributesFromDataObject")

public actual fun sHGetDataFromIDListA(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, nformat: ShgdfilFormat, pv: MutPtr<CVoid>, cb: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetDataFromIDListA")

public actual fun sHGetDataFromIDListW(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, nformat: ShgdfilFormat, pv: MutPtr<CVoid>, cb: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetDataFromIDListW")

public actual fun sHGetDesktopFolder(ppshf: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetDesktopFolder")

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: MutPtr<ULong>, pultotalnumberofbytes: MutPtr<ULong>, pultotalnumberoffreebytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA")

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: MutPtr<ULong>, pultotalnumberofbytes: MutPtr<ULong>, pultotalnumberoffreebytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW")

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetDriveMedia")

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr<Shfileinfoa>, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFileInfoA")

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr<Shfileinfow>, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFileInfoW")

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFolderLocation")

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFolderPathA")

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA")

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW")

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetFolderPathW")

public actual fun sHGetIDListFromObject(punk: MutPtr<CVoid>, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetIDListFromObject")

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetIconOverlayIndexA")

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetIconOverlayIndexW")

public actual fun sHGetImageList(iimagelist: Int, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetImageList")

public actual fun sHGetInstanceExplorer(ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetInstanceExplorer")

public actual fun sHGetInverseCMAP(pbmap: MutPtr<UByte>, cbmap: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetInverseCMAP")

public actual fun sHGetItemFromDataObject(pdtobj: MutPtr<CVoid>, dwflags: DataobjGetItemFlags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetItemFromDataObject")

public actual fun sHGetItemFromObject(punk: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetItemFromObject")

public actual fun sHGetKnownFolderIDList(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetKnownFolderIDList")

public actual fun sHGetKnownFolderItem(rfid: ConstPtr<Guid>, flags: KnownFolderFlag, htoken: Handle, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetKnownFolderItem")

public actual fun sHGetKnownFolderPath(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, ppszpath: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetKnownFolderPath")

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetLocalizedName")

public actual fun sHGetMalloc(ppmalloc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetMalloc")

public actual fun sHGetNameFromIDList(pidl: ConstPtr<Itemidlist>, sigdnname: Sigdn, ppszname: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetNameFromIDList")

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: MutPtr<Bool>, uflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetNewLinkInfoA")

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: MutPtr<Bool>, uflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetNewLinkInfoW")

public actual fun sHGetPathFromIDListA(pidl: ConstPtr<Itemidlist>, pszpath: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetPathFromIDListA")

public actual fun sHGetPathFromIDListEx(pidl: ConstPtr<Itemidlist>, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetPathFromIDListEx")

public actual fun sHGetPathFromIDListW(pidl: ConstPtr<Itemidlist>, pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetPathFromIDListW")

public actual fun sHGetRealIDL(psf: MutPtr<CVoid>, pidlsimple: ConstPtr<Itemidlist>, ppidlreal: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetRealIDL")

public actual fun sHGetSetFolderCustomSettings(pfcs: MutPtr<Shfoldercustomsettings>, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetSetFolderCustomSettings")

public actual fun sHGetSetSettings(lpss: MutPtr<Shellstatea>, dwmask: SsfMask, bset: Bool): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetSetSettings")

public actual fun sHGetSettings(psfs: MutPtr<Shellflagstate>, dwmask: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetSettings")

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetSpecialFolderLocation")

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetSpecialFolderPathA")

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetSpecialFolderPathW")

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: MutPtr<Shstockiconinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetStockIconInfo")

public actual fun sHGetTemporaryPropertyForItem(psi: MutPtr<CVoid>, propkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem")

public actual fun sHGetThreadRef(ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetThreadRef")

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: MutPtr<UInt>, pfiletime: MutPtr<Filetime>, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetUnreadMailCountW")

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetValueA")

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetValueW")

public actual fun sHGetViewStatePropertyBag(pidl: ConstPtr<Itemidlist>, pszbagname: Pcwstr, dwflags: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHGetViewStatePropertyBag")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHGlobalCounterDecrement")
private external fun wasiWindowssysWindowsWin32UiShellSHGlobalCounterDecrement(id: Int): Int

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    wasiWindowssysWindowsWin32UiShellSHGlobalCounterDecrement(id)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHGlobalCounterGetValue")
private external fun wasiWindowssysWindowsWin32UiShellSHGlobalCounterGetValue(id: Int): Int

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    wasiWindowssysWindowsWin32UiShellSHGlobalCounterGetValue(id)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHGlobalCounterIncrement")
private external fun wasiWindowssysWindowsWin32UiShellSHGlobalCounterIncrement(id: Int): Int

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    wasiWindowssysWindowsWin32UiShellSHGlobalCounterIncrement(id)

public actual fun sHHandleUpdateImage(pidlextra: ConstPtr<Itemidlist>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHHandleUpdateImage")

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: MutPtr<MutPtr<Itemidlist>>, rgfinout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHILCreateFromPath")

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHInvokePrinterCommandA")

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHInvokePrinterCommandW")

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHIsFileAvailableOffline")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHIsLowMemoryMachine")
private external fun wasiWindowssysWindowsWin32UiShellSHIsLowMemoryMachine(dwtype: Int): Int

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    wasiWindowssysWindowsWin32UiShellSHIsLowMemoryMachine(dwtype.toInt())

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHLimitInputEdit")

public actual fun sHLoadInProc(rclsid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHLoadInProc")

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: ConstPtr<ConstPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHLoadIndirectString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers")
private external fun wasiWindowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers(): Int

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    wasiWindowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers()

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHLockShared")

public actual fun sHMapPIDLToSystemImageListIndex(pshf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, piindexsel: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex")

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHMessageBoxCheckA")

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHMessageBoxCheckW")

public actual fun sHMultiFileProperties(pdtobj: MutPtr<CVoid>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHMultiFileProperties")

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHObjectProperties")

public actual fun sHOpenFolderAndSelectItems(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenFolderAndSelectItems")

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: ConstPtr<Hkey>, ckeys: UInt, pclsiddefault: ConstPtr<Guid>, pdtobj: MutPtr<CVoid>, psb: MutPtr<CVoid>, pstartpage: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenPropSheetW")

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenRegStream2A")

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenRegStream2W")

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenRegStreamA")

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenRegStreamW")

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: ConstPtr<Openasinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHOpenWithDialog")

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: MutPtr<CVoid>, ppidl: MutPtr<MutPtr<Itemidlist>>, sfgaoin: UInt, psfgaoout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHParseDisplayName")

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: MutPtr<CVoid>, pszpath: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHPathPrepareForWriteA")

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: MutPtr<CVoid>, pszpath: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHPathPrepareForWriteW")

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryInfoKeyA")

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryInfoKeyW")

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: MutPtr<Shqueryrbinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryRecycleBinA")

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: MutPtr<Shqueryrbinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryRecycleBinW")

public actual fun sHQueryUserNotificationState(pquns: MutPtr<QueryUserNotificationState>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryUserNotificationState")

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: ConstPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryValueExA")

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: ConstPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHQueryValueExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHRegCloseUSKey")
private external fun wasiWindowssysWindowsWin32UiShellSHRegCloseUSKey(huskey: Long): Int

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    wasiWindowssysWindowsWin32UiShellSHRegCloseUSKey(huskey).toUInt()

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegCreateUSKeyA")

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegCreateUSKeyW")

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA")

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW")

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegDeleteUSValueA")

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegDeleteUSValueW")

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegDuplicateHKey")

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegEnumUSKeyA")

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegEnumUSKeyW")

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegEnumUSValueA")

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegEnumUSValueW")

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetBoolUSValueA")

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetBoolUSValueW")

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetIntW")

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetPathA")

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetPathW")

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetUSValueA")

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetUSValueW")

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetValueA")

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM")

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegGetValueW")

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, fignorehkcu: Bool): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegOpenUSKeyA")

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, fignorehkcu: Bool): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegOpenUSKeyW")

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA")

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW")

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegQueryUSValueA")

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegQueryUSValueW")

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegSetPathA")

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegSetPathW")

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegSetUSValueA")

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegSetUSValueW")

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegWriteUSValueA")

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRegWriteUSValueW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHReleaseThreadRef")
private external fun wasiWindowssysWindowsWin32UiShellSHReleaseThreadRef(): Int

public actual fun sHReleaseThreadRef(): Hresult =
    wasiWindowssysWindowsWin32UiShellSHReleaseThreadRef()

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHRemoveLocalizedName")

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHReplaceFromPropSheetExtArray")

public actual fun sHResolveLibrary(psilibrary: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHResolveLibrary")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHRestricted")
private external fun wasiWindowssysWindowsWin32UiShellSHRestricted(rest: Int): Int

public actual fun sHRestricted(rest: Restrictions): UInt =
    wasiWindowssysWindowsWin32UiShellSHRestricted(rest).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHSendMessageBroadcastA")
private external fun wasiWindowssysWindowsWin32UiShellSHSendMessageBroadcastA(umsg: Int, wparam: Long, lparam: Long): Long

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    wasiWindowssysWindowsWin32UiShellSHSendMessageBroadcastA(umsg.toInt(), wparam.toLong(), lparam)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellSHSendMessageBroadcastW")
private external fun wasiWindowssysWindowsWin32UiShellSHSendMessageBroadcastW(umsg: Int, wparam: Long, lparam: Long): Long

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    wasiWindowssysWindowsWin32UiShellSHSendMessageBroadcastW(umsg.toInt(), wparam.toLong(), lparam)

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: MutPtr<CVoid>, dwfileopflags: UInt, pfops: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetDefaultProperties")

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetFolderPathA")

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetFolderPathW")

public actual fun sHSetInstanceExplorer(punk: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetInstanceExplorer")

public actual fun sHSetKnownFolderPath(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetKnownFolderPath")

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetLocalizedName")

public actual fun sHSetTemporaryPropertyForItem(psi: MutPtr<CVoid>, propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem")

public actual fun sHSetThreadRef(punk: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetThreadRef")

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetUnreadMailCountW")

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetValueA")

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSetValueW")

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShshellFolderViewMessage")

public actual fun sHShowManageLibraryUI(psilibrary: MutPtr<CVoid>, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHShowManageLibraryUI")

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): MutPtr<Itemidlist> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSimpleIDListFromPath")

public actual fun sHSkipJunction(pbc: MutPtr<CVoid>, pclsid: ConstPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHSkipJunction")

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHStartNetConnectionDialogW")

public actual fun sHStrDupA(psz: Pcstr, ppwsz: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHStrDupA")

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHStrDupW")

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHStripMneumonicA")

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHStripMneumonicW")

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHTestTokenMembership")

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHUnicodeToAnsi")

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHUnicodeToUnicode")

public actual fun sHUnlockShared(pvdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHUnlockShared")

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHUpdateImageA")

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHUpdateImageW")

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSHValidateUNC")

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID")

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSetMenuContextHelpId")

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSetWindowContextHelpId")

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSetWindowSubclass")

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellAboutA")

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellAboutW")

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellExecuteA")

public actual fun shellExecuteExA(pexecinfo: MutPtr<Shellexecuteinfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellExecuteExA")

public actual fun shellExecuteExW(pexecinfo: MutPtr<Shellexecuteinfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellExecuteExW")

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellExecuteW")

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellMessageBoxA")

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellMessageBoxW")

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellGetCachedImageIndex")

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellGetCachedImageIndexA")

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellGetCachedImageIndexW")

public actual fun shellGetImageLists(phiml: MutPtr<Himagelist>, phimlsmall: MutPtr<Himagelist>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellGetImageLists")

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellMergeMenus")

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: ConstPtr<Notifyicondataa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellNotifyIconA")

public actual fun shellNotifyIconGetRect(identifier: ConstPtr<Notifyiconidentifier>, iconlocation: MutPtr<Rect>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellNotifyIconGetRect")

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: ConstPtr<Notifyicondataw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellShellNotifyIconW")

public actual fun signalFileOpen(pidl: ConstPtr<Itemidlist>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSignalFileOpen")

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: MutPtr<Softdistinfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellSoftwareUpdateMessageBox")

public actual fun stgMakeUniqueName(pstgparent: MutPtr<CVoid>, pszfilespec: Pcwstr, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStgMakeUniqueName")

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCSpnA")

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCSpnIA")

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCSpnIW")

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCSpnW")

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCatBuffA")

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCatBuffW")

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCatChainW")

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCatW")

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrChrA")

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrChrIA")

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrChrIW")

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrChrNIW")

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrChrNW")

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrChrW")

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpCA")

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpCW")

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpICA")

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpICW")

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpIW")

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpLogicalW")

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNA")

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNCA")

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNCW")

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNIA")

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNICA")

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNICW")

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNIW")

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpNW")

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCmpW")

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCpyNW")

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrCpyW")

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrDupA")

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrDupW")

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFormatByteSize64A")

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFormatByteSizeA")

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFormatByteSizeEx")

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFormatByteSizeW")

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFormatKBSizeA")

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFormatKBSizeW")

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFromTimeIntervalA")

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrFromTimeIntervalW")

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrIsIntlEqualA")

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrIsIntlEqualW")

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrNCatA")

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrNCatW")

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrPBrkA")

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrPBrkW")

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRChrA")

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRChrIA")

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRChrIW")

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRChrW")

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRStrIA")

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRStrIW")

public actual fun strRetToBSTR(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, pbstr: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRetToBSTR")

public actual fun strRetToBufA(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, pszbuf: Pstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRetToBufA")

public actual fun strRetToBufW(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRetToBufW")

public actual fun strRetToStrA(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppsz: MutPtr<Pstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRetToStrA")

public actual fun strRetToStrW(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppsz: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrRetToStrW")

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrSpnA")

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrSpnW")

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrStrA")

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrStrIA")

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrStrIW")

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrStrNIW")

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrStrNW")

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrStrW")

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrToInt64ExA")

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrToInt64ExW")

public actual fun strToIntA(pszsrc: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrToIntA")

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: MutPtr<Int>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrToIntExA")

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: MutPtr<Int>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrToIntExW")

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrToIntW")

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrTrimA")

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellStrTrimW")

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUnloadUserProfile")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification")
private external fun wasiWindowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(registration: Long): Unit

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration): Unit =
    wasiWindowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(registration)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellUnregisterAppStateChangeNotification")
private external fun wasiWindowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(registration: Long): Unit

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration): Unit =
    wasiWindowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(registration)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellUnregisterScaleChangeEvent")
private external fun wasiWindowssysWindowsWin32UiShellUnregisterScaleChangeEvent(dwcookie: Long): Int

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    wasiWindowssysWindowsWin32UiShellUnregisterScaleChangeEvent(dwcookie.toLong())

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlApplySchemeA")

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlApplySchemeW")

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCanonicalizeA")

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCanonicalizeW")

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCombineA")

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCombineW")

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCompareA")

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCompareW")

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCreateFromPathA")

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlCreateFromPathW")

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlEscapeA")

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlEscapeW")

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlFixupW")

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlGetLocationA")

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlGetLocationW")

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>, dwpart: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlGetPartA")

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>, dwpart: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlGetPartW")

public actual fun urlHashA(pszurl: Pcstr, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlHashA")

public actual fun urlHashW(pszurl: Pcwstr, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlHashW")

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlIsA")

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlIsNoHistoryA")

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlIsNoHistoryW")

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlIsOpaqueA")

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlIsOpaqueW")

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlIsW")

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlUnescapeA")

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellUrlUnescapeW")

public actual fun variantToStrRet(varin: ConstPtr<Variant.Variant>, pstrret: MutPtr<Strret>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellVariantToStrRet")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellWhichPlatform")
private external fun wasiWindowssysWindowsWin32UiShellWhichPlatform(): Int

public actual fun whichPlatform(): UInt =
    wasiWindowssysWindowsWin32UiShellWhichPlatform().toUInt()

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWin32DeleteFile")

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWinHelpA")

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWinHelpW")

public actual fun writeCabinetState(pcs: ConstPtr<Cabinetstate>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWriteCabinetState")

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWnsprintfA")

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWnsprintfW")

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWvnsprintfA")

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellWvnsprintfW")
