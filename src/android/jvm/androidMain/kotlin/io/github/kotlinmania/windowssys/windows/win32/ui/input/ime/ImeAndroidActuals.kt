@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32UiInputImeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immAssociateContext(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immAssociateContextEx(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immConfigureIMEA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immConfigureIMEW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immCreateContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immCreateIMCC(param0: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(param0: Int, param1: Long, param2: Int, param3: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immDestroyContext(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immDestroyIMCC(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immDisableIME(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immDisableLegacyIME(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(idthread: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immEnumInputContext(idthread: Int, lpfn: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA(param0: Long, param1: Long, lpszreading: Long, param3: Int, lpszregister: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW(param0: Long, param1: Long, lpszreading: Long, param3: Int, lpszregister: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immEscapeA(param0: Long, param1: Long, param2: Int, param3: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immEscapeW(param0: Long, param1: Long, param2: Int, param3: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGenerateMessage(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCandidateListA(param0: Long, deindex: Int, lpcandlist: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA(param0: Long, lpdwlistcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW(param0: Long, lpdwlistcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCandidateListW(param0: Long, deindex: Int, lpcandlist: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCandidateWindow(param0: Long, param1: Int, lpcandidate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCompositionFontA(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCompositionFontW(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCompositionStringA(param0: Long, param1: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCompositionStringW(param0: Long, param1: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetCompositionWindow(param0: Long, lpcompform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetContext(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetConversionListA(param0: Long, param1: Long, lpsrc: Long, lpdst: Long, dwbuflen: Int, uflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetConversionListW(param0: Long, param1: Long, lpsrc: Long, lpdst: Long, dwbuflen: Int, uflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetConversionStatus(param0: Long, lpfdwconversion: Long, lpfdwsentence: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetDescriptionA(param0: Long, lpszdescription: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetDescriptionW(param0: Long, lpszdescription: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetGuideLineA(param0: Long, dwindex: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetGuideLineW(param0: Long, dwindex: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetHotKey(param0: Int, lpumodifiers: Long, lpuvkey: Long, phkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetIMCCSize(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetIMCLockCount(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA(param0: Long, lpszfilename: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW(param0: Long, lpszfilename: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA(param0: Long, param1: Int, param2: Int, lpimeparentmenu: Long, lpimemenu: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW(param0: Long, param1: Int, param2: Int, lpimeparentmenu: Long, lpimemenu: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetOpenStatus(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetProperty(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA(param0: Long, nitem: Int, lpstylebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW(param0: Long, nitem: Int, lpstylebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos(param0: Long, lpptpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immGetVirtualKey(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immInstallIMEA(lpszimefilename: Long, lpszlayouttext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immInstallIMEW(lpszimefilename: Long, lpszlayouttext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immIsIME(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immIsUIMessageA(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immIsUIMessageW(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immLockIMC(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immLockIMCC(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immNotifyIME(param0: Long, dwaction: Int, dwindex: Int, dwvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immReSizeIMCC(param0: Long, param1: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immRegisterWordA(param0: Long, lpszreading: Long, param2: Int, lpszregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immRegisterWordW(param0: Long, lpszreading: Long, param2: Int, lpszregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immReleaseContext(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immRequestMessageA(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immRequestMessageW(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetCandidateWindow(param0: Long, lpcandidate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetCompositionFontA(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetCompositionFontW(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetCompositionStringA(param0: Long, dwindex: Int, lpcomp: Long, dwcomplen: Int, lpread: Long, dwreadlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetCompositionStringW(param0: Long, dwindex: Int, lpcomp: Long, dwcomplen: Int, lpread: Long, dwreadlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetCompositionWindow(param0: Long, lpcompform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetConversionStatus(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetHotKey(param0: Int, param1: Int, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetOpenStatus(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos(param0: Long, lpptpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immSimulateHotKey(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immUnlockIMC(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immUnlockIMCC(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immUnregisterWordA(param0: Long, lpszreading: Long, param2: Int, lpszunregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_ime_immUnregisterWordW(param0: Long, lpszreading: Long, param2: Int, lpszunregister: Long): Int
}

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immAssociateContext((param0?.value ?: 0L), (param1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immAssociateContextEx((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt())

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immConfigureIMEA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immConfigureIMEW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun immCreateContext(): Himc =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immCreateContext().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immCreateIMCC(param0: UInt): Himcc =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immCreateIMCC(param0.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(param0.toInt(), (param1?.value ?: 0L), param2, param3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immDestroyContext(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immDestroyContext((param0?.value ?: 0L))

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immDestroyIMCC((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard((param0?.value ?: 0L))

public actual fun immDisableIME(param0: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immDisableIME(param0.toInt())

public actual fun immDisableLegacyIME(): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immDisableLegacyIME()

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(idthread.toInt())

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immEnumInputContext(idthread.toInt(), 0L, lparam)

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: COpaquePointer?): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA((param0?.value ?: 0L), 0L, (lpszreading?.value ?: 0L), param3.toInt(), (lpszregister?.value ?: 0L), (param5?.value ?: 0L)).toUInt()

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: COpaquePointer?): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW((param0?.value ?: 0L), 0L, (lpszreading?.value ?: 0L), param3.toInt(), (lpszregister?.value ?: 0L), (param5?.value ?: 0L)).toUInt()

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immEscapeA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immEscapeW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun immGenerateMessage(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGenerateMessage((param0?.value ?: 0L))

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCandidateListA((param0?.value ?: 0L), deindex.toInt(), (lpcandlist?.value ?: 0L), dwbuflen.toInt()).toUInt()

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA((param0?.value ?: 0L), (lpdwlistcount?.value ?: 0L)).toUInt()

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW((param0?.value ?: 0L), (lpdwlistcount?.value ?: 0L)).toUInt()

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCandidateListW((param0?.value ?: 0L), deindex.toInt(), (lpcandlist?.value ?: 0L), dwbuflen.toInt()).toUInt()

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCandidateWindow((param0?.value ?: 0L), param1.toInt(), (lpcandidate?.value ?: 0L))

public actual fun immGetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCompositionFontA((param0?.value ?: 0L), (lplf?.value ?: 0L))

public actual fun immGetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCompositionFontW((param0?.value ?: 0L), (lplf?.value ?: 0L))

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCompositionStringA((param0?.value ?: 0L), param1.toInt(), (lpbuf?.value ?: 0L), dwbuflen.toInt())

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCompositionStringW((param0?.value ?: 0L), param1.toInt(), (lpbuf?.value ?: 0L), dwbuflen.toInt())

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetCompositionWindow((param0?.value ?: 0L), (lpcompform?.value ?: 0L))

public actual fun immGetContext(param0: Hwnd): Himc =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetContext((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetConversionListA((param0?.value ?: 0L), (param1?.value ?: 0L), (lpsrc?.value ?: 0L), (lpdst?.value ?: 0L), dwbuflen.toInt(), uflag.toInt()).toUInt()

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetConversionListW((param0?.value ?: 0L), (param1?.value ?: 0L), (lpsrc?.value ?: 0L), (lpdst?.value ?: 0L), dwbuflen.toInt(), uflag.toInt()).toUInt()

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: COpaquePointer?, lpfdwsentence: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetConversionStatus((param0?.value ?: 0L), (lpfdwconversion?.value ?: 0L), (lpfdwsentence?.value ?: 0L))

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetDescriptionA((param0?.value ?: 0L), (lpszdescription?.value ?: 0L), ubuflen.toInt()).toUInt()

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetDescriptionW((param0?.value ?: 0L), (lpszdescription?.value ?: 0L), ubuflen.toInt()).toUInt()

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetGuideLineA((param0?.value ?: 0L), dwindex.toInt(), (lpbuf?.value ?: 0L), dwbuflen.toInt()).toUInt()

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetGuideLineW((param0?.value ?: 0L), dwindex.toInt(), (lpbuf?.value ?: 0L), dwbuflen.toInt()).toUInt()

public actual fun immGetHotKey(param0: UInt, lpumodifiers: COpaquePointer?, lpuvkey: COpaquePointer?, phkl: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetHotKey(param0.toInt(), (lpumodifiers?.value ?: 0L), (lpuvkey?.value ?: 0L), (phkl?.value ?: 0L))

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount((param0?.value ?: 0L)).toUInt()

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetIMCCSize((param0?.value ?: 0L)).toUInt()

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetIMCLockCount((param0?.value ?: 0L)).toUInt()

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA((param0?.value ?: 0L), (lpszfilename?.value ?: 0L), ubuflen.toInt()).toUInt()

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW((param0?.value ?: 0L), (lpszfilename?.value ?: 0L), ubuflen.toInt()).toUInt()

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA((param0?.value ?: 0L), param1.toInt(), param2.toInt(), (lpimeparentmenu?.value ?: 0L), (lpimemenu?.value ?: 0L), dwsize.toInt()).toUInt()

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW((param0?.value ?: 0L), param1.toInt(), param2.toInt(), (lpimeparentmenu?.value ?: 0L), (lpimemenu?.value ?: 0L), dwsize.toInt()).toUInt()

public actual fun immGetOpenStatus(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetOpenStatus((param0?.value ?: 0L))

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetProperty((param0?.value ?: 0L), param1.toInt()).toUInt()

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA((param0?.value ?: 0L), nitem.toInt(), (lpstylebuf?.value ?: 0L)).toUInt()

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW((param0?.value ?: 0L), nitem.toInt(), (lpstylebuf?.value ?: 0L)).toUInt()

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos((param0?.value ?: 0L), (lpptpos?.value ?: 0L))

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immGetVirtualKey((param0?.value ?: 0L)).toUInt()

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immInstallIMEA((lpszimefilename?.value ?: 0L), (lpszlayouttext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immInstallIMEW((lpszimefilename?.value ?: 0L), (lpszlayouttext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immIsIME(param0: Hkl): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immIsIME((param0?.value ?: 0L))

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immIsUIMessageA((param0?.value ?: 0L), param1.toInt(), param2.toLong(), param3)

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immIsUIMessageW((param0?.value ?: 0L), param1.toInt(), param2.toLong(), param3)

public actual fun immLockIMC(param0: Himc): COpaquePointer? =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immLockIMC((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immLockIMCC(param0: Himcc): COpaquePointer? =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immLockIMCC((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immNotifyIME((param0?.value ?: 0L), dwaction.toInt(), dwindex.toInt(), dwvalue.toInt())

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immReSizeIMCC((param0?.value ?: 0L), param1.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immRegisterWordA((param0?.value ?: 0L), (lpszreading?.value ?: 0L), param2.toInt(), (lpszregister?.value ?: 0L))

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immRegisterWordW((param0?.value ?: 0L), (lpszreading?.value ?: 0L), param2.toInt(), (lpszregister?.value ?: 0L))

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immReleaseContext((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immRequestMessageA((param0?.value ?: 0L), param1.toLong(), param2)

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immRequestMessageW((param0?.value ?: 0L), param1.toLong(), param2)

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetCandidateWindow((param0?.value ?: 0L), (lpcandidate?.value ?: 0L))

public actual fun immSetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetCompositionFontA((param0?.value ?: 0L), (lplf?.value ?: 0L))

public actual fun immSetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetCompositionFontW((param0?.value ?: 0L), (lplf?.value ?: 0L))

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetCompositionStringA((param0?.value ?: 0L), dwindex.toInt(), (lpcomp?.value ?: 0L), dwcomplen.toInt(), (lpread?.value ?: 0L), dwreadlen.toInt())

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetCompositionStringW((param0?.value ?: 0L), dwindex.toInt(), (lpcomp?.value ?: 0L), dwcomplen.toInt(), (lpread?.value ?: 0L), dwreadlen.toInt())

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetCompositionWindow((param0?.value ?: 0L), (lpcompform?.value ?: 0L))

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetConversionStatus((param0?.value ?: 0L), param1.toInt(), param2.toInt())

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), (param3?.value ?: 0L))

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetOpenStatus((param0?.value ?: 0L), param1)

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos((param0?.value ?: 0L), (lpptpos?.value ?: 0L))

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard((param0?.value ?: 0L), param1)

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immSimulateHotKey((param0?.value ?: 0L), param1.toInt())

public actual fun immUnlockIMC(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immUnlockIMC((param0?.value ?: 0L))

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immUnlockIMCC((param0?.value ?: 0L))

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immUnregisterWordA((param0?.value ?: 0L), (lpszreading?.value ?: 0L), param2.toInt(), (lpszunregister?.value ?: 0L))

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssys_windows_win32_ui_input_ime_immUnregisterWordW((param0?.value ?: 0L), (lpszreading?.value ?: 0L), param2.toInt(), (lpszunregister?.value ?: 0L))
