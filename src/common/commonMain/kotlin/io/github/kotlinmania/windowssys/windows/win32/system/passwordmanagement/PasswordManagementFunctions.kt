package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: COpaquePointer?, lmnewowfpassword: COpaquePointer?, ntoldowfpassword: COpaquePointer?, ntnewowfpassword: COpaquePointer?): UInt

public expect fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: COpaquePointer?, oldntowfpasswordencryptedwithnewnt: COpaquePointer?, lmpresent: Boolean, newpasswordencryptedwitholdlm: COpaquePointer?, oldlmowfpasswordencryptedwithnewlmornt: COpaquePointer?): UInt
