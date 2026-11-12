package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.Hkl

public expect fun immAssociateContext(param0: Hwnd, param1: Himc): Himc

public expect fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool

public expect fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool

public expect fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool

public expect fun immCreateContext(): Himc

public expect fun immCreateIMCC(param0: UInt): Himcc

public expect fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd

public expect fun immDestroyContext(param0: Himc): Bool

public expect fun immDestroyIMCC(param0: Himcc): Himcc

public expect fun immDestroySoftKeyboard(param0: Hwnd): Bool

public expect fun immDisableIME(param0: UInt): Bool

public expect fun immDisableLegacyIME(): Bool

public expect fun immDisableTextFrameService(idthread: UInt): Bool

public expect fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool

public expect fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: MutPtr): UInt

public expect fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: MutPtr): UInt

public expect fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult

public expect fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult

public expect fun immGenerateMessage(param0: Himc): Bool

public expect fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt

public expect fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: MutPtr): UInt

public expect fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: MutPtr): UInt

public expect fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt

public expect fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: MutPtr): Bool

public expect fun immGetCompositionFontA(param0: Himc, lplf: MutPtr): Bool

public expect fun immGetCompositionFontW(param0: Himc, lplf: MutPtr): Bool

public expect fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int

public expect fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int

public expect fun immGetCompositionWindow(param0: Himc, lpcompform: MutPtr): Bool

public expect fun immGetContext(param0: Hwnd): Himc

public expect fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt

public expect fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt

public expect fun immGetConversionStatus(param0: Himc, lpfdwconversion: MutPtr, lpfdwsentence: MutPtr): Bool

public expect fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd

public expect fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt

public expect fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt

public expect fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt

public expect fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt

public expect fun immGetHotKey(param0: UInt, lpumodifiers: MutPtr, lpuvkey: MutPtr, phkl: MutPtr): Bool

public expect fun immGetIMCCLockCount(param0: Himcc): UInt

public expect fun immGetIMCCSize(param0: Himcc): UInt

public expect fun immGetIMCLockCount(param0: Himc): UInt

public expect fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt

public expect fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt

public expect fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt

public expect fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt

public expect fun immGetOpenStatus(param0: Himc): Bool

public expect fun immGetProperty(param0: Hkl, param1: UInt): UInt

public expect fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt

public expect fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt

public expect fun immGetStatusWindowPos(param0: Himc, lpptpos: MutPtr): Bool

public expect fun immGetVirtualKey(param0: Hwnd): UInt

public expect fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl

public expect fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl

public expect fun immIsIME(param0: Hkl): Bool

public expect fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool

public expect fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool

public expect fun immLockIMC(param0: Himc): MutPtr

public expect fun immLockIMCC(param0: Himcc): MutPtr

public expect fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool

public expect fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc

public expect fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool

public expect fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool

public expect fun immReleaseContext(param0: Hwnd, param1: Himc): Bool

public expect fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult

public expect fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult

public expect fun immSetCandidateWindow(param0: Himc, lpcandidate: ConstPtr): Bool

public expect fun immSetCompositionFontA(param0: Himc, lplf: ConstPtr): Bool

public expect fun immSetCompositionFontW(param0: Himc, lplf: ConstPtr): Bool

public expect fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool

public expect fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool

public expect fun immSetCompositionWindow(param0: Himc, lpcompform: ConstPtr): Bool

public expect fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool

public expect fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool

public expect fun immSetOpenStatus(param0: Himc, param1: Bool): Bool

public expect fun immSetStatusWindowPos(param0: Himc, lpptpos: ConstPtr): Bool

public expect fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool

public expect fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool

public expect fun immUnlockIMC(param0: Himc): Bool

public expect fun immUnlockIMCC(param0: Himcc): Bool

public expect fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool

public expect fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool
