@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsChooseColorA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsChooseColorW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsChooseFontA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsChooseFontW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsFindTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsFindTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsGetFileTitleA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsGetFileTitleW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsPageSetupDlgA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsPageSetupDlgW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsPrintDlgA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsPrintDlgExA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsPrintDlgExW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsPrintDlgW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsReplaceTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.cinterop.windowssysWindowsWin32UiControlsDialogsReplaceTextW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun chooseColorA(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsChooseColorA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun chooseColorW(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsChooseColorW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun chooseFontA(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsChooseFontA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun chooseFontW(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsChooseFontW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun commDlgExtendedError(): CommonDlgErrors =
    windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError()

public actual fun findTextA(param0: MutPtr): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsDialogsFindTextA(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun findTextW(param0: MutPtr): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsDialogsFindTextW(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    windowssysWindowsWin32UiControlsDialogsGetFileTitleA(param0.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), cchsize)

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    windowssysWindowsWin32UiControlsDialogsGetFileTitleW(param0.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), cchsize)

public actual fun getOpenFileNameA(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun getOpenFileNameW(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun getSaveFileNameA(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun getSaveFileNameW(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun pageSetupDlgA(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun pageSetupDlgW(param0: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun printDlgA(ppd: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsPrintDlgA(ppd.rawAddress.toCPointer<ByteVar>())

public actual fun printDlgExA(ppd: MutPtr): Hresult =
    windowssysWindowsWin32UiControlsDialogsPrintDlgExA(ppd.rawAddress.toCPointer<ByteVar>())

public actual fun printDlgExW(ppd: MutPtr): Hresult =
    windowssysWindowsWin32UiControlsDialogsPrintDlgExW(ppd.rawAddress.toCPointer<ByteVar>())

public actual fun printDlgW(ppd: MutPtr): Bool =
    windowssysWindowsWin32UiControlsDialogsPrintDlgW(ppd.rawAddress.toCPointer<ByteVar>())

public actual fun replaceTextA(param0: MutPtr): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsDialogsReplaceTextA(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun replaceTextW(param0: MutPtr): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsDialogsReplaceTextW(param0.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
