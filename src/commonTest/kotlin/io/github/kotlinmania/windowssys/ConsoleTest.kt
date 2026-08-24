package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.console.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ConsoleTest {
    @Test
    fun testConsoleConstants() {
        assertEquals(1u, CTRL_BREAK_EVENT)
        assertEquals(2u, CTRL_CLOSE_EVENT)
        assertEquals(0u, CTRL_C_EVENT)
        assertEquals(5u, CTRL_LOGOFF_EVENT)
        assertEquals(6u, CTRL_SHUTDOWN_EVENT)

        assertEquals(4294967284u, STD_ERROR_HANDLE)
        assertEquals(4294967285u, STD_OUTPUT_HANDLE)
        assertEquals(4294967286u, STD_INPUT_HANDLE)

        assertEquals(1u, FOREGROUND_BLUE)
        assertEquals(2u, FOREGROUND_GREEN)
        assertEquals(4u, FOREGROUND_RED)
        assertEquals(8u, FOREGROUND_INTENSITY)

        assertEquals(16u, BACKGROUND_BLUE)
        assertEquals(32u, BACKGROUND_GREEN)
        assertEquals(64u, BACKGROUND_RED)
        assertEquals(128u, BACKGROUND_INTENSITY)
    }

    @Test
    fun testConsoleStructs() {
        val coord = COORD(X = 80, Y = 25)
        assertEquals(80.toShort(), coord.X)
        assertEquals(25.toShort(), coord.Y)

        val rect = SMALL_RECT(Left = 0, Top = 0, Right = 79, Bottom = 24)
        assertEquals(0.toShort(), rect.Left)
        assertEquals(79.toShort(), rect.Right)

        val charInfo = CHAR_INFO(Char = CHAR_INFO_0(UnicodeChar = 'A'.code.toUShort()), Attributes = FOREGROUND_GREEN)
        assertEquals('A'.code.toUShort(), charInfo.Char.UnicodeChar)
        assertEquals(FOREGROUND_GREEN, charInfo.Attributes)

        val cursorInfo = CONSOLE_CURSOR_INFO(dwSize = 25u, bVisible = 1)
        assertEquals(25u, cursorInfo.dwSize)
        assertEquals(1, cursorInfo.bVisible)

        val inputRecord = INPUT_RECORD(
            EventType = KEY_EVENT.toUShort(),
            Event = INPUT_RECORD_0(
                KeyEvent = KEY_EVENT_RECORD(
                    bKeyDown = 1,
                    wRepeatCount = 1u,
                    wVirtualKeyCode = 65u,
                    wVirtualScanCode = 30u,
                    uChar = KEY_EVENT_RECORD_0(UnicodeChar = 'A'.code.toUShort()),
                    dwControlKeyState = 0u,
                )
            )
        )
        assertEquals(KEY_EVENT.toUShort(), inputRecord.EventType)
        assertEquals(1, inputRecord.Event.KeyEvent.bKeyDown)
        assertEquals('A'.code.toUShort(), inputRecord.Event.KeyEvent.uChar.UnicodeChar)

        val handler = PHANDLER_ROUTINE { ctrlType ->
            if (ctrlType == CTRL_C_EVENT) 1 else 0
        }
        assertEquals(1, handler.invoke(CTRL_C_EVENT))
        assertEquals(0, handler.invoke(CTRL_BREAK_EVENT))
    }
}
