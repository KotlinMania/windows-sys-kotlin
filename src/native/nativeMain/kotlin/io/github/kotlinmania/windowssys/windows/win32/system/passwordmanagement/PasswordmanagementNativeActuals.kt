@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: COpaquePointer?, lmnewowfpassword: COpaquePointer?, ntoldowfpassword: COpaquePointer?, ntnewowfpassword: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.cinterop.windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), lmoldpresent, lmoldowfpassword?.value?.toCPointer<ByteVar>(), lmnewowfpassword?.value?.toCPointer<ByteVar>(), ntoldowfpassword?.value?.toCPointer<ByteVar>(), ntnewowfpassword?.value?.toCPointer<ByteVar>())

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: COpaquePointer?, oldntowfpasswordencryptedwithnewnt: COpaquePointer?, lmpresent: Boolean, newpasswordencryptedwitholdlm: COpaquePointer?, oldlmowfpasswordencryptedwithnewlmornt: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.cinterop.windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), newpasswordencryptedwitholdnt?.value?.toCPointer<ByteVar>(), oldntowfpasswordencryptedwithnewnt?.value?.toCPointer<ByteVar>(), lmpresent, newpasswordencryptedwitholdlm?.value?.toCPointer<ByteVar>(), oldlmowfpasswordencryptedwithnewlmornt?.value?.toCPointer<ByteVar>())
