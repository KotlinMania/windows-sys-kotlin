package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMONITOR
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.system.ole.DROPEFFECT
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HIMAGELIST
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.LPFNSVADDPROPSHEETPAGE
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DEVICE_SCALE_FACTOR
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HMENU

public fun interface FnCallback {
    public operator fun invoke(psf: Long, hwnd: HWND, pdtobj: Long, umsg: UInt, wparam: WPARAM, lparam: LPARAM): HRESULT
}

public fun interface FnCallback1 {
    public operator fun invoke(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM, uidsubclass: ULong, dwrefdata: ULong): LRESULT
}

public fun interface FnCallback2 {
    public operator fun invoke(constrained: Boolean, context: Long)
}

public fun AssocCreate(clsid: GUID, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocCreate", longArrayOf(run { val buf = ByteArray(16); buf[0] = (clsid.data1.toInt() and 0xFF).toByte(); buf[1] = ((clsid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((clsid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((clsid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (clsid.data2.toInt() and 0xFF).toByte(); buf[5] = ((clsid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (clsid.data3.toInt() and 0xFF).toByte(); buf[7] = ((clsid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, clsid.data4.size)) buf[8 + i] = clsid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, riid, ppv)).toInt()
}

public fun AssocCreateForClasses(rgclasses: Long, cclasses: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "AssocCreateForClasses", longArrayOf(rgclasses, cclasses.toLong(), riid, ppv)).toInt()
}

public fun AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "AssocGetDetailsOfPropKey", longArrayOf(psf, pidl, pkey, pv, pffoundpropkey)).toInt()
}

public fun AssocGetPerceivedType(pszext: PCWSTR, ptype: Long, pflag: Long, ppsztype: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocGetPerceivedType", longArrayOf(pszext, ptype, pflag, ppsztype)).toInt()
}

public fun AssocIsDangerous(pszassoc: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocIsDangerous", longArrayOf(pszassoc)).toInt()
}

public fun AssocQueryKeyA(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCSTR, pszextra: PCSTR, phkeyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocQueryKeyA", longArrayOf(flags.toLong(), key.toLong(), pszassoc, pszextra, phkeyout)).toInt()
}

public fun AssocQueryKeyW(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCWSTR, pszextra: PCWSTR, phkeyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocQueryKeyW", longArrayOf(flags.toLong(), key.toLong(), pszassoc, pszextra, phkeyout)).toInt()
}

public fun AssocQueryStringA(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCSTR, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocQueryStringA", longArrayOf(flags.toLong(), str.toLong(), pszassoc, pszextra, pszout, pcchout)).toInt()
}

public fun AssocQueryStringByKeyA(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocQueryStringByKeyA", longArrayOf(flags.toLong(), str.toLong(), hkassoc, pszextra, pszout, pcchout)).toInt()
}

public fun AssocQueryStringByKeyW(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocQueryStringByKeyW", longArrayOf(flags.toLong(), str.toLong(), hkassoc, pszextra, pszout, pcchout)).toInt()
}

public fun AssocQueryStringW(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCWSTR, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "AssocQueryStringW", longArrayOf(flags.toLong(), str.toLong(), pszassoc, pszextra, pszout, pcchout)).toInt()
}

public fun CDefFolderMenu_Create2(pidlfolder: Long, hwnd: HWND, cidl: UInt, apidl: Long, psf: Long, pfn: LPFNDFMCALLBACK, nkeys: UInt, ahkeys: Long, ppcm: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "CDefFolderMenu_Create2", longArrayOf(pidlfolder, hwnd, cidl.toLong(), apidl, psf, Win32DynamicFfi.objectSlot(pfn), nkeys.toLong(), ahkeys, ppcm)).toInt()
}

public fun CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: UInt, apidl: Long, ppdtobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "CIDLData_CreateFromIDArray", longArrayOf(pidlfolder, cidl.toLong(), apidl, ppdtobj)).toInt()
}

public fun ChrCmpIA(w1: UShort, w2: UShort): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ChrCmpIA", longArrayOf(w1.toLong(), w2.toLong())).toInt()
}

public fun ChrCmpIW(w1: UShort, w2: UShort): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ChrCmpIW", longArrayOf(w1.toLong(), w2.toLong())).toInt()
}

public fun ColorAdjustLuma(clrrgb: COLORREF, n: Int, fscale: BOOL): COLORREF {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ColorAdjustLuma", longArrayOf(clrrgb.toLong(), n.toLong(), fscale.toLong())).toUInt()
}

public fun ColorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): COLORREF {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ColorHLSToRGB", longArrayOf(whue.toLong(), wluminance.toLong(), wsaturation.toLong())).toUInt()
}

public fun ColorRGBToHLS(clrrgb: COLORREF, pwhue: Long, pwluminance: Long, pwsaturation: Long) {
    Win32DynamicFfi.invoke("shlwapi.dll", "ColorRGBToHLS", longArrayOf(clrrgb.toLong(), pwhue, pwluminance, pwsaturation))
}

public fun CommandLineToArgvW(lpcmdline: PCWSTR, pnumargs: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "CommandLineToArgvW", longArrayOf(lpcmdline, pnumargs))
}

public fun ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: BOOL, punktarget: Long, pdwcookie: Long, ppcpout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ConnectToConnectionPoint", longArrayOf(punk, riidevent, fconnect.toLong(), punktarget, pdwcookie, ppcpout)).toInt()
}

public fun CreateProfile(pszusersid: PCWSTR, pszusername: PCWSTR, pszprofilepath: PWSTR, cchprofilepath: UInt): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "CreateProfile", longArrayOf(pszusersid, pszusername, pszprofilepath, cchprofilepath.toLong())).toInt()
}

public fun DAD_AutoScroll(hwnd: HWND, pad: Long, pptnow: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_AutoScroll", longArrayOf(hwnd, pad, pptnow)).toInt()
}

public fun DAD_DragEnterEx(hwndtarget: HWND, ptstart: POINT): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_DragEnterEx", longArrayOf(hwndtarget, ((ptstart.x.toLong() and 0xFFFF_FFFFL) or ((ptstart.y.toLong() and 0xFFFF_FFFFL) shl 32)))).toInt()
}

public fun DAD_DragEnterEx2(hwndtarget: HWND, ptstart: POINT, pdtobject: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_DragEnterEx2", longArrayOf(hwndtarget, ((ptstart.x.toLong() and 0xFFFF_FFFFL) or ((ptstart.y.toLong() and 0xFFFF_FFFFL) shl 32)), pdtobject)).toInt()
}

public fun DAD_DragLeave(): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_DragLeave", longArrayOf()).toInt()
}

public fun DAD_DragMove(pt: POINT): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_DragMove", longArrayOf(((pt.x.toLong() and 0xFFFF_FFFFL) or ((pt.y.toLong() and 0xFFFF_FFFFL) shl 32)))).toInt()
}

public fun DAD_SetDragImage(him: HIMAGELIST, pptoffset: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_SetDragImage", longArrayOf(him, pptoffset)).toInt()
}

public fun DAD_ShowDragImage(fshow: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DAD_ShowDragImage", longArrayOf(fshow.toLong())).toInt()
}

public fun DefSubclassProc(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "DefSubclassProc", longArrayOf(hwnd, umsg.toLong(), wparam.toLong(), lparam))
}

public fun DeleteProfileA(lpsidstring: PCSTR, lpprofilepath: PCSTR, lpcomputername: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "DeleteProfileA", longArrayOf(lpsidstring, lpprofilepath, lpcomputername)).toInt()
}

public fun DeleteProfileW(lpsidstring: PCWSTR, lpprofilepath: PCWSTR, lpcomputername: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "DeleteProfileW", longArrayOf(lpsidstring, lpprofilepath, lpcomputername)).toInt()
}

public fun DoEnvironmentSubstA(pszsrc: PSTR, cchsrc: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "DoEnvironmentSubstA", longArrayOf(pszsrc, cchsrc.toLong())).toUInt()
}

public fun DoEnvironmentSubstW(pszsrc: PWSTR, cchsrc: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "DoEnvironmentSubstW", longArrayOf(pszsrc, cchsrc.toLong())).toUInt()
}

public fun DragAcceptFiles(hwnd: HWND, faccept: BOOL) {
    Win32DynamicFfi.invoke("shell32.dll", "DragAcceptFiles", longArrayOf(hwnd, faccept.toLong()))
}

public fun DragFinish(hdrop: HDROP) {
    Win32DynamicFfi.invoke("shell32.dll", "DragFinish", longArrayOf(hdrop))
}

public fun DragQueryFileA(hdrop: HDROP, ifile: UInt, lpszfile: PSTR, cch: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "DragQueryFileA", longArrayOf(hdrop, ifile.toLong(), lpszfile, cch.toLong())).toUInt()
}

public fun DragQueryFileW(hdrop: HDROP, ifile: UInt, lpszfile: PWSTR, cch: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "DragQueryFileW", longArrayOf(hdrop, ifile.toLong(), lpszfile, cch.toLong())).toUInt()
}

public fun DragQueryPoint(hdrop: HDROP, ppt: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "DragQueryPoint", longArrayOf(hdrop, ppt)).toInt()
}

public fun DriveType(idrive: Int): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "DriveType", longArrayOf(idrive.toLong())).toInt()
}

public fun DuplicateIcon(hinst: HINSTANCE, hicon: HICON): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "DuplicateIcon", longArrayOf(hinst, hicon))
}

public fun ExtractAssociatedIconA(hinst: HINSTANCE, psziconpath: PSTR, piicon: Long): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractAssociatedIconA", longArrayOf(hinst, psziconpath, piicon))
}

public fun ExtractAssociatedIconExA(hinst: HINSTANCE, psziconpath: PSTR, piiconindex: Long, piiconid: Long): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractAssociatedIconExA", longArrayOf(hinst, psziconpath, piiconindex, piiconid))
}

public fun ExtractAssociatedIconExW(hinst: HINSTANCE, psziconpath: PWSTR, piiconindex: Long, piiconid: Long): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractAssociatedIconExW", longArrayOf(hinst, psziconpath, piiconindex, piiconid))
}

public fun ExtractAssociatedIconW(hinst: HINSTANCE, psziconpath: PWSTR, piicon: Long): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractAssociatedIconW", longArrayOf(hinst, psziconpath, piicon))
}

public fun ExtractIconA(hinst: HINSTANCE, pszexefilename: PCSTR, niconindex: UInt): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractIconA", longArrayOf(hinst, pszexefilename, niconindex.toLong()))
}

public fun ExtractIconExA(lpszfile: PCSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractIconExA", longArrayOf(lpszfile, niconindex.toLong(), phiconlarge, phiconsmall, nicons.toLong())).toUInt()
}

public fun ExtractIconExW(lpszfile: PCWSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractIconExW", longArrayOf(lpszfile, niconindex.toLong(), phiconlarge, phiconsmall, nicons.toLong())).toUInt()
}

public fun ExtractIconW(hinst: HINSTANCE, pszexefilename: PCWSTR, niconindex: UInt): HICON {
    return Win32DynamicFfi.invoke("shell32.dll", "ExtractIconW", longArrayOf(hinst, pszexefilename, niconindex.toLong()))
}

public fun FindExecutableA(lpfile: PCSTR, lpdirectory: PCSTR, lpresult: PSTR): HINSTANCE {
    return Win32DynamicFfi.invoke("shell32.dll", "FindExecutableA", longArrayOf(lpfile, lpdirectory, lpresult))
}

public fun FindExecutableW(lpfile: PCWSTR, lpdirectory: PCWSTR, lpresult: PWSTR): HINSTANCE {
    return Win32DynamicFfi.invoke("shell32.dll", "FindExecutableW", longArrayOf(lpfile, lpdirectory, lpresult))
}

public fun GetAcceptLanguagesA(pszlanguages: PSTR, pcchlanguages: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "GetAcceptLanguagesA", longArrayOf(pszlanguages, pcchlanguages)).toInt()
}

public fun GetAcceptLanguagesW(pszlanguages: PWSTR, pcchlanguages: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "GetAcceptLanguagesW", longArrayOf(pszlanguages, pcchlanguages)).toInt()
}

public fun GetAllUsersProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetAllUsersProfileDirectoryA", longArrayOf(lpprofiledir, lpcchsize)).toInt()
}

public fun GetAllUsersProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetAllUsersProfileDirectoryW", longArrayOf(lpprofiledir, lpcchsize)).toInt()
}

public fun GetCurrentProcessExplicitAppUserModelID(appid: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "GetCurrentProcessExplicitAppUserModelID", longArrayOf(appid)).toInt()
}

public fun GetDefaultUserProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetDefaultUserProfileDirectoryA", longArrayOf(lpprofiledir, lpcchsize)).toInt()
}

public fun GetDefaultUserProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetDefaultUserProfileDirectoryW", longArrayOf(lpprofiledir, lpcchsize)).toInt()
}

public fun GetDpiForShellUIComponent(param0: SHELL_UI_COMPONENT): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-2.dll", "GetDpiForShellUIComponent", longArrayOf(param0.toLong())).toUInt()
}

public fun GetFileNameFromBrowse(hwnd: HWND, pszfilepath: PWSTR, cchfilepath: UInt, pszworkingdir: PCWSTR, pszdefext: PCWSTR, pszfilters: PCWSTR, psztitle: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "GetFileNameFromBrowse", longArrayOf(hwnd, pszfilepath, cchfilepath.toLong(), pszworkingdir, pszdefext, pszfilters, psztitle)).toInt()
}

public fun GetMenuContextHelpId(param0: HMENU): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuContextHelpId", longArrayOf(param0)).toUInt()
}

public fun GetMenuPosFromID(hmenu: HMENU, id: UInt): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "GetMenuPosFromID", longArrayOf(hmenu, id.toLong())).toInt()
}

public fun GetProfileType(dwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetProfileType", longArrayOf(dwflags)).toInt()
}

public fun GetProfilesDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetProfilesDirectoryA", longArrayOf(lpprofiledir, lpcchsize)).toInt()
}

public fun GetProfilesDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetProfilesDirectoryW", longArrayOf(lpprofiledir, lpcchsize)).toInt()
}

public fun GetScaleFactorForDevice(devicetype: DISPLAY_DEVICE_TYPE): DEVICE_SCALE_FACTOR {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-0.dll", "GetScaleFactorForDevice", longArrayOf(devicetype.toLong())).toInt()
}

public fun GetScaleFactorForMonitor(hmon: HMONITOR, pscale: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "GetScaleFactorForMonitor", longArrayOf(hmon, pscale)).toInt()
}

public fun GetUserProfileDirectoryA(htoken: HANDLE, lpprofiledir: PSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetUserProfileDirectoryA", longArrayOf(htoken, lpprofiledir, lpcchsize)).toInt()
}

public fun GetUserProfileDirectoryW(htoken: HANDLE, lpprofiledir: PWSTR, lpcchsize: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetUserProfileDirectoryW", longArrayOf(htoken, lpprofiledir, lpcchsize)).toInt()
}

public fun GetWindowContextHelpId(param0: HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowContextHelpId", longArrayOf(param0)).toUInt()
}

public fun GetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, pdwrefdata: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "GetWindowSubclass", longArrayOf(hwnd, Win32DynamicFfi.objectSlot(pfnsubclass), uidsubclass.toLong(), pdwrefdata)).toInt()
}

public fun HMONITOR_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserFree", longArrayOf(param0, param1))
}

public fun HMONITOR_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserFree64", longArrayOf(param0, param1))
}

public fun HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HMONITOR_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HMONITOR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMONITOR_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HashData(pbdata: Long, cbdata: UInt, pbhash: Long, cbhash: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "HashData", longArrayOf(pbdata, cbdata.toLong(), pbhash, cbhash.toLong())).toInt()
}

public fun HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: UInt, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkClone", longArrayOf(pihl, riid, pihlsiteforclone, dwsitedata.toLong(), ppvobj)).toInt()
}

public fun HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateBrowseContext", longArrayOf(piunkouter, riid, ppvobj)).toInt()
}

public fun HlinkCreateExtensionServices(pwzadditionalheaders: PCWSTR, phwnd: HWND, pszusername: PCWSTR, pszpassword: PCWSTR, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateExtensionServices", longArrayOf(pwzadditionalheaders, phwnd, pszusername, pszpassword, piunkouter, riid, ppvobj)).toInt()
}

public fun HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateFromData", longArrayOf(pidataobj, pihlsite, dwsitedata.toLong(), piunkouter, riid, ppvobj)).toInt()
}

public fun HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateFromMoniker", longArrayOf(pimktrgt, pwzlocation, pwzfriendlyname, pihlsite, dwsitedata.toLong(), piunkouter, riid, ppvobj)).toInt()
}

public fun HlinkCreateFromString(pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateFromString", longArrayOf(pwztarget, pwzlocation, pwzfriendlyname, pihlsite, dwsitedata.toLong(), piunkouter, riid, ppvobj)).toInt()
}

public fun HlinkCreateShortcut(grfhlshortcutf: UInt, pihl: Long, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateShortcut", longArrayOf(grfhlshortcutf.toLong(), pihl, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved.toLong())).toInt()
}

public fun HlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateShortcutFromMoniker", longArrayOf(grfhlshortcutf.toLong(), pimktarget, pwzlocation, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved.toLong())).toInt()
}

public fun HlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkCreateShortcutFromString", longArrayOf(grfhlshortcutf.toLong(), pwztarget, pwzlocation, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved.toLong())).toInt()
}

public fun HlinkGetSpecialReference(ureference: UInt, ppwzreference: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkGetSpecialReference", longArrayOf(ureference.toLong(), ppwzreference)).toInt()
}

public fun HlinkGetValueFromParams(pwzparams: PCWSTR, pwzname: PCWSTR, ppwzvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkGetValueFromParams", longArrayOf(pwzparams, pwzname, ppwzvalue)).toInt()
}

public fun HlinkIsShortcut(pwzfilename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkIsShortcut", longArrayOf(pwzfilename)).toInt()
}

public fun HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: UInt, pbc: Long, pibsc: Long, pihlbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkNavigate", longArrayOf(pihl, pihlframe, grfhlnf.toLong(), pbc, pibsc, pihlbc)).toInt()
}

public fun HlinkNavigateToStringReference(pwztarget: PCWSTR, pwzlocation: PCWSTR, pihlsite: Long, dwsitedata: UInt, pihlframe: Long, grfhlnf: UInt, pibc: Long, pibsc: Long, pihlbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkNavigateToStringReference", longArrayOf(pwztarget, pwzlocation, pihlsite, dwsitedata.toLong(), pihlframe, grfhlnf.toLong(), pibc, pibsc, pihlbc)).toInt()
}

public fun HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, puhlid: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkOnNavigate", longArrayOf(pihlframe, pihlbc, grfhlnf.toLong(), pimktarget, pwzlocation, pwzfriendlyname, puhlid)).toInt()
}

public fun HlinkOnRenameDocument(dwreserved: UInt, pihlbc: Long, pimkold: Long, pimknew: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkOnRenameDocument", longArrayOf(dwreserved.toLong(), pihlbc, pimkold, pimknew)).toInt()
}

public fun HlinkParseDisplayName(pibc: Long, pwzdisplayname: PCWSTR, fnoforceabs: BOOL, pccheaten: Long, ppimk: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkParseDisplayName", longArrayOf(pibc, pwzdisplayname, fnoforceabs.toLong(), pccheaten, ppimk)).toInt()
}

public fun HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkPreprocessMoniker", longArrayOf(pibc, pimkin, ppimkout)).toInt()
}

public fun HlinkQueryCreateFromData(pidataobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkQueryCreateFromData", longArrayOf(pidataobj)).toInt()
}

public fun HlinkResolveMonikerForData(pimkreference: Long, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkResolveMonikerForData", longArrayOf(pimkreference, reserved.toLong(), pibc, cfmtetc.toLong(), rgfmtetc, pibsc, pimkbase)).toInt()
}

public fun HlinkResolveShortcut(pwzshortcutfilename: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkResolveShortcut", longArrayOf(pwzshortcutfilename, pihlsite, dwsitedata.toLong(), piunkouter, riid, ppvobj)).toInt()
}

public fun HlinkResolveShortcutToMoniker(pwzshortcutfilename: PCWSTR, ppimktarget: Long, ppwzlocation: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkResolveShortcutToMoniker", longArrayOf(pwzshortcutfilename, ppimktarget, ppwzlocation)).toInt()
}

public fun HlinkResolveShortcutToString(pwzshortcutfilename: PCWSTR, ppwztarget: Long, ppwzlocation: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkResolveShortcutToString", longArrayOf(pwzshortcutfilename, ppwztarget, ppwzlocation)).toInt()
}

public fun HlinkResolveStringForData(pwzreference: PCWSTR, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkResolveStringForData", longArrayOf(pwzreference, reserved.toLong(), pibc, cfmtetc.toLong(), rgfmtetc, pibsc, pimkbase)).toInt()
}

public fun HlinkSetSpecialReference(ureference: UInt, pwzreference: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkSetSpecialReference", longArrayOf(ureference.toLong(), pwzreference)).toInt()
}

public fun HlinkTranslateURL(pwzurl: PCWSTR, grfflags: UInt, ppwztranslatedurl: Long): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkTranslateURL", longArrayOf(pwzurl, grfflags.toLong(), ppwztranslatedurl)).toInt()
}

public fun HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: UInt, pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "HlinkUpdateStackItem", longArrayOf(pihlframe, pihlbc, uhlid.toLong(), pimktrgt, pwzlocation, pwzfriendlyname)).toInt()
}

public fun ILAppendID(pidl: Long, pmkid: Long, fappend: BOOL): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILAppendID", longArrayOf(pidl, pmkid, fappend.toLong()))
}

public fun ILClone(pidl: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILClone", longArrayOf(pidl))
}

public fun ILCloneFirst(pidl: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILCloneFirst", longArrayOf(pidl))
}

public fun ILCombine(pidl1: Long, pidl2: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILCombine", longArrayOf(pidl1, pidl2))
}

public fun ILCreateFromPathA(pszpath: PCSTR): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILCreateFromPathA", longArrayOf(pszpath))
}

public fun ILCreateFromPathW(pszpath: PCWSTR): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILCreateFromPathW", longArrayOf(pszpath))
}

public fun ILFindChild(pidlparent: Long, pidlchild: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILFindChild", longArrayOf(pidlparent, pidlchild))
}

public fun ILFindLastID(pidl: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILFindLastID", longArrayOf(pidl))
}

public fun ILFree(pidl: Long) {
    Win32DynamicFfi.invoke("shell32.dll", "ILFree", longArrayOf(pidl))
}

public fun ILGetNext(pidl: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "ILGetNext", longArrayOf(pidl))
}

public fun ILGetSize(pidl: Long): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "ILGetSize", longArrayOf(pidl)).toUInt()
}

public fun ILIsEqual(pidl1: Long, pidl2: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "ILIsEqual", longArrayOf(pidl1, pidl2)).toInt()
}

public fun ILIsParent(pidl1: Long, pidl2: Long, fimmediate: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "ILIsParent", longArrayOf(pidl1, pidl2, fimmediate.toLong())).toInt()
}

public fun ILLoadFromStreamEx(pstm: Long, pidl: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "ILLoadFromStreamEx", longArrayOf(pstm, pidl)).toInt()
}

public fun ILRemoveLastID(pidl: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "ILRemoveLastID", longArrayOf(pidl)).toInt()
}

public fun ILSaveToStream(pstm: Long, pidl: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "ILSaveToStream", longArrayOf(pstm, pidl)).toInt()
}

public fun IStream_Copy(pstmfrom: Long, pstmto: Long, cb: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_Copy", longArrayOf(pstmfrom, pstmto, cb.toLong())).toInt()
}

public fun IStream_Read(pstm: Long, pv: Long, cb: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_Read", longArrayOf(pstm, pv, cb.toLong())).toInt()
}

public fun IStream_ReadPidl(pstm: Long, ppidlout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_ReadPidl", longArrayOf(pstm, ppidlout)).toInt()
}

public fun IStream_ReadStr(pstm: Long, ppsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_ReadStr", longArrayOf(pstm, ppsz)).toInt()
}

public fun IStream_Reset(pstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_Reset", longArrayOf(pstm)).toInt()
}

public fun IStream_Size(pstm: Long, pui: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_Size", longArrayOf(pstm, pui)).toInt()
}

public fun IStream_Write(pstm: Long, pv: Long, cb: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_Write", longArrayOf(pstm, pv, cb.toLong())).toInt()
}

public fun IStream_WritePidl(pstm: Long, pidlwrite: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_WritePidl", longArrayOf(pstm, pidlwrite)).toInt()
}

public fun IStream_WriteStr(pstm: Long, psz: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IStream_WriteStr", longArrayOf(pstm, psz)).toInt()
}

public fun IUnknown_AtomicRelease(ppunk: Long) {
    Win32DynamicFfi.invoke("shlwapi.dll", "IUnknown_AtomicRelease", longArrayOf(ppunk))
}

public fun IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IUnknown_GetSite", longArrayOf(punk, riid, ppv)).toInt()
}

public fun IUnknown_GetWindow(punk: Long, phwnd: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IUnknown_GetWindow", longArrayOf(punk, phwnd)).toInt()
}

public fun IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IUnknown_QueryService", longArrayOf(punk, guidservice, riid, ppvout)).toInt()
}

public fun IUnknown_Set(ppunk: Long, punk: Long) {
    Win32DynamicFfi.invoke("shlwapi.dll", "IUnknown_Set", longArrayOf(ppunk, punk))
}

public fun IUnknown_SetSite(punk: Long, punksite: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IUnknown_SetSite", longArrayOf(punk, punksite)).toInt()
}

public fun ImportPrivacySettings(pszfilename: PCWSTR, pfparseprivacypreferences: Long, pfparsepersiterules: Long): BOOL {
    return Win32DynamicFfi.invoke("shdocvw.dll", "ImportPrivacySettings", longArrayOf(pszfilename, pfparseprivacypreferences, pfparsepersiterules)).toInt()
}

public fun InitNetworkAddressControl(): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "InitNetworkAddressControl", longArrayOf()).toInt()
}

public fun InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromStrRet", longArrayOf(pstrret, pidl, ppropvar)).toInt()
}

public fun InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromStrRet", longArrayOf(pstrret, pidl, pvar)).toInt()
}

public fun IntlStrEqWorkerA(fcasesens: BOOL, lpstring1: PCSTR, lpstring2: PCSTR, nchar: Int): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IntlStrEqWorkerA", longArrayOf(fcasesens.toLong(), lpstring1, lpstring2, nchar.toLong())).toInt()
}

public fun IntlStrEqWorkerW(fcasesens: BOOL, lpstring1: PCWSTR, lpstring2: PCWSTR, nchar: Int): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IntlStrEqWorkerW", longArrayOf(fcasesens.toLong(), lpstring1, lpstring2, nchar.toLong())).toInt()
}

public fun IsCharSpaceA(wch: Byte): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IsCharSpaceA", longArrayOf(wch.toLong())).toInt()
}

public fun IsCharSpaceW(wch: UShort): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IsCharSpaceW", longArrayOf(wch.toLong())).toInt()
}

public fun IsInternetESCEnabled(): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IsInternetESCEnabled", longArrayOf()).toInt()
}

public fun IsLFNDriveA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "IsLFNDriveA", longArrayOf(pszpath)).toInt()
}

public fun IsLFNDriveW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "IsLFNDriveW", longArrayOf(pszpath)).toInt()
}

public fun IsNetDrive(idrive: Int): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "IsNetDrive", longArrayOf(idrive.toLong())).toInt()
}

public fun IsOS(dwos: OS): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "IsOS", longArrayOf(dwos.toLong())).toInt()
}

public fun IsUserAnAdmin(): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "IsUserAnAdmin", longArrayOf()).toInt()
}

public fun LoadUserProfileA(htoken: HANDLE, lpprofileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "LoadUserProfileA", longArrayOf(htoken, lpprofileinfo)).toInt()
}

public fun LoadUserProfileW(htoken: HANDLE, lpprofileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "LoadUserProfileW", longArrayOf(htoken, lpprofileinfo)).toInt()
}

public fun OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("hlink.dll", "OleSaveToStreamEx", longArrayOf(piunk, pistm, fcleardirty.toLong())).toInt()
}

public fun OpenRegStream(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "OpenRegStream", longArrayOf(hkey, pszsubkey, pszvalue, grfmode.toLong()))
}

public fun ParseURLA(pcszurl: PCSTR, ppu: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ParseURLA", longArrayOf(pcszurl, ppu)).toInt()
}

public fun ParseURLW(pcszurl: PCWSTR, ppu: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ParseURLW", longArrayOf(pcszurl, ppu)).toInt()
}

public fun PathAddBackslashA(pszpath: PSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathAddBackslashA", longArrayOf(pszpath))
}

public fun PathAddBackslashW(pszpath: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathAddBackslashW", longArrayOf(pszpath))
}

public fun PathAddExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathAddExtensionA", longArrayOf(pszpath, pszext)).toInt()
}

public fun PathAddExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathAddExtensionW", longArrayOf(pszpath, pszext)).toInt()
}

public fun PathAllocCanonicalize(pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathAllocCanonicalize", longArrayOf(pszpathin, dwflags.toLong(), ppszpathout)).toInt()
}

public fun PathAllocCombine(pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathAllocCombine", longArrayOf(pszpathin, pszmore, dwflags.toLong(), ppszpathout)).toInt()
}

public fun PathAppendA(pszpath: PSTR, pszmore: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathAppendA", longArrayOf(pszpath, pszmore)).toInt()
}

public fun PathAppendW(pszpath: PWSTR, pszmore: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathAppendW", longArrayOf(pszpath, pszmore)).toInt()
}

public fun PathBuildRootA(pszroot: PSTR, idrive: Int): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathBuildRootA", longArrayOf(pszroot, idrive.toLong()))
}

public fun PathBuildRootW(pszroot: PWSTR, idrive: Int): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathBuildRootW", longArrayOf(pszroot, idrive.toLong()))
}

public fun PathCanonicalizeA(pszbuf: PSTR, pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCanonicalizeA", longArrayOf(pszbuf, pszpath)).toInt()
}

public fun PathCanonicalizeW(pszbuf: PWSTR, pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCanonicalizeW", longArrayOf(pszbuf, pszpath)).toInt()
}

public fun PathCchAddBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchAddBackslash", longArrayOf(pszpath, cchpath.toLong())).toInt()
}

public fun PathCchAddBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchAddBackslashEx", longArrayOf(pszpath, cchpath.toLong(), ppszend, pcchremaining)).toInt()
}

public fun PathCchAddExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchAddExtension", longArrayOf(pszpath, cchpath.toLong(), pszext)).toInt()
}

public fun PathCchAppend(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchAppend", longArrayOf(pszpath, cchpath.toLong(), pszmore)).toInt()
}

public fun PathCchAppendEx(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchAppendEx", longArrayOf(pszpath, cchpath.toLong(), pszmore, dwflags.toLong())).toInt()
}

public fun PathCchCanonicalize(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchCanonicalize", longArrayOf(pszpathout, cchpathout.toLong(), pszpathin)).toInt()
}

public fun PathCchCanonicalizeEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchCanonicalizeEx", longArrayOf(pszpathout, cchpathout.toLong(), pszpathin, dwflags.toLong())).toInt()
}

public fun PathCchCombine(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchCombine", longArrayOf(pszpathout, cchpathout.toLong(), pszpathin, pszmore)).toInt()
}

public fun PathCchCombineEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchCombineEx", longArrayOf(pszpathout, cchpathout.toLong(), pszpathin, pszmore, dwflags.toLong())).toInt()
}

public fun PathCchFindExtension(pszpath: PCWSTR, cchpath: ULong, ppszext: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchFindExtension", longArrayOf(pszpath, cchpath.toLong(), ppszext)).toInt()
}

public fun PathCchIsRoot(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchIsRoot", longArrayOf(pszpath)).toInt()
}

public fun PathCchRemoveBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchRemoveBackslash", longArrayOf(pszpath, cchpath.toLong())).toInt()
}

public fun PathCchRemoveBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchRemoveBackslashEx", longArrayOf(pszpath, cchpath.toLong(), ppszend, pcchremaining)).toInt()
}

public fun PathCchRemoveExtension(pszpath: PWSTR, cchpath: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchRemoveExtension", longArrayOf(pszpath, cchpath.toLong())).toInt()
}

public fun PathCchRemoveFileSpec(pszpath: PWSTR, cchpath: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchRemoveFileSpec", longArrayOf(pszpath, cchpath.toLong())).toInt()
}

public fun PathCchRenameExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchRenameExtension", longArrayOf(pszpath, cchpath.toLong(), pszext)).toInt()
}

public fun PathCchSkipRoot(pszpath: PCWSTR, ppszrootend: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchSkipRoot", longArrayOf(pszpath, ppszrootend)).toInt()
}

public fun PathCchStripPrefix(pszpath: PWSTR, cchpath: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchStripPrefix", longArrayOf(pszpath, cchpath.toLong())).toInt()
}

public fun PathCchStripToRoot(pszpath: PWSTR, cchpath: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathCchStripToRoot", longArrayOf(pszpath, cchpath.toLong())).toInt()
}

public fun PathCleanupSpec(pszdir: PCWSTR, pszspec: PWSTR): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "PathCleanupSpec", longArrayOf(pszdir, pszspec)).toInt()
}

public fun PathCombineA(pszdest: PSTR, pszdir: PCSTR, pszfile: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCombineA", longArrayOf(pszdest, pszdir, pszfile))
}

public fun PathCombineW(pszdest: PWSTR, pszdir: PCWSTR, pszfile: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCombineW", longArrayOf(pszdest, pszdir, pszfile))
}

public fun PathCommonPrefixA(pszfile1: PCSTR, pszfile2: PCSTR, achpath: PSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCommonPrefixA", longArrayOf(pszfile1, pszfile2, achpath)).toInt()
}

public fun PathCommonPrefixW(pszfile1: PCWSTR, pszfile2: PCWSTR, achpath: PWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCommonPrefixW", longArrayOf(pszfile1, pszfile2, achpath)).toInt()
}

public fun PathCompactPathA(hdc: HDC, pszpath: PSTR, dx: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCompactPathA", longArrayOf(hdc, pszpath, dx.toLong())).toInt()
}

public fun PathCompactPathExA(pszout: PSTR, pszsrc: PCSTR, cchmax: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCompactPathExA", longArrayOf(pszout, pszsrc, cchmax.toLong(), dwflags.toLong())).toInt()
}

public fun PathCompactPathExW(pszout: PWSTR, pszsrc: PCWSTR, cchmax: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCompactPathExW", longArrayOf(pszout, pszsrc, cchmax.toLong(), dwflags.toLong())).toInt()
}

public fun PathCompactPathW(hdc: HDC, pszpath: PWSTR, dx: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCompactPathW", longArrayOf(hdc, pszpath, dx.toLong())).toInt()
}

public fun PathCreateFromUrlA(pszurl: PCSTR, pszpath: PSTR, pcchpath: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCreateFromUrlA", longArrayOf(pszurl, pszpath, pcchpath, dwflags.toLong())).toInt()
}

public fun PathCreateFromUrlAlloc(pszin: PCWSTR, ppszout: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCreateFromUrlAlloc", longArrayOf(pszin, ppszout, dwflags.toLong())).toInt()
}

public fun PathCreateFromUrlW(pszurl: PCWSTR, pszpath: PWSTR, pcchpath: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathCreateFromUrlW", longArrayOf(pszurl, pszpath, pcchpath, dwflags.toLong())).toInt()
}

public fun PathFileExistsA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFileExistsA", longArrayOf(pszpath)).toInt()
}

public fun PathFileExistsW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFileExistsW", longArrayOf(pszpath)).toInt()
}

public fun PathFindExtensionA(pszpath: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindExtensionA", longArrayOf(pszpath))
}

public fun PathFindExtensionW(pszpath: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindExtensionW", longArrayOf(pszpath))
}

public fun PathFindFileNameA(pszpath: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindFileNameA", longArrayOf(pszpath))
}

public fun PathFindFileNameW(pszpath: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindFileNameW", longArrayOf(pszpath))
}

public fun PathFindNextComponentA(pszpath: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindNextComponentA", longArrayOf(pszpath))
}

public fun PathFindNextComponentW(pszpath: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindNextComponentW", longArrayOf(pszpath))
}

public fun PathFindOnPathA(pszpath: PSTR, ppszotherdirs: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindOnPathA", longArrayOf(pszpath, ppszotherdirs)).toInt()
}

public fun PathFindOnPathW(pszpath: PWSTR, ppszotherdirs: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindOnPathW", longArrayOf(pszpath, ppszotherdirs)).toInt()
}

public fun PathFindSuffixArrayA(pszpath: PCSTR, apszsuffix: Long, iarraysize: Int): PCSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindSuffixArrayA", longArrayOf(pszpath, apszsuffix, iarraysize.toLong()))
}

public fun PathFindSuffixArrayW(pszpath: PCWSTR, apszsuffix: Long, iarraysize: Int): PCWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathFindSuffixArrayW", longArrayOf(pszpath, apszsuffix, iarraysize.toLong()))
}

public fun PathGetArgsA(pszpath: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathGetArgsA", longArrayOf(pszpath))
}

public fun PathGetArgsW(pszpath: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathGetArgsW", longArrayOf(pszpath))
}

public fun PathGetCharTypeA(ch: UByte): UInt {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathGetCharTypeA", longArrayOf(ch.toLong())).toUInt()
}

public fun PathGetCharTypeW(ch: UShort): UInt {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathGetCharTypeW", longArrayOf(ch.toLong())).toUInt()
}

public fun PathGetDriveNumberA(pszpath: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathGetDriveNumberA", longArrayOf(pszpath)).toInt()
}

public fun PathGetDriveNumberW(pszpath: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathGetDriveNumberW", longArrayOf(pszpath)).toInt()
}

public fun PathGetShortPath(pszlongpath: PWSTR) {
    Win32DynamicFfi.invoke("shell32.dll", "PathGetShortPath", longArrayOf(pszlongpath))
}

public fun PathIsContentTypeA(pszpath: PCSTR, pszcontenttype: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsContentTypeA", longArrayOf(pszpath, pszcontenttype)).toInt()
}

public fun PathIsContentTypeW(pszpath: PCWSTR, pszcontenttype: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsContentTypeW", longArrayOf(pszpath, pszcontenttype)).toInt()
}

public fun PathIsDirectoryA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsDirectoryA", longArrayOf(pszpath)).toInt()
}

public fun PathIsDirectoryEmptyA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsDirectoryEmptyA", longArrayOf(pszpath)).toInt()
}

public fun PathIsDirectoryEmptyW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsDirectoryEmptyW", longArrayOf(pszpath)).toInt()
}

public fun PathIsDirectoryW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsDirectoryW", longArrayOf(pszpath)).toInt()
}

public fun PathIsExe(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "PathIsExe", longArrayOf(pszpath)).toInt()
}

public fun PathIsFileSpecA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsFileSpecA", longArrayOf(pszpath)).toInt()
}

public fun PathIsFileSpecW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsFileSpecW", longArrayOf(pszpath)).toInt()
}

public fun PathIsLFNFileSpecA(pszname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsLFNFileSpecA", longArrayOf(pszname)).toInt()
}

public fun PathIsLFNFileSpecW(pszname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsLFNFileSpecW", longArrayOf(pszname)).toInt()
}

public fun PathIsNetworkPathA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsNetworkPathA", longArrayOf(pszpath)).toInt()
}

public fun PathIsNetworkPathW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsNetworkPathW", longArrayOf(pszpath)).toInt()
}

public fun PathIsPrefixA(pszprefix: PCSTR, pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsPrefixA", longArrayOf(pszprefix, pszpath)).toInt()
}

public fun PathIsPrefixW(pszprefix: PCWSTR, pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsPrefixW", longArrayOf(pszprefix, pszpath)).toInt()
}

public fun PathIsRelativeA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsRelativeA", longArrayOf(pszpath)).toInt()
}

public fun PathIsRelativeW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsRelativeW", longArrayOf(pszpath)).toInt()
}

public fun PathIsRootA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsRootA", longArrayOf(pszpath)).toInt()
}

public fun PathIsRootW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsRootW", longArrayOf(pszpath)).toInt()
}

public fun PathIsSameRootA(pszpath1: PCSTR, pszpath2: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsSameRootA", longArrayOf(pszpath1, pszpath2)).toInt()
}

public fun PathIsSameRootW(pszpath1: PCWSTR, pszpath2: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsSameRootW", longArrayOf(pszpath1, pszpath2)).toInt()
}

public fun PathIsSlowA(pszfile: PCSTR, dwattr: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "PathIsSlowA", longArrayOf(pszfile, dwattr.toLong())).toInt()
}

public fun PathIsSlowW(pszfile: PCWSTR, dwattr: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "PathIsSlowW", longArrayOf(pszfile, dwattr.toLong())).toInt()
}

public fun PathIsSystemFolderA(pszpath: PCSTR, dwattrb: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsSystemFolderA", longArrayOf(pszpath, dwattrb.toLong())).toInt()
}

public fun PathIsSystemFolderW(pszpath: PCWSTR, dwattrb: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsSystemFolderW", longArrayOf(pszpath, dwattrb.toLong())).toInt()
}

public fun PathIsUNCA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsUNCA", longArrayOf(pszpath)).toInt()
}

public fun PathIsUNCEx(pszpath: PCWSTR, ppszserver: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-path-l1-1-0.dll", "PathIsUNCEx", longArrayOf(pszpath, ppszserver)).toInt()
}

public fun PathIsUNCServerA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsUNCServerA", longArrayOf(pszpath)).toInt()
}

public fun PathIsUNCServerShareA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsUNCServerShareA", longArrayOf(pszpath)).toInt()
}

public fun PathIsUNCServerShareW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsUNCServerShareW", longArrayOf(pszpath)).toInt()
}

public fun PathIsUNCServerW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsUNCServerW", longArrayOf(pszpath)).toInt()
}

public fun PathIsUNCW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsUNCW", longArrayOf(pszpath)).toInt()
}

public fun PathIsURLA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsURLA", longArrayOf(pszpath)).toInt()
}

public fun PathIsURLW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathIsURLW", longArrayOf(pszpath)).toInt()
}

public fun PathMakePrettyA(pszpath: PSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMakePrettyA", longArrayOf(pszpath)).toInt()
}

public fun PathMakePrettyW(pszpath: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMakePrettyW", longArrayOf(pszpath)).toInt()
}

public fun PathMakeSystemFolderA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMakeSystemFolderA", longArrayOf(pszpath)).toInt()
}

public fun PathMakeSystemFolderW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMakeSystemFolderW", longArrayOf(pszpath)).toInt()
}

public fun PathMakeUniqueName(pszuniquename: PWSTR, cchmax: UInt, psztemplate: PCWSTR, pszlongplate: PCWSTR, pszdir: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "PathMakeUniqueName", longArrayOf(pszuniquename, cchmax.toLong(), psztemplate, pszlongplate, pszdir)).toInt()
}

public fun PathMatchSpecA(pszfile: PCSTR, pszspec: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMatchSpecA", longArrayOf(pszfile, pszspec)).toInt()
}

public fun PathMatchSpecExA(pszfile: PCSTR, pszspec: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMatchSpecExA", longArrayOf(pszfile, pszspec, dwflags.toLong())).toInt()
}

public fun PathMatchSpecExW(pszfile: PCWSTR, pszspec: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMatchSpecExW", longArrayOf(pszfile, pszspec, dwflags.toLong())).toInt()
}

public fun PathMatchSpecW(pszfile: PCWSTR, pszspec: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathMatchSpecW", longArrayOf(pszfile, pszspec)).toInt()
}

public fun PathParseIconLocationA(psziconfile: PSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathParseIconLocationA", longArrayOf(psziconfile)).toInt()
}

public fun PathParseIconLocationW(psziconfile: PWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathParseIconLocationW", longArrayOf(psziconfile)).toInt()
}

public fun PathQualify(psz: PWSTR) {
    Win32DynamicFfi.invoke("shell32.dll", "PathQualify", longArrayOf(psz))
}

public fun PathQuoteSpacesA(lpsz: PSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathQuoteSpacesA", longArrayOf(lpsz)).toInt()
}

public fun PathQuoteSpacesW(lpsz: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathQuoteSpacesW", longArrayOf(lpsz)).toInt()
}

public fun PathRelativePathToA(pszpath: PSTR, pszfrom: PCSTR, dwattrfrom: UInt, pszto: PCSTR, dwattrto: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRelativePathToA", longArrayOf(pszpath, pszfrom, dwattrfrom.toLong(), pszto, dwattrto.toLong())).toInt()
}

public fun PathRelativePathToW(pszpath: PWSTR, pszfrom: PCWSTR, dwattrfrom: UInt, pszto: PCWSTR, dwattrto: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRelativePathToW", longArrayOf(pszpath, pszfrom, dwattrfrom.toLong(), pszto, dwattrto.toLong())).toInt()
}

public fun PathRemoveArgsA(pszpath: PSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveArgsA", longArrayOf(pszpath))
}

public fun PathRemoveArgsW(pszpath: PWSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveArgsW", longArrayOf(pszpath))
}

public fun PathRemoveBackslashA(pszpath: PSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveBackslashA", longArrayOf(pszpath))
}

public fun PathRemoveBackslashW(pszpath: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveBackslashW", longArrayOf(pszpath))
}

public fun PathRemoveBlanksA(pszpath: PSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveBlanksA", longArrayOf(pszpath))
}

public fun PathRemoveBlanksW(pszpath: PWSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveBlanksW", longArrayOf(pszpath))
}

public fun PathRemoveExtensionA(pszpath: PSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveExtensionA", longArrayOf(pszpath))
}

public fun PathRemoveExtensionW(pszpath: PWSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveExtensionW", longArrayOf(pszpath))
}

public fun PathRemoveFileSpecA(pszpath: PSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveFileSpecA", longArrayOf(pszpath)).toInt()
}

public fun PathRemoveFileSpecW(pszpath: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRemoveFileSpecW", longArrayOf(pszpath)).toInt()
}

public fun PathRenameExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRenameExtensionA", longArrayOf(pszpath, pszext)).toInt()
}

public fun PathRenameExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathRenameExtensionW", longArrayOf(pszpath, pszext)).toInt()
}

public fun PathResolve(pszpath: PWSTR, dirs: Long, fflags: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "PathResolve", longArrayOf(pszpath, dirs, fflags.toLong())).toInt()
}

public fun PathSearchAndQualifyA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathSearchAndQualifyA", longArrayOf(pszpath, pszbuf, cchbuf.toLong())).toInt()
}

public fun PathSearchAndQualifyW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathSearchAndQualifyW", longArrayOf(pszpath, pszbuf, cchbuf.toLong())).toInt()
}

public fun PathSetDlgItemPathA(hdlg: HWND, id: Int, pszpath: PCSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathSetDlgItemPathA", longArrayOf(hdlg, id.toLong(), pszpath))
}

public fun PathSetDlgItemPathW(hdlg: HWND, id: Int, pszpath: PCWSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathSetDlgItemPathW", longArrayOf(hdlg, id.toLong(), pszpath))
}

public fun PathSkipRootA(pszpath: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathSkipRootA", longArrayOf(pszpath))
}

public fun PathSkipRootW(pszpath: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathSkipRootW", longArrayOf(pszpath))
}

public fun PathStripPathA(pszpath: PSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathStripPathA", longArrayOf(pszpath))
}

public fun PathStripPathW(pszpath: PWSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathStripPathW", longArrayOf(pszpath))
}

public fun PathStripToRootA(pszpath: PSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathStripToRootA", longArrayOf(pszpath)).toInt()
}

public fun PathStripToRootW(pszpath: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathStripToRootW", longArrayOf(pszpath)).toInt()
}

public fun PathUnExpandEnvStringsA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathUnExpandEnvStringsA", longArrayOf(pszpath, pszbuf, cchbuf.toLong())).toInt()
}

public fun PathUnExpandEnvStringsW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathUnExpandEnvStringsW", longArrayOf(pszpath, pszbuf, cchbuf.toLong())).toInt()
}

public fun PathUndecorateA(pszpath: PSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathUndecorateA", longArrayOf(pszpath))
}

public fun PathUndecorateW(pszpath: PWSTR) {
    Win32DynamicFfi.invoke("shlwapi.dll", "PathUndecorateW", longArrayOf(pszpath))
}

public fun PathUnmakeSystemFolderA(pszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathUnmakeSystemFolderA", longArrayOf(pszpath)).toInt()
}

public fun PathUnmakeSystemFolderW(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathUnmakeSystemFolderW", longArrayOf(pszpath)).toInt()
}

public fun PathUnquoteSpacesA(lpsz: PSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathUnquoteSpacesA", longArrayOf(lpsz)).toInt()
}

public fun PathUnquoteSpacesW(lpsz: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "PathUnquoteSpacesW", longArrayOf(lpsz)).toInt()
}

public fun PathYetAnotherMakeUniqueName(pszuniquename: PWSTR, pszpath: PCWSTR, pszshort: PCWSTR, pszfilespec: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "PathYetAnotherMakeUniqueName", longArrayOf(pszuniquename, pszpath, pszshort, pszfilespec)).toInt()
}

public fun PickIconDlg(hwnd: HWND, psziconpath: PWSTR, cchiconpath: UInt, piiconindex: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "PickIconDlg", longArrayOf(hwnd, psziconpath, cchiconpath.toLong(), piiconindex)).toInt()
}

public fun PropVariantToStrRet(propvar: Long, pstrret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToStrRet", longArrayOf(propvar, pstrret)).toInt()
}

public fun QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "QISearch", longArrayOf(that, pqit, riid, ppv)).toInt()
}

public fun ReadCabinetState(pcs: Long, clength: Int): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "ReadCabinetState", longArrayOf(pcs, clength.toLong())).toInt()
}

public fun RealDriveType(idrive: Int, foktohitnet: BOOL): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "RealDriveType", longArrayOf(idrive.toLong(), foktohitnet.toLong())).toInt()
}

public fun RegisterAppConstrainedChangeNotification(routine: PAPPCONSTRAIN_CHANGE_ROUTINE, context: Long, registration: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-psm-appnotify-l1-1-1.dll", "RegisterAppConstrainedChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(routine), context, registration)).toUInt()
}

public fun RegisterAppStateChangeNotification(routine: PAPPSTATE_CHANGE_ROUTINE, context: Long, registration: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-psm-appnotify-l1-1-0.dll", "RegisterAppStateChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(routine), context, registration)).toUInt()
}

public fun RegisterScaleChangeEvent(hevent: HANDLE, pdwcookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "RegisterScaleChangeEvent", longArrayOf(hevent, pdwcookie)).toInt()
}

public fun RegisterScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, hwndnotify: HWND, umsgnotify: UInt, pdwcookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-0.dll", "RegisterScaleChangeNotifications", longArrayOf(displaydevice.toLong(), hwndnotify, umsgnotify.toLong(), pdwcookie)).toInt()
}

public fun RemoveWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "RemoveWindowSubclass", longArrayOf(hwnd, Win32DynamicFfi.objectSlot(pfnsubclass), uidsubclass.toLong())).toInt()
}

public fun RestartDialog(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "RestartDialog", longArrayOf(hwnd, pszprompt, dwreturn.toLong())).toInt()
}

public fun RestartDialogEx(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt, dwreasoncode: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "RestartDialogEx", longArrayOf(hwnd, pszprompt, dwreturn.toLong(), dwreasoncode.toLong())).toInt()
}

public fun RevokeScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, dwcookie: UInt): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-0.dll", "RevokeScaleChangeNotifications", longArrayOf(displaydevice.toLong(), dwcookie.toLong())).toInt()
}

public fun SHAddFromPropSheetExtArray(hpsxa: HPSXA, lpfnaddpage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "SHAddFromPropSheetExtArray", longArrayOf(hpsxa, Win32DynamicFfi.objectSlot(lpfnaddpage), lparam)).toUInt()
}

public fun SHAddToRecentDocs(uflags: UInt, pv: Long) {
    Win32DynamicFfi.invoke("shell32.dll", "SHAddToRecentDocs", longArrayOf(uflags.toLong(), pv))
}

public fun SHAlloc(cb: ULong): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "SHAlloc", longArrayOf(cb.toLong()))
}

public fun SHAllocShared(pvdata: Long, dwsize: UInt, dwprocessid: UInt): HANDLE {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHAllocShared", longArrayOf(pvdata, dwsize.toLong(), dwprocessid.toLong()))
}

public fun SHAnsiToAnsi(pszsrc: PCSTR, pszdst: PSTR, cchbuf: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHAnsiToAnsi", longArrayOf(pszsrc, pszdst, cchbuf.toLong())).toInt()
}

public fun SHAnsiToUnicode(pszsrc: PCSTR, pwszdst: PWSTR, cwchbuf: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHAnsiToUnicode", longArrayOf(pszsrc, pwszdst, cwchbuf.toLong())).toInt()
}

public fun SHAppBarMessage(dwmessage: UInt, pdata: Long): ULong {
    return Win32DynamicFfi.invoke("shell32.dll", "SHAppBarMessage", longArrayOf(dwmessage.toLong(), pdata)).toULong()
}

public fun SHAssocEnumHandlers(pszextra: PCWSTR, affilter: ASSOC_FILTER, ppenumhandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHAssocEnumHandlers", longArrayOf(pszextra, affilter.toLong(), ppenumhandler)).toInt()
}

public fun SHAssocEnumHandlersForProtocolByApplication(protocol: PCWSTR, riid: Long, enumhandlers: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHAssocEnumHandlersForProtocolByApplication", longArrayOf(protocol, riid, enumhandlers)).toInt()
}

public fun SHAutoComplete(hwndedit: HWND, dwflags: SHELL_AUTOCOMPLETE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHAutoComplete", longArrayOf(hwndedit, dwflags.toLong())).toInt()
}

public fun SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHBindToFolderIDListParent", longArrayOf(psfroot, pidl, riid, ppv, ppidllast)).toInt()
}

public fun SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHBindToFolderIDListParentEx", longArrayOf(psfroot, pidl, ppbc, riid, ppv, ppidllast)).toInt()
}

public fun SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHBindToObject", longArrayOf(psf, pidl, pbc, riid, ppv)).toInt()
}

public fun SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHBindToParent", longArrayOf(pidl, riid, ppv, ppidllast)).toInt()
}

public fun SHBrowseForFolderA(lpbi: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "SHBrowseForFolderA", longArrayOf(lpbi))
}

public fun SHBrowseForFolderW(lpbi: Long): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "SHBrowseForFolderW", longArrayOf(lpbi))
}

public fun SHCLSIDFromString(psz: PCWSTR, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCLSIDFromString", longArrayOf(psz, pclsid)).toInt()
}

public fun SHChangeNotification_Lock(hchange: HANDLE, dwprocid: UInt, pppidl: Long, plevent: Long): HANDLE {
    return Win32DynamicFfi.invoke("shell32.dll", "SHChangeNotification_Lock", longArrayOf(hchange, dwprocid.toLong(), pppidl, plevent))
}

public fun SHChangeNotification_Unlock(hlock: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHChangeNotification_Unlock", longArrayOf(hlock)).toInt()
}

public fun SHChangeNotify(weventid: Int, uflags: SHCNF_FLAGS, dwitem1: Long, dwitem2: Long) {
    Win32DynamicFfi.invoke("shell32.dll", "SHChangeNotify", longArrayOf(weventid.toLong(), uflags.toLong(), dwitem1, dwitem2))
}

public fun SHChangeNotifyDeregister(ulid: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHChangeNotifyDeregister", longArrayOf(ulid.toLong())).toInt()
}

public fun SHChangeNotifyRegister(hwnd: HWND, fsources: SHCNRF_SOURCE, fevents: Int, wmsg: UInt, centries: Int, pshcne: Long): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "SHChangeNotifyRegister", longArrayOf(hwnd, fsources.toLong(), fevents.toLong(), wmsg.toLong(), centries.toLong(), pshcne)).toUInt()
}

public fun SHChangeNotifyRegisterThread(status: SCNRT_STATUS) {
    Win32DynamicFfi.invoke("shell32.dll", "SHChangeNotifyRegisterThread", longArrayOf(status.toLong()))
}

public fun SHCloneSpecialIDList(hwnd: HWND, csidl: Int, fcreate: BOOL): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCloneSpecialIDList", longArrayOf(hwnd, csidl.toLong(), fcreate.toLong()))
}

public fun SHCoCreateInstance(pszclsid: PCWSTR, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCoCreateInstance", longArrayOf(pszclsid, pclsid, punkouter, riid, ppv)).toInt()
}

public fun SHCopyKeyA(hkeysrc: HKEY, pszsrcsubkey: PCSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCopyKeyA", longArrayOf(hkeysrc, pszsrcsubkey, hkeydest, freserved.toLong())).toUInt()
}

public fun SHCopyKeyW(hkeysrc: HKEY, pszsrcsubkey: PCWSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCopyKeyW", longArrayOf(hkeysrc, pszsrcsubkey, hkeydest, freserved.toLong())).toUInt()
}

public fun SHCreateAssociationRegistration(riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateAssociationRegistration", longArrayOf(riid, ppv)).toInt()
}

public fun SHCreateDataObject(pidlfolder: Long, cidl: UInt, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDataObject", longArrayOf(pidlfolder, cidl.toLong(), apidl, pdtinner, riid, ppv)).toInt()
}

public fun SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDefaultContextMenu", longArrayOf(pdcm, riid, ppv)).toInt()
}

public fun SHCreateDefaultExtractIcon(riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDefaultExtractIcon", longArrayOf(riid, ppv)).toInt()
}

public fun SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDefaultPropertiesOp", longArrayOf(psi, ppfileop)).toInt()
}

public fun SHCreateDirectory(hwnd: HWND, pszpath: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDirectory", longArrayOf(hwnd, pszpath)).toInt()
}

public fun SHCreateDirectoryExA(hwnd: HWND, pszpath: PCSTR, psa: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDirectoryExA", longArrayOf(hwnd, pszpath, psa)).toInt()
}

public fun SHCreateDirectoryExW(hwnd: HWND, pszpath: PCWSTR, psa: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateDirectoryExW", longArrayOf(hwnd, pszpath, psa)).toInt()
}

public fun SHCreateFileExtractIconW(pszfile: PCWSTR, dwfileattributes: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateFileExtractIconW", longArrayOf(pszfile, dwfileattributes.toLong(), riid, ppv)).toInt()
}

public fun SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateItemFromIDList", longArrayOf(pidl, riid, ppv)).toInt()
}

public fun SHCreateItemFromParsingName(pszpath: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateItemFromParsingName", longArrayOf(pszpath, pbc, riid, ppv)).toInt()
}

public fun SHCreateItemFromRelativeName(psiparent: Long, pszname: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateItemFromRelativeName", longArrayOf(psiparent, pszname, pbc, riid, ppv)).toInt()
}

public fun SHCreateItemInKnownFolder(kfid: Long, dwkfflags: UInt, pszitem: PCWSTR, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateItemInKnownFolder", longArrayOf(kfid, dwkfflags.toLong(), pszitem, riid, ppv)).toInt()
}

public fun SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateItemWithParent", longArrayOf(pidlparent, psfparent, pidl, riid, ppvitem)).toInt()
}

public fun SHCreateMemStream(pinit: Long, cbinit: UInt): Long {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateMemStream", longArrayOf(pinit, cbinit.toLong()))
}

public fun SHCreateProcessAsUserW(pscpi: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateProcessAsUserW", longArrayOf(pscpi)).toInt()
}

public fun SHCreatePropSheetExtArray(hkey: HKEY, pszsubkey: PCWSTR, max_iface: UInt): HPSXA {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreatePropSheetExtArray", longArrayOf(hkey, pszsubkey, max_iface.toLong()))
}

public fun SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateQueryCancelAutoPlayMoniker", longArrayOf(ppmoniker)).toInt()
}

public fun SHCreateShellFolderView(pcsfv: Long, ppsv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellFolderView", longArrayOf(pcsfv, ppsv)).toInt()
}

public fun SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellFolderViewEx", longArrayOf(pcsfv, ppsv)).toInt()
}

public fun SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellItem", longArrayOf(pidlparent, psfparent, pidl, ppsi)).toInt()
}

public fun SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: UInt, ppidl: Long, ppsiitemarray: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellItemArray", longArrayOf(pidlparent, psf, cidl.toLong(), ppidl, ppsiitemarray)).toInt()
}

public fun SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellItemArrayFromDataObject", longArrayOf(pdo, riid, ppv)).toInt()
}

public fun SHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: Long, ppsiitemarray: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellItemArrayFromIDLists", longArrayOf(cidl.toLong(), rgpidl, ppsiitemarray)).toInt()
}

public fun SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateShellItemArrayFromShellItem", longArrayOf(psi, riid, ppv)).toInt()
}

public fun SHCreateShellPalette(hdc: HDC): HPALETTE {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateShellPalette", longArrayOf(hdc))
}

public fun SHCreateStdEnumFmtEtc(cfmt: UInt, afmt: Long, ppenumformatetc: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHCreateStdEnumFmtEtc", longArrayOf(cfmt.toLong(), afmt, ppenumformatetc)).toInt()
}

public fun SHCreateStreamOnFileA(pszfile: PCSTR, grfmode: UInt, ppstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateStreamOnFileA", longArrayOf(pszfile, grfmode.toLong(), ppstm)).toInt()
}

public fun SHCreateStreamOnFileEx(pszfile: PCWSTR, grfmode: UInt, dwattributes: UInt, fcreate: BOOL, pstmtemplate: Long, ppstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateStreamOnFileEx", longArrayOf(pszfile, grfmode.toLong(), dwattributes.toLong(), fcreate.toLong(), pstmtemplate, ppstm)).toInt()
}

public fun SHCreateStreamOnFileW(pszfile: PCWSTR, grfmode: UInt, ppstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateStreamOnFileW", longArrayOf(pszfile, grfmode.toLong(), ppstm)).toInt()
}

public fun SHCreateThread(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateThread", longArrayOf(Win32DynamicFfi.objectSlot(pfnthreadproc), pdata, flags.toLong(), Win32DynamicFfi.objectSlot(pfncallback))).toInt()
}

public fun SHCreateThreadRef(pcref: Long, ppunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateThreadRef", longArrayOf(pcref, ppunk)).toInt()
}

public fun SHCreateThreadWithHandle(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE, phandle: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHCreateThreadWithHandle", longArrayOf(Win32DynamicFfi.objectSlot(pfnthreadproc), pdata, flags.toLong(), Win32DynamicFfi.objectSlot(pfncallback), phandle)).toInt()
}

public fun SHDefExtractIconA(psziconfile: PCSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHDefExtractIconA", longArrayOf(psziconfile, iindex.toLong(), uflags.toLong(), phiconlarge, phiconsmall, niconsize.toLong())).toInt()
}

public fun SHDefExtractIconW(psziconfile: PCWSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHDefExtractIconW", longArrayOf(psziconfile, iindex.toLong(), uflags.toLong(), phiconlarge, phiconsmall, niconsize.toLong())).toInt()
}

public fun SHDeleteEmptyKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHDeleteEmptyKeyA", longArrayOf(hkey, pszsubkey)).toUInt()
}

public fun SHDeleteEmptyKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHDeleteEmptyKeyW", longArrayOf(hkey, pszsubkey)).toUInt()
}

public fun SHDeleteKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHDeleteKeyA", longArrayOf(hkey, pszsubkey)).toUInt()
}

public fun SHDeleteKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHDeleteKeyW", longArrayOf(hkey, pszsubkey)).toUInt()
}

public fun SHDeleteValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHDeleteValueA", longArrayOf(hkey, pszsubkey, pszvalue)).toUInt()
}

public fun SHDeleteValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHDeleteValueW", longArrayOf(hkey, pszsubkey, pszvalue)).toUInt()
}

public fun SHDestroyPropSheetExtArray(hpsxa: HPSXA) {
    Win32DynamicFfi.invoke("shell32.dll", "SHDestroyPropSheetExtArray", longArrayOf(hpsxa))
}

public fun SHDoDragDrop(hwnd: HWND, pdata: Long, pdsrc: Long, dweffect: DROPEFFECT, pdweffect: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHDoDragDrop", longArrayOf(hwnd, pdata, pdsrc, dweffect.toLong(), pdweffect)).toInt()
}

public fun SHEmptyRecycleBinA(hwnd: HWND, pszrootpath: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHEmptyRecycleBinA", longArrayOf(hwnd, pszrootpath, dwflags.toLong())).toInt()
}

public fun SHEmptyRecycleBinW(hwnd: HWND, pszrootpath: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHEmptyRecycleBinW", longArrayOf(hwnd, pszrootpath, dwflags.toLong())).toInt()
}

public fun SHEnumKeyExA(hkey: HKEY, dwindex: UInt, pszname: PSTR, pcchname: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHEnumKeyExA", longArrayOf(hkey, dwindex.toLong(), pszname, pcchname)).toUInt()
}

public fun SHEnumKeyExW(hkey: HKEY, dwindex: UInt, pszname: PWSTR, pcchname: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHEnumKeyExW", longArrayOf(hkey, dwindex.toLong(), pszname, pcchname)).toUInt()
}

public fun SHEnumValueA(hkey: HKEY, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHEnumValueA", longArrayOf(hkey, dwindex.toLong(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHEnumValueW(hkey: HKEY, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHEnumValueW", longArrayOf(hkey, dwindex.toLong(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHEnumerateUnreadMailAccountsW(hkeyuser: HKEY, dwindex: UInt, pszmailaddress: PWSTR, cchmailaddress: Int): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHEnumerateUnreadMailAccountsW", longArrayOf(hkeyuser, dwindex.toLong(), pszmailaddress, cchmailaddress.toLong())).toInt()
}

public fun SHEvaluateSystemCommandTemplate(pszcmdtemplate: PCWSTR, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHEvaluateSystemCommandTemplate", longArrayOf(pszcmdtemplate, ppszapplication, ppszcommandline, ppszparameters)).toInt()
}

public fun SHFileOperationA(lpfileop: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHFileOperationA", longArrayOf(lpfileop)).toInt()
}

public fun SHFileOperationW(lpfileop: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHFileOperationW", longArrayOf(lpfileop)).toInt()
}

public fun SHFindFiles(pidlfolder: Long, pidlsavefile: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHFindFiles", longArrayOf(pidlfolder, pidlsavefile)).toInt()
}

public fun SHFind_InitMenuPopup(hmenu: HMENU, hwndowner: HWND, idcmdfirst: UInt, idcmdlast: UInt): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "SHFind_InitMenuPopup", longArrayOf(hmenu, hwndowner, idcmdfirst.toLong(), idcmdlast.toLong()))
}

public fun SHFlushSFCache() {
    Win32DynamicFfi.invoke("shell32.dll", "SHFlushSFCache", longArrayOf())
}

public fun SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: PSTR, cchbuf: UInt): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHFormatDateTimeA", longArrayOf(pft, pdwflags, pszbuf, cchbuf.toLong())).toInt()
}

public fun SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: PWSTR, cchbuf: UInt): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHFormatDateTimeW", longArrayOf(pft, pdwflags, pszbuf, cchbuf.toLong())).toInt()
}

public fun SHFormatDrive(hwnd: HWND, drive: UInt, fmtid: SHFMT_ID, options: UInt): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "SHFormatDrive", longArrayOf(hwnd, drive.toLong(), fmtid.toLong(), options.toLong())).toUInt()
}

public fun SHFree(pv: Long) {
    Win32DynamicFfi.invoke("shell32.dll", "SHFree", longArrayOf(pv))
}

public fun SHFreeNameMappings(hnamemappings: HANDLE) {
    Win32DynamicFfi.invoke("shell32.dll", "SHFreeNameMappings", longArrayOf(hnamemappings))
}

public fun SHFreeShared(hdata: HANDLE, dwprocessid: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHFreeShared", longArrayOf(hdata, dwprocessid.toLong())).toInt()
}

public fun SHGetAttributesFromDataObject(pdo: Long, dwattributemask: UInt, pdwattributes: Long, pcitems: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetAttributesFromDataObject", longArrayOf(pdo, dwattributemask.toLong(), pdwattributes, pcitems)).toInt()
}

public fun SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetDataFromIDListA", longArrayOf(psf, pidl, nformat.toLong(), pv, cb.toLong())).toInt()
}

public fun SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetDataFromIDListW", longArrayOf(psf, pidl, nformat.toLong(), pv, cb.toLong())).toInt()
}

public fun SHGetDesktopFolder(ppshf: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetDesktopFolder", longArrayOf(ppshf)).toInt()
}

public fun SHGetDiskFreeSpaceExA(pszdirectoryname: PCSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetDiskFreeSpaceExA", longArrayOf(pszdirectoryname, pulfreebytesavailabletocaller, pultotalnumberofbytes, pultotalnumberoffreebytes)).toInt()
}

public fun SHGetDiskFreeSpaceExW(pszdirectoryname: PCWSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetDiskFreeSpaceExW", longArrayOf(pszdirectoryname, pulfreebytesavailabletocaller, pultotalnumberofbytes, pultotalnumberoffreebytes)).toInt()
}

public fun SHGetDriveMedia(pszdrive: PCWSTR, pdwmediacontent: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetDriveMedia", longArrayOf(pszdrive, pdwmediacontent)).toInt()
}

public fun SHGetFileInfoA(pszpath: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFileInfoA", longArrayOf(pszpath, dwfileattributes.toLong(), psfi, cbfileinfo.toLong(), uflags.toLong())).toULong()
}

public fun SHGetFileInfoW(pszpath: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFileInfoW", longArrayOf(pszpath, dwfileattributes.toLong(), psfi, cbfileinfo.toLong(), uflags.toLong())).toULong()
}

public fun SHGetFolderLocation(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, ppidl: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFolderLocation", longArrayOf(hwnd, csidl.toLong(), htoken, dwflags.toLong(), ppidl)).toInt()
}

public fun SHGetFolderPathA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFolderPathA", longArrayOf(hwnd, csidl.toLong(), htoken, dwflags.toLong(), pszpath)).toInt()
}

public fun SHGetFolderPathAndSubDirA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCSTR, pszpath: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFolderPathAndSubDirA", longArrayOf(hwnd, csidl.toLong(), htoken, dwflags.toLong(), pszsubdir, pszpath)).toInt()
}

public fun SHGetFolderPathAndSubDirW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCWSTR, pszpath: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFolderPathAndSubDirW", longArrayOf(hwnd, csidl.toLong(), htoken, dwflags.toLong(), pszsubdir, pszpath)).toInt()
}

public fun SHGetFolderPathW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetFolderPathW", longArrayOf(hwnd, csidl.toLong(), htoken, dwflags.toLong(), pszpath)).toInt()
}

public fun SHGetIDListFromObject(punk: Long, ppidl: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetIDListFromObject", longArrayOf(punk, ppidl)).toInt()
}

public fun SHGetIconOverlayIndexA(psziconpath: PCSTR, iiconindex: Int): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetIconOverlayIndexA", longArrayOf(psziconpath, iiconindex.toLong())).toInt()
}

public fun SHGetIconOverlayIndexW(psziconpath: PCWSTR, iiconindex: Int): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetIconOverlayIndexW", longArrayOf(psziconpath, iiconindex.toLong())).toInt()
}

public fun SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetImageList", longArrayOf(iimagelist.toLong(), riid, ppvobj)).toInt()
}

public fun SHGetInstanceExplorer(ppunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetInstanceExplorer", longArrayOf(ppunk)).toInt()
}

public fun SHGetInverseCMAP(pbmap: Long, cbmap: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGetInverseCMAP", longArrayOf(pbmap, cbmap.toLong())).toInt()
}

public fun SHGetItemFromDataObject(pdtobj: Long, dwflags: DATAOBJ_GET_ITEM_FLAGS, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetItemFromDataObject", longArrayOf(pdtobj, dwflags.toLong(), riid, ppv)).toInt()
}

public fun SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetItemFromObject", longArrayOf(punk, riid, ppv)).toInt()
}

public fun SHGetKnownFolderIDList(rfid: Long, dwflags: UInt, htoken: HANDLE, ppidl: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetKnownFolderIDList", longArrayOf(rfid, dwflags.toLong(), htoken, ppidl)).toInt()
}

public fun SHGetKnownFolderItem(rfid: Long, flags: KNOWN_FOLDER_FLAG, htoken: HANDLE, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetKnownFolderItem", longArrayOf(rfid, flags.toLong(), htoken, riid, ppv)).toInt()
}

public fun SHGetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, ppszpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetKnownFolderPath", longArrayOf(rfid, dwflags.toLong(), htoken, ppszpath)).toInt()
}

public fun SHGetLocalizedName(pszpath: PCWSTR, pszresmodule: PWSTR, cch: UInt, pidsres: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetLocalizedName", longArrayOf(pszpath, pszresmodule, cch.toLong(), pidsres)).toInt()
}

public fun SHGetMalloc(ppmalloc: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetMalloc", longArrayOf(ppmalloc)).toInt()
}

public fun SHGetNameFromIDList(pidl: Long, sigdnname: SIGDN, ppszname: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetNameFromIDList", longArrayOf(pidl, sigdnname.toLong(), ppszname)).toInt()
}

public fun SHGetNewLinkInfoA(pszlinkto: PCSTR, pszdir: PCSTR, pszname: PSTR, pfmustcopy: Long, uflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetNewLinkInfoA", longArrayOf(pszlinkto, pszdir, pszname, pfmustcopy, uflags.toLong())).toInt()
}

public fun SHGetNewLinkInfoW(pszlinkto: PCWSTR, pszdir: PCWSTR, pszname: PWSTR, pfmustcopy: Long, uflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetNewLinkInfoW", longArrayOf(pszlinkto, pszdir, pszname, pfmustcopy, uflags.toLong())).toInt()
}

public fun SHGetPathFromIDListA(pidl: Long, pszpath: PSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetPathFromIDListA", longArrayOf(pidl, pszpath)).toInt()
}

public fun SHGetPathFromIDListEx(pidl: Long, pszpath: PWSTR, cchpath: UInt, uopts: GPFIDL_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetPathFromIDListEx", longArrayOf(pidl, pszpath, cchpath.toLong(), uopts.toLong())).toInt()
}

public fun SHGetPathFromIDListW(pidl: Long, pszpath: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetPathFromIDListW", longArrayOf(pidl, pszpath)).toInt()
}

public fun SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetRealIDL", longArrayOf(psf, pidlsimple, ppidlreal)).toInt()
}

public fun SHGetSetFolderCustomSettings(pfcs: Long, pszpath: PCWSTR, dwreadwrite: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetSetFolderCustomSettings", longArrayOf(pfcs, pszpath, dwreadwrite.toLong())).toInt()
}

public fun SHGetSetSettings(lpss: Long, dwmask: SSF_MASK, bset: BOOL) {
    Win32DynamicFfi.invoke("shell32.dll", "SHGetSetSettings", longArrayOf(lpss, dwmask.toLong(), bset.toLong()))
}

public fun SHGetSettings(psfs: Long, dwmask: UInt) {
    Win32DynamicFfi.invoke("shell32.dll", "SHGetSettings", longArrayOf(psfs, dwmask.toLong()))
}

public fun SHGetSpecialFolderLocation(hwnd: HWND, csidl: Int, ppidl: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetSpecialFolderLocation", longArrayOf(hwnd, csidl.toLong(), ppidl)).toInt()
}

public fun SHGetSpecialFolderPathA(hwnd: HWND, pszpath: PSTR, csidl: Int, fcreate: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetSpecialFolderPathA", longArrayOf(hwnd, pszpath, csidl.toLong(), fcreate.toLong())).toInt()
}

public fun SHGetSpecialFolderPathW(hwnd: HWND, pszpath: PWSTR, csidl: Int, fcreate: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetSpecialFolderPathW", longArrayOf(hwnd, pszpath, csidl.toLong(), fcreate.toLong())).toInt()
}

public fun SHGetStockIconInfo(siid: SHSTOCKICONID, uflags: SHGSI_FLAGS, psii: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetStockIconInfo", longArrayOf(siid.toLong(), uflags.toLong(), psii)).toInt()
}

public fun SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetTemporaryPropertyForItem", longArrayOf(psi, propkey, ppropvar)).toInt()
}

public fun SHGetThreadRef(ppunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGetThreadRef", longArrayOf(ppunk)).toInt()
}

public fun SHGetUnreadMailCountW(hkeyuser: HKEY, pszmailaddress: PCWSTR, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: PWSTR, cchshellexecutecommand: Int): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetUnreadMailCountW", longArrayOf(hkeyuser, pszmailaddress, pdwcount, pfiletime, pszshellexecutecommand, cchshellexecutecommand.toLong())).toInt()
}

public fun SHGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGetValueA", longArrayOf(hkey, pszsubkey, pszvalue, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGetValueW", longArrayOf(hkey, pszsubkey, pszvalue, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHGetViewStatePropertyBag(pidl: Long, pszbagname: PCWSTR, dwflags: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGetViewStatePropertyBag", longArrayOf(pidl, pszbagname, dwflags.toLong(), riid, ppv)).toInt()
}

public fun SHGlobalCounterDecrement(id: SHGLOBALCOUNTER): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGlobalCounterDecrement", longArrayOf(id.toLong())).toInt()
}

public fun SHGlobalCounterGetValue(id: SHGLOBALCOUNTER): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGlobalCounterGetValue", longArrayOf(id.toLong())).toInt()
}

public fun SHGlobalCounterIncrement(id: SHGLOBALCOUNTER): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHGlobalCounterIncrement", longArrayOf(id.toLong())).toInt()
}

public fun SHHandleUpdateImage(pidlextra: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHHandleUpdateImage", longArrayOf(pidlextra)).toInt()
}

public fun SHILCreateFromPath(pszpath: PCWSTR, ppidl: Long, rgfinout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHILCreateFromPath", longArrayOf(pszpath, ppidl, rgfinout)).toInt()
}

public fun SHInvokePrinterCommandA(hwnd: HWND, uaction: UInt, lpbuf1: PCSTR, lpbuf2: PCSTR, fmodal: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHInvokePrinterCommandA", longArrayOf(hwnd, uaction.toLong(), lpbuf1, lpbuf2, fmodal.toLong())).toInt()
}

public fun SHInvokePrinterCommandW(hwnd: HWND, uaction: UInt, lpbuf1: PCWSTR, lpbuf2: PCWSTR, fmodal: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHInvokePrinterCommandW", longArrayOf(hwnd, uaction.toLong(), lpbuf1, lpbuf2, fmodal.toLong())).toInt()
}

public fun SHIsFileAvailableOffline(pwszpath: PCWSTR, pdwstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHIsFileAvailableOffline", longArrayOf(pwszpath, pdwstatus)).toInt()
}

public fun SHIsLowMemoryMachine(dwtype: UInt): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHIsLowMemoryMachine", longArrayOf(dwtype.toLong())).toInt()
}

public fun SHLimitInputEdit(hwndedit: HWND, psf: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHLimitInputEdit", longArrayOf(hwndedit, psf)).toInt()
}

public fun SHLoadInProc(rclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHLoadInProc", longArrayOf(rclsid)).toInt()
}

public fun SHLoadIndirectString(pszsource: PCWSTR, pszoutbuf: PWSTR, cchoutbuf: UInt, ppvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHLoadIndirectString", longArrayOf(pszsource, pszoutbuf, cchoutbuf.toLong(), ppvreserved)).toInt()
}

public fun SHLoadNonloadedIconOverlayIdentifiers(): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHLoadNonloadedIconOverlayIdentifiers", longArrayOf()).toInt()
}

public fun SHLockShared(hdata: HANDLE, dwprocessid: UInt): Long {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHLockShared", longArrayOf(hdata, dwprocessid.toLong()))
}

public fun SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "SHMapPIDLToSystemImageListIndex", longArrayOf(pshf, pidl, piindexsel)).toInt()
}

public fun SHMessageBoxCheckA(hwnd: HWND, psztext: PCSTR, pszcaption: PCSTR, utype: UInt, idefault: Int, pszregval: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHMessageBoxCheckA", longArrayOf(hwnd, psztext, pszcaption, utype.toLong(), idefault.toLong(), pszregval)).toInt()
}

public fun SHMessageBoxCheckW(hwnd: HWND, psztext: PCWSTR, pszcaption: PCWSTR, utype: UInt, idefault: Int, pszregval: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHMessageBoxCheckW", longArrayOf(hwnd, psztext, pszcaption, utype.toLong(), idefault.toLong(), pszregval)).toInt()
}

public fun SHMultiFileProperties(pdtobj: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHMultiFileProperties", longArrayOf(pdtobj, dwflags.toLong())).toInt()
}

public fun SHObjectProperties(hwnd: HWND, shopobjecttype: UInt, pszobjectname: PCWSTR, pszpropertypage: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHObjectProperties", longArrayOf(hwnd, shopobjecttype.toLong(), pszobjectname, pszpropertypage)).toInt()
}

public fun SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: UInt, apidl: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHOpenFolderAndSelectItems", longArrayOf(pidlfolder, cidl.toLong(), apidl, dwflags.toLong())).toInt()
}

public fun SHOpenPropSheetW(pszcaption: PCWSTR, ahkeys: Long, ckeys: UInt, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHOpenPropSheetW", longArrayOf(pszcaption, ahkeys, ckeys.toLong(), pclsiddefault, pdtobj, psb, pstartpage)).toInt()
}

public fun SHOpenRegStream2A(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHOpenRegStream2A", longArrayOf(hkey, pszsubkey, pszvalue, grfmode.toLong()))
}

public fun SHOpenRegStream2W(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHOpenRegStream2W", longArrayOf(hkey, pszsubkey, pszvalue, grfmode.toLong()))
}

public fun SHOpenRegStreamA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHOpenRegStreamA", longArrayOf(hkey, pszsubkey, pszvalue, grfmode.toLong()))
}

public fun SHOpenRegStreamW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHOpenRegStreamW", longArrayOf(hkey, pszsubkey, pszvalue, grfmode.toLong()))
}

public fun SHOpenWithDialog(hwndparent: HWND, poainfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHOpenWithDialog", longArrayOf(hwndparent, poainfo)).toInt()
}

public fun SHParseDisplayName(pszname: PCWSTR, pbc: Long, ppidl: Long, sfgaoin: UInt, psfgaoout: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHParseDisplayName", longArrayOf(pszname, pbc, ppidl, sfgaoin.toLong(), psfgaoout)).toInt()
}

public fun SHPathPrepareForWriteA(hwnd: HWND, punkenablemodless: Long, pszpath: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHPathPrepareForWriteA", longArrayOf(hwnd, punkenablemodless, pszpath, dwflags.toLong())).toInt()
}

public fun SHPathPrepareForWriteW(hwnd: HWND, punkenablemodless: Long, pszpath: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHPathPrepareForWriteW", longArrayOf(hwnd, punkenablemodless, pszpath, dwflags.toLong())).toInt()
}

public fun SHQueryInfoKeyA(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHQueryInfoKeyA", longArrayOf(hkey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen)).toUInt()
}

public fun SHQueryInfoKeyW(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHQueryInfoKeyW", longArrayOf(hkey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen)).toUInt()
}

public fun SHQueryRecycleBinA(pszrootpath: PCSTR, pshqueryrbinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHQueryRecycleBinA", longArrayOf(pszrootpath, pshqueryrbinfo)).toInt()
}

public fun SHQueryRecycleBinW(pszrootpath: PCWSTR, pshqueryrbinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHQueryRecycleBinW", longArrayOf(pszrootpath, pshqueryrbinfo)).toInt()
}

public fun SHQueryUserNotificationState(pquns: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHQueryUserNotificationState", longArrayOf(pquns)).toInt()
}

public fun SHQueryValueExA(hkey: HKEY, pszvalue: PCSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHQueryValueExA", longArrayOf(hkey, pszvalue, pdwreserved, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHQueryValueExW(hkey: HKEY, pszvalue: PCWSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHQueryValueExW", longArrayOf(hkey, pszvalue, pdwreserved, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHRegCloseUSKey(huskey: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegCloseUSKey", longArrayOf(huskey)).toUInt()
}

public fun SHRegCreateUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegCreateUSKeyA", longArrayOf(pszpath, samdesired.toLong(), hrelativeuskey, phnewuskey, dwflags.toLong())).toUInt()
}

public fun SHRegCreateUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegCreateUSKeyW", longArrayOf(pwzpath, samdesired.toLong(), hrelativeuskey, phnewuskey, dwflags.toLong())).toUInt()
}

public fun SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegDeleteEmptyUSKeyA", longArrayOf(huskey, pszsubkey, delregflags.toLong())).toUInt()
}

public fun SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegDeleteEmptyUSKeyW", longArrayOf(huskey, pwzsubkey, delregflags.toLong())).toUInt()
}

public fun SHRegDeleteUSValueA(huskey: Long, pszvalue: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegDeleteUSValueA", longArrayOf(huskey, pszvalue, delregflags.toLong())).toUInt()
}

public fun SHRegDeleteUSValueW(huskey: Long, pwzvalue: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegDeleteUSValueW", longArrayOf(huskey, pwzvalue, delregflags.toLong())).toUInt()
}

public fun SHRegDuplicateHKey(hkey: HKEY): HKEY {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegDuplicateHKey", longArrayOf(hkey))
}

public fun SHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: PSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegEnumUSKeyA", longArrayOf(huskey, dwindex.toLong(), pszname, pcchname, enumregflags.toLong())).toUInt()
}

public fun SHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: PWSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegEnumUSKeyW", longArrayOf(huskey, dwindex.toLong(), pwzname, pcchname, enumregflags.toLong())).toUInt()
}

public fun SHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegEnumUSValueA", longArrayOf(huskey, dwindex.toLong(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata, enumregflags.toLong())).toUInt()
}

public fun SHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegEnumUSValueW", longArrayOf(huskey, dwindex.toLong(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata, enumregflags.toLong())).toUInt()
}

public fun SHRegGetBoolUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetBoolUSValueA", longArrayOf(pszsubkey, pszvalue, fignorehkcu.toLong(), fdefault.toLong())).toInt()
}

public fun SHRegGetBoolUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetBoolUSValueW", longArrayOf(pszsubkey, pszvalue, fignorehkcu.toLong(), fdefault.toLong())).toInt()
}
