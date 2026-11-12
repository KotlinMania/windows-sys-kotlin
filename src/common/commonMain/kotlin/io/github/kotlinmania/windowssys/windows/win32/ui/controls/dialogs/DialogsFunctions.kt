package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun chooseColorA(param0: MutPtr<Choosecolora>): Bool

public expect fun chooseColorW(param0: MutPtr<Choosecolorw>): Bool

public expect fun chooseFontA(param0: MutPtr<Choosefonta>): Bool

public expect fun chooseFontW(param0: MutPtr<Choosefontw>): Bool

public expect fun commDlgExtendedError(): CommonDlgErrors

public expect fun findTextA(param0: MutPtr<Findreplacea>): Hwnd

public expect fun findTextW(param0: MutPtr<Findreplacew>): Hwnd

public expect fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short

public expect fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short

public expect fun getOpenFileNameA(param0: MutPtr<Openfilenamea>): Bool

public expect fun getOpenFileNameW(param0: MutPtr<Openfilenamew>): Bool

public expect fun getSaveFileNameA(param0: MutPtr<Openfilenamea>): Bool

public expect fun getSaveFileNameW(param0: MutPtr<Openfilenamew>): Bool

public expect fun pageSetupDlgA(param0: MutPtr<Pagesetupdlga>): Bool

public expect fun pageSetupDlgW(param0: MutPtr<Pagesetupdlgw>): Bool

public expect fun printDlgA(ppd: MutPtr<Printdlga>): Bool

public expect fun printDlgExA(ppd: MutPtr<Printdlgexa>): Hresult

public expect fun printDlgExW(ppd: MutPtr<Printdlgexw>): Hresult

public expect fun printDlgW(ppd: MutPtr<Printdlgw>): Bool

public expect fun replaceTextA(param0: MutPtr<Findreplacea>): Hwnd

public expect fun replaceTextW(param0: MutPtr<Findreplacew>): Hwnd
