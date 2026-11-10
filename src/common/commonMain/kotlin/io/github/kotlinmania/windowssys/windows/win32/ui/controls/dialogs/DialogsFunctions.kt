package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun chooseColorA(param0: COpaquePointer?): Bool

public expect fun chooseColorW(param0: COpaquePointer?): Bool

public expect fun chooseFontA(param0: COpaquePointer?): Bool

public expect fun chooseFontW(param0: COpaquePointer?): Bool

public expect fun commDlgExtendedError(): CommonDlgErrors

public expect fun findTextA(param0: COpaquePointer?): Hwnd

public expect fun findTextW(param0: COpaquePointer?): Hwnd

public expect fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short

public expect fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short

public expect fun getOpenFileNameA(param0: COpaquePointer?): Bool

public expect fun getOpenFileNameW(param0: COpaquePointer?): Bool

public expect fun getSaveFileNameA(param0: COpaquePointer?): Bool

public expect fun getSaveFileNameW(param0: COpaquePointer?): Bool

public expect fun pageSetupDlgA(param0: COpaquePointer?): Bool

public expect fun pageSetupDlgW(param0: COpaquePointer?): Bool

public expect fun printDlgA(ppd: COpaquePointer?): Bool

public expect fun printDlgExA(ppd: COpaquePointer?): Hresult

public expect fun printDlgExW(ppd: COpaquePointer?): Hresult

public expect fun printDlgW(ppd: COpaquePointer?): Bool

public expect fun replaceTextA(param0: COpaquePointer?): Hwnd

public expect fun replaceTextW(param0: COpaquePointer?): Hwnd
