package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.Bool

public typealias Consolecontrol = Int

public typealias ConsoleCharacterAttributes = UShort

public typealias ConsoleMode = UInt

public typealias Hpcon = Long

public fun interface PhandlerRoutineFn {
    public operator fun invoke(ctrltype: UInt): Bool
}

public typealias PhandlerRoutine = PhandlerRoutineFn?

public typealias StdHandle = UInt
