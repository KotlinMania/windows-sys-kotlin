package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun MSChapSrvChangePassword(servername: PCWSTR, username: PCWSTR, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "MSChapSrvChangePassword", longArrayOf(servername, username, if (lmoldpresent) 1L else 0L, lmoldowfpassword, lmnewowfpassword, ntoldowfpassword, ntnewowfpassword)).toUInt()
}

public fun MSChapSrvChangePassword2(servername: PCWSTR, username: PCWSTR, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "MSChapSrvChangePassword2", longArrayOf(servername, username, newpasswordencryptedwitholdnt, oldntowfpasswordencryptedwithnewnt, if (lmpresent) 1L else 0L, newpasswordencryptedwitholdlm, oldlmowfpasswordencryptedwithnewlmornt)).toUInt()
}
