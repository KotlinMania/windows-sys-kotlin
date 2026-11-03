package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL

public typealias CONSOLECONTROL = Int

public typealias CONSOLE_CHARACTER_ATTRIBUTES = UShort

public typealias CONSOLE_MODE = UInt

public typealias HPCON = Long

public fun interface PHANDLER_ROUTINEFn {
    public operator fun invoke(ctrltype: UInt): BOOL
}

public typealias PHANDLER_ROUTINE = PHANDLER_ROUTINEFn?

public typealias STD_HANDLE = UInt
