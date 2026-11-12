@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun davAddConnection(connectionhandle: MutPtr, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: ConstPtr, certsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection")

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer")

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection")

public actual fun davFlushFile(hfile: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile")

public actual fun davGetExtendedError(hfile: Handle, exterror: MutPtr, exterrorstring: Pwstr, cchsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError")

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath")

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile")

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath")

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache")

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback")
private external fun wasiWindowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback: Int): Unit

public actual fun davUnregisterAuthCallback(hcallback: UInt): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback.toInt())
