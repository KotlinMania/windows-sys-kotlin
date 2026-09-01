// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

public data class COORD(
    public var X: Short = 0,
    public var Y: Short = 0,
)

public data class SMALL_RECT(
    public var Left: Short = 0,
    public var Top: Short = 0,
    public var Right: Short = 0,
    public var Bottom: Short = 0,
)

public data class CHAR_INFO_0(
    public var UnicodeChar: UShort = 0u,
    public var AsciiChar: Byte = 0,
)

public data class CHAR_INFO(
    public var Char: CHAR_INFO_0 = CHAR_INFO_0(),
    public var Attributes: UShort = 0u,
)

public data class CONSOLEENDTASK(
    public var ProcessId: HANDLE = 0L,
    public var hwnd: HWND = 0L,
    public var ConsoleEventCode: UInt = 0u,
    public var ConsoleFlags: UInt = 0u,
)

public data class CONSOLESETFOREGROUND(
    public var hProcess: HANDLE = 0L,
    public var bForeground: BOOL = 0,
)

public data class CONSOLEWINDOWOWNER(
    public var hwnd: HWND = 0L,
    public var ProcessId: UInt = 0u,
    public var ThreadId: UInt = 0u,
)

public data class CONSOLE_CARET_INFO(
    public var hwnd: HWND = 0L,
    public var rc: RECT = RECT(),
)

public data class CONSOLE_CURSOR_INFO(
    public var dwSize: UInt = 0u,
    public var bVisible: BOOL = 0,
)

public data class CONSOLE_FONT_INFO(
    public var nFont: UInt = 0u,
    public var dwFontSize: COORD = COORD(),
)

public data class CONSOLE_FONT_INFOEX(
    public var cbSize: UInt = 0u,
    public var nFont: UInt = 0u,
    public var dwFontSize: COORD = COORD(),
    public var FontFamily: UInt = 0u,
    public var FontWeight: UInt = 0u,
    public var FaceName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONSOLE_FONT_INFOEX) return false
        if (cbSize != other.cbSize) return false
        if (nFont != other.nFont) return false
        if (dwFontSize != other.dwFontSize) return false
        if (FontFamily != other.FontFamily) return false
        if (FontWeight != other.FontWeight) return false
        return FaceName.contentEquals(other.FaceName)
    }

    override fun hashCode(): Int {
        var result = cbSize.hashCode()
        result = 31 * result + nFont.hashCode()
        result = 31 * result + dwFontSize.hashCode()
        result = 31 * result + FontFamily.hashCode()
        result = 31 * result + FontWeight.hashCode()
        result = 31 * result + FaceName.contentHashCode()
        return result
    }
}

public data class CONSOLE_HISTORY_INFO(
    public var cbSize: UInt = 0u,
    public var HistoryBufferSize: UInt = 0u,
    public var NumberOfHistoryBuffers: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class CONSOLE_PROCESS_INFO(
    public var dwProcessID: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class CONSOLE_READCONSOLE_CONTROL(
    public var nLength: UInt = 0u,
    public var nInitialChars: UInt = 0u,
    public var dwCtrlWakeupMask: UInt = 0u,
    public var dwControlKeyState: UInt = 0u,
)

public data class CONSOLE_SCREEN_BUFFER_INFO(
    public var dwSize: COORD = COORD(),
    public var dwCursorPosition: COORD = COORD(),
    public var wAttributes: CONSOLE_CHARACTER_ATTRIBUTES = 0u,
    public var srWindow: SMALL_RECT = SMALL_RECT(),
    public var dwMaximumWindowSize: COORD = COORD(),
)

public data class CONSOLE_SCREEN_BUFFER_INFOEX(
    public var cbSize: UInt = 0u,
    public var dwSize: COORD = COORD(),
    public var dwCursorPosition: COORD = COORD(),
    public var wAttributes: CONSOLE_CHARACTER_ATTRIBUTES = 0u,
    public var srWindow: SMALL_RECT = SMALL_RECT(),
    public var dwMaximumWindowSize: COORD = COORD(),
    public var wPopupAttributes: UShort = 0u,
    public var bFullscreenSupported: BOOL = 0,
    public var ColorTable: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONSOLE_SCREEN_BUFFER_INFOEX) return false
        if (cbSize != other.cbSize) return false
        if (dwSize != other.dwSize) return false
        if (dwCursorPosition != other.dwCursorPosition) return false
        if (wAttributes != other.wAttributes) return false
        if (srWindow != other.srWindow) return false
        if (dwMaximumWindowSize != other.dwMaximumWindowSize) return false
        if (wPopupAttributes != other.wPopupAttributes) return false
        if (bFullscreenSupported != other.bFullscreenSupported) return false
        return ColorTable.contentEquals(other.ColorTable)
    }

    override fun hashCode(): Int {
        var result = cbSize.hashCode()
        result = 31 * result + dwSize.hashCode()
        result = 31 * result + dwCursorPosition.hashCode()
        result = 31 * result + wAttributes.hashCode()
        result = 31 * result + srWindow.hashCode()
        result = 31 * result + dwMaximumWindowSize.hashCode()
        result = 31 * result + wPopupAttributes.hashCode()
        result = 31 * result + bFullscreenSupported.hashCode()
        result = 31 * result + ColorTable.contentHashCode()
        return result
    }
}

public data class CONSOLE_SELECTION_INFO(
    public var dwFlags: UInt = 0u,
    public var dwSelectionAnchor: COORD = COORD(),
    public var srSelection: SMALL_RECT = SMALL_RECT(),
)

public data class FOCUS_EVENT_RECORD(
    public var bSetFocus: BOOL = 0,
)

public data class KEY_EVENT_RECORD_0(
    public var UnicodeChar: UShort = 0u,
    public var AsciiChar: Byte = 0,
)

public data class KEY_EVENT_RECORD(
    public var bKeyDown: BOOL = 0,
    public var wRepeatCount: UShort = 0u,
    public var wVirtualKeyCode: UShort = 0u,
    public var wVirtualScanCode: UShort = 0u,
    public var uChar: KEY_EVENT_RECORD_0 = KEY_EVENT_RECORD_0(),
    public var dwControlKeyState: UInt = 0u,
)

public data class MENU_EVENT_RECORD(
    public var dwCommandId: UInt = 0u,
)

public data class MOUSE_EVENT_RECORD(
    public var dwMousePosition: COORD = COORD(),
    public var dwButtonState: UInt = 0u,
    public var dwControlKeyState: UInt = 0u,
    public var dwEventFlags: UInt = 0u,
)

public data class WINDOW_BUFFER_SIZE_RECORD(
    public var dwSize: COORD = COORD(),
)

public data class INPUT_RECORD_0(
    public var KeyEvent: KEY_EVENT_RECORD = KEY_EVENT_RECORD(),
    public var MouseEvent: MOUSE_EVENT_RECORD = MOUSE_EVENT_RECORD(),
    public var WindowBufferSizeEvent: WINDOW_BUFFER_SIZE_RECORD = WINDOW_BUFFER_SIZE_RECORD(),
    public var MenuEvent: MENU_EVENT_RECORD = MENU_EVENT_RECORD(),
    public var FocusEvent: FOCUS_EVENT_RECORD = FOCUS_EVENT_RECORD(),
)

public data class INPUT_RECORD(
    public var EventType: UShort = 0u,
    public var Event: INPUT_RECORD_0 = INPUT_RECORD_0(),
)
