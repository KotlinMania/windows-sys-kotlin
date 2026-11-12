@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class CharInfo(
    public var char: CharInfo0 = CharInfo0(),
    public var attributes: UShort = 0u,
)

public data class CharInfo0(
    public var unicodeChar: UShort = 0u,
    public var asciiChar: Byte = 0,
)

public class Consoleendtask internal constructor(
    processIdCtorArg: Handle,
    hwndCtorArg: Hwnd,
    public var consoleEventCode: UInt,
    public var consoleFlags: UInt,
) {
    public var processId: Handle = processIdCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        processIdCtorArg = MutPtr(0L),
        hwndCtorArg = MutPtr(0L),
        consoleEventCode = 0u,
        consoleFlags = 0u,
    )

    public operator fun component1(): Handle = this.processId

    public operator fun component2(): Hwnd = this.hwnd

    public operator fun component3(): UInt = this.consoleEventCode

    public operator fun component4(): UInt = this.consoleFlags

    public fun copy(processId: Handle = this.processId, hwnd: Hwnd = this.hwnd, consoleEventCode: UInt = this.consoleEventCode, consoleFlags: UInt = this.consoleFlags): Consoleendtask = Consoleendtask(processIdCtorArg = processId, hwndCtorArg = hwnd, consoleEventCode = consoleEventCode, consoleFlags = consoleFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Consoleendtask) return false
        if (this.processId != other.processId) return false
        if (this.hwnd != other.hwnd) return false
        if (this.consoleEventCode != other.consoleEventCode) return false
        if (this.consoleFlags != other.consoleFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processId.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.consoleEventCode.hashCode()
        result = 31 * result + this.consoleFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            processId: Handle = MutPtr(0L),
            hwnd: Hwnd = MutPtr(0L),
            consoleEventCode: UInt = 0u,
            consoleFlags: UInt = 0u,
        ): Consoleendtask =
            Consoleendtask(
                processIdCtorArg = processId,
                hwndCtorArg = hwnd,
                consoleEventCode = consoleEventCode,
                consoleFlags = consoleFlags,
            )
    }
}

public class Consolesetforeground internal constructor(
    hProcessCtorArg: Handle,
    public var bForeground: Bool,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        bForeground = 0,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): Bool = this.bForeground

    public fun copy(hProcess: Handle = this.hProcess, bForeground: Bool = this.bForeground): Consolesetforeground = Consolesetforeground(hProcessCtorArg = hProcess, bForeground = bForeground)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Consolesetforeground) return false
        if (this.hProcess != other.hProcess) return false
        if (this.bForeground != other.bForeground) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.bForeground.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            bForeground: Bool = 0,
        ): Consolesetforeground =
            Consolesetforeground(
                hProcessCtorArg = hProcess,
                bForeground = bForeground,
            )
    }
}

public class Consolewindowowner internal constructor(
    hwndCtorArg: Hwnd,
    public var processId: UInt,
    public var threadId: UInt,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        processId = 0u,
        threadId = 0u,
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): UInt = this.processId

    public operator fun component3(): UInt = this.threadId

    public fun copy(hwnd: Hwnd = this.hwnd, processId: UInt = this.processId, threadId: UInt = this.threadId): Consolewindowowner = Consolewindowowner(hwndCtorArg = hwnd, processId = processId, threadId = threadId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Consolewindowowner) return false
        if (this.hwnd != other.hwnd) return false
        if (this.processId != other.processId) return false
        if (this.threadId != other.threadId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.threadId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            processId: UInt = 0u,
            threadId: UInt = 0u,
        ): Consolewindowowner =
            Consolewindowowner(
                hwndCtorArg = hwnd,
                processId = processId,
                threadId = threadId,
            )
    }
}

public class ConsoleCaretInfo internal constructor(
    hwndCtorArg: Hwnd,
    public var rc: Rect,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): Rect = this.rc

    public fun copy(hwnd: Hwnd = this.hwnd, rc: Rect = this.rc): ConsoleCaretInfo = ConsoleCaretInfo(hwndCtorArg = hwnd, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConsoleCaretInfo) return false
        if (this.hwnd != other.hwnd) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            rc: Rect = Rect(),
        ): ConsoleCaretInfo =
            ConsoleCaretInfo(
                hwndCtorArg = hwnd,
                rc = rc,
            )
    }
}

public data class ConsoleCursorInfo(
    public var dwSize: UInt = 0u,
    public var bVisible: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleCursorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleCursorInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ConsoleCursorInfo =
                    ConsoleCursorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ConsoleCursorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bVisible)
                }
            }
    }
}

public data class ConsoleFontInfo(
    public var nFont: UInt = 0u,
    public var dwFontSize: Coord = Coord(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleFontInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleFontInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ConsoleFontInfo =
                    ConsoleFontInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Coord.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ConsoleFontInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nFont)
                    (Coord.typeLayout()).writeNative(addr + 4L, value.dwFontSize)
                }
            }
    }
}

public data class ConsoleFontInfoex(
    public var cbSize: UInt = 0u,
    public var nFont: UInt = 0u,
    public var dwFontSize: Coord = Coord(),
    public var fontFamily: UInt = 0u,
    public var fontWeight: UInt = 0u,
    public var faceName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConsoleFontInfoex) return false
        if (this.cbSize != other.cbSize) return false
        if (this.nFont != other.nFont) return false
        if (this.dwFontSize != other.dwFontSize) return false
        if (this.fontFamily != other.fontFamily) return false
        if (this.fontWeight != other.fontWeight) return false
        if (!this.faceName.contentEquals(other.faceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.nFont.hashCode()
        result = 31 * result + this.dwFontSize.hashCode()
        result = 31 * result + this.fontFamily.hashCode()
        result = 31 * result + this.fontWeight.hashCode()
        result = 31 * result + this.faceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleFontInfoex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleFontInfoex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): ConsoleFontInfoex =
                    ConsoleFontInfoex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (Coord.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 20L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ConsoleFontInfoex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nFont)
                    (Coord.typeLayout()).writeNative(addr + 8L, value.dwFontSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fontFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fontWeight)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 20L, value.faceName.toList())
                }
            }
    }
}

public data class ConsoleHistoryInfo(
    public var cbSize: UInt = 0u,
    public var historyBufferSize: UInt = 0u,
    public var numberOfHistoryBuffers: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleHistoryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleHistoryInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ConsoleHistoryInfo =
                    ConsoleHistoryInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ConsoleHistoryInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.historyBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfHistoryBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                }
            }
    }
}

public data class ConsoleProcessInfo(
    public var dwProcessID: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleProcessInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleProcessInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ConsoleProcessInfo =
                    ConsoleProcessInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ConsoleProcessInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class ConsoleReadconsoleControl(
    public var nLength: UInt = 0u,
    public var nInitialChars: UInt = 0u,
    public var dwCtrlWakeupMask: UInt = 0u,
    public var dwControlKeyState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleReadconsoleControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleReadconsoleControl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ConsoleReadconsoleControl =
                    ConsoleReadconsoleControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ConsoleReadconsoleControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nInitialChars)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCtrlWakeupMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwControlKeyState)
                }
            }
    }
}

public data class ConsoleScreenBufferInfo(
    public var dwSize: Coord = Coord(),
    public var dwCursorPosition: Coord = Coord(),
    public var wAttributes: ConsoleCharacterAttributes = 0u,
    public var srWindow: SmallRect = SmallRect(),
    public var dwMaximumWindowSize: Coord = Coord(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleScreenBufferInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleScreenBufferInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 22L
                override fun readNative(addr: Long): ConsoleScreenBufferInfo =
                    ConsoleScreenBufferInfo(
                        (Coord.typeLayout()).readNative(addr),
                        (Coord.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (SmallRect.typeLayout()).readNative(addr + 10L),
                        (Coord.typeLayout()).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: ConsoleScreenBufferInfo) {
                    (Coord.typeLayout()).writeNative(addr, value.dwSize)
                    (Coord.typeLayout()).writeNative(addr + 4L, value.dwCursorPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wAttributes)
                    (SmallRect.typeLayout()).writeNative(addr + 10L, value.srWindow)
                    (Coord.typeLayout()).writeNative(addr + 18L, value.dwMaximumWindowSize)
                }
            }
    }
}

public data class ConsoleScreenBufferInfoex(
    public var cbSize: UInt = 0u,
    public var dwSize: Coord = Coord(),
    public var dwCursorPosition: Coord = Coord(),
    public var wAttributes: ConsoleCharacterAttributes = 0u,
    public var srWindow: SmallRect = SmallRect(),
    public var dwMaximumWindowSize: Coord = Coord(),
    public var wPopupAttributes: UShort = 0u,
    public var bFullscreenSupported: Bool = 0,
    public var colorTable: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConsoleScreenBufferInfoex) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCursorPosition != other.dwCursorPosition) return false
        if (this.wAttributes != other.wAttributes) return false
        if (this.srWindow != other.srWindow) return false
        if (this.dwMaximumWindowSize != other.dwMaximumWindowSize) return false
        if (this.wPopupAttributes != other.wPopupAttributes) return false
        if (this.bFullscreenSupported != other.bFullscreenSupported) return false
        if (!this.colorTable.contentEquals(other.colorTable)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwCursorPosition.hashCode()
        result = 31 * result + this.wAttributes.hashCode()
        result = 31 * result + this.srWindow.hashCode()
        result = 31 * result + this.dwMaximumWindowSize.hashCode()
        result = 31 * result + this.wPopupAttributes.hashCode()
        result = 31 * result + this.bFullscreenSupported.hashCode()
        result = 31 * result + this.colorTable.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleScreenBufferInfoex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleScreenBufferInfoex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): ConsoleScreenBufferInfoex =
                    ConsoleScreenBufferInfoex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Coord.typeLayout()).readNative(addr + 4L),
                        (Coord.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (SmallRect.typeLayout()).readNative(addr + 14L),
                        (Coord.typeLayout()).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                        ).readNative(addr + 32L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ConsoleScreenBufferInfoex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (Coord.typeLayout()).writeNative(addr + 4L, value.dwSize)
                    (Coord.typeLayout()).writeNative(addr + 8L, value.dwCursorPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wAttributes)
                    (SmallRect.typeLayout()).writeNative(addr + 14L, value.srWindow)
                    (Coord.typeLayout()).writeNative(addr + 22L, value.dwMaximumWindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.wPopupAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.bFullscreenSupported)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                    ).writeNative(addr + 32L, value.colorTable.toList())
                }
            }
    }
}

public data class ConsoleSelectionInfo(
    public var dwFlags: UInt = 0u,
    public var dwSelectionAnchor: Coord = Coord(),
    public var srSelection: SmallRect = SmallRect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleSelectionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConsoleSelectionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ConsoleSelectionInfo =
                    ConsoleSelectionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Coord.typeLayout()).readNative(addr + 4L),
                        (SmallRect.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ConsoleSelectionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (Coord.typeLayout()).writeNative(addr + 4L, value.dwSelectionAnchor)
                    (SmallRect.typeLayout()).writeNative(addr + 8L, value.srSelection)
                }
            }
    }
}

public data class Coord(
    public var x: Short = 0,
    public var y: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Coord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Coord> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Coord =
                    Coord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Coord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.y)
                }
            }
    }
}

public data class FocusEventRecord(
    public var bSetFocus: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FocusEventRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FocusEventRecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FocusEventRecord =
                    FocusEventRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FocusEventRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bSetFocus)
                }
            }
    }
}

public data class InputRecord(
    public var eventType: UShort = 0u,
    public var event: InputRecord0 = InputRecord0(),
)

public data class InputRecord0(
    public var keyEvent: KeyEventRecord = KeyEventRecord(),
    public var mouseEvent: MouseEventRecord = MouseEventRecord(),
    public var windowBufferSizeEvent: WindowBufferSizeRecord = WindowBufferSizeRecord(),
    public var menuEvent: MenuEventRecord = MenuEventRecord(),
    public var focusEvent: FocusEventRecord = FocusEventRecord(),
)

public data class KeyEventRecord(
    public var bKeyDown: Bool = 0,
    public var wRepeatCount: UShort = 0u,
    public var wVirtualKeyCode: UShort = 0u,
    public var wVirtualScanCode: UShort = 0u,
    public var uChar: KeyEventRecord0 = KeyEventRecord0(),
    public var dwControlKeyState: UInt = 0u,
)

public data class KeyEventRecord0(
    public var unicodeChar: UShort = 0u,
    public var asciiChar: Byte = 0,
)

public data class MenuEventRecord(
    public var dwCommandId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MenuEventRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MenuEventRecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MenuEventRecord =
                    MenuEventRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MenuEventRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCommandId)
                }
            }
    }
}

public data class MouseEventRecord(
    public var dwMousePosition: Coord = Coord(),
    public var dwButtonState: UInt = 0u,
    public var dwControlKeyState: UInt = 0u,
    public var dwEventFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseEventRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseEventRecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MouseEventRecord =
                    MouseEventRecord(
                        (Coord.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MouseEventRecord) {
                    (Coord.typeLayout()).writeNative(addr, value.dwMousePosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwButtonState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwControlKeyState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwEventFlags)
                }
            }
    }
}

public data class SmallRect(
    public var left: Short = 0,
    public var top: Short = 0,
    public var right: Short = 0,
    public var bottom: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmallRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmallRect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SmallRect =
                    SmallRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SmallRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.bottom)
                }
            }
    }
}

public data class WindowBufferSizeRecord(
    public var dwSize: Coord = Coord(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowBufferSizeRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowBufferSizeRecord> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WindowBufferSizeRecord =
                    WindowBufferSizeRecord(
                        (Coord.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WindowBufferSizeRecord) {
                    (Coord.typeLayout()).writeNative(addr, value.dwSize)
                }
            }
    }
}
