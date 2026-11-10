@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPipe(hreadpipe: COpaquePointer?, hwritepipe: COpaquePointer?, lppipeattributes: COpaquePointer?, nsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: COpaquePointer?, lpoutbuffersize: COpaquePointer?, lpinbuffersize: COpaquePointer?, lpmaxinstances: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: COpaquePointer?, nbuffersize: UInt, lpbytesread: COpaquePointer?, lptotalbytesavail: COpaquePointer?, lpbytesleftthismessage: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
