package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: ConstPtr, lmnewowfpassword: ConstPtr, ntoldowfpassword: ConstPtr, ntnewowfpassword: ConstPtr): UInt

public expect fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: ConstPtr, oldntowfpasswordencryptedwithnewnt: ConstPtr, lmpresent: Boolean, newpasswordencryptedwitholdlm: ConstPtr, oldlmowfpasswordencryptedwithnewlmornt: ConstPtr): UInt
