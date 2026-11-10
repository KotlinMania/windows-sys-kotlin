@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class CharInfo(public var char: CharInfo0 = CharInfo0(), public var attributes: UShort = 0u)

public data class CharInfo0(public var unicodeChar: UShort = 0u, public var asciiChar: Byte = 0)

public data class Consoleendtask(
    public var processId: Handle = null,
    public var hwnd: Hwnd = null,
    public var consoleEventCode: UInt = 0u,
    public var consoleFlags: UInt = 0u,
)

public data class Consolesetforeground(public var hProcess: Handle = null, public var bForeground: Bool = 0)

public data class Consolewindowowner(
    public var hwnd: Hwnd = null,
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
)

public data class ConsoleCaretInfo(public var hwnd: Hwnd = null, public var rc: Rect = Rect())

public data class ConsoleCursorInfo(public var dwSize: UInt = 0u, public var bVisible: Bool = 0)

public data class ConsoleFontInfo(public var nFont: UInt = 0u, public var dwFontSize: Coord = Coord())

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
}

public data class ConsoleHistoryInfo(
    public var cbSize: UInt = 0u,
    public var historyBufferSize: UInt = 0u,
    public var numberOfHistoryBuffers: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class ConsoleProcessInfo(public var dwProcessID: UInt = 0u, public var dwFlags: UInt = 0u)

public data class ConsoleReadconsoleControl(
    public var nLength: UInt = 0u,
    public var nInitialChars: UInt = 0u,
    public var dwCtrlWakeupMask: UInt = 0u,
    public var dwControlKeyState: UInt = 0u,
)

public data class ConsoleScreenBufferInfo(
    public var dwSize: Coord = Coord(),
    public var dwCursorPosition: Coord = Coord(),
    public var wAttributes: ConsoleCharacterAttributes = 0u,
    public var srWindow: SmallRect = SmallRect(),
    public var dwMaximumWindowSize: Coord = Coord(),
)

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
}

public data class ConsoleSelectionInfo(
    public var dwFlags: UInt = 0u,
    public var dwSelectionAnchor: Coord = Coord(),
    public var srSelection: SmallRect = SmallRect(),
)

public data class Coord(public var x: Short = 0, public var y: Short = 0)

public data class FocusEventRecord(public var bSetFocus: Bool = 0)

public data class InputRecord(public var eventType: UShort = 0u, public var event: InputRecord0 = InputRecord0())

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

public data class KeyEventRecord0(public var unicodeChar: UShort = 0u, public var asciiChar: Byte = 0)

public data class MenuEventRecord(public var dwCommandId: UInt = 0u)

public data class MouseEventRecord(
    public var dwMousePosition: Coord = Coord(),
    public var dwButtonState: UInt = 0u,
    public var dwControlKeyState: UInt = 0u,
    public var dwEventFlags: UInt = 0u,
)

public data class SmallRect(
    public var left: Short = 0,
    public var top: Short = 0,
    public var right: Short = 0,
    public var bottom: Short = 0,
)

public data class WindowBufferSizeRecord(public var dwSize: Coord = Coord())
