package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.HKL

public expect fun ImmAssociateContext(param0: HWND, param1: HIMC): HIMC

public expect fun ImmAssociateContextEx(param0: HWND, param1: HIMC, param2: UInt): BOOL

public expect fun ImmConfigureIMEA(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL

public expect fun ImmConfigureIMEW(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL

public expect fun ImmCreateContext(): HIMC

public expect fun ImmCreateIMCC(param0: UInt): HIMCC

public expect fun ImmCreateSoftKeyboard(param0: UInt, param1: HWND, param2: Int, param3: Int): HWND

public expect fun ImmDestroyContext(param0: HIMC): BOOL

public expect fun ImmDestroyIMCC(param0: HIMCC): HIMCC

public expect fun ImmDestroySoftKeyboard(param0: HWND): BOOL

public expect fun ImmDisableIME(param0: UInt): BOOL

public expect fun ImmDisableLegacyIME(): BOOL

public expect fun ImmDisableTextFrameService(idthread: UInt): BOOL

public expect fun ImmEnumInputContext(idthread: UInt, lpfn: IMCENUMPROC, lparam: LPARAM): BOOL

public expect fun ImmEnumRegisterWordA(param0: HKL, param1: REGISTERWORDENUMPROCA, lpszreading: PCSTR, param3: UInt, lpszregister: PCSTR, param5: Long): UInt

public expect fun ImmEnumRegisterWordW(param0: HKL, param1: REGISTERWORDENUMPROCW, lpszreading: PCWSTR, param3: UInt, lpszregister: PCWSTR, param5: Long): UInt

public expect fun ImmEscapeA(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT

public expect fun ImmEscapeW(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT

public expect fun ImmGenerateMessage(param0: HIMC): BOOL

public expect fun ImmGetCandidateListA(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt

public expect fun ImmGetCandidateListCountA(param0: HIMC, lpdwlistcount: Long): UInt

public expect fun ImmGetCandidateListCountW(param0: HIMC, lpdwlistcount: Long): UInt

public expect fun ImmGetCandidateListW(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt

public expect fun ImmGetCandidateWindow(param0: HIMC, param1: UInt, lpcandidate: Long): BOOL

public expect fun ImmGetCompositionFontA(param0: HIMC, lplf: Long): BOOL

public expect fun ImmGetCompositionFontW(param0: HIMC, lplf: Long): BOOL

public expect fun ImmGetCompositionStringA(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int

public expect fun ImmGetCompositionStringW(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int

public expect fun ImmGetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL

public expect fun ImmGetContext(param0: HWND): HIMC

public expect fun ImmGetConversionListA(param0: HKL, param1: HIMC, lpsrc: PCSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt

public expect fun ImmGetConversionListW(param0: HKL, param1: HIMC, lpsrc: PCWSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt

public expect fun ImmGetConversionStatus(param0: HIMC, lpfdwconversion: Long, lpfdwsentence: Long): BOOL

public expect fun ImmGetDefaultIMEWnd(param0: HWND): HWND

public expect fun ImmGetDescriptionA(param0: HKL, lpszdescription: PSTR, ubuflen: UInt): UInt

public expect fun ImmGetDescriptionW(param0: HKL, lpszdescription: PWSTR, ubuflen: UInt): UInt

public expect fun ImmGetGuideLineA(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PSTR, dwbuflen: UInt): UInt

public expect fun ImmGetGuideLineW(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PWSTR, dwbuflen: UInt): UInt

public expect fun ImmGetHotKey(param0: UInt, lpumodifiers: Long, lpuvkey: Long, phkl: Long): BOOL

public expect fun ImmGetIMCCLockCount(param0: HIMCC): UInt

public expect fun ImmGetIMCCSize(param0: HIMCC): UInt

public expect fun ImmGetIMCLockCount(param0: HIMC): UInt

public expect fun ImmGetIMEFileNameA(param0: HKL, lpszfilename: PSTR, ubuflen: UInt): UInt

public expect fun ImmGetIMEFileNameW(param0: HKL, lpszfilename: PWSTR, ubuflen: UInt): UInt

public expect fun ImmGetImeMenuItemsA(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt

public expect fun ImmGetImeMenuItemsW(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt

public expect fun ImmGetOpenStatus(param0: HIMC): BOOL

public expect fun ImmGetProperty(param0: HKL, param1: UInt): UInt

public expect fun ImmGetRegisterWordStyleA(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt

public expect fun ImmGetRegisterWordStyleW(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt

public expect fun ImmGetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL

public expect fun ImmGetVirtualKey(param0: HWND): UInt

public expect fun ImmInstallIMEA(lpszimefilename: PCSTR, lpszlayouttext: PCSTR): HKL

public expect fun ImmInstallIMEW(lpszimefilename: PCWSTR, lpszlayouttext: PCWSTR): HKL

public expect fun ImmIsIME(param0: HKL): BOOL

public expect fun ImmIsUIMessageA(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL

public expect fun ImmIsUIMessageW(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL

public expect fun ImmLockIMC(param0: HIMC): Long

public expect fun ImmLockIMCC(param0: HIMCC): Long

public expect fun ImmNotifyIME(param0: HIMC, dwaction: NOTIFY_IME_ACTION, dwindex: NOTIFY_IME_INDEX, dwvalue: UInt): BOOL

public expect fun ImmReSizeIMCC(param0: HIMCC, param1: UInt): HIMCC

public expect fun ImmRegisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszregister: PCSTR): BOOL

public expect fun ImmRegisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszregister: PCWSTR): BOOL

public expect fun ImmReleaseContext(param0: HWND, param1: HIMC): BOOL

public expect fun ImmRequestMessageA(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT

public expect fun ImmRequestMessageW(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT

public expect fun ImmSetCandidateWindow(param0: HIMC, lpcandidate: Long): BOOL

public expect fun ImmSetCompositionFontA(param0: HIMC, lplf: Long): BOOL

public expect fun ImmSetCompositionFontW(param0: HIMC, lplf: Long): BOOL

public expect fun ImmSetCompositionStringA(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL

public expect fun ImmSetCompositionStringW(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL

public expect fun ImmSetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL

public expect fun ImmSetConversionStatus(param0: HIMC, param1: IME_CONVERSION_MODE, param2: IME_SENTENCE_MODE): BOOL

public expect fun ImmSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: HKL): BOOL

public expect fun ImmSetOpenStatus(param0: HIMC, param1: BOOL): BOOL

public expect fun ImmSetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL

public expect fun ImmShowSoftKeyboard(param0: HWND, param1: Int): BOOL

public expect fun ImmSimulateHotKey(param0: HWND, param1: IME_HOTKEY_IDENTIFIER): BOOL

public expect fun ImmUnlockIMC(param0: HIMC): BOOL

public expect fun ImmUnlockIMCC(param0: HIMCC): BOOL

public expect fun ImmUnregisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszunregister: PCSTR): BOOL

public expect fun ImmUnregisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszunregister: PCWSTR): BOOL
