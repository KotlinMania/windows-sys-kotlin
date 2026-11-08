package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.LPFNSVADDPROPSHEETPAGE
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HMENU
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MESSAGEBOX_STYLE
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SHOW_WINDOW_CMD

public fun interface FnCallbackPart2 {
    public operator fun invoke(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM, uidsubclass: ULong, dwrefdata: ULong): LRESULT
}

public fun SHRegGetIntW(hk: HKEY, pwzkey: PCWSTR, idefault: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetIntW", longArrayOf(hk, pwzkey, idefault.toLong())).toInt()
}

public fun SHRegGetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pszpath: PSTR, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetPathA", longArrayOf(hkey, pcszsubkey, pcszvalue, pszpath, dwflags.toLong())).toUInt()
}

public fun SHRegGetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pszpath: PWSTR, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetPathW", longArrayOf(hkey, pcszsubkey, pcszvalue, pszpath, dwflags.toLong())).toUInt()
}

public fun SHRegGetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetUSValueA", longArrayOf(pszsubkey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu.toLong(), pvdefaultdata, dwdefaultdatasize.toLong())).toUInt()
}

public fun SHRegGetUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetUSValueW", longArrayOf(pszsubkey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu.toLong(), pvdefaultdata, dwdefaultdatasize.toLong())).toUInt()
}

public fun SHRegGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetValueA", longArrayOf(hkey, pszsubkey, pszvalue, srrfflags.toLong(), pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHRegGetValueFromHKCUHKLM(pwszkey: PCWSTR, pwszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetValueFromHKCUHKLM", longArrayOf(pwszkey, pwszvalue, srrfflags.toLong(), pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHRegGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegGetValueW", longArrayOf(hkey, pszsubkey, pszvalue, srrfflags.toLong(), pdwtype, pvdata, pcbdata)).toUInt()
}

public fun SHRegOpenUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegOpenUSKeyA", longArrayOf(pszpath, samdesired.toLong(), hrelativeuskey, phnewuskey, fignorehkcu.toLong())).toUInt()
}

public fun SHRegOpenUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegOpenUSKeyW", longArrayOf(pwzpath, samdesired.toLong(), hrelativeuskey, phnewuskey, fignorehkcu.toLong())).toUInt()
}

public fun SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegQueryInfoUSKeyA", longArrayOf(huskey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen, enumregflags.toLong())).toUInt()
}

public fun SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegQueryInfoUSKeyW", longArrayOf(huskey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen, enumregflags.toLong())).toUInt()
}

public fun SHRegQueryUSValueA(huskey: Long, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegQueryUSValueA", longArrayOf(huskey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu.toLong(), pvdefaultdata, dwdefaultdatasize.toLong())).toUInt()
}

public fun SHRegQueryUSValueW(huskey: Long, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegQueryUSValueW", longArrayOf(huskey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu.toLong(), pvdefaultdata, dwdefaultdatasize.toLong())).toUInt()
}

public fun SHRegSetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pcszpath: PCSTR, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegSetPathA", longArrayOf(hkey, pcszsubkey, pcszvalue, pcszpath, dwflags.toLong())).toUInt()
}

public fun SHRegSetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pcszpath: PCWSTR, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegSetPathW", longArrayOf(hkey, pcszsubkey, pcszvalue, pcszpath, dwflags.toLong())).toUInt()
}

public fun SHRegSetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegSetUSValueA", longArrayOf(pszsubkey, pszvalue, dwtype.toLong(), pvdata, cbdata.toLong(), dwflags.toLong())).toUInt()
}

public fun SHRegSetUSValueW(pwzsubkey: PCWSTR, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegSetUSValueW", longArrayOf(pwzsubkey, pwzvalue, dwtype.toLong(), pvdata, cbdata.toLong(), dwflags.toLong())).toUInt()
}

public fun SHRegWriteUSValueA(huskey: Long, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegWriteUSValueA", longArrayOf(huskey, pszvalue, dwtype.toLong(), pvdata, cbdata.toLong(), dwflags.toLong())).toUInt()
}

public fun SHRegWriteUSValueW(huskey: Long, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHRegWriteUSValueW", longArrayOf(huskey, pwzvalue, dwtype.toLong(), pvdata, cbdata.toLong(), dwflags.toLong())).toUInt()
}

public fun SHReleaseThreadRef(): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHReleaseThreadRef", longArrayOf()).toInt()
}

public fun SHRemoveLocalizedName(pszpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHRemoveLocalizedName", longArrayOf(pszpath)).toInt()
}

public fun SHReplaceFromPropSheetExtArray(hpsxa: HPSXA, upageid: UInt, lpfnreplacewith: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "SHReplaceFromPropSheetExtArray", longArrayOf(hpsxa, upageid.toLong(), Win32DynamicFfi.objectSlot(lpfnreplacewith), lparam)).toUInt()
}

public fun SHResolveLibrary(psilibrary: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHResolveLibrary", longArrayOf(psilibrary)).toInt()
}

public fun SHRestricted(rest: RESTRICTIONS): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "SHRestricted", longArrayOf(rest.toLong())).toUInt()
}

public fun SHSendMessageBroadcastA(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHSendMessageBroadcastA", longArrayOf(umsg.toLong(), wparam.toLong(), lparam))
}

public fun SHSendMessageBroadcastW(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHSendMessageBroadcastW", longArrayOf(umsg.toLong(), wparam.toLong(), lparam))
}

public fun SHSetDefaultProperties(hwnd: HWND, psi: Long, dwfileopflags: UInt, pfops: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetDefaultProperties", longArrayOf(hwnd, psi, dwfileopflags.toLong(), pfops)).toInt()
}

public fun SHSetFolderPathA(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetFolderPathA", longArrayOf(csidl.toLong(), htoken, dwflags.toLong(), pszpath)).toInt()
}

public fun SHSetFolderPathW(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetFolderPathW", longArrayOf(csidl.toLong(), htoken, dwflags.toLong(), pszpath)).toInt()
}

public fun SHSetInstanceExplorer(punk: Long) {
    Win32DynamicFfi.invoke("shell32.dll", "SHSetInstanceExplorer", longArrayOf(punk))
}

public fun SHSetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, pszpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetKnownFolderPath", longArrayOf(rfid, dwflags.toLong(), htoken, pszpath)).toInt()
}

public fun SHSetLocalizedName(pszpath: PCWSTR, pszresmodule: PCWSTR, idsres: Int): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetLocalizedName", longArrayOf(pszpath, pszresmodule, idsres.toLong())).toInt()
}

public fun SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetTemporaryPropertyForItem", longArrayOf(psi, propkey, propvar)).toInt()
}

public fun SHSetThreadRef(punk: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHSetThreadRef", longArrayOf(punk)).toInt()
}

public fun SHSetUnreadMailCountW(pszmailaddress: PCWSTR, dwcount: UInt, pszshellexecutecommand: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSetUnreadMailCountW", longArrayOf(pszmailaddress, dwcount.toLong(), pszshellexecutecommand)).toInt()
}

public fun SHSetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHSetValueA", longArrayOf(hkey, pszsubkey, pszvalue, dwtype.toLong(), pvdata, cbdata.toLong())).toInt()
}

public fun SHSetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHSetValueW", longArrayOf(hkey, pszsubkey, pszvalue, dwtype.toLong(), pvdata, cbdata.toLong())).toInt()
}

public fun SHShellFolderView_Message(hwndmain: HWND, umsg: UInt, lparam: LPARAM): LRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHShellFolderView_Message", longArrayOf(hwndmain, umsg.toLong(), lparam))
}

public fun SHShowManageLibraryUI(psilibrary: Long, hwndowner: HWND, psztitle: PCWSTR, pszinstruction: PCWSTR, lmdoptions: LIBRARYMANAGEDIALOGOPTIONS): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHShowManageLibraryUI", longArrayOf(psilibrary, hwndowner, psztitle, pszinstruction, lmdoptions.toLong())).toInt()
}

public fun SHSimpleIDListFromPath(pszpath: PCWSTR): Long {
    return Win32DynamicFfi.invoke("shell32.dll", "SHSimpleIDListFromPath", longArrayOf(pszpath))
}

public fun SHSkipJunction(pbc: Long, pclsid: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHSkipJunction", longArrayOf(pbc, pclsid)).toInt()
}

public fun SHStartNetConnectionDialogW(hwnd: HWND, pszremotename: PCWSTR, dwtype: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHStartNetConnectionDialogW", longArrayOf(hwnd, pszremotename, dwtype.toLong())).toInt()
}

public fun SHStrDupA(psz: PCSTR, ppwsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHStrDupA", longArrayOf(psz, ppwsz)).toInt()
}

public fun SHStrDupW(psz: PCWSTR, ppwsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHStrDupW", longArrayOf(psz, ppwsz)).toInt()
}

public fun SHStripMneumonicA(pszmenu: PSTR): Byte {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHStripMneumonicA", longArrayOf(pszmenu)).toByte()
}

public fun SHStripMneumonicW(pszmenu: PWSTR): UShort {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHStripMneumonicW", longArrayOf(pszmenu)).toUShort()
}

public fun SHTestTokenMembership(htoken: HANDLE, ulrid: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHTestTokenMembership", longArrayOf(htoken, ulrid.toLong())).toInt()
}

public fun SHUnicodeToAnsi(pwszsrc: PCWSTR, pszdst: PSTR, cchbuf: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHUnicodeToAnsi", longArrayOf(pwszsrc, pszdst, cchbuf.toLong())).toInt()
}

public fun SHUnicodeToUnicode(pwzsrc: PCWSTR, pwzdst: PWSTR, cwchbuf: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHUnicodeToUnicode", longArrayOf(pwzsrc, pwzdst, cwchbuf.toLong())).toInt()
}

public fun SHUnlockShared(pvdata: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "SHUnlockShared", longArrayOf(pvdata)).toInt()
}

public fun SHUpdateImageA(pszhashitem: PCSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    Win32DynamicFfi.invoke("shell32.dll", "SHUpdateImageA", longArrayOf(pszhashitem, iindex.toLong(), uflags.toLong(), iimageindex.toLong()))
}

public fun SHUpdateImageW(pszhashitem: PCWSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    Win32DynamicFfi.invoke("shell32.dll", "SHUpdateImageW", longArrayOf(pszhashitem, iindex.toLong(), uflags.toLong(), iimageindex.toLong()))
}

public fun SHValidateUNC(hwndowner: HWND, pszfile: PWSTR, fconnect: UInt): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SHValidateUNC", longArrayOf(hwndowner, pszfile, fconnect.toLong())).toInt()
}

public fun SetCurrentProcessExplicitAppUserModelID(appid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SetCurrentProcessExplicitAppUserModelID", longArrayOf(appid)).toInt()
}

public fun SetMenuContextHelpId(param0: HMENU, param1: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenuContextHelpId", longArrayOf(param0, param1.toLong())).toInt()
}

public fun SetWindowContextHelpId(param0: HWND, param1: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowContextHelpId", longArrayOf(param0, param1.toLong())).toInt()
}

public fun SetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, dwrefdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "SetWindowSubclass", longArrayOf(hwnd, Win32DynamicFfi.objectSlot(pfnsubclass), uidsubclass.toLong(), dwrefdata.toLong())).toInt()
}

public fun ShellAboutA(hwnd: HWND, szapp: PCSTR, szotherstuff: PCSTR, hicon: HICON): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "ShellAboutA", longArrayOf(hwnd, szapp, szotherstuff, hicon)).toInt()
}

public fun ShellAboutW(hwnd: HWND, szapp: PCWSTR, szotherstuff: PCWSTR, hicon: HICON): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "ShellAboutW", longArrayOf(hwnd, szapp, szotherstuff, hicon)).toInt()
}

public fun ShellExecuteA(hwnd: HWND, lpoperation: PCSTR, lpfile: PCSTR, lpparameters: PCSTR, lpdirectory: PCSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE {
    return Win32DynamicFfi.invoke("shell32.dll", "ShellExecuteA", longArrayOf(hwnd, lpoperation, lpfile, lpparameters, lpdirectory, nshowcmd.toLong()))
}

public fun ShellExecuteExA(pexecinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "ShellExecuteExA", longArrayOf(pexecinfo)).toInt()
}

public fun ShellExecuteExW(pexecinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "ShellExecuteExW", longArrayOf(pexecinfo)).toInt()
}

public fun ShellExecuteW(hwnd: HWND, lpoperation: PCWSTR, lpfile: PCWSTR, lpparameters: PCWSTR, lpdirectory: PCWSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE {
    return Win32DynamicFfi.invoke("shell32.dll", "ShellExecuteW", longArrayOf(hwnd, lpoperation, lpfile, lpparameters, lpdirectory, nshowcmd.toLong()))
}

public fun ShellMessageBoxA(happinst: HINSTANCE, hwnd: HWND, lpctext: PCSTR, lpctitle: PCSTR, fustyle: MESSAGEBOX_STYLE, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ShellMessageBoxA", longArrayOf(happinst, hwnd, lpctext, lpctitle, fustyle.toLong()) + variadicArgs).toInt()
}

public fun ShellMessageBoxW(happinst: HINSTANCE, hwnd: HWND, lpctext: PCWSTR, lpctitle: PCWSTR, fustyle: MESSAGEBOX_STYLE, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "ShellMessageBoxW", longArrayOf(happinst, hwnd, lpctext, lpctitle, fustyle.toLong()) + variadicArgs).toInt()
}

public fun Shell_GetCachedImageIndex(pwsziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_GetCachedImageIndex", longArrayOf(pwsziconpath, iiconindex.toLong(), uiconflags.toLong())).toInt()
}

public fun Shell_GetCachedImageIndexA(psziconpath: PCSTR, iiconindex: Int, uiconflags: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_GetCachedImageIndexA", longArrayOf(psziconpath, iiconindex.toLong(), uiconflags.toLong())).toInt()
}

public fun Shell_GetCachedImageIndexW(psziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_GetCachedImageIndexW", longArrayOf(psziconpath, iiconindex.toLong(), uiconflags.toLong())).toInt()
}

public fun Shell_GetImageLists(phiml: Long, phimlsmall: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_GetImageLists", longArrayOf(phiml, phimlsmall)).toInt()
}

public fun Shell_MergeMenus(hmdst: HMENU, hmsrc: HMENU, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MM_FLAGS): UInt {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_MergeMenus", longArrayOf(hmdst, hmsrc, uinsert.toLong(), uidadjust.toLong(), uidadjustmax.toLong(), uflags.toLong())).toUInt()
}

public fun Shell_NotifyIconA(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_NotifyIconA", longArrayOf(dwmessage.toLong(), lpdata)).toInt()
}

public fun Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_NotifyIconGetRect", longArrayOf(identifier, iconlocation)).toInt()
}

public fun Shell_NotifyIconW(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "Shell_NotifyIconW", longArrayOf(dwmessage.toLong(), lpdata)).toInt()
}

public fun SignalFileOpen(pidl: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "SignalFileOpen", longArrayOf(pidl)).toInt()
}

public fun SoftwareUpdateMessageBox(hwnd: HWND, pszdistunit: PCWSTR, dwflags: UInt, psdi: Long): UInt {
    return Win32DynamicFfi.invoke("shdocvw.dll", "SoftwareUpdateMessageBox", longArrayOf(hwnd, pszdistunit, dwflags.toLong(), psdi)).toUInt()
}

public fun StgMakeUniqueName(pstgparent: Long, pszfilespec: PCWSTR, grfmode: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "StgMakeUniqueName", longArrayOf(pstgparent, pszfilespec, grfmode.toLong(), riid, ppv)).toInt()
}

public fun StrCSpnA(pszstr: PCSTR, pszset: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCSpnA", longArrayOf(pszstr, pszset)).toInt()
}

public fun StrCSpnIA(pszstr: PCSTR, pszset: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCSpnIA", longArrayOf(pszstr, pszset)).toInt()
}

public fun StrCSpnIW(pszstr: PCWSTR, pszset: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCSpnIW", longArrayOf(pszstr, pszset)).toInt()
}

public fun StrCSpnW(pszstr: PCWSTR, pszset: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCSpnW", longArrayOf(pszstr, pszset)).toInt()
}

public fun StrCatBuffA(pszdest: PSTR, pszsrc: PCSTR, cchdestbuffsize: Int): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCatBuffA", longArrayOf(pszdest, pszsrc, cchdestbuffsize.toLong()))
}

public fun StrCatBuffW(pszdest: PWSTR, pszsrc: PCWSTR, cchdestbuffsize: Int): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCatBuffW", longArrayOf(pszdest, pszsrc, cchdestbuffsize.toLong()))
}

public fun StrCatChainW(pszdst: PWSTR, cchdst: UInt, ichat: UInt, pszsrc: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCatChainW", longArrayOf(pszdst, cchdst.toLong(), ichat.toLong(), pszsrc)).toUInt()
}

public fun StrCatW(psz1: PWSTR, psz2: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCatW", longArrayOf(psz1, psz2))
}

public fun StrChrA(pszstart: PCSTR, wmatch: UShort): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrChrA", longArrayOf(pszstart, wmatch.toLong()))
}

public fun StrChrIA(pszstart: PCSTR, wmatch: UShort): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrChrIA", longArrayOf(pszstart, wmatch.toLong()))
}

public fun StrChrIW(pszstart: PCWSTR, wmatch: UShort): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrChrIW", longArrayOf(pszstart, wmatch.toLong()))
}

public fun StrChrNIW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrChrNIW", longArrayOf(pszstart, wmatch.toLong(), cchmax.toLong()))
}

public fun StrChrNW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrChrNW", longArrayOf(pszstart, wmatch.toLong(), cchmax.toLong()))
}

public fun StrChrW(pszstart: PCWSTR, wmatch: UShort): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrChrW", longArrayOf(pszstart, wmatch.toLong()))
}

public fun StrCmpCA(pszstr1: PCSTR, pszstr2: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpCA", longArrayOf(pszstr1, pszstr2)).toInt()
}

public fun StrCmpCW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpCW", longArrayOf(pszstr1, pszstr2)).toInt()
}

public fun StrCmpICA(pszstr1: PCSTR, pszstr2: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpICA", longArrayOf(pszstr1, pszstr2)).toInt()
}

public fun StrCmpICW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpICW", longArrayOf(pszstr1, pszstr2)).toInt()
}

public fun StrCmpIW(psz1: PCWSTR, psz2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpIW", longArrayOf(psz1, psz2)).toInt()
}

public fun StrCmpLogicalW(psz1: PCWSTR, psz2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpLogicalW", longArrayOf(psz1, psz2)).toInt()
}

public fun StrCmpNA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNA", longArrayOf(psz1, psz2, nchar.toLong())).toInt()
}

public fun StrCmpNCA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNCA", longArrayOf(pszstr1, pszstr2, nchar.toLong())).toInt()
}

public fun StrCmpNCW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNCW", longArrayOf(pszstr1, pszstr2, nchar.toLong())).toInt()
}

public fun StrCmpNIA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNIA", longArrayOf(psz1, psz2, nchar.toLong())).toInt()
}

public fun StrCmpNICA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNICA", longArrayOf(pszstr1, pszstr2, nchar.toLong())).toInt()
}

public fun StrCmpNICW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNICW", longArrayOf(pszstr1, pszstr2, nchar.toLong())).toInt()
}

public fun StrCmpNIW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNIW", longArrayOf(psz1, psz2, nchar.toLong())).toInt()
}

public fun StrCmpNW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpNW", longArrayOf(psz1, psz2, nchar.toLong())).toInt()
}

public fun StrCmpW(psz1: PCWSTR, psz2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCmpW", longArrayOf(psz1, psz2)).toInt()
}

public fun StrCpyNW(pszdst: PWSTR, pszsrc: PCWSTR, cchmax: Int): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCpyNW", longArrayOf(pszdst, pszsrc, cchmax.toLong()))
}

public fun StrCpyW(psz1: PWSTR, psz2: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrCpyW", longArrayOf(psz1, psz2))
}

public fun StrDupA(pszsrch: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrDupA", longArrayOf(pszsrch))
}

public fun StrDupW(pszsrch: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrDupW", longArrayOf(pszsrch))
}

public fun StrFormatByteSize64A(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFormatByteSize64A", longArrayOf(qdw, pszbuf, cchbuf.toLong()))
}

public fun StrFormatByteSizeA(dw: UInt, pszbuf: PSTR, cchbuf: UInt): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFormatByteSizeA", longArrayOf(dw.toLong(), pszbuf, cchbuf.toLong()))
}

public fun StrFormatByteSizeEx(ull: ULong, flags: SFBS_FLAGS, pszbuf: PWSTR, cchbuf: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFormatByteSizeEx", longArrayOf(ull.toLong(), flags.toLong(), pszbuf, cchbuf.toLong())).toInt()
}

public fun StrFormatByteSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFormatByteSizeW", longArrayOf(qdw, pszbuf, cchbuf.toLong()))
}

public fun StrFormatKBSizeA(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFormatKBSizeA", longArrayOf(qdw, pszbuf, cchbuf.toLong()))
}

public fun StrFormatKBSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFormatKBSizeW", longArrayOf(qdw, pszbuf, cchbuf.toLong()))
}

public fun StrFromTimeIntervalA(pszout: PSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFromTimeIntervalA", longArrayOf(pszout, cchmax.toLong(), dwtimems.toLong(), digits.toLong())).toInt()
}

public fun StrFromTimeIntervalW(pszout: PWSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrFromTimeIntervalW", longArrayOf(pszout, cchmax.toLong(), dwtimems.toLong(), digits.toLong())).toInt()
}

public fun StrIsIntlEqualA(fcasesens: BOOL, pszstring1: PCSTR, pszstring2: PCSTR, nchar: Int): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrIsIntlEqualA", longArrayOf(fcasesens.toLong(), pszstring1, pszstring2, nchar.toLong())).toInt()
}

public fun StrIsIntlEqualW(fcasesens: BOOL, pszstring1: PCWSTR, pszstring2: PCWSTR, nchar: Int): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrIsIntlEqualW", longArrayOf(fcasesens.toLong(), pszstring1, pszstring2, nchar.toLong())).toInt()
}

public fun StrNCatA(psz1: PSTR, psz2: PCSTR, cchmax: Int): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrNCatA", longArrayOf(psz1, psz2, cchmax.toLong()))
}

public fun StrNCatW(psz1: PWSTR, psz2: PCWSTR, cchmax: Int): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrNCatW", longArrayOf(psz1, psz2, cchmax.toLong()))
}

public fun StrPBrkA(psz: PCSTR, pszset: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrPBrkA", longArrayOf(psz, pszset))
}

public fun StrPBrkW(psz: PCWSTR, pszset: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrPBrkW", longArrayOf(psz, pszset))
}

public fun StrRChrA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRChrA", longArrayOf(pszstart, pszend, wmatch.toLong()))
}

public fun StrRChrIA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRChrIA", longArrayOf(pszstart, pszend, wmatch.toLong()))
}

public fun StrRChrIW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRChrIW", longArrayOf(pszstart, pszend, wmatch.toLong()))
}

public fun StrRChrW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRChrW", longArrayOf(pszstart, pszend, wmatch.toLong()))
}

public fun StrRStrIA(pszsource: PCSTR, pszlast: PCSTR, pszsrch: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRStrIA", longArrayOf(pszsource, pszlast, pszsrch))
}

public fun StrRStrIW(pszsource: PCWSTR, pszlast: PCWSTR, pszsrch: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRStrIW", longArrayOf(pszsource, pszlast, pszsrch))
}

public fun StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRetToBSTR", longArrayOf(pstr, pidl, pbstr)).toInt()
}

public fun StrRetToBufA(pstr: Long, pidl: Long, pszbuf: PSTR, cchbuf: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRetToBufA", longArrayOf(pstr, pidl, pszbuf, cchbuf.toLong())).toInt()
}

public fun StrRetToBufW(pstr: Long, pidl: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRetToBufW", longArrayOf(pstr, pidl, pszbuf, cchbuf.toLong())).toInt()
}

public fun StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRetToStrA", longArrayOf(pstr, pidl, ppsz)).toInt()
}

public fun StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrRetToStrW", longArrayOf(pstr, pidl, ppsz)).toInt()
}

public fun StrSpnA(psz: PCSTR, pszset: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrSpnA", longArrayOf(psz, pszset)).toInt()
}

public fun StrSpnW(psz: PCWSTR, pszset: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrSpnW", longArrayOf(psz, pszset)).toInt()
}

public fun StrStrA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrStrA", longArrayOf(pszfirst, pszsrch))
}

public fun StrStrIA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrStrIA", longArrayOf(pszfirst, pszsrch))
}

public fun StrStrIW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrStrIW", longArrayOf(pszfirst, pszsrch))
}

public fun StrStrNIW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrStrNIW", longArrayOf(pszfirst, pszsrch, cchmax.toLong()))
}

public fun StrStrNW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrStrNW", longArrayOf(pszfirst, pszsrch, cchmax.toLong()))
}

public fun StrStrW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrStrW", longArrayOf(pszfirst, pszsrch))
}

public fun StrToInt64ExA(pszstring: PCSTR, dwflags: Int, pllret: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrToInt64ExA", longArrayOf(pszstring, dwflags.toLong(), pllret)).toInt()
}

public fun StrToInt64ExW(pszstring: PCWSTR, dwflags: Int, pllret: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrToInt64ExW", longArrayOf(pszstring, dwflags.toLong(), pllret)).toInt()
}

public fun StrToIntA(pszsrc: PCSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrToIntA", longArrayOf(pszsrc)).toInt()
}

public fun StrToIntExA(pszstring: PCSTR, dwflags: Int, piret: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrToIntExA", longArrayOf(pszstring, dwflags.toLong(), piret)).toInt()
}

public fun StrToIntExW(pszstring: PCWSTR, dwflags: Int, piret: Long): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrToIntExW", longArrayOf(pszstring, dwflags.toLong(), piret)).toInt()
}

public fun StrToIntW(pszsrc: PCWSTR): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrToIntW", longArrayOf(pszsrc)).toInt()
}

public fun StrTrimA(psz: PSTR, psztrimchars: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrTrimA", longArrayOf(psz, psztrimchars)).toInt()
}

public fun StrTrimW(psz: PWSTR, psztrimchars: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "StrTrimW", longArrayOf(psz, psztrimchars)).toInt()
}

public fun UnloadUserProfile(htoken: HANDLE, hprofile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "UnloadUserProfile", longArrayOf(htoken, hprofile)).toInt()
}

public fun UnregisterAppConstrainedChangeNotification(registration: PAPPCONSTRAIN_REGISTRATION) {
    Win32DynamicFfi.invoke("api-ms-win-core-psm-appnotify-l1-1-1.dll", "UnregisterAppConstrainedChangeNotification", longArrayOf(registration))
}

public fun UnregisterAppStateChangeNotification(registration: PAPPSTATE_REGISTRATION) {
    Win32DynamicFfi.invoke("api-ms-win-core-psm-appnotify-l1-1-0.dll", "UnregisterAppStateChangeNotification", longArrayOf(registration))
}

public fun UnregisterScaleChangeEvent(dwcookie: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "UnregisterScaleChangeEvent", longArrayOf(dwcookie.toLong())).toInt()
}

public fun UrlApplySchemeA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlApplySchemeA", longArrayOf(pszin, pszout, pcchout, dwflags.toLong())).toInt()
}

public fun UrlApplySchemeW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlApplySchemeW", longArrayOf(pszin, pszout, pcchout, dwflags.toLong())).toInt()
}

public fun UrlCanonicalizeA(pszurl: PCSTR, pszcanonicalized: PSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCanonicalizeA", longArrayOf(pszurl, pszcanonicalized, pcchcanonicalized, dwflags.toLong())).toInt()
}

public fun UrlCanonicalizeW(pszurl: PCWSTR, pszcanonicalized: PWSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCanonicalizeW", longArrayOf(pszurl, pszcanonicalized, pcchcanonicalized, dwflags.toLong())).toInt()
}

public fun UrlCombineA(pszbase: PCSTR, pszrelative: PCSTR, pszcombined: PSTR, pcchcombined: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCombineA", longArrayOf(pszbase, pszrelative, pszcombined, pcchcombined, dwflags.toLong())).toInt()
}

public fun UrlCombineW(pszbase: PCWSTR, pszrelative: PCWSTR, pszcombined: PWSTR, pcchcombined: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCombineW", longArrayOf(pszbase, pszrelative, pszcombined, pcchcombined, dwflags.toLong())).toInt()
}

public fun UrlCompareA(psz1: PCSTR, psz2: PCSTR, fignoreslash: BOOL): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCompareA", longArrayOf(psz1, psz2, fignoreslash.toLong())).toInt()
}

public fun UrlCompareW(psz1: PCWSTR, psz2: PCWSTR, fignoreslash: BOOL): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCompareW", longArrayOf(psz1, psz2, fignoreslash.toLong())).toInt()
}

public fun UrlCreateFromPathA(pszpath: PCSTR, pszurl: PSTR, pcchurl: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCreateFromPathA", longArrayOf(pszpath, pszurl, pcchurl, dwflags.toLong())).toInt()
}

public fun UrlCreateFromPathW(pszpath: PCWSTR, pszurl: PWSTR, pcchurl: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlCreateFromPathW", longArrayOf(pszpath, pszurl, pcchurl, dwflags.toLong())).toInt()
}

public fun UrlEscapeA(pszurl: PCSTR, pszescaped: PSTR, pcchescaped: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlEscapeA", longArrayOf(pszurl, pszescaped, pcchescaped, dwflags.toLong())).toInt()
}

public fun UrlEscapeW(pszurl: PCWSTR, pszescaped: PWSTR, pcchescaped: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlEscapeW", longArrayOf(pszurl, pszescaped, pcchescaped, dwflags.toLong())).toInt()
}

public fun UrlFixupW(pcszurl: PCWSTR, psztranslatedurl: PWSTR, cchmax: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlFixupW", longArrayOf(pcszurl, psztranslatedurl, cchmax.toLong())).toInt()
}

public fun UrlGetLocationA(pszurl: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlGetLocationA", longArrayOf(pszurl))
}

public fun UrlGetLocationW(pszurl: PCWSTR): PCWSTR {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlGetLocationW", longArrayOf(pszurl))
}

public fun UrlGetPartA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlGetPartA", longArrayOf(pszin, pszout, pcchout, dwpart.toLong(), dwflags.toLong())).toInt()
}

public fun UrlGetPartW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlGetPartW", longArrayOf(pszin, pszout, pcchout, dwpart.toLong(), dwflags.toLong())).toInt()
}

public fun UrlHashA(pszurl: PCSTR, pbhash: Long, cbhash: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlHashA", longArrayOf(pszurl, pbhash, cbhash.toLong())).toInt()
}

public fun UrlHashW(pszurl: PCWSTR, pbhash: Long, cbhash: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlHashW", longArrayOf(pszurl, pbhash, cbhash.toLong())).toInt()
}

public fun UrlIsA(pszurl: PCSTR, urlis: URLIS): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlIsA", longArrayOf(pszurl, urlis.toLong())).toInt()
}

public fun UrlIsNoHistoryA(pszurl: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlIsNoHistoryA", longArrayOf(pszurl)).toInt()
}

public fun UrlIsNoHistoryW(pszurl: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlIsNoHistoryW", longArrayOf(pszurl)).toInt()
}

public fun UrlIsOpaqueA(pszurl: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlIsOpaqueA", longArrayOf(pszurl)).toInt()
}

public fun UrlIsOpaqueW(pszurl: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlIsOpaqueW", longArrayOf(pszurl)).toInt()
}

public fun UrlIsW(pszurl: PCWSTR, urlis: URLIS): BOOL {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlIsW", longArrayOf(pszurl, urlis.toLong())).toInt()
}

public fun UrlUnescapeA(pszurl: PSTR, pszunescaped: PSTR, pcchunescaped: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlUnescapeA", longArrayOf(pszurl, pszunescaped, pcchunescaped, dwflags.toLong())).toInt()
}

public fun UrlUnescapeW(pszurl: PWSTR, pszunescaped: PWSTR, pcchunescaped: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shlwapi.dll", "UrlUnescapeW", longArrayOf(pszurl, pszunescaped, pcchunescaped, dwflags.toLong())).toInt()
}

public fun VariantToStrRet(varin: Long, pstrret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToStrRet", longArrayOf(varin, pstrret)).toInt()
}

public fun WhichPlatform(): UInt {
    return Win32DynamicFfi.invoke("shlwapi.dll", "WhichPlatform", longArrayOf()).toUInt()
}

public fun Win32DeleteFile(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "Win32DeleteFile", longArrayOf(pszpath)).toInt()
}

public fun WinHelpA(hwndmain: HWND, lpszhelp: PCSTR, ucommand: UInt, dwdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "WinHelpA", longArrayOf(hwndmain, lpszhelp, ucommand.toLong(), dwdata.toLong())).toInt()
}

public fun WinHelpW(hwndmain: HWND, lpszhelp: PCWSTR, ucommand: UInt, dwdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "WinHelpW", longArrayOf(hwndmain, lpszhelp, ucommand.toLong(), dwdata.toLong())).toInt()
}

public fun WriteCabinetState(pcs: Long): BOOL {
    return Win32DynamicFfi.invoke("shell32.dll", "WriteCabinetState", longArrayOf(pcs)).toInt()
}

public fun wnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "wnsprintfA", longArrayOf(pszdest, cchdest.toLong(), pszfmt) + variadicArgs).toInt()
}

public fun wnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "wnsprintfW", longArrayOf(pszdest, cchdest.toLong(), pszfmt) + variadicArgs).toInt()
}

public fun wvnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, arglist: Long): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "wvnsprintfA", longArrayOf(pszdest, cchdest.toLong(), pszfmt, arglist)).toInt()
}

public fun wvnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, arglist: Long): Int {
    return Win32DynamicFfi.invoke("shlwapi.dll", "wvnsprintfW", longArrayOf(pszdest, cchdest.toLong(), pszfmt, arglist)).toInt()
}
