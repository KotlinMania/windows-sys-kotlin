@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32UiInputImeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmAssociateContext(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmAssociateContextEx(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmConfigureIMEA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmConfigureIMEW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmCreateContext(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmCreateIMCC(param0: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(param0: Int, param1: Long, param2: Int, param3: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmDestroyContext(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmDestroyIMCC(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmDisableIME(param0: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmDisableLegacyIME(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmEnumInputContext(idthread: Int, lpfn: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(param0: Long, param1: Long, lpszreading: Long, param3: Int, lpszregister: Long, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(param0: Long, param1: Long, lpszreading: Long, param3: Int, lpszregister: Long, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmEscapeA(param0: Long, param1: Long, param2: Int, param3: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmEscapeW(param0: Long, param1: Long, param2: Int, param3: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGenerateMessage(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCandidateListA(param0: Long, deindex: Int, lpcandlist: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(param0: Long, lpdwlistcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(param0: Long, lpdwlistcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCandidateListW(param0: Long, deindex: Int, lpcandlist: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCandidateWindow(param0: Long, param1: Int, lpcandidate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCompositionFontA(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCompositionFontW(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCompositionStringA(param0: Long, param1: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCompositionStringW(param0: Long, param1: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetCompositionWindow(param0: Long, lpcompform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetContext(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetConversionListA(param0: Long, param1: Long, lpsrc: Long, lpdst: Long, dwbuflen: Int, uflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetConversionListW(param0: Long, param1: Long, lpsrc: Long, lpdst: Long, dwbuflen: Int, uflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetConversionStatus(param0: Long, lpfdwconversion: Long, lpfdwsentence: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetDescriptionA(param0: Long, lpszdescription: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetDescriptionW(param0: Long, lpszdescription: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetGuideLineA(param0: Long, dwindex: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetGuideLineW(param0: Long, dwindex: Int, lpbuf: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetHotKey(param0: Int, lpumodifiers: Long, lpuvkey: Long, phkl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetIMCCSize(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetIMCLockCount(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(param0: Long, lpszfilename: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(param0: Long, lpszfilename: Long, ubuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(param0: Long, param1: Int, param2: Int, lpimeparentmenu: Long, lpimemenu: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(param0: Long, param1: Int, param2: Int, lpimeparentmenu: Long, lpimemenu: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetOpenStatus(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetProperty(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(param0: Long, nitem: Int, lpstylebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(param0: Long, nitem: Int, lpstylebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(param0: Long, lpptpos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmGetVirtualKey(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmInstallIMEA(lpszimefilename: Long, lpszlayouttext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmInstallIMEW(lpszimefilename: Long, lpszlayouttext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmIsIME(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmIsUIMessageA(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmIsUIMessageW(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmLockIMC(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmLockIMCC(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmNotifyIME(param0: Long, dwaction: Int, dwindex: Int, dwvalue: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmReSizeIMCC(param0: Long, param1: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmRegisterWordA(param0: Long, lpszreading: Long, param2: Int, lpszregister: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmRegisterWordW(param0: Long, lpszreading: Long, param2: Int, lpszregister: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmReleaseContext(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmRequestMessageA(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmRequestMessageW(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetCandidateWindow(param0: Long, lpcandidate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetCompositionFontA(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetCompositionFontW(param0: Long, lplf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetCompositionStringA(param0: Long, dwindex: Int, lpcomp: Long, dwcomplen: Int, lpread: Long, dwreadlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetCompositionStringW(param0: Long, dwindex: Int, lpcomp: Long, dwcomplen: Int, lpread: Long, dwreadlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetCompositionWindow(param0: Long, lpcompform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetConversionStatus(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetHotKey(param0: Int, param1: Int, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetOpenStatus(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(param0: Long, lpptpos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmSimulateHotKey(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmUnlockIMC(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmUnlockIMCC(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmUnregisterWordA(param0: Long, lpszreading: Long, param2: Int, lpszunregister: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputImeImmUnregisterWordW(param0: Long, lpszreading: Long, param2: Int, lpszunregister: Long): Int
}

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmAssociateContext(param0.rawAddress, param1.rawAddress))

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmAssociateContextEx(param0.rawAddress, param1.rawAddress, param2.toInt())

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmConfigureIMEA(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmConfigureIMEW(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun immCreateContext(): Himc =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmCreateContext())

public actual fun immCreateIMCC(param0: UInt): Himcc =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmCreateIMCC(param0.toInt()))

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(param0.toInt(), param1.rawAddress, param2, param3))

public actual fun immDestroyContext(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmDestroyContext(param0.rawAddress)

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmDestroyIMCC(param0.rawAddress))

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(param0.rawAddress)

public actual fun immDisableIME(param0: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmDisableIME(param0.toInt())

public actual fun immDisableLegacyIME(): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmDisableLegacyIME()

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread.toInt())

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmEnumInputContext(idthread.toInt(), 0L, lparam)

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: MutPtr): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(param0.rawAddress, 0L, lpszreading.rawAddress, param3.toInt(), lpszregister.rawAddress, param5.rawAddress).toUInt()

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: MutPtr): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(param0.rawAddress, 0L, lpszreading.rawAddress, param3.toInt(), lpszregister.rawAddress, param5.rawAddress).toUInt()

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmEscapeA(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmEscapeW(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun immGenerateMessage(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGenerateMessage(param0.rawAddress)

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCandidateListA(param0.rawAddress, deindex.toInt(), lpcandlist.rawAddress, dwbuflen.toInt()).toUInt()

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: MutPtr): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(param0.rawAddress, lpdwlistcount.rawAddress).toUInt()

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: MutPtr): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(param0.rawAddress, lpdwlistcount.rawAddress).toUInt()

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCandidateListW(param0.rawAddress, deindex.toInt(), lpcandlist.rawAddress, dwbuflen.toInt()).toUInt()

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCandidateWindow(param0.rawAddress, param1.toInt(), lpcandidate.rawAddress)

public actual fun immGetCompositionFontA(param0: Himc, lplf: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCompositionFontA(param0.rawAddress, lplf.rawAddress)

public actual fun immGetCompositionFontW(param0: Himc, lplf: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCompositionFontW(param0.rawAddress, lplf.rawAddress)

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCompositionStringA(param0.rawAddress, param1.toInt(), lpbuf.rawAddress, dwbuflen.toInt())

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCompositionStringW(param0.rawAddress, param1.toInt(), lpbuf.rawAddress, dwbuflen.toInt())

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetCompositionWindow(param0.rawAddress, lpcompform.rawAddress)

public actual fun immGetContext(param0: Hwnd): Himc =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetContext(param0.rawAddress))

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetConversionListA(param0.rawAddress, param1.rawAddress, lpsrc.rawAddress, lpdst.rawAddress, dwbuflen.toInt(), uflag.toInt()).toUInt()

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetConversionListW(param0.rawAddress, param1.rawAddress, lpsrc.rawAddress, lpdst.rawAddress, dwbuflen.toInt(), uflag.toInt()).toUInt()

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: MutPtr, lpfdwsentence: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetConversionStatus(param0.rawAddress, lpfdwconversion.rawAddress, lpfdwsentence.rawAddress)

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(param0.rawAddress))

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetDescriptionA(param0.rawAddress, lpszdescription.rawAddress, ubuflen.toInt()).toUInt()

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetDescriptionW(param0.rawAddress, lpszdescription.rawAddress, ubuflen.toInt()).toUInt()

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetGuideLineA(param0.rawAddress, dwindex.toInt(), lpbuf.rawAddress, dwbuflen.toInt()).toUInt()

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetGuideLineW(param0.rawAddress, dwindex.toInt(), lpbuf.rawAddress, dwbuflen.toInt()).toUInt()

public actual fun immGetHotKey(param0: UInt, lpumodifiers: MutPtr, lpuvkey: MutPtr, phkl: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetHotKey(param0.toInt(), lpumodifiers.rawAddress, lpuvkey.rawAddress, phkl.rawAddress)

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(param0.rawAddress).toUInt()

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetIMCCSize(param0.rawAddress).toUInt()

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetIMCLockCount(param0.rawAddress).toUInt()

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(param0.rawAddress, lpszfilename.rawAddress, ubuflen.toInt()).toUInt()

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(param0.rawAddress, lpszfilename.rawAddress, ubuflen.toInt()).toUInt()

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(param0.rawAddress, param1.toInt(), param2.toInt(), lpimeparentmenu.rawAddress, lpimemenu.rawAddress, dwsize.toInt()).toUInt()

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(param0.rawAddress, param1.toInt(), param2.toInt(), lpimeparentmenu.rawAddress, lpimemenu.rawAddress, dwsize.toInt()).toUInt()

public actual fun immGetOpenStatus(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetOpenStatus(param0.rawAddress)

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetProperty(param0.rawAddress, param1.toInt()).toUInt()

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(param0.rawAddress, nitem.toInt(), lpstylebuf.rawAddress).toUInt()

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(param0.rawAddress, nitem.toInt(), lpstylebuf.rawAddress).toUInt()

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: MutPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(param0.rawAddress, lpptpos.rawAddress)

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmGetVirtualKey(param0.rawAddress).toUInt()

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmInstallIMEA(lpszimefilename.rawAddress, lpszlayouttext.rawAddress))

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmInstallIMEW(lpszimefilename.rawAddress, lpszlayouttext.rawAddress))

public actual fun immIsIME(param0: Hkl): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmIsIME(param0.rawAddress)

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmIsUIMessageA(param0.rawAddress, param1.toInt(), param2.toLong(), param3)

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmIsUIMessageW(param0.rawAddress, param1.toInt(), param2.toLong(), param3)

public actual fun immLockIMC(param0: Himc): MutPtr =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmLockIMC(param0.rawAddress))

public actual fun immLockIMCC(param0: Himcc): MutPtr =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmLockIMCC(param0.rawAddress))

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmNotifyIME(param0.rawAddress, dwaction.toInt(), dwindex.toInt(), dwvalue.toInt())

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    MutPtr(WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmReSizeIMCC(param0.rawAddress, param1.toInt()))

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmRegisterWordA(param0.rawAddress, lpszreading.rawAddress, param2.toInt(), lpszregister.rawAddress)

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmRegisterWordW(param0.rawAddress, lpszreading.rawAddress, param2.toInt(), lpszregister.rawAddress)

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmReleaseContext(param0.rawAddress, param1.rawAddress)

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmRequestMessageA(param0.rawAddress, param1.toLong(), param2)

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmRequestMessageW(param0.rawAddress, param1.toLong(), param2)

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: ConstPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetCandidateWindow(param0.rawAddress, lpcandidate.rawAddress)

public actual fun immSetCompositionFontA(param0: Himc, lplf: ConstPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetCompositionFontA(param0.rawAddress, lplf.rawAddress)

public actual fun immSetCompositionFontW(param0: Himc, lplf: ConstPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetCompositionFontW(param0.rawAddress, lplf.rawAddress)

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetCompositionStringA(param0.rawAddress, dwindex.toInt(), lpcomp.rawAddress, dwcomplen.toInt(), lpread.rawAddress, dwreadlen.toInt())

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetCompositionStringW(param0.rawAddress, dwindex.toInt(), lpcomp.rawAddress, dwcomplen.toInt(), lpread.rawAddress, dwreadlen.toInt())

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: ConstPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetCompositionWindow(param0.rawAddress, lpcompform.rawAddress)

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetConversionStatus(param0.rawAddress, param1.toInt(), param2.toInt())

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), param3.rawAddress)

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetOpenStatus(param0.rawAddress, param1)

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: ConstPtr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(param0.rawAddress, lpptpos.rawAddress)

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(param0.rawAddress, param1)

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmSimulateHotKey(param0.rawAddress, param1.toInt())

public actual fun immUnlockIMC(param0: Himc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmUnlockIMC(param0.rawAddress)

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmUnlockIMCC(param0.rawAddress)

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmUnregisterWordA(param0.rawAddress, lpszreading.rawAddress, param2.toInt(), lpszunregister.rawAddress)

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    WindowsWin32UiInputImeJniBridge.windowssysWindowsWin32UiInputImeImmUnregisterWordW(param0.rawAddress, lpszreading.rawAddress, param2.toInt(), lpszunregister.rawAddress)
