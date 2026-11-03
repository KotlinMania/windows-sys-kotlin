// port-lint: tests Windows/Win32/System/Pipes/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.pipes.NMPWAIT_NOWAIT
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.NMPWAIT_USE_DEFAULT_WAIT
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.NMPWAIT_WAIT_FOREVER
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_ACCEPT_REMOTE_CLIENTS
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_CLIENT_END
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_NOWAIT
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_READMODE_BYTE
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_READMODE_MESSAGE
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_REJECT_REMOTE_CLIENTS
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_SERVER_END
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_TYPE_BYTE
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_TYPE_MESSAGE
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_UNLIMITED_INSTANCES
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.PIPE_WAIT
import kotlin.test.Test
import kotlin.test.assertEquals

class PipesTest {
    @Test
    fun testPipesConstants() {
        assertEquals(0u, NMPWAIT_USE_DEFAULT_WAIT)
        assertEquals(1u, NMPWAIT_NOWAIT)
        assertEquals(4294967295u, NMPWAIT_WAIT_FOREVER)

        assertEquals(0u, PIPE_WAIT)
        assertEquals(1u, PIPE_NOWAIT)
        assertEquals(0u, PIPE_READMODE_BYTE)
        assertEquals(2u, PIPE_READMODE_MESSAGE)
        assertEquals(0u, PIPE_CLIENT_END)
        assertEquals(1u, PIPE_SERVER_END)
        assertEquals(0u, PIPE_TYPE_BYTE)
        assertEquals(4u, PIPE_TYPE_MESSAGE)
        assertEquals(0u, PIPE_ACCEPT_REMOTE_CLIENTS)
        assertEquals(8u, PIPE_REJECT_REMOTE_CLIENTS)
        assertEquals(255u, PIPE_UNLIMITED_INSTANCES)
    }
}
