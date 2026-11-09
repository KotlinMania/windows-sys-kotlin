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

private object WindowsWin32UiInputImeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmAssociateContext(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmAssociateContextEx(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmConfigureIMEA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmConfigureIMEW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmCreateContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmCreateIMCC(param0: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmCreateSoftKeyboard(param0: Int, param1: Long, param2: Int, param3: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmDestroyContext(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmDestroyIMCC(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmDestroySoftKeyboard(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmDisableIME(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmDisableLegacyIME(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmDisableTextFrameService(idthread: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmEnumInputContext(idthread: Int, lpfn: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordA(param0: Long, param1: Long, lpszreading: Long, param3: Int, lpszregister: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordW(param0: Long, param1: Long, lpszreading: Long, param3: Int, lpszregister: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmEscapeA(param0: Long, param1: Long, param2: Int, param3: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmEscapeW(param0: Long, param1: Long, param2: Int, param3: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGenerateMessage(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCandidateListA(param0: Long, deindex: Int, lpcandlist: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountA(param0: Long, lpdwlistcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountW(param0: Long, lpdwlistcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCandidateListW(param0: Long, deindex: Int, lpcandlist: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCandidateWindow(param0: Long, param1: Int, lpcandidate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontA(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontW(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringA(param0: Long, param1: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringW(param0: Long, param1: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetCompositionWindow(param0: Long, lpcompform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetContext(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetConversionListA(param0: Long, param1: Long, lpsrc: Long, lpdst: Long, dwbuflen: Int, uflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetConversionListW(param0: Long, param1: Long, lpsrc: Long, lpdst: Long, dwbuflen: Int, uflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetConversionStatus(param0: Long, lpfdwconversion: Long, lpfdwsentence: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetDefaultIMEWnd(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetDescriptionA(param0: Long, lpszdescription: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetDescriptionW(param0: Long, lpszdescription: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetGuideLineA(param0: Long, dwindex: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetGuideLineW(param0: Long, dwindex: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetHotKey(param0: Int, lpumodifiers: Long, lpuvkey: Long, phkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetIMCCLockCount(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetIMCCSize(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetIMCLockCount(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameA(param0: Long, lpszfilename: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameW(param0: Long, lpszfilename: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsA(param0: Long, param1: Int, param2: Int, lpimeparentmenu: Long, lpimemenu: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsW(param0: Long, param1: Int, param2: Int, lpimeparentmenu: Long, lpimemenu: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetOpenStatus(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetProperty(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleA(param0: Long, nitem: Int, lpstylebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleW(param0: Long, nitem: Int, lpstylebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetStatusWindowPos(param0: Long, lpptpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmGetVirtualKey(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmInstallIMEA(lpszimefilename: Long, lpszlayouttext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmInstallIMEW(lpszimefilename: Long, lpszlayouttext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmIsIME(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmIsUIMessageA(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmIsUIMessageW(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmLockIMC(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmLockIMCC(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmNotifyIME(param0: Long, dwaction: Int, dwindex: Int, dwvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmReSizeIMCC(param0: Long, param1: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmRegisterWordA(param0: Long, lpszreading: Long, param2: Int, lpszregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmRegisterWordW(param0: Long, lpszreading: Long, param2: Int, lpszregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmReleaseContext(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmRequestMessageA(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmRequestMessageW(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetCandidateWindow(param0: Long, lpcandidate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontA(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontW(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringA(param0: Long, dwindex: Int, lpcomp: Long, dwcomplen: Int, lpread: Long, dwreadlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringW(param0: Long, dwindex: Int, lpcomp: Long, dwcomplen: Int, lpread: Long, dwreadlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetCompositionWindow(param0: Long, lpcompform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetConversionStatus(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetHotKey(param0: Int, param1: Int, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetOpenStatus(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSetStatusWindowPos(param0: Long, lpptpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmShowSoftKeyboard(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmSimulateHotKey(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmUnlockIMC(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmUnlockIMCC(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmUnregisterWordA(param0: Long, lpszreading: Long, param2: Int, lpszunregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_ImmUnregisterWordW(param0: Long, lpszreading: Long, param2: Int, lpszunregister: Long): Int
}

public actual fun ImmAssociateContext(param0: HWND, param1: HIMC): HIMC =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmAssociateContext(param0, param1)

public actual fun ImmAssociateContextEx(param0: HWND, param1: HIMC, param2: UInt): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmAssociateContextEx(param0, param1, param2.toInt())

public actual fun ImmConfigureIMEA(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmConfigureIMEA(param0, param1, param2.toInt(), param3)

public actual fun ImmConfigureIMEW(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmConfigureIMEW(param0, param1, param2.toInt(), param3)

public actual fun ImmCreateContext(): HIMC =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmCreateContext()

public actual fun ImmCreateIMCC(param0: UInt): HIMCC =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmCreateIMCC(param0.toInt())

public actual fun ImmCreateSoftKeyboard(param0: UInt, param1: HWND, param2: Int, param3: Int): HWND =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmCreateSoftKeyboard(param0.toInt(), param1, param2, param3)

public actual fun ImmDestroyContext(param0: HIMC): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmDestroyContext(param0)

public actual fun ImmDestroyIMCC(param0: HIMCC): HIMCC =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmDestroyIMCC(param0)

public actual fun ImmDestroySoftKeyboard(param0: HWND): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmDestroySoftKeyboard(param0)

public actual fun ImmDisableIME(param0: UInt): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmDisableIME(param0.toInt())

public actual fun ImmDisableLegacyIME(): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmDisableLegacyIME()

public actual fun ImmDisableTextFrameService(idthread: UInt): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmDisableTextFrameService(idthread.toInt())

public actual fun ImmEnumInputContext(idthread: UInt, lpfn: IMCENUMPROC, lparam: LPARAM): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmEnumInputContext(idthread.toInt(), lpfn.toLong(), lparam)

public actual fun ImmEnumRegisterWordA(param0: HKL, param1: REGISTERWORDENUMPROCA, lpszreading: PCSTR, param3: UInt, lpszregister: PCSTR, param5: Long): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordA(param0, param1.toLong(), lpszreading, param3.toInt(), lpszregister, param5).toUInt()

public actual fun ImmEnumRegisterWordW(param0: HKL, param1: REGISTERWORDENUMPROCW, lpszreading: PCWSTR, param3: UInt, lpszregister: PCWSTR, param5: Long): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordW(param0, param1.toLong(), lpszreading, param3.toInt(), lpszregister, param5).toUInt()

public actual fun ImmEscapeA(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmEscapeA(param0, param1, param2.toInt(), param3)

public actual fun ImmEscapeW(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmEscapeW(param0, param1, param2.toInt(), param3)

public actual fun ImmGenerateMessage(param0: HIMC): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGenerateMessage(param0)

public actual fun ImmGetCandidateListA(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListA(param0, deindex.toInt(), lpcandlist, dwbuflen.toInt()).toUInt()

public actual fun ImmGetCandidateListCountA(param0: HIMC, lpdwlistcount: Long): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountA(param0, lpdwlistcount).toUInt()

public actual fun ImmGetCandidateListCountW(param0: HIMC, lpdwlistcount: Long): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountW(param0, lpdwlistcount).toUInt()

public actual fun ImmGetCandidateListW(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListW(param0, deindex.toInt(), lpcandlist, dwbuflen.toInt()).toUInt()

public actual fun ImmGetCandidateWindow(param0: HIMC, param1: UInt, lpcandidate: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCandidateWindow(param0, param1.toInt(), lpcandidate)

public actual fun ImmGetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontA(param0, lplf)

public actual fun ImmGetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontW(param0, lplf)

public actual fun ImmGetCompositionStringA(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringA(param0, param1.toInt(), lpbuf, dwbuflen.toInt())

public actual fun ImmGetCompositionStringW(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringW(param0, param1.toInt(), lpbuf, dwbuflen.toInt())

public actual fun ImmGetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetCompositionWindow(param0, lpcompform)

public actual fun ImmGetContext(param0: HWND): HIMC =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetContext(param0)

public actual fun ImmGetConversionListA(param0: HKL, param1: HIMC, lpsrc: PCSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetConversionListA(param0, param1, lpsrc, lpdst, dwbuflen.toInt(), uflag.toInt()).toUInt()

public actual fun ImmGetConversionListW(param0: HKL, param1: HIMC, lpsrc: PCWSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetConversionListW(param0, param1, lpsrc, lpdst, dwbuflen.toInt(), uflag.toInt()).toUInt()

public actual fun ImmGetConversionStatus(param0: HIMC, lpfdwconversion: Long, lpfdwsentence: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetConversionStatus(param0, lpfdwconversion, lpfdwsentence)

public actual fun ImmGetDefaultIMEWnd(param0: HWND): HWND =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetDefaultIMEWnd(param0)

public actual fun ImmGetDescriptionA(param0: HKL, lpszdescription: PSTR, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetDescriptionA(param0, lpszdescription, ubuflen.toInt()).toUInt()

public actual fun ImmGetDescriptionW(param0: HKL, lpszdescription: PWSTR, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetDescriptionW(param0, lpszdescription, ubuflen.toInt()).toUInt()

public actual fun ImmGetGuideLineA(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PSTR, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetGuideLineA(param0, dwindex.toInt(), lpbuf, dwbuflen.toInt()).toUInt()

public actual fun ImmGetGuideLineW(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PWSTR, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetGuideLineW(param0, dwindex.toInt(), lpbuf, dwbuflen.toInt()).toUInt()

public actual fun ImmGetHotKey(param0: UInt, lpumodifiers: Long, lpuvkey: Long, phkl: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetHotKey(param0.toInt(), lpumodifiers, lpuvkey, phkl)

public actual fun ImmGetIMCCLockCount(param0: HIMCC): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetIMCCLockCount(param0).toUInt()

public actual fun ImmGetIMCCSize(param0: HIMCC): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetIMCCSize(param0).toUInt()

public actual fun ImmGetIMCLockCount(param0: HIMC): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetIMCLockCount(param0).toUInt()

public actual fun ImmGetIMEFileNameA(param0: HKL, lpszfilename: PSTR, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameA(param0, lpszfilename, ubuflen.toInt()).toUInt()

public actual fun ImmGetIMEFileNameW(param0: HKL, lpszfilename: PWSTR, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameW(param0, lpszfilename, ubuflen.toInt()).toUInt()

public actual fun ImmGetImeMenuItemsA(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsA(param0, param1.toInt(), param2.toInt(), lpimeparentmenu, lpimemenu, dwsize.toInt()).toUInt()

public actual fun ImmGetImeMenuItemsW(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsW(param0, param1.toInt(), param2.toInt(), lpimeparentmenu, lpimemenu, dwsize.toInt()).toUInt()

public actual fun ImmGetOpenStatus(param0: HIMC): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetOpenStatus(param0)

public actual fun ImmGetProperty(param0: HKL, param1: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetProperty(param0, param1.toInt()).toUInt()

public actual fun ImmGetRegisterWordStyleA(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleA(param0, nitem.toInt(), lpstylebuf).toUInt()

public actual fun ImmGetRegisterWordStyleW(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleW(param0, nitem.toInt(), lpstylebuf).toUInt()

public actual fun ImmGetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetStatusWindowPos(param0, lpptpos)

public actual fun ImmGetVirtualKey(param0: HWND): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmGetVirtualKey(param0).toUInt()

public actual fun ImmInstallIMEA(lpszimefilename: PCSTR, lpszlayouttext: PCSTR): HKL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmInstallIMEA(lpszimefilename, lpszlayouttext)

public actual fun ImmInstallIMEW(lpszimefilename: PCWSTR, lpszlayouttext: PCWSTR): HKL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmInstallIMEW(lpszimefilename, lpszlayouttext)

public actual fun ImmIsIME(param0: HKL): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmIsIME(param0)

public actual fun ImmIsUIMessageA(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmIsUIMessageA(param0, param1.toInt(), param2.toLong(), param3)

public actual fun ImmIsUIMessageW(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmIsUIMessageW(param0, param1.toInt(), param2.toLong(), param3)

public actual fun ImmLockIMC(param0: HIMC): Long =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmLockIMC(param0)

public actual fun ImmLockIMCC(param0: HIMCC): Long =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmLockIMCC(param0)

public actual fun ImmNotifyIME(param0: HIMC, dwaction: NOTIFY_IME_ACTION, dwindex: NOTIFY_IME_INDEX, dwvalue: UInt): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmNotifyIME(param0, dwaction.toInt(), dwindex.toInt(), dwvalue.toInt())

public actual fun ImmReSizeIMCC(param0: HIMCC, param1: UInt): HIMCC =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmReSizeIMCC(param0, param1.toInt())

public actual fun ImmRegisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszregister: PCSTR): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmRegisterWordA(param0, lpszreading, param2.toInt(), lpszregister)

public actual fun ImmRegisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszregister: PCWSTR): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmRegisterWordW(param0, lpszreading, param2.toInt(), lpszregister)

public actual fun ImmReleaseContext(param0: HWND, param1: HIMC): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmReleaseContext(param0, param1)

public actual fun ImmRequestMessageA(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmRequestMessageA(param0, param1.toLong(), param2)

public actual fun ImmRequestMessageW(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmRequestMessageW(param0, param1.toLong(), param2)

public actual fun ImmSetCandidateWindow(param0: HIMC, lpcandidate: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetCandidateWindow(param0, lpcandidate)

public actual fun ImmSetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontA(param0, lplf)

public actual fun ImmSetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontW(param0, lplf)

public actual fun ImmSetCompositionStringA(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringA(param0, dwindex.toInt(), lpcomp, dwcomplen.toInt(), lpread, dwreadlen.toInt())

public actual fun ImmSetCompositionStringW(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringW(param0, dwindex.toInt(), lpcomp, dwcomplen.toInt(), lpread, dwreadlen.toInt())

public actual fun ImmSetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetCompositionWindow(param0, lpcompform)

public actual fun ImmSetConversionStatus(param0: HIMC, param1: IME_CONVERSION_MODE, param2: IME_SENTENCE_MODE): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetConversionStatus(param0, param1.toInt(), param2.toInt())

public actual fun ImmSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: HKL): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), param3)

public actual fun ImmSetOpenStatus(param0: HIMC, param1: BOOL): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetOpenStatus(param0, param1)

public actual fun ImmSetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSetStatusWindowPos(param0, lpptpos)

public actual fun ImmShowSoftKeyboard(param0: HWND, param1: Int): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmShowSoftKeyboard(param0, param1)

public actual fun ImmSimulateHotKey(param0: HWND, param1: IME_HOTKEY_IDENTIFIER): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmSimulateHotKey(param0, param1.toInt())

public actual fun ImmUnlockIMC(param0: HIMC): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmUnlockIMC(param0)

public actual fun ImmUnlockIMCC(param0: HIMCC): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmUnlockIMCC(param0)

public actual fun ImmUnregisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszunregister: PCSTR): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmUnregisterWordA(param0, lpszreading, param2.toInt(), lpszunregister)

public actual fun ImmUnregisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszunregister: PCWSTR): BOOL =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_ImmUnregisterWordW(param0, lpszreading, param2.toInt(), lpszunregister)
