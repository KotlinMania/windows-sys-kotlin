@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SystemPasswordmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword(servername: Long, username: Long, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword2(servername: Long, username: Long, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): Int
}

public actual fun MSChapSrvChangePassword(servername: PCWSTR, username: PCWSTR, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): UInt =
    WindowsWin32SystemPasswordmanagementJniBridge.windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword(servername, username, lmoldpresent, lmoldowfpassword, lmnewowfpassword, ntoldowfpassword, ntnewowfpassword).toUInt()

public actual fun MSChapSrvChangePassword2(servername: PCWSTR, username: PCWSTR, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): UInt =
    WindowsWin32SystemPasswordmanagementJniBridge.windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword2(servername, username, newpasswordencryptedwitholdnt, oldntowfpasswordencryptedwithnewnt, lmpresent, newpasswordencryptedwitholdlm, oldlmowfpasswordencryptedwithnewlmornt).toUInt()
