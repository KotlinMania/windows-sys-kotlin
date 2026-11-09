package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun MSChapSrvChangePassword(servername: PCWSTR, username: PCWSTR, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): UInt

public expect fun MSChapSrvChangePassword2(servername: PCWSTR, username: PCWSTR, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): UInt
