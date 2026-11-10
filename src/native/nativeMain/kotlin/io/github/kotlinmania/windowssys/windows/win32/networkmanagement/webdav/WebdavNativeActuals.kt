@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun davAddConnection(connectionhandle: COpaquePointer?, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: COpaquePointer?, certsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davAddConnection(connectionhandle?.value?.toCPointer<ByteVar>(), remotename?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>(), clientcert?.value?.toCPointer<ByteVar>(), certsize)

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davCancelConnectionsToServer(lpname?.value?.toCPointer<ByteVar>(), fforce)

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davDeleteConnection(connectionhandle?.value?.toCPointer<ByteVar>())

public actual fun davFlushFile(hfile: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davFlushFile(hfile?.value?.toCPointer<ByteVar>())

public actual fun davGetExtendedError(hfile: Handle, exterror: COpaquePointer?, exterrorstring: Pwstr, cchsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davGetExtendedError(hfile?.value?.toCPointer<ByteVar>(), exterror?.value?.toCPointer<ByteVar>(), exterrorstring?.value?.toCPointer<ByteVar>(), cchsize?.value?.toCPointer<ByteVar>())

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davGetHTTPFromUNCPath(uncpath?.value?.toCPointer<ByteVar>(), url?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davGetTheLockOwnerOfTheFile(filename?.value?.toCPointer<ByteVar>(), lockownername?.value?.toCPointer<ByteVar>(), lockownernamelengthinbytes?.value?.toCPointer<ByteVar>())

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davGetUNCFromHTTPPath(url?.value?.toCPointer<ByteVar>(), uncpath?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davInvalidateCache(urlname?.value?.toCPointer<ByteVar>())

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davRegisterAuthCallback(0L.toCPointer<ByteVar>(), version)

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_davUnregisterAuthCallback(hcallback)
}
