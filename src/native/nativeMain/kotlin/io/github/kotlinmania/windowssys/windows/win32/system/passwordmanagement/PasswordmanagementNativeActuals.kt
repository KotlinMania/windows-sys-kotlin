@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MSChapSrvChangePassword(servername: PCWSTR, username: PCWSTR, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.cinterop.windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), lmoldpresent, lmoldowfpassword.toCPointer<ByteVar>(), lmnewowfpassword.toCPointer<ByteVar>(), ntoldowfpassword.toCPointer<ByteVar>(), ntnewowfpassword.toCPointer<ByteVar>())

public actual fun MSChapSrvChangePassword2(servername: PCWSTR, username: PCWSTR, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.cinterop.windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword2(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), newpasswordencryptedwitholdnt.toCPointer<ByteVar>(), oldntowfpasswordencryptedwithnewnt.toCPointer<ByteVar>(), lmpresent, newpasswordencryptedwitholdlm.toCPointer<ByteVar>(), oldlmowfpasswordencryptedwithnewlmornt.toCPointer<ByteVar>())
