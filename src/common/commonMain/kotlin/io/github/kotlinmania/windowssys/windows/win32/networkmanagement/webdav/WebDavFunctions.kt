package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun davAddConnection(connectionhandle: MutPtr<Handle>, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: ConstPtr<UByte>, certsize: UInt): UInt

public expect fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt

public expect fun davDeleteConnection(connectionhandle: Handle): UInt

public expect fun davFlushFile(hfile: Handle): UInt

public expect fun davGetExtendedError(hfile: Handle, exterror: MutPtr<UInt>, exterrorstring: Pwstr, cchsize: MutPtr<UInt>): UInt

public expect fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: MutPtr<UInt>): UInt

public expect fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: MutPtr<UInt>): UInt

public expect fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: MutPtr<UInt>): UInt

public expect fun davInvalidateCache(urlname: Pcwstr): UInt

public expect fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt

public expect fun davUnregisterAuthCallback(hcallback: UInt)
