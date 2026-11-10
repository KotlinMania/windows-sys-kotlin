@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.COpaquePointer
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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immAssociateContext(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immAssociateContextEx(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immConfigureIMEA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immConfigureIMEW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun immCreateContext(): Himc =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immCreateContext()?.let { COpaquePointer(it.toLong()) }

public actual fun immCreateIMCC(param0: UInt): Himcc =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immCreateIMCC(param0)?.let { COpaquePointer(it.toLong()) }

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(param0, param1?.value?.toCPointer<ByteVar>(), param2, param3)?.let { COpaquePointer(it.toLong()) }

public actual fun immDestroyContext(param0: Himc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immDestroyContext(param0?.value?.toCPointer<ByteVar>())

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immDestroyIMCC(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard(param0?.value?.toCPointer<ByteVar>())

public actual fun immDisableIME(param0: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immDisableIME(param0)

public actual fun immDisableLegacyIME(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immDisableLegacyIME()

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(idthread)

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immEnumInputContext(idthread, 0L.toCPointer<ByteVar>(), lparam)

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA(param0?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszreading?.value?.toCPointer<ByteVar>(), param3, lpszregister?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>())

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW(param0?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszreading?.value?.toCPointer<ByteVar>(), param3, lpszregister?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>())

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immEscapeA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immEscapeW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun immGenerateMessage(param0: Himc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGenerateMessage(param0?.value?.toCPointer<ByteVar>())

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCandidateListA(param0?.value?.toCPointer<ByteVar>(), deindex, lpcandlist?.value?.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA(param0?.value?.toCPointer<ByteVar>(), lpdwlistcount?.value?.toCPointer<ByteVar>())

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW(param0?.value?.toCPointer<ByteVar>(), lpdwlistcount?.value?.toCPointer<ByteVar>())

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCandidateListW(param0?.value?.toCPointer<ByteVar>(), deindex, lpcandlist?.value?.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCandidateWindow(param0?.value?.toCPointer<ByteVar>(), param1, lpcandidate?.value?.toCPointer<ByteVar>())

public actual fun immGetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCompositionFontA(param0?.value?.toCPointer<ByteVar>(), lplf?.value?.toCPointer<ByteVar>())

public actual fun immGetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCompositionFontW(param0?.value?.toCPointer<ByteVar>(), lplf?.value?.toCPointer<ByteVar>())

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCompositionStringA(param0?.value?.toCPointer<ByteVar>(), param1, lpbuf?.value?.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCompositionStringW(param0?.value?.toCPointer<ByteVar>(), param1, lpbuf?.value?.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetCompositionWindow(param0?.value?.toCPointer<ByteVar>(), lpcompform?.value?.toCPointer<ByteVar>())

public actual fun immGetContext(param0: Hwnd): Himc =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetContext(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetConversionListA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), lpsrc?.value?.toCPointer<ByteVar>(), lpdst?.value?.toCPointer<ByteVar>(), dwbuflen, uflag)

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetConversionListW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), lpsrc?.value?.toCPointer<ByteVar>(), lpdst?.value?.toCPointer<ByteVar>(), dwbuflen, uflag)

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: COpaquePointer?, lpfdwsentence: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetConversionStatus(param0?.value?.toCPointer<ByteVar>(), lpfdwconversion?.value?.toCPointer<ByteVar>(), lpfdwsentence?.value?.toCPointer<ByteVar>())

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetDescriptionA(param0?.value?.toCPointer<ByteVar>(), lpszdescription?.value?.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetDescriptionW(param0?.value?.toCPointer<ByteVar>(), lpszdescription?.value?.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetGuideLineA(param0?.value?.toCPointer<ByteVar>(), dwindex, lpbuf?.value?.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetGuideLineW(param0?.value?.toCPointer<ByteVar>(), dwindex, lpbuf?.value?.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetHotKey(param0: UInt, lpumodifiers: COpaquePointer?, lpuvkey: COpaquePointer?, phkl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetHotKey(param0, lpumodifiers?.value?.toCPointer<ByteVar>(), lpuvkey?.value?.toCPointer<ByteVar>(), phkl?.value?.toCPointer<ByteVar>())

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount(param0?.value?.toCPointer<ByteVar>())

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetIMCCSize(param0?.value?.toCPointer<ByteVar>())

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetIMCLockCount(param0?.value?.toCPointer<ByteVar>())

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA(param0?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW(param0?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA(param0?.value?.toCPointer<ByteVar>(), param1, param2, lpimeparentmenu?.value?.toCPointer<ByteVar>(), lpimemenu?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW(param0?.value?.toCPointer<ByteVar>(), param1, param2, lpimeparentmenu?.value?.toCPointer<ByteVar>(), lpimemenu?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun immGetOpenStatus(param0: Himc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetOpenStatus(param0?.value?.toCPointer<ByteVar>())

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetProperty(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA(param0?.value?.toCPointer<ByteVar>(), nitem, lpstylebuf?.value?.toCPointer<ByteVar>())

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW(param0?.value?.toCPointer<ByteVar>(), nitem, lpstylebuf?.value?.toCPointer<ByteVar>())

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos(param0?.value?.toCPointer<ByteVar>(), lpptpos?.value?.toCPointer<ByteVar>())

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immGetVirtualKey(param0?.value?.toCPointer<ByteVar>())

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immInstallIMEA(lpszimefilename?.value?.toCPointer<ByteVar>(), lpszlayouttext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immInstallIMEW(lpszimefilename?.value?.toCPointer<ByteVar>(), lpszlayouttext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immIsIME(param0: Hkl): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immIsIME(param0?.value?.toCPointer<ByteVar>())

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immIsUIMessageA(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immIsUIMessageW(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun immLockIMC(param0: Himc): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immLockIMC(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immLockIMCC(param0: Himcc): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immLockIMCC(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immNotifyIME(param0?.value?.toCPointer<ByteVar>(), dwaction, dwindex, dwvalue)

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immReSizeIMCC(param0?.value?.toCPointer<ByteVar>(), param1)?.let { COpaquePointer(it.toLong()) }

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immRegisterWordA(param0?.value?.toCPointer<ByteVar>(), lpszreading?.value?.toCPointer<ByteVar>(), param2, lpszregister?.value?.toCPointer<ByteVar>())

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immRegisterWordW(param0?.value?.toCPointer<ByteVar>(), lpszreading?.value?.toCPointer<ByteVar>(), param2, lpszregister?.value?.toCPointer<ByteVar>())

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immReleaseContext(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immRequestMessageA(param0?.value?.toCPointer<ByteVar>(), param1, param2)

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immRequestMessageW(param0?.value?.toCPointer<ByteVar>(), param1, param2)

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetCandidateWindow(param0?.value?.toCPointer<ByteVar>(), lpcandidate?.value?.toCPointer<ByteVar>())

public actual fun immSetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetCompositionFontA(param0?.value?.toCPointer<ByteVar>(), lplf?.value?.toCPointer<ByteVar>())

public actual fun immSetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetCompositionFontW(param0?.value?.toCPointer<ByteVar>(), lplf?.value?.toCPointer<ByteVar>())

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetCompositionStringA(param0?.value?.toCPointer<ByteVar>(), dwindex, lpcomp?.value?.toCPointer<ByteVar>(), dwcomplen, lpread?.value?.toCPointer<ByteVar>(), dwreadlen)

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetCompositionStringW(param0?.value?.toCPointer<ByteVar>(), dwindex, lpcomp?.value?.toCPointer<ByteVar>(), dwcomplen, lpread?.value?.toCPointer<ByteVar>(), dwreadlen)

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetCompositionWindow(param0?.value?.toCPointer<ByteVar>(), lpcompform?.value?.toCPointer<ByteVar>())

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetConversionStatus(param0?.value?.toCPointer<ByteVar>(), param1, param2)

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetHotKey(param0, param1, param2, param3?.value?.toCPointer<ByteVar>())

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetOpenStatus(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos(param0?.value?.toCPointer<ByteVar>(), lpptpos?.value?.toCPointer<ByteVar>())

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immSimulateHotKey(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun immUnlockIMC(param0: Himc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immUnlockIMC(param0?.value?.toCPointer<ByteVar>())

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immUnlockIMCC(param0?.value?.toCPointer<ByteVar>())

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immUnregisterWordA(param0?.value?.toCPointer<ByteVar>(), lpszreading?.value?.toCPointer<ByteVar>(), param2, lpszunregister?.value?.toCPointer<ByteVar>())

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssys_windows_win32_ui_input_ime_immUnregisterWordW(param0?.value?.toCPointer<ByteVar>(), lpszreading?.value?.toCPointer<ByteVar>(), param2, lpszunregister?.value?.toCPointer<ByteVar>())
