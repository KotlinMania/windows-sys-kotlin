@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesCallNamedPipeA")

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesCallNamedPipeW")

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesConnectNamedPipe")

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesCreateNamedPipeA")

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesCreateNamedPipeW")

public actual fun createPipe(hreadpipe: MutPtr, hwritepipe: MutPtr, lppipeattributes: ConstPtr, nsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesCreatePipe")

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesDisconnectNamedPipe")

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA")

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW")

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId")

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId")

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr, lpcurinstances: MutPtr, lpmaxcollectioncount: MutPtr, lpcollectdatatimeout: MutPtr, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA")

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr, lpcurinstances: MutPtr, lpmaxcollectioncount: MutPtr, lpcollectdatatimeout: MutPtr, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW")

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr, lpoutbuffersize: MutPtr, lpinbuffersize: MutPtr, lpmaxinstances: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeInfo")

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId")

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId")

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient")

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr, nbuffersize: UInt, lpbytesread: MutPtr, lptotalbytesavail: MutPtr, lpbytesleftthismessage: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesPeekNamedPipe")

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr, lpmaxcollectioncount: ConstPtr, lpcollectdatatimeout: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesSetNamedPipeHandleState")

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, lpoverlapped: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesTransactNamedPipe")

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesWaitNamedPipeA")

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPipesWaitNamedPipeW")
