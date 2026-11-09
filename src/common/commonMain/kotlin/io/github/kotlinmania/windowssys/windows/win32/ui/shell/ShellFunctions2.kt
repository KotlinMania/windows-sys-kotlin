package io.github.kotlinmania.windowssys.windows.win32.ui.shell

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

public expect fun SHRegGetIntW(hk: HKEY, pwzkey: PCWSTR, idefault: Int): Int

public expect fun SHRegGetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pszpath: PSTR, dwflags: UInt): WIN32_ERROR

public expect fun SHRegGetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pszpath: PWSTR, dwflags: UInt): WIN32_ERROR

public expect fun SHRegGetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR

public expect fun SHRegGetUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR

public expect fun SHRegGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHRegGetValueFromHKCUHKLM(pwszkey: PCWSTR, pwszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHRegGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHRegOpenUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR

public expect fun SHRegOpenUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR

public expect fun SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR

public expect fun SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR

public expect fun SHRegQueryUSValueA(huskey: Long, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR

public expect fun SHRegQueryUSValueW(huskey: Long, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR

public expect fun SHRegSetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pcszpath: PCSTR, dwflags: UInt): WIN32_ERROR

public expect fun SHRegSetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pcszpath: PCWSTR, dwflags: UInt): WIN32_ERROR

public expect fun SHRegSetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR

public expect fun SHRegSetUSValueW(pwzsubkey: PCWSTR, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR

public expect fun SHRegWriteUSValueA(huskey: Long, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR

public expect fun SHRegWriteUSValueW(huskey: Long, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR

public expect fun SHReleaseThreadRef(): HRESULT

public expect fun SHRemoveLocalizedName(pszpath: PCWSTR): HRESULT

public expect fun SHReplaceFromPropSheetExtArray(hpsxa: HPSXA, upageid: UInt, lpfnreplacewith: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt

public expect fun SHResolveLibrary(psilibrary: Long): HRESULT

public expect fun SHRestricted(rest: RESTRICTIONS): UInt

public expect fun SHSendMessageBroadcastA(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun SHSendMessageBroadcastW(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun SHSetDefaultProperties(hwnd: HWND, psi: Long, dwfileopflags: UInt, pfops: Long): HRESULT

public expect fun SHSetFolderPathA(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCSTR): HRESULT

public expect fun SHSetFolderPathW(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCWSTR): HRESULT

public expect fun SHSetInstanceExplorer(punk: Long)

public expect fun SHSetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, pszpath: PCWSTR): HRESULT

public expect fun SHSetLocalizedName(pszpath: PCWSTR, pszresmodule: PCWSTR, idsres: Int): HRESULT

public expect fun SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): HRESULT

public expect fun SHSetThreadRef(punk: Long): HRESULT

public expect fun SHSetUnreadMailCountW(pszmailaddress: PCWSTR, dwcount: UInt, pszshellexecutecommand: PCWSTR): HRESULT

public expect fun SHSetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int

public expect fun SHSetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int

public expect fun SHShellFolderView_Message(hwndmain: HWND, umsg: UInt, lparam: LPARAM): LRESULT

public expect fun SHShowManageLibraryUI(psilibrary: Long, hwndowner: HWND, psztitle: PCWSTR, pszinstruction: PCWSTR, lmdoptions: LIBRARYMANAGEDIALOGOPTIONS): HRESULT

public expect fun SHSimpleIDListFromPath(pszpath: PCWSTR): Long

public expect fun SHSkipJunction(pbc: Long, pclsid: Long): BOOL

public expect fun SHStartNetConnectionDialogW(hwnd: HWND, pszremotename: PCWSTR, dwtype: UInt): HRESULT

public expect fun SHStrDupA(psz: PCSTR, ppwsz: Long): HRESULT

public expect fun SHStrDupW(psz: PCWSTR, ppwsz: Long): HRESULT

public expect fun SHStripMneumonicA(pszmenu: PSTR): Byte

public expect fun SHStripMneumonicW(pszmenu: PWSTR): UShort

public expect fun SHTestTokenMembership(htoken: HANDLE, ulrid: UInt): BOOL

public expect fun SHUnicodeToAnsi(pwszsrc: PCWSTR, pszdst: PSTR, cchbuf: Int): Int

public expect fun SHUnicodeToUnicode(pwzsrc: PCWSTR, pwzdst: PWSTR, cwchbuf: Int): Int

public expect fun SHUnlockShared(pvdata: Long): BOOL

public expect fun SHUpdateImageA(pszhashitem: PCSTR, iindex: Int, uflags: UInt, iimageindex: Int)

public expect fun SHUpdateImageW(pszhashitem: PCWSTR, iindex: Int, uflags: UInt, iimageindex: Int)

public expect fun SHValidateUNC(hwndowner: HWND, pszfile: PWSTR, fconnect: UInt): BOOL

public expect fun SetCurrentProcessExplicitAppUserModelID(appid: PCWSTR): HRESULT

public expect fun SetMenuContextHelpId(param0: HMENU, param1: UInt): BOOL

public expect fun SetWindowContextHelpId(param0: HWND, param1: UInt): BOOL

public expect fun SetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, dwrefdata: ULong): BOOL

public expect fun ShellAboutA(hwnd: HWND, szapp: PCSTR, szotherstuff: PCSTR, hicon: HICON): Int

public expect fun ShellAboutW(hwnd: HWND, szapp: PCWSTR, szotherstuff: PCWSTR, hicon: HICON): Int

public expect fun ShellExecuteA(hwnd: HWND, lpoperation: PCSTR, lpfile: PCSTR, lpparameters: PCSTR, lpdirectory: PCSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE

public expect fun ShellExecuteExA(pexecinfo: Long): BOOL

public expect fun ShellExecuteExW(pexecinfo: Long): BOOL

public expect fun ShellExecuteW(hwnd: HWND, lpoperation: PCWSTR, lpfile: PCWSTR, lpparameters: PCWSTR, lpdirectory: PCWSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE

public expect fun ShellMessageBoxA(happinst: HINSTANCE, hwnd: HWND, lpctext: PCSTR, lpctitle: PCSTR, fustyle: MESSAGEBOX_STYLE, vararg variadicArgs: Long): Int

public expect fun ShellMessageBoxW(happinst: HINSTANCE, hwnd: HWND, lpctext: PCWSTR, lpctitle: PCWSTR, fustyle: MESSAGEBOX_STYLE, vararg variadicArgs: Long): Int

public expect fun Shell_GetCachedImageIndex(pwsziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int

public expect fun Shell_GetCachedImageIndexA(psziconpath: PCSTR, iiconindex: Int, uiconflags: UInt): Int

public expect fun Shell_GetCachedImageIndexW(psziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int

public expect fun Shell_GetImageLists(phiml: Long, phimlsmall: Long): BOOL

public expect fun Shell_MergeMenus(hmdst: HMENU, hmsrc: HMENU, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MM_FLAGS): UInt

public expect fun Shell_NotifyIconA(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL

public expect fun Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): HRESULT

public expect fun Shell_NotifyIconW(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL

public expect fun SignalFileOpen(pidl: Long): BOOL

public expect fun SoftwareUpdateMessageBox(hwnd: HWND, pszdistunit: PCWSTR, dwflags: UInt, psdi: Long): UInt

public expect fun StgMakeUniqueName(pstgparent: Long, pszfilespec: PCWSTR, grfmode: UInt, riid: Long, ppv: Long): HRESULT

public expect fun StrCSpnA(pszstr: PCSTR, pszset: PCSTR): Int

public expect fun StrCSpnIA(pszstr: PCSTR, pszset: PCSTR): Int

public expect fun StrCSpnIW(pszstr: PCWSTR, pszset: PCWSTR): Int

public expect fun StrCSpnW(pszstr: PCWSTR, pszset: PCWSTR): Int

public expect fun StrCatBuffA(pszdest: PSTR, pszsrc: PCSTR, cchdestbuffsize: Int): PSTR

public expect fun StrCatBuffW(pszdest: PWSTR, pszsrc: PCWSTR, cchdestbuffsize: Int): PWSTR

public expect fun StrCatChainW(pszdst: PWSTR, cchdst: UInt, ichat: UInt, pszsrc: PCWSTR): UInt

public expect fun StrCatW(psz1: PWSTR, psz2: PCWSTR): PWSTR

public expect fun StrChrA(pszstart: PCSTR, wmatch: UShort): PSTR

public expect fun StrChrIA(pszstart: PCSTR, wmatch: UShort): PSTR

public expect fun StrChrIW(pszstart: PCWSTR, wmatch: UShort): PWSTR

public expect fun StrChrNIW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR

public expect fun StrChrNW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR

public expect fun StrChrW(pszstart: PCWSTR, wmatch: UShort): PWSTR

public expect fun StrCmpCA(pszstr1: PCSTR, pszstr2: PCSTR): Int

public expect fun StrCmpCW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int

public expect fun StrCmpICA(pszstr1: PCSTR, pszstr2: PCSTR): Int

public expect fun StrCmpICW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int

public expect fun StrCmpIW(psz1: PCWSTR, psz2: PCWSTR): Int

public expect fun StrCmpLogicalW(psz1: PCWSTR, psz2: PCWSTR): Int

public expect fun StrCmpNA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int

public expect fun StrCmpNCA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int

public expect fun StrCmpNCW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int

public expect fun StrCmpNIA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int

public expect fun StrCmpNICA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int

public expect fun StrCmpNICW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int

public expect fun StrCmpNIW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int

public expect fun StrCmpNW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int

public expect fun StrCmpW(psz1: PCWSTR, psz2: PCWSTR): Int

public expect fun StrCpyNW(pszdst: PWSTR, pszsrc: PCWSTR, cchmax: Int): PWSTR

public expect fun StrCpyW(psz1: PWSTR, psz2: PCWSTR): PWSTR

public expect fun StrDupA(pszsrch: PCSTR): PSTR

public expect fun StrDupW(pszsrch: PCWSTR): PWSTR

public expect fun StrFormatByteSize64A(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR

public expect fun StrFormatByteSizeA(dw: UInt, pszbuf: PSTR, cchbuf: UInt): PSTR

public expect fun StrFormatByteSizeEx(ull: ULong, flags: SFBS_FLAGS, pszbuf: PWSTR, cchbuf: UInt): HRESULT

public expect fun StrFormatByteSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR

public expect fun StrFormatKBSizeA(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR

public expect fun StrFormatKBSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR

public expect fun StrFromTimeIntervalA(pszout: PSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int

public expect fun StrFromTimeIntervalW(pszout: PWSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int

public expect fun StrIsIntlEqualA(fcasesens: BOOL, pszstring1: PCSTR, pszstring2: PCSTR, nchar: Int): BOOL

public expect fun StrIsIntlEqualW(fcasesens: BOOL, pszstring1: PCWSTR, pszstring2: PCWSTR, nchar: Int): BOOL

public expect fun StrNCatA(psz1: PSTR, psz2: PCSTR, cchmax: Int): PSTR

public expect fun StrNCatW(psz1: PWSTR, psz2: PCWSTR, cchmax: Int): PWSTR

public expect fun StrPBrkA(psz: PCSTR, pszset: PCSTR): PSTR

public expect fun StrPBrkW(psz: PCWSTR, pszset: PCWSTR): PWSTR

public expect fun StrRChrA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR

public expect fun StrRChrIA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR

public expect fun StrRChrIW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR

public expect fun StrRChrW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR

public expect fun StrRStrIA(pszsource: PCSTR, pszlast: PCSTR, pszsrch: PCSTR): PSTR

public expect fun StrRStrIW(pszsource: PCWSTR, pszlast: PCWSTR, pszsrch: PCWSTR): PWSTR

public expect fun StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): HRESULT

public expect fun StrRetToBufA(pstr: Long, pidl: Long, pszbuf: PSTR, cchbuf: UInt): HRESULT

public expect fun StrRetToBufW(pstr: Long, pidl: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT

public expect fun StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): HRESULT

public expect fun StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): HRESULT

public expect fun StrSpnA(psz: PCSTR, pszset: PCSTR): Int

public expect fun StrSpnW(psz: PCWSTR, pszset: PCWSTR): Int

public expect fun StrStrA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR

public expect fun StrStrIA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR

public expect fun StrStrIW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR

public expect fun StrStrNIW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR

public expect fun StrStrNW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR

public expect fun StrStrW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR

public expect fun StrToInt64ExA(pszstring: PCSTR, dwflags: Int, pllret: Long): BOOL

public expect fun StrToInt64ExW(pszstring: PCWSTR, dwflags: Int, pllret: Long): BOOL

public expect fun StrToIntA(pszsrc: PCSTR): Int

public expect fun StrToIntExA(pszstring: PCSTR, dwflags: Int, piret: Long): BOOL

public expect fun StrToIntExW(pszstring: PCWSTR, dwflags: Int, piret: Long): BOOL

public expect fun StrToIntW(pszsrc: PCWSTR): Int

public expect fun StrTrimA(psz: PSTR, psztrimchars: PCSTR): BOOL

public expect fun StrTrimW(psz: PWSTR, psztrimchars: PCWSTR): BOOL

public expect fun UnloadUserProfile(htoken: HANDLE, hprofile: HANDLE): BOOL

public expect fun UnregisterAppConstrainedChangeNotification(registration: PAPPCONSTRAIN_REGISTRATION)

public expect fun UnregisterAppStateChangeNotification(registration: PAPPSTATE_REGISTRATION)

public expect fun UnregisterScaleChangeEvent(dwcookie: ULong): HRESULT

public expect fun UrlApplySchemeA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwflags: UInt): HRESULT

public expect fun UrlApplySchemeW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwflags: UInt): HRESULT

public expect fun UrlCanonicalizeA(pszurl: PCSTR, pszcanonicalized: PSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT

public expect fun UrlCanonicalizeW(pszurl: PCWSTR, pszcanonicalized: PWSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT

public expect fun UrlCombineA(pszbase: PCSTR, pszrelative: PCSTR, pszcombined: PSTR, pcchcombined: Long, dwflags: UInt): HRESULT

public expect fun UrlCombineW(pszbase: PCWSTR, pszrelative: PCWSTR, pszcombined: PWSTR, pcchcombined: Long, dwflags: UInt): HRESULT

public expect fun UrlCompareA(psz1: PCSTR, psz2: PCSTR, fignoreslash: BOOL): Int

public expect fun UrlCompareW(psz1: PCWSTR, psz2: PCWSTR, fignoreslash: BOOL): Int

public expect fun UrlCreateFromPathA(pszpath: PCSTR, pszurl: PSTR, pcchurl: Long, dwflags: UInt): HRESULT

public expect fun UrlCreateFromPathW(pszpath: PCWSTR, pszurl: PWSTR, pcchurl: Long, dwflags: UInt): HRESULT

public expect fun UrlEscapeA(pszurl: PCSTR, pszescaped: PSTR, pcchescaped: Long, dwflags: UInt): HRESULT

public expect fun UrlEscapeW(pszurl: PCWSTR, pszescaped: PWSTR, pcchescaped: Long, dwflags: UInt): HRESULT

public expect fun UrlFixupW(pcszurl: PCWSTR, psztranslatedurl: PWSTR, cchmax: UInt): HRESULT

public expect fun UrlGetLocationA(pszurl: PCSTR): PCSTR

public expect fun UrlGetLocationW(pszurl: PCWSTR): PCWSTR

public expect fun UrlGetPartA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT

public expect fun UrlGetPartW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT

public expect fun UrlHashA(pszurl: PCSTR, pbhash: Long, cbhash: UInt): HRESULT

public expect fun UrlHashW(pszurl: PCWSTR, pbhash: Long, cbhash: UInt): HRESULT

public expect fun UrlIsA(pszurl: PCSTR, urlis: URLIS): BOOL

public expect fun UrlIsNoHistoryA(pszurl: PCSTR): BOOL

public expect fun UrlIsNoHistoryW(pszurl: PCWSTR): BOOL

public expect fun UrlIsOpaqueA(pszurl: PCSTR): BOOL

public expect fun UrlIsOpaqueW(pszurl: PCWSTR): BOOL

public expect fun UrlIsW(pszurl: PCWSTR, urlis: URLIS): BOOL

public expect fun UrlUnescapeA(pszurl: PSTR, pszunescaped: PSTR, pcchunescaped: Long, dwflags: UInt): HRESULT

public expect fun UrlUnescapeW(pszurl: PWSTR, pszunescaped: PWSTR, pcchunescaped: Long, dwflags: UInt): HRESULT

public expect fun VariantToStrRet(varin: Long, pstrret: Long): HRESULT

public expect fun WhichPlatform(): UInt

public expect fun Win32DeleteFile(pszpath: PCWSTR): BOOL

public expect fun WinHelpA(hwndmain: HWND, lpszhelp: PCSTR, ucommand: UInt, dwdata: ULong): BOOL

public expect fun WinHelpW(hwndmain: HWND, lpszhelp: PCWSTR, ucommand: UInt, dwdata: ULong): BOOL

public expect fun WriteCabinetState(pcs: Long): BOOL

public expect fun wnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, vararg variadicArgs: Long): Int

public expect fun wnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, vararg variadicArgs: Long): Int

public expect fun wvnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, arglist: Long): Int

public expect fun wvnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, arglist: Long): Int
