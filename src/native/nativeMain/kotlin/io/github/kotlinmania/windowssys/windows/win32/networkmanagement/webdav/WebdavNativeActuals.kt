@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun davAddConnection(connectionhandle: MutPtr<Handle>, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: ConstPtr<UByte>, certsize: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(connectionhandle.rawAddress.toCPointer<ByteVar>(), remotename.rawAddress.toCPointer<ByteVar>(), username.rawAddress.toCPointer<ByteVar>(), password.rawAddress.toCPointer<ByteVar>(), clientcert.rawAddress.toCPointer<ByteVar>(), certsize)

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(lpname.rawAddress.toCPointer<ByteVar>(), fforce)

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(connectionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun davFlushFile(hfile: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(hfile.rawAddress.toCPointer<ByteVar>())

public actual fun davGetExtendedError(hfile: Handle, exterror: MutPtr<UInt>, exterrorstring: Pwstr, cchsize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(hfile.rawAddress.toCPointer<ByteVar>(), exterror.rawAddress.toCPointer<ByteVar>(), exterrorstring.rawAddress.toCPointer<ByteVar>(), cchsize.rawAddress.toCPointer<ByteVar>())

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(uncpath.rawAddress.toCPointer<ByteVar>(), url.rawAddress.toCPointer<ByteVar>(), lpsize.rawAddress.toCPointer<ByteVar>())

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(filename.rawAddress.toCPointer<ByteVar>(), lockownername.rawAddress.toCPointer<ByteVar>(), lockownernamelengthinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(url.rawAddress.toCPointer<ByteVar>(), uncpath.rawAddress.toCPointer<ByteVar>(), lpsize.rawAddress.toCPointer<ByteVar>())

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(urlname.rawAddress.toCPointer<ByteVar>())

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(0L.toCPointer<ByteVar>(), version)

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback)
}
