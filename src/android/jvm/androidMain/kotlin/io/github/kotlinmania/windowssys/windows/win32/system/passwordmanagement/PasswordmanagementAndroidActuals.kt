@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemPasswordmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword(servername: Long, username: Long, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2(servername: Long, username: Long, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): Int
}

public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: ConstPtr<LmOwfPassword>, lmnewowfpassword: ConstPtr<LmOwfPassword>, ntoldowfpassword: ConstPtr<LmOwfPassword>, ntnewowfpassword: ConstPtr<LmOwfPassword>): UInt =
    WindowsWin32SystemPasswordmanagementJniBridge.windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword(servername.rawAddress, username.rawAddress, lmoldpresent, lmoldowfpassword.rawAddress, lmnewowfpassword.rawAddress, ntoldowfpassword.rawAddress, ntnewowfpassword.rawAddress).toUInt()

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: ConstPtr<SamprEncryptedUserPassword>, oldntowfpasswordencryptedwithnewnt: ConstPtr<EncryptedLmOwfPassword>, lmpresent: Boolean, newpasswordencryptedwitholdlm: ConstPtr<SamprEncryptedUserPassword>, oldlmowfpasswordencryptedwithnewlmornt: ConstPtr<EncryptedLmOwfPassword>): UInt =
    WindowsWin32SystemPasswordmanagementJniBridge.windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2(servername.rawAddress, username.rawAddress, newpasswordencryptedwitholdnt.rawAddress, oldntowfpasswordencryptedwithnewnt.rawAddress, lmpresent, newpasswordencryptedwitholdlm.rawAddress, oldlmowfpasswordencryptedwithnewlmornt.rawAddress).toUInt()
