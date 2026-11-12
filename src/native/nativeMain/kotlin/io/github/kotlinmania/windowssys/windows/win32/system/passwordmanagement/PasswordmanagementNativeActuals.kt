@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.cinterop.windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.cinterop.windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: ConstPtr<LmOwfPassword>, lmnewowfpassword: ConstPtr<LmOwfPassword>, ntoldowfpassword: ConstPtr<LmOwfPassword>, ntnewowfpassword: ConstPtr<LmOwfPassword>): UInt =
    windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword(servername.rawAddress.toCPointer<ByteVar>(), username.rawAddress.toCPointer<ByteVar>(), lmoldpresent, lmoldowfpassword.rawAddress.toCPointer<ByteVar>(), lmnewowfpassword.rawAddress.toCPointer<ByteVar>(), ntoldowfpassword.rawAddress.toCPointer<ByteVar>(), ntnewowfpassword.rawAddress.toCPointer<ByteVar>())

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: ConstPtr<SamprEncryptedUserPassword>, oldntowfpasswordencryptedwithnewnt: ConstPtr<EncryptedLmOwfPassword>, lmpresent: Boolean, newpasswordencryptedwitholdlm: ConstPtr<SamprEncryptedUserPassword>, oldlmowfpasswordencryptedwithnewlmornt: ConstPtr<EncryptedLmOwfPassword>): UInt =
    windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2(servername.rawAddress.toCPointer<ByteVar>(), username.rawAddress.toCPointer<ByteVar>(), newpasswordencryptedwitholdnt.rawAddress.toCPointer<ByteVar>(), oldntowfpasswordencryptedwithnewnt.rawAddress.toCPointer<ByteVar>(), lmpresent, newpasswordencryptedwitholdlm.rawAddress.toCPointer<ByteVar>(), oldlmowfpasswordencryptedwithnewlmornt.rawAddress.toCPointer<ByteVar>())
