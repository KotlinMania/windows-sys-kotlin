@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun ImmAssociateContext(param0: HWND, param1: HIMC): HIMC =
    0L

public actual fun ImmAssociateContextEx(param0: HWND, param1: HIMC, param2: UInt): BOOL =
    0

public actual fun ImmConfigureIMEA(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    0

public actual fun ImmConfigureIMEW(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    0

public actual fun ImmCreateContext(): HIMC =
    0L

public actual fun ImmCreateIMCC(param0: UInt): HIMCC =
    0L

public actual fun ImmCreateSoftKeyboard(param0: UInt, param1: HWND, param2: Int, param3: Int): HWND =
    0L

public actual fun ImmDestroyContext(param0: HIMC): BOOL =
    0

public actual fun ImmDestroyIMCC(param0: HIMCC): HIMCC =
    0L

public actual fun ImmDestroySoftKeyboard(param0: HWND): BOOL =
    0

public actual fun ImmDisableIME(param0: UInt): BOOL =
    0

public actual fun ImmDisableLegacyIME(): BOOL =
    0

public actual fun ImmDisableTextFrameService(idthread: UInt): BOOL =
    0

public actual fun ImmEnumInputContext(idthread: UInt, lpfn: IMCENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun ImmEnumRegisterWordA(param0: HKL, param1: REGISTERWORDENUMPROCA, lpszreading: PCSTR, param3: UInt, lpszregister: PCSTR, param5: Long): UInt =
    0u

public actual fun ImmEnumRegisterWordW(param0: HKL, param1: REGISTERWORDENUMPROCW, lpszreading: PCWSTR, param3: UInt, lpszregister: PCWSTR, param5: Long): UInt =
    0u

public actual fun ImmEscapeA(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    0L

public actual fun ImmEscapeW(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    0L

public actual fun ImmGenerateMessage(param0: HIMC): BOOL =
    0

public actual fun ImmGetCandidateListA(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    0u

public actual fun ImmGetCandidateListCountA(param0: HIMC, lpdwlistcount: Long): UInt =
    0u

public actual fun ImmGetCandidateListCountW(param0: HIMC, lpdwlistcount: Long): UInt =
    0u

public actual fun ImmGetCandidateListW(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    0u

public actual fun ImmGetCandidateWindow(param0: HIMC, param1: UInt, lpcandidate: Long): BOOL =
    0

public actual fun ImmGetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    0

public actual fun ImmGetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    0

public actual fun ImmGetCompositionStringA(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    0

public actual fun ImmGetCompositionStringW(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    0

public actual fun ImmGetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    0

public actual fun ImmGetContext(param0: HWND): HIMC =
    0L

public actual fun ImmGetConversionListA(param0: HKL, param1: HIMC, lpsrc: PCSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    0u

public actual fun ImmGetConversionListW(param0: HKL, param1: HIMC, lpsrc: PCWSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    0u

public actual fun ImmGetConversionStatus(param0: HIMC, lpfdwconversion: Long, lpfdwsentence: Long): BOOL =
    0

public actual fun ImmGetDefaultIMEWnd(param0: HWND): HWND =
    0L

public actual fun ImmGetDescriptionA(param0: HKL, lpszdescription: PSTR, ubuflen: UInt): UInt =
    0u

public actual fun ImmGetDescriptionW(param0: HKL, lpszdescription: PWSTR, ubuflen: UInt): UInt =
    0u

public actual fun ImmGetGuideLineA(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PSTR, dwbuflen: UInt): UInt =
    0u

public actual fun ImmGetGuideLineW(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PWSTR, dwbuflen: UInt): UInt =
    0u

public actual fun ImmGetHotKey(param0: UInt, lpumodifiers: Long, lpuvkey: Long, phkl: Long): BOOL =
    0

public actual fun ImmGetIMCCLockCount(param0: HIMCC): UInt =
    0u

public actual fun ImmGetIMCCSize(param0: HIMCC): UInt =
    0u

public actual fun ImmGetIMCLockCount(param0: HIMC): UInt =
    0u

public actual fun ImmGetIMEFileNameA(param0: HKL, lpszfilename: PSTR, ubuflen: UInt): UInt =
    0u

public actual fun ImmGetIMEFileNameW(param0: HKL, lpszfilename: PWSTR, ubuflen: UInt): UInt =
    0u

public actual fun ImmGetImeMenuItemsA(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    0u

public actual fun ImmGetImeMenuItemsW(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    0u

public actual fun ImmGetOpenStatus(param0: HIMC): BOOL =
    0

public actual fun ImmGetProperty(param0: HKL, param1: UInt): UInt =
    0u

public actual fun ImmGetRegisterWordStyleA(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    0u

public actual fun ImmGetRegisterWordStyleW(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    0u

public actual fun ImmGetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    0

public actual fun ImmGetVirtualKey(param0: HWND): UInt =
    0u

public actual fun ImmInstallIMEA(lpszimefilename: PCSTR, lpszlayouttext: PCSTR): HKL =
    0L

public actual fun ImmInstallIMEW(lpszimefilename: PCWSTR, lpszlayouttext: PCWSTR): HKL =
    0L

public actual fun ImmIsIME(param0: HKL): BOOL =
    0

public actual fun ImmIsUIMessageA(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    0

public actual fun ImmIsUIMessageW(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    0

public actual fun ImmLockIMC(param0: HIMC): Long =
    0L

public actual fun ImmLockIMCC(param0: HIMCC): Long =
    0L

public actual fun ImmNotifyIME(param0: HIMC, dwaction: NOTIFY_IME_ACTION, dwindex: NOTIFY_IME_INDEX, dwvalue: UInt): BOOL =
    0

public actual fun ImmReSizeIMCC(param0: HIMCC, param1: UInt): HIMCC =
    0L

public actual fun ImmRegisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszregister: PCSTR): BOOL =
    0

public actual fun ImmRegisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszregister: PCWSTR): BOOL =
    0

public actual fun ImmReleaseContext(param0: HWND, param1: HIMC): BOOL =
    0

public actual fun ImmRequestMessageA(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    0L

public actual fun ImmRequestMessageW(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    0L

public actual fun ImmSetCandidateWindow(param0: HIMC, lpcandidate: Long): BOOL =
    0

public actual fun ImmSetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    0

public actual fun ImmSetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    0

public actual fun ImmSetCompositionStringA(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    0

public actual fun ImmSetCompositionStringW(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    0

public actual fun ImmSetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    0

public actual fun ImmSetConversionStatus(param0: HIMC, param1: IME_CONVERSION_MODE, param2: IME_SENTENCE_MODE): BOOL =
    0

public actual fun ImmSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: HKL): BOOL =
    0

public actual fun ImmSetOpenStatus(param0: HIMC, param1: BOOL): BOOL =
    0

public actual fun ImmSetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    0

public actual fun ImmShowSoftKeyboard(param0: HWND, param1: Int): BOOL =
    0

public actual fun ImmSimulateHotKey(param0: HWND, param1: IME_HOTKEY_IDENTIFIER): BOOL =
    0

public actual fun ImmUnlockIMC(param0: HIMC): BOOL =
    0

public actual fun ImmUnlockIMCC(param0: HIMCC): BOOL =
    0

public actual fun ImmUnregisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszunregister: PCSTR): BOOL =
    0

public actual fun ImmUnregisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszunregister: PCWSTR): BOOL =
    0
