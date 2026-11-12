package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ShowWindowCmd

public expect fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int

public expect fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error

public expect fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error

public expect fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error

public expect fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error

public expect fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, fignorehkcu: Bool): Win32Error

public expect fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, fignorehkcu: Bool): Win32Error

public expect fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error

public expect fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error

public expect fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error

public expect fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error

public expect fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error

public expect fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error

public expect fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error

public expect fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error

public expect fun sHReleaseThreadRef(): Hresult

public expect fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult

public expect fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt

public expect fun sHResolveLibrary(psilibrary: MutPtr): Hresult

public expect fun sHRestricted(rest: Restrictions): UInt

public expect fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun sHSetDefaultProperties(hwnd: Hwnd, psi: MutPtr, dwfileopflags: UInt, pfops: MutPtr): Hresult

public expect fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult

public expect fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult

public expect fun sHSetInstanceExplorer(punk: MutPtr)

public expect fun sHSetKnownFolderPath(rfid: ConstPtr, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult

public expect fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult

public expect fun sHSetTemporaryPropertyForItem(psi: MutPtr, propkey: ConstPtr, propvar: ConstPtr): Hresult

public expect fun sHSetThreadRef(punk: MutPtr): Hresult

public expect fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult

public expect fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt): Int

public expect fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt): Int

public expect fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult

public expect fun sHShowManageLibraryUI(psilibrary: MutPtr, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult

public expect fun sHSimpleIDListFromPath(pszpath: Pcwstr): MutPtr

public expect fun sHSkipJunction(pbc: MutPtr, pclsid: ConstPtr): Bool

public expect fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult

public expect fun sHStrDupA(psz: Pcstr, ppwsz: MutPtr): Hresult

public expect fun sHStrDupW(psz: Pcwstr, ppwsz: MutPtr): Hresult

public expect fun sHStripMneumonicA(pszmenu: Pstr): Byte

public expect fun sHStripMneumonicW(pszmenu: Pwstr): UShort

public expect fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool

public expect fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int

public expect fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int

public expect fun sHUnlockShared(pvdata: ConstPtr): Bool

public expect fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int)

public expect fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int)

public expect fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool

public expect fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult

public expect fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool

public expect fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool

public expect fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool

public expect fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int

public expect fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int

public expect fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance

public expect fun shellExecuteExA(pexecinfo: MutPtr): Bool

public expect fun shellExecuteExW(pexecinfo: MutPtr): Bool

public expect fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance

public expect fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int

public expect fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int

public expect fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int

public expect fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int

public expect fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int

public expect fun shellGetImageLists(phiml: MutPtr, phimlsmall: MutPtr): Bool

public expect fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt

public expect fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: ConstPtr): Bool

public expect fun shellNotifyIconGetRect(identifier: ConstPtr, iconlocation: MutPtr): Hresult

public expect fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: ConstPtr): Bool

public expect fun signalFileOpen(pidl: ConstPtr): Bool

public expect fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: MutPtr): UInt

public expect fun stgMakeUniqueName(pstgparent: MutPtr, pszfilespec: Pcwstr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int

public expect fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int

public expect fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int

public expect fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int

public expect fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr

public expect fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr

public expect fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt

public expect fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr

public expect fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr

public expect fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr

public expect fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr

public expect fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr

public expect fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr

public expect fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr

public expect fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int

public expect fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int

public expect fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int

public expect fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int

public expect fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int

public expect fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int

public expect fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int

public expect fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int

public expect fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int

public expect fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int

public expect fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int

public expect fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int

public expect fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int

public expect fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int

public expect fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int

public expect fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr

public expect fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr

public expect fun strDupA(pszsrch: Pcstr): Pstr

public expect fun strDupW(pszsrch: Pcwstr): Pwstr

public expect fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr

public expect fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr

public expect fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult

public expect fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr

public expect fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr

public expect fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr

public expect fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int

public expect fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int

public expect fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool

public expect fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool

public expect fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr

public expect fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr

public expect fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr

public expect fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr

public expect fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr

public expect fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr

public expect fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr

public expect fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr

public expect fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr

public expect fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr

public expect fun strRetToBSTR(pstr: MutPtr, pidl: ConstPtr, pbstr: MutPtr): Hresult

public expect fun strRetToBufA(pstr: MutPtr, pidl: ConstPtr, pszbuf: Pstr, cchbuf: UInt): Hresult

public expect fun strRetToBufW(pstr: MutPtr, pidl: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult

public expect fun strRetToStrA(pstr: MutPtr, pidl: ConstPtr, ppsz: MutPtr): Hresult

public expect fun strRetToStrW(pstr: MutPtr, pidl: ConstPtr, ppsz: MutPtr): Hresult

public expect fun strSpnA(psz: Pcstr, pszset: Pcstr): Int

public expect fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int

public expect fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr

public expect fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr

public expect fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr

public expect fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr

public expect fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr

public expect fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr

public expect fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: MutPtr): Bool

public expect fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: MutPtr): Bool

public expect fun strToIntA(pszsrc: Pcstr): Int

public expect fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: MutPtr): Bool

public expect fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: MutPtr): Bool

public expect fun strToIntW(pszsrc: Pcwstr): Int

public expect fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool

public expect fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool

public expect fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool

public expect fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration)

public expect fun unregisterAppStateChangeNotification(registration: PappstateRegistration)

public expect fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult

public expect fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr, dwflags: UInt): Hresult

public expect fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr, dwflags: UInt): Hresult

public expect fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: MutPtr, dwflags: UInt): Hresult

public expect fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: MutPtr, dwflags: UInt): Hresult

public expect fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: MutPtr, dwflags: UInt): Hresult

public expect fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: MutPtr, dwflags: UInt): Hresult

public expect fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int

public expect fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int

public expect fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: MutPtr, dwflags: UInt): Hresult

public expect fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: MutPtr, dwflags: UInt): Hresult

public expect fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: MutPtr, dwflags: UInt): Hresult

public expect fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: MutPtr, dwflags: UInt): Hresult

public expect fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult

public expect fun urlGetLocationA(pszurl: Pcstr): Pcstr

public expect fun urlGetLocationW(pszurl: Pcwstr): Pcwstr

public expect fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr, dwpart: UInt, dwflags: UInt): Hresult

public expect fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr, dwpart: UInt, dwflags: UInt): Hresult

public expect fun urlHashA(pszurl: Pcstr, pbhash: MutPtr, cbhash: UInt): Hresult

public expect fun urlHashW(pszurl: Pcwstr, pbhash: MutPtr, cbhash: UInt): Hresult

public expect fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool

public expect fun urlIsNoHistoryA(pszurl: Pcstr): Bool

public expect fun urlIsNoHistoryW(pszurl: Pcwstr): Bool

public expect fun urlIsOpaqueA(pszurl: Pcstr): Bool

public expect fun urlIsOpaqueW(pszurl: Pcwstr): Bool

public expect fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool

public expect fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: MutPtr, dwflags: UInt): Hresult

public expect fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: MutPtr, dwflags: UInt): Hresult

public expect fun variantToStrRet(varin: ConstPtr, pstrret: MutPtr): Hresult

public expect fun whichPlatform(): UInt

public expect fun win32DeleteFile(pszpath: Pcwstr): Bool

public expect fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool

public expect fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool

public expect fun writeCabinetState(pcs: ConstPtr): Bool

public expect fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int

public expect fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: ConstPtr): Int

public expect fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: ConstPtr): Int
