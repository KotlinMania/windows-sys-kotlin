package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.console.BACKGROUND_BLUE
import io.github.kotlinmania.windowssys.windows.win32.system.console.BACKGROUND_GREEN
import io.github.kotlinmania.windowssys.windows.win32.system.console.BACKGROUND_INTENSITY
import io.github.kotlinmania.windowssys.windows.win32.system.console.BACKGROUND_RED
import io.github.kotlinmania.windowssys.windows.win32.system.console.CTRL_BREAK_EVENT
import io.github.kotlinmania.windowssys.windows.win32.system.console.CTRL_CLOSE_EVENT
import io.github.kotlinmania.windowssys.windows.win32.system.console.CTRL_C_EVENT
import io.github.kotlinmania.windowssys.windows.win32.system.console.CTRL_LOGOFF_EVENT
import io.github.kotlinmania.windowssys.windows.win32.system.console.CTRL_SHUTDOWN_EVENT
import io.github.kotlinmania.windowssys.windows.win32.system.console.CharInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.CharInfo0
import io.github.kotlinmania.windowssys.windows.win32.system.console.ConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.Coord
import io.github.kotlinmania.windowssys.windows.win32.system.console.FOREGROUND_BLUE
import io.github.kotlinmania.windowssys.windows.win32.system.console.FOREGROUND_GREEN
import io.github.kotlinmania.windowssys.windows.win32.system.console.FOREGROUND_INTENSITY
import io.github.kotlinmania.windowssys.windows.win32.system.console.FOREGROUND_RED
import io.github.kotlinmania.windowssys.windows.win32.system.console.InputRecord
import io.github.kotlinmania.windowssys.windows.win32.system.console.InputRecord0
import io.github.kotlinmania.windowssys.windows.win32.system.console.KEY_EVENT
import io.github.kotlinmania.windowssys.windows.win32.system.console.KeyEventRecord
import io.github.kotlinmania.windowssys.windows.win32.system.console.KeyEventRecord0
import io.github.kotlinmania.windowssys.windows.win32.system.console.PhandlerRoutineFn
import io.github.kotlinmania.windowssys.windows.win32.system.console.STD_ERROR_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.console.STD_INPUT_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.console.STD_OUTPUT_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.console.SmallRect
import kotlin.test.Test
import kotlin.test.assertEquals

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
        val coord = Coord(x = 80, y = 25)
        assertEquals(80.toShort(), coord.x)
        assertEquals(25.toShort(), coord.y)

        val rect = SmallRect(left = 0, top = 0, right = 79, bottom = 24)
        assertEquals(0.toShort(), rect.left)
        assertEquals(79.toShort(), rect.right)

        val charInfo = CharInfo(char = CharInfo0(unicodeChar = 'A'.code.toUShort()), attributes = FOREGROUND_GREEN)
        assertEquals('A'.code.toUShort(), charInfo.char.unicodeChar)
        assertEquals(FOREGROUND_GREEN, charInfo.attributes)

        val cursorInfo = ConsoleCursorInfo(dwSize = 25u, bVisible = 1)
        assertEquals(25u, cursorInfo.dwSize)
        assertEquals(1, cursorInfo.bVisible)

        val keyEventRecord =
            KeyEventRecord(
                bKeyDown = 1,
                wRepeatCount = 1u,
                wVirtualKeyCode = 65u,
                wVirtualScanCode = 30u,
                uChar = KeyEventRecord0(unicodeChar = 'A'.code.toUShort()),
                dwControlKeyState = 0u,
            )
        val inputRecord0 = InputRecord0(keyEvent = keyEventRecord)
        val inputRecord =
            InputRecord(
                eventType = KEY_EVENT.toUShort(),
                event = inputRecord0,
            )
        assertEquals(KEY_EVENT.toUShort(), inputRecord.eventType)
        assertEquals(1, inputRecord.event.keyEvent.bKeyDown)
        assertEquals('A'.code.toUShort(), inputRecord.event.keyEvent.uChar.unicodeChar)

        val handler =
            PhandlerRoutineFn { ctrlType ->
                if (ctrlType == CTRL_C_EVENT) 1 else 0
            }
        assertEquals(1, handler.invoke(CTRL_C_EVENT))
        assertEquals(0, handler.invoke(CTRL_BREAK_EVENT))
    }
}
