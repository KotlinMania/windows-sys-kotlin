@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmAssociateContext
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmAssociateContextEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmConfigureIMEA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmConfigureIMEW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmCreateContext
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmCreateIMCC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmDestroyContext
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmDestroyIMCC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmDisableIME
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmDisableLegacyIME
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmDisableTextFrameService
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmEnumInputContext
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmEnumRegisterWordA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmEnumRegisterWordW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmEscapeA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmEscapeW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGenerateMessage
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCandidateListA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCandidateListCountA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCandidateListCountW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCandidateListW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCandidateWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCompositionFontA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCompositionFontW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCompositionStringA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCompositionStringW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetCompositionWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetContext
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetConversionListA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetConversionListW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetConversionStatus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetDescriptionA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetDescriptionW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetGuideLineA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetGuideLineW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetIMCCLockCount
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetIMCCSize
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetIMCLockCount
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetIMEFileNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetIMEFileNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetOpenStatus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetProperty
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetStatusWindowPos
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmGetVirtualKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmInstallIMEA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmInstallIMEW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmIsIME
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmIsUIMessageA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmIsUIMessageW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmLockIMC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmLockIMCC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmNotifyIME
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmReSizeIMCC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmRegisterWordA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmRegisterWordW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmReleaseContext
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmRequestMessageA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmRequestMessageW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetCandidateWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetCompositionFontA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetCompositionFontW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetCompositionStringA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetCompositionStringW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetCompositionWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetConversionStatus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetOpenStatus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSetStatusWindowPos
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmShowSoftKeyboard
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmSimulateHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmUnlockIMC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmUnlockIMCC
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmUnregisterWordA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.ime.cinterop.windowssysWindowsWin32UiInputImeImmUnregisterWordW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.Hkl
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    MutPtr(windowssysWindowsWin32UiInputImeImmAssociateContext(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    windowssysWindowsWin32UiInputImeImmAssociateContextEx(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2)

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmConfigureIMEA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmConfigureIMEW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun immCreateContext(): Himc =
    MutPtr(windowssysWindowsWin32UiInputImeImmCreateContext()?.toLong() ?: 0L)

public actual fun immCreateIMCC(param0: UInt): Himcc =
    MutPtr(windowssysWindowsWin32UiInputImeImmCreateIMCC(param0)?.toLong() ?: 0L)

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(param0, param1.rawAddress.toCPointer<ByteVar>(), param2, param3)?.toLong() ?: 0L)

public actual fun immDestroyContext(param0: Himc): Bool =
    windowssysWindowsWin32UiInputImeImmDestroyContext(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    MutPtr(windowssysWindowsWin32UiInputImeImmDestroyIMCC(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immDisableIME(param0: UInt): Bool =
    windowssysWindowsWin32UiInputImeImmDisableIME(param0)

public actual fun immDisableLegacyIME(): Bool =
    windowssysWindowsWin32UiInputImeImmDisableLegacyIME()

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    windowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread)

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    windowssysWindowsWin32UiInputImeImmEnumInputContext(idthread, 0L.toCPointer<ByteVar>(), lparam)

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: MutPtr): UInt =
    windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(param0.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszreading.rawAddress.toCPointer<ByteVar>(), param3, lpszregister.rawAddress.toCPointer<ByteVar>(), param5.rawAddress.toCPointer<ByteVar>())

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: MutPtr): UInt =
    windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(param0.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpszreading.rawAddress.toCPointer<ByteVar>(), param3, lpszregister.rawAddress.toCPointer<ByteVar>(), param5.rawAddress.toCPointer<ByteVar>())

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    windowssysWindowsWin32UiInputImeImmEscapeA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    windowssysWindowsWin32UiInputImeImmEscapeW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun immGenerateMessage(param0: Himc): Bool =
    windowssysWindowsWin32UiInputImeImmGenerateMessage(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetCandidateListA(param0.rawAddress.toCPointer<ByteVar>(), deindex, lpcandlist.rawAddress.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: MutPtr): UInt =
    windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(param0.rawAddress.toCPointer<ByteVar>(), lpdwlistcount.rawAddress.toCPointer<ByteVar>())

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: MutPtr): UInt =
    windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(param0.rawAddress.toCPointer<ByteVar>(), lpdwlistcount.rawAddress.toCPointer<ByteVar>())

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetCandidateListW(param0.rawAddress.toCPointer<ByteVar>(), deindex, lpcandlist.rawAddress.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetCandidateWindow(param0.rawAddress.toCPointer<ByteVar>(), param1, lpcandidate.rawAddress.toCPointer<ByteVar>())

public actual fun immGetCompositionFontA(param0: Himc, lplf: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetCompositionFontA(param0.rawAddress.toCPointer<ByteVar>(), lplf.rawAddress.toCPointer<ByteVar>())

public actual fun immGetCompositionFontW(param0: Himc, lplf: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetCompositionFontW(param0.rawAddress.toCPointer<ByteVar>(), lplf.rawAddress.toCPointer<ByteVar>())

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    windowssysWindowsWin32UiInputImeImmGetCompositionStringA(param0.rawAddress.toCPointer<ByteVar>(), param1, lpbuf.rawAddress.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    windowssysWindowsWin32UiInputImeImmGetCompositionStringW(param0.rawAddress.toCPointer<ByteVar>(), param1, lpbuf.rawAddress.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetCompositionWindow(param0.rawAddress.toCPointer<ByteVar>(), lpcompform.rawAddress.toCPointer<ByteVar>())

public actual fun immGetContext(param0: Hwnd): Himc =
    MutPtr(windowssysWindowsWin32UiInputImeImmGetContext(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    windowssysWindowsWin32UiInputImeImmGetConversionListA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), lpsrc.rawAddress.toCPointer<ByteVar>(), lpdst.rawAddress.toCPointer<ByteVar>(), dwbuflen, uflag)

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    windowssysWindowsWin32UiInputImeImmGetConversionListW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), lpsrc.rawAddress.toCPointer<ByteVar>(), lpdst.rawAddress.toCPointer<ByteVar>(), dwbuflen, uflag)

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: MutPtr, lpfdwsentence: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetConversionStatus(param0.rawAddress.toCPointer<ByteVar>(), lpfdwconversion.rawAddress.toCPointer<ByteVar>(), lpfdwsentence.rawAddress.toCPointer<ByteVar>())

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetDescriptionA(param0.rawAddress.toCPointer<ByteVar>(), lpszdescription.rawAddress.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetDescriptionW(param0.rawAddress.toCPointer<ByteVar>(), lpszdescription.rawAddress.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetGuideLineA(param0.rawAddress.toCPointer<ByteVar>(), dwindex, lpbuf.rawAddress.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetGuideLineW(param0.rawAddress.toCPointer<ByteVar>(), dwindex, lpbuf.rawAddress.toCPointer<ByteVar>(), dwbuflen)

public actual fun immGetHotKey(param0: UInt, lpumodifiers: MutPtr, lpuvkey: MutPtr, phkl: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetHotKey(param0, lpumodifiers.rawAddress.toCPointer<ByteVar>(), lpuvkey.rawAddress.toCPointer<ByteVar>(), phkl.rawAddress.toCPointer<ByteVar>())

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    windowssysWindowsWin32UiInputImeImmGetIMCCSize(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    windowssysWindowsWin32UiInputImeImmGetIMCLockCount(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(param0.rawAddress.toCPointer<ByteVar>(), lpszfilename.rawAddress.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(param0.rawAddress.toCPointer<ByteVar>(), lpszfilename.rawAddress.toCPointer<ByteVar>(), ubuflen)

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, lpimeparentmenu.rawAddress.toCPointer<ByteVar>(), lpimemenu.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, lpimeparentmenu.rawAddress.toCPointer<ByteVar>(), lpimemenu.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun immGetOpenStatus(param0: Himc): Bool =
    windowssysWindowsWin32UiInputImeImmGetOpenStatus(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    windowssysWindowsWin32UiInputImeImmGetProperty(param0.rawAddress.toCPointer<ByteVar>(), param1)

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(param0.rawAddress.toCPointer<ByteVar>(), nitem, lpstylebuf.rawAddress.toCPointer<ByteVar>())

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(param0.rawAddress.toCPointer<ByteVar>(), nitem, lpstylebuf.rawAddress.toCPointer<ByteVar>())

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: MutPtr): Bool =
    windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(param0.rawAddress.toCPointer<ByteVar>(), lpptpos.rawAddress.toCPointer<ByteVar>())

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    windowssysWindowsWin32UiInputImeImmGetVirtualKey(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    MutPtr(windowssysWindowsWin32UiInputImeImmInstallIMEA(lpszimefilename.rawAddress.toCPointer<ByteVar>(), lpszlayouttext.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    MutPtr(windowssysWindowsWin32UiInputImeImmInstallIMEW(lpszimefilename.rawAddress.toCPointer<ByteVar>(), lpszlayouttext.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immIsIME(param0: Hkl): Bool =
    windowssysWindowsWin32UiInputImeImmIsIME(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    windowssysWindowsWin32UiInputImeImmIsUIMessageA(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    windowssysWindowsWin32UiInputImeImmIsUIMessageW(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun immLockIMC(param0: Himc): MutPtr =
    MutPtr(windowssysWindowsWin32UiInputImeImmLockIMC(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immLockIMCC(param0: Himcc): MutPtr =
    MutPtr(windowssysWindowsWin32UiInputImeImmLockIMCC(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    windowssysWindowsWin32UiInputImeImmNotifyIME(param0.rawAddress.toCPointer<ByteVar>(), dwaction, dwindex, dwvalue)

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    MutPtr(windowssysWindowsWin32UiInputImeImmReSizeIMCC(param0.rawAddress.toCPointer<ByteVar>(), param1)?.toLong() ?: 0L)

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    windowssysWindowsWin32UiInputImeImmRegisterWordA(param0.rawAddress.toCPointer<ByteVar>(), lpszreading.rawAddress.toCPointer<ByteVar>(), param2, lpszregister.rawAddress.toCPointer<ByteVar>())

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    windowssysWindowsWin32UiInputImeImmRegisterWordW(param0.rawAddress.toCPointer<ByteVar>(), lpszreading.rawAddress.toCPointer<ByteVar>(), param2, lpszregister.rawAddress.toCPointer<ByteVar>())

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    windowssysWindowsWin32UiInputImeImmReleaseContext(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    windowssysWindowsWin32UiInputImeImmRequestMessageA(param0.rawAddress.toCPointer<ByteVar>(), param1, param2)

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    windowssysWindowsWin32UiInputImeImmRequestMessageW(param0.rawAddress.toCPointer<ByteVar>(), param1, param2)

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: ConstPtr): Bool =
    windowssysWindowsWin32UiInputImeImmSetCandidateWindow(param0.rawAddress.toCPointer<ByteVar>(), lpcandidate.rawAddress.toCPointer<ByteVar>())

public actual fun immSetCompositionFontA(param0: Himc, lplf: ConstPtr): Bool =
    windowssysWindowsWin32UiInputImeImmSetCompositionFontA(param0.rawAddress.toCPointer<ByteVar>(), lplf.rawAddress.toCPointer<ByteVar>())

public actual fun immSetCompositionFontW(param0: Himc, lplf: ConstPtr): Bool =
    windowssysWindowsWin32UiInputImeImmSetCompositionFontW(param0.rawAddress.toCPointer<ByteVar>(), lplf.rawAddress.toCPointer<ByteVar>())

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    windowssysWindowsWin32UiInputImeImmSetCompositionStringA(param0.rawAddress.toCPointer<ByteVar>(), dwindex, lpcomp.rawAddress.toCPointer<ByteVar>(), dwcomplen, lpread.rawAddress.toCPointer<ByteVar>(), dwreadlen)

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    windowssysWindowsWin32UiInputImeImmSetCompositionStringW(param0.rawAddress.toCPointer<ByteVar>(), dwindex, lpcomp.rawAddress.toCPointer<ByteVar>(), dwcomplen, lpread.rawAddress.toCPointer<ByteVar>(), dwreadlen)

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: ConstPtr): Bool =
    windowssysWindowsWin32UiInputImeImmSetCompositionWindow(param0.rawAddress.toCPointer<ByteVar>(), lpcompform.rawAddress.toCPointer<ByteVar>())

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    windowssysWindowsWin32UiInputImeImmSetConversionStatus(param0.rawAddress.toCPointer<ByteVar>(), param1, param2)

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    windowssysWindowsWin32UiInputImeImmSetHotKey(param0, param1, param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    windowssysWindowsWin32UiInputImeImmSetOpenStatus(param0.rawAddress.toCPointer<ByteVar>(), param1)

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: ConstPtr): Bool =
    windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(param0.rawAddress.toCPointer<ByteVar>(), lpptpos.rawAddress.toCPointer<ByteVar>())

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(param0.rawAddress.toCPointer<ByteVar>(), param1)

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    windowssysWindowsWin32UiInputImeImmSimulateHotKey(param0.rawAddress.toCPointer<ByteVar>(), param1)

public actual fun immUnlockIMC(param0: Himc): Bool =
    windowssysWindowsWin32UiInputImeImmUnlockIMC(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    windowssysWindowsWin32UiInputImeImmUnlockIMCC(param0.rawAddress.toCPointer<ByteVar>())

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    windowssysWindowsWin32UiInputImeImmUnregisterWordA(param0.rawAddress.toCPointer<ByteVar>(), lpszreading.rawAddress.toCPointer<ByteVar>(), param2, lpszunregister.rawAddress.toCPointer<ByteVar>())

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    windowssysWindowsWin32UiInputImeImmUnregisterWordW(param0.rawAddress.toCPointer<ByteVar>(), lpszreading.rawAddress.toCPointer<ByteVar>(), param2, lpszunregister.rawAddress.toCPointer<ByteVar>())
