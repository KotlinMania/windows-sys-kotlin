@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemPasswordmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword(servername: Long, username: Long, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2(servername: Long, username: Long, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): Int
}

public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: COpaquePointer?, lmnewowfpassword: COpaquePointer?, ntoldowfpassword: COpaquePointer?, ntnewowfpassword: COpaquePointer?): UInt =
    WindowsWin32SystemPasswordmanagementJniBridge.windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword((servername?.value ?: 0L), (username?.value ?: 0L), lmoldpresent, (lmoldowfpassword?.value ?: 0L), (lmnewowfpassword?.value ?: 0L), (ntoldowfpassword?.value ?: 0L), (ntnewowfpassword?.value ?: 0L)).toUInt()

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: COpaquePointer?, oldntowfpasswordencryptedwithnewnt: COpaquePointer?, lmpresent: Boolean, newpasswordencryptedwitholdlm: COpaquePointer?, oldlmowfpasswordencryptedwithnewlmornt: COpaquePointer?): UInt =
    WindowsWin32SystemPasswordmanagementJniBridge.windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2((servername?.value ?: 0L), (username?.value ?: 0L), (newpasswordencryptedwitholdnt?.value ?: 0L), (oldntowfpasswordencryptedwithnewnt?.value ?: 0L), lmpresent, (newpasswordencryptedwitholdlm?.value ?: 0L), (oldlmowfpasswordencryptedwithnewlmornt?.value ?: 0L)).toUInt()
