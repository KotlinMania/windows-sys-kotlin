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

private val _windowsWin32UiInputImeNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ImmAssociateContext(param0: HWND, param1: HIMC): HIMC =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmAssociateContext(param0.toString(), param1.toString()) as String).toLong() else 0L

public actual fun ImmAssociateContextEx(param0: HWND, param1: HIMC, param2: UInt): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmAssociateContextEx(param0.toString(), param1.toString(), param2.toInt()) as Int) else 0

public actual fun ImmConfigureIMEA(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmConfigureIMEA(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun ImmConfigureIMEW(param0: HKL, param1: HWND, param2: UInt, param3: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmConfigureIMEW(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun ImmCreateContext(): HIMC =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmCreateContext() as String).toLong() else 0L

public actual fun ImmCreateIMCC(param0: UInt): HIMCC =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmCreateIMCC(param0.toInt()) as String).toLong() else 0L

public actual fun ImmCreateSoftKeyboard(param0: UInt, param1: HWND, param2: Int, param3: Int): HWND =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmCreateSoftKeyboard(param0.toInt(), param1.toString(), param2, param3) as String).toLong() else 0L

public actual fun ImmDestroyContext(param0: HIMC): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmDestroyContext(param0.toString()) as Int) else 0

public actual fun ImmDestroyIMCC(param0: HIMCC): HIMCC =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmDestroyIMCC(param0.toString()) as String).toLong() else 0L

public actual fun ImmDestroySoftKeyboard(param0: HWND): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmDestroySoftKeyboard(param0.toString()) as Int) else 0

public actual fun ImmDisableIME(param0: UInt): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmDisableIME(param0.toInt()) as Int) else 0

public actual fun ImmDisableLegacyIME(): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmDisableLegacyIME() as Int) else 0

public actual fun ImmDisableTextFrameService(idthread: UInt): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmDisableTextFrameService(idthread.toInt()) as Int) else 0

public actual fun ImmEnumInputContext(idthread: UInt, lpfn: IMCENUMPROC, lparam: LPARAM): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmEnumInputContext(idthread.toInt(), lpfn.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun ImmEnumRegisterWordA(param0: HKL, param1: REGISTERWORDENUMPROCA, lpszreading: PCSTR, param3: UInt, lpszregister: PCSTR, param5: Long): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordA(param0.toString(), param1.toLong().toString(), lpszreading.toString(), param3.toInt(), lpszregister.toString(), param5.toString()) as Int).toUInt() else 0u

public actual fun ImmEnumRegisterWordW(param0: HKL, param1: REGISTERWORDENUMPROCW, lpszreading: PCWSTR, param3: UInt, lpszregister: PCWSTR, param5: Long): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmEnumRegisterWordW(param0.toString(), param1.toLong().toString(), lpszreading.toString(), param3.toInt(), lpszregister.toString(), param5.toString()) as Int).toUInt() else 0u

public actual fun ImmEscapeA(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmEscapeA(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as String).toLong() else 0L

public actual fun ImmEscapeW(param0: HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): LRESULT =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmEscapeW(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as String).toLong() else 0L

public actual fun ImmGenerateMessage(param0: HIMC): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGenerateMessage(param0.toString()) as Int) else 0

public actual fun ImmGetCandidateListA(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListA(param0.toString(), deindex.toInt(), lpcandlist.toString(), dwbuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetCandidateListCountA(param0: HIMC, lpdwlistcount: Long): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountA(param0.toString(), lpdwlistcount.toString()) as Int).toUInt() else 0u

public actual fun ImmGetCandidateListCountW(param0: HIMC, lpdwlistcount: Long): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListCountW(param0.toString(), lpdwlistcount.toString()) as Int).toUInt() else 0u

public actual fun ImmGetCandidateListW(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCandidateListW(param0.toString(), deindex.toInt(), lpcandlist.toString(), dwbuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetCandidateWindow(param0: HIMC, param1: UInt, lpcandidate: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCandidateWindow(param0.toString(), param1.toInt(), lpcandidate.toString()) as Int) else 0

public actual fun ImmGetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontA(param0.toString(), lplf.toString()) as Int) else 0

public actual fun ImmGetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCompositionFontW(param0.toString(), lplf.toString()) as Int) else 0

public actual fun ImmGetCompositionStringA(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringA(param0.toString(), param1.toInt(), lpbuf.toString(), dwbuflen.toInt()) as Int) else 0

public actual fun ImmGetCompositionStringW(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCompositionStringW(param0.toString(), param1.toInt(), lpbuf.toString(), dwbuflen.toInt()) as Int) else 0

public actual fun ImmGetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetCompositionWindow(param0.toString(), lpcompform.toString()) as Int) else 0

public actual fun ImmGetContext(param0: HWND): HIMC =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetContext(param0.toString()) as String).toLong() else 0L

public actual fun ImmGetConversionListA(param0: HKL, param1: HIMC, lpsrc: PCSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetConversionListA(param0.toString(), param1.toString(), lpsrc.toString(), lpdst.toString(), dwbuflen.toInt(), uflag.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetConversionListW(param0: HKL, param1: HIMC, lpsrc: PCWSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetConversionListW(param0.toString(), param1.toString(), lpsrc.toString(), lpdst.toString(), dwbuflen.toInt(), uflag.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetConversionStatus(param0: HIMC, lpfdwconversion: Long, lpfdwsentence: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetConversionStatus(param0.toString(), lpfdwconversion.toString(), lpfdwsentence.toString()) as Int) else 0

public actual fun ImmGetDefaultIMEWnd(param0: HWND): HWND =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetDefaultIMEWnd(param0.toString()) as String).toLong() else 0L

public actual fun ImmGetDescriptionA(param0: HKL, lpszdescription: PSTR, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetDescriptionA(param0.toString(), lpszdescription.toString(), ubuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetDescriptionW(param0: HKL, lpszdescription: PWSTR, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetDescriptionW(param0.toString(), lpszdescription.toString(), ubuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetGuideLineA(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PSTR, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetGuideLineA(param0.toString(), dwindex.toInt(), lpbuf.toString(), dwbuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetGuideLineW(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PWSTR, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetGuideLineW(param0.toString(), dwindex.toInt(), lpbuf.toString(), dwbuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetHotKey(param0: UInt, lpumodifiers: Long, lpuvkey: Long, phkl: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetHotKey(param0.toInt(), lpumodifiers.toString(), lpuvkey.toString(), phkl.toString()) as Int) else 0

public actual fun ImmGetIMCCLockCount(param0: HIMCC): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetIMCCLockCount(param0.toString()) as Int).toUInt() else 0u

public actual fun ImmGetIMCCSize(param0: HIMCC): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetIMCCSize(param0.toString()) as Int).toUInt() else 0u

public actual fun ImmGetIMCLockCount(param0: HIMC): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetIMCLockCount(param0.toString()) as Int).toUInt() else 0u

public actual fun ImmGetIMEFileNameA(param0: HKL, lpszfilename: PSTR, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameA(param0.toString(), lpszfilename.toString(), ubuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetIMEFileNameW(param0: HKL, lpszfilename: PWSTR, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetIMEFileNameW(param0.toString(), lpszfilename.toString(), ubuflen.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetImeMenuItemsA(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsA(param0.toString(), param1.toInt(), param2.toInt(), lpimeparentmenu.toString(), lpimemenu.toString(), dwsize.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetImeMenuItemsW(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetImeMenuItemsW(param0.toString(), param1.toInt(), param2.toInt(), lpimeparentmenu.toString(), lpimemenu.toString(), dwsize.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetOpenStatus(param0: HIMC): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetOpenStatus(param0.toString()) as Int) else 0

public actual fun ImmGetProperty(param0: HKL, param1: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetProperty(param0.toString(), param1.toInt()) as Int).toUInt() else 0u

public actual fun ImmGetRegisterWordStyleA(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleA(param0.toString(), nitem.toInt(), lpstylebuf.toString()) as Int).toUInt() else 0u

public actual fun ImmGetRegisterWordStyleW(param0: HKL, nitem: UInt, lpstylebuf: Long): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetRegisterWordStyleW(param0.toString(), nitem.toInt(), lpstylebuf.toString()) as Int).toUInt() else 0u

public actual fun ImmGetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetStatusWindowPos(param0.toString(), lpptpos.toString()) as Int) else 0

public actual fun ImmGetVirtualKey(param0: HWND): UInt =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmGetVirtualKey(param0.toString()) as Int).toUInt() else 0u

public actual fun ImmInstallIMEA(lpszimefilename: PCSTR, lpszlayouttext: PCSTR): HKL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmInstallIMEA(lpszimefilename.toString(), lpszlayouttext.toString()) as String).toLong() else 0L

public actual fun ImmInstallIMEW(lpszimefilename: PCWSTR, lpszlayouttext: PCWSTR): HKL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmInstallIMEW(lpszimefilename.toString(), lpszlayouttext.toString()) as String).toLong() else 0L

public actual fun ImmIsIME(param0: HKL): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmIsIME(param0.toString()) as Int) else 0

public actual fun ImmIsUIMessageA(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmIsUIMessageA(param0.toString(), param1.toInt(), param2.toString(), param3.toString()) as Int) else 0

public actual fun ImmIsUIMessageW(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmIsUIMessageW(param0.toString(), param1.toInt(), param2.toString(), param3.toString()) as Int) else 0

public actual fun ImmLockIMC(param0: HIMC): Long =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmLockIMC(param0.toString()) as String).toLong() else 0L

public actual fun ImmLockIMCC(param0: HIMCC): Long =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmLockIMCC(param0.toString()) as String).toLong() else 0L

public actual fun ImmNotifyIME(param0: HIMC, dwaction: NOTIFY_IME_ACTION, dwindex: NOTIFY_IME_INDEX, dwvalue: UInt): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmNotifyIME(param0.toString(), dwaction.toInt(), dwindex.toInt(), dwvalue.toInt()) as Int) else 0

public actual fun ImmReSizeIMCC(param0: HIMCC, param1: UInt): HIMCC =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmReSizeIMCC(param0.toString(), param1.toInt()) as String).toLong() else 0L

public actual fun ImmRegisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszregister: PCSTR): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmRegisterWordA(param0.toString(), lpszreading.toString(), param2.toInt(), lpszregister.toString()) as Int) else 0

public actual fun ImmRegisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszregister: PCWSTR): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmRegisterWordW(param0.toString(), lpszreading.toString(), param2.toInt(), lpszregister.toString()) as Int) else 0

public actual fun ImmReleaseContext(param0: HWND, param1: HIMC): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmReleaseContext(param0.toString(), param1.toString()) as Int) else 0

public actual fun ImmRequestMessageA(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmRequestMessageA(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun ImmRequestMessageW(param0: HIMC, param1: WPARAM, param2: LPARAM): LRESULT =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmRequestMessageW(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun ImmSetCandidateWindow(param0: HIMC, lpcandidate: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetCandidateWindow(param0.toString(), lpcandidate.toString()) as Int) else 0

public actual fun ImmSetCompositionFontA(param0: HIMC, lplf: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontA(param0.toString(), lplf.toString()) as Int) else 0

public actual fun ImmSetCompositionFontW(param0: HIMC, lplf: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetCompositionFontW(param0.toString(), lplf.toString()) as Int) else 0

public actual fun ImmSetCompositionStringA(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringA(param0.toString(), dwindex.toInt(), lpcomp.toString(), dwcomplen.toInt(), lpread.toString(), dwreadlen.toInt()) as Int) else 0

public actual fun ImmSetCompositionStringW(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetCompositionStringW(param0.toString(), dwindex.toInt(), lpcomp.toString(), dwcomplen.toInt(), lpread.toString(), dwreadlen.toInt()) as Int) else 0

public actual fun ImmSetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetCompositionWindow(param0.toString(), lpcompform.toString()) as Int) else 0

public actual fun ImmSetConversionStatus(param0: HIMC, param1: IME_CONVERSION_MODE, param2: IME_SENTENCE_MODE): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetConversionStatus(param0.toString(), param1.toInt(), param2.toInt()) as Int) else 0

public actual fun ImmSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: HKL): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun ImmSetOpenStatus(param0: HIMC, param1: BOOL): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetOpenStatus(param0.toString(), param1) as Int) else 0

public actual fun ImmSetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSetStatusWindowPos(param0.toString(), lpptpos.toString()) as Int) else 0

public actual fun ImmShowSoftKeyboard(param0: HWND, param1: Int): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmShowSoftKeyboard(param0.toString(), param1) as Int) else 0

public actual fun ImmSimulateHotKey(param0: HWND, param1: IME_HOTKEY_IDENTIFIER): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmSimulateHotKey(param0.toString(), param1.toInt()) as Int) else 0

public actual fun ImmUnlockIMC(param0: HIMC): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmUnlockIMC(param0.toString()) as Int) else 0

public actual fun ImmUnlockIMCC(param0: HIMCC): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmUnlockIMCC(param0.toString()) as Int) else 0

public actual fun ImmUnregisterWordA(param0: HKL, lpszreading: PCSTR, param2: UInt, lpszunregister: PCSTR): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmUnregisterWordA(param0.toString(), lpszreading.toString(), param2.toInt(), lpszunregister.toString()) as Int) else 0

public actual fun ImmUnregisterWordW(param0: HKL, lpszreading: PCWSTR, param2: UInt, lpszunregister: PCWSTR): BOOL =
    if (_windowsWin32UiInputImeNapiAddon != null) (_windowsWin32UiInputImeNapiAddon.windowssys_windows_win32_ui_input_ime_ImmUnregisterWordW(param0.toString(), lpszreading.toString(), param2.toInt(), lpszunregister.toString()) as Int) else 0
