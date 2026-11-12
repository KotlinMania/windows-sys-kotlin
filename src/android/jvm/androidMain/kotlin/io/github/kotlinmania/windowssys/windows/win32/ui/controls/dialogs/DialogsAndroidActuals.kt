@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32UiControlsDialogsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsChooseColorA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsChooseColorW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsChooseFontA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsChooseFontW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsFindTextA(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsFindTextW(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsGetFileTitleA(param0: Long, buf: Long, cchsize: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsGetFileTitleW(param0: Long, buf: Long, cchsize: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsPrintDlgA(ppd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsPrintDlgExA(ppd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsPrintDlgExW(ppd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsPrintDlgW(ppd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsReplaceTextA(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDialogsReplaceTextW(param0: Long): Long
}

public actual fun chooseColorA(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsChooseColorA(param0.rawAddress)

public actual fun chooseColorW(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsChooseColorW(param0.rawAddress)

public actual fun chooseFontA(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsChooseFontA(param0.rawAddress)

public actual fun chooseFontW(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsChooseFontW(param0.rawAddress)

public actual fun commDlgExtendedError(): CommonDlgErrors =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError().toUInt()

public actual fun findTextA(param0: MutPtr): Hwnd =
    MutPtr(WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsFindTextA(param0.rawAddress))

public actual fun findTextW(param0: MutPtr): Hwnd =
    MutPtr(WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsFindTextW(param0.rawAddress))

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsGetFileTitleA(param0.rawAddress, buf.rawAddress, cchsize.toShort())

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsGetFileTitleW(param0.rawAddress, buf.rawAddress, cchsize.toShort())

public actual fun getOpenFileNameA(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(param0.rawAddress)

public actual fun getOpenFileNameW(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(param0.rawAddress)

public actual fun getSaveFileNameA(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(param0.rawAddress)

public actual fun getSaveFileNameW(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(param0.rawAddress)

public actual fun pageSetupDlgA(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(param0.rawAddress)

public actual fun pageSetupDlgW(param0: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(param0.rawAddress)

public actual fun printDlgA(ppd: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsPrintDlgA(ppd.rawAddress)

public actual fun printDlgExA(ppd: MutPtr): Hresult =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsPrintDlgExA(ppd.rawAddress)

public actual fun printDlgExW(ppd: MutPtr): Hresult =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsPrintDlgExW(ppd.rawAddress)

public actual fun printDlgW(ppd: MutPtr): Bool =
    WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsPrintDlgW(ppd.rawAddress)

public actual fun replaceTextA(param0: MutPtr): Hwnd =
    MutPtr(WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsReplaceTextA(param0.rawAddress))

public actual fun replaceTextW(param0: MutPtr): Hwnd =
    MutPtr(WindowsWin32UiControlsDialogsJniBridge.windowssysWindowsWin32UiControlsDialogsReplaceTextW(param0.rawAddress))
