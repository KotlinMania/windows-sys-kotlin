@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ImmAssociateContext(param0: HWND, param1: HIMC): HIMC =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmAssociateContext(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmAssociateContextEx(param0: HWND, param1: HIMC, param2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmAssociateContextEx(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun ImmConfigureIMEA(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmConfigureIMEA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun ImmConfigureIMEW(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmConfigureIMEW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun ImmCreateContext(): HIMC =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmCreateContext()?.toLong() ?: 0L

public actual fun ImmCreateIMCC(param0: UInt): HIMCC =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmCreateIMCC(param0)?.toLong() ?: 0L

public actual fun ImmCreateSoftKeyboard(param0: UInt, param1: HWND, param2: Int, param3: Int): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmCreateSoftKeyboard(param0, param1.toCPointer<ByteVar>(), param2, param3)?.toLong() ?: 0L

public actual fun ImmDestroyContext(param0: HIMC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmDestroyContext(param0.toCPointer<ByteVar>())

public actual fun ImmDestroyIMCC(param0: HIMCC): HIMCC =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmDestroyIMCC(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmDestroySoftKeyboard(param0: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmDestroySoftKeyboard(param0.toCPointer<ByteVar>())

public actual fun ImmDisableIME(param0: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmDisableIME(param0)

public actual fun ImmDisableLegacyIME(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmDisableLegacyIME()

public actual fun ImmDisableTextFrameService(idthread: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmDisableTextFrameService(idthread)

public actual fun ImmEnumInputContext(idthread: UInt, lpfn: IMCENUMPROC, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmEnumInputContext(idthread, lpfn.toLong().toCPointer<ByteVar>(), lparam)

public actual fun ImmEnumRegisterWordA(param0: HKL, param1: REGISTERWORDENUMPROCA, lpszreading: PCSTR, param3: UInt, lpszregister: PCSTR, param5: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordA(param0.toCPointer<ByteVar>(), param1.toLong().toCPointer<ByteVar>(), lpszreading.toCPointer<ByteVar>(), param3, lpszregister.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>())

public actual fun ImmEnumRegisterWordW(param0: HKL, param1: REGISTERWORDENUMPROCW, lpszreading: PCWSTR, param3: UInt, lpszregister: PCWSTR, param5: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordW(param0.toCPointer<ByteVar>(), param1.toLong().toCPointer<ByteVar>(), lpszreading.toCPointer<ByteVar>(), param3, lpszregister.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>())

public actual fun ImmEscapeA(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmEscapeA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun ImmEscapeW(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmEscapeW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun ImmGenerateMessage(param0: HIMC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGenerateMessage(param0.toCPointer<ByteVar>())

public actual fun ImmGetCandidateListA(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListA(param0.toCPointer<ByteVar>(), deindex, lpcandlist.toCPointer<ByteVar>(), dwbuflen)

public actual fun ImmGetCandidateListCountA(param0: HIMC, lpdwlistcount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountA(param0.toCPointer<ByteVar>(), lpdwlistcount.toCPointer<ByteVar>())

public actual fun ImmGetCandidateListCountW(param0: HIMC, lpdwlistcount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountW(param0.toCPointer<ByteVar>(), lpdwlistcount.toCPointer<ByteVar>())

public actual fun ImmGetCandidateListW(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListW(param0.toCPointer<ByteVar>(), deindex, lpcandlist.toCPointer<ByteVar>(), dwbuflen)

public actual fun ImmGetCandidateWindow(param0: HIMC, param1: UInt, lpcandidate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCandidateWindow(param0.toCPointer<ByteVar>(), param1, lpcandidate.toCPointer<ByteVar>())

public actual fun ImmGetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontA(param0.toCPointer<ByteVar>(), lplf.toCPointer<ByteVar>())

public actual fun ImmGetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontW(param0.toCPointer<ByteVar>(), lplf.toCPointer<ByteVar>())

public actual fun ImmGetCompositionStringA(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringA(param0.toCPointer<ByteVar>(), param1, lpbuf.toCPointer<ByteVar>(), dwbuflen)

public actual fun ImmGetCompositionStringW(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringW(param0.toCPointer<ByteVar>(), param1, lpbuf.toCPointer<ByteVar>(), dwbuflen)

public actual fun ImmGetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetCompositionWindow(param0.toCPointer<ByteVar>(), lpcompform.toCPointer<ByteVar>())

public actual fun ImmGetContext(param0: HWND): HIMC =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetContext(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmGetConversionListA(param0: HKL, param1: HIMC, lpsrc: PCSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetConversionListA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), lpsrc.toCPointer<ByteVar>(), lpdst.toCPointer<ByteVar>(), dwbuflen, uflag)

public actual fun ImmGetConversionListW(param0: HKL, param1: HIMC, lpsrc: PCWSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetConversionListW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), lpsrc.toCPointer<ByteVar>(), lpdst.toCPointer<ByteVar>(), dwbuflen, uflag)

public actual fun ImmGetConversionStatus(param0: HIMC, lpfdwconversion: Long, lpfdwsentence: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetConversionStatus(param0.toCPointer<ByteVar>(), lpfdwconversion.toCPointer<ByteVar>(), lpfdwsentence.toCPointer<ByteVar>())

public actual fun ImmGetDefaultIMEWnd(param0: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetDefaultIMEWnd(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmGetDescriptionA(param0: HKL, lpszdescription: PSTR, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetDescriptionA(param0.toCPointer<ByteVar>(), lpszdescription.toCPointer<ByteVar>(), ubuflen)

public actual fun ImmGetDescriptionW(param0: HKL, lpszdescription: PWSTR, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetDescriptionW(param0.toCPointer<ByteVar>(), lpszdescription.toCPointer<ByteVar>(), ubuflen)

public actual fun ImmGetGuideLineA(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PSTR, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetGuideLineA(param0.toCPointer<ByteVar>(), dwindex, lpbuf.toCPointer<ByteVar>(), dwbuflen)

public actual fun ImmGetGuideLineW(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PWSTR, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetGuideLineW(param0.toCPointer<ByteVar>(), dwindex, lpbuf.toCPointer<ByteVar>(), dwbuflen)

public actual fun ImmGetHotKey(param0: UInt, lpumodifiers: Long, lpuvkey: Long, phkl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetHotKey(param0, lpumodifiers.toCPointer<ByteVar>(), lpuvkey.toCPointer<ByteVar>(), phkl.toCPointer<ByteVar>())

public actual fun ImmGetIMCCLockCount(param0: HIMCC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetIMCCLockCount(param0.toCPointer<ByteVar>())

public actual fun ImmGetIMCCSize(param0: HIMCC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetIMCCSize(param0.toCPointer<ByteVar>())

public actual fun ImmGetIMCLockCount(param0: HIMC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetIMCLockCount(param0.toCPointer<ByteVar>())

public actual fun ImmGetIMEFileNameA(param0: HKL, lpszfilename: PSTR, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameA(param0.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), ubuflen)

public actual fun ImmGetIMEFileNameW(param0: HKL, lpszfilename: PWSTR, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameW(param0.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), ubuflen)

public actual fun ImmGetImeMenuItemsA(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsA(param0.toCPointer<ByteVar>(), param1, param2, lpimeparentmenu.toCPointer<ByteVar>(), lpimemenu.toCPointer<ByteVar>(), dwsize)

public actual fun ImmGetImeMenuItemsW(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsW(param0.toCPointer<ByteVar>(), param1, param2, lpimeparentmenu.toCPointer<ByteVar>(), lpimemenu.toCPointer<ByteVar>(), dwsize)

public actual fun ImmGetOpenStatus(param0: HIMC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetOpenStatus(param0.toCPointer<ByteVar>())

public actual fun ImmGetProperty(param0: HKL, param1: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetProperty(param0.toCPointer<ByteVar>(), param1)

public actual fun ImmGetRegisterWordStyleA(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleA(param0.toCPointer<ByteVar>(), nitem, lpstylebuf.toCPointer<ByteVar>())

public actual fun ImmGetRegisterWordStyleW(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleW(param0.toCPointer<ByteVar>(), nitem, lpstylebuf.toCPointer<ByteVar>())

public actual fun ImmGetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetStatusWindowPos(param0.toCPointer<ByteVar>(), lpptpos.toCPointer<ByteVar>())

public actual fun ImmGetVirtualKey(param0: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmGetVirtualKey(param0.toCPointer<ByteVar>())

public actual fun ImmInstallIMEA(lpszimefilename: PCSTR, lpszlayouttext: PCSTR): HKL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmInstallIMEA(lpszimefilename.toCPointer<ByteVar>(), lpszlayouttext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmInstallIMEW(lpszimefilename: PCWSTR, lpszlayouttext: PCWSTR): HKL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmInstallIMEW(lpszimefilename.toCPointer<ByteVar>(), lpszlayouttext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmIsIME(param0: HKL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmIsIME(param0.toCPointer<ByteVar>())

public actual fun ImmIsUIMessageA(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmIsUIMessageA(param0.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun ImmIsUIMessageW(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmIsUIMessageW(param0.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun ImmLockIMC(param0: HIMC): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmLockIMC(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmLockIMCC(param0: HIMCC): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmLockIMCC(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImmNotifyIME(param0: HIMC, dwaction: NOTIFY_IME_ACTION, dwindex: NOTIFY_IME_INDEX, dwvalue: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmNotifyIME(param0.toCPointer<ByteVar>(), dwaction, dwindex, dwvalue)

public actual fun ImmReSizeIMCC(param0: HIMCC, param1: UInt): HIMCC =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmReSizeIMCC(param0.toCPointer<ByteVar>(), param1)?.toLong() ?: 0L

public actual fun ImmRegisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszregister: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmRegisterWordA(param0.toCPointer<ByteVar>(), lpszreading.toCPointer<ByteVar>(), param2, lpszregister.toCPointer<ByteVar>())

public actual fun ImmRegisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszregister: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmRegisterWordW(param0.toCPointer<ByteVar>(), lpszreading.toCPointer<ByteVar>(), param2, lpszregister.toCPointer<ByteVar>())

public actual fun ImmReleaseContext(param0: HWND, param1: HIMC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmReleaseContext(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun ImmRequestMessageA(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmRequestMessageA(param0.toCPointer<ByteVar>(), param1, param2)

public actual fun ImmRequestMessageW(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmRequestMessageW(param0.toCPointer<ByteVar>(), param1, param2)

public actual fun ImmSetCandidateWindow(param0: HIMC, lpcandidate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetCandidateWindow(param0.toCPointer<ByteVar>(), lpcandidate.toCPointer<ByteVar>())

public actual fun ImmSetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontA(param0.toCPointer<ByteVar>(), lplf.toCPointer<ByteVar>())

public actual fun ImmSetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontW(param0.toCPointer<ByteVar>(), lplf.toCPointer<ByteVar>())

public actual fun ImmSetCompositionStringA(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringA(param0.toCPointer<ByteVar>(), dwindex, lpcomp.toCPointer<ByteVar>(), dwcomplen, lpread.toCPointer<ByteVar>(), dwreadlen)

public actual fun ImmSetCompositionStringW(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringW(param0.toCPointer<ByteVar>(), dwindex, lpcomp.toCPointer<ByteVar>(), dwcomplen, lpread.toCPointer<ByteVar>(), dwreadlen)

public actual fun ImmSetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetCompositionWindow(param0.toCPointer<ByteVar>(), lpcompform.toCPointer<ByteVar>())

public actual fun ImmSetConversionStatus(param0: HIMC, param1: IME_CONVERSION_MODE, param2: IME_SENTENCE_MODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetConversionStatus(param0.toCPointer<ByteVar>(), param1, param2)

public actual fun ImmSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: HKL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetHotKey(param0, param1, param2, param3.toCPointer<ByteVar>())

public actual fun ImmSetOpenStatus(param0: HIMC, param1: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetOpenStatus(param0.toCPointer<ByteVar>(), param1)

public actual fun ImmSetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSetStatusWindowPos(param0.toCPointer<ByteVar>(), lpptpos.toCPointer<ByteVar>())

public actual fun ImmShowSoftKeyboard(param0: HWND, param1: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmShowSoftKeyboard(param0.toCPointer<ByteVar>(), param1)

public actual fun ImmSimulateHotKey(param0: HWND, param1: IME_HOTKEY_IDENTIFIER): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmSimulateHotKey(param0.toCPointer<ByteVar>(), param1)

public actual fun ImmUnlockIMC(param0: HIMC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmUnlockIMC(param0.toCPointer<ByteVar>())

public actual fun ImmUnlockIMCC(param0: HIMCC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmUnlockIMCC(param0.toCPointer<ByteVar>())

public actual fun ImmUnregisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszunregister: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmUnregisterWordA(param0.toCPointer<ByteVar>(), lpszreading.toCPointer<ByteVar>(), param2, lpszunregister.toCPointer<ByteVar>())

public actual fun ImmUnregisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszunregister: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_ImmUnregisterWordW(param0.toCPointer<ByteVar>(), lpszreading.toCPointer<ByteVar>(), param2, lpszunregister.toCPointer<ByteVar>())
